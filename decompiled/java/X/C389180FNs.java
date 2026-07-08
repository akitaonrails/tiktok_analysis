package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389180FNs {
    public final C375830EoP<Boolean> LIZ;
    public final C189200o6<Pair<List<ResourceItem>, Boolean>> LIZIZ;
    public final ResourceItem LIZJ;
    public final C375830EoP<C389140FNo> LIZLLL;
    public final boolean LJ;
    public final C375830EoP<C0FO2> LJFF;
    public final C375830EoP<AbstractC366540EYq> LJI;
    public final C375830EoP<Unit> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final C375830EoP<Unit> LJIIJJI;
    public final boolean LJIIL;
    public final EnumC366550EYr LJIILIIL;
    public final boolean LJIILJJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C389180FNs() {
        boolean z = false;
        this(z, z, z, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C389180FNs)) {
            return false;
        }
        C389180FNs c389180FNs = (C389180FNs) obj;
        return Intrinsics.LJFF(this.LIZ, c389180FNs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c389180FNs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c389180FNs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c389180FNs.LIZLLL) && this.LJ == c389180FNs.LJ && Intrinsics.LJFF(this.LJFF, c389180FNs.LJFF) && Intrinsics.LJFF(this.LJI, c389180FNs.LJI) && Intrinsics.LJFF(this.LJII, c389180FNs.LJII) && this.LJIIIIZZ == c389180FNs.LJIIIIZZ && this.LJIIIZ == c389180FNs.LJIIIZ && this.LJIIJ == c389180FNs.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c389180FNs.LJIIJJI) && this.LJIIL == c389180FNs.LJIIL && this.LJIILIIL == c389180FNs.LJIILIIL && this.LJIILJJIL == c389180FNs.LJIILJJIL;
    }

    public final int hashCode() {
        C375830EoP<Boolean> c375830EoP = this.LIZ;
        int iHashCode = (c375830EoP == null ? 0 : c375830EoP.hashCode()) * 31;
        C189200o6<Pair<List<ResourceItem>, Boolean>> c189200o6 = this.LIZIZ;
        int iM6hashCodeimpl = (iHashCode + (c189200o6 == null ? 0 : C189200o6.m6hashCodeimpl(c189200o6.m10unboximpl()))) * 31;
        ResourceItem resourceItem = this.LIZJ;
        int iHashCode2 = (iM6hashCodeimpl + (resourceItem == null ? 0 : resourceItem.hashCode())) * 31;
        C375830EoP<C389140FNo> c375830EoP2 = this.LIZLLL;
        int iHashCode3 = (((((iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        C375830EoP<AbstractC366540EYq> c375830EoP3 = this.LJI;
        int iHashCode4 = (iHashCode3 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP4 = this.LJII;
        int iHashCode5 = (((((((iHashCode4 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        C375830EoP<Unit> c375830EoP5 = this.LJIIJJI;
        int iHashCode6 = (((iHashCode5 + (c375830EoP5 == null ? 0 : c375830EoP5.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31;
        EnumC366550EYr enumC366550EYr = this.LJIILIIL;
        return ((iHashCode6 + (enumC366550EYr != null ? enumC366550EYr.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILJJIL);
    }

    public final String toString() {
        return "LyricStickerEffectState(isVisible=" + this.LIZ + ", dataList=" + this.LIZIZ + ", selectedEffect=" + this.LIZJ + ", resItemLoadStateChangeEvent=" + this.LIZLLL + ", needTrim=" + this.LJ + ", loadingState=" + this.LJFF + ", itemDownloadState=" + this.LJI + ", clearEffect=" + this.LJII + ", canDeSelect=" + this.LJIIIIZZ + ", autoApplyFirstItemEnabled=" + this.LJIIIZ + ", autoApplyFirstItemConsumed=" + this.LJIIJ + ", applyLyricsFailedToastEvent=" + this.LJIIJJI + ", hasTitle=" + this.LJIIL + ", enterSource=" + this.LJIILIIL + ", isEditorPro=" + this.LJIILJJIL + ')';
    }

    public /* synthetic */ C389180FNs(boolean z, boolean z2, boolean z3, int i) {
        C375830EoP c375830EoP;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 32) != 0) {
            c375830EoP = new C375830EoP(C0FO2.IDLE);
        } else {
            c375830EoP = null;
        }
        this(null, null, null, null, false, c375830EoP, null, null, (i & 256) != 0 ? false : z6, false, false, null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z5, null, (i & 16384) != 0 ? false : z4);
    }

    public static C389180FNs LIZ(C389180FNs c389180FNs, C375830EoP c375830EoP, C189200o6 c189200o6, ResourceItem resourceItem, C375830EoP c375830EoP2, boolean z, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, boolean z2, boolean z3, C375830EoP c375830EoP6, EnumC366550EYr enumC366550EYr, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        EnumC366550EYr enumC366550EYr2 = enumC366550EYr;
        boolean z7 = z3;
        boolean z8 = z2;
        C375830EoP c375830EoP7 = c375830EoP5;
        C375830EoP c375830EoP8 = c375830EoP4;
        C375830EoP c375830EoP9 = c375830EoP3;
        boolean z9 = z;
        C375830EoP c375830EoP10 = c375830EoP2;
        ResourceItem resourceItem2 = resourceItem;
        C189200o6 c189200o62 = c189200o6;
        C375830EoP c375830EoP11 = c375830EoP6;
        C375830EoP c375830EoP12 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP12 = c389180FNs.LIZ;
        }
        if ((i & 2) != 0) {
            c189200o62 = c389180FNs.LIZIZ;
        }
        if ((i & 4) != 0) {
            resourceItem2 = c389180FNs.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP10 = c389180FNs.LIZLLL;
        }
        if ((i & 16) != 0) {
            z9 = c389180FNs.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP9 = c389180FNs.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP8 = c389180FNs.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP7 = c389180FNs.LJII;
        }
        if ((i & 256) != 0) {
            z4 = c389180FNs.LJIIIIZZ;
        } else {
            z4 = false;
        }
        if ((i & 512) != 0) {
            z8 = c389180FNs.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            z7 = c389180FNs.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP11 = c389180FNs.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = c389180FNs.LJIIL;
        } else {
            z5 = false;
        }
        if ((i & 8192) != 0) {
            enumC366550EYr2 = c389180FNs.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            z6 = c389180FNs.LJIILJJIL;
        } else {
            z6 = false;
        }
        c389180FNs.getClass();
        return new C389180FNs(c375830EoP12, c189200o62, resourceItem2, c375830EoP10, z9, c375830EoP9, c375830EoP8, c375830EoP7, z4, z8, z7, c375830EoP11, z5, enumC366550EYr2, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C389180FNs(C375830EoP<Boolean> c375830EoP, C189200o6<? extends Pair<? extends List<? extends ResourceItem>, Boolean>> c189200o6, ResourceItem resourceItem, C375830EoP<C389140FNo> c375830EoP2, boolean z, C375830EoP<C0FO2> c375830EoP3, C375830EoP<AbstractC366540EYq> c375830EoP4, C375830EoP<Unit> c375830EoP5, boolean z2, boolean z3, boolean z4, C375830EoP<Unit> c375830EoP6, boolean z5, EnumC366550EYr enumC366550EYr, boolean z6) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c189200o6;
        this.LIZJ = resourceItem;
        this.LIZLLL = c375830EoP2;
        this.LJ = z;
        this.LJFF = c375830EoP3;
        this.LJI = c375830EoP4;
        this.LJII = c375830EoP5;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = c375830EoP6;
        this.LJIIL = z5;
        this.LJIILIIL = enumC366550EYr;
        this.LJIILJJIL = z6;
    }
}
