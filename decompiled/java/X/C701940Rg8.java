package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701940Rg8 extends C09AY implements InterfaceC1631620sYq<Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, InterfaceC703670Riv<Object>> {
    public final /* synthetic */ InterfaceC1631620sYq<Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, InterfaceC703670Riv<Object>> LL;
    public final /* synthetic */ Function1<InterfaceC703670Riv<Object>, Function1<Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, Function1<InterfaceC700750ReD, InterfaceC700750ReD>>>[] LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C701940Rg8(InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, ? extends InterfaceC703670Riv<Object>> interfaceC1631620sYq, Function1<? super InterfaceC703670Riv<Object>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>[] function1Arr) {
        super(3);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = function1Arr;
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC703670Riv<Object> invoke(Function2<Object, ? super InterfaceC700750ReD, Object> function2, Object obj, Object obj2) {
        InterfaceC703670Riv<Object> interfaceC703670RivInvoke = this.LL.invoke(function2, obj, obj2);
        Function1<InterfaceC700750ReD, InterfaceC700750ReD> function1LIZ = interfaceC703670RivInvoke.LIZ();
        interfaceC703670RivInvoke.LIZIZ(new C702580RhA());
        Function1<InterfaceC703670Riv<Object>, Function1<Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, Function1<InterfaceC700750ReD, InterfaceC700750ReD>>>[] function1Arr = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1<InterfaceC703670Riv<Object>, Function1<Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, Function1<InterfaceC700750ReD, InterfaceC700750ReD>>> function1 : function1Arr) {
            arrayList.add(function1.invoke(interfaceC703670RivInvoke));
        }
        interfaceC703670RivInvoke.LIZIZ((Function1) new C113400bs(arrayList).invoke(function1LIZ));
        return interfaceC703670RivInvoke;
    }
}
