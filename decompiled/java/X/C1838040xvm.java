package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838040xvm<T> implements InterfaceC1840230xzJ {
    public final Function1<T, Unit> LIZ;
    public final Class<T> LIZIZ;

    @Override // X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        if (abstractC556190Lrd instanceof C556200Lre) {
            C556200Lre c556200Lre = (C556200Lre) abstractC556190Lrd;
            if (this.LIZIZ.isInstance(c556200Lre.LIZJ)) {
                this.LIZ.invoke(this.LIZIZ.cast(c556200Lre.LIZJ));
            }
        }
    }

    public C1838040xvm(Class cls, Function1 function1) {
        this.LIZ = function1;
        this.LIZIZ = cls;
    }
}
