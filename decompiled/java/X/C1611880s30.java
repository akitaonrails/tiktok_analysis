package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611880s30 implements InterfaceC1891350zJl {
    public final PaidVideoItem LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentDetailVideoPowerItem(model=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLimitedFree=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isViewerSelfCreator=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasPurchasedVideo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasPurchasedSeries=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isSingleVideoPurchaseEnabled=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isLastEpisode=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL.paidVideoId);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Boolean boolIsSubscriptionActive;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        if (interfaceC1891350zJl instanceof C1611880s30) {
            C1611880s30 c1611880s30 = (C1611880s30) interfaceC1891350zJl;
            PaidVideoItem paidVideoItem = c1611880s30.LL;
            if (paidVideoItem.paidVideoId == this.LL.paidVideoId && c1611880s30.LLILLL == this.LLILLL && c1611880s30.LLILZ == this.LLILZ && c1611880s30.LLILZIL == this.LLILZIL) {
                Aweme aweme = paidVideoItem.aweme;
                Boolean boolIsSubscriptionActive2 = null;
                if (aweme != null && (paidContentInfo2 = aweme.mPaidContentInfo) != null) {
                    boolIsSubscriptionActive = paidContentInfo2.isSubscriptionActive();
                } else {
                    boolIsSubscriptionActive = null;
                }
                Aweme aweme2 = this.LL.aweme;
                if (aweme2 != null && (paidContentInfo = aweme2.mPaidContentInfo) != null) {
                    boolIsSubscriptionActive2 = paidContentInfo.isSubscriptionActive();
                }
                if (Intrinsics.LJFF(boolIsSubscriptionActive, boolIsSubscriptionActive2) && c1611880s30.LLIZ == this.LLIZ && c1611880s30.LL.isLastWatched() == this.LL.isLastWatched() && c1611880s30.LLIZLLLIL == this.LLIZLLLIL) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1611880s30) {
            if (((C1611880s30) interfaceC1891350zJl).LL.paidVideoId == this.LL.paidVideoId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1611880s30) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            if (areItemTheSame(interfaceC1891350zJl) && areContentsTheSame(interfaceC1891350zJl)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1611880s30) {
            return new Object() { // from class: X.0s79
            };
        }
        return null;
    }

    public static C1611880s30 LIZ(C1611880s30 c1611880s30, PaidVideoItem paidVideoItem, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = z2;
        boolean z9 = z;
        PaidVideoItem paidVideoItem2 = paidVideoItem;
        if ((i & 1) != 0) {
            paidVideoItem2 = c1611880s30.LL;
        }
        if ((i & 2) != 0) {
            z3 = c1611880s30.LLILLJJLI;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = c1611880s30.LLILLL;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z9 = c1611880s30.LLILZ;
        }
        if ((i & 16) != 0) {
            z8 = c1611880s30.LLILZIL;
        }
        if ((i & 32) != 0) {
            z5 = c1611880s30.LLILZLL;
        } else {
            z5 = false;
        }
        if ((i & 64) != 0) {
            z6 = c1611880s30.LLIZ;
        } else {
            z6 = false;
        }
        if ((i & 128) != 0) {
            z7 = c1611880s30.LLIZLLLIL;
        } else {
            z7 = false;
        }
        c1611880s30.getClass();
        return new C1611880s30(paidVideoItem2, z3, z4, z9, z8, z5, z6, z7);
    }

    public C1611880s30(PaidVideoItem paidVideoItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LL = paidVideoItem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
        this.LLIZ = z6;
        this.LLIZLLLIL = z7;
    }

    public /* synthetic */ C1611880s30(PaidVideoItem paidVideoItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        this(paidVideoItem, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7);
    }
}
