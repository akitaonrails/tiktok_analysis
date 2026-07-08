package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13DP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DP<T> extends C13DN<T> {
    public final C13D1<T> LIZIZ;

    @Override // X.AbstractC19973513Cz
    public final /* bridge */ /* synthetic */ InterfaceC19973313Cx LIZ() {
        return this.LIZIZ;
    }

    public C13DP(Function1<? super InterfaceC1670270tZB, ? extends T> function1) {
        super(AFwS219S0000000_30.get$arr$(17));
        this.LIZIZ = new C13D1<>(function1);
    }

    @Override // X.C13DN
    public final C13DO<T> LIZJ(T t) {
        boolean z;
        if (t == null) {
            z = true;
        } else {
            z = false;
        }
        return new C13DO<>(this, t, z, null, true);
    }
}
