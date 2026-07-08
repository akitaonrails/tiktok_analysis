package X;

import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel$requestConfirmApi$1$1", f = "CollectMobileFromTTViewModel.kt", l = {110, 113}, m = "invokeSuspend")
public final class C1718150uoP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0X52<BaseResponse<ConfirmRegisterMobileResponse>> LLILLJJLI;
    public final /* synthetic */ CollectMobileFromTTViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718150uoP(C0X52<BaseResponse<ConfirmRegisterMobileResponse>> c0x52, CollectMobileFromTTViewModel collectMobileFromTTViewModel, InterfaceC1364105Vn<? super C1718150uoP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0x52;
        this.LLILLL = collectMobileFromTTViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718150uoP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LIZJ() && Intrinsics.LJFF(this.LLILLJJLI.LIZIZ.resultCode, "success")) {
                if (!this.LLILLL.LLILLJJLI && !C1948507kB.LIZ(this.LLILLJJLI.LIZIZ.data.verifyInfo)) {
                    CollectMobileFromTTViewModel collectMobileFromTTViewModel = this.LLILLL;
                    BaseResponse<ConfirmRegisterMobileResponse> baseResponse = this.LLILLJJLI.LIZIZ;
                    String str = baseResponse.errorContent;
                    String str2 = baseResponse.errorCode;
                    String str3 = baseResponse.errorMsg;
                    this.LL = 1;
                    if (collectMobileFromTTViewModel.vQ2(str, str2, str3, this) == objLJFF) {
                        C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1$1");
                        return objLJFF;
                    }
                } else {
                    this.LLILLL.setState(new AwS605S0100000_26(this.LLILLJJLI, (C0X52<BaseResponse<WalletFlowDecision>>) 570));
                }
            } else {
                CollectMobileFromTTViewModel collectMobileFromTTViewModel2 = this.LLILLL;
                BaseResponse<ConfirmRegisterMobileResponse> baseResponse2 = this.LLILLJJLI.LIZIZ;
                String str4 = baseResponse2.errorContent;
                String str5 = baseResponse2.errorCode;
                String str6 = baseResponse2.errorMsg;
                this.LL = 2;
                if (collectMobileFromTTViewModel2.vQ2(str4, str5, str6, this) == objLJFF) {
                    C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
