package X;

import java.lang.annotation.Annotation;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WBF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBF<T> {
    public final Class<? extends Annotation> LIZ;
    public final Class<T> LIZIZ;

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        if (this.LIZ == C0WBN.class) {
            return this.LIZIZ.getName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.g);
        sbLIZ.append(this.LIZ.getName());
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZIZ.getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static <T> C0WBF<T> LIZ(Class<T> cls) {
        return new C0WBF<>(C0WBN.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0WBF.class != obj.getClass()) {
            return false;
        }
        C0WBF c0wbf = (C0WBF) obj;
        if (!this.LIZIZ.equals(c0wbf.LIZIZ)) {
            return false;
        }
        return this.LIZ.equals(c0wbf.LIZ);
    }

    public C0WBF(Class<? extends Annotation> cls, Class<T> cls2) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }
}
