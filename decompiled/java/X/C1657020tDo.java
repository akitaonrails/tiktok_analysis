package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657020tDo {
    public final AbstractC1656970tDj LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Effect LJ;
    public final boolean LJFF;
    public final C991780buq LJI;
    public final C375830EoP<Boolean> LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final C375830EoP<Integer> LJIIJJI;
    public final C375830EoP<Boolean> LJIIL;
    public final C375830EoP<Boolean> LJIILIIL;

    public C1657020tDo() {
        this(0);
    }

    public /* synthetic */ C1657020tDo(int i) {
        this(C1657010tDn.LIZ, 0, 0, "", null, false, null, null, null, null, null, null, null, null);
    }

    public C1657020tDo(AbstractC1656970tDj abstractC1656970tDj, int i, int i2, String str, Effect effect, boolean z, C991780buq c991780buq, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Unit> c375830EoP4, C375830EoP<Integer> c375830EoP5, C375830EoP<Boolean> c375830EoP6, C375830EoP<Boolean> c375830EoP7) {
        this.LIZ = abstractC1656970tDj;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = effect;
        this.LJFF = z;
        this.LJI = c991780buq;
        this.LJII = c375830EoP;
        this.LJIIIIZZ = c375830EoP2;
        this.LJIIIZ = c375830EoP3;
        this.LJIIJ = c375830EoP4;
        this.LJIIJJI = c375830EoP5;
        this.LJIIL = c375830EoP6;
        this.LJIILIIL = c375830EoP7;
    }

    public static C1657020tDo LIZ(C1657020tDo c1657020tDo, AbstractC1656970tDj abstractC1656970tDj, int i, int i2, String str, Effect effect, boolean z, C991780buq c991780buq, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, int i3) {
        C375830EoP c375830EoP8 = c375830EoP7;
        C375830EoP c375830EoP9 = c375830EoP6;
        C375830EoP c375830EoP10 = c375830EoP5;
        C375830EoP c375830EoP11 = c375830EoP4;
        C375830EoP c375830EoP12 = c375830EoP3;
        C375830EoP c375830EoP13 = c375830EoP2;
        C375830EoP c375830EoP14 = c375830EoP;
        C991780buq c991780buq2 = c991780buq;
        boolean z2 = z;
        Effect effect2 = effect;
        String str2 = str;
        int i4 = i2;
        int i5 = i;
        AbstractC1656970tDj abstractC1656970tDj2 = abstractC1656970tDj;
        if ((i3 & 1) != 0) {
            abstractC1656970tDj2 = c1657020tDo.LIZ;
        }
        if ((i3 & 2) != 0) {
            i5 = c1657020tDo.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i4 = c1657020tDo.LIZJ;
        }
        if ((i3 & 8) != 0) {
            str2 = c1657020tDo.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            effect2 = c1657020tDo.LJ;
        }
        if ((i3 & 32) != 0) {
            z2 = c1657020tDo.LJFF;
        }
        if ((i3 & 64) != 0) {
            c991780buq2 = c1657020tDo.LJI;
        }
        if ((i3 & 128) != 0) {
            c375830EoP14 = c1657020tDo.LJII;
        }
        if ((i3 & 256) != 0) {
            c375830EoP13 = c1657020tDo.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            c375830EoP12 = c1657020tDo.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            c375830EoP11 = c1657020tDo.LJIIJ;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP10 = c1657020tDo.LJIIJJI;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP9 = c1657020tDo.LJIIL;
        }
        if ((i3 & 8192) != 0) {
            c375830EoP8 = c1657020tDo.LJIILIIL;
        }
        c1657020tDo.getClass();
        return new C1657020tDo(abstractC1656970tDj2, i5, i4, str2, effect2, z2, c991780buq2, c375830EoP14, c375830EoP13, c375830EoP12, c375830EoP11, c375830EoP10, c375830EoP9, c375830EoP8);
    }
}
