package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import com.ss.android.ugc.aweme.component.phone.change.consult.ConsultPhoneChangeViewModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import defpackage.PipoPaRetrofitRefactorConfigSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0unm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.change.consult.ConsultPhoneChangeViewModel$consultPhoneChange$2", f = "ConsultPhoneChangeViewModel.kt", l = {41, 53}, m = "invokeSuspend")
public final class C1717760unm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ConsultPhoneChangeViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717760unm(String str, String str2, String str3, ConsultPhoneChangeViewModel consultPhoneChangeViewModel, InterfaceC1364105Vn<? super C1717760unm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = consultPhoneChangeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1717760unm c1717760unm = new C1717760unm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1717760unm.LLILLJJLI = obj;
        return c1717760unm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        ConsultPhoneChangeViewModel consultPhoneChangeViewModel;
        C0X52 c0x52;
        C1C7U.LIZ("ConsultPhoneChangeViewModel@c146.consultPhoneChange$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        consultPhoneChangeViewModel = (ConsultPhoneChangeViewModel) this.LLILLJJLI;
                        C155000ia.LIZIZ(obj);
                        c0x52 = (C0X52) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    consultPhoneChangeViewModel = (ConsultPhoneChangeViewModel) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    c0x52 = (C0X52) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                consultPhoneChangeViewModel = this.LLILZLL;
                String str4 = "";
                if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
                    C1717580unU c1717580unU = PipoAccountApi.LIZ;
                    C1716550ulp.LIZ.getClass();
                    String strLIZJ = C1716550ulp.LIZJ(str);
                    c1717580unU.getClass();
                    PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(strLIZJ);
                    String strLJ = C1716550ulp.LJ(str);
                    if (strLJ != null) {
                        str4 = strLJ;
                    }
                    C1718110uoL.LIZ.getClass();
                    String strLIZ = C1718110uoL.LIZ(str);
                    this.LLILLJJLI = consultPhoneChangeViewModel;
                    this.LL = 1;
                    obj = pipoAccountApiLIZ.consultPhoneChange(str4, strLIZ, str2, str3, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("ConsultPhoneChangeViewModel@c146.consultPhoneChange$2");
                        return objLJFF;
                    }
                    c0x52 = (C0X52) obj;
                } else {
                    C1717550unR c1717550unR = PhoneApi.LIZ;
                    C1716550ulp.LIZ.getClass();
                    String strLIZJ2 = C1716550ulp.LIZJ(str);
                    String strLJ2 = C1716550ulp.LJ(str);
                    if (strLJ2 != null) {
                        str4 = strLJ2;
                    }
                    c1717550unR.getClass();
                    PhoneApi phoneApiLIZ = C1717550unR.LIZ(strLIZJ2, str4, str);
                    this.LLILLJJLI = consultPhoneChangeViewModel;
                    this.LL = 2;
                    obj = phoneApiLIZ.consultPhoneChange(str2, str3, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("ConsultPhoneChangeViewModel@c146.consultPhoneChange$2");
                        return objLJFF;
                    }
                    c0x52 = (C0X52) obj;
                }
            }
            if (c0x52.LIZJ()) {
                if (((BaseResponse) c0x52.LIZIZ).LIZ()) {
                    consultPhoneChangeViewModel.withState(new AwS392S0200000_26(consultPhoneChangeViewModel, (ConsultPhoneChangeViewModel) c0x52, (C0X52<BaseResponse<WalletFlowDecision>>) 13));
                } else {
                    consultPhoneChangeViewModel.withState(new AwS392S0200000_26(consultPhoneChangeViewModel, (ConsultPhoneChangeViewModel) c0x52, (C0X52<BaseResponse<WalletFlowDecision>>) 14));
                }
            } else {
                consultPhoneChangeViewModel.withState(new AwS586S0100000_7(consultPhoneChangeViewModel, 199));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ConsultPhoneChangeViewModel consultPhoneChangeViewModel2 = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            consultPhoneChangeViewModel2.withState(new AwS586S0100000_7(consultPhoneChangeViewModel2, 200));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConsultPhoneChangeViewModel@c146.consultPhoneChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
