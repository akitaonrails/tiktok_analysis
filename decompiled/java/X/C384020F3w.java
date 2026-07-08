package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384020F3w extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ C384030F3x LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C384020F3w(int i, String str, int i2, String str2, Function1<? super Boolean, Unit> function1, C384030F3x c384030F3x, Function0<Unit> function0) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = str2;
        this.LLILZIL = function1;
        this.LLILZLL = c384030F3x;
        this.LLIZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL == 0) {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI, new AwS371S0200000_5((Function1) this.LLILZIL, (Function1<? super Boolean, Unit>) this.LLILZLL, (C384030F3x) 235));
        } else {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS371S0200000_5((Function1) this.LLILZIL, (Function1<? super Boolean, Unit>) this.LLILZLL, (C384030F3x) 236));
        }
        if (this.LLILLL == 0) {
            c1397620mTQ2.LIZJ(0, this.LLILZ, new AwS584S0100000_5(this.LLIZ, (Function0<Unit>) 955));
        } else {
            c1397620mTQ2.LIZJ(1, this.LLILZ, new AwS584S0100000_5(this.LLIZ, (Function0<Unit>) 956));
        }
        return Unit.LIZ;
    }
}
