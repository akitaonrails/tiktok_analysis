package X;

/* JADX INFO: renamed from: X.12yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19930512yV implements InterfaceC19921712x5 {
    public final EnumC19907712up LIZ;
    public final boolean LIZIZ;
    public final int[] LIZJ;
    public final C19929612yM[] LIZLLL;
    public final InterfaceC19925612xi LJ;

    @Override // X.InterfaceC19921712x5
    public final InterfaceC19925612xi LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC19921712x5
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC19921712x5
    public final EnumC19907712up LIZJ() {
        return this.LIZ;
    }

    public C19930512yV(EnumC19907712up enumC19907712up, boolean z, int[] iArr, C19929612yM[] c19929612yMArr, Object obj) {
        this.LIZ = enumC19907712up;
        this.LIZIZ = z;
        this.LIZJ = iArr;
        this.LIZLLL = c19929612yMArr;
        C19922012x8.LIZ(obj, "defaultInstance");
        this.LJ = (InterfaceC19925612xi) obj;
    }
}
