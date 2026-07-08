package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14iL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20339914iL extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C20340214iO LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20339914iL(String str, String str2, AwS577S0100000_33 awS577S0100000_33, C20340214iO c20340214iO, AFwS224S0000000_33 aFwS224S0000000_33) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = awS577S0100000_33;
        this.LLILZ = c20340214iO;
        this.LLILZIL = aFwS224S0000000_33;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        c1397630mTR2.LIZJ(0, this.LL, new AwS397S0200000_31((Function0) this.LLILLL, (Function0<Unit>) this.LLILZ, (C20340214iO) 75));
        c1397630mTR2.LIZJ(1, this.LLILLJJLI, new AwS610S0100000_31(this.LLILZIL, (Function0<Unit>) 312));
        return Unit.LIZ;
    }
}
