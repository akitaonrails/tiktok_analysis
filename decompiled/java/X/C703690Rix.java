package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703690Rix {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <State, Field> Function0<Unit> LIZ(InterfaceC703670Riv<State> interfaceC703670Riv, InterfaceC2217241BqE<State, ? extends Field> interfaceC2217241BqE, Function0<Unit> function0) {
        Function1<Function0<Unit>, Function0<Unit>> function1LIZLLL = interfaceC703670Riv.LIZLLL();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC2217241BqE.get(interfaceC703670Riv.getState());
        return (Function0) function1LIZLLL.invoke(new C703710Riz(interfaceC2217241BqE, interfaceC703670Riv, c259800zU).invoke(function0));
    }
}
