package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KA8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KA8 extends C09AY implements Function1<C0KAH, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<AbstractC509530JyZ, C0KAI, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KA8(String str, Function2 function2, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0KAH c0kah) {
        C0KAH c0kah2 = c0kah;
        if (this.LL || Intrinsics.LJFF(c0kah2.LIZ, this.LLILLJJLI)) {
            this.LLILLL.invoke(new C512060K6i(null, null, c0kah2, 3), C0KAA.PLAN_CHANGE_SUCCESS);
        }
        return Unit.LIZ;
    }
}
