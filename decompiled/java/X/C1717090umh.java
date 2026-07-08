package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingViewModel;
import com.ss.android.ugc.aweme.biz.wallet.network.CommonBizContentRequestWrapper;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS3S3000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0umh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingViewModel$load$3", f = "BaseWalletLandingViewModel.kt", l = {86, 102}, m = "invokeSuspend")
public final class C1717090umh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseWalletLandingViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1717080umg LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717090umh(BaseWalletLandingViewModel baseWalletLandingViewModel, String str, String str2, boolean z, C1717080umg c1717080umg, InterfaceC1364105Vn<? super C1717090umh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseWalletLandingViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = c1717080umg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717090umh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        Activity activityLIZIZ;
        Boolean boolValueOf;
        C0X52 c0x52;
        String str;
        String str2;
        Object objM0 = obj;
        C1C7U.LIZ("BaseWalletLandingViewModel@96e5.load$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = null;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objM0);
                    c0x52 = (C0X52) objM0;
                } else {
                    C155000ia.LIZIZ(objM0);
                    c0x52 = (C0X52) objM0;
                }
            } else {
                C155000ia.LIZIZ(objM0);
                String strVQ2 = this.LLILLJJLI.vQ2(this.LLILLL, this.LLILZ);
                if (!this.LLILZIL) {
                    InterfaceC1717100umi interfaceC1717100umi = (InterfaceC1717100umi) ((InterfaceC736910SvR) this.LLILLJJLI.LL.getValue()).getOperator();
                    String str4 = this.LLILLL;
                    C1717080umg c1717080umg = this.LLILZLL;
                    String str5 = c1717080umg.LIZIZ;
                    String str6 = c1717080umg.LJIILLIIL;
                    String str7 = c1717080umg.LIZLLL.LIZ;
                    this.LL = 1;
                    objM0 = interfaceC1717100umi.LLILLL(str4, str5, str6, str7, strVQ2, this);
                    if (objM0 == objLJFF) {
                        C1C7U.LIZIZ("BaseWalletLandingViewModel@96e5.load$3");
                        return objLJFF;
                    }
                    c0x52 = (C0X52) objM0;
                } else {
                    AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
                    if (abstractC1387200mCcLIZJ != null && (activityLIZIZ = abstractC1387200mCcLIZJ.LIZIZ()) != null) {
                        IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
                        if (iPipoService != null) {
                            boolValueOf = Boolean.valueOf(iPipoService.LJIIJ(activityLIZIZ));
                        } else {
                            boolValueOf = null;
                        }
                        zLJFF = Intrinsics.LJFF(boolValueOf, true);
                    } else {
                        zLJFF = false;
                    }
                    JSONObject jSONObject = new JSONObject(strVQ2);
                    if (!zLJFF) {
                        z = false;
                    }
                    jSONObject.put("support_biometric", z);
                    InterfaceC1717100umi interfaceC1717100umi2 = (InterfaceC1717100umi) ((InterfaceC736910SvR) this.LLILLJJLI.LL.getValue()).getOperator();
                    String str8 = this.LLILLL;
                    C1717080umg c1717080umg2 = this.LLILZLL;
                    String str9 = c1717080umg2.LIZIZ;
                    String str10 = c1717080umg2.LJIILLIIL;
                    CommonBizContentRequestWrapper commonBizContentRequestWrapper = new CommonBizContentRequestWrapper(c1717080umg2.LIZLLL.LIZ, C786410Ut5.J3(jSONObject));
                    this.LL = 2;
                    objM0 = interfaceC1717100umi2.m0(str8, str9, str10, commonBizContentRequestWrapper, this);
                    if (objM0 == objLJFF) {
                        C1C7U.LIZIZ("BaseWalletLandingViewModel@96e5.load$3");
                        return objLJFF;
                    }
                    c0x52 = (C0X52) objM0;
                }
            }
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            if (c0x52.LIZJ() && baseResponse.LIZ()) {
                this.LLILLJJLI.setState(new AwS605S0100000_26(baseResponse, (BaseResponse<WalletFlowDecision>) 64));
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
                    str3 = ((BaseResponse) c0x52.LIZIZ).errorCode;
                }
                this.LLILLJJLI.setState(new AwS3S3000000_26(str, str3, str2, 0));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS605S0100000_26(e, 65));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseWalletLandingViewModel@96e5.load$3");
        return unit;
    }
}
