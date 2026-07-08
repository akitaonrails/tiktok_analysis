package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816320xMk extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C1816340xMm LL;
    public final /* synthetic */ C1816270xMf LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816320xMk(C1816340xMm c1816340xMm, C1816270xMf c1816270xMf, String str) {
        super(1);
        this.LL = c1816340xMm;
        this.LLILLJJLI = c1816270xMf;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        String strLJIJI = C497740JfY.LJIJI(2131851161);
        String str = "";
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        c1397620mTQ2.LIZJ(0, strLJIJI, new C1816330xMl(this.LL, this.LLILLJJLI, this.LLILLL));
        String strLJIJI2 = C497740JfY.LJIJI(2131851162);
        if (strLJIJI2 != null) {
            str = strLJIJI2;
        }
        c1397620mTQ2.LIZJ(1, str, new C1816310xMj(this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
