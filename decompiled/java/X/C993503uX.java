package X;

/* JADX INFO: renamed from: X.03uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C993503uX implements InterfaceC1748810vbr {
    public final String LL;
    public final C1748770vbn LLILLJJLI;
    public final InterfaceC1748810vbr LLILLL;
    public final boolean LLILZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackNodeSnapshot[id:");
        sbLIZ.append(this.LL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        c1748770vbn.LIZJ(this.LLILLJJLI);
    }

    public C993503uX(String str, C993703uZ c993703uZ, InterfaceC1748810vbr interfaceC1748810vbr, boolean z) {
        this.LL = str;
        this.LLILLJJLI = c993703uZ;
        this.LLILLL = interfaceC1748810vbr;
        this.LLILZ = z;
    }
}
