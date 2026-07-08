package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19651211uY<R> {
    public final Function0<Unit> LIZ;
    public final C0NJD<String> LIZIZ = new C0NJD<>(null);
    public final C0NJD<InterfaceC420801kM> LIZJ = new C0NJD<>(null);
    public final C0NJD<EnumC19651411ua> LIZLLL = new C0NJD<>(null);
    public final C0NJD<R> LJ = new C0NJD<>(null);

    public final R LIZ() {
        return this.LJ.LIZ();
    }

    public final void LIZIZ() {
        this.LIZIZ.LIZIZ(null);
        InterfaceC420801kM interfaceC420801kMLIZ = this.LIZJ.LIZ();
        if (interfaceC420801kMLIZ != null) {
            interfaceC420801kMLIZ.dispose();
        }
        this.LIZJ.LIZIZ(null);
        this.LIZLLL.LIZIZ(EnumC19651411ua.PENDING);
        this.LJ.LIZIZ(null);
        this.LIZ.invoke();
    }

    public C19651211uY(Function0<Unit> function0) {
        this.LIZ = function0;
    }
}
