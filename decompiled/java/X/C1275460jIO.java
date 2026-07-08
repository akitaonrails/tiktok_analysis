package X;

/* JADX INFO: renamed from: X.0jIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275460jIO {
    public int LIZ = -1;
    public int LIZIZ = -1;

    public final void LIZ(boolean z, EnumC1275430jIL enumC1275430jIL) {
        int iMin;
        this.LIZ = Math.max(z ? 1 : 0, this.LIZ);
        if (z) {
            if (this.LIZIZ < 0) {
                iMin = enumC1275430jIL.toValue();
            } else {
                iMin = Math.min(enumC1275430jIL.toValue(), this.LIZIZ);
            }
            this.LIZIZ = iMin;
        }
    }
}
