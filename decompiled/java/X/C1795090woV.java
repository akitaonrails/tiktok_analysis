package X;

/* JADX INFO: renamed from: X.0woV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795090woV {
    public String LIZ;
    public boolean LIZIZ;

    public final C1795120woY LIZ() {
        String str = this.LIZ;
        if (str == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        if (!this.LIZIZ || str.equals("subs")) {
            return new C1795120woY(this);
        }
        throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
    }
}
