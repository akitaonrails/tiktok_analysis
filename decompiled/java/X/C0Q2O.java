package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.IncentiveDetailInfo;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveMultiDayService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2O, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2O {
    public static final C0Q2O LIZ = new C0Q2O();

    public static void LIZ(C2344009Gk c2344009Gk) {
        IncentiveDetailInfo incentiveDetailInfoLJ;
        ISearchIncentiveTaskBridgeService.LIZ.getClass();
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
        if (iSearchIncentiveTaskBridgeServiceLIZ == null || !iSearchIncentiveTaskBridgeServiceLIZ.LIZ() || (incentiveDetailInfoLJ = iSearchIncentiveTaskBridgeServiceLIZ.LJ()) == null) {
            return;
        }
        LIZIZ(c2344009Gk, incentiveDetailInfoLJ);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, IncentiveDetailInfo incentiveDetailInfo) {
        ISearchIncentiveMultiDayService.LIZ.getClass();
        ISearchIncentiveMultiDayService value = C0Q2Y.LIZIZ.getValue();
        if (value != null && value.LIZ() && Intrinsics.LJFF(incentiveDetailInfo.taskType, "periodic_task") && 1 != 0 && incentiveDetailInfo != null) {
            c2344009Gk.LJFF("task_type", "periodic_search");
            Integer numValueOf = Integer.valueOf(incentiveDetailInfo.totalCount);
            if (numValueOf.intValue() > 0) {
                int iIntValue = numValueOf.intValue();
                c2344009Gk.LIZJ(iIntValue, "retention_task_count");
                Integer num = incentiveDetailInfo.totalDay;
                if (num != null && num.intValue() > 0) {
                    int iIntValue2 = num.intValue();
                    c2344009Gk.LIZJ(iIntValue2, "total_retention_day");
                    c2344009Gk.LIZLLL(((long) iIntValue) * ((long) iIntValue2), "retention_task_total");
                }
            }
            Integer num2 = incentiveDetailInfo.finishDay;
            if (num2 != null && num2.intValue() >= 0) {
                c2344009Gk.LIZJ(num2.intValue(), "current_retention_day");
            }
            Integer num3 = incentiveDetailInfo.durationDay;
            if (num3 != null && num3.intValue() > 0) {
                c2344009Gk.LIZJ(num3.intValue(), "total_max_retention_day");
            }
        }
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        Map<String, String> mapLJI;
        String str9;
        if (str3.length() == 0) {
            str3 = "enter";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (C1ER1.LIZIZ.LIZLLL()) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_coin_task", str8);
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        if (strLIZ != null) {
            c2344009Gk.LJFF("end_to_end_search_session_id", strLIZ);
        }
        c2344009Gk.LJIIIIZZ("search_keyword", "");
        c2344009Gk.LJIIIIZZ("enter_from_sub", str2);
        ISearchBlankPageCoinTaskService.LIZ.getClass();
        ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceLIZ = C650270Pez.LIZ();
        ISearchIncentiveTaskBridgeService.LIZ.getClass();
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
        if (iSearchIncentiveTaskBridgeServiceLIZ != null && iSearchIncentiveTaskBridgeServiceLIZ.LIZ()) {
            IncentiveDetailInfo incentiveDetailInfoLJ = iSearchIncentiveTaskBridgeServiceLIZ.LJ();
            if (incentiveDetailInfoLJ != null) {
                str9 = incentiveDetailInfoLJ.taskId;
            } else {
                str9 = null;
            }
            c2344009Gk.LJFF("activation_task_id", str9);
            c2344009Gk.LJFF("has_activation_task", "1");
            if (incentiveDetailInfoLJ != null) {
                LIZ.getClass();
                LIZIZ(c2344009Gk, incentiveDetailInfoLJ);
            }
        }
        if (iSearchBlankPageCoinTaskServiceLIZ != null && iSearchBlankPageCoinTaskServiceLIZ.LJIL() && (mapLJI = iSearchBlankPageCoinTaskServiceLIZ.LJI()) != null) {
            c2344009Gk.LJII(mapLJI);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("enter_type", str4);
        }
        if (str5 != null) {
            c2344009Gk.LJFF("search_entrance", str5);
        }
        if (str6 != null) {
            ISearchMobAppDiff.LIZ.getClass();
            C0QKA.LIZIZ.getValue().LIZJ();
            if (C0BC8.LIZ(str4)) {
                c2344009Gk.LJFF("last_group_id", str6);
            }
        }
        if (str7 != null) {
            c2344009Gk.LJFF("blankpage_id", str7);
        }
        C20684815ws.LJIILLIIL("enter_search_blankpage", c2344009Gk.LIZ);
    }
}
