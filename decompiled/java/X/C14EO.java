package X;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.14EO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EO {
    public final Method LIZ;
    public final ThreadMode LIZIZ;
    public final Class<?> LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public String LJFF;

    public final synchronized void LIZ() {
        if (this.LJFF == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.LIZ.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.LIZ.getName());
            sb.append('(');
            sb.append(this.LIZJ.getName());
            this.LJFF = sb.toString();
        }
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14EO) {
            LIZ();
            C14EO c14eo = (C14EO) obj;
            c14eo.LIZ();
            return this.LJFF.equals(c14eo.LJFF);
        }
        return false;
    }

    public C14EO(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.LIZ = method;
        this.LIZIZ = threadMode;
        this.LIZJ = cls;
        this.LIZLLL = i;
        this.LJ = z;
    }
}
