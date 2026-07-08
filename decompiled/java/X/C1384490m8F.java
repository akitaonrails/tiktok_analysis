package X;

/* JADX INFO: renamed from: X.0m8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384490m8F extends C1384340m80 {
    public static final C1384490m8F LJIJJ;
    public static final float LJIJJLI;
    public static final float LJIL;
    public static final float LJJ;
    public static final float LJJI;
    public static final float LJJIFFI;

    static {
        C1384490m8F c1384490m8F = new C1384490m8F();
        LJIJJ = c1384490m8F;
        float fLIZIZ = C418440Gaw.LIZIZ(23);
        LJIJJLI = fLIZIZ;
        LJIL = C418440Gaw.LIZIZ(15);
        float fLIZIZ2 = C418440Gaw.LIZIZ(73);
        LJJ = fLIZIZ2;
        LJJI = fLIZIZ2 - (c1384490m8F.LIZJ + fLIZIZ);
        LJJIFFI = fLIZIZ2 - (2 * (fLIZIZ + c1384490m8F.LIZJ));
    }

    @Override // X.C1384340m80
    public final float LJI() {
        return LJJIFFI;
    }

    @Override // X.C1384340m80
    public final float LJII() {
        return LJJI;
    }

    @Override // X.C1384340m80
    public final float LJIIIIZZ() {
        return LJJ;
    }

    @Override // X.C1384340m80
    public final float LJIIJ() {
        return LJIJJLI;
    }

    @Override // X.C1384340m80
    public final float LJIILL() {
        return LJIL;
    }
}
