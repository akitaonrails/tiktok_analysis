package X;

import java.util.Map;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0OBM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBM implements C0OBN, InterfaceC1141530foN {
    public final C2252331DDr LL = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);

    @Override // X.C0OBN
    public final b LIZ() {
        return C09IC.LJ(new C0OBK("web_cashier_mobile_event_payment_completed", this, null));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Map<String, Object> mapLIZ;
        C2252331DDr c2252331DDr = this.LL;
        String str = c262100zr.LIZ;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            mapLIZ = interfaceC1107590evd.LIZ();
        } else {
            mapLIZ = null;
        }
        c2252331DDr.LIZJ(new C1882807Za(str, mapLIZ));
    }
}
