package X;

import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.ForestEnvData;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0q0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533650q0p {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ForestEnvData LJ;
    public String LJFF;
    public final C1533680q0s LJI;
    public Function0<String> LJII;

    public final C1533690q0t LIZ() {
        C1533680q0s c1533680q0s = this.LJI;
        if (c1533680q0s == null || !c1533680q0s.LIZ) {
            return null;
        }
        Map<String, C1533690q0t> map = c1533680q0s.LIZJ;
        String str = this.LJFF;
        if (str == null) {
            str = "default";
        }
        C1533690q0t c1533690q0t = map.get(str);
        return c1533690q0t == null ? c1533680q0s.LIZJ.get("default") : c1533690q0t;
    }

    public final void LIZIZ(AFwS204S0000000_16 aFwS204S0000000_16) {
        this.LJII = aFwS204S0000000_16;
    }

    public C1533650q0p(long j, String str, String str2, String str3, ForestEnvData forestEnvData, String str4, C1533680q0s c1533680q0s) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = forestEnvData;
        this.LJFF = str4;
        this.LJI = c1533680q0s;
        GeckoXAdapter.Companion.setEnableThrottle$forest_release(false);
        this.LJII = AFwS212S0000000_23.get$arr$(170);
    }
}
