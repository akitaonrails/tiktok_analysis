package X;

import Y.AfS2S0200100_7;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;
import tikcast.api.fans.CreateSuperFanContractResult;

/* JADX INFO: renamed from: X.0KP4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KP4 extends AbstractC516450KNf<CreateSuperFanContractResult> {
    public C0KP3 LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 0));

    @Override // X.AbstractC516450KNf
    public final void LJFF() {
    }

    @Override // X.AbstractC516450KNf
    public final void LIZ() {
        C0KP3 c0kp3 = this.LIZLLL;
        if (c0kp3 != null) {
            C0KPD c0kpd = (C0KPD) this.LJ.getValue();
            C516550KNp c516550KNpLIZ = AbstractC516340KMu.LIZ(c0kpd.LIZIZ, c0kp3, 0L, null, null, null, 30);
            c0kpd.LIZIZ.getClass();
            AbstractC516340KMu.LIZJ(c516550KNpLIZ);
            Map<? extends String, ? extends String> mapLIZIZ = C0KSH.LIZIZ(c0kp3);
            C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_create_contract_start");
            c512030K6fLIZ.LIZLLL.putAll(mapLIZIZ);
            c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0KS7.LJ(c0kp3).LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c0kpd, c0kp3, 0), new AfS2S0200100_7(jCurrentTimeMillis, c0kpd, c0kp3, 1));
        }
    }

    @Override // X.AbstractC516450KNf
    public final void LIZIZ(CreateSuperFanContractResult createSuperFanContractResult) {
        String str;
        CreateSuperFanContractResult createSuperFanContractResult2 = createSuperFanContractResult;
        C0KP3 c0kp3 = this.LIZLLL;
        if (c0kp3 != null) {
            C516910KOz c516910KOz = new C516910KOz(this.LIZJ);
            String str2 = null;
            if (createSuperFanContractResult2 != null) {
                str2 = createSuperFanContractResult2.bizContent;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (createSuperFanContractResult2 != null && (str = createSuperFanContractResult2.contractId) != null) {
                str3 = str;
            }
            c516910KOz.LIZ(c0kp3, str3, str2);
        }
    }

    @Override // X.AbstractC516450KNf
    public final boolean LIZLLL(boolean z) {
        C0KP3 c0kp3;
        C0W0R.LIZJ();
        C0KNX c0knx = this.LIZ;
        if ((c0knx instanceof C0KP3) && (c0kp3 = (C0KP3) c0knx) != null) {
            this.LIZLLL = c0kp3;
            C0KN4 c0kn4 = new C0KN4(c0kp3.LIZJ.get());
            c0kp3.LIZ = c0kn4;
            c0kn4.LLILZIL = true;
            return true;
        }
        return false;
    }

    @Override // X.AbstractC516450KNf
    public final void LJ(String str, String str2, boolean z) {
        C0KP3 c0kp3 = this.LIZLLL;
        if (c0kp3 == null) {
            return;
        }
        C0KP7 c0kp7 = new C0KP7(c0kp3);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0KP9(c0kp7, str, c0kp3, z, str2, null), 3);
    }
}
