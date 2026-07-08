package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784950wY9 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784950wY9(String str, String str2, C1784670wXh c1784670wXh, C1784970wYB c1784970wYB) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1784670wXh;
        this.LLILZ = c1784970wYB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL, new C1785000wYE(this.LLILLL));
        c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new C1785010wYF(this.LLILZ));
        return Unit.LIZ;
    }
}
