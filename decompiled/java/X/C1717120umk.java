package X;

import com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutExtraInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0umk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingViewModel$consultChangePhone$2", f = "TTPayOnBoardingViewModel.kt", l = {77}, m = "invokeSuspend")
public final class C1717120umk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PopOutInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ TTPayOnBoardingViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717120umk(PopOutInfo popOutInfo, String str, String str2, String str3, TTPayOnBoardingViewModel tTPayOnBoardingViewModel, InterfaceC1364105Vn<? super C1717120umk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = popOutInfo;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = tTPayOnBoardingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717120umk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PopOutExtraInfo popOutExtraInfo;
        String str;
        String str2;
        C1C7U.LIZ("TTPayOnBoardingViewModel@c173.consultChangePhone$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = null;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PopOutInfo popOutInfo = this.LLILLJJLI;
                if (popOutInfo != null) {
                    popOutExtraInfo = popOutInfo.extraInfo;
                } else {
                    popOutExtraInfo = null;
                }
                String str4 = "";
                if (popOutExtraInfo == null || (str = popOutExtraInfo.sessionId) == null) {
                    str = "";
                }
                C1717580unU c1717580unU = PipoAccountApi.LIZ;
                C1716550ulp c1716550ulp = C1716550ulp.LIZ;
                String str5 = this.LLILLL;
                c1716550ulp.getClass();
                C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str5);
                if (c1717080umgLJFF != null && (str2 = c1717080umgLJFF.LIZ) != null) {
                    str4 = str2;
                }
                c1717580unU.getClass();
                PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(str4);
                C1718110uoL c1718110uoL = C1718110uoL.LIZ;
                String str6 = this.LLILLL;
                c1718110uoL.getClass();
                String strLIZ = C1718110uoL.LIZ(str6);
                String str7 = this.LLILZ;
                String str8 = this.LLILZIL;
                this.LL = 1;
                obj = pipoAccountApiLIZ.consultPhoneChange(str, strLIZ, str7, str8, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TTPayOnBoardingViewModel@c173.consultChangePhone$2");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) obj;
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            if (c0x52.LIZJ() && baseResponse.LIZ()) {
                this.LLILZLL.setState(new AwS605S0100000_26(baseResponse, (BaseResponse<WalletFlowDecision>) 44));
            } else {
                if (!c0x52.LIZJ()) {
                    z = false;
                }
                if (z) {
                    str3 = ((BaseResponse) c0x52.LIZIZ).errorContent;
                }
                this.LLILZLL.setState(new AwS76S1000000_26(str3, 2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.setState(new AwS605S0100000_26(e, 45));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTPayOnBoardingViewModel@c173.consultChangePhone$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
