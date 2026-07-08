package X;

/* JADX INFO: renamed from: X.0fb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133250fb1 {
    public C1135590fen LIZ;
    public C1134950fdl LIZIZ;
    public C1135920ffK LIZJ;
    public InterfaceC1135390feT LIZLLL;
    public InterfaceC1135380feS LJ;

    public final InterfaceC1135380feS LIZ() {
        if (this.LJ == null) {
            InterfaceC1133090fal interfaceC1133090falLIZ = C1132970faZ.LIZ(EnumC1133020fae.MUSIC_GIFT);
            this.LJ = interfaceC1133090falLIZ instanceof InterfaceC1135380feS ? (InterfaceC1135380feS) interfaceC1133090falLIZ : null;
        }
        return this.LJ;
    }

    public final InterfaceC1135390feT LIZIZ() {
        if (this.LIZLLL == null) {
            InterfaceC1133090fal interfaceC1133090falLIZ = C1132970faZ.LIZ(EnumC1133020fae.STICKER_GIFT);
            this.LIZLLL = interfaceC1133090falLIZ instanceof InterfaceC1135390feT ? (InterfaceC1135390feT) interfaceC1133090falLIZ : null;
        }
        return this.LIZLLL;
    }

    public C1133250fb1(InterfaceC1132530fZr interfaceC1132530fZr) {
        this.LIZ = new C1135590fen(interfaceC1132530fZr);
        this.LIZJ = new C1135920ffK(interfaceC1132530fZr);
        this.LIZIZ = new C1134950fdl(interfaceC1132530fZr, this.LIZJ);
    }
}
