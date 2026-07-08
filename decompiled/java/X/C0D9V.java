package X;

/* JADX INFO: renamed from: X.0D9V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9V {
    public final boolean LIZ;
    public final C2252321DDq LIZIZ;
    public final AnonymousClass0951 LIZJ;
    public final C2252331DDr LIZLLL;
    public final AnonymousClass0950 LJ;
    public boolean LJFF;

    public final void LIZ() {
        C0D9Y c0d9yLIZIZ = ((C0D9W) this.LIZIZ.getValue()).LIZLLL;
        if (c0d9yLIZIZ == null) {
            c0d9yLIZIZ = C0D9U.LIZIZ(this.LIZ);
        }
        C0D9Y c0d9yLIZLLL = C0D9U.LIZLLL(c0d9yLIZIZ, null, null, 10);
        C2252321DDq c2252321DDq = this.LIZIZ;
        c2252321DDq.setValue(C0D9W.LIZ((C0D9W) c2252321DDq.getValue(), null, null, null, c0d9yLIZLLL, null, null, 55));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shippingAddressChanged -> refresh. bridgePrepared=");
        EnumC334620D9w enumC334620D9w = ((C0D9W) this.LIZIZ.getValue()).LIZ;
        EnumC334620D9w enumC334620D9w2 = EnumC334620D9w.READY;
        sbLIZ.append(enumC334620D9w == enumC334620D9w2);
        sbLIZ.append(", country=");
        sbLIZ.append(c0d9yLIZLLL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((C0D9W) this.LIZIZ.getValue()).LIZ == enumC334620D9w2) {
            LIZIZ(c0d9yLIZLLL);
        }
    }

    public C0D9V(boolean z) {
        this.LIZ = z;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0D9W(null, 63));
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZJ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LIZLLL = c2252331DDrLIZIZ;
        this.LJ = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final void LIZIZ(C0D9Y c0d9y) {
        this.LIZIZ.setValue(C0D9W.LIZ((C0D9W) this.LIZIZ.getValue(), null, null, C0DA4.REFRESHING, c0d9y, null, null, 35));
        this.LIZLLL.LIZJ(new C334650D9z(c0d9y));
    }
}
