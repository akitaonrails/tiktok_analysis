package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0mOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394600mOY implements InterfaceC1394580mOW<Object>, Serializable {
    public static final long serialVersionUID = 0;
    public final Object LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("Predicates.equalTo(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    public C1394600mOY(Object obj) {
        this.LL = obj;
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean apply(Object obj) {
        return this.LL.equals(obj);
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean equals(Object obj) {
        if (obj instanceof C1394600mOY) {
            return this.LL.equals(((C1394600mOY) obj).LL);
        }
        return false;
    }
}
