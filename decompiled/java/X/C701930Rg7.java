package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701930Rg7 extends C09AY implements Function1<InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, ? super Object, ? extends InterfaceC703670Riv<Object>>, InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, ? super Object, ? extends InterfaceC703670Riv<Object>>> {
    public final /* synthetic */ Function1<InterfaceC703670Riv<Object>, Function1<Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, Function1<InterfaceC700750ReD, InterfaceC700750ReD>>>[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C701930Rg7(Function1<? super InterfaceC703670Riv<Object>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>[] function1Arr) {
        super(1);
        this.LL = function1Arr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, ? super Object, ? extends InterfaceC703670Riv<Object>> invoke(InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, ? super Object, ? extends InterfaceC703670Riv<Object>> interfaceC1631620sYq) {
        return new C701940Rg8(interfaceC1631620sYq, this.LL);
    }
}
