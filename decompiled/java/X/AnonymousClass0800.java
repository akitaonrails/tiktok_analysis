package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0800, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0800 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0800(String str, String str2, Function0 function0, Function1 function1, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS582S0100000_3(this.LLILZ, (Function1<? super Boolean, Unit>) 131));
        } else {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI, new AwS582S0100000_3(this.LLILZ, (Function1<? super Boolean, Unit>) 132));
        }
        c1397620mTQ2.LIZJ(1, this.LLILLL, new AwS582S0100000_3(this.LLILZIL, (Function0<Unit>) 133));
        return Unit.LIZ;
    }
}
