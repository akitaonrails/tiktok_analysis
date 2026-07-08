package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384010F3v extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ C384030F3x LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C384010F3v(boolean z, String str, String str2, Function1<? super Boolean, Unit> function1, C384030F3x c384030F3x, Function0<Unit> function0) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function1;
        this.LLILZIL = c384030F3x;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS371S0200000_5((Function1) this.LLILZ, (Function1<? super Boolean, Unit>) this.LLILZIL, (C384030F3x) 272));
        } else {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI, new AwS371S0200000_5((Function1) this.LLILZ, (Function1<? super Boolean, Unit>) this.LLILZIL, (C384030F3x) 273));
        }
        c1397620mTQ2.LIZJ(1, this.LLILLL, new AwS584S0100000_5(this.LLILZLL, (Function0<Unit>) 1025));
        return Unit.LIZ;
    }
}
