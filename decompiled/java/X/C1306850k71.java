package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306850k71 extends C09AY implements Function2<String, Integer, Unit> {
    public final /* synthetic */ Function1<C1307030k7J, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306850k71(Function1<? super C1307030k7J, Unit> function1) {
        super(2);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String str2 = str;
        int iIntValue = num.intValue();
        Function1<C1307030k7J, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(new C1307030k7J(false, str2, iIntValue));
        }
        return Unit.LIZ;
    }
}
