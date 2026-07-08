package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.15JK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JK {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public int LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public ArrayList<String> LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public final boolean LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;

    public static C15JK LIZ(C15JK c15jk, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, ArrayList arrayList, boolean z2, String str10, String str11, String str12, int i) {
        String str13;
        String str14;
        boolean z3;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Integer num;
        String str20;
        int i2;
        boolean z4;
        int i3;
        String str21 = str12;
        String str22 = str11;
        boolean z5 = z2;
        ArrayList arrayList2 = arrayList;
        String str23 = str6;
        boolean z6 = z;
        String str24 = str7;
        String str25 = str8;
        String str26 = str10;
        String str27 = str5;
        String str28 = str4;
        String str29 = str9;
        String str30 = str3;
        String str31 = str2;
        String str32 = str;
        if ((i & 1) != 0) {
            str32 = c15jk.LIZ;
        }
        if ((i & 2) != 0) {
            str31 = c15jk.LIZIZ;
        }
        if ((i & 4) != 0) {
            str30 = c15jk.LIZJ;
        }
        if ((i & 8) != 0) {
            str28 = c15jk.LIZLLL;
        }
        if ((i & 16) != 0) {
            str27 = c15jk.LJ;
        }
        if ((i & 32) != 0) {
            str13 = c15jk.LJFF;
        } else {
            str13 = null;
        }
        if ((i & 64) != 0) {
            str14 = c15jk.LJI;
        } else {
            str14 = null;
        }
        if ((i & 128) != 0) {
            z3 = c15jk.LJII;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            str15 = c15jk.LJIIIIZZ;
        } else {
            str15 = null;
        }
        if ((i & 512) != 0) {
            str16 = c15jk.LJIIIZ;
        } else {
            str16 = null;
        }
        if ((i & 1024) != 0) {
            str17 = c15jk.LJIIJ;
        } else {
            str17 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str18 = c15jk.LJIIJJI;
        } else {
            str18 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str19 = c15jk.LJIIL;
        } else {
            str19 = null;
        }
        if ((i & 8192) != 0) {
            str23 = c15jk.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            num = c15jk.LJIILJJIL;
        } else {
            num = null;
        }
        if ((32768 & i) != 0) {
            str24 = c15jk.LJIILL;
        }
        if ((65536 & i) != 0) {
            str25 = c15jk.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            str20 = c15jk.LJIIZILJ;
        } else {
            str20 = null;
        }
        if ((262144 & i) != 0) {
            i2 = c15jk.LJIJ;
        } else {
            i2 = 0;
        }
        if ((524288 & i) != 0) {
            z6 = c15jk.LJIJI;
        }
        if ((1048576 & i) != 0) {
            str29 = c15jk.LJIJJ;
        }
        if ((2097152 & i) != 0) {
            arrayList2 = c15jk.LJIJJLI;
        }
        if ((4194304 & i) != 0) {
            z4 = c15jk.LJIL;
        } else {
            z4 = false;
        }
        if ((8388608 & i) != 0) {
            i3 = c15jk.LJJ;
        } else {
            i3 = 0;
        }
        if ((16777216 & i) != 0) {
            z5 = c15jk.LJJI;
        }
        if ((33554432 & i) != 0) {
            str26 = c15jk.LJJIFFI;
        }
        if ((67108864 & i) != 0) {
            str22 = c15jk.LJJII;
        }
        if ((i & 134217728) != 0) {
            str21 = c15jk.LJJIII;
        }
        c15jk.getClass();
        boolean z7 = z5;
        String str33 = str26;
        String str34 = str22;
        String str35 = str21;
        return new C15JK(str32, str31, str30, str28, str27, str13, str14, z3, str15, str16, str17, str18, str19, str23, num, str24, str25, str20, i2, z6, str29, arrayList2, z4, i3, z7, str33, str34, str35);
    }

    public /* synthetic */ C15JK(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, int i, boolean z2, String str17, ArrayList arrayList, String str18, String str19, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str11, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str12, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : num, (32768 & i2) != 0 ? null : str14, (65536 & i2) != 0 ? null : str15, (131072 & i2) != 0 ? CardStruct.IStatusCode.DEFAULT : str16, (262144 & i2) != 0 ? 0 : i, (524288 & i2) != 0 ? true : z2, (1048576 & i2) != 0 ? "" : str17, (2097152 & i2) != 0 ? null : arrayList, false, 0, false, (33554432 & i2) != 0 ? "" : null, (67108864 & i2) != 0 ? "" : str18, (i2 & 134217728) == 0 ? str19 : "");
    }

    public C15JK(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, int i, boolean z2, String str17, ArrayList<String> arrayList, boolean z3, int i2, boolean z4, String str18, String str19, String str20) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = z;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = str12;
        this.LJIILIIL = str13;
        this.LJIILJJIL = num;
        this.LJIILL = str14;
        this.LJIILLIIL = str15;
        this.LJIIZILJ = str16;
        this.LJIJ = i;
        this.LJIJI = z2;
        this.LJIJJ = str17;
        this.LJIJJLI = arrayList;
        this.LJIL = z3;
        this.LJJ = i2;
        this.LJJI = z4;
        this.LJJIFFI = str18;
        this.LJJII = str19;
        this.LJJIII = str20;
    }
}
