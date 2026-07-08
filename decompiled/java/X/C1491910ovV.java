package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ovV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491910ovV extends C09AY implements Function0<Object> {
    public final /* synthetic */ Function0<Object> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491910ovV(long j, String str, Function0 function0) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0<Object> function0 = this.LL;
        if (function0 == null) {
            return null;
        }
        String str = this.LLILLJJLI;
        Object objInvoke = function0.invoke();
        if (str != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS.end();
            }
        }
        return objInvoke;
    }
}
