package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KA6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KA6 extends C09AY implements Function1<C512220K6y, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<AbstractC509530JyZ, C0KAI, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KA6(String str, Function2 function2, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512220K6y c512220K6y) {
        C512220K6y c512220K6y2 = c512220K6y;
        if (this.LL || Intrinsics.LJFF(c512220K6y2.LJFF, this.LLILLJJLI)) {
            this.LLILLL.invoke(new C512060K6i(c512220K6y2, null, null, 6), C0KAA.SUBSCRIBE_SUCCESS);
        }
        return Unit.LIZ;
    }
}
