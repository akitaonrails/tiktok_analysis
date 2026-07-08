package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0of4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481720of4 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Map<String, ? extends Object> LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILLIIL;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public final HashMap<String, Object> LJIILL = new HashMap<>();
    public float LJIIZILJ = 1.0f;

    public final String toString() {
        return "VideoPlayFailInfo(error_code=" + this.LIZ + ", error_internal_code=" + this.LIZIZ + ", error_info=" + this.LIZJ + ", group_id=" + this.LJ + ", video_id=" + this.LJFF + ", is_bytevc1=" + this.LJI + ", is_dash=" + this.LJII + ", is_ad=null, internet_speed=" + this.LJIIIIZZ + ", cache_size=" + this.LJIIIZ + ", video_size=" + this.LJIIJ + ", video_duration=" + this.LJIIJJI + ", play_url=" + this.LJIIL + ", player_type=" + this.LJIILIIL + ", is_from_feed_cache=null, play_sess=" + this.LJIILJJIL + ", traffic_economy_mode=null, customMap=" + this.LJIILL + ')';
    }

    public final void LIZIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LJIILL.put((String) obj, obj2);
                }
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJIILL.put(str, obj);
        }
    }
}
