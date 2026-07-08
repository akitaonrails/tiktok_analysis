package Y;

import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C2188811AlT;
import X.C2286608xc;
import X.C614390O7x;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class AgS0S0231100_18 implements InterfaceC346701Wf {
    public final int $t;
    public int i5;
    public long j6;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS0S0231100_18 agS0S0231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy2;
        C0O7A c0o7a = (C0O7A) obj;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy = null;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2 = null;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy3 = null;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dislike - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) agS0S0231100_18.l0;
                int i = agS0S0231100_18.i5;
                boolean z = agS0S0231100_18.z4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
                boolean z2 = agS0S0231100_18.z2;
                long jMax = agS0S0231100_18.j6;
                if (z) {
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy2 = userStatus.copy(false, Boolean.valueOf(z));
                    } else {
                        poiReviewUserStatusModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        if (z2) {
                            jMax = Math.max(0L, jMax - 1);
                        }
                        poiReviewStatisticsModelCopy2 = statistics.copy(C2286608xc.LJFF(jMax));
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy2, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy3 = userStatus2.copy(userStatus2.liked, false);
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewUserStatusModelCopy3, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                poiDetailReviewsViewModel.vQ2(i, poiReviewModelCopy);
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dislike - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiDetailReviewsViewModel poiDetailReviewsViewModel2 = (PoiDetailReviewsViewModel) agS0S0231100_18.l0;
            int i2 = agS0S0231100_18.i5;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = ((PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1).getUserStatus();
            if (userStatus3 != null) {
                poiReviewUserStatusModelCopy = userStatus3.copy(Boolean.valueOf(agS0S0231100_18.z2), Boolean.valueOf(agS0S0231100_18.z3));
            } else {
                poiReviewUserStatusModelCopy = null;
            }
            PoiReviewsApi.PoiReviewStatisticsModel statistics2 = ((PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1).getStatistics();
            if (statistics2 != null) {
                poiReviewStatisticsModelCopy = statistics2.copy(C2286608xc.LJFF(agS0S0231100_18.j6));
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
            poiDetailReviewsViewModel2.vQ2(i2, poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS0S0231100_18 agS0S0231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy2;
        C0O7A c0o7a = (C0O7A) obj;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy = null;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2 = null;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy3 = null;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dislike - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                PoiReviewsListViewModel poiReviewsListViewModel = (PoiReviewsListViewModel) agS0S0231100_18.l0;
                int i = agS0S0231100_18.i5;
                boolean z = agS0S0231100_18.z4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
                boolean z2 = agS0S0231100_18.z2;
                long jMax = agS0S0231100_18.j6;
                if (z) {
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy2 = userStatus.copy(false, Boolean.valueOf(z));
                    } else {
                        poiReviewUserStatusModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        if (z2) {
                            jMax = Math.max(0L, jMax - 1);
                        }
                        poiReviewStatisticsModelCopy2 = statistics.copy(C2286608xc.LJFF(jMax));
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy2, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy3 = userStatus2.copy(userStatus2.liked, false);
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewUserStatusModelCopy3, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                poiReviewsListViewModel.listSetItemAt(i, poiReviewModelCopy);
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dislike - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiReviewsListViewModel poiReviewsListViewModel2 = (PoiReviewsListViewModel) agS0S0231100_18.l0;
            int i2 = agS0S0231100_18.i5;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = ((PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1).getUserStatus();
            if (userStatus3 != null) {
                poiReviewUserStatusModelCopy = userStatus3.copy(Boolean.valueOf(agS0S0231100_18.z2), Boolean.valueOf(agS0S0231100_18.z3));
            } else {
                poiReviewUserStatusModelCopy = null;
            }
            PoiReviewsApi.PoiReviewStatisticsModel statistics2 = ((PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1).getStatistics();
            if (statistics2 != null) {
                poiReviewStatisticsModelCopy = statistics2.copy(C2286608xc.LJFF(agS0S0231100_18.j6));
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
            poiReviewsListViewModel2.listSetItemAt(i2, poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI));
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS0S0231100_18 agS0S0231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        C0O7A c0o7a = (C0O7A) obj;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy = null;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                PoiCommentReviewListVM poiCommentReviewListVM = (PoiCommentReviewListVM) agS0S0231100_18.l0;
                int i = agS0S0231100_18.i5;
                boolean z = agS0S0231100_18.z4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
                long j = agS0S0231100_18.j6;
                if (z) {
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        poiReviewStatisticsModelCopy3 = statistics.copy(C2286608xc.LJFF(j + 1));
                    } else {
                        poiReviewStatisticsModelCopy3 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy = userStatus.copy(Boolean.valueOf(z), false);
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                    if (statistics2 != null) {
                        poiReviewStatisticsModelCopy2 = statistics2.copy(C2286608xc.LJFF(Math.max(0L, j - 1)));
                    } else {
                        poiReviewStatisticsModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy = userStatus2.copy(false, false);
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                poiCommentReviewListVM.listSetItemAt(i, poiReviewModelCopy);
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("like - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiCommentReviewListVM poiCommentReviewListVM2 = (PoiCommentReviewListVM) agS0S0231100_18.l0;
            int i2 = agS0S0231100_18.i5;
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1;
            PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModel2.getStatistics();
            if (statistics3 != null) {
                poiReviewStatisticsModelCopy = statistics3.copy(C2286608xc.LJFF(agS0S0231100_18.j6));
            } else {
                poiReviewStatisticsModelCopy = null;
            }
            PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = ((PoiReviewsApi.PoiReviewModel) agS0S0231100_18.l1).getUserStatus();
            if (userStatus3 != null) {
                poiReviewUserStatusModelCopy = userStatus3.copy(Boolean.valueOf(agS0S0231100_18.z2), Boolean.valueOf(agS0S0231100_18.z3));
            }
            poiCommentReviewListVM2.listSetItemAt(i2, poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI));
        }
        return Unit.LIZ;
    }

    public AgS0S0231100_18(Object obj, int i, Object obj2, boolean z, boolean z2, long j, boolean z3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i5 = i;
        this.l1 = obj2;
        this.z2 = z;
        this.z3 = z2;
        this.j6 = j;
        this.z4 = z3;
    }
}
