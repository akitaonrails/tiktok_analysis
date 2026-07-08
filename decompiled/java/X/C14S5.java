package X;

/* JADX INFO: renamed from: X.14S5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14S5<T> {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prop{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C14S5(String str) {
        this.LIZ = str;
    }

    public final T LIZ(C14S7 c14s7) {
        T t = (T) c14s7.LIZJ(this);
        if (t != null) {
            return t;
        }
        throw new NullPointerException(this.LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14S5.class == obj.getClass()) {
            return this.LIZ.equals(((C14S5) obj).LIZ);
        }
        return false;
    }
}
