package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Vzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816030Vzl extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ C816050Vzn LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C816030Vzl(C816050Vzn c816050Vzn, String str, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        super(2);
        this.LL = c816050Vzn;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        if (!bool.booleanValue() && !this.LL.LIZIZ()) {
            Function2<Boolean, Throwable, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, th);
            }
        } else {
            this.LL.LJFF(this.LLILLJJLI, "1");
            C816020Vzk c816020Vzk = C816020Vzk.LIZ;
            String str = this.LLILLJJLI;
            InterfaceC815880VzW interfaceC815880VzW = this.LL.LIZ;
            c816020Vzk.getClass();
            C816020Vzk.LIZIZ(str, interfaceC815880VzW);
            Function2<Boolean, Throwable, Unit> function22 = this.LLILLL;
            if (function22 != null) {
                function22.invoke(Boolean.TRUE, null);
            }
        }
        return Unit.LIZ;
    }
}
