package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIcon;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736840vIY implements InterfaceC0148002o, InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final String LLILZIL;
    public final EditImage LLILZLL;
    public final Boolean LLIZ;
    public final C291001Au<AbstractC1736670vIH> LLIZLLLIL;
    public final C291001Au<EnumC1736160vHS> LLJ;
    public final EffectHint LLJI;
    public final C291001Au<Pair<Object, EnumC1736950vIj>> LLJIJIL;
    public final C291001Au<Object> LLJILJIL;
    public final boolean LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final AbstractC1623806Xk<List<AMEPublishCampaignItem>> LLJJI;
    public final long LLJJIII;
    public final float LLJJIJI;
    public final C291001Au<EditImage> LLJJIJIIJIL;
    public final C291001Au<EditImage> LLJJIJIL;
    public final Pair<Float, Float> LLJJJ;
    public final C291001Au<Pair<EnumC1736950vIj, Boolean>> LLJJJIL;
    public final C291001Au<List<MobileEffectIcon>> LLJJJJ;
    public final C291001Au<String> LLJJJJJIL;
    public final C291001Au<Boolean> LLJJJJLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736840vIY)) {
            return false;
        }
        C1736840vIY c1736840vIY = (C1736840vIY) obj;
        return this.LL == c1736840vIY.LL && Intrinsics.LJFF(this.LLILLJJLI, c1736840vIY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1736840vIY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1736840vIY.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1736840vIY.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1736840vIY.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1736840vIY.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1736840vIY.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1736840vIY.LLJ) && Intrinsics.LJFF(this.LLJI, c1736840vIY.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1736840vIY.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1736840vIY.LLJILJIL) && this.LLJILJILJ == c1736840vIY.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1736840vIY.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1736840vIY.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1736840vIY.LLJJI) && this.LLJJIII == c1736840vIY.LLJJIII && Float.compare(this.LLJJIJI, c1736840vIY.LLJJIJI) == 0 && Intrinsics.LJFF(this.LLJJIJIIJIL, c1736840vIY.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1736840vIY.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1736840vIY.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1736840vIY.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1736840vIY.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1736840vIY.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1736840vIY.LLJJJJLIIL);
    }

    public final String toString() {
        return "EffectEditStateV2(on=" + this.LL + ", effectName=" + this.LLILLJJLI + ", author=" + this.LLILLL + ", effectEditImage=" + this.LLILZ + ", effectPublishImage=" + this.LLILZIL + ", editedImage=" + this.LLILZLL + ", loading=" + this.LLIZ + ", effectUpdateResultEvent=" + this.LLIZLLLIL + ", uiEvent=" + this.LLJ + ", effectHint=" + this.LLJI + ", autoIconEvent=" + this.LLJIJIL + ", hintTipsWindowEvent=" + this.LLJILJIL + ", isAutoGenIcon=" + this.LLJILJILJ + ", campaignId=" + this.LLJILLL + ", campaignBindMethod=" + this.LLJJ + ", campaignListState=" + this.LLJJI + ", effectZipPackageSize=" + this.LLJJIII + ", aigcEffectCoverPosPercent=" + this.LLJJIJI + ", femaleIconImage=" + this.LLJJIJIIJIL + ", maleIconImage=" + this.LLJJIJIL + ", aigcEffectCoverPtsPair=" + this.LLJJJ + ", categoryIconLoading=" + this.LLJJJIL + ", iconRequestEvent=" + this.LLJJJJ + ", iconTipEvent=" + this.LLJJJJJIL + ", iconHasChange=" + this.LLJJJJLIIL + ')';
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        UrlModel urlModel = this.LLILZ;
        int iHashCode = (iZ2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EditImage editImage = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (editImage == null ? 0 : editImage.hashCode())) * 31;
        Boolean bool = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C291001Au<AbstractC1736670vIH> c291001Au = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<EnumC1736160vHS> c291001Au2 = this.LLJ;
        int iHashCode6 = (iHashCode5 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        EffectHint effectHint = this.LLJI;
        int iHashCode7 = (iHashCode6 + (effectHint == null ? 0 : effectHint.hashCode())) * 31;
        C291001Au<Pair<Object, EnumC1736950vIj>> c291001Au3 = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Object> c291001Au4 = this.LLJILJIL;
        int iHashCode9 = (((((((((((((iHashCode8 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + C786410Ut5.Y2(this.LLJJIII)) * 31) + Float.floatToIntBits(this.LLJJIJI)) * 31;
        C291001Au<EditImage> c291001Au5 = this.LLJJIJIIJIL;
        int iHashCode10 = (iHashCode9 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<EditImage> c291001Au6 = this.LLJJIJIL;
        int iHashCode11 = (((iHashCode10 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31) + this.LLJJJ.hashCode()) * 31;
        C291001Au<Pair<EnumC1736950vIj, Boolean>> c291001Au7 = this.LLJJJIL;
        int iHashCode12 = (iHashCode11 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<List<MobileEffectIcon>> c291001Au8 = this.LLJJJJ;
        int iHashCode13 = (iHashCode12 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        C291001Au<String> c291001Au9 = this.LLJJJJJIL;
        return ((iHashCode13 + (c291001Au9 != null ? c291001Au9.hashCode() : 0)) * 31) + this.LLJJJJLIIL.hashCode();
    }

    public static C1736840vIY LIZ(C1736840vIY c1736840vIY, String str, Boolean bool, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, int i) {
        boolean z;
        String str2;
        UrlModel urlModel;
        String str3;
        EditImage editImage;
        EffectHint effectHint;
        C291001Au<Pair<Object, EnumC1736950vIj>> c291001Au9;
        C291001Au<Object> c291001Au10;
        String str4;
        String str5;
        AbstractC1623806Xk<List<AMEPublishCampaignItem>> abstractC1623806Xk;
        long j;
        float f;
        C291001Au c291001Au11 = c291001Au8;
        C291001Au c291001Au12 = c291001Au6;
        String str6 = str;
        C291001Au c291001Au13 = c291001Au5;
        C291001Au c291001Au14 = c291001Au4;
        C291001Au c291001Au15 = c291001Au3;
        C291001Au c291001Au16 = c291001Au7;
        C291001Au c291001Au17 = c291001Au2;
        C291001Au c291001Au18 = c291001Au;
        Boolean bool2 = bool;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c1736840vIY.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            str6 = c1736840vIY.LLILLJJLI;
        }
        Pair<Float, Float> pair = null;
        if ((i & 4) != 0) {
            str2 = c1736840vIY.LLILLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            urlModel = c1736840vIY.LLILZ;
        } else {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            str3 = c1736840vIY.LLILZIL;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            editImage = c1736840vIY.LLILZLL;
        } else {
            editImage = null;
        }
        if ((i & 64) != 0) {
            bool2 = c1736840vIY.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au18 = c1736840vIY.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au17 = c1736840vIY.LLJ;
        }
        if ((i & 512) != 0) {
            effectHint = c1736840vIY.LLJI;
        } else {
            effectHint = null;
        }
        if ((i & 1024) != 0) {
            c291001Au9 = c1736840vIY.LLJIJIL;
        } else {
            c291001Au9 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au10 = c1736840vIY.LLJILJIL;
        } else {
            c291001Au10 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c1736840vIY.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            str4 = c1736840vIY.LLJILLL;
        } else {
            str4 = null;
        }
        if ((i & 16384) != 0) {
            str5 = c1736840vIY.LLJJ;
        } else {
            str5 = null;
        }
        if ((32768 & i) != 0) {
            abstractC1623806Xk = c1736840vIY.LLJJI;
        } else {
            abstractC1623806Xk = null;
        }
        if ((65536 & i) != 0) {
            j = c1736840vIY.LLJJIII;
        } else {
            j = 0;
        }
        if ((131072 & i) != 0) {
            f = c1736840vIY.LLJJIJI;
        } else {
            f = 0.0f;
        }
        if ((262144 & i) != 0) {
            c291001Au15 = c1736840vIY.LLJJIJIIJIL;
        }
        if ((524288 & i) != 0) {
            c291001Au14 = c1736840vIY.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            pair = c1736840vIY.LLJJJ;
        }
        if ((2097152 & i) != 0) {
            c291001Au13 = c1736840vIY.LLJJJIL;
        }
        if ((4194304 & i) != 0) {
            c291001Au12 = c1736840vIY.LLJJJJ;
        }
        if ((8388608 & i) != 0) {
            c291001Au16 = c1736840vIY.LLJJJJJIL;
        }
        if ((i & 16777216) != 0) {
            c291001Au11 = c1736840vIY.LLJJJJLIIL;
        }
        c1736840vIY.getClass();
        return new C1736840vIY(z, str6, str2, urlModel, str3, editImage, bool2, c291001Au18, c291001Au17, effectHint, c291001Au9, c291001Au10, z2, str4, str5, abstractC1623806Xk, j, f, c291001Au15, c291001Au14, pair, c291001Au13, c291001Au12, c291001Au16, c291001Au11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1736840vIY(boolean z, String str, String str2, UrlModel urlModel, String str3, EditImage editImage, Boolean bool, C291001Au<? extends AbstractC1736670vIH> c291001Au, C291001Au<? extends EnumC1736160vHS> c291001Au2, EffectHint effectHint, C291001Au<? extends Pair<Object, ? extends EnumC1736950vIj>> c291001Au3, C291001Au<Object> c291001Au4, boolean z2, String str4, String str5, AbstractC1623806Xk<? extends List<AMEPublishCampaignItem>> abstractC1623806Xk, long j, float f, C291001Au<EditImage> c291001Au5, C291001Au<EditImage> c291001Au6, Pair<Float, Float> pair, C291001Au<? extends Pair<? extends EnumC1736950vIj, Boolean>> c291001Au7, C291001Au<? extends List<MobileEffectIcon>> c291001Au8, C291001Au<String> c291001Au9, C291001Au<Boolean> c291001Au10) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = urlModel;
        this.LLILZIL = str3;
        this.LLILZLL = editImage;
        this.LLIZ = bool;
        this.LLIZLLLIL = c291001Au;
        this.LLJ = c291001Au2;
        this.LLJI = effectHint;
        this.LLJIJIL = c291001Au3;
        this.LLJILJIL = c291001Au4;
        this.LLJILJILJ = z2;
        this.LLJILLL = str4;
        this.LLJJ = str5;
        this.LLJJI = abstractC1623806Xk;
        this.LLJJIII = j;
        this.LLJJIJI = f;
        this.LLJJIJIIJIL = c291001Au5;
        this.LLJJIJIL = c291001Au6;
        this.LLJJJ = pair;
        this.LLJJJIL = c291001Au7;
        this.LLJJJJ = c291001Au8;
        this.LLJJJJJIL = c291001Au9;
        this.LLJJJJLIIL = c291001Au10;
    }
}
