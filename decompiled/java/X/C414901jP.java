package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C414901jP implements InterfaceC346201Wa<Object> {
    public final /* synthetic */ InterfaceC346201Wa[] LL;
    public final /* synthetic */ InterfaceC1685430txd LLILLJJLI;

    public C414901jP(InterfaceC346201Wa[] interfaceC346201WaArr, InterfaceC1685430txd interfaceC1685430txd) {
        this.LL = interfaceC346201WaArr;
        this.LLILLJJLI = interfaceC1685430txd;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super Object> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZ = C23039090z.LIZ(interfaceC1364105Vn, new C414201jI(), new C414801jO(null, this.LLILLJJLI), interfaceC346701Wf, this.LL);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
