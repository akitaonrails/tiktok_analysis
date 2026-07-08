package X;

/* JADX INFO: renamed from: X.1B8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199981B8i implements InterfaceC2199471B6j {
    @Override // X.InterfaceC2199471B6j
    public final long LJJJJZI(int i, int i2) {
        if (i == 1) {
            return 3000L;
        }
        if (i == 2) {
            return 15000L;
        }
        if (i == 3) {
            return 30000L;
        }
        return i > 3 ? 300000L : 0L;
    }
}
