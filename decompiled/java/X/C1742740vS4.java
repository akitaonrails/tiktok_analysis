package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0vS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742740vS4 {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;

    public static void LIZ() {
        if (LIZIZ == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZ;
            LIZIZ = jCurrentTimeMillis;
            if (jCurrentTimeMillis != 0) {
                final C1742760vS6 c1742760vS6 = new C1742760vS6(jCurrentTimeMillis, LIZJ, LIZLLL, LJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("spendDuration: ");
                sbLIZ.append(c1742760vS6);
                C2188811AlT.LIZIZ(sbLIZ);
                C1309620kBU.LIZ("duration");
                new C041O(c1742760vS6) { // from class: X.0vS5
                    public final C1742760vS6 LIZJ;

                    @Override // X.C041O
                    public final HashMap<String, Object> LIZ() {
                        HashMap<String, Object> map = new HashMap<>();
                        this.LIZJ.getClass();
                        map.put("on_list_render_duration", 0L);
                        map.put("on_first_card_play_duration", Long.valueOf(this.LIZJ.LIZ));
                        map.put("on_activity_create_duration", Long.valueOf(this.LIZJ.LIZIZ));
                        map.put("time_to_data_set_duration", Long.valueOf(this.LIZJ.LIZLLL));
                        map.put("on_fragment_view_create_duration", Long.valueOf(this.LIZJ.LIZJ));
                        return map;
                    }

                    {
                        super("rd_first_card_play_event");
                        this.LIZJ = c1742760vS6;
                    }
                }.LIZIZ();
            }
        }
    }
}
