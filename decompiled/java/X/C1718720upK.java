package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.verify.PinApi;
import com.ss.android.ugc.aweme.component.verify.pin.offline.PinOffineViewModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import defpackage.PipoPaRetrofitRefactorConfigSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0upK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.verify.pin.offline.PinOffineViewModel$consultChangePin$1", f = "PinOffineViewModel.kt", l = {66, 71}, m = "invokeSuspend")
public final class C1718720upK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PinOffineViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718720upK(PinOffineViewModel pinOffineViewModel, InterfaceC1364105Vn<? super C1718720upK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pinOffineViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718720upK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C0X52 c0x52;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("PinOffineViewModel@23c4.consultChangePin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C155000ia.LIZIZ(obj);
                        c0x52 = (C0X52) obj;
                    } else {
                        C155000ia.LIZIZ(obj);
                        c0x52 = (C0X52) obj;
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(593));
                    PinOffineViewModel pinOffineViewModel = this.LLILLJJLI;
                    if (pinOffineViewModel.LLILLJJLI == null) {
                        pinOffineViewModel.setState(AFwS268S0000000_26.get$arr$(594));
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PinOffineViewModel@23c4.consultChangePin$1");
                        return unit;
                    }
                    C1718110uoL c1718110uoL = C1718110uoL.LIZ;
                    C1718710upJ c1718710upJ = pinOffineViewModel.LL;
                    String str5 = "";
                    if (c1718710upJ == null || (str = c1718710upJ.LLILLJJLI) == null) {
                        str = "";
                    }
                    c1718110uoL.getClass();
                    JSONObject jSONObjectLIZJ = C1718110uoL.LIZJ(str);
                    if (jSONObjectLIZJ != null) {
                        C1718710upJ c1718710upJ2 = this.LLILLJJLI.LL;
                        if (c1718710upJ2 == null || (str4 = c1718710upJ2.LLILLJJLI) == null) {
                            str4 = "";
                        }
                        jSONObjectLIZJ.put("pipo_product_code", str4);
                    }
                    if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
                        C1717580unU c1717580unU = PipoAccountApi.LIZ;
                        C1718710upJ c1718710upJ3 = this.LLILLJJLI.LL;
                        if (c1718710upJ3 == null || (str2 = c1718710upJ3.LLILZLL) == null) {
                            str2 = "";
                        }
                        c1717580unU.getClass();
                        PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(str2);
                        C1718710upJ c1718710upJ4 = this.LLILLJJLI.LL;
                        if (c1718710upJ4 != null && (str3 = c1718710upJ4.LLIZ) != null) {
                            str5 = str3;
                        }
                        String strValueOf = String.valueOf(jSONObjectLIZJ);
                        this.LL = 1;
                        obj = pipoAccountApiLIZ.consultChangePin(str5, strValueOf, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("PinOffineViewModel@23c4.consultChangePin$1");
                            return objLJFF;
                        }
                        c0x52 = (C0X52) obj;
                    } else {
                        PinApi pinApi = this.LLILLJJLI.LLILLJJLI;
                        if (pinApi != null) {
                            String strValueOf2 = String.valueOf(jSONObjectLIZJ);
                            this.LL = 2;
                            obj = pinApi.consultChangePin(strValueOf2, this);
                            if (obj == objLJFF) {
                                C1C7U.LIZIZ("PinOffineViewModel@23c4.consultChangePin$1");
                                return objLJFF;
                            }
                            c0x52 = (C0X52) obj;
                        } else {
                            c0x52 = null;
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.setState(new AwS605S0100000_26(e, 595));
            }
            if (c0x52 == null) {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(595));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PinOffineViewModel@23c4.consultChangePin$1");
                return unit2;
            }
            if (c0x52.LIZJ()) {
                if (((BaseResponse) c0x52.LIZIZ).LIZ()) {
                    this.LLILLJJLI.setState(new AwS605S0100000_26(c0x52, (C0X52<BaseResponse<WalletFlowDecision>>) 592));
                } else if (Intrinsics.LJFF(((BaseResponse) c0x52.LIZIZ).errorCode, "PIN_FROZEN")) {
                    this.LLILLJJLI.setState(new AwS605S0100000_26(c0x52, (C0X52<BaseResponse<WalletFlowDecision>>) 593));
                } else {
                    this.LLILLJJLI.setState(new AwS605S0100000_26(c0x52, (C0X52<BaseResponse<WalletFlowDecision>>) 594));
                }
            } else {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(596));
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("PinOffineViewModel@23c4.consultChangePin$1");
            return unit3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
