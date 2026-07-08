package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697150RWf extends C09AY implements Function0<String> {
    public final /* synthetic */ C697210RWl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697150RWf(C697210RWl c697210RWl) {
        super(0);
        this.LL = c697210RWl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC697120RWc interfaceC697120RWc = this.LL.LLIZ;
        if (interfaceC697120RWc != null) {
            return interfaceC697120RWc.LIZIZ();
        }
        return null;
    }
}
