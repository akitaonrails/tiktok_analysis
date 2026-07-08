package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612130s3P extends C09AY implements Function0<C11NZ<PaidContentVideoListResponse>> {
    public final /* synthetic */ C1612380s3o LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ PineDramaMidInsertRequest LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612130s3P(PineDramaMidInsertRequest pineDramaMidInsertRequest, C1612380s3o c1612380s3o, Boolean bool, String str, String str2, String str3, List list, List list2) {
        super(0);
        this.LL = c1612380s3o;
        this.LLILLJJLI = bool;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = pineDramaMidInsertRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<PaidContentVideoListResponse> invoke() {
        String strLJFF;
        String strLJFF2;
        try {
            C1612380s3o c1612380s3o = this.LL;
            long j = c1612380s3o.LIZ;
            long j2 = c1612380s3o.LIZIZ;
            long j3 = c1612380s3o.LIZJ;
            String str = c1612380s3o.LIZLLL;
            if (str == null) {
                str = "";
            }
            int value = c1612380s3o.LJ.getValue();
            int iLIZ = C1611620s2a.LIZ();
            String str2 = this.LL.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            Boolean bool = this.LLILLJJLI;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LL.LJI);
            int iIntValue = numLJIIJJI != null ? numLJIIJJI.intValue() : 1;
            Iterable iterable = this.LLILLL;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ == null) {
                strLJJLIIIJ = "";
            }
            Iterable iterable2 = this.LLILZ;
            if (iterable2 == null) {
                iterable2 = C13BV.INSTANCE;
            }
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(iterable2, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ2 == null) {
                strLJJLIIIJ2 = "";
            }
            String str3 = this.LLILZIL;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            ISeriesAdService iSeriesAdService = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null);
            if (iSeriesAdService == null || (strLJFF = iSeriesAdService.LJFF(false)) == null) {
                strLJFF = "";
            }
            ISeriesAdService iSeriesAdService2 = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null);
            if (iSeriesAdService2 == null || (strLJFF2 = iSeriesAdService2.LJFF(true)) == null) {
                strLJFF2 = "";
            }
            String str5 = this.LL.LJII;
            SeriesDetailApi.GetPaidCollectionDetailApi.InnerFeedRequest innerFeedRequest = new SeriesDetailApi.GetPaidCollectionDetailApi.InnerFeedRequest(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, Integer.valueOf(value), Integer.valueOf(iLIZ), Boolean.FALSE, str2, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue), str3, str4, strLJJLIIIJ, strLJJLIIIJ2, strLJFF, strLJFF2, str5 != null ? str5 : "", this.LLIZ, this.LLIZLLLIL);
            SeriesDetailApi.GetPaidCollectionDetailApi getPaidCollectionDetailApiLIZ = C1612110s3N.LIZ();
            if (getPaidCollectionDetailApiLIZ != null) {
                return (C2087708Fv.LIZ() ? getPaidCollectionDetailApiLIZ.postPaidCollectionVideoListV3(innerFeedRequest, C1697810uHb.LJIILJJIL(new C080U("check_preload", "true")), null) : getPaidCollectionDetailApiLIZ.getPaidCollectionVideoListV3(innerFeedRequest.LIZ(), C1697810uHb.LJIILJJIL(new C080U("check_preload", "true")), null)).LJIIL(new C09JN() { // from class: X.00Oo
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SeriesDetailApi$Companion@17d.getPaidCollectionVideoListExp$1$1$1");
                        C1C7U.LIZIZ("SeriesDetailApi$Companion@17d.getPaidCollectionVideoListExp$1$1$1");
                    }
                }).LJJIJLIJ().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0s81
                    /* JADX WARN: Removed duplicated region for block: B:145:0x02e0  */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
                    @Override // X.InterfaceC1487280oo2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r53) {
                        /*
                            Method dump skipped, instruction units count: 817
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1614990s81.apply(java.lang.Object):java.lang.Object");
                    }
                });
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        return C11IR.LL;
    }
}
