package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.IHttpResponseCallback;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486150omD implements IHttpResponseCallback {
    public final WeakReference<VideoLiveManager> LIZ;
    public final String LIZIZ;
    public final int LIZJ = -100026;
    public final long LIZLLL;

    @Override // com.bytedance.vcloud.strategy.IHttpResponseCallback
    public final void onComplete(final String str, final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content steering response callback - raw response received - ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        final VideoLiveManager videoLiveManager = this.LIZ.get();
        if (videoLiveManager == null) {
            C1698940uJQ.LIZJ();
        } else if (!videoLiveManager.f3) {
            C1698940uJQ.LIZJ();
        } else {
            C786410Ut5.LJJZZIII(videoLiveManager.LJIILIIL, new Runnable() { // from class: X.0omC
                public final void LIZ() {
                    try {
                        if (videoLiveManager.LLJJJJ()) {
                            C1698940uJQ.LIZJ();
                            return;
                        }
                        if (i != 200) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("content steering response callback - http error ");
                            sbLIZ2.append(i);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C1698940uJQ.LIZJ();
                            return;
                        }
                        C1486130omB c1486130omBLIZ = C1486130omB.LIZ(new JSONObject(str));
                        if (!c1486130omBLIZ.LIZIZ()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("content steering response callback - response is invalid - ");
                            sbLIZ3.append(str);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C1698940uJQ.LIZJ();
                            return;
                        }
                        if (!TextUtils.isEmpty(c1486130omBLIZ.LIZJ)) {
                            videoLiveManager.c3.LIZ = c1486130omBLIZ.LIZJ;
                        }
                        int i2 = c1486130omBLIZ.LJFF;
                        if (i2 > 0) {
                            videoLiveManager.c3.LIZIZ = i2;
                        }
                        VideoLiveManager videoLiveManager2 = videoLiveManager;
                        String str2 = c1486130omBLIZ.LJ;
                        C1486150omD c1486150omD = this.LLILZIL;
                        String str3 = c1486150omD.LIZIZ;
                        videoLiveManager2.LLLLZI(c1486150omD.LIZJ, c1486150omD.LIZLLL, jCurrentTimeMillis, str2, str3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("content steering response callback - problem parsing json, exception: ");
                        sbLIZ4.append(e);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C1698940uJQ.LIZIZ();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ContentSteeringResponseCallback@3f83.onComplete$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ContentSteeringResponseCallback@3f83.onComplete$1");
                }
            });
        }
    }

    public C1486150omD(VideoLiveManager videoLiveManager, String str, long j) {
        this.LIZ = new WeakReference<>(videoLiveManager);
        this.LIZIZ = str;
        this.LIZLLL = j;
    }
}
