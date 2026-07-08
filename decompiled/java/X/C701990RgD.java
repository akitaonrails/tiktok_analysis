package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701990RgD extends C09AY implements InterfaceC1631620sYq<Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, C703650Rit<Object>> {
    public final /* synthetic */ InterfaceC1631620sYq<Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, InterfaceC703670Riv<Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C701990RgD(InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC700750ReD, Object>, Object, Object, ? extends InterfaceC703670Riv<Object>> interfaceC1631620sYq) {
        super(3);
        this.LL = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC1631620sYq
    public final C703650Rit<Object> invoke(Function2<Object, ? super InterfaceC700750ReD, Object> function2, Object obj, Object obj2) {
        return new C703650Rit<>(this.LL.invoke(function2, obj, obj2));
    }
}
