package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EU6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EU6 {
    public static final Map<String, Integer> LJIIJ = new LinkedHashMap();
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ = true;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public boolean LJI;
    public C0E48 LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZ() {
        if (C0E5N.LIZ()) {
            if (this.LIZIZ) {
                if (this.LIZLLL == null || this.LJFF == null) {
                    return;
                }
            } else if (this.LIZLLL == null || this.LJFF == null || this.LJ == null || this.LJI) {
                return;
            }
            Map<String, Integer> map = LJIIJ;
            Integer num = (Integer) ((LinkedHashMap) map).get(this.LIZ);
            int iIntValue = num != null ? num.intValue() : 0;
            map.put(this.LIZ, Integer.valueOf(iIntValue + 1));
            C0E48 c0e48 = this.LJII;
            new Pair(-1, -1);
            C0LAB c0labLJII = C361680EFy.LJII(null, c0e48);
            c0labLJII.LJ("resource_type", C0EU5.LIZ(this.LIZ));
            c0labLJII.LJ("first_ui_frame_duration", String.valueOf(this.LIZLLL));
            c0labLJII.LJ("resource_loading_duration", String.valueOf(this.LJ));
            c0labLJII.LJ("reaction_duration", String.valueOf(this.LJFF));
            c0labLJII.LJ("is_editor_pro", C1200530hLX.LIZLLL(Boolean.valueOf(this.LIZJ)));
            c0labLJII.LJ("action_count", String.valueOf(iIntValue));
            C20684815ws.LJIILLIIL("tool_performance_edit_pro_cost_time", c0labLJII.LIZ);
        }
    }

    public final void LIZIZ(long j) {
        this.LJ = Long.valueOf(j);
        LIZ();
    }

    public C0EU6(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
