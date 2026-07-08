package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lnn.q;

/* JADX INFO: renamed from: X.0Mms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578720Mms {
    public static void LIZ(ShortVideoContext shortVideoContext, boolean z, int i) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("enter_method", shortVideoContext.enterMethod);
        c0lab.LIZ(z ? 1 : 0, "is_share_texture");
        c0lab.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("tools_performance_save_photo_with_ve_error_rate", c0lab.LIZ);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, boolean z, int i, boolean z2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("enter_method", shortVideoContext.enterMethod);
        c0lab.LIZ(z ? 1 : 0, "is_share_texture");
        c0lab.LIZ(z2 ? 1 : 0, "has_bitmap");
        c0lab.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("tools_performance_take_photo_error_rate", c0lab.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, long j, long j2, Function0 function0, Function1 function1) {
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("enter_method", shortVideoContext.enterMethod);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZIZ(j2, "take_photo_duration");
        q qVar = (q) function0.invoke();
        if (qVar != null && qVar.C0().LLILIL() != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "has_effect");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(shortVideoContext.cameraComponentModel.mVideoWidth);
        sbLIZ.append('*');
        sbLIZ.append(shortVideoContext.cameraComponentModel.mVideoHeight);
        c0lab.LJ("resolution", C2188811AlT.LIZIZ(sbLIZ));
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        C20684815ws.LJIILLIIL("tools_performance_take_photo_process", c0lab.LIZ);
    }
}
