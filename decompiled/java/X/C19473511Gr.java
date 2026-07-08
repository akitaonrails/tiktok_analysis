package X;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.11Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19473511Gr<S> extends C09AY implements Function0<C19473111Gn<S>> {
    public final /* synthetic */ C19473711Gt<S> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19473511Gr(C19473711Gt<S> c19473711Gt) {
        super(0);
        this.LL = c19473711Gt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Executor executorLIZ = C725080ScM.LIZ();
        InterfaceC0148002o interfaceC0148002o = this.LL.LIZIZ;
        if (interfaceC0148002o == null) {
            interfaceC0148002o = null;
        }
        C11RO c11ro = C11S5.LIZ;
        return new C19473111Gn(interfaceC0148002o, new C19501611Rm(executorLIZ));
    }
}
