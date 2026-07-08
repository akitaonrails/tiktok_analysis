package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.tasm.TemplateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647530PaZ {
    public final String LIZ;
    public C1537720q7O LIZIZ;
    public EnumC647870Pb7 LIZJ;
    public final C0PGG LIZLLL;
    public AbstractC1542100qES LJ;
    public volatile EnumC647670Pan LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile TemplateData LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final C0PGD LJIIJJI;
    public volatile Function0<Unit> LJIIL;
    public volatile boolean LJIILIIL;

    public C647530PaZ() {
        throw null;
    }

    public final String toString() {
        return "LiteLynxKiteViewCache(name=" + this.LIZ + ", liteKiteView=" + this.LIZIZ + ", preloadStatus=" + this.LIZJ + ", dataType=" + this.LIZLLL + ", loadCallback=" + this.LJ + ", loadStatus=" + this.LJFF + ", hasCallbackDone=" + this.LJI + ", hasPatchChunkUpdated=" + this.LJII + ", preTemplateData=" + this.LJIIIIZZ + ", bindLoadFinish=" + this.LJIIIZ + ", validPredictData=" + this.LJIIJ + ", sceneType=" + this.LJIIJJI + ", runtimeReadyCallback=" + this.LJIIL + ", isRuntimeReady=" + this.LJIILIIL + ')';
    }

    public C647530PaZ(String str, EnumC647870Pb7 enumC647870Pb7, C0PGG c0pgg, C0PGD c0pgd, int i) {
        EnumC647670Pan enumC647670Pan;
        if ((i & 32) != 0) {
            enumC647670Pan = EnumC647670Pan.INIT;
        } else {
            enumC647670Pan = null;
        }
        c0pgd = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C0PGD.FIRST_SCREEN : c0pgd;
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = enumC647870Pb7;
        this.LIZLLL = c0pgg;
        this.LJ = null;
        this.LJFF = enumC647670Pan;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIJJI = c0pgd;
        this.LJIIL = null;
        this.LJIILIIL = false;
    }
}
