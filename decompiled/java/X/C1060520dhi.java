package X;

/* JADX INFO: renamed from: X.0dhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060520dhi extends AbstractC1060890diJ {
    public String LLJ;

    @Override // X.AbstractC1059420dfw
    public final C1059440dfy LIZIZ() {
        String str = this.LLJ;
        if (str == null) {
            str = "";
        }
        return new C1059440dfy(str);
    }

    @Override // X.AbstractC1059420dfw
    public final InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3) {
        InterfaceC2204861BRc interfaceC2204861BRc;
        C1537480q70 c1537480q70 = c1059490dg3.LJ;
        if (c1537480q70 != null && (interfaceC2204861BRc = (InterfaceC2204861BRc) c1537480q70.LJFF(InterfaceC2204861BRc.class)) != null) {
            return new C1BRQ(c1059490dg3.LIZIZ, interfaceC2204861BRc);
        }
        this.LLJ = "JsRequestCallback is null";
        return null;
    }
}
