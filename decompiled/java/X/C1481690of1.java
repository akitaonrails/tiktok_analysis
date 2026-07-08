package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0of1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481690of1 {
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public long LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public final int LJFF = -1;
    public boolean LJI = true;
    public Integer LJIIIZ = -1;
    public final Boolean LJIIJ = Boolean.FALSE;
    public final HashMap<String, Object> LJIIJJI = new HashMap<>();
    public float LJIILL = 1.0f;

    public final String toString() {
        return "VideoBlockInfo(is_net_block=" + this.LJI + ", position=" + this.LIZJ + ", internetSpeed=" + this.LJ + ", is_cache=" + this.LIZ + ", drop_cnt=" + this.LIZIZ + ", traffic_economy_mode=" + this.LJFF + ", play_sess=" + this.LJII + ", video_size=null, player_type=" + this.LJIIIIZZ + ", request_info=null, is_battery_saver=null, video_cache_read_time=null, video_cache_read_size=null, video_cache_read_cnt=" + this.LJIIIZ + ", video_cache_use_ttnet=" + this.LJIIJ + ", customMap=" + this.LJIIJJI + ')';
    }

    public final void LIZIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LJIIJJI.put((String) obj, obj2);
                }
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJIIJJI.put(str, obj);
        }
    }
}
