package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0mOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394590mOX<T> implements InterfaceC1394580mOW<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final InterfaceC1394580mOW<T> LL;

    public final int hashCode() {
        return ~this.LL.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
        sb.append("Predicates.not(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    public C1394590mOX(C1394600mOY c1394600mOY) {
        this.LL = c1394600mOY;
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean apply(T t) {
        return !this.LL.apply(t);
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean equals(Object obj) {
        if (obj instanceof C1394590mOX) {
            return this.LL.equals(((C1394590mOX) obj).LL);
        }
        return false;
    }
}
