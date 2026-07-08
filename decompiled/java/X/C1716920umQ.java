package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.guide.GuidePageViewModel;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS3S3000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0umQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.guide.GuidePageViewModel$load$3", f = "GuidePageViewModel.kt", l = {79}, m = "invokeSuspend")
public final class C1716920umQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GuidePageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1717080umg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716920umQ(GuidePageViewModel guidePageViewModel, String str, String str2, C1717080umg c1717080umg, InterfaceC1364105Vn<? super C1716920umQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = guidePageViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1717080umg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1716920umQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("GuidePageViewModel@73b.load$3");
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
                String strVQ2 = this.LLILLJJLI.vQ2(this.LLILLL, this.LLILZ);
                SessionExpiredHandler.LIZIZ = this.LLILLL;
                InterfaceC1717100umi interfaceC1717100umi = (InterfaceC1717100umi) ((InterfaceC736910SvR) this.LLILLJJLI.LL.getValue()).getOperator();
                String str3 = this.LLILLL;
                C1717080umg c1717080umg = this.LLILZIL;
                String str4 = c1717080umg.LIZIZ;
                String str5 = c1717080umg.LIZLLL.LIZ;
                this.LL = 1;
                obj = interfaceC1717100umi.LLILLL(str3, str4, null, str5, strVQ2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GuidePageViewModel@73b.load$3");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) obj;
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            String str6 = null;
            SessionExpiredHandler.LIZIZ = null;
            if (c0x52.LIZJ() && baseResponse.LIZ()) {
                this.LLILLJJLI.setState(new AwS605S0100000_26(baseResponse, (BaseResponse<WalletFlowDecision>) 581));
            } else {
                if (c0x52.LIZJ()) {
                    str = ((BaseResponse) c0x52.LIZIZ).errorContent;
                } else {
                    str = null;
                }
                if (c0x52.LIZJ()) {
                    str2 = ((BaseResponse) c0x52.LIZIZ).errorMsg;
                } else {
                    str2 = null;
                }
                if (c0x52.LIZJ()) {
                    str6 = ((BaseResponse) c0x52.LIZIZ).errorCode;
                }
                this.LLILLJJLI.setState(new AwS3S3000000_26(str, str2, str6, 1));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS605S0100000_26(e, 582));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuidePageViewModel@73b.load$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
