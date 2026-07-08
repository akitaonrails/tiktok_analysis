package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890930zJ5 implements InterfaceC1891350zJl {
    public final String LL;
    public final IMFromMessageTips LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final Map<String, String> LLJJI;
    public final Map<String, String> LLJJIII;
    public final Function0<Unit> LLJJIJI;

    public C1890930zJ5() {
        this(null, 262143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1890930zJ5)) {
            return false;
        }
        C1890930zJ5 c1890930zJ5 = (C1890930zJ5) obj;
        return Intrinsics.LJFF(this.LL, c1890930zJ5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1890930zJ5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1890930zJ5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1890930zJ5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1890930zJ5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1890930zJ5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1890930zJ5.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1890930zJ5.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1890930zJ5.LLJ) && Intrinsics.LJFF(this.LLJI, c1890930zJ5.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1890930zJ5.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1890930zJ5.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1890930zJ5.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1890930zJ5.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1890930zJ5.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1890930zJ5.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1890930zJ5.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1890930zJ5.LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        IMFromMessageTips iMFromMessageTips = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (iMFromMessageTips == null ? 0 : iMFromMessageTips.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJILJ;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LLJILLL;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LLJJ;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, String> map = this.LLJJI;
        int iHashCode16 = (iHashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LLJJIII;
        int iHashCode17 = (iHashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Function0<Unit> function0 = this.LLJJIJI;
        return iHashCode17 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "DMCommonBannerItem(noticeCode=" + this.LL + ", msgTips=" + this.LLILLJJLI + ", isCommonDM=" + this.LLILLL + ", jumpUrl=" + this.LLILZ + ", avatarUrl=" + this.LLILZIL + ", tuxIconName=" + this.LLILZLL + ", tuxIconColor=" + this.LLIZ + ", buttonTitle=" + this.LLIZLLLIL + ", subtitle=" + this.LLJ + ", buttonType=" + this.LLJI + ", dotIconName=" + this.LLJIJIL + ", dotIconBackgroundColorName=" + this.LLJILJIL + ", isBackgroundCanClick=" + this.LLJILJILJ + ", isWhenClickDismiss=" + this.LLJILLL + ", shouldAutoCloseWhenPageDismiss=" + this.LLJJ + ", trackParams=" + this.LLJJI + ", exParams=" + this.LLJJIII + ", dismissListener=" + this.LLJJIJI + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1890930zJ5(AwS572S0100000_28 awS572S0100000_28, int i) {
        String str;
        String str2;
        String str3;
        AwS572S0100000_28 awS572S0100000_282 = awS572S0100000_28;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str3 = "1";
        } else {
            str3 = null;
        }
        this(str, null, null, null, null, null, null, null, null, str2, null, null, str3, null, null, null, null, (i & 131072) != 0 ? null : awS572S0100000_282);
    }

    public C1890930zJ5(String str, IMFromMessageTips iMFromMessageTips, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map, Map<String, String> map2, Function0<Unit> function0) {
        this.LL = str;
        this.LLILLJJLI = iMFromMessageTips;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = str12;
        this.LLJILLL = str13;
        this.LLJJ = str14;
        this.LLJJI = map;
        this.LLJJIII = map2;
        this.LLJJIJI = function0;
    }

    public static C1890930zJ5 LIZ(C1890930zJ5 c1890930zJ5, String str, IMFromMessageTips iMFromMessageTips, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map map, Map map2) {
        Function0<Unit> function0 = c1890930zJ5.LLJJIJI;
        c1890930zJ5.getClass();
        return new C1890930zJ5(str, iMFromMessageTips, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, map, map2, function0);
    }
}
