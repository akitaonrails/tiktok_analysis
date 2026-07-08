package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.090w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23036090w implements InterfaceC346201Wa<Object> {
    public final /* synthetic */ InterfaceC1631620sYq LL;

    public C23036090w(InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LL = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C322001Ms c322001Ms = new C322001Ms(this.LL, interfaceC346701Wf, null);
        C23037090x c23037090x = new C23037090x(interfaceC1364105Vn, interfaceC1364105Vn.getContext());
        Object objLIZ = C099C.LIZ(c23037090x, c23037090x, c322001Ms);
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
