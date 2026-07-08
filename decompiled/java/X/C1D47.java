package X;

import android.os.Handler;
import com.google.gson.n;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1D47, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D47 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public final n LJFF;
    public String LJI;
    public EnumC2249761D3u LJII;
    public C1D49 LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public StrategyConfig LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public EnumC2249781D3w LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public C1D46 LJJ;
    public final long LJJI;
    public final EnumC1283150jUn LJJIFFI;
    public String LJJII;
    public List<BitrateConfig> LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public Map<String, String> LJJIIZ;
    public Handler LJJIIZI;
    public int LJJIJ;

    public final int LIZJ() {
        C1D46 c1d46;
        EnumC2178851APb enumC2178851APb;
        C1D46 c1d462;
        EnumC2249951D4n enumC2249951D4n;
        EnumC1283150jUn enumC1283150jUn = this.LJJIFFI;
        if (enumC1283150jUn == EnumC1283150jUn.STAGE && (c1d462 = this.LJJ) != null && (enumC2249951D4n = c1d462.LIZ) != null) {
            return enumC2249951D4n.level();
        }
        if (enumC1283150jUn != EnumC1283150jUn.GAME || (c1d46 = this.LJJ) == null || (enumC2178851APb = c1d46.LIZLLL) == null) {
            return -2;
        }
        return enumC2178851APb.level();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r9 = this;
            long r3 = r9.LIZ
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L20
            long r5 = r9.LIZIZ
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L20
            long r1 = r9.LIZJ
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L20
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L20
            r0 = 1
        L1d:
            r9.LIZLLL = r0
            return
        L20:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D47.LIZLLL():void");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoQualityResult{maxBitrate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultBitrate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", flag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", strategyName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", debugMessage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", dslMessage='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", resultScene=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", bwProbeResult=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", degradationEnable=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", degradationTypeServer=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", strategyConfig=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", downgradeFromLevel=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", downgradeTypeSource='");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", manualLevelSource=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", desc='");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", name='");
        sbLIZ.append(this.LJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", videoQualityLevel=");
        sbLIZ.append(this.LJJ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(", gearIdentifier='");
        sbLIZ.append(this.LJJII);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1D47(int i, EnumC1283150jUn enumC1283150jUn) {
        this(-1L, -1L, -1L, i, enumC1283150jUn);
    }

    public final void LIZ(int i, String str) {
        this.LJFF.LJJIII(Integer.valueOf(i), str);
    }

    public final void LIZIZ(String str, String str2) {
        this.LJFF.LJJIIJ(str, str2);
    }

    public C1D47(long j, long j2, long j3, int i, EnumC1283150jUn enumC1283150jUn) {
        this.LJFF = new n();
        this.LJII = null;
        this.LJIIJ = -1;
        this.LJIIL = 0;
        this.LJIILIIL = "";
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = -1;
        this.LJJIFFI = EnumC1283150jUn.DEFAULT;
        this.LJJII = "";
        this.LJJIIJ = -1;
        this.LJJIIJZLJL = -1;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LJJ = new C1D46(i, enumC1283150jUn);
        this.LJJI = System.currentTimeMillis();
        this.LJJIFFI = enumC1283150jUn;
    }
}
