package X;

import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664740Q5o implements InterfaceC0148002o {
    public final C291001Au<EnumC664680Q5i> LL;
    public final C291001Au<C0Q69> LLILLJJLI;
    public final C0Q6D LLILLL;
    public final C0Q6E LLILZ;
    public final AbstractC1623806Xk<CaptionItemModel> LLILZIL;
    public final C291001Au<C0Q5F> LLILZLL;

    public C664740Q5o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664740Q5o)) {
            return false;
        }
        C664740Q5o c664740Q5o = (C664740Q5o) obj;
        return Intrinsics.LJFF(this.LL, c664740Q5o.LL) && Intrinsics.LJFF(this.LLILLJJLI, c664740Q5o.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c664740Q5o.LLILLL) && Intrinsics.LJFF(this.LLILZ, c664740Q5o.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c664740Q5o.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c664740Q5o.LLILZLL);
    }

    public final int hashCode() {
        C291001Au<EnumC664680Q5i> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C0Q69> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C0Q6D c0q6d = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c0q6d == null ? 0 : c0q6d.hashCode())) * 31;
        C0Q6E c0q6e = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (c0q6e == null ? 0 : c0q6e.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<C0Q5F> c291001Au3 = this.LLILZLL;
        return iHashCode4 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCLASubtitleState(subtitleEnabledChanged=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateSubtitleTextEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onSubLoadFinished=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onSubSwitchCompleted=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", subtitleTranslationRequest=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", switchSubtitle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C664740Q5o(int i) {
        this(null, null, null, null, C491101vh.LIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C664740Q5o(C291001Au<? extends EnumC664680Q5i> c291001Au, C291001Au<C0Q69> c291001Au2, C0Q6D c0q6d, C0Q6E c0q6e, AbstractC1623806Xk<CaptionItemModel> abstractC1623806Xk, C291001Au<C0Q5F> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c0q6d;
        this.LLILZ = c0q6e;
        this.LLILZIL = abstractC1623806Xk;
        this.LLILZLL = c291001Au3;
    }

    public static C664740Q5o LIZ(C664740Q5o c664740Q5o, C291001Au c291001Au, C291001Au c291001Au2, C0Q6D c0q6d, C0Q6E c0q6e, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C0Q6E c0q6e2 = c0q6e;
        C0Q6D c0q6d2 = c0q6d;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au6 = c664740Q5o.LL;
        }
        if ((i & 2) != 0) {
            c291001Au5 = c664740Q5o.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c0q6d2 = c664740Q5o.LLILLL;
        }
        if ((i & 8) != 0) {
            c0q6e2 = c664740Q5o.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk2 = c664740Q5o.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c664740Q5o.LLILZLL;
        }
        c664740Q5o.getClass();
        return new C664740Q5o(c291001Au6, c291001Au5, c0q6d2, c0q6e2, abstractC1623806Xk2, c291001Au4);
    }
}
