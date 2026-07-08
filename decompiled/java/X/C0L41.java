package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0L41, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L41 extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ Function1<C536920L3y, Unit> LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function2<String, String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L41(AFwS239S0000000_8 aFwS239S0000000_8, C118300cf c118300cf, long j, Function2 function2) {
        super(2);
        this.LL = aFwS239S0000000_8;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = j;
        this.LLILZ = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        Function1<C536920L3y, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(new C536920L3y(this.LLILLL, this.LLILLJJLI.element, str3, str4, false));
        }
        Function2<String, String, Unit> function2 = this.LLILZ;
        if (function2 != null) {
            function2.invoke(str3, str4);
        }
        return Unit.LIZ;
    }
}
