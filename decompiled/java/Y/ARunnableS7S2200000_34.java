package Y;

import X.C0XGR;
import X.C1238130iKB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LN;
import X.C1BV2;
import X.C1C7U;
import X.C20684815ws;
import X.C2209481Bdi;
import X.C2209501Bdk;
import X.C2209521Bdm;
import X.C2209791BeD;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS7S2200000_34 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1397580mTM c1397580mTM = new C1397580mTM(((C1BV2) this.l2).LIZ);
        c1397580mTM.LJI(this.s0);
        c1397580mTM.LIZIZ(this.s1);
        c1397580mTM.LJIIIIZZ = true;
        C1238130iKB.LIZ(c1397580mTM, new AwS400S0200000_34((C1BV2) this.l2, (C1BV2) this.l3, (Function0<Unit>) 45));
        c1397580mTM.LIZLLL(new AwS613S0100000_34((C1BV2) this.l2, 156));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("popup_type", "skippable");
        c0xgr.LIZLLL("enter_from", ((C1BV2) this.l2).LIZIZ.LL);
        C20684815ws.LJIILLIIL("3p_offline_popup", c0xgr.LIZ);
    }

    public static final void run$0(ARunnableS7S2200000_34 aRunnableS7S2200000_34) {
        C2209521Bdm c2209521Bdm = (C2209521Bdm) aRunnableS7S2200000_34.l2;
        String str = aRunnableS7S2200000_34.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS7S2200000_34.l3;
        String strLJZL = aRunnableS7S2200000_34.s1;
        c2209521Bdm.getClass();
        C1C7U.LIZ("ParamsExtractImpl@f0e9.createCommonParams$1L");
        C2209481Bdi c2209481BdiLIZIZ = c2209521Bdm.LJFF.LIZIZ(new Object[0]);
        c2209481BdiLIZIZ.getClass();
        if (strLJZL == null || a0.LJJJIL(strLJZL)) {
            strLJZL = C13LN.LJZL(16, u.LJJIFFI(UUID.randomUUID().toString(), "-", "", false));
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2209791BeD.LJIJJ().LIZJ(C2209481Bdi.LIZJ, "createCommonParams insert threw", e);
        }
        if (!c2209481BdiLIZIZ.LIZ.LIZJ(strLJZL, str, C786410Ut5.J3(jSONObject))) {
            C2209791BeD.LJIJJ().LIZJ(C2209481Bdi.LIZJ, "insert failed for cpId=" + strLJZL + " session=" + str, new Object[0]);
        } else {
            System.currentTimeMillis();
            c2209481BdiLIZIZ.LIZIZ.LIZ.put(strLJZL, new C2209501Bdk(strLJZL, jSONObject));
        }
        C1C7U.LIZIZ("ParamsExtractImpl@f0e9.createCommonParams$1L");
    }

    public static final void run$1(ARunnableS7S2200000_34 aRunnableS7S2200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("Failed3PService@8cb2.accountLookUpDataObserver$1$2");
        try {
            aRunnableS7S2200000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Failed3PService@8cb2.accountLookUpDataObserver$1$2");
    }

    public ARunnableS7S2200000_34(Object obj, String str, Object obj2, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.s1 = str2;
    }
}
