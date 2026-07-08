package X;

import X.InterfaceC655050Pmh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656800PpW<T extends InterfaceC655050Pmh> {
    public C656610PpD<T> LIZ;

    public final void LIZ(Function1<? super C656610PpD<T>, Unit> function1) {
        C656610PpD<T> c656610PpD = new C656610PpD<>(null);
        if (function1 != null) {
            function1.invoke(c656610PpD);
        }
        this.LIZ = c656610PpD;
    }
}
