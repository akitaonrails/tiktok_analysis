package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FVV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVV implements C0FI9 {
    public final /* synthetic */ Function0<Unit> LIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LIZIZ;

    @Override // X.C0FI9
    public final void onFail() {
    }

    @Override // X.C0FI9
    public final void onSuccess() {
        Function0<Unit> function0 = this.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.C0FI9
    public final void LIZ(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Function1<Boolean, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0FVV(Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        this.LIZ = function0;
        this.LIZIZ = function1;
    }
}
