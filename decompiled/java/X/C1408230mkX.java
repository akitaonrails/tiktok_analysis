package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408230mkX extends AbstractC2255721DQs<InterfaceC1408520ml0> implements InterfaceC1408520ml0 {
    public static final int LLILZLL = 8;
    public final Function1<Function0<Unit>, Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final InterfaceC1408520ml0 LLILZIL = this;

    @Override // X.InterfaceC1408520ml0
    public Function0<Unit> Fk0() {
        return this.LLILLJJLI;
    }

    public InterfaceC1408520ml0 W1() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1408520ml0
    public Function0<Unit> Zh2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1408520ml0
    public Function0<Unit> en2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1408520ml0
    public Function1<Function0<Unit>, Unit> lG2() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1408230mkX(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LL = function1;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = function03;
    }
}
