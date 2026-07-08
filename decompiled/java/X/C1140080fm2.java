package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140080fm2 implements InterfaceC1140460fme<Object, Object> {
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1140080fm2(Function2<Object, ? super InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, ? extends Object> function2) {
        this.LIZ = function2;
    }

    @Override // X.InterfaceC1140460fme
    public final Object LIZ(Object obj, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return this.LIZ.invoke(obj, interfaceC1364105Vn);
    }
}
