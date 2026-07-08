package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406730mi7 implements InterfaceC1406670mi1 {
    public final CharSequence LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final LogisticLinkRichText LLIZ;
    public final ECRichText LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406730mi7)) {
            return false;
        }
        C1406730mi7 c1406730mi7 = (C1406730mi7) obj;
        return Intrinsics.LJFF(this.LL, c1406730mi7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1406730mi7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1406730mi7.LLILLL) && this.LLILZ == c1406730mi7.LLILZ && this.LLILZIL == c1406730mi7.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1406730mi7.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1406730mi7.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1406730mi7.LLIZLLLIL) && this.LLJ == c1406730mi7.LLJ;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        CharSequence charSequence = this.LL;
        int iHashCode = (((charSequence == null ? 0 : charSequence.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LLILZ) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.LLIZLLLIL;
        return ((iHashCode4 + (eCRichText != null ? eCRichText.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductTextVO(text=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", indexNum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showViewMore=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", reportData=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", linkRichText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", ecRichText=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isDescriptionTextVO=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public /* synthetic */ C1406730mi7(CharSequence charSequence, String str, Integer num, int i, String str2, LogisticLinkRichText logisticLinkRichText, ECRichText eCRichText, boolean z, int i2) {
        this((i2 & 1) != 0 ? null : charSequence, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? 0 : i, false, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : logisticLinkRichText, (i2 & 128) == 0 ? eCRichText : null, (i2 & 256) != 0 ? false : z);
    }

    public C1406730mi7(CharSequence charSequence, String str, Integer num, int i, boolean z, String str2, LogisticLinkRichText logisticLinkRichText, ECRichText eCRichText, boolean z2) {
        this.LL = charSequence;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = logisticLinkRichText;
        this.LLIZLLLIL = eCRichText;
        this.LLJ = z2;
        this.LLJI = EnumC1752690vi7.DESCRIPTION.getValue();
    }
}
