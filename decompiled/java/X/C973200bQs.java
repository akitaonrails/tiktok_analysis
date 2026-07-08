package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;

/* JADX INFO: renamed from: X.0bQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973200bQs {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;
    public final List<? extends List<String>> LJI;
    public final List<? extends List<String>> LJII;
    public final List<? extends List<String>> LJIIIIZZ;
    public final List<? extends List<String>> LJIIIZ;
    public final List<? extends List<String>> LJIIJ;
    public final List<? extends List<String>> LJIIJJI;
    public final boolean LJIIL;

    public C973200bQs() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, false, 16383);
    }

    public C973200bQs(String str, String str2, List list, List list2, List list3, boolean z, List list4, List list5, List list6, List list7, List list8, List list9, boolean z2, int i) {
        List list10 = list;
        List list11 = list2;
        List list12 = list3;
        boolean z3 = z;
        List list13 = list4;
        List list14 = list5;
        List list15 = list6;
        List list16 = list7;
        List list17 = list8;
        List list18 = list9;
        str = (i & 1) != 0 ? "" : str;
        String str3 = (i & 2) == 0 ? str2 : "";
        list10 = (i & 4) != 0 ? C13BV.INSTANCE : list10;
        list11 = (i & 8) != 0 ? C13BV.INSTANCE : list11;
        list12 = (i & 16) != 0 ? C13BV.INSTANCE : list12;
        z3 = (i & 64) != 0 ? false : z3;
        list13 = (i & 128) != 0 ? C13BV.INSTANCE : list13;
        list14 = (i & 256) != 0 ? C13BV.INSTANCE : list14;
        list15 = (i & 512) != 0 ? C13BV.INSTANCE : list15;
        list16 = (i & 1024) != 0 ? C13BV.INSTANCE : list16;
        list17 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list17;
        list18 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list18;
        boolean z4 = (i & 8192) == 0 ? z2 : false;
        this.LIZ = str;
        this.LIZIZ = str3;
        this.LIZJ = list10;
        this.LIZLLL = list11;
        this.LJ = list12;
        this.LJFF = z3;
        this.LJI = list13;
        this.LJII = list14;
        this.LJIIIIZZ = list15;
        this.LJIIIZ = list16;
        this.LJIIJ = list17;
        this.LJIIJJI = list18;
        this.LJIIL = z4;
    }
}
