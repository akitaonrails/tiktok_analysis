package X;

/* JADX INFO: renamed from: X.0kN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316810kN5 {
    public CharSequence LIZ;
    public final C1316720kMw LIZIZ;

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        C1316720kMw c1316720kMw = this.LIZIZ;
        return iHashCode + (c1316720kMw != null ? c1316720kMw.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316810kN5)) {
            return false;
        }
        C1316810kN5 c1316810kN5 = (C1316810kN5) obj;
        CharSequence charSequence = this.LIZ;
        if (charSequence == null) {
            if (c1316810kN5.LIZ != null) {
                return false;
            }
        } else if (!charSequence.equals(c1316810kN5.LIZ)) {
            return false;
        }
        C1316720kMw c1316720kMw = this.LIZIZ;
        if (c1316720kMw == null) {
            if (c1316810kN5.LIZIZ != null) {
                return false;
            }
        } else if (!c1316720kMw.equals(c1316810kN5.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1316810kN5(CharSequence charSequence, C1316720kMw c1316720kMw) {
        this.LIZ = charSequence;
        this.LIZIZ = c1316720kMw;
    }
}
