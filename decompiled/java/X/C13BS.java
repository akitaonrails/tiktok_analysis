package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementExperimentModules;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.13BS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BS {
    public final Map<String, C13BQ> LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public final List<String> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 0));

    public final String LIZIZ() {
        int i = this.LIZJ;
        CharsKt__CharJVMKt.checkRadix(2);
        return Integer.toString(i, 2);
    }

    public static final void LIZ(String str) {
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
    }

    public final void LIZLLL(String str) {
        MeasurementExperimentModules.LIZ.getClass();
        if (C589110N8r.LIZIZ.getValue().LIZ() == 1) {
            C13BQ c13bq = this.LIZ.get(str);
            if (c13bq != null) {
                this.LIZJ = (c13bq.LIZJ - 1) & this.LIZJ;
                return;
            }
            return;
        }
        int i = 0;
        for (Map.Entry<String, C13BQ> entry : this.LIZ.entrySet()) {
            String key = entry.getKey();
            C13BQ value = entry.getValue();
            if (Intrinsics.LJFF(key, str)) {
                break;
            } else {
                i |= value.LIZJ;
            }
        }
        this.LIZJ = i;
    }

    public C13BS(Map<String, C13BQ> map, String str) {
        this.LIZ = map;
        this.LIZIZ = str;
    }

    public final void LIZJ(String str, boolean z, boolean z2) {
        if (z) {
            ((ArrayList) this.LIZLLL).add(C13BW.LIZIZ(str));
        }
        if (z2) {
            ((ArrayList) this.LJ).add(C13BW.LIZIZ(str));
        }
    }
}
