package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.050f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12827050f implements InterfaceC1207030hW1 {
    public final /* synthetic */ Function1<Integer, Unit> LIZ;
    public final /* synthetic */ Function0<Unit> LIZIZ;
    public final /* synthetic */ Function2<Integer, String, Unit> LIZJ;

    @Override // X.InterfaceC1207030hW1
    public final void LIZ() {
        Function0<Unit> function0 = this.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1207030hW1
    public final void LIZJ(int i) {
        Function1<Integer, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC1207030hW1
    public final void LIZIZ(int i, String str) {
        Function2<Integer, String, Unit> function2 = this.LIZJ;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12827050f(Function1<? super Integer, Unit> function1, Function0<Unit> function0, Function2<? super Integer, ? super String, Unit> function2) {
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = function2;
    }
}
