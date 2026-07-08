package X;

/* JADX INFO: renamed from: X.0ogR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482570ogR {
    public final C1482580ogS LIZ;
    public final C1479570obb LIZIZ;
    public long LIZJ;
    public String LIZLLL;

    public C1482570ogR(C1482580ogS c1482580ogS) {
        this.LIZ = c1482580ogS;
        this.LIZIZ = new C1479570obb();
    }

    public final void LIZ(EnumC1046760dLW enumC1046760dLW) {
        boolean z;
        C1479570obb c1479570obb = this.LIZIZ;
        boolean z2 = true;
        if (enumC1046760dLW == EnumC1046760dLW.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        c1479570obb.LJII = z;
        if (enumC1046760dLW != EnumC1046760dLW.AUDIO) {
            z2 = false;
        }
        c1479570obb.LJI = z2;
    }

    public C1482570ogR(C1479570obb c1479570obb) {
        this.LIZIZ = c1479570obb;
    }
}
