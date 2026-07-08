package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NOT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOT extends C09AY implements Function1<C0NON, C0NON> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function1<C0NON, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NOT(String str, C1306500k6S c1306500k6S) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1306500k6S;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0NON invoke(C0NON c0non) {
        if (c0non == null) {
            c0non = new C0NON(this.LL, new LinkedHashMap());
        }
        Function1<C0NON, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(c0non);
        }
        return c0non;
    }
}
