package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.iab.ITtopIABApi;
import com.ss.android.ugc.aweme.iab.TtopIABRouterParams;
import com.ss.android.ugc.aweme.iab.TtopIABVM;
import com.ss.android.ugc.aweme.iab.TtopUrlReviewResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.01Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.iab.TtopIABVM$checkUrl$4", f = "TtopIABVM.kt", l = {75}, m = "invokeSuspend")
public final class C350601Xs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ TtopIABVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C350601Xs(String str, int i, TtopIABVM ttopIABVM, InterfaceC1364105Vn<? super C350601Xs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = ttopIABVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C350601Xs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TtopUrlReviewResp ttopUrlReviewResp;
        C1C7U.LIZ("TtopIABVM@5413.checkUrl$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ITtopIABApi iTtopIABApi = (ITtopIABApi) C164400k6.LIZ.getValue();
                if (iTtopIABApi != null) {
                    String str = this.LLILLJJLI;
                    int i2 = this.LLILLL;
                    TtopIABRouterParams ttopIABRouterParams = this.LLILZ.LL;
                    Long l = ttopIABRouterParams.userId;
                    String str2 = ttopIABRouterParams.conversationId;
                    Integer num = ttopIABRouterParams.conversationType;
                    this.LL = 1;
                    obj = iTtopIABApi.reviewIABUrl(str, i2, l, str2, num, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("TtopIABVM@5413.checkUrl$4");
                        return objLJFF;
                    }
                }
                throw new IllegalStateException("service hasn't ready");
            }
            ttopUrlReviewResp = (TtopUrlReviewResp) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.setState(AFwS231S0000000_3.get$arr$(40));
        }
        if (ttopUrlReviewResp != null) {
            this.LLILZ.setState(new AwS582S0100000_3(ttopUrlReviewResp, 36));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TtopIABVM@5413.checkUrl$4");
            return unit;
        }
        throw new IllegalStateException("service hasn't ready");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
