package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758920Tpq {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C758940Tps LIZ;
    public CommercialContentToggle LIZIZ;
    public C758950Tpt LIZJ;
    public boolean LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function1<String, Unit> LJI;
    public final Function1<EnumC758830Tph, Unit> LJII;

    public C758920Tpq() {
        throw null;
    }

    public final int LIZIZ() {
        C758940Tps c758940Tps = this.LIZ;
        int i = c758940Tps.LIZ;
        int i2 = c758940Tps.LJ;
        if (c758940Tps.LJIIIIZZ == 1) {
            return 10;
        }
        if (i == 1 && i2 == 1) {
            return 6;
        }
        if (i == 2 && i2 == 2) {
            return 7;
        }
        if (i == 1 && i2 == 3) {
            return 1;
        }
        if (i2 == 1 && i == 3) {
            return 4;
        }
        if (i == 1) {
            return 8;
        }
        if (i2 == 1) {
            return 9;
        }
        if (i == 2) {
            return 2;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i != 3) {
            return (i == 0 || i2 == 0) ? 0 : 3;
        }
        return 3;
    }

    public final int LIZ(LiveMode liveMode) {
        List listLJIIJJI;
        C758940Tps c758940Tps = this.LIZ;
        int i = C197800pU.LIZ[liveMode.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    listLJIIJJI = C13BV.INSTANCE;
                } else {
                    listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(c758940Tps.LIZ), Integer.valueOf(c758940Tps.LIZJ), Integer.valueOf(c758940Tps.LJIIIIZZ));
                }
            } else {
                listLJIIJJI = Collections.singletonList(Integer.valueOf(c758940Tps.LIZJ));
            }
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(c758940Tps.LIZ), Integer.valueOf(c758940Tps.LJ), Integer.valueOf(c758940Tps.LJIIIIZZ));
        }
        if (listLJIIJJI.contains(1)) {
            i2 = 1;
        } else if (listLJIIJJI.contains(2)) {
            i2 = 2;
        } else if (!listLJIIJJI.contains(0)) {
            i2 = 3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergeStatus=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("BcToggleToggleService", C2188811AlT.LIZIZ(sbLIZ));
        return i2;
    }

    public C758920Tpq(AwS556S0100000_12 awS556S0100000_12, AwS556S0100000_12 awS556S0100000_122, AwS591S0100000_12 awS591S0100000_12, AwS591S0100000_12 awS591S0100000_122) {
        this.LIZ = new C758940Tps(0);
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = false;
        this.LJ = awS556S0100000_12;
        this.LJFF = awS556S0100000_122;
        this.LJI = awS591S0100000_12;
        this.LJII = awS591S0100000_122;
    }
}
