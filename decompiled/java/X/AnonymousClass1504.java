package X;

import Y.ARunnableS100S0200000_31;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1504, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1504 implements InterfaceC926480aDW {
    public final Function1<C945320ahu, Unit> LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public C945320ahu LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass1504(Function1<? super C945320ahu, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC926480aDW
    public final void LIZIZ(C945320ahu c945320ahu) {
        this.LIZJ = c945320ahu;
        if (!this.LIZIZ.get()) {
            return;
        }
        C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(this, c945320ahu, 83));
    }
}
