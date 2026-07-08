package X;

import com.ss.android.ugc.aweme.inbox.bulletin.music.LifecycleMusicPlayer;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20501715Kd {
    public static WeakReference<LifecycleMusicPlayer> LIZIZ;
    public static C1877320yx8 LIZJ;
    public static int LIZLLL;
    public static final C20501815Ke LIZ = new C20501815Ke();
    public static final CopyOnWriteArrayList<InterfaceC20501915Kf> LJ = new CopyOnWriteArrayList<>();

    public static void LIZJ(List list) {
        String str;
        WeakReference<LifecycleMusicPlayer> weakReference;
        LifecycleMusicPlayer lifecycleMusicPlayer;
        LifecycleMusicPlayer lifecycleMusicPlayer2;
        if (list == null) {
            WeakReference<LifecycleMusicPlayer> weakReference2 = LIZIZ;
            if (weakReference2 != null && (lifecycleMusicPlayer2 = weakReference2.get()) != null) {
                lifecycleMusicPlayer2.LIZIZ();
                return;
            }
            return;
        }
        for (Object obj : list) {
            C1877320yx8 c1877320yx8 = LIZJ;
            if (c1877320yx8 != null) {
                str = c1877320yx8.LIZIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(obj, str) && (weakReference = LIZIZ) != null && (lifecycleMusicPlayer = weakReference.get()) != null) {
                lifecycleMusicPlayer.LIZIZ();
            }
        }
    }

    public static void LIZ(String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceId", str);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "playBulletinMusicStatus"));
        LIZLLL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[PHI: r2
      0x00ec: PHI (r2v4 X.19FO) = (r2v2 X.19FO), (r2v5 X.19FO) binds: [B:65:0x00ea, B:56:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(android.content.Context r9, androidx.fragment.app.Fragment r10, X.C1877320yx8 r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20501715Kd.LIZIZ(android.content.Context, androidx.fragment.app.Fragment, X.0yx8):kotlin.Pair");
    }
}
