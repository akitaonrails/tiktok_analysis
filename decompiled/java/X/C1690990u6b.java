package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0u6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690990u6b extends AbstractC1691020u6e<C1690950u6X> implements C0MAX {
    public static final AFwS311S0000000_25 LIZLLL = AFwS311S0000000_25.get$arr$(65);
    public final C1690940u6W LIZ = new C1690940u6W(this);
    public final C1691060u6i<C1690950u6X> LIZIZ = new C1691060u6i<>();
    public boolean LIZJ;

    @Override // X.AbstractC1691020u6e
    public final /* bridge */ /* synthetic */ C1691060u6i LJFF() {
        return this.LIZIZ;
    }

    public C1690990u6b(Function1<? super C0MAX, Unit> function1) {
        function1.invoke(this);
    }

    @Override // X.C0MAX
    public final void LIZ(Object obj, Function1 function1, Object obj2, C19719212De c19719212De) {
        AwS581S0100000_2 awS581S0100000_2;
        Function2 awS638S0100000_24;
        C1691060u6i<C1690950u6X> c1691060u6i = this.LIZIZ;
        if (obj != null) {
            awS581S0100000_2 = new AwS581S0100000_2(obj, (Object) 603);
        } else {
            awS581S0100000_2 = null;
        }
        if (function1 != null) {
            awS638S0100000_24 = new AwS638S0100000_24(function1, (Function1<? super InterfaceC1691150u6r, C1561460qjg>) 189);
        } else {
            awS638S0100000_24 = LIZLLL;
        }
        c1691060u6i.LIZ(1, new C1690950u6X(awS581S0100000_2, awS638S0100000_24, new AwS581S0100000_2(obj2, (Object) 604), new C19719212De(-34608120, new C346570DiJ(c19719212De, 4), true)));
        if (function1 != null) {
            this.LIZJ = true;
        }
    }

    @Override // X.C0MAX
    public final void LJ(int i, Function1 function1, Function2 function2, Function1 function12, C19719212De c19719212De) {
        Function2 function22;
        C1691060u6i<C1690950u6X> c1691060u6i = this.LIZIZ;
        if (function2 == null) {
            function22 = LIZLLL;
        } else {
            function22 = function2;
        }
        c1691060u6i.LIZ(i, new C1690950u6X(function1, function22, function12, c19719212De));
        if (function2 != null) {
            this.LIZJ = true;
        }
    }
}
