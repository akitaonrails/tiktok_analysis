package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18S0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S0 {
    public final C1851240yH4 LIZ;
    public final AIGenerationType LIZIZ;
    public final C375830EoP<C1851240yH4> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final C18S1 LJFF;
    public final C375830EoP<C18RW> LJI;
    public final C375830EoP<C18RW> LJII;
    public final C375830EoP<C18RW> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C375830EoP<C1838890xx9> LJIIJ;
    public final C375830EoP<Boolean> LJIIJJI;

    public C18S0() {
        this(0);
    }

    public /* synthetic */ C18S0(int i) {
        this(new C1851240yH4(0), AIGenerationType.NONE, null, null, null, new C18S1(EnumC1749680vdG.CLOSE, 0), null, null, null, false, null, null);
    }

    public C18S0(C1851240yH4 c1851240yH4, AIGenerationType aIGenerationType, C375830EoP<C1851240yH4> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C18S1 c18s1, C375830EoP<C18RW> c375830EoP4, C375830EoP<C18RW> c375830EoP5, C375830EoP<C18RW> c375830EoP6, boolean z, C375830EoP<C1838890xx9> c375830EoP7, C375830EoP<Boolean> c375830EoP8) {
        this.LIZ = c1851240yH4;
        this.LIZIZ = aIGenerationType;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c18s1;
        this.LJI = c375830EoP4;
        this.LJII = c375830EoP5;
        this.LJIIIIZZ = c375830EoP6;
        this.LJIIIZ = z;
        this.LJIIJ = c375830EoP7;
        this.LJIIJJI = c375830EoP8;
    }

    public static C18S0 LIZ(C18S0 c18s0, C1851240yH4 c1851240yH4, AIGenerationType aIGenerationType, C375830EoP c375830EoP, C375830EoP c375830EoP2, C18S1 c18s1, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, int i) {
        C375830EoP<Unit> c375830EoP8;
        boolean z;
        C375830EoP c375830EoP9 = c375830EoP6;
        C375830EoP c375830EoP10 = c375830EoP5;
        C375830EoP c375830EoP11 = c375830EoP4;
        C375830EoP c375830EoP12 = c375830EoP3;
        C375830EoP c375830EoP13 = c375830EoP2;
        C375830EoP c375830EoP14 = c375830EoP;
        AIGenerationType aIGenerationType2 = aIGenerationType;
        C18S1 c18s12 = c18s1;
        C375830EoP c375830EoP15 = c375830EoP7;
        C1851240yH4 c1851240yH42 = c1851240yH4;
        if ((i & 1) != 0) {
            c1851240yH42 = c18s0.LIZ;
        }
        if ((i & 2) != 0) {
            aIGenerationType2 = c18s0.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP14 = c18s0.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP8 = c18s0.LIZLLL;
        } else {
            c375830EoP8 = null;
        }
        if ((i & 16) != 0) {
            c375830EoP13 = c18s0.LJ;
        }
        if ((i & 32) != 0) {
            c18s12 = c18s0.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP12 = c18s0.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP11 = c18s0.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP10 = c18s0.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z = c18s0.LJIIIZ;
        } else {
            z = false;
        }
        if ((i & 1024) != 0) {
            c375830EoP9 = c18s0.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP15 = c18s0.LJIIJJI;
        }
        c18s0.getClass();
        return new C18S0(c1851240yH42, aIGenerationType2, c375830EoP14, c375830EoP8, c375830EoP13, c18s12, c375830EoP12, c375830EoP11, c375830EoP10, z, c375830EoP9, c375830EoP15);
    }
}
