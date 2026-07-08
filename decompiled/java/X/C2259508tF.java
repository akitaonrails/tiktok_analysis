package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.08tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2259508tF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str, String str2) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("event", str);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c0lab.LIZIZ(j, "duration");
        C2341909Fp.LIZ("image_performance_tracker", c0lab.LIZ);
    }
}
