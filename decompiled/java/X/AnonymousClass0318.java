package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0318, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0318 extends AbstractC756202xM {
    public final BonusModule LLILZLL;
    public final String LLIZ;
    public final ECRichText LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0318)) {
            return false;
        }
        AnonymousClass0318 anonymousClass0318 = (AnonymousClass0318) obj;
        return Intrinsics.LJFF(this.LLILZLL, anonymousClass0318.LLILZLL) && Intrinsics.LJFF(this.LLIZ, anonymousClass0318.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, anonymousClass0318.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ECRichText eCRichText = this.LLIZLLLIL;
        return iHashCode2 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaBonusInfoVO(bonusModule=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", totalDesc=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", totalDescRichText=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(AnonymousClass0318.class, interfaceC1891350zJl.getClass());
    }

    public AnonymousClass0318(BonusModule bonusModule, String str, ECRichText eCRichText) {
        this.LLILZLL = bonusModule;
        this.LLIZ = str;
        this.LLIZLLLIL = eCRichText;
    }
}
