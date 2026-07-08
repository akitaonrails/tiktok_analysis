package X;

import Y.ARunnableS4S0010000_31;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.15XD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2$1", f = "FamilyPairingManagerV2.kt", l = {77}, m = "invokeSuspend")
public final class C15XD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C15XD(InterfaceC1364105Vn<? super C15XD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15XD(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C15Y9 c15y9LIZJ;
        C1C7U.LIZ("FamilyPairingManagerV2@bc14.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
            if (iPNSProtectionDataLayerServiceFactory != null && (c15y9LIZJ = iPNSProtectionDataLayerServiceFactory.LIZJ()) != null) {
                b bVarLJII = c15y9LIZJ.LJII(EnumC20536915Xr.FAMILY_PARING_CHANGED);
                Object obj2 = new InterfaceC346701Wf() { // from class: X.15XC
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        Looper looperMyLooper;
                        Looper looperMyLooper2;
                        FamilyPairingManagerV2 familyPairingManagerV2 = FamilyPairingManagerV2.LIZ;
                        EnumC20537615Xy enumC20537615Xy = FamilyPairingManagerV2.LIZLLL;
                        boolean z = FamilyPairingManagerV2.LJ;
                        EnumC20537615Xy enumC20537615XyLIZIZ = familyPairingManagerV2.LIZIZ();
                        boolean zLJIL = familyPairingManagerV2.LJIL();
                        EnumC20537615Xy enumC20537615Xy2 = EnumC20537615Xy.CHILD;
                        if (enumC20537615Xy == enumC20537615Xy2 && enumC20537615XyLIZIZ != enumC20537615Xy2) {
                            if (enumC20537615XyLIZIZ != EnumC20537615Xy.UNLINK_LOCKED && z && (looperMyLooper2 = Looper.myLooper()) != null) {
                                C786410Ut5.LJJZZIII(new BPEAHandler(looperMyLooper2), new ARunnableS4S0010000_31(false, 1));
                            }
                        } else if (enumC20537615XyLIZIZ == enumC20537615Xy2 && zLJIL != z && (looperMyLooper = Looper.myLooper()) != null) {
                            C786410Ut5.LJJZZIII(new BPEAHandler(looperMyLooper), new ARunnableS4S0010000_31(zLJIL, 1));
                        }
                        FamilyPairingManagerV2.LIZLLL = familyPairingManagerV2.LIZIZ();
                        FamilyPairingManagerV2.LJ = familyPairingManagerV2.LJIL();
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (bVarLJII.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("FamilyPairingManagerV2@bc14.<init>$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FamilyPairingManagerV2@bc14.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C15XD(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
