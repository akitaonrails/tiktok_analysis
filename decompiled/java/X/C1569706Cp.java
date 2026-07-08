package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS211S0300000_2;

/* JADX INFO: renamed from: X.06Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569706Cp extends C09AY implements Function2<C1397510mTF, C1397650mTT, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ C15496064w LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569706Cp(String str, C19EG c19eg, C15496064w c15496064w) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = c19eg;
        this.LLILLL = c15496064w;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1397510mTF c1397510mTF, C1397650mTT c1397650mTT) {
        C1500705u9.LIZLLL(C1500705u9.LIZIZ, this.LL, "click");
        c1397650mTT.LIZ(new AwS211S0300000_2(this.LLILLJJLI, this.LLILLL, c1397510mTF, 14));
        return Unit.LIZ;
    }
}
