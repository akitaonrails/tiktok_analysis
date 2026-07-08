package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1531105z3 extends C09AY implements Function2<Object, InterfaceC700750ReD, Object> {
    public final /* synthetic */ Function2<Object, InterfaceC700750ReD, Object>[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1531105z3(Function2<Object, ? super InterfaceC700750ReD, Object>[] function2Arr) {
        super(2);
        this.LL = function2Arr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC700750ReD interfaceC700750ReD) {
        for (Function2<Object, InterfaceC700750ReD, Object> function2 : this.LL) {
            obj = function2.invoke(obj, interfaceC700750ReD);
        }
        return obj;
    }
}
