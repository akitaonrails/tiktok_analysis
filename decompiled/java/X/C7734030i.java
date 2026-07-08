package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.030i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7734030i extends AbstractC756202xM {
    public final boolean LLILZLL;
    public final LinkRichText LLIZ;
    public final Integer LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7734030i)) {
            return false;
        }
        C7734030i c7734030i = (C7734030i) obj;
        return this.LLILZLL == c7734030i.LLILZLL && Intrinsics.LJFF(this.LLIZ, c7734030i.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c7734030i.LLIZLLLIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LLILZLL) * 31;
        LinkRichText linkRichText = this.LLIZ;
        int iHashCode = (iZ2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PolicyVO(reachable=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", privacyPolicyStatement=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", backgroundStyle=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJI;
    }

    public /* synthetic */ C7734030i(LinkRichText linkRichText) {
        this(linkRichText, 0);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C7734030i.class, interfaceC1891350zJl.getClass());
    }

    public C7734030i(LinkRichText linkRichText, Integer num) {
        this.LLILZLL = true;
        this.LLIZ = linkRichText;
        this.LLIZLLLIL = num;
        this.LLJ = "privacy_policy_statement";
        this.LLJI = "privacy_policy_statement_item";
    }
}
