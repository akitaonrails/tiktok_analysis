package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementTagProgressUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.185F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185F {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<Long, String> LIZLLL;
    public final List<C1555800qaY> LJ;
    public final long LJFF;
    public final long LJI;
    public final float LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final PromotionLabel LJIIJ;
    public final boolean LJIIJJI;
    public final List<PromotionLabel> LJIIL;
    public final PriceTextConfig LJIILIIL;
    public final FlashSaleEnhancementTagProgressUiConfig LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185F)) {
            return false;
        }
        C185F c185f = (C185F) obj;
        return this.LIZ == c185f.LIZ && Intrinsics.LJFF(this.LIZIZ, c185f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c185f.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c185f.LIZLLL) && Intrinsics.LJFF(this.LJ, c185f.LJ) && this.LJFF == c185f.LJFF && this.LJI == c185f.LJI && Float.compare(this.LJII, c185f.LJII) == 0 && Intrinsics.LJFF(this.LJIIIIZZ, c185f.LJIIIIZZ) && this.LJIIIZ == c185f.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c185f.LJIIJ) && this.LJIIJJI == c185f.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c185f.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c185f.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c185f.LJIILJJIL);
    }

    public final String toString() {
        return "SeaFlashSaleTagAreaVM(displayType=" + this.LIZ + ", mainText=" + this.LIZIZ + ", preheatText=" + this.LIZJ + ", allTexts=" + this.LIZLLL + ", buyerInfos=" + this.LJ + ", countdownRemainTime=" + this.LJFF + ", showCountdownThreshold=" + this.LJI + ", stockProgress=" + this.LJII + ", preheatHighlightTextColor=" + this.LJIIIIZZ + ", isNormalFlashSale=" + this.LJIIIZ + ", flashSalePromotionLabel=" + this.LJIIJ + ", appendNormalPromotionTags=" + this.LJIIJJI + ", normalPromotionLabels=" + this.LJIIL + ", tagTextStyleConfig=" + this.LJIILIIL + ", tagProgressUiConfig=" + this.LJIILJJIL + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31;
        String str = this.LJIIIIZZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        PromotionLabel promotionLabel = this.LJIIJ;
        int iHashCode3 = (((((iHashCode2 + (promotionLabel == null ? 0 : promotionLabel.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31;
        PriceTextConfig priceTextConfig = this.LJIILIIL;
        int iHashCode4 = (iHashCode3 + (priceTextConfig == null ? 0 : priceTextConfig.hashCode())) * 31;
        FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig = this.LJIILJJIL;
        return iHashCode4 + (flashSaleEnhancementTagProgressUiConfig != null ? flashSaleEnhancementTagProgressUiConfig.hashCode() : 0);
    }

    public static C185F LIZ(C185F c185f, int i, String str, List list, long j, float f, int i2) {
        String str2;
        Map<Long, String> map;
        long j2;
        String str3;
        boolean z;
        PromotionLabel promotionLabel;
        boolean z2;
        List<PromotionLabel> list2;
        PriceTextConfig priceTextConfig;
        FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig;
        float f2 = f;
        List list3 = list;
        String str4 = str;
        long j3 = j;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c185f.LIZ;
        }
        if ((i2 & 2) != 0) {
            str4 = c185f.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = c185f.LIZJ;
        } else {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            map = c185f.LIZLLL;
        } else {
            map = null;
        }
        if ((i2 & 16) != 0) {
            list3 = c185f.LJ;
        }
        if ((i2 & 32) != 0) {
            j3 = c185f.LJFF;
        }
        if ((i2 & 64) != 0) {
            j2 = c185f.LJI;
        } else {
            j2 = 0;
        }
        if ((i2 & 128) != 0) {
            f2 = c185f.LJII;
        }
        if ((i2 & 256) != 0) {
            str3 = c185f.LJIIIIZZ;
        } else {
            str3 = null;
        }
        if ((i2 & 512) != 0) {
            z = c185f.LJIIIZ;
        } else {
            z = false;
        }
        if ((i2 & 1024) != 0) {
            promotionLabel = c185f.LJIIJ;
        } else {
            promotionLabel = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z2 = c185f.LJIIJJI;
        } else {
            z2 = false;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            list2 = c185f.LJIIL;
        } else {
            list2 = null;
        }
        if ((i2 & 8192) != 0) {
            priceTextConfig = c185f.LJIILIIL;
        } else {
            priceTextConfig = null;
        }
        if ((i2 & 16384) != 0) {
            flashSaleEnhancementTagProgressUiConfig = c185f.LJIILJJIL;
        } else {
            flashSaleEnhancementTagProgressUiConfig = null;
        }
        String str5 = str4;
        return new C185F(i3, str5, str2, map, list3, j3, j2, f2, str3, z, promotionLabel, z2, list2, priceTextConfig, flashSaleEnhancementTagProgressUiConfig);
    }

    public C185F(int i, String str, String str2, Map<Long, String> map, List<C1555800qaY> list, long j, long j2, float f, String str3, boolean z, PromotionLabel promotionLabel, boolean z2, List<PromotionLabel> list2, PriceTextConfig priceTextConfig, FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = map;
        this.LJ = list;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = f;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z;
        this.LJIIJ = promotionLabel;
        this.LJIIJJI = z2;
        this.LJIIL = list2;
        this.LJIILIIL = priceTextConfig;
        this.LJIILJJIL = flashSaleEnhancementTagProgressUiConfig;
    }
}
