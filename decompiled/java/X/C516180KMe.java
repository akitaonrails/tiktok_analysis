package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.livesdk.chatroom.api.LevelBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcSubChargeInfo;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcSubLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516180KMe implements C0KOA {
    public static final /* synthetic */ int LJFF = 0;
    public final C0KFM LIZ;
    public boolean LIZJ;
    public final List<String> LIZIZ = new ArrayList();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(221));
    public final C0KO1 LJ = new C0KO1(this);

    public C516180KMe(C0KFM c0kfm) {
        this.LIZ = c0kfm;
    }

    @Override // X.C0KOA
    public final void LIZ(PushContractStatusResult pushContractStatusResult) throws JSONException {
        String str;
        long jCurrentTimeMillis;
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryOrderRepo.onContractStatusResult start, pushContractId=");
        sbLIZ.append(pushContractStatusResult.contractid);
        sbLIZ.append(", toast=");
        sbLIZ.append(pushContractStatusResult.toast);
        sbLIZ.append(", payloadOrderId=");
        C0KFM c0kfm = this.LIZ;
        if (c0kfm != null) {
            str = c0kfm.LJJIIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", finishedOrderIDs=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C0KFM c0kfm2 = this.LIZ;
        if (c0kfm2 == null) {
            return;
        }
        if (((ArrayList) this.LIZIZ).contains(pushContractStatusResult.contractid) || !Intrinsics.LJFF(pushContractStatusResult.contractid, c0kfm2.LJJIIZ)) {
            return;
        }
        LIZIZ(pushContractStatusResult, c0kfm2);
        C516000KLm c516000KLm = C516000KLm.LIZ;
        c516000KLm.getClass();
        if (C516000KLm.LIZIZ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - C516000KLm.LIZIZ;
        } else {
            jCurrentTimeMillis = 0;
        }
        boolean z = c0kfm2.LJIIIIZZ;
        String str2 = pushContractStatusResult.contractid;
        String str3 = c0kfm2.LIZLLL;
        if (str3 == null) {
            str3 = "normal_sub";
        }
        String str4 = c0kfm2.LIZIZ;
        c0kfm2.LIZJ.get();
        C516100KLw c516100KLwLIZ = C0KM8.LIZ();
        Object value = this.LIZLLL.getValue();
        String str5 = pushContractStatusResult.contractid;
        Integer numValueOf = Integer.valueOf(c0kfm2.LJIIZILJ);
        value.getClass();
        C0KM2 c0km2LIZIZ = C516050KLr.LIZIZ(numValueOf, str5);
        if (c0km2LIZIZ != null) {
            strLIZ = c0km2LIZIZ.LIZ();
        } else {
            strLIZ = "unknown";
        }
        c516000KLm.LJIILLIIL(z, str2, jCurrentTimeMillis, -3, str3, str4, c516100KLwLIZ, strLIZ, C2097608Jq.LJ(), c0kfm2);
        C516000KLm.LIZJ = System.currentTimeMillis();
    }

    public final void LIZIZ(Object obj, C0KFM c0kfm) {
        String simpleName;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        Integer numValueOf;
        SubscribeBadge subscribeBadge;
        SubLevel subLevel;
        LevelBadge levelBadge;
        SubLevel subLevel2;
        Map<String, String> map;
        String str5;
        Map<String, String> map2;
        String str6;
        String str7;
        String str8;
        String str9;
        C0KLW c0klw;
        String str10;
        boolean z2;
        Integer numValueOf2;
        SubscribeBadge subscribeBadge2;
        PgcSubLevel pgcSubLevel;
        PgcSubLevel pgcSubLevel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryOrderRepo.finishSubscribe start, resultType=");
        String str11 = null;
        if (obj != null) {
            simpleName = obj.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(", subscribePayloadOrderId=");
        if (c0kfm != null) {
            str = c0kfm.LJJIIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", payloadOrderId=");
        C0KFM c0kfm2 = this.LIZ;
        if (c0kfm2 != null) {
            str2 = c0kfm2.LJJIIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", packageId=");
        C0KFM c0kfm3 = this.LIZ;
        if (c0kfm3 != null) {
            str3 = c0kfm3.LJI;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", finishedOrderIDs=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finishSubscribe package id = ");
        C0KFM c0kfm4 = this.LIZ;
        if (c0kfm4 != null) {
            str4 = c0kfm4.LJI;
        } else {
            str4 = null;
        }
        sbLIZ2.append(str4);
        C2188811AlT.LIZIZ(sbLIZ2);
        boolean z3 = false;
        C515650KKd c515650KKd = new C515650KKd(0);
        if (obj instanceof PgcCheckSubOrderResultStruct) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("QueryOrderRepo.finishSubscribe handleHttpResult, contractId=");
            PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) obj;
            sbLIZ3.append(pgcCheckSubOrderResultStruct.orderID);
            sbLIZ3.append(", orderId=");
            sbLIZ3.append(pgcCheckSubOrderResultStruct.orderID);
            sbLIZ3.append(", status=");
            sbLIZ3.append(pgcCheckSubOrderResultStruct.status);
            sbLIZ3.append(", retryCount=");
            sbLIZ3.append(pgcCheckSubOrderResultStruct.retryCount);
            sbLIZ3.append(", toast=");
            sbLIZ3.append(pgcCheckSubOrderResultStruct.toast);
            sbLIZ3.append(", hasBadge=");
            PgcSubChargeInfo pgcSubChargeInfo = pgcCheckSubOrderResultStruct.subChargeInfo;
            if (pgcSubChargeInfo != null && (pgcSubLevel2 = pgcSubChargeInfo.subLevel) != null && pgcSubLevel2.subscribeBadge != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ3.append(z2);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (((ArrayList) this.LIZIZ).contains(pgcCheckSubOrderResultStruct.orderID)) {
                return;
            }
            C516000KLm c516000KLm = C516000KLm.LIZ;
            SystemClock.uptimeMillis();
            c516000KLm.getClass();
            Object value = this.LIZLLL.getValue();
            String str12 = pgcCheckSubOrderResultStruct.orderID;
            if (c0kfm != null) {
                numValueOf2 = Integer.valueOf(c0kfm.LJIIZILJ);
            } else {
                numValueOf2 = null;
            }
            C0KM4 c0km4 = C0KM4.QUERY_ORDER_SUCCEED;
            value.getClass();
            C516050KLr.LIZJ(str12, numValueOf2, c0km4);
            ((ArrayList) this.LIZIZ).add(pgcCheckSubOrderResultStruct.orderID);
            PgcSubChargeInfo pgcSubChargeInfo2 = pgcCheckSubOrderResultStruct.subChargeInfo;
            if (pgcSubChargeInfo2 != null && (pgcSubLevel = pgcSubChargeInfo2.subLevel) != null) {
                subscribeBadge2 = pgcSubLevel.subscribeBadge;
            } else {
                subscribeBadge2 = null;
            }
            c515650KKd.LIZ = subscribeBadge2;
            String str13 = pgcCheckSubOrderResultStruct.toast;
            if (str13 == null) {
                str13 = "";
            }
            c515650KKd.LIZIZ = str13;
        } else if (obj instanceof PushContractStatusResult) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("QueryOrderRepo.finishSubscribe handlePushResult, contractId=");
            PushContractStatusResult pushContractStatusResult = (PushContractStatusResult) obj;
            sbLIZ4.append(pushContractStatusResult.contractid);
            sbLIZ4.append(", orderId=");
            sbLIZ4.append(pushContractStatusResult.contractid);
            sbLIZ4.append(", toast=");
            sbLIZ4.append(pushContractStatusResult.toast);
            sbLIZ4.append(", hasBadge=");
            SubInfo subInfo = pushContractStatusResult.subInfo;
            if (subInfo != null && (subLevel2 = subInfo.subLevel) != null && subLevel2.badge != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ4.append(z);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (((ArrayList) this.LIZIZ).contains(pushContractStatusResult.contractid)) {
                return;
            }
            Object value2 = this.LIZLLL.getValue();
            String str14 = pushContractStatusResult.contractid;
            if (c0kfm != null) {
                numValueOf = Integer.valueOf(c0kfm.LJIIZILJ);
            } else {
                numValueOf = null;
            }
            C0KM4 c0km42 = C0KM4.QUERY_ORDER_SUCCEED;
            value2.getClass();
            C516050KLr.LIZJ(str14, numValueOf, c0km42);
            ((ArrayList) this.LIZIZ).add(pushContractStatusResult.contractid);
            SubInfo subInfo2 = pushContractStatusResult.subInfo;
            if (subInfo2 != null && (subLevel = subInfo2.subLevel) != null && (levelBadge = subLevel.badge) != null) {
                subscribeBadge = new SubscribeBadge();
                subscribeBadge.setOriginImage(levelBadge.originImg);
                subscribeBadge.setPreviewImage(levelBadge.previewImg);
            } else {
                subscribeBadge = null;
            }
            c515650KKd.LIZ = subscribeBadge;
            c515650KKd.LIZIZ = pushContractStatusResult.toast;
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("QueryOrderRepo.finishSubscribe abort, reason=unsupported_result_type, result=");
            sbLIZ5.append(obj);
            sbLIZ5.append(", subscribePayloadOrderId=");
            if (c0kfm != null) {
                str11 = c0kfm.LJJIIZ;
            }
            sbLIZ5.append(str11);
            C2188811AlT.LIZIZ(sbLIZ5);
            return;
        }
        if (c0kfm == null || !c0kfm.LJJIIJ) {
            C0KMW c0kmw = C0KMW.LIZ;
            if (c0kfm != null) {
                map = c0kfm.LJ;
                str5 = c0kfm.LJIIJJI;
                map2 = c0kfm.LJFF;
                str6 = c0kfm.LIZIZ;
            } else {
                map = null;
                str5 = null;
                map2 = null;
                str6 = null;
            }
            c0kmw.getClass();
            C0KDQ c0kdq = C0KDQ.LIZ;
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_purchase_successfully");
            C0K61.LIZ(c511970K5z, null);
            c511970K5z.LIZIZ(str5, "subscribe_type");
            c511970K5z.LIZIZ("IAP", "payment_method");
            c511970K5z.LIZJ(map);
            c511970K5z.LIZJ(map2);
            c511970K5z.LIZIZ(0, "is_shorten_version");
            c511970K5z.LIZIZ(str6, "show_entrance");
            c0kdq.getClass();
            C0KDQ.LIZ(c511970K5z);
            c511970K5z.LIZLLL();
        }
        if (c515650KKd.LIZ != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("1.send subscribe success event package id = ");
            if (c0kfm != null) {
                str10 = c0kfm.LJI;
            } else {
                str10 = null;
            }
            sbLIZ6.append(str10);
            C2188811AlT.LIZIZ(sbLIZ6);
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("1.send subscribe success event package id = ");
        if (c0kfm != null) {
            str7 = c0kfm.LJI;
        } else {
            str7 = null;
        }
        sbLIZ7.append(str7);
        C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("QueryOrderRepo.finishSubscribe beforePayCallbackOnSuccess, subscribePayloadOrderId=");
        if (c0kfm != null) {
            str8 = c0kfm.LJJIIZ;
        } else {
            str8 = null;
        }
        sbLIZ8.append(str8);
        sbLIZ8.append(", payloadOrderId=");
        C0KFM c0kfm5 = this.LIZ;
        if (c0kfm5 != null) {
            str9 = c0kfm5.LJJIIZ;
        } else {
            str9 = null;
        }
        sbLIZ8.append(str9);
        sbLIZ8.append(", packageId=");
        if (c0kfm != null) {
            str11 = c0kfm.LJI;
        }
        sbLIZ8.append(str11);
        sbLIZ8.append(", toastMessage=");
        sbLIZ8.append(c515650KKd.LIZIZ);
        sbLIZ8.append(", hasBadge=");
        if (c515650KKd.LIZ != null) {
            z3 = true;
        }
        sbLIZ8.append(z3);
        C2188811AlT.LIZIZ(sbLIZ8);
        C0KFM c0kfm6 = this.LIZ;
        if (c0kfm6 != null && (c0klw = c0kfm6.LJJII) != null) {
            c0klw.LIZ(c0kfm6, "success", "success", c515650KKd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r29, X.C0KFM r30, boolean r31, java.lang.String r32, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Throwable, kotlin.Unit> r33, X.InterfaceC1364105Vn<? super X.C0KNR> r34) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516180KMe.LIZLLL(java.lang.String, X.0KFM, boolean, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public static C0KN8 LIZJ(C516180KMe c516180KMe, C0KFM c0kfm, String str, long j, int i, String str2, String str3, boolean z, int i2) {
        boolean z2 = z;
        String str4 = str2;
        int i3 = i;
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        String str5 = "";
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        if ((i2 & 32) == 0) {
            str5 = str3;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        }
        c516180KMe.getClass();
        return new C0KN8(c0kfm, j, str, i3, str4, str5, null, z2);
    }
}
