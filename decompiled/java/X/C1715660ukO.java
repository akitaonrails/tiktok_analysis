package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ukO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.jsb.PipoUnregisterBiometryMethod$notifyBE$1", f = "PipoUnregisterBiometryMethod.kt", l = {64}, m = "invokeSuspend")
public final class C1715660ukO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BiometricBEApi LLILLJJLI;
    public final /* synthetic */ InterfaceC1715680ukQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715660ukO(BiometricBEApi biometricBEApi, InterfaceC1715680ukQ interfaceC1715680ukQ, InterfaceC1364105Vn<? super C1715660ukO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = biometricBEApi;
        this.LLILLL = interfaceC1715680ukQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715660ukO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        boolean zLJFF;
        C1C7U.LIZ("PipoUnregisterBiometryMethod@cbf9.notifyBE$1");
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
                BiometricBEApi biometricBEApi = this.LLILLJJLI;
                BiometricBEApi.CloseBiometricRequest closeBiometricRequest = new BiometricBEApi.CloseBiometricRequest(C1716300ulQ.LIZ(), C1715650ukN.LIZ(this.LLILLL.getPipoProductCode()));
                this.LL = 1;
                obj = biometricBEApi.LIZJ(closeBiometricRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PipoUnregisterBiometryMethod@cbf9.notifyBE$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("PipoUnregisterBiometryMethod", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!c0x52.LIZJ()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("PipoUnregisterBiometryMethod", "request failed");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PipoUnregisterBiometryMethod@cbf9.notifyBE$1");
            return unit;
        }
        BiometricBEApi.CloseBiometricResponse closeBiometricResponse = (BiometricBEApi.CloseBiometricResponse) ((BaseResponse) c0x52.LIZIZ).data;
        if (closeBiometricResponse != null) {
            zLJFF = Intrinsics.LJFF(closeBiometricResponse.result, true);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("PipoUnregisterBiometryMethod", "request succeeded");
        } else {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PipoUnregisterBiometryMethod", "request failed");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PipoUnregisterBiometryMethod@cbf9.notifyBE$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
