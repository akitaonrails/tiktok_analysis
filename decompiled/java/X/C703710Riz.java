package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Riz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703710Riz extends C09AY implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {
    public final /* synthetic */ InterfaceC2217241BqE<Object, Object> LL;
    public final /* synthetic */ InterfaceC703670Riv<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703710Riz(InterfaceC2217241BqE<Object, Object> interfaceC2217241BqE, InterfaceC703670Riv<Object> interfaceC703670Riv, C259800zU<Object> c259800zU) {
        super(1);
        this.LL = interfaceC2217241BqE;
        this.LLILLJJLI = interfaceC703670Riv;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function0<? extends Unit> invoke(Function0<? extends Unit> function0) {
        return new C703700Riy(this.LL, this.LLILLJJLI, this.LLILLL, function0);
    }
}
