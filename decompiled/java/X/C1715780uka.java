package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0uka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollViewModel$enrollBiometricAuth$1", f = "BioEnrollViewModel.kt", l = {159}, m = "invokeSuspend")
public final class C1715780uka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ BioEnrollViewModel LLILLL;
    public final /* synthetic */ BiometricBEApi LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715780uka(BioEnrollViewModel bioEnrollViewModel, BiometricBEApi biometricBEApi, C19EG c19eg, InterfaceC1364105Vn<? super C1715780uka> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bioEnrollViewModel;
        this.LLILZ = biometricBEApi;
        this.LLILZIL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715780uka(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final String strLJZL;
        String str;
        final String str2;
        boolean z;
        String str3;
        Object value;
        Object objLIZ = obj;
        C1C7U.LIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    strLJZL = (String) this.LL;
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZ);
                BioEnrollViewModel bioEnrollViewModel = this.LLILLL;
                bioEnrollViewModel.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(UUID.randomUUID());
                sbLIZ.append('-');
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(bioEnrollViewModel.LLILZ.LIZJ);
                sbLIZ2.append(bioEnrollViewModel.LLILZ.LJI);
                sbLIZ.append(UUID.nameUUIDFromBytes(C2188811AlT.LIZIZ(sbLIZ2).getBytes(Charsets.UTF_8)));
                strLJZL = C13LN.LJZL(60, C2188811AlT.LIZIZ(sbLIZ));
                C1715520ukA.LIZLLL("bio_ef_init_req", null, null, null);
                C1715910ukn c1715910ukn = this.LLILLL.LLILZ;
                String str4 = c1715910ukn.LJI;
                String strJ3 = C786410Ut5.J3(C1722320uv8.LIZJ(c1715910ukn.LIZIZ, null));
                if (strJ3 == null) {
                    strJ3 = "{}";
                }
                BiometricBEApi.InitBiometricRegistrationRequest initBiometricRegistrationRequest = new BiometricBEApi.InitBiometricRegistrationRequest(strLJZL, str4, strJ3, ((C20121713oF) this.LLILLL.LLILZIL.getValue()).LIZLLL(), this.LLILLL.LLILZ.LIZ);
                BiometricBEApi biometricBEApi = this.LLILZ;
                this.LL = strLJZL;
                this.LLILLJJLI = 1;
                objLIZ = biometricBEApi.LIZ(initBiometricRegistrationRequest, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) objLIZ;
            if (!c0x52.LIZJ()) {
                C1715520ukA.LIZLLL("bio_ef_init_rsp", "response_not_successful", null, null);
                this.LLILLL.BQ2();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                return unit;
            }
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            if (Intrinsics.LJFF(baseResponse.errorCode, "LOGIN_STATUS_EXPIRED")) {
                C1715520ukA.LIZLLL("bio_ef_init_rsp", "session_expired", null, null);
                this.LLILLL.DQ2();
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                return unit2;
            }
            if (!baseResponse.LIZ()) {
                if (Intrinsics.LJFF(baseResponse.errorCode, "BIOMETRIC_VERIFICATION_ENABLED")) {
                    C1715520ukA.LIZLLL("bio_ef_init_rsp", "already_enabled", null, null);
                    this.LLILLL.AQ2(2, true);
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                    return unit3;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("body_error:errorCode:");
                sbLIZ3.append(baseResponse.errorCode);
                C1715520ukA.LIZLLL("bio_ef_init_rsp", C2188811AlT.LIZIZ(sbLIZ3), null, null);
                this.LLILLL.BQ2();
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                return unit4;
            }
            WalletFlowDecision walletFlowDecision = (WalletFlowDecision) baseResponse.data;
            if (walletFlowDecision != null) {
                str = walletFlowDecision.riskDecision;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "BLOCK")) {
                C1715520ukA.LIZLLL("bio_ef_init_rsp", "risk_block", null, null);
                this.LLILLL.CQ2();
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                return unit5;
            }
            WalletFlowDecision walletFlowDecision2 = (WalletFlowDecision) baseResponse.data;
            if (walletFlowDecision2 != null) {
                str2 = walletFlowDecision2.challengeId;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1715520ukA.LIZLLL("bio_ef_init_rsp", "challenge_empty", null, null);
                this.LLILLL.zQ2("challenge empty");
                Unit unit6 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                return unit6;
            }
            WalletFlowDecision walletFlowDecision3 = (WalletFlowDecision) baseResponse.data;
            if (walletFlowDecision3 != null) {
                str3 = walletFlowDecision3.verifyInfo;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str, "REVIEW")) {
                if (str3 != null && str3.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("BioEnrollViewModel", "REVIEW with empty verify_info");
                    C1715520ukA.LIZLLL("bio_ef_init_rsp", "risk_empty_review", null, null);
                    this.LLILLL.CQ2();
                    Unit unit7 = Unit.LIZ;
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
                    return unit7;
                }
            }
            this.LLILLL.setLoading(false);
            C2252321DDq c2252321DDq = this.LLILLL.LLILLJJLI;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, null, null, null, false, null, walletFlowDecision, 1023)));
            C1715520ukA.LIZLLL("bio_ef_init_rsp", "1", null, null);
            C1715520ukA.LIZLLL("bio_ef_vrf_start", String.valueOf(C1948507kB.LIZ(str3)), null, null);
            if (C1948507kB.LIZ(str3)) {
                C1713520ugw c1713520ugw = new C1713520ugw(new C1713590uh3(new C1713840uhS((n) null, 3), null, str3), new C1714040uhm(EnumC1714450uiR.HALF_PAGE, null, null, null, null, false, null, 126), new C1713540ugy(this.LLILLL.LLILZ.LJ, 6));
                IPipoVerifyCenterService iPipoVerifyCenterService = (IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class);
                C19EG c19eg = this.LLILZIL;
                final BioEnrollViewModel bioEnrollViewModel2 = this.LLILLL;
                Boolean.valueOf(iPipoVerifyCenterService.LIZ(c19eg, c1713520ugw, new InterfaceC1713650uh9() { // from class: X.0ukc
                    @Override // X.InterfaceC1713650uh9
                    public final void LIZ(C1713690uhD c1713690uhD) {
                        C1715520ukA.LIZLLL("bio_ef_vrf_end", c1713690uhD.LIZIZ, null, null);
                        if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                            bioEnrollViewModel2.xQ2(strLJZL, str2);
                        } else {
                            bioEnrollViewModel2.AQ2(1, false);
                        }
                    }
                }));
            } else {
                C1715520ukA.LIZLLL("bio_ef_vrf_end", "skip", null, null);
                this.LLILLL.xQ2(strLJZL, str2);
            }
            Unit unit8 = Unit.LIZ;
            C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
            return unit8;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("exception:");
            sbLIZ4.append(e.getClass().getSimpleName());
            C1715520ukA.LIZLLL("bio_ef_init_rsp", C2188811AlT.LIZIZ(sbLIZ4), null, null);
            this.LLILLL.BQ2();
            Unit unit9 = Unit.LIZ;
            C1C7U.LIZIZ("BioEnrollViewModel@1751.enrollBiometricAuth$1");
            return unit9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
