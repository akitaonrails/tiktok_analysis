package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ovW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491920ovW extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;
    public final /* synthetic */ Function0<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491920ovW(String str, Function0<Object> function0, Function0<Object> function02) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objInvoke;
        System.currentTimeMillis();
        if (this.LL != null) {
            C1491980ovc c1491980ovc = C1491980ovc.LIZ;
            c1491980ovc.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS = C1491980ovc.LJI;
            if (interfaceC1491880ovS != null) {
                c1491980ovc.LIZJ();
                interfaceC1491880ovS.LIZ();
            }
        }
        Function0<Object> function0 = this.LLILLJJLI;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            Function0<Object> function02 = this.LLILLL;
            objInvoke = function02 != null ? function02.invoke() : null;
        }
        if (this.LL != null) {
            C1491980ovc.LIZ.getClass();
            InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
            if (interfaceC1491880ovS2 != null) {
                System.currentTimeMillis();
                interfaceC1491880ovS2.end();
            }
        }
        return objInvoke;
    }
}
