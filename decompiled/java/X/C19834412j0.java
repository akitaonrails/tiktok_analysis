package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: renamed from: X.12j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19834412j0<T> implements InterfaceC1456340o08<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final InterfaceC1456340o08<T> LL;
    public volatile transient boolean LLILLJJLI;
    public transient T LLILLL;

    @Override // X.InterfaceC1456340o08
    public final T get() {
        if (!this.LLILLJJLI) {
            synchronized (this) {
                try {
                    if (!this.LLILLJJLI) {
                        T t = this.LL.get();
                        this.LLILLL = t;
                        this.LLILLJJLI = true;
                        return t;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLILLL;
    }

    public final String toString() {
        Object string;
        if (this.LLILLJJLI) {
            String strValueOf = String.valueOf(this.LLILLL);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.LL;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public C19834412j0(InterfaceC1456340o08<T> interfaceC1456340o08) {
        this.LL = interfaceC1456340o08;
    }
}
