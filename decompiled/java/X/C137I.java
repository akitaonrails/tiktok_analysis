package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.137I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137I extends C137H<Object> implements Serializable {
    public static final C137I LL = new C137I();
    public static final long serialVersionUID = 1;

    private Object readResolve() {
        return LL;
    }

    @Override // X.C137H
    public final int LIZIZ(Object obj) {
        return obj.hashCode();
    }

    @Override // X.C137H
    public final boolean LIZ(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
