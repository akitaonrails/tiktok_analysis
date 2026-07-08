package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Erd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377830Erd {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC378720Et4 LIZJ;
    public final EnumC378320EsQ LIZLLL;
    public final C375830EoP<List<EditorProAIGCMediaItemModel>> LJ;
    public final EditorProAIGCMediaItemModel LJFF;
    public final C375830EoP<Boolean> LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final Integer LJIILIIL;
    public final Integer LJIILJJIL;
    public final Integer LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377830Erd)) {
            return false;
        }
        C377830Erd c377830Erd = (C377830Erd) obj;
        return this.LIZ == c377830Erd.LIZ && this.LIZIZ == c377830Erd.LIZIZ && this.LIZJ == c377830Erd.LIZJ && this.LIZLLL == c377830Erd.LIZLLL && Intrinsics.LJFF(this.LJ, c377830Erd.LJ) && Intrinsics.LJFF(this.LJFF, c377830Erd.LJFF) && Intrinsics.LJFF(this.LJI, c377830Erd.LJI) && Intrinsics.LJFF(this.LJII, c377830Erd.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c377830Erd.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c377830Erd.LJIIIZ) && this.LJIIJ == c377830Erd.LJIIJ && this.LJIIJJI == c377830Erd.LJIIJJI && this.LJIIL == c377830Erd.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c377830Erd.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c377830Erd.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c377830Erd.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c377830Erd.LJIILLIIL) && this.LJIIZILJ == c377830Erd.LJIIZILJ;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = this.LJ;
        int iHashCode = (iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = this.LJFF;
        int iHashCode2 = (iHashCode + (editorProAIGCMediaItemModel == null ? 0 : editorProAIGCMediaItemModel.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        Integer num = this.LJII;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJIIIZ;
        int iHashCode6 = (((((((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31;
        Integer num4 = this.LJIILIIL;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJIILJJIL;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LJIILL;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.LJIILLIIL;
        return ((iHashCode9 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIZILJ);
    }

    public final String toString() {
        return "EditorProAIGCResultsPanelStates(isVideoAndImage=" + this.LIZ + ", openByPanelService=" + this.LIZIZ + ", panelUIType=" + this.LIZJ + ", panelUIState=" + this.LIZLLL + ", panelItems=" + this.LJ + ", selectedPanelItem=" + this.LJFF + ", showLoading=" + this.LJI + ", quota=" + this.LJII + ", quotaImage=" + this.LJIIIIZZ + ", quotaMaximumImage=" + this.LJIIIZ + ", lastImageQuota=" + this.LJIIJ + ", lastVideoQuota=" + this.LJIIJJI + ", lastAITransitionQuota=" + this.LJIIL + ", quotaVideo=" + this.LJIILIIL + ", quotaAITransition=" + this.LJIILJJIL + ", quotaMaximumVideo=" + this.LJIILL + ", currentSlotId=" + this.LJIILLIIL + ", isTNSError=" + this.LJIIZILJ + ')';
    }

    public /* synthetic */ C377830Erd(boolean z) {
        this(false, z, EnumC378720Et4.NONE, EnumC378320EsQ.NONE, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, false);
    }

    public static C377830Erd LIZ(C377830Erd c377830Erd, boolean z, EnumC378720Et4 enumC378720Et4, EnumC378320EsQ enumC378320EsQ, C375830EoP c375830EoP, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, boolean z2, int i) {
        boolean z3;
        C375830EoP<Boolean> c375830EoP2;
        int i2;
        int i3;
        int i4;
        boolean z4 = z2;
        String str2 = str;
        Integer num7 = num3;
        boolean z5 = z;
        Integer num8 = num6;
        Integer num9 = num2;
        Integer num10 = num;
        C375830EoP c375830EoP3 = c375830EoP;
        Integer num11 = num5;
        EnumC378320EsQ enumC378320EsQ2 = enumC378320EsQ;
        Integer num12 = num4;
        EnumC378720Et4 enumC378720Et42 = enumC378720Et4;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = editorProAIGCMediaItemModel;
        if ((i & 1) != 0) {
            z5 = c377830Erd.LIZ;
        }
        if ((i & 2) != 0) {
            z3 = c377830Erd.LIZIZ;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            enumC378720Et42 = c377830Erd.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC378320EsQ2 = c377830Erd.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP3 = c377830Erd.LJ;
        }
        if ((i & 32) != 0) {
            editorProAIGCMediaItemModel2 = c377830Erd.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP2 = c377830Erd.LJI;
        } else {
            c375830EoP2 = null;
        }
        if ((i & 128) != 0) {
            num10 = c377830Erd.LJII;
        }
        if ((i & 256) != 0) {
            num9 = c377830Erd.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            num7 = c377830Erd.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            i2 = c377830Erd.LJIIJ;
        } else {
            i2 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = c377830Erd.LJIIJJI;
        } else {
            i3 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i4 = c377830Erd.LJIIL;
        } else {
            i4 = 0;
        }
        if ((i & 8192) != 0) {
            num12 = c377830Erd.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            num11 = c377830Erd.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            num8 = c377830Erd.LJIILL;
        }
        if ((65536 & i) != 0) {
            str2 = c377830Erd.LJIILLIIL;
        }
        if ((i & 131072) != 0) {
            z4 = c377830Erd.LJIIZILJ;
        }
        c377830Erd.getClass();
        int i5 = i2;
        int i6 = i3;
        EnumC378320EsQ enumC378320EsQ3 = enumC378320EsQ2;
        C375830EoP<Boolean> c375830EoP4 = c375830EoP2;
        return new C377830Erd(z5, z3, enumC378720Et42, enumC378320EsQ3, c375830EoP3, editorProAIGCMediaItemModel2, c375830EoP4, num10, num9, num7, i5, i6, i4, num12, num11, num8, str2, z4);
    }

    public C377830Erd(boolean z, boolean z2, EnumC378720Et4 enumC378720Et4, EnumC378320EsQ enumC378320EsQ, C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, C375830EoP<Boolean> c375830EoP2, Integer num, Integer num2, Integer num3, int i, int i2, int i3, Integer num4, Integer num5, Integer num6, String str, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC378720Et4;
        this.LIZLLL = enumC378320EsQ;
        this.LJ = c375830EoP;
        this.LJFF = editorProAIGCMediaItemModel;
        this.LJI = c375830EoP2;
        this.LJII = num;
        this.LJIIIIZZ = num2;
        this.LJIIIZ = num3;
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIIL = i3;
        this.LJIILIIL = num4;
        this.LJIILJJIL = num5;
        this.LJIILL = num6;
        this.LJIILLIIL = str;
        this.LJIIZILJ = z3;
    }
}
