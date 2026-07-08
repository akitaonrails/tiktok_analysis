package X;

import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.044t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10397044t {
    public final IPdpStarter.PdpEnterParam LIZ;
    public final String[] LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final List<SkuItem> LJI;
    public final String LJII;
    public final OneClickPayContext LJIIIIZZ;
    public final Integer LJIIIZ;
    public final Map<String, Object> LJIIJ;
    public final AnonymousClass0449 LJIIJJI;
    public final GodaV2RequestParams LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10397044t)) {
            return false;
        }
        C10397044t c10397044t = (C10397044t) obj;
        return Intrinsics.LJFF(this.LIZ, c10397044t.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10397044t.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c10397044t.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c10397044t.LIZLLL) && Intrinsics.LJFF(this.LJ, c10397044t.LJ) && Intrinsics.LJFF(this.LJFF, c10397044t.LJFF) && Intrinsics.LJFF(this.LJI, c10397044t.LJI) && Intrinsics.LJFF(this.LJII, c10397044t.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c10397044t.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c10397044t.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c10397044t.LJIIJ) && this.LJIIJJI == c10397044t.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c10397044t.LJIIL);
    }

    public final int hashCode() {
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ;
        int iHashCode = (pdpEnterParam == null ? 0 : pdpEnterParam.hashCode()) * 31;
        String[] strArr = this.LIZIZ;
        int iHashCode2 = (iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SkuItem> list = this.LJI;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OneClickPayContext oneClickPayContext = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (oneClickPayContext == null ? 0 : oneClickPayContext.hashCode())) * 31;
        Integer num3 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map<String, Object> map = this.LJIIJ;
        int iHashCode11 = (((iHashCode10 + (map == null ? 0 : map.hashCode())) * 31) + this.LJIIJJI.hashCode()) * 31;
        GodaV2RequestParams godaV2RequestParams = this.LJIIL;
        return iHashCode11 + (godaV2RequestParams != null ? godaV2RequestParams.hashCode() : 0);
    }

    public final String toString() {
        return "PdpRefreshParams(enterParams=" + this.LIZ + ", checkedSkuIds=" + Arrays.toString(this.LIZIZ) + ", defaultSkuId=" + this.LIZJ + ", productQuantity=" + this.LIZLLL + ", pdpToLogisticListInfo=" + this.LJ + ", purchaseMethod=" + this.LJFF + ", skus=" + this.LJI + ", addressId=" + this.LJII + ", ocpContext=" + this.LJIIIIZZ + ", skuPanelDisplayMode=" + this.LJIIIZ + ", originalSkuInfoForExchange=" + this.LJIIJ + ", pdpRefreshAction=" + this.LJIIJJI + ", godaV2RequestParams=" + this.LJIIL + ')';
    }

    public C10397044t(IPdpStarter.PdpEnterParam pdpEnterParam, String[] strArr, String str, Integer num, String str2, Integer num2, List<SkuItem> list, String str3, OneClickPayContext oneClickPayContext, Integer num3, Map<String, ? extends Object> map, AnonymousClass0449 anonymousClass0449, GodaV2RequestParams godaV2RequestParams) {
        this.LIZ = pdpEnterParam;
        this.LIZIZ = strArr;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = num2;
        this.LJI = list;
        this.LJII = str3;
        this.LJIIIIZZ = oneClickPayContext;
        this.LJIIIZ = num3;
        this.LJIIJ = map;
        this.LJIIJJI = anonymousClass0449;
        this.LJIIL = godaV2RequestParams;
    }
}
