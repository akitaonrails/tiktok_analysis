package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.1399, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1399 extends AnonymousClass1398<Object> implements Serializable {
    public static final AnonymousClass1399 LL = new AnonymousClass1399();
    public static final long serialVersionUID = 1;

    private Object readResolve() {
        return LL;
    }

    @Override // X.AnonymousClass1398
    public final int LIZIZ(Object obj) {
        return obj.hashCode();
    }

    @Override // X.AnonymousClass1398
    public final boolean LIZ(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
