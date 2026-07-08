package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414880mvG {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Function0<Object> LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;
    public final List<FromAssetInfo> LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final List<Integer> LJIIL;
    public final C1414820mvA LJIILIIL;
    public final List<Integer> LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final Function0<C2268608ui> LJIJJLI;
    public final boolean LJIL;
    public final String LJJ;
    public final String LJJI;
    public final String LJJIFFI;

    public static C1414880mvG LIZ(C1414880mvG c1414880mvG, int i, int i2, boolean z, int i3) {
        boolean z2;
        boolean z3;
        Function0<Object> function0;
        String str;
        String str2;
        Integer num;
        List<FromAssetInfo> list;
        String str3;
        String str4;
        boolean z4;
        List<Integer> list2;
        C1414820mvA c1414820mvA;
        List<Integer> list3;
        boolean z5;
        boolean z6;
        String str5;
        String str6;
        String str7;
        Function0<C2268608ui> function02;
        boolean z7;
        String str8;
        String str9;
        boolean z8 = z;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c1414880mvG.LIZ;
        }
        if ((i3 & 2) != 0) {
            i4 = c1414880mvG.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z2 = c1414880mvG.LIZJ;
        } else {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            z3 = c1414880mvG.LIZLLL;
        } else {
            z3 = false;
        }
        String str10 = null;
        if ((i3 & 16) != 0) {
            function0 = c1414880mvG.LJ;
        } else {
            function0 = null;
        }
        if ((i3 & 32) != 0) {
            str = c1414880mvG.LJFF;
        } else {
            str = null;
        }
        if ((i3 & 64) != 0) {
            str2 = c1414880mvG.LJI;
        } else {
            str2 = null;
        }
        if ((i3 & 128) != 0) {
            num = c1414880mvG.LJII;
        } else {
            num = null;
        }
        if ((i3 & 256) != 0) {
            list = c1414880mvG.LJIIIIZZ;
        } else {
            list = null;
        }
        if ((i3 & 512) != 0) {
            str3 = c1414880mvG.LJIIIZ;
        } else {
            str3 = null;
        }
        if ((i3 & 1024) != 0) {
            str4 = c1414880mvG.LJIIJ;
        } else {
            str4 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = c1414880mvG.LJIIJJI;
        } else {
            z4 = false;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            list2 = c1414880mvG.LJIIL;
        } else {
            list2 = null;
        }
        if ((i3 & 8192) != 0) {
            c1414820mvA = c1414880mvG.LJIILIIL;
        } else {
            c1414820mvA = null;
        }
        if ((i3 & 16384) != 0) {
            list3 = c1414880mvG.LJIILJJIL;
        } else {
            list3 = null;
        }
        if ((32768 & i3) != 0) {
            z5 = c1414880mvG.LJIILL;
        } else {
            z5 = false;
        }
        if ((65536 & i3) != 0) {
            z8 = c1414880mvG.LJIILLIIL;
        }
        if ((131072 & i3) != 0) {
            z6 = c1414880mvG.LJIIZILJ;
        } else {
            z6 = false;
        }
        if ((262144 & i3) != 0) {
            str5 = c1414880mvG.LJIJ;
        } else {
            str5 = null;
        }
        if ((524288 & i3) != 0) {
            str6 = c1414880mvG.LJIJI;
        } else {
            str6 = null;
        }
        if ((1048576 & i3) != 0) {
            str7 = c1414880mvG.LJIJJ;
        } else {
            str7 = null;
        }
        if ((2097152 & i3) != 0) {
            function02 = c1414880mvG.LJIJJLI;
        } else {
            function02 = null;
        }
        if ((4194304 & i3) != 0) {
            z7 = c1414880mvG.LJIL;
        } else {
            z7 = false;
        }
        if ((8388608 & i3) != 0) {
            str8 = c1414880mvG.LJJ;
        } else {
            str8 = null;
        }
        if ((16777216 & i3) != 0) {
            str9 = c1414880mvG.LJJI;
        } else {
            str9 = null;
        }
        if ((i3 & 33554432) != 0) {
            str10 = c1414880mvG.LJJIFFI;
        }
        c1414880mvG.getClass();
        return new C1414880mvG(i5, i4, z2, z3, (Function0<? extends Object>) function0, str, str2, num, list, str3, str4, z4, list2, c1414820mvA, list3, z5, z8, z6, str5, str6, str7, function02, z7, str8, str9, str10);
    }

    public /* synthetic */ C1414880mvG(int i, int i2, boolean z, Function0 function0, String str, String str2, Integer num, List list, String str3, String str4, boolean z2, List list2, C1414820mvA c1414820mvA, List list3, boolean z3, boolean z4, boolean z5, String str5, String str6, String str7, Function0 function02, boolean z6, String str8, String str9, String str10, int i3) {
        this(i, i2, false, z, (Function0<? extends Object>) function0, str, str2, (i3 & 128) != 0 ? null : num, (List<FromAssetInfo>) ((i3 & 256) != 0 ? null : list), str3, str4, z2, (List<Integer>) list2, c1414820mvA, (List<Integer>) ((i3 & 16384) != 0 ? null : list3), (32768 & i3) != 0 ? false : z3, (65536 & i3) != 0 ? false : z4, (131072 & i3) != 0 ? false : z5, (262144 & i3) != 0 ? EnumC1414610mup.EDITING_ASSETS.getValue() : str5, (524288 & i3) != 0 ? PromptType.NONE.getMobTag() : str6, (1048576 & i3) != 0 ? "editing_assets" : str7, (Function0<C2268608ui>) ((2097152 & i3) != 0 ? null : function02), (4194304 & i3) != 0 ? false : z6, (8388608 & i3) == 0 ? str8 : null, (16777216 & i3) != 0 ? "" : str9, (i3 & 33554432) == 0 ? str10 : "");
    }

    public C1414880mvG(int i, int i2, boolean z, boolean z2, Function0<? extends Object> function0, String str, String str2, Integer num, List<FromAssetInfo> list, String str3, String str4, boolean z3, List<Integer> list2, C1414820mvA c1414820mvA, List<Integer> list3, boolean z4, boolean z5, boolean z6, String str5, String str6, String str7, Function0<C2268608ui> function02, boolean z7, String str8, String str9, String str10) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = function0;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = num;
        this.LJIIIIZZ = list;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = z3;
        this.LJIIL = list2;
        this.LJIILIIL = c1414820mvA;
        this.LJIILJJIL = list3;
        this.LJIILL = z4;
        this.LJIILLIIL = z5;
        this.LJIIZILJ = z6;
        this.LJIJ = str5;
        this.LJIJI = str6;
        this.LJIJJ = str7;
        this.LJIJJLI = function02;
        this.LJIL = z7;
        this.LJJ = str8;
        this.LJJI = str9;
        this.LJJIFFI = str10;
    }
}
