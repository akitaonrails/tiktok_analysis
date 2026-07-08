package X;

/* JADX INFO: renamed from: X.0QCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666650QCx {
    public final String LIZ;
    public final C0QD4 LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C666650QCx.class != obj.getClass()) {
            return false;
        }
        C666650QCx c666650QCx = (C666650QCx) obj;
        if (this.LIZJ != c666650QCx.LIZJ) {
            return false;
        }
        return this.LIZ.equals(c666650QCx.LIZ);
    }

    public C666650QCx(String str, AbstractC666570QCp abstractC666570QCp, int i) {
        this.LIZ = str;
        this.LIZIZ = abstractC666570QCp;
        this.LIZJ = i;
    }
}
