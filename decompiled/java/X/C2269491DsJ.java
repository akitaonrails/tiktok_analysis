package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269491DsJ extends C09AY implements Function0<C20021513Vl> {
    public C2269491DsJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13Vl] */
    @Override // kotlin.jvm.functions.Function0
    public final C20021513Vl invoke() {
        return new InterfaceC1432340nNQ() { // from class: X.13Vl
            public final AtomicReference<String> LIZ = new AtomicReference<>(null);

            @Override // X.InterfaceC1432340nNQ
            public final String LIZIZ() {
                return this.LIZ.get();
            }

            @Override // X.InterfaceC1432340nNQ
            public final void LIZ(String str) {
                this.LIZ.set(str);
            }
        };
    }
}
