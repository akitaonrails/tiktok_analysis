package X;

import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0Jkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501010Jkp implements C0USV {
    @Override // X.C0USV
    public final String LIZ() {
        return "login";
    }

    @Override // X.C0USV
    public final boolean LJIILIIL() {
        Context topContext = C781270Ukn.LJIIJ().getTopContext();
        if (UserService.getInstance().user().isLogin()) {
            return false;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C476760Imo c476760ImoLIZ = C501600Jlm.LIZ();
        c476760ImoLIZ.LIZ = C497740JfY.LJIJI(2131853573);
        c476760ImoLIZ.LIZJ = -1;
        c476760ImoLIZ.LJ = "video_take";
        c476760ImoLIZ.LJFF = "open_live";
        c476760ImoLIZ.LIZLLL = "bottom_tab";
        interfaceC500940JkiUser.LJIILL(topContext, c476760ImoLIZ.LIZ()).LIZIZ(new C476750Imn());
        return true;
    }
}
