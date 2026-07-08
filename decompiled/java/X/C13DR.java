package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13DR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DR<T> extends C13DN<T> {
    public C13DR(Function0<? extends T> function0) {
        super(function0);
    }

    @Override // X.C13DN
    public final C13DO<T> LIZJ(T t) {
        boolean z;
        if (t == null) {
            z = true;
        } else {
            z = false;
        }
        return new C13DO<>(this, t, z, null, false);
    }
}
