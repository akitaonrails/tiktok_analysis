package X;

import com.bytedance.router.SmartRouter;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z8 implements InterfaceC19271510aP {
    @Override // X.InterfaceC19271510aP
    public final String LIZ() {
        return "schema";
    }

    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "open_authorize_parse_handler";
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        if (str == null || !u.LJJIIJZLJL(str, "aweme://authorize", false)) {
            return false;
        }
        SmartRouter.buildRoute(C2214201BlK.LJFF(), str).open();
        return true;
    }
}
