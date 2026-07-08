package X;

import Y.ARunnableS3S0001000_9;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3Z {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static C0N3Y LJFF;
    public static volatile boolean LJI;
    public static volatile boolean LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static String LJIIJJI;
    public static final C0N3Z LIZ = new C0N3Z();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C587640N3a());
    public static final ConcurrentHashMap<String, Bitmap> LIZJ = new ConcurrentHashMap<>();
    public static int LJIIL = -1;

    public static void LIZIZ(int i) {
        if (!u.LJIJI(LJIIJJI, "homepage_hot", true) || LJIIL != 0 || LJ || LJFF == null) {
            return;
        }
        C20684815ws.LJFF().execute(new ARunnableS3S0001000_9(i, 1));
        LJ = true;
    }

    public static final void LIZ(Aweme aweme, EnumC587690N3f enumC587690N3f) {
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null || LJI || !C582980Mtk.LIZIZ(aweme)) {
            return;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) {
            imageList = C13BV.INSTANCE;
        }
        int size = imageList.size();
        LIZ.getClass();
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache preload to bitmap memory -----> aweme ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", type ");
        sbLIZ.append(enumC587690N3f);
        sbLIZ.append("， awemeType ");
        sbLIZ.append(AwemeBizOptExtKt.getAwemeCacheType(aweme));
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1EE2.LIZIZ.LJJLIIIIJ(aweme, 0, new C587770N3n(aweme, SystemClock.elapsedRealtime(), enumC587690N3f, size));
        LJI = true;
    }

    public static void LIZJ(final int i, final int i2, final long j, final EnumC587710N3h enumC587710N3h, final EnumC587690N3f enumC587690N3f, final Throwable th) {
        try {
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0N3g
                public final void LIZ() throws JSONException {
                    JSONObject jSONObjectPut = new JSONObject().put("success", i).put("index", i2).put("duration", j);
                    Throwable th2 = th;
                    C20684815ws.LJIJ("cold_boot_photo_image_cache", jSONObjectPut.put("error_msg", th2 != null ? th2.getMessage() : null).put("preload_from", enumC587690N3f.getValue()).put("bitmap_type", enumC587710N3h.getValue()));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PostModeFeedImageCacheHelper@9f61.reportPreloadStatus$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PostModeFeedImageCacheHelper@9f61.reportPreloadStatus$1$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
