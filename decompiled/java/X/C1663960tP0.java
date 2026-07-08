package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663960tP0 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C375830EoP<Unit> LJI;
    public final C375830EoP<Unit> LJII;
    public final List<AbstractC1663570tON> LJIIIIZZ;
    public final AbstractC1663570tON LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;

    public C1663960tP0() {
        this(0);
    }

    public C1663960tP0(int i) {
        this("vadTipsText", "vadTipsText", false, false, false, false, null, null, C13BV.INSTANCE, C1663320tNy.LIZ, "STATE_PREVIEW_EMPTY", -1, "STATE_VAD_PREVIEW_EMPTY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1663960tP0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, List<? extends AbstractC1663570tON> list, AbstractC1663570tON abstractC1663570tON, String str3, int i, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = c375830EoP;
        this.LJII = c375830EoP2;
        this.LJIIIIZZ = list;
        this.LJIIIZ = abstractC1663570tON;
        this.LJIIJ = str3;
        this.LJIIJJI = i;
        this.LJIIL = str4;
    }

    public static C1663960tP0 LIZ(C1663960tP0 c1663960tP0, String str, boolean z, boolean z2, boolean z3, boolean z4, C375830EoP c375830EoP, C375830EoP c375830EoP2, List list, AbstractC1663570tON abstractC1663570tON, String str2, int i, int i2) {
        String str3;
        int i3 = i;
        String str4 = str2;
        AbstractC1663570tON abstractC1663570tON2 = abstractC1663570tON;
        List list2 = list;
        C375830EoP c375830EoP3 = c375830EoP;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = z2;
        C375830EoP c375830EoP4 = c375830EoP2;
        String str5 = str;
        if ((i2 & 1) != 0) {
            str5 = c1663960tP0.LIZ;
        }
        String str6 = null;
        if ((i2 & 2) != 0) {
            str3 = c1663960tP0.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i2 & 4) != 0) {
            z7 = c1663960tP0.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z8 = c1663960tP0.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z6 = c1663960tP0.LJ;
        }
        if ((i2 & 32) != 0) {
            z5 = c1663960tP0.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP3 = c1663960tP0.LJI;
        }
        if ((i2 & 128) != 0) {
            c375830EoP4 = c1663960tP0.LJII;
        }
        if ((i2 & 256) != 0) {
            list2 = c1663960tP0.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            abstractC1663570tON2 = c1663960tP0.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            str4 = c1663960tP0.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = c1663960tP0.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = c1663960tP0.LJIIL;
        }
        c1663960tP0.getClass();
        return new C1663960tP0(str5, str3, z7, z8, z6, z5, c375830EoP3, c375830EoP4, list2, abstractC1663570tON2, str4, i3, str6);
    }
}
