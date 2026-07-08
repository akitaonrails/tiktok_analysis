package X;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19834712j3<T> implements InterfaceC1456340o08<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final T LL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // X.InterfaceC1456340o08
    public final T get() {
        return this.LL;
    }

    public C19834712j3(T t) {
        this.LL = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19834712j3) {
            return C19837412jU.LIZ(this.LL, ((C19834712j3) obj).LL);
        }
        return false;
    }
}
