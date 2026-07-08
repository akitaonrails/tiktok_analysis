package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.Set;

/* JADX INFO: renamed from: X.0mzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417310mzB {
    public final C0MJ9 LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final String LIZLLL;
    public AVMusic LJ;
    public String LJFF;
    public long LJI;
    public NLEModel LJII;
    public VecMeta LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Set<String> LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public Boolean LJIJJLI;
    public String LJIL;
    public final boolean LJJ;

    public final boolean LIZ() {
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(this.LIZJ);
        Boolean bool = this.LJIJJLI;
        String musicId = this.LJIJJ;
        if (musicId == null) {
            AVMusic aVMusic = this.LJ;
            musicId = aVMusic != null ? aVMusic.getMusicId() : null;
        }
        return C0LCZ.LIZ(enumC1412640mreLIZJ, bool, musicId, this.LJIJI);
    }

    public final boolean LIZIZ() {
        boolean z = false;
        if (this.LIZJ == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            return LIZJ(true, false);
        }
        if (LIZ() || (this.LIZJ != EnumC1412640mre.CUT_SAME.getValue() && this.LIZJ != EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue())) {
            z = true;
        }
        return LIZJ(z, true);
    }

    public final boolean LIZLLL() {
        return this.LIZIZ >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoCutData(musicLogId=");
        sb.append(this.LJIILJJIL);
        sb.append(", nleLogId=");
        sb.append(this.LJIILL);
        sb.append(", templateType=");
        sb.append(this.LIZJ);
        sb.append(", templateId=");
        sb.append(this.LJIIIZ);
        sb.append(", templateUrl=");
        sb.append(this.LJIILLIIL);
        sb.append(", source=");
        sb.append(this.LIZ);
        sb.append(", indexFromSource=");
        sb.append(this.LIZIZ);
        sb.append(", avMusic = ");
        AVMusic aVMusic = this.LJ;
        sb.append(aVMusic != null ? aVMusic.musicName : null);
        sb.append(", musicPath = ");
        sb.append(this.LJFF);
        sb.append(", duration = ");
        sb.append(this.LJI);
        sb.append(", nleModel = ");
        C1417710mzp c1417710mzp = C1417710mzp.LIZ;
        NLEModel nLEModel = this.LJII;
        c1417710mzp.getClass();
        sb.append(C1417710mzp.LJII(nLEModel));
        sb.append(", templateGroupId = ");
        sb.append(this.LJIIJ);
        sb.append(", templateTag = ");
        sb.append(this.LJIIJJI);
        sb.append(", preloadUrsSet=");
        sb.append(this.LJIILIIL);
        return sb.toString();
    }

    public final boolean LIZJ(boolean z, boolean z2) {
        String str;
        if (!LIZLLL()) {
            return false;
        }
        if (z && (this.LJ == null || (str = this.LJFF) == null || str.length() <= 0)) {
            return false;
        }
        if (z2 && this.LJII == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1417310mzB(C0MJ9 c0mj9, int i, int i2, String str, AVMusic aVMusic, String str2, NLEModel nLEModel, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, boolean z, int i3) {
        long j;
        boolean z2 = z;
        String str10 = str9;
        String str11 = str8;
        String str12 = str7;
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        NLEModel nLEModel2 = nLEModel;
        String str16 = str2;
        AVMusic aVMusic2 = aVMusic;
        String str17 = str;
        String str18 = str6;
        int value = i2;
        int i4 = (i3 & 2) != 0 ? 0 : i;
        value = (i3 & 4) != 0 ? EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue() : value;
        str17 = (i3 & 8) != 0 ? null : str17;
        aVMusic2 = (i3 & 16) != 0 ? null : aVMusic2;
        str16 = (i3 & 32) != 0 ? null : str16;
        if ((i3 & 64) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(c0mj9, i4, value, str17, aVMusic2, str16, j, (i3 & 128) != 0 ? null : nLEModel2, null, (i3 & 512) != 0 ? null : str15, (i3 & 1024) != 0 ? null : str14, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str13, null, null, null, (32768 & i3) != 0 ? null : str18, (65536 & i3) != 0 ? null : str12, null, null, (524288 & i3) != 0 ? null : str11, (1048576 & i3) != 0 ? null : str10, (2097152 & i3) == 0 ? bool : null, null, (i3 & 8388608) != 0 ? false : z2);
    }

    public C1417310mzB(C0MJ9 c0mj9, int i, int i2, String str, AVMusic aVMusic, String str2, long j, NLEModel nLEModel, VecMeta vecMeta, String str3, String str4, String str5, String str6, Set<String> set, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, boolean z) {
        this.LIZ = c0mj9;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = aVMusic;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = nLEModel;
        this.LJIIIIZZ = vecMeta;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = str5;
        this.LJIIL = str6;
        this.LJIILIIL = set;
        this.LJIILJJIL = str7;
        this.LJIILL = str8;
        this.LJIILLIIL = str9;
        this.LJIIZILJ = str10;
        this.LJIJ = str11;
        this.LJIJI = str12;
        this.LJIJJ = str13;
        this.LJIJJLI = bool;
        this.LJIL = str14;
        this.LJJ = z;
    }
}
