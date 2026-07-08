package X;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0kA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308710kA1 {
    public AbstractC1308700kA0<Object> LIZ;
    public boolean LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;

    public final C1308720kA2 LIZ() {
        AbstractC1308700kA0 c1308620k9s = this.LIZ;
        if (c1308620k9s == null) {
            C1308800kAA c1308800kAA = AbstractC1308700kA0.LIZIZ;
            Object obj = this.LIZJ;
            if (obj instanceof Integer) {
                c1308620k9s = AbstractC1308700kA0.LIZIZ;
            } else if (obj instanceof int[]) {
                c1308620k9s = AbstractC1308700kA0.LIZLLL;
            } else if (obj instanceof Long) {
                c1308620k9s = AbstractC1308700kA0.LJ;
            } else if (obj instanceof long[]) {
                c1308620k9s = AbstractC1308700kA0.LJFF;
            } else if (obj instanceof Float) {
                c1308620k9s = AbstractC1308700kA0.LJI;
            } else if (obj instanceof float[]) {
                c1308620k9s = AbstractC1308700kA0.LJII;
            } else if (obj instanceof Boolean) {
                c1308620k9s = AbstractC1308700kA0.LJIIIIZZ;
            } else if (obj instanceof boolean[]) {
                c1308620k9s = AbstractC1308700kA0.LJIIIZ;
            } else if ((obj instanceof String) || obj == null) {
                c1308620k9s = AbstractC1308700kA0.LJIIJ;
            } else if ((obj instanceof Object[]) && (obj instanceof String[])) {
                c1308620k9s = AbstractC1308700kA0.LJIIJJI;
            } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (componentType == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
                c1308620k9s = new C1308650k9v(componentType);
            } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                Class<?> componentType2 = obj.getClass().getComponentType();
                if (componentType2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                }
                c1308620k9s = new C1308640k9u(componentType2);
            } else if (obj instanceof Parcelable) {
                c1308620k9s = new C1308610k9r(obj.getClass());
            } else if (obj instanceof Enum) {
                c1308620k9s = new C1308630k9t(obj.getClass());
            } else {
                if (!(obj instanceof Serializable)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Object of type ");
                    sbLIZ.append(obj.getClass().getName());
                    sbLIZ.append(" is not supported for navigation arguments.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c1308620k9s = new C1308620k9s(obj.getClass());
            }
        }
        return new C1308720kA2(c1308620k9s, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }
}
