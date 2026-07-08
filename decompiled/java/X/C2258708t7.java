package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.08t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2258708t7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC1987507qT enumC1987507qT, int i, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(enumC1987507qT.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("photo_mode_music_play_result", c0lab.LIZ);
    }
}
