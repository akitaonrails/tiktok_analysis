package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS198S0000000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506040pII {
    public final InterfaceC1483820oiS LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(305));
    public C1484900okC LIZJ;

    public final InterfaceC1484830ok5 LIZ() {
        return (InterfaceC1484830ok5) this.LIZIZ.getValue();
    }

    public C1506040pII(C207192165u c207192165u) {
        this.LIZ = c207192165u;
    }

    public final void LIZIZ(EnumC1506060pIK enumC1506060pIK) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "feed_ecom_search_card");
            jSONObject.put("step", "player_lifecycle");
            jSONObject.put("message", enumC1506060pIK.name());
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_search_fyp", jSONObject);
            switch (C1506050pIJ.LIZ[enumC1506060pIK.ordinal()]) {
                case 1:
                    LIZ().LIZJ(this.LIZ);
                    return;
                case 2:
                    LIZ().LJ(this.LIZJ);
                    return;
                case 3:
                    LIZ().resume();
                    return;
                case 4:
                    LIZ().pause();
                    return;
                case 5:
                    LIZ().stop();
                    return;
                case 6:
                    LIZ().release();
                    return;
                default:
                    throw new C1954807lC();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
