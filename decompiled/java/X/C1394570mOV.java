package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0mOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394570mOV<T> implements InterfaceC1394580mOW<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final List<? extends InterfaceC1394580mOW<? super T>> LL;

    public C1394570mOV() {
        throw null;
    }

    public final int hashCode() {
        return this.LL.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends InterfaceC1394580mOW<? super T>> list = this.LL;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (InterfaceC1394580mOW<? super T> interfaceC1394580mOW : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(interfaceC1394580mOW);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public C1394570mOV(List list) {
        this.LL = list;
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean apply(T t) {
        for (int i = 0; i < this.LL.size(); i++) {
            if (!((InterfaceC1394580mOW) ListProtector.get(this.LL, i)).apply(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1394580mOW
    public final boolean equals(Object obj) {
        if (obj instanceof C1394570mOV) {
            return this.LL.equals(((C1394570mOV) obj).LL);
        }
        return false;
    }
}
