package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235230iFV extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ C1235080iFG LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235230iFV(C1235080iFG c1235080iFG, boolean z, boolean z2) {
        super(1);
        this.LL = c1235080iFG;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        C1235080iFG c1235080iFG = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        EnumC1235130iFL enumC1235130iFL = EnumC1235130iFL.CHANGE;
        EnumC1235240iFW enumC1235240iFW = EnumC1235240iFW.GO_BACK;
        c1235080iFG.getClass();
        C1235080iFG.LJI(z, z2, enumC1235130iFL, enumC1235240iFW);
        return Unit.LIZ;
    }
}
