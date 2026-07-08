package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ovY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491940ovY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0 LLILLJJLI;
    public final /* synthetic */ Function0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491940ovY(String str, Function0 function0, Function0 function02) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0 function0;
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
        Function0 function02 = this.LLILLJJLI;
        if ((function02 == null || function02.invoke() == null) && (function0 = this.LLILLL) != null) {
            function0.invoke();
        }
        if (this.LL == null) {
            return null;
        }
        C1491980ovc.LIZ.getClass();
        InterfaceC1491880ovS interfaceC1491880ovS2 = C1491980ovc.LJI;
        if (interfaceC1491880ovS2 == null) {
            return null;
        }
        System.currentTimeMillis();
        interfaceC1491880ovS2.end();
        return Unit.LIZ;
    }
}
