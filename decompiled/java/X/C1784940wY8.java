package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784940wY8 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784940wY8(String str, String str2, C1784680wXi c1784680wXi, C1784960wYA c1784960wYA) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1784680wXi;
        this.LLILZ = c1784960wYA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL, new C1784980wYC(this.LLILLL));
        c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new C1784990wYD(this.LLILZ));
        return Unit.LIZ;
    }
}
