package X;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701950Rg9 extends C09AY implements Function2<Object, InterfaceC700750ReD, Object> {
    public final /* synthetic */ Map<String, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701950Rg9(Map<String, Object> map) {
        super(2);
        this.LL = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC700750ReD interfaceC700750ReD) {
        Function2 function2;
        Object objInvoke;
        InterfaceC700750ReD interfaceC700750ReD2 = interfaceC700750ReD;
        if (this.LL.containsKey(interfaceC700750ReD2.getType()) && (function2 = (Function2) this.LL.get(interfaceC700750ReD2.getType())) != null && (objInvoke = function2.invoke(obj, interfaceC700750ReD2)) != null) {
            return objInvoke;
        }
        return obj;
    }
}
