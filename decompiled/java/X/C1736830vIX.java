package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736830vIX implements InterfaceC0148002o, InterfaceC111300bX {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736830vIX)) {
            return false;
        }
        C1736830vIX c1736830vIX = (C1736830vIX) obj;
        return this.LL == c1736830vIX.LL && Intrinsics.LJFF(this.LLILLJJLI, c1736830vIX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1736830vIX.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1736830vIX.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1736830vIX.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1736830vIX.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1736830vIX.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1736830vIX.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1736830vIX.LLJ) && Intrinsics.LJFF(this.LLJI, c1736830vIX.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1736830vIX.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1736830vIX.LLJILJIL) && this.LLJILJILJ == c1736830vIX.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1736830vIX.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1736830vIX.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1736830vIX.LLJJI) && this.LLJJIII == c1736830vIX.LLJJIII && Float.compare(this.LLJJIJI, c1736830vIX.LLJJIJI) == 0 && Intrinsics.LJFF(this.LLJJIJIIJIL, c1736830vIX.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1736830vIX.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1736830vIX.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1736830vIX.LLJJJIL);
    }

    public final String toString() {
        return "EffectEditState(on=" + this.LL + ", effectName=" + this.LLILLJJLI + ", author=" + this.LLILLL + ", effectEditImage=" + this.LLILZ + ", effectPublishImage=" + this.LLILZIL + ", editedImage=" + this.LLILZLL + ", loading=" + this.LLIZ + ", effectUpdateResultEvent=" + this.LLIZLLLIL + ", uiEvent=" + this.LLJ + ", effectHint=" + this.LLJI + ", autoIconEvent=" + this.LLJIJIL + ", hintTipsWindowEvent=" + this.LLJILJIL + ", isAutoGenIcon=" + this.LLJILJILJ + ", campaignId=" + this.LLJILLL + ", campaignBindMethod=" + this.LLJJ + ", campaignListState=" + this.LLJJI + ", effectZipPackageSize=" + this.LLJJIII + ", aigcEffectCoverPosPercent=" + this.LLJJIJI + ", femaleIconImage=" + this.LLJJIJIIJIL + ", maleIconImage=" + this.LLJJIJIL + ", aigcEffectCoverPtsPair=" + this.LLJJJ + ", categoryIconLoading=" + this.LLJJJIL + ')';
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
        return iHashCode11 + (c291001Au7 != null ? c291001Au7.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1736830vIX(String str, String str2, UrlModel urlModel, String str3, EffectHint effectHint, String str4, String str5, int i) {
        C491101vh c491101vh;
        long j;
        float f;
        String str6 = str5;
        String str7 = str4;
        EffectHint effectHint2 = (i & 512) != 0 ? null : effectHint;
        str7 = (i & 8192) != 0 ? "" : str7;
        str6 = (i & 16384) != 0 ? "automatic" : str6;
        if ((32768 & i) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        if ((65536 & i) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((131072 & i) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this(true, str, str2, urlModel, str3, null, null, null, null, effectHint2, null, null, false, str7, str6, c491101vh, j, f, null, null, (i & 1048576) != 0 ? new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)) : null, null);
    }

    public static C1736830vIX LIZ(C1736830vIX c1736830vIX, String str, EditImage editImage, Boolean bool, C291001Au c291001Au, C291001Au c291001Au2, EffectHint effectHint, String str2, String str3, AbstractC1623806Xk abstractC1623806Xk, long j, C291001Au c291001Au3, C291001Au c291001Au4, Pair pair, C291001Au c291001Au5, int i) {
        boolean z;
        String str4;
        UrlModel urlModel;
        String str5;
        C291001Au<Pair<Object, EnumC1736950vIj>> c291001Au6;
        float f;
        C291001Au c291001Au7 = c291001Au4;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        Boolean bool2 = bool;
        String str6 = str3;
        long j2 = j;
        EditImage editImage2 = editImage;
        String str7 = str2;
        EffectHint effectHint2 = effectHint;
        C291001Au c291001Au8 = c291001Au5;
        String str8 = str;
        C291001Au c291001Au9 = c291001Au2;
        Pair pair2 = pair;
        C291001Au c291001Au10 = c291001Au;
        C291001Au c291001Au11 = c291001Au3;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c1736830vIX.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            str8 = c1736830vIX.LLILLJJLI;
        }
        C291001Au<Object> c291001Au12 = null;
        if ((i & 4) != 0) {
            str4 = c1736830vIX.LLILLL;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            urlModel = c1736830vIX.LLILZ;
        } else {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            str5 = c1736830vIX.LLILZIL;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            editImage2 = c1736830vIX.LLILZLL;
        }
        if ((i & 64) != 0) {
            bool2 = c1736830vIX.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au10 = c1736830vIX.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au9 = c1736830vIX.LLJ;
        }
        if ((i & 512) != 0) {
            effectHint2 = c1736830vIX.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au6 = c1736830vIX.LLJIJIL;
        } else {
            c291001Au6 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au12 = c1736830vIX.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c1736830vIX.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            str7 = c1736830vIX.LLJILLL;
        }
        if ((i & 16384) != 0) {
            str6 = c1736830vIX.LLJJ;
        }
        if ((32768 & i) != 0) {
            abstractC1623806Xk2 = c1736830vIX.LLJJI;
        }
        if ((65536 & i) != 0) {
            j2 = c1736830vIX.LLJJIII;
        }
        if ((131072 & i) != 0) {
            f = c1736830vIX.LLJJIJI;
        } else {
            f = 0.0f;
        }
        if ((262144 & i) != 0) {
            c291001Au11 = c1736830vIX.LLJJIJIIJIL;
        }
        if ((524288 & i) != 0) {
            c291001Au7 = c1736830vIX.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            pair2 = c1736830vIX.LLJJJ;
        }
        if ((i & 2097152) != 0) {
            c291001Au8 = c1736830vIX.LLJJJIL;
        }
        c1736830vIX.getClass();
        return new C1736830vIX(z, str8, str4, urlModel, str5, editImage2, bool2, c291001Au10, c291001Au9, effectHint2, c291001Au6, c291001Au12, z2, str7, str6, abstractC1623806Xk2, j2, f, c291001Au11, c291001Au7, pair2, c291001Au8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1736830vIX(boolean z, String str, String str2, UrlModel urlModel, String str3, EditImage editImage, Boolean bool, C291001Au<? extends AbstractC1736670vIH> c291001Au, C291001Au<? extends EnumC1736160vHS> c291001Au2, EffectHint effectHint, C291001Au<? extends Pair<Object, ? extends EnumC1736950vIj>> c291001Au3, C291001Au<Object> c291001Au4, boolean z2, String str4, String str5, AbstractC1623806Xk<? extends List<AMEPublishCampaignItem>> abstractC1623806Xk, long j, float f, C291001Au<EditImage> c291001Au5, C291001Au<EditImage> c291001Au6, Pair<Float, Float> pair, C291001Au<? extends Pair<? extends EnumC1736950vIj, Boolean>> c291001Au7) {
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
    }
}
