package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.security.PublicKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ukZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollViewModel$verifySignedChallenge$1", f = "BioEnrollViewModel.kt", l = {343}, m = "invokeSuspend")
public final class C1715770ukZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1715820uke LLILLJJLI;
    public final /* synthetic */ BiometricBEApi LLILLL;
    public final /* synthetic */ BioEnrollViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715770ukZ(C1715820uke c1715820uke, BiometricBEApi biometricBEApi, BioEnrollViewModel bioEnrollViewModel, InterfaceC1364105Vn<? super C1715770ukZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1715820uke;
        this.LLILLL = biometricBEApi;
        this.LLILZ = bioEnrollViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715770ukZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        String str;
        Object value;
        Object objLIZIZ = obj;
        C1C7U.LIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                PublicKey publicKey = this.LLILLJJLI.LIZIZ.getPublic();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n                -----BEGIN PUBLIC KEY-----\n                ");
                sbLIZ.append(Base64.encodeToString(publicKey.getEncoded(), 2));
                sbLIZ.append("\n                -----END PUBLIC KEY-----\n            ");
                String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                C1715520ukA.LIZLLL("bio_ef_submit_req", null, null, null);
                BiometricBEApi.SubmitBiometricRegistrationRequest submitBiometricRegistrationRequest = new BiometricBEApi.SubmitBiometricRegistrationRequest(this.LLILLJJLI.LIZ, C1716300ulQ.LIZ(), C1715790ukb.LIZ(this.LLILLJJLI.LIZIZ), "ecdsa_sha256", strLIZJ, this.LLILLJJLI.LIZJ);
                BiometricBEApi biometricBEApi = this.LLILLL;
                this.LL = 1;
                objLIZIZ = biometricBEApi.LIZIZ(submitBiometricRegistrationRequest, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) objLIZIZ;
            if (!c0x52.LIZJ()) {
                C1715520ukA.LIZLLL("bio_ef_submit_rsp", "response_not_successful", null, null);
                this.LLILZ.BQ2();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                return unit;
            }
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            if (Intrinsics.LJFF(baseResponse.errorCode, "LOGIN_STATUS_EXPIRED")) {
                C1715520ukA.LIZLLL("bio_ef_submit_rsp", "session_expired", null, null);
                this.LLILZ.DQ2();
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                return unit2;
            }
            if (!baseResponse.LIZ()) {
                if (Intrinsics.LJFF(baseResponse.errorCode, "BIOMETRIC_VERIFICATION_ENABLED")) {
                    C1715520ukA.LIZLLL("bio_ef_submit_rsp", "already_enabled", null, null);
                    this.LLILZ.AQ2(2, true);
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                    return unit3;
                }
                if (Intrinsics.LJFF(baseResponse.errorCode, "sy0001")) {
                    C1715520ukA.LIZLLL("bio_ef_submit_rsp", "timeout", null, null);
                    BioEnrollViewModel bioEnrollViewModel = this.LLILZ;
                    bioEnrollViewModel.LL = null;
                    C2252321DDq c2252321DDq = bioEnrollViewModel.LLILLJJLI;
                    do {
                        value = c2252321DDq.getValue();
                    } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, null, new C1715110ujV(null), null, false, new C1715110ujV(true), null, 1469)));
                    Unit unit4 = Unit.LIZ;
                    C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                    return unit4;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("body_error:errorCode:");
                sbLIZ2.append(baseResponse.errorCode);
                C1715520ukA.LIZLLL("bio_ef_submit_rsp", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                this.LLILZ.BQ2();
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
                return unit5;
            }
            BiometricBEApi.SubmitBiometricRegistrationResponse submitBiometricRegistrationResponse = (BiometricBEApi.SubmitBiometricRegistrationResponse) baseResponse.data;
            if (submitBiometricRegistrationResponse != null) {
                boolValueOf = Boolean.valueOf(submitBiometricRegistrationResponse.registerResult);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, true)) {
                C1715520ukA.LIZLLL("bio_ef_submit_rsp", "1", null, null);
                this.LLILZ.AQ2(0, true);
            } else {
                if (baseResponse.data == 0) {
                    str = "data_null";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                C1715520ukA.LIZLLL("bio_ef_submit_rsp", str, null, null);
                this.LLILZ.AQ2(1, false);
            }
            Unit unit6 = Unit.LIZ;
            C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
            return unit6;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("exception:");
            sbLIZ3.append(e.getClass().getSimpleName());
            C1715520ukA.LIZLLL("bio_ef_submit_rsp", C2188811AlT.LIZIZ(sbLIZ3), null, null);
            this.LLILZ.BQ2();
            Unit unit7 = Unit.LIZ;
            C1C7U.LIZIZ("BioEnrollViewModel@1751.verifySignedChallenge$1");
            return unit7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
