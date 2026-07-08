package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AppealEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBindPromotionPopUpInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C890803dy implements InterfaceC0148002o {
    public final PaymentMethod LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final String LLILLL;
    public final PaymentInfo LLILZ;
    public final boolean LLILZIL;
    public final Object LLILZLL;
    public final Object LLIZ;
    public final Object LLIZLLLIL;
    public final C948003nC<Pair<String, String>> LLJ;
    public final C948003nC<String> LLJI;
    public final Boolean LLJIJIL;
    public final Boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final C948003nC<PaymentInfo> LLJILLL;
    public final Object LLJJ;
    public final EnumC880203cG LLJJI;
    public final String LLJJIII;
    public final C948003nC<String> LLJJIJI;
    public final PaymentInfo LLJJIJIIJIL;
    public final CardBindPromotionPopUpInfo LLJJIJIL;
    public final Boolean LLJJJ;
    public final C948003nC<AppealEntranceInfo> LLJJJIL;

    public C890803dy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C890803dy)) {
            return false;
        }
        C890803dy c890803dy = (C890803dy) obj;
        return Intrinsics.LJFF(this.LL, c890803dy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c890803dy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c890803dy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c890803dy.LLILZ) && this.LLILZIL == c890803dy.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c890803dy.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c890803dy.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c890803dy.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c890803dy.LLJ) && Intrinsics.LJFF(this.LLJI, c890803dy.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c890803dy.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c890803dy.LLJILJIL) && this.LLJILJILJ == c890803dy.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c890803dy.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c890803dy.LLJJ) && this.LLJJI == c890803dy.LLJJI && Intrinsics.LJFF(this.LLJJIII, c890803dy.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c890803dy.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c890803dy.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c890803dy.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c890803dy.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c890803dy.LLJJJIL);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LL;
        int iHashCode = (((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentInfo paymentInfo = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        Object obj = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        C948003nC<Pair<String, String>> c948003nC = this.LLJ;
        int iHashCode7 = (iHashCode6 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31;
        C948003nC<String> c948003nC2 = this.LLJI;
        int iHashCode8 = (iHashCode7 + (c948003nC2 == null ? 0 : c948003nC2.hashCode())) * 31;
        Boolean bool = this.LLJIJIL;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJILJIL;
        int iHashCode10 = (((iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        C948003nC<PaymentInfo> c948003nC3 = this.LLJILLL;
        int iHashCode11 = (iHashCode10 + (c948003nC3 == null ? 0 : c948003nC3.hashCode())) * 31;
        Object obj4 = this.LLJJ;
        int iHashCode12 = (iHashCode11 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        EnumC880203cG enumC880203cG = this.LLJJI;
        int iHashCode13 = (iHashCode12 + (enumC880203cG == null ? 0 : enumC880203cG.hashCode())) * 31;
        String str2 = this.LLJJIII;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C948003nC<String> c948003nC4 = this.LLJJIJI;
        int iHashCode15 = (iHashCode14 + (c948003nC4 == null ? 0 : c948003nC4.hashCode())) * 31;
        PaymentInfo paymentInfo2 = this.LLJJIJIIJIL;
        int iHashCode16 = (iHashCode15 + (paymentInfo2 == null ? 0 : paymentInfo2.hashCode())) * 31;
        CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo = this.LLJJIJIL;
        int iHashCode17 = (iHashCode16 + (cardBindPromotionPopUpInfo == null ? 0 : cardBindPromotionPopUpInfo.hashCode())) * 31;
        Boolean bool3 = this.LLJJJ;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C948003nC<AppealEntranceInfo> c948003nC5 = this.LLJJJIL;
        return iHashCode18 + (c948003nC5 != null ? c948003nC5.hashCode() : 0);
    }

    public final String toString() {
        return "CCDCAddCardState(ccdcPaymentMethod=" + this.LL + ", powerItemList=" + this.LLILLJJLI + ", systemError=" + this.LLILLL + ", paymentInfo=" + this.LLILZ + ", needSave=" + this.LLILZIL + ", dismissCCDCPageAction=" + this.LLILZLL + ", dismissAll=" + this.LLIZ + ", dismissCCI=" + this.LLIZLLLIL + ", showLearnMore=" + this.LLJ + ", toast=" + this.LLJI + ", sameAsShippingAddressSwitch=" + this.LLJIJIL + ", bottomButtonEnableState=" + this.LLJILJIL + ", showLoading=" + this.LLJILJILJ + ", cciNextStepData=" + this.LLJILLL + ", showRetention=" + this.LLJJ + ", changeBindCardStatus=" + this.LLJJI + ", errorMessage=" + this.LLJJIII + ", errorAction=" + this.LLJJIJI + ", pmInfoForSummary=" + this.LLJJIJIIJIL + ", showCardBindPromoRetention=" + this.LLJJIJIL + ", keyboardShow=" + this.LLJJJ + ", appealDialogPayload=" + this.LLJJJIL + ')';
    }

    public /* synthetic */ C890803dy(int i) {
        this(null, new ArrayList(), null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C890803dy(PaymentMethod paymentMethod, List<? extends InterfaceC1891350zJl> list, String str, PaymentInfo paymentInfo, boolean z, Object obj, Object obj2, Object obj3, C948003nC<Pair<String, String>> c948003nC, C948003nC<String> c948003nC2, Boolean bool, Boolean bool2, boolean z2, C948003nC<PaymentInfo> c948003nC3, Object obj4, EnumC880203cG enumC880203cG, String str2, C948003nC<String> c948003nC4, PaymentInfo paymentInfo2, CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo, Boolean bool3, C948003nC<AppealEntranceInfo> c948003nC5) {
        this.LL = paymentMethod;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = paymentInfo;
        this.LLILZIL = z;
        this.LLILZLL = obj;
        this.LLIZ = obj2;
        this.LLIZLLLIL = obj3;
        this.LLJ = c948003nC;
        this.LLJI = c948003nC2;
        this.LLJIJIL = bool;
        this.LLJILJIL = bool2;
        this.LLJILJILJ = z2;
        this.LLJILLL = c948003nC3;
        this.LLJJ = obj4;
        this.LLJJI = enumC880203cG;
        this.LLJJIII = str2;
        this.LLJJIJI = c948003nC4;
        this.LLJJIJIIJIL = paymentInfo2;
        this.LLJJIJIL = cardBindPromotionPopUpInfo;
        this.LLJJJ = bool3;
        this.LLJJJIL = c948003nC5;
    }

    public static C890803dy LIZ(C890803dy c890803dy, PaymentMethod paymentMethod, List list, String str, boolean z, Object obj, Object obj2, Object obj3, C948003nC c948003nC, C948003nC c948003nC2, Boolean bool, Boolean bool2, boolean z2, C948003nC c948003nC3, Object obj4, EnumC880203cG enumC880203cG, String str2, C948003nC c948003nC4, PaymentInfo paymentInfo, CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo, Boolean bool3, C948003nC c948003nC5, int i) {
        PaymentInfo paymentInfo2;
        C948003nC c948003nC6 = c948003nC5;
        Boolean bool4 = bool3;
        PaymentInfo paymentInfo3 = paymentInfo;
        C948003nC c948003nC7 = c948003nC4;
        String str3 = str2;
        boolean z3 = z2;
        EnumC880203cG enumC880203cG2 = enumC880203cG;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        C948003nC c948003nC8 = c948003nC2;
        C948003nC c948003nC9 = c948003nC;
        Object obj5 = obj4;
        Object obj6 = obj3;
        Object obj7 = obj2;
        Object obj8 = obj;
        CardBindPromotionPopUpInfo cardBindPromotionPopUpInfo2 = cardBindPromotionPopUpInfo;
        C948003nC c948003nC10 = c948003nC3;
        boolean z4 = z;
        String str4 = str;
        List list2 = list;
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i & 1) != 0) {
            paymentMethod2 = c890803dy.LL;
        }
        if ((i & 2) != 0) {
            list2 = c890803dy.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str4 = c890803dy.LLILLL;
        }
        if ((i & 8) != 0) {
            paymentInfo2 = c890803dy.LLILZ;
        } else {
            paymentInfo2 = null;
        }
        if ((i & 16) != 0) {
            z4 = c890803dy.LLILZIL;
        }
        if ((i & 32) != 0) {
            obj8 = c890803dy.LLILZLL;
        }
        if ((i & 64) != 0) {
            obj7 = c890803dy.LLIZ;
        }
        if ((i & 128) != 0) {
            obj6 = c890803dy.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c948003nC9 = c890803dy.LLJ;
        }
        if ((i & 512) != 0) {
            c948003nC8 = c890803dy.LLJI;
        }
        if ((i & 1024) != 0) {
            bool6 = c890803dy.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool5 = c890803dy.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z3 = c890803dy.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            c948003nC10 = c890803dy.LLJILLL;
        }
        if ((i & 16384) != 0) {
            obj5 = c890803dy.LLJJ;
        }
        if ((32768 & i) != 0) {
            enumC880203cG2 = c890803dy.LLJJI;
        }
        if ((65536 & i) != 0) {
            str3 = c890803dy.LLJJIII;
        }
        if ((131072 & i) != 0) {
            c948003nC7 = c890803dy.LLJJIJI;
        }
        if ((262144 & i) != 0) {
            paymentInfo3 = c890803dy.LLJJIJIIJIL;
        }
        if ((524288 & i) != 0) {
            cardBindPromotionPopUpInfo2 = c890803dy.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            bool4 = c890803dy.LLJJJ;
        }
        if ((i & 2097152) != 0) {
            c948003nC6 = c890803dy.LLJJJIL;
        }
        c890803dy.getClass();
        Boolean bool7 = bool4;
        C948003nC c948003nC11 = c948003nC6;
        Object obj9 = obj8;
        Boolean bool8 = bool6;
        Boolean bool9 = bool5;
        boolean z5 = z3;
        return new C890803dy(paymentMethod2, list2, str4, paymentInfo2, z4, obj9, obj7, obj6, c948003nC9, c948003nC8, bool8, bool9, z5, c948003nC10, obj5, enumC880203cG2, str3, c948003nC7, paymentInfo3, cardBindPromotionPopUpInfo2, bool7, c948003nC11);
    }
}
