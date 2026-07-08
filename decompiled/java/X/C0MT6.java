package X;

import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;

/* JADX INFO: renamed from: X.0MT6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MT6 {
    public static final boolean LIZ() {
        return !C0CHQ.LIZ().getAccountService().LIZ() && AVCommerceServiceImpl.LJIIJ().LJIIIIZZ();
    }

    public static final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "fix_ai_music_panel_login_bug", true, false) ^ true ? LIZ() && C0CHQ.LIZ().getAccountService().isLogin() : LIZ();
    }
}
