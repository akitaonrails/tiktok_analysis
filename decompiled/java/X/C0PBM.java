package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBM implements InterfaceC594520NTm, InterfaceC655050Pmh {
    public final FeelgoodSurveyModel LL;
    public final CustomText LLILLJJLI;
    public final Aweme LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;
    public final List<String> LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public final int LLJIJIL;

    public C0PBM() {
        this(null, null, null, false, 0, null, null, null, 0L, 0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PBM)) {
            return false;
        }
        C0PBM c0pbm = (C0PBM) obj;
        return Intrinsics.LJFF(this.LL, c0pbm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pbm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pbm.LLILLL) && this.LLILZ == c0pbm.LLILZ && this.LLILZIL == c0pbm.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0pbm.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0pbm.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0pbm.LLIZLLLIL) && this.LLJ == c0pbm.LLJ && this.LLJI == c0pbm.LLJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        FeelgoodSurveyModel feelgoodSurveyModel = this.LL;
        int iHashCode = (feelgoodSurveyModel == null ? 0 : feelgoodSurveyModel.hashCode()) * 31;
        CustomText customText = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (customText == null ? 0 : customText.hashCode())) * 31;
        Aweme aweme = this.LLILLL;
        int iHashCode3 = (((((iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31;
        Integer num = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLIZ;
        return ((((((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJ)) * 31) + this.LLJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSatisfactionSurveyData(feelgoodSurveyModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", customText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", curAweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLeftArrow=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mobRankOverride=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", parentUniversalRank=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", relatedAidList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showTime=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", hasChooseRate=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0PBM(FeelgoodSurveyModel feelgoodSurveyModel, CustomText customText, Aweme aweme, boolean z, int i, Integer num, Integer num2, List list, long j, int i2, int i3) {
        feelgoodSurveyModel = (i3 & 1) != 0 ? null : feelgoodSurveyModel;
        customText = (i3 & 2) != 0 ? null : customText;
        aweme = (i3 & 4) != 0 ? null : aweme;
        z = (i3 & 8) != 0 ? false : z;
        i = (i3 & 16) != 0 ? -1 : i;
        num = (i3 & 32) != 0 ? null : num;
        num2 = (i3 & 64) != 0 ? null : num2;
        list = (i3 & 128) != 0 ? C13BV.INSTANCE : list;
        j = (i3 & 256) != 0 ? -1L : j;
        i2 = (i3 & 512) != 0 ? 0 : i2;
        this.LL = feelgoodSurveyModel;
        this.LLILLJJLI = customText;
        this.LLILLL = aweme;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = num;
        this.LLIZ = num2;
        this.LLIZLLLIL = list;
        this.LLJ = j;
        this.LLJI = i2;
        this.LLJIJIL = C321460Ciu.LIZ();
    }
}
