package X;

import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.bytedance.pipo.ttpay.recharge.network.UserDisplayInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721620uu0 implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final EnumC1721510utp LLILLJJLI;
    public final UserDisplayInfo LLILLL;
    public final EnumC488160JCk LLILZ;
    public final EnumC488160JCk LLILZIL;
    public final EnumC1721510utp LLILZLL;
    public final SubmitPaymentResponse LLIZ;
    public final String LLIZLLLIL;
    public final EnumC1721630uu1 LLJ;
    public final List<String> LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final Amount LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;

    public C1721620uu0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721620uu0)) {
            return false;
        }
        C1721620uu0 c1721620uu0 = (C1721620uu0) obj;
        return this.LL == c1721620uu0.LL && this.LLILLJJLI == c1721620uu0.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1721620uu0.LLILLL) && this.LLILZ == c1721620uu0.LLILZ && this.LLILZIL == c1721620uu0.LLILZIL && this.LLILZLL == c1721620uu0.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1721620uu0.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1721620uu0.LLIZLLLIL) && this.LLJ == c1721620uu0.LLJ && Intrinsics.LJFF(this.LLJI, c1721620uu0.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1721620uu0.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1721620uu0.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1721620uu0.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1721620uu0.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1721620uu0.LLJJ);
    }

    public final int hashCode() {
        EnumC488160JCk enumC488160JCk = this.LL;
        int iHashCode = (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode()) * 31;
        EnumC1721510utp enumC1721510utp = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1721510utp == null ? 0 : enumC1721510utp.hashCode())) * 31;
        UserDisplayInfo userDisplayInfo = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (userDisplayInfo == null ? 0 : userDisplayInfo.hashCode())) * 31;
        EnumC488160JCk enumC488160JCk2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC488160JCk2 == null ? 0 : enumC488160JCk2.hashCode())) * 31;
        EnumC488160JCk enumC488160JCk3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (enumC488160JCk3 == null ? 0 : enumC488160JCk3.hashCode())) * 31;
        EnumC1721510utp enumC1721510utp2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (enumC1721510utp2 == null ? 0 : enumC1721510utp2.hashCode())) * 31;
        SubmitPaymentResponse submitPaymentResponse = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (submitPaymentResponse == null ? 0 : submitPaymentResponse.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode8 = (((((iHashCode7 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        String str2 = this.LLJIJIL;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILJIL;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Amount amount = this.LLJILJILJ;
        int iHashCode11 = (iHashCode10 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str4 = this.LLJILLL;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJJ;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "RechargeState(pageLoadingStatus=" + this.LL + ", initUserStatusCheckResult=" + this.LLILLJJLI + ", initUserDisplayInfo=" + this.LLILLL + ", consultStatus=" + this.LLILZ + ", paymentStatus=" + this.LLILZIL + ", userStatusCheckResult=" + this.LLILZLL + ", paymentResponse=" + this.LLIZ + ", resultLink=" + this.LLIZLLLIL + ", amountCheckResult=" + this.LLJ + ", recommendAmount=" + this.LLJI + ", maxAmount=" + this.LLJIJIL + ", minAmount=" + this.LLJILJIL + ", finialTransactionAmount=" + this.LLJILJILJ + ", errorContent=" + this.LLJILLL + ", routeSchema=" + this.LLJJ + ')';
    }

    public C1721620uu0(int i) {
        this(null, null, null, null, null, null, null, null, EnumC1721630uu1.INIT, C13BV.INSTANCE, null, null, null, null, null);
    }

    public C1721620uu0(EnumC488160JCk enumC488160JCk, EnumC1721510utp enumC1721510utp, UserDisplayInfo userDisplayInfo, EnumC488160JCk enumC488160JCk2, EnumC488160JCk enumC488160JCk3, EnumC1721510utp enumC1721510utp2, SubmitPaymentResponse submitPaymentResponse, String str, EnumC1721630uu1 enumC1721630uu1, List<String> list, String str2, String str3, Amount amount, String str4, String str5) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = enumC1721510utp;
        this.LLILLL = userDisplayInfo;
        this.LLILZ = enumC488160JCk2;
        this.LLILZIL = enumC488160JCk3;
        this.LLILZLL = enumC1721510utp2;
        this.LLIZ = submitPaymentResponse;
        this.LLIZLLLIL = str;
        this.LLJ = enumC1721630uu1;
        this.LLJI = list;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = amount;
        this.LLJILLL = str4;
        this.LLJJ = str5;
    }

    public static C1721620uu0 LIZ(C1721620uu0 c1721620uu0, EnumC488160JCk enumC488160JCk, EnumC1721510utp enumC1721510utp, UserDisplayInfo userDisplayInfo, EnumC488160JCk enumC488160JCk2, EnumC488160JCk enumC488160JCk3, EnumC1721510utp enumC1721510utp2, SubmitPaymentResponse submitPaymentResponse, String str, EnumC1721630uu1 enumC1721630uu1, List list, String str2, String str3, Amount amount, String str4, String str5, int i) {
        String str6 = str5;
        String str7 = str4;
        Amount amount2 = amount;
        String str8 = str3;
        String str9 = str2;
        List list2 = list;
        EnumC1721630uu1 enumC1721630uu12 = enumC1721630uu1;
        String str10 = str;
        SubmitPaymentResponse submitPaymentResponse2 = submitPaymentResponse;
        EnumC1721510utp enumC1721510utp3 = enumC1721510utp2;
        EnumC488160JCk enumC488160JCk4 = enumC488160JCk3;
        EnumC488160JCk enumC488160JCk5 = enumC488160JCk2;
        UserDisplayInfo userDisplayInfo2 = userDisplayInfo;
        EnumC1721510utp enumC1721510utp4 = enumC1721510utp;
        EnumC488160JCk enumC488160JCk6 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk6 = c1721620uu0.LL;
        }
        if ((i & 2) != 0) {
            enumC1721510utp4 = c1721620uu0.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            userDisplayInfo2 = c1721620uu0.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC488160JCk5 = c1721620uu0.LLILZ;
        }
        if ((i & 16) != 0) {
            enumC488160JCk4 = c1721620uu0.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC1721510utp3 = c1721620uu0.LLILZLL;
        }
        if ((i & 64) != 0) {
            submitPaymentResponse2 = c1721620uu0.LLIZ;
        }
        if ((i & 128) != 0) {
            str10 = c1721620uu0.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            enumC1721630uu12 = c1721620uu0.LLJ;
        }
        if ((i & 512) != 0) {
            list2 = c1721620uu0.LLJI;
        }
        if ((i & 1024) != 0) {
            str9 = c1721620uu0.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = c1721620uu0.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            amount2 = c1721620uu0.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            str7 = c1721620uu0.LLJILLL;
        }
        if ((i & 16384) != 0) {
            str6 = c1721620uu0.LLJJ;
        }
        c1721620uu0.getClass();
        EnumC1721510utp enumC1721510utp5 = enumC1721510utp4;
        return new C1721620uu0(enumC488160JCk6, enumC1721510utp5, userDisplayInfo2, enumC488160JCk5, enumC488160JCk4, enumC1721510utp3, submitPaymentResponse2, str10, enumC1721630uu12, list2, str9, str8, amount2, str7, str6);
    }
}
