package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14iM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20340014iM extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL = false;
    public final /* synthetic */ int LLILLJJLI = 2131832442;
    public final /* synthetic */ int LLILLL = 2131832441;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20340014iM(Function0 function0, Function0 function02) {
        super(1);
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            c1397620mTQ2.LJ(this.LLILLJJLI, new AwS610S0100000_31(this.LLILZ, (Function0<Unit>) 229));
        } else {
            c1397620mTQ2.LJFF(this.LLILLJJLI, new AwS610S0100000_31(this.LLILZ, (Function0<Unit>) 230));
        }
        c1397620mTQ2.LJII(this.LLILLL, new AwS610S0100000_31(this.LLILZIL, (Function0<Unit>) 231));
        return Unit.LIZ;
    }
}
