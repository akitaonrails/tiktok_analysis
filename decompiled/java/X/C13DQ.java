package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DQ<T> extends C13DN<T> {
    public final C13FF<T> LIZIZ;

    @Override // X.C13DN
    public final C13DO<T> LIZJ(T t) {
        boolean z;
        if (t == null) {
            z = true;
        } else {
            z = false;
        }
        return new C13DO<>(this, t, z, this.LIZIZ, true);
    }

    public C13DQ(C13FF<T> c13ff, Function0<? extends T> function0) {
        super(function0);
        this.LIZIZ = c13ff;
    }
}
