package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.InterceptReason;

/* JADX INFO: renamed from: X.0xMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816450xMx extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C1816270xMf LL;
    public final /* synthetic */ C1816400xMs LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<InterceptReason> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816450xMx(C1816270xMf c1816270xMf, C1816400xMs c1816400xMs, String str, List<String> list, List<InterceptReason> list2) {
        super(1);
        this.LL = c1816270xMf;
        this.LLILLJJLI = c1816400xMs;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        String strLJIJI = C497740JfY.LJIJI(2131851174);
        String str = "";
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        c1397620mTQ2.LIZJ(0, strLJIJI, new C1816390xMr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        String strLJIJI2 = C497740JfY.LJIJI(2131851176);
        if (strLJIJI2 != null) {
            str = strLJIJI2;
        }
        c1397620mTQ2.LIZJ(1, str, new C1816440xMw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        return Unit.LIZ;
    }
}
