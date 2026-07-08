package X;

/* JADX INFO: renamed from: X.19hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21610319hl {
    public boolean LIZ;
    public boolean LIZIZ = true;
    public Boolean LIZJ;

    public abstract void LIZ();

    public final void LIZIZ(boolean z) {
        Boolean bool;
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        if (z && (bool = this.LIZJ) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (this.LIZ != zBooleanValue) {
                if (!this.LIZIZ) {
                    this.LIZJ = Boolean.valueOf(zBooleanValue);
                } else {
                    this.LIZ = zBooleanValue;
                    LIZ();
                }
            }
            this.LIZJ = null;
        }
    }
}
