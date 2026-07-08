package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedUiConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0viZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752970viZ implements InterfaceC746802vq {
    public final String LL;
    public final int LLILLJJLI;
    public final ProductTile LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final C1555990qar LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final RecommendFeedUiConfig LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1752970viZ)) {
            return false;
        }
        C1752970viZ c1752970viZ = (C1752970viZ) obj;
        return Intrinsics.LJFF(this.LL, c1752970viZ.LL) && this.LLILLJJLI == c1752970viZ.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1752970viZ.LLILLL) && this.LLILZ == c1752970viZ.LLILZ && this.LLILZIL == c1752970viZ.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1752970viZ.LLILZLL) && this.LLIZ == c1752970viZ.LLIZ && this.LLIZLLLIL == c1752970viZ.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1752970viZ.LLJ) && Intrinsics.LJFF(this.LLJI, c1752970viZ.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1752970viZ.LLJIJIL);
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
        int iHashCode = ((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        String str = this.LLJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJI;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RecommendFeedUiConfig recommendFeedUiConfig = this.LLJIJIL;
        return iHashCode3 + (recommendFeedUiConfig != null ? recommendFeedUiConfig.hashCode() : 0);
    }

    public final String toString() {
        return "FeedItem(scene=" + this.LL + ", pos=" + this.LLILLJJLI + ", feed=" + this.LLILLL + ", serverTime=" + this.LLILZ + ", createTime=" + this.LLILZIL + ", btmInfo=" + this.LLILZLL + ", showPromotionOrSalesText=" + this.LLIZ + ", showStrikeThroughPrice=" + this.LLIZLLLIL + ", daInfo=" + this.LLJ + ", requestId=" + this.LLJI + ", uiConfig=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public C1752970viZ(String str, int i, ProductTile productTile, long j, long j2, C1555990qar c1555990qar, boolean z, boolean z2, String str2, String str3, RecommendFeedUiConfig recommendFeedUiConfig) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = productTile;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = c1555990qar;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = recommendFeedUiConfig;
    }
}
