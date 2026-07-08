package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KA7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KA7 extends C09AY implements Function1<C512210K6x, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<AbstractC509530JyZ, C0KAI, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KA7(String str, Function2 function2, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512210K6x c512210K6x) {
        C512210K6x c512210K6x2 = c512210K6x;
        if (this.LL || Intrinsics.LJFF(c512210K6x2.LIZ, this.LLILLJJLI)) {
            this.LLILLL.invoke(new C512060K6i(null, c512210K6x2, null, 5), C0KAA.RESUBSCRIBE_SUCCESS);
        }
        return Unit.LIZ;
    }
}
