package X;

/* JADX INFO: renamed from: X.0uEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1695720uEE implements InterfaceC1695630uE5 {
    public abstract int LJ(int i);

    public abstract int LJFF(int i);

    @Override // X.InterfaceC1695630uE5
    public final int LIZ(int i) {
        int iLJFF = LJFF(i);
        if (iLJFF == -1 || LJFF(iLJFF) == -1) {
            return -1;
        }
        return iLJFF;
    }

    @Override // X.InterfaceC1695630uE5
    public final int LIZIZ(int i) {
        return LJFF(i);
    }

    @Override // X.InterfaceC1695630uE5
    public final int LIZJ(int i) {
        return LJ(i);
    }

    @Override // X.InterfaceC1695630uE5
    public final int LIZLLL(int i) {
        int iLJ = LJ(i);
        if (iLJ == -1 || LJ(iLJ) == -1) {
            return -1;
        }
        return iLJ;
    }
}
