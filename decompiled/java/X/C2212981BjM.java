package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1BjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2212981BjM implements InterfaceC1473480oRm {
    public int LIZ;

    @Override // X.InterfaceC1473480oRm
    public final void onPrepared() {
    }

    public static void LJI(int i, C2212201Bi6 c2212201Bi6) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("duration", Long.toString(i));
        map.put("percent", Integer.toString(100));
        map.put("is_ad_event", "1");
        map.put("ad_fetch_time", Long.valueOf(c2212201Bi6.LLILLJJLI));
        if (!C1293990jmH.LIZ(c2212201Bi6.LLJJIJI)) {
            map.put("log_extra", c2212201Bi6.LLJJIJI);
        }
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "play_over", map, null);
        C2212231Bi9.LJFF().LJII();
    }

    @Override // X.InterfaceC1473480oRm
    public final void LJFF(int i, int i2) {
        float f = i / i2;
        if (f < 0.0f) {
            return;
        }
        if (f >= 0.75f) {
            int i3 = this.LIZ;
            if ((i3 & 8) == 0) {
                this.LIZ = i3 | 8;
                C2212231Bi9.LJFF().LIZ();
                ((C2212941BjI) this).LJII(i, i2, "third_quartile");
            }
        }
        if (f >= 0.5f) {
            int i4 = this.LIZ;
            if ((i4 & 4) == 0) {
                this.LIZ = i4 | 4;
                C2212231Bi9.LJFF().LJFF();
                ((C2212941BjI) this).LJII(i, i2, "midpoint");
            }
        }
        if (f >= 0.25f) {
            int i5 = this.LIZ;
            if ((i5 & 2) == 0) {
                this.LIZ = i5 | 2;
                C2212231Bi9.LJFF().LIZLLL();
                ((C2212941BjI) this).LJII(i, i2, "first_quartile");
            }
        }
    }
}
