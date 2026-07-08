package Y;

import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C1184990gwT;
import X.C1189970h4V;
import X.C1440005kM;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2286608xc;
import X.C614390O7x;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsFoldedReviewsSheetViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AgS0S1231100_18 implements InterfaceC346701Wf {
    public final int $t;
    public int i6;
    public long j7;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;
    public boolean z5;

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

    public static final Object emit$0(AgS0S1231100_18 agS0S1231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy;
        long jLongValue;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy2;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        int i;
        Long l;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy3;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                boolean z = agS0S1231100_18.z5;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
                long j = agS0S1231100_18.j7;
                String str = agS0S1231100_18.s0;
                PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) agS0S1231100_18.l2;
                int i2 = agS0S1231100_18.i6;
                if (z) {
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        poiReviewStatisticsModelCopy3 = statistics.copy(C2286608xc.LJFF(j + 1));
                    } else {
                        poiReviewStatisticsModelCopy3 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy3 = userStatus.copy(Boolean.valueOf(z), false);
                    } else {
                        poiReviewUserStatusModelCopy3 = null;
                    }
                    jLongValue = 0;
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy3, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    jLongValue = 0;
                    PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                    if (statistics2 != null) {
                        poiReviewStatisticsModelCopy2 = statistics2.copy(C2286608xc.LJFF(Math.max(0L, j - 1)));
                    } else {
                        poiReviewStatisticsModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy2 = userStatus2.copy(false, false);
                    } else {
                        poiReviewUserStatusModelCopy2 = null;
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy2, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                if (poiReviewModelCopy != null) {
                    poiDetailReviewsViewModel.vQ2(i2, poiReviewModelCopy);
                }
                if (C1184990gwT.LIZ()) {
                    String reviewId = poiReviewModelCopy.getReviewId();
                    PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModelCopy.getStatistics();
                    if (statistics3 != null && (l = statistics3.likeCount) != null) {
                        jLongValue = l.longValue();
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModelCopy.getUserStatus();
                    if (userStatus3 != null && Intrinsics.LJFF(userStatus3.liked, true)) {
                        i = 1;
                    } else {
                        PoiReviewsApi.PoiReviewUserStatusModel userStatus4 = poiReviewModelCopy.getUserStatus();
                        if (userStatus4 != null && Intrinsics.LJFF(userStatus4.disliked, true)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                    }
                    C1440005kM.LIZ(new C1189970h4V(i, str, jLongValue, reviewId));
                }
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("like - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
            PoiReviewsApi.PoiReviewStatisticsModel statistics4 = poiReviewModel2.getStatistics();
            if (statistics4 != null) {
                poiReviewStatisticsModelCopy = statistics4.copy(C2286608xc.LJFF(agS0S1231100_18.j7));
            } else {
                poiReviewStatisticsModelCopy = null;
            }
            PoiReviewsApi.PoiReviewUserStatusModel userStatus5 = ((PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1).getUserStatus();
            if (userStatus5 != null) {
                poiReviewUserStatusModelCopy = userStatus5.copy(Boolean.valueOf(agS0S1231100_18.z3), Boolean.valueOf(agS0S1231100_18.z4));
            } else {
                poiReviewUserStatusModelCopy = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy2 = poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI);
            if (poiReviewModelCopy2 != null) {
                ((PoiDetailReviewsViewModel) agS0S1231100_18.l2).vQ2(agS0S1231100_18.i6, poiReviewModelCopy2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS0S1231100_18 agS0S1231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy;
        long jLongValue;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy2;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        int i;
        Long l;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy3;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                boolean z = agS0S1231100_18.z5;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
                long j = agS0S1231100_18.j7;
                String str = agS0S1231100_18.s0;
                PoiReviewsFoldedReviewsSheetViewModel poiReviewsFoldedReviewsSheetViewModel = (PoiReviewsFoldedReviewsSheetViewModel) agS0S1231100_18.l2;
                int i2 = agS0S1231100_18.i6;
                if (z) {
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        poiReviewStatisticsModelCopy3 = statistics.copy(C2286608xc.LJFF(j + 1));
                    } else {
                        poiReviewStatisticsModelCopy3 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy3 = userStatus.copy(Boolean.valueOf(z), false);
                    } else {
                        poiReviewUserStatusModelCopy3 = null;
                    }
                    jLongValue = 0;
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy3, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    jLongValue = 0;
                    PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                    if (statistics2 != null) {
                        poiReviewStatisticsModelCopy2 = statistics2.copy(C2286608xc.LJFF(Math.max(0L, j - 1)));
                    } else {
                        poiReviewStatisticsModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy2 = userStatus2.copy(false, false);
                    } else {
                        poiReviewUserStatusModelCopy2 = null;
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy2, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                if (poiReviewModelCopy != null && (c20600815jK = poiReviewsFoldedReviewsSheetViewModel.LLJ) != null) {
                    c20600815jK.LJIILJJIL(i2, poiReviewModelCopy);
                }
                if (C1184990gwT.LIZ()) {
                    String reviewId = poiReviewModelCopy.getReviewId();
                    PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModelCopy.getStatistics();
                    if (statistics3 != null && (l = statistics3.likeCount) != null) {
                        jLongValue = l.longValue();
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModelCopy.getUserStatus();
                    if (userStatus3 != null && Intrinsics.LJFF(userStatus3.liked, true)) {
                        i = 1;
                    } else {
                        PoiReviewsApi.PoiReviewUserStatusModel userStatus4 = poiReviewModelCopy.getUserStatus();
                        if (userStatus4 != null && Intrinsics.LJFF(userStatus4.disliked, true)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                    }
                    C1440005kM.LIZ(new C1189970h4V(i, str, jLongValue, reviewId));
                }
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("like - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
            PoiReviewsApi.PoiReviewStatisticsModel statistics4 = poiReviewModel2.getStatistics();
            if (statistics4 != null) {
                poiReviewStatisticsModelCopy = statistics4.copy(C2286608xc.LJFF(agS0S1231100_18.j7));
            } else {
                poiReviewStatisticsModelCopy = null;
            }
            PoiReviewsApi.PoiReviewUserStatusModel userStatus5 = ((PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1).getUserStatus();
            if (userStatus5 != null) {
                poiReviewUserStatusModelCopy = userStatus5.copy(Boolean.valueOf(agS0S1231100_18.z3), Boolean.valueOf(agS0S1231100_18.z4));
            } else {
                poiReviewUserStatusModelCopy = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy2 = poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI);
            if (poiReviewModelCopy2 != null) {
                PoiReviewsFoldedReviewsSheetViewModel poiReviewsFoldedReviewsSheetViewModel2 = (PoiReviewsFoldedReviewsSheetViewModel) agS0S1231100_18.l2;
                int i3 = agS0S1231100_18.i6;
                C20600815jK<InterfaceC1891350zJl> c20600815jK2 = poiReviewsFoldedReviewsSheetViewModel2.LLJ;
                if (c20600815jK2 != null) {
                    c20600815jK2.LJIILJJIL(i3, poiReviewModelCopy2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS0S1231100_18 agS0S1231100_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy;
        long jLongValue;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy2;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        int i;
        Long l;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy3;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like - motaSuccess: ");
            sbLIZ.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ);
            BaseResponse baseResponse = ((C614390O7x) ((C0O79) c0o7a).LJ).LIZ;
            if (baseResponse != null && baseResponse.status_code == 0) {
                boolean z = agS0S1231100_18.z5;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
                long j = agS0S1231100_18.j7;
                String str = agS0S1231100_18.s0;
                PoiReviewsListViewModel poiReviewsListViewModel = (PoiReviewsListViewModel) agS0S1231100_18.l2;
                int i2 = agS0S1231100_18.i6;
                if (z) {
                    PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                    if (statistics != null) {
                        poiReviewStatisticsModelCopy3 = statistics.copy(C2286608xc.LJFF(j + 1));
                    } else {
                        poiReviewStatisticsModelCopy3 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                    if (userStatus != null) {
                        poiReviewUserStatusModelCopy3 = userStatus.copy(Boolean.valueOf(z), false);
                    } else {
                        poiReviewUserStatusModelCopy3 = null;
                    }
                    jLongValue = 0;
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy3, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                } else {
                    jLongValue = 0;
                    PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                    if (statistics2 != null) {
                        poiReviewStatisticsModelCopy2 = statistics2.copy(C2286608xc.LJFF(Math.max(0L, j - 1)));
                    } else {
                        poiReviewStatisticsModelCopy2 = null;
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                    if (userStatus2 != null) {
                        poiReviewUserStatusModelCopy2 = userStatus2.copy(false, false);
                    } else {
                        poiReviewUserStatusModelCopy2 = null;
                    }
                    poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy2, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                }
                if (poiReviewModelCopy != null) {
                    poiReviewsListViewModel.listSetItemAt(i2, poiReviewModelCopy);
                }
                if (C1184990gwT.LIZ()) {
                    String reviewId = poiReviewModelCopy.getReviewId();
                    PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModelCopy.getStatistics();
                    if (statistics3 != null && (l = statistics3.likeCount) != null) {
                        jLongValue = l.longValue();
                    }
                    PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModelCopy.getUserStatus();
                    if (userStatus3 != null && Intrinsics.LJFF(userStatus3.liked, true)) {
                        i = 1;
                    } else {
                        PoiReviewsApi.PoiReviewUserStatusModel userStatus4 = poiReviewModelCopy.getUserStatus();
                        if (userStatus4 != null && Intrinsics.LJFF(userStatus4.disliked, true)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                    }
                    C1440005kM.LIZ(new C1189970h4V(i, str, jLongValue, reviewId));
                }
            }
        } else if (c0o7a instanceof C0O78) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("like - motaError: ");
            sbLIZ2.append(c0o7a);
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1;
            PoiReviewsApi.PoiReviewStatisticsModel statistics4 = poiReviewModel2.getStatistics();
            if (statistics4 != null) {
                poiReviewStatisticsModelCopy = statistics4.copy(C2286608xc.LJFF(agS0S1231100_18.j7));
            } else {
                poiReviewStatisticsModelCopy = null;
            }
            PoiReviewsApi.PoiReviewUserStatusModel userStatus5 = ((PoiReviewsApi.PoiReviewModel) agS0S1231100_18.l1).getUserStatus();
            if (userStatus5 != null) {
                poiReviewUserStatusModelCopy = userStatus5.copy(Boolean.valueOf(agS0S1231100_18.z3), Boolean.valueOf(agS0S1231100_18.z4));
            } else {
                poiReviewUserStatusModelCopy = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy2 = poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, poiReviewModel2.LLILZLL, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI);
            if (poiReviewModelCopy2 != null) {
                ((PoiReviewsListViewModel) agS0S1231100_18.l2).listSetItemAt(agS0S1231100_18.i6, poiReviewModelCopy2);
            }
        }
        return Unit.LIZ;
    }

    public AgS0S1231100_18(Object obj, long j, boolean z, boolean z2, boolean z3, String str, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.j7 = j;
        this.z3 = z;
        this.z4 = z2;
        this.z5 = z3;
        this.s0 = str;
        this.l2 = obj2;
        this.i6 = i;
    }
}
