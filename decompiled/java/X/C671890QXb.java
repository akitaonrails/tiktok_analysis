package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0QXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671890QXb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public final C0QXI LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final Boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final String LJJI;
    public final C672540QZo LJJIFFI;
    public final EnumC672060QXs LJJII;
    public final EnumC672100QXw LJJIII;
    public boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final String LJJIIZ;
    public final String LJJIIZI;
    public final Aweme LJJIJ;
    public final String LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final Long LJJIJIL;
    public final Boolean LJJIJL;
    public final String LJJIJLIJ;
    public final Map<String, Object> LJJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C671890QXb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C0QXI c0qxi, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, C672540QZo c672540QZo, EnumC672060QXs enumC672060QXs, EnumC672100QXw enumC672100QXw, boolean z, String str20, String str21, String str22, Map map, int i2, int i3) {
        String value;
        String str23;
        Boolean bool;
        Map map2 = map;
        String str24 = str22;
        String str25 = str21;
        String str26 = str20;
        boolean z2 = z;
        String str27 = str5;
        EnumC672060QXs enumC672060QXs2 = enumC672060QXs;
        C672540QZo c672540QZo2 = c672540QZo;
        String str28 = str19;
        String str29 = str18;
        String str30 = str17;
        String str31 = str16;
        String str32 = str15;
        String str33 = str14;
        String str34 = str13;
        String str35 = str12;
        String str36 = str11;
        C0QXI c0qxi2 = c0qxi;
        EnumC672100QXw enumC672100QXw2 = enumC672100QXw;
        String str37 = str9;
        String str38 = str8;
        String str39 = str4;
        String value2 = str7;
        String str40 = str6;
        String str41 = str3;
        String str42 = str2;
        String str43 = str10;
        String str44 = (i2 & 1) != 0 ? null : str;
        str42 = (i2 & 2) != 0 ? null : str42;
        str41 = (i2 & 4) != 0 ? null : str41;
        str39 = (i2 & 8) != 0 ? null : str39;
        str27 = (i2 & 16) != 0 ? null : str27;
        str40 = (i2 & 32) != 0 ? null : str40;
        if ((i2 & 64) != 0) {
            value = EnumC672010QXn.SOURCE_MALL_MIDDLE.getValue();
        } else {
            value = null;
        }
        value2 = (i2 & 128) != 0 ? EnumC671980QXk.NONE.getValue() : value2;
        str38 = (i2 & 256) != 0 ? null : str38;
        c0qxi2 = (i2 & 512) != 0 ? null : c0qxi2;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str23 = "shop";
        } else {
            str23 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this(str44, str42, str41, str39, str27, str40, value, value2, str38, c0qxi2, i, str23, bool, (i2 & 8192) != 0 ? null : str37, (i2 & 16384) != 0 ? null : str43, (32768 & i2) != 0 ? null : str36, (65536 & i2) != 0 ? null : str35, (131072 & i2) != 0 ? null : str34, null, (524288 & i2) != 0 ? null : str33, (1048576 & i2) != 0 ? null : str32, (2097152 & i2) != 0 ? null : str31, (4194304 & i2) != 0 ? null : str30, (8388608 & i2) != 0 ? null : str29, (16777216 & i2) != 0 ? null : str28, (33554432 & i2) != 0 ? null : c672540QZo2, (67108864 & i2) != 0 ? EnumC672060QXs.FULL : enumC672060QXs2, (134217728 & i2) != 0 ? EnumC672100QXw.TTS : enumC672100QXw2, false, (536870912 & i2) != 0 ? false : z2, (1073741824 & i2) != 0 ? null : str26, (i2 & Integer.MIN_VALUE) != 0 ? null : str25, null, null, false, null, null, (i3 & 32) != 0 ? null : str24, (i3 & 64) != 0 ? null : map2);
    }

    public C671890QXb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C0QXI c0qxi, int i, String str10, Boolean bool, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, C672540QZo c672540QZo, EnumC672060QXs enumC672060QXs, EnumC672100QXw enumC672100QXw, boolean z, boolean z2, String str23, String str24, Aweme aweme, String str25, boolean z3, Long l, Boolean bool2, String str26, Map<String, Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = c0qxi;
        this.LJIIJ = i;
        this.LJIIJJI = str10;
        this.LJIIL = bool;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = str13;
        this.LJIILLIIL = str14;
        this.LJIIZILJ = str15;
        this.LJIJ = str16;
        this.LJIJI = str17;
        this.LJIJJ = str18;
        this.LJIJJLI = str19;
        this.LJIL = str20;
        this.LJJ = str21;
        this.LJJI = str22;
        this.LJJIFFI = c672540QZo;
        this.LJJII = enumC672060QXs;
        this.LJJIII = enumC672100QXw;
        this.LJJIIJ = z;
        this.LJJIIJZLJL = z2;
        this.LJJIIZ = str23;
        this.LJJIIZI = str24;
        this.LJJIJ = aweme;
        this.LJJIJIIJI = str25;
        this.LJJIJIIJIL = z3;
        this.LJJIJIL = l;
        this.LJJIJL = bool2;
        this.LJJIJLIJ = str26;
        this.LJJIL = map;
    }
}
