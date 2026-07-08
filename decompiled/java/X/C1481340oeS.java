package X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0oeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481340oeS {
    public int LIZ;
    public int LJII;
    public boolean LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public C1481440oec LJIIL;
    public List<C2262431Dgv> LJIILIIL;
    public List<C1EJO> LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public long LJIJJLI;
    public long LJIL;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public String LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public long LJJIZ;
    public int LJJJ;
    public long LJJJI;
    public int LJJJIL;
    public long LJJJJ;
    public int LJJJJI;
    public long LJJJJIZL;
    public int LJJJJJ;
    public String LJJJJJL;
    public final int LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public int LJFF = -1;
    public float LJI = 1.0f;
    public final int LJIIIIZZ = -1;
    public final HashMap<String, Object> LJIIZILJ = new HashMap<>();
    public int LJIJ = -1;
    public int LJIJI = -1;
    public long LJIJJ = -1;
    public int LJJ = -1;
    public int LJJI = -1;
    public EnumC585580Mxw LJJIJIL = EnumC585580Mxw.DEFAULT;

    public final String toString() {
        return "VideoPlayStopInfo(isSuccess=" + this.LIZ + ", errorCode=" + this.LIZIZ + ", playDuration=" + this.LIZJ + ", curCacheSize=" + this.LIZLLL + ", waitDuration=" + this.LJ + ", isSuperResolution=" + this.LJFF + ", srFailReason=" + this.LJII + ", traffic_economy_mode=" + this.LJIIIIZZ + ", buffering=" + this.LJIIIZ + ", networkLibType=" + this.LJIIJ + ", playSess=" + this.LJIIJJI + ", metricsInfo=" + this.LJIIL + ", requests=" + this.LJIILIIL + ", downloadInfos=" + this.LJIILJJIL + ", customMap=" + this.LJIIZILJ + ')';
    }

    public final void LIZIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LJIIZILJ.put((String) obj, obj2);
                }
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJIIZILJ.put(str, obj);
        }
    }
}
