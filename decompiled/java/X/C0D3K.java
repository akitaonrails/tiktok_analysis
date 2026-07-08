package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3K implements Serializable {
    public final C332840D3a bottomBar;
    public final C0D3N dealsInfo;
    public final C0D3L descriptionInfo;
    public final List<String> entrySpuImageUrls;
    public final C0D36 logisticsInfo;
    public final InterfaceC332200D0o moreFromShop;
    public final C0D3Y priceInfo;
    public final String productId;
    public final C0D3I productMedia;
    public final C332470D1p reviewInfo;
    public final C0D3O shopHeader;
    public final C0D3V skuSelection;
    public final C0D3M titleRating;

    public final C0D3K copy(String str, List<String> list, C0D3O c0d3o, C0D3I c0d3i, C0D3Y c0d3y, C0D3M c0d3m, C0D3V c0d3v, C0D3L c0d3l, C0D36 c0d36, C0D3N c0d3n, C332470D1p c332470D1p, InterfaceC332200D0o interfaceC332200D0o, C332840D3a c332840D3a) {
        return new C0D3K(str, list, c0d3o, c0d3i, c0d3y, c0d3m, c0d3v, c0d3l, c0d36, c0d3n, c332470D1p, interfaceC332200D0o, c332840D3a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3K)) {
            return false;
        }
        C0D3K c0d3k = (C0D3K) obj;
        return Intrinsics.LJFF(this.productId, c0d3k.productId) && Intrinsics.LJFF(this.entrySpuImageUrls, c0d3k.entrySpuImageUrls) && Intrinsics.LJFF(this.shopHeader, c0d3k.shopHeader) && Intrinsics.LJFF(this.productMedia, c0d3k.productMedia) && Intrinsics.LJFF(this.priceInfo, c0d3k.priceInfo) && Intrinsics.LJFF(this.titleRating, c0d3k.titleRating) && Intrinsics.LJFF(this.skuSelection, c0d3k.skuSelection) && Intrinsics.LJFF(this.descriptionInfo, c0d3k.descriptionInfo) && Intrinsics.LJFF(this.logisticsInfo, c0d3k.logisticsInfo) && Intrinsics.LJFF(this.dealsInfo, c0d3k.dealsInfo) && Intrinsics.LJFF(this.reviewInfo, c0d3k.reviewInfo) && Intrinsics.LJFF(this.moreFromShop, c0d3k.moreFromShop) && Intrinsics.LJFF(this.bottomBar, c0d3k.bottomBar);
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.entrySpuImageUrls.hashCode()) * 31;
        C0D3O c0d3o = this.shopHeader;
        int iHashCode2 = (iHashCode + (c0d3o == null ? 0 : c0d3o.hashCode())) * 31;
        C0D3I c0d3i = this.productMedia;
        int iHashCode3 = (iHashCode2 + (c0d3i == null ? 0 : c0d3i.hashCode())) * 31;
        C0D3Y c0d3y = this.priceInfo;
        int iHashCode4 = (iHashCode3 + (c0d3y == null ? 0 : c0d3y.hashCode())) * 31;
        C0D3M c0d3m = this.titleRating;
        int iHashCode5 = (iHashCode4 + (c0d3m == null ? 0 : c0d3m.hashCode())) * 31;
        C0D3V c0d3v = this.skuSelection;
        int iHashCode6 = (iHashCode5 + (c0d3v == null ? 0 : c0d3v.hashCode())) * 31;
        C0D3L c0d3l = this.descriptionInfo;
        int iHashCode7 = (iHashCode6 + (c0d3l == null ? 0 : c0d3l.hashCode())) * 31;
        C0D36 c0d36 = this.logisticsInfo;
        int iHashCode8 = (iHashCode7 + (c0d36 == null ? 0 : c0d36.hashCode())) * 31;
        C0D3N c0d3n = this.dealsInfo;
        int iHashCode9 = (iHashCode8 + (c0d3n == null ? 0 : c0d3n.hashCode())) * 31;
        C332470D1p c332470D1p = this.reviewInfo;
        int iHashCode10 = (((iHashCode9 + (c332470D1p == null ? 0 : c332470D1p.hashCode())) * 31) + this.moreFromShop.hashCode()) * 31;
        C332840D3a c332840D3a = this.bottomBar;
        return iHashCode10 + (c332840D3a != null ? c332840D3a.hashCode() : 0);
    }

    public String toString() {
        return "PdpPageData(productId=" + this.productId + ", entrySpuImageUrls=" + this.entrySpuImageUrls + ", shopHeader=" + this.shopHeader + ", productMedia=" + this.productMedia + ", priceInfo=" + this.priceInfo + ", titleRating=" + this.titleRating + ", skuSelection=" + this.skuSelection + ", descriptionInfo=" + this.descriptionInfo + ", logisticsInfo=" + this.logisticsInfo + ", dealsInfo=" + this.dealsInfo + ", reviewInfo=" + this.reviewInfo + ", moreFromShop=" + this.moreFromShop + ", bottomBar=" + this.bottomBar + ')';
    }

    public C0D3K(String str, List<String> list, C0D3O c0d3o, C0D3I c0d3i, C0D3Y c0d3y, C0D3M c0d3m, C0D3V c0d3v, C0D3L c0d3l, C0D36 c0d36, C0D3N c0d3n, C332470D1p c332470D1p, InterfaceC332200D0o interfaceC332200D0o, C332840D3a c332840D3a) {
        this.productId = str;
        this.entrySpuImageUrls = list;
        this.shopHeader = c0d3o;
        this.productMedia = c0d3i;
        this.priceInfo = c0d3y;
        this.titleRating = c0d3m;
        this.skuSelection = c0d3v;
        this.descriptionInfo = c0d3l;
        this.logisticsInfo = c0d36;
        this.dealsInfo = c0d3n;
        this.reviewInfo = c332470D1p;
        this.moreFromShop = interfaceC332200D0o;
        this.bottomBar = c332840D3a;
    }

    public C0D3K(String str, List list, C0D3O c0d3o, C0D3I c0d3i, C0D3Y c0d3y, C0D3M c0d3m, C0D3V c0d3v, C0D3L c0d3l, C0D36 c0d36, C0D3N c0d3n, C332470D1p c332470D1p, InterfaceC332200D0o interfaceC332200D0o, C332840D3a c332840D3a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C13BV.INSTANCE : list, c0d3o, c0d3i, c0d3y, c0d3m, c0d3v, c0d3l, c0d36, c0d3n, c332470D1p, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C332190D0n.INSTANCE : interfaceC332200D0o, c332840D3a);
    }
}
