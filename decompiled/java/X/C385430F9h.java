package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385430F9h {
    public final TextStickerModel LIZ;
    public final C0FHM LIZIZ;
    public final List<C385490F9n> LIZJ;
    public final C0FHM LIZLLL;
    public final C0FHM LJ;
    public final C0FHM LJFF;
    public final C0FHM LJI;
    public final C0FHM LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final C375830EoP<C0FAK> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final long LJIIJJI;

    public C385430F9h() {
        this(null, null, null, 0L, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385430F9h)) {
            return false;
        }
        C385430F9h c385430F9h = (C385430F9h) obj;
        return Intrinsics.LJFF(this.LIZ, c385430F9h.LIZ) && this.LIZIZ == c385430F9h.LIZIZ && Intrinsics.LJFF(this.LIZJ, c385430F9h.LIZJ) && this.LIZLLL == c385430F9h.LIZLLL && this.LJ == c385430F9h.LJ && this.LJFF == c385430F9h.LJFF && this.LJI == c385430F9h.LJI && this.LJII == c385430F9h.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c385430F9h.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c385430F9h.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c385430F9h.LJIIJ) && this.LJIIJJI == c385430F9h.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<C0FAK> c375830EoP2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJIIJ;
        return ((iHashCode3 + (c375830EoP3 != null ? c375830EoP3.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIJJI);
    }

    public final String toString() {
        return "EPTextEditPanelStates(textStickerModel=" + this.LIZ + ", editPanelUIState=" + this.LIZIZ + ", functionBarData=" + this.LIZJ + ", fontCategoryPagerUIState=" + this.LIZLLL + ", colorListUIState=" + this.LJ + ", styleCategoryPagerUIState=" + this.LJFF + ", motionCategoryPagerUIState=" + this.LJI + ", gestureGuideUIState=" + this.LJII + ", openKeyboard=" + this.LJIIIIZZ + ", closeKeyboard=" + this.LJIIIZ + ", applyDefaultTextFontIfNeed=" + this.LJIIJ + ", clickTime=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C385430F9h(TextStickerModel textStickerModel, C0FHM c0fhm, List list, long j, int i) {
        C0FHM c0fhm2;
        C0FHM c0fhm3;
        C0FHM c0fhm4;
        C0FHM c0fhm5;
        C0FHM c0fhm6;
        long j2 = j;
        List list2 = list;
        C0FHM c0fhm7 = c0fhm;
        TextStickerModel textStickerModel2 = (i & 1) != 0 ? new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null) : textStickerModel;
        c0fhm7 = (i & 2) != 0 ? C0FHM.GONE : c0fhm7;
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 8) != 0) {
            c0fhm2 = C0FHM.GONE;
        } else {
            c0fhm2 = null;
        }
        if ((i & 16) != 0) {
            c0fhm3 = C0FHM.GONE;
        } else {
            c0fhm3 = null;
        }
        if ((i & 32) != 0) {
            c0fhm4 = C0FHM.GONE;
        } else {
            c0fhm4 = null;
        }
        if ((i & 64) != 0) {
            c0fhm5 = C0FHM.GONE;
        } else {
            c0fhm5 = null;
        }
        if ((i & 128) != 0) {
            c0fhm6 = C0FHM.GONE;
        } else {
            c0fhm6 = null;
        }
        this(textStickerModel2, c0fhm7, list2, c0fhm2, c0fhm3, c0fhm4, c0fhm5, c0fhm6, null, null, null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j2);
    }

    public C385430F9h(TextStickerModel textStickerModel, C0FHM c0fhm, List<C385490F9n> list, C0FHM c0fhm2, C0FHM c0fhm3, C0FHM c0fhm4, C0FHM c0fhm5, C0FHM c0fhm6, C375830EoP<Unit> c375830EoP, C375830EoP<C0FAK> c375830EoP2, C375830EoP<Unit> c375830EoP3, long j) {
        this.LIZ = textStickerModel;
        this.LIZIZ = c0fhm;
        this.LIZJ = list;
        this.LIZLLL = c0fhm2;
        this.LJ = c0fhm3;
        this.LJFF = c0fhm4;
        this.LJI = c0fhm5;
        this.LJII = c0fhm6;
        this.LJIIIIZZ = c375830EoP;
        this.LJIIIZ = c375830EoP2;
        this.LJIIJ = c375830EoP3;
        this.LJIIJJI = j;
    }

    public static C385430F9h LIZ(C385430F9h c385430F9h, TextStickerModel textStickerModel, C0FHM c0fhm, List list, C0FHM c0fhm2, C0FHM c0fhm3, C0FHM c0fhm4, C0FHM c0fhm5, C0FHM c0fhm6, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, long j, int i) {
        long j2 = j;
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        C0FHM c0fhm7 = c0fhm6;
        C0FHM c0fhm8 = c0fhm5;
        C0FHM c0fhm9 = c0fhm4;
        C0FHM c0fhm10 = c0fhm3;
        C0FHM c0fhm11 = c0fhm2;
        List list2 = list;
        C0FHM c0fhm12 = c0fhm;
        TextStickerModel textStickerModel2 = textStickerModel;
        if ((i & 1) != 0) {
            textStickerModel2 = c385430F9h.LIZ;
        }
        if ((i & 2) != 0) {
            c0fhm12 = c385430F9h.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c385430F9h.LIZJ;
        }
        if ((i & 8) != 0) {
            c0fhm11 = c385430F9h.LIZLLL;
        }
        if ((i & 16) != 0) {
            c0fhm10 = c385430F9h.LJ;
        }
        if ((i & 32) != 0) {
            c0fhm9 = c385430F9h.LJFF;
        }
        if ((i & 64) != 0) {
            c0fhm8 = c385430F9h.LJI;
        }
        if ((i & 128) != 0) {
            c0fhm7 = c385430F9h.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP6 = c385430F9h.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP5 = c385430F9h.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP4 = c385430F9h.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j2 = c385430F9h.LJIIJJI;
        }
        c385430F9h.getClass();
        return new C385430F9h(textStickerModel2, c0fhm12, list2, c0fhm11, c0fhm10, c0fhm9, c0fhm8, c0fhm7, c375830EoP6, c375830EoP5, c375830EoP4, j2);
    }
}
