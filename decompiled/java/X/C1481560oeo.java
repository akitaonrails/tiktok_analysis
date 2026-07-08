package X;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oeo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481560oeo {
    public long LIZJ;
    public String LJIIL;
    public String LJIILIIL;
    public float LJIILJJIL;
    public String LJIJJ;
    public String LJJIFFI;
    public String LJJIIJZLJL;
    public String LJJIJIIJI;
    public String LJJIJLIJ;
    public String LJJJI;
    public boolean LJJJIL;
    public String LJJJJI;
    public JSONObject LJJJJIZL;
    public int LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public String LIZ = "";
    public String LIZIZ = "";
    public Float LIZLLL = Float.valueOf(1.0f);
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = 2;
    public int LJIJ = -1;
    public long LJIJI = -1;
    public int LJIJJLI = -1;
    public String LJIL = "";
    public int LJJ = -1;
    public int LJJI = -1;
    public int LJJII = -1;
    public int LJJIII = -1;
    public int LJJIIJ = -1;
    public int LJJIIZ = -1;
    public int LJJIIZI = -1;
    public int LJJIJ = -1;
    public int LJJIJIIJIL = -1;
    public final int LJJIJIL = -1;
    public final int LJJIJL = -1;
    public int LJJIL = -1;
    public int LJJIZ = -1;
    public int LJJJ = -1;
    public final HashMap<String, Object> LJJJJ = new HashMap<>();

    public final String toString() {
        return "VideoFirstFrameInfo(groupId=" + this.LIZ + ", videoSize=" + this.LIZJ + ", duration=" + this.LJ + ", videoBitrate=" + this.LJFF + ",preloadBitrate=" + this.LJII + ",isSameBitrate=" + this.LJIIIIZZ + ", internetSpeed=" + this.LJIIIZ + ", videoQuality=" + this.LJIIJ + ", bitrateSet=" + this.LJIIL + ", bitrateValues=" + this.LJIILIIL + ", vduration=" + this.LJIILJJIL + ", playBitrate=" + this.LJIILL + ", isSurfaceview=" + this.LJIILLIIL + ", preloaderType=" + this.LJIIZILJ + ", calcBitrate=" + this.LJIJ + ", timeCostForSelectSDK=" + this.LJIJI + ", selectDiffStrForSDK=" + this.LJIJJ + ",  codecName=" + this.LJIJJLI + ", codecNameStr='" + this.LJIL + "', videoFps=" + this.LJJ + ", cpuRate=" + this.LJJI + ", access2=" + this.LJJIFFI + ", memUsage=0.0, preCacheSize=" + this.LJJII + ", preloadSpeedKBps=" + this.LJJIII + ", innerType=" + this.LJJIIJ + ", ptPredictL=" + this.LJJIIJZLJL + ", codecId=" + this.LJJIIZ + ", isBatterySaver=" + this.LJJIIZI + ", isBytevc1=" + this.LJJIJ + ", playSess=" + this.LJJIJIIJI + ", isSuperResolution=" + this.LJJIJIIJIL + ", isSuccess=" + this.LJJIJIL + ", status=" + this.LJJIJL + ", format=" + this.LJJIJLIJ + ", hadPrepare=" + this.LJJIL + ", isAsyncStartPlay=" + this.LJJJIL + ", customMap=" + this.LJJJJ + ",dimensionBitrateCurve=" + this.LJJJJI + ", usedBitrateCurve=" + this.LJJJI + ", qprf=" + this.LIZLLL + ", dimensionBitrateFilterResult=" + this.LJJJJIZL + ')';
    }

    public final void LIZIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LJJJJ.put((String) obj, obj2);
                }
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJJJJ.put(str, obj);
        }
    }
}
