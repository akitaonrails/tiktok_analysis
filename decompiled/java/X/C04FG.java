package X;

import com.bytedance.goda.v2.model.dto.GodaV2Container;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2Extension;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.04FG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FG {
    public final GodaV2Facade LIZ;
    public final C04FO LIZIZ;
    public final C04FM LIZJ;
    public final Map<String, GodaV2Data> LIZLLL;
    public final Map<String, GodaV2Container> LJ;
    public final C04CV LJFF;
    public final Map<String, C04FQ> LJI;
    public final GodaV2Extension LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1510));

    public final C04FP LIZ() {
        C04FO c04fo = this.LIZIZ;
        if (c04fo != null) {
            return c04fo.LJIJ;
        }
        return null;
    }

    public C04FG(GodaV2Facade godaV2Facade, C04FO c04fo, C04FM c04fm, Map map, Map map2, C04CV c04cv, Map map3, GodaV2Extension godaV2Extension) {
        this.LIZ = godaV2Facade;
        this.LIZIZ = c04fo;
        this.LIZJ = c04fm;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = c04cv;
        this.LJI = map3;
        this.LJII = godaV2Extension;
    }
}
