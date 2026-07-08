package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724460SbM implements InterfaceC1790830whd {
    public final C01GW LL = C452501pT.LIZIZ(new C724550SbV());

    @Override // X.InterfaceC1790830whd
    public final void Sd(Function0<Unit> function0) {
        ((CopyOnWriteArrayList) this.LL.getValue()).remove(function0);
    }

    @Override // X.InterfaceC1790830whd
    public final void h5(Function0<Unit> function0) {
        ((CopyOnWriteArrayList) this.LL.getValue()).add(function0);
    }
}
