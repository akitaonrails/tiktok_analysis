package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07gU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1925607gU extends C09AY implements Function0<String> {
    public C1925607gU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            IStarshipSolariaProfile iStarshipSolariaProfile = C0CP7.LIZ;
            String strLIZLLL = iStarshipSolariaProfile.LIZLLL("block_label");
            String strLIZLLL2 = iStarshipSolariaProfile.LIZLLL("device_score");
            String str = new String();
            k kVar = (k) C0C64.LJIILLIIL().LJJII(k.class, null, "player_socket_dynamic_timeout_strategy", true);
            h hVarLJIIL = kVar != null ? kVar.LJIIL() : null;
            if (hVarLJIIL != null) {
                Iterator<k> it2 = hVarLJIIL.iterator();
                boolean z = false;
                loop0: while (it2.hasNext()) {
                    k next = it2.next();
                    n nVarLJIILIIL = next != null ? next.LJIILIIL() : null;
                    k kVarLJJIIZ = nVarLJIILIIL != null ? nVarLJIILIIL.LJJIIZ("condition") : null;
                    n nVarLJIILIIL2 = kVarLJJIIZ != null ? kVarLJJIIZ.LJIILIIL() : null;
                    k kVarLJJIIZ2 = nVarLJIILIIL2 != null ? nVarLJIILIIL2.LJJIIZ("block_label") : null;
                    h hVarLJIIL2 = kVarLJJIIZ2 != null ? kVarLJJIIZ2.LJIIL() : new h();
                    k kVarLJJIIZ3 = nVarLJIILIIL2 != null ? nVarLJIILIIL2.LJJIIZ("device_score") : null;
                    h hVarLJIIL3 = kVarLJJIIZ3 != null ? kVarLJJIIZ3.LJIIL() : new h();
                    Iterator<k> it3 = hVarLJIIL2.iterator();
                    while (it3.hasNext()) {
                        k next2 = it3.next();
                        String strLJIL = next2 != null ? next2.LJIILJJIL().LJIL() : null;
                        if (strLJIL != null && strLJIL.equals(strLIZLLL)) {
                            str = C07R6.LIZ(nVarLJIILIIL);
                            z = true;
                        }
                        if (z) {
                            break loop0;
                        }
                    }
                    Iterator<k> it4 = hVarLJIIL3.iterator();
                    while (it4.hasNext()) {
                        k next3 = it4.next();
                        String strLJIL2 = next3 != null ? next3.LJIILJJIL().LJIL() : null;
                        if (strLJIL2 != null && strLJIL2.equals(strLIZLLL2)) {
                            str = C07R6.LIZ(nVarLJIILIIL);
                            z = true;
                        }
                        if (z) {
                            return str;
                        }
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
