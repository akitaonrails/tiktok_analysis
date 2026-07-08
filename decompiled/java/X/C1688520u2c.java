package X;

import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonResponse;
import com.ss.android.ugc.trill.feedback.api.FaqGeneralItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688520u2c implements InterfaceC0148002o {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C1688660u2q LL;
    public List<FaqGeneralItem> LLILLJJLI;
    public final FaqBottomButtonResponse LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688520u2c)) {
            return false;
        }
        C1688520u2c c1688520u2c = (C1688520u2c) obj;
        return Intrinsics.LJFF(this.LL, c1688520u2c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1688520u2c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1688520u2c.LLILLL) && this.LLILZ == c1688520u2c.LLILZ && this.LLILZIL == c1688520u2c.LLILZIL && this.LLILZLL == c1688520u2c.LLILZLL && this.LLIZ == c1688520u2c.LLIZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        FaqBottomButtonResponse faqBottomButtonResponse = this.LLILLL;
        return ((((((((iHashCode + (faqBottomButtonResponse == null ? 0 : faqBottomButtonResponse.hashCode())) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CSPComposeState(historyRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", buttonConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", faqListStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", buttonHasShown=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", safetyCenterHasShown=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1688520u2c(C1688660u2q c1688660u2q, List<FaqGeneralItem> list, FaqBottomButtonResponse faqBottomButtonResponse, int i, int i2, boolean z, boolean z2) {
        this.LL = c1688660u2q;
        this.LLILLJJLI = list;
        this.LLILLL = faqBottomButtonResponse;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }

    public static C1688520u2c LIZ(C1688520u2c c1688520u2c, C1688660u2q c1688660u2q, List list, FaqBottomButtonResponse faqBottomButtonResponse, int i, int i2, boolean z, boolean z2, int i3) {
        boolean z3 = z2;
        boolean z4 = z;
        int i4 = i2;
        int i5 = i;
        FaqBottomButtonResponse faqBottomButtonResponse2 = faqBottomButtonResponse;
        List list2 = list;
        C1688660u2q c1688660u2q2 = c1688660u2q;
        if ((i3 & 1) != 0) {
            c1688660u2q2 = c1688520u2c.LL;
        }
        if ((i3 & 2) != 0) {
            list2 = c1688520u2c.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            faqBottomButtonResponse2 = c1688520u2c.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i5 = c1688520u2c.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c1688520u2c.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            z4 = c1688520u2c.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            z3 = c1688520u2c.LLIZ;
        }
        c1688520u2c.getClass();
        return new C1688520u2c(c1688660u2q2, list2, faqBottomButtonResponse2, i5, i4, z4, z3);
    }
}
