package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.137J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137J extends C137H<Object> implements Serializable {
    public static final C137J LL = new C137J();
    public static final long serialVersionUID = 1;

    @Override // X.C137H
    public final boolean LIZ(Object obj, Object obj2) {
        return false;
    }

    private Object readResolve() {
        return LL;
    }

    @Override // X.C137H
    public final int LIZIZ(Object obj) {
        return System.identityHashCode(obj);
    }
}
