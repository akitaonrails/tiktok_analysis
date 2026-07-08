package Y;

import X.AbstractC19484711Kz;
import X.C1227904rF;
import X.C1232790iBZ;
import X.C1236730iHv;
import X.C1247020iYW;
import X.C1253000iiA;
import X.C1265190j1p;
import X.C1265420j2C;
import X.C1266110j3J;
import X.C1378740lyy;
import X.C1378750lyz;
import X.C15438062q;
import X.C1606010rtX;
import X.C1910890zpH;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196361Axe;
import X.C2196951Ayb;
import X.C238400w2;
import X.C259800zU;
import X.EnumC1247010iYV;
import X.EnumC1386420mBM;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.EnumC1910860zpE;
import X.InterfaceC1265060j1c;
import X.InterfaceC1487280oo2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import com.ss.android.ugc.aweme.minis.model.MinisDevAuthorizationResponse;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.RecommendMinisMetasResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkResponse;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisAdPlacementValidateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCancelResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionChangeResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCreateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionQueryResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionReactivateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes20.dex */
public class AkS326S0200000_19 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case 16:
                return apply$16(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final Object apply$0(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        String str;
        int size;
        ?? LJ;
        int i;
        C1265420j2C c1265420j2C;
        int iIntValue;
        int iIntValue2;
        FollowerItemList followerItemList = (FollowerItemList) obj;
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more list - logId ");
        BaseResponse.ServerTimeExtra serverTimeExtra = followerItemList.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", isSelf ");
        sbLIZ.append(((FollowerRelationState) akS326S0200000_19.l0).isSelf());
        sbLIZ.append(", original result size ");
        sbLIZ.append(((InterfaceC1265060j1c) akS326S0200000_19.l1).CZ0((FollowerRelationState) akS326S0200000_19.l0).size());
        sbLIZ.append(", itemCount ");
        List<User> list = followerItemList.items;
        int size2 = 0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", hasMore ");
        sbLIZ.append(followerItemList.hasMore);
        sbLIZ.append(", offset ");
        sbLIZ.append(followerItemList.offset);
        sbLIZ.append(", recommendHasMore ");
        sbLIZ.append(followerItemList.recommendHasMore);
        c1910890zpHLIZ.LJI("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC1265060j1c) akS326S0200000_19.l1).LJJJZ(new AwS598S0100000_19(followerItemList, 627));
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.FOLLOW_LIST, followerItemList.items, AFwS257S0000000_19.get$arr$(661));
        List<AliasPermissionUserData> list2 = followerItemList.aliasPermissions;
        if (list2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (AliasPermissionUserData aliasPermissionUserData : list2) {
                String str2 = aliasPermissionUserData.userId;
                if (str2 == null) {
                    str2 = "";
                }
                Integer num = aliasPermissionUserData.aliasPermissionType;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Pair pair = new Pair(str2, Integer.valueOf(iIntValue2));
                LJ.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        List<User> list3 = followerItemList.items;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list3) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            User user2 = (User) it2.next();
            user2.setRequestId(followerItemList.extra.logid);
            if (C1253000iiA.LIZ()) {
                List<AliasPermissionUserData> list4 = followerItemList.aliasPermissions;
                if (list4 != null && !list4.isEmpty()) {
                    C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadMore - alias permission map size: ");
                    sbLIZ2.append(followerItemList.aliasPermissions.size());
                    c1910890zpHLIZ2.LIZ("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ2));
                    Integer num2 = (Integer) LJ.get(user2.getUid());
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    c1247020iYW.getClass();
                    c1265420j2C = new C1265420j2C(1, user2, (String) null, C1247020iYW.LIZ(numValueOf), 12);
                } else {
                    c1265420j2C = new C1265420j2C(i, user2, (String) null, EnumC1247010iYV.FOLLOWER, 12);
                }
            } else {
                c1265420j2C = new C1265420j2C(i, user2, (String) null, EnumC1247010iYV.FOLLOWER, 12);
            }
            arrayList2.add(c1265420j2C);
        }
        boolean z = followerItemList.hasMore;
        int i2 = followerItemList.offset;
        long j = followerItemList.minTime;
        boolean z2 = followerItemList.recommendHasMore;
        if (!((InterfaceC1265060j1c) akS326S0200000_19.l1).GD2()) {
            i = 1 + ((InterfaceC1265060j1c) akS326S0200000_19.l1).FN1((FollowerRelationState) akS326S0200000_19.l0).LJ;
        }
        List<User> list5 = followerItemList.items;
        if (list5 != null) {
            size2 = list5.size();
        }
        return new Pair(arrayList2, new C1265190j1p(z, i2, j, z2, i, size2, false, 192));
    }

    public static final Object apply$1(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        String string;
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMetaData, error occurred, cause:");
        Throwable cause = th.getCause();
        if (cause != null) {
            string = cause.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis() - ((C238400w2) akS326S0200000_19.l0).element;
        int iOrdinal = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
        for (SchemaParserData schemaParserData : (List) akS326S0200000_19.l1) {
            JSONArray jSONArray = C2196361Axe.LIZ;
            C2196361Axe.LJIILIIL(false, iOrdinal, -1, jCurrentTimeMillis, schemaParserData);
        }
        return AbstractC19484711Kz.LJIILLIIL(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$10(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionQueryResponse tiktokMinisSubscriptionQueryResponse = (TiktokMinisSubscriptionQueryResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionQueryResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSubscription, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionQueryResponse.statusCode;
            String str = tiktokMinisSubscriptionQueryResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionQueryResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 9));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createSubscription, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionQueryResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createSubscription, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$11(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionReactivateResponse tiktokMinisSubscriptionReactivateResponse = (TiktokMinisSubscriptionReactivateResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionReactivateResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reactiveSubscription, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionReactivateResponse.statusCode;
            String str = tiktokMinisSubscriptionReactivateResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionReactivateResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 10));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reactiveSubscription, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionReactivateResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reactiveSubscription, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$12(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionCancelResponse tiktokMinisSubscriptionCancelResponse = (TiktokMinisSubscriptionCancelResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionCancelResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSubscriptionList, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionCancelResponse.statusCode;
            String str = tiktokMinisSubscriptionCancelResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionCancelResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 11));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSubscriptionList, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionCancelResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getSubscriptionList, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$13(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionChangeResponse tiktokMinisSubscriptionChangeResponse = (TiktokMinisSubscriptionChangeResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionChangeResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeSubscription, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionChangeResponse.statusCode;
            String str = tiktokMinisSubscriptionChangeResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionChangeResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 12));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeSubscription, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionChangeResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("changeSubscription, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$14(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionCreateResponse tiktokMinisSubscriptionCreateResponse = (TiktokMinisSubscriptionCreateResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionCreateResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSubscription, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionCreateResponse.statusCode;
            String str = tiktokMinisSubscriptionCreateResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionCreateResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 13));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createSubscription, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionCreateResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createSubscription, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$15(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisUtilityGetSubscriptionTierInfoResponse tiktokMinisUtilityGetSubscriptionTierInfoResponse = (TiktokMinisUtilityGetSubscriptionTierInfoResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisUtilityGetSubscriptionTierInfoResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchSubscriptionDetailInfo, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisUtilityGetSubscriptionTierInfoResponse.statusCode;
            String str = tiktokMinisUtilityGetSubscriptionTierInfoResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisUtilityGetSubscriptionTierInfoResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 14));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchSubscriptionDetailInfo, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisUtilityGetSubscriptionTierInfoResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchSubscriptionDetailInfo, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public static final Object apply$16(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisSubscriptionListResponse tiktokMinisSubscriptionListResponse = (TiktokMinisSubscriptionListResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisSubscriptionListResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSubscriptionList, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisSubscriptionListResponse.statusCode;
            String str = tiktokMinisSubscriptionListResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1232790iBZ) akS326S0200000_19.l1).getClass();
                c259800zU.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionListResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 15));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSubscriptionList, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1232790iBZ c1232790iBZ = (C1232790iBZ) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232790iBZ.getClass();
            c259800zU2.element = new MinisPaymentNetworkResponse(tiktokMinisSubscriptionListResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getSubscriptionList, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisPaymentNetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$2(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        ContentPbResponse contentPbResponse = (ContentPbResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(contentPbResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchContentPbForDMShare, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = contentPbResponse.statusCode;
            String str = contentPbResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C2196951Ayb) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(contentPbResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 0));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchContentPbForDMShare, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C2196951Ayb c2196951Ayb = (C2196951Ayb) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c2196951Ayb.getClass();
            c259800zU2.element = new NetworkResponse(contentPbResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchContentPbForDMShare, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$3(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        MinisDevAuthorizationResponse minisDevAuthorizationResponse = (MinisDevAuthorizationResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(minisDevAuthorizationResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = minisDevAuthorizationResponse.statusCode;
            String str = minisDevAuthorizationResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C2196951Ayb) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(minisDevAuthorizationResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 2));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchMetaData, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C2196951Ayb c2196951Ayb = (C2196951Ayb) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c2196951Ayb.getClass();
            c259800zU2.element = new NetworkResponse(minisDevAuthorizationResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchMetaData, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$4(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisLinkResponse tiktokMinisLinkResponse = (TiktokMinisLinkResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisLinkResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisLinkResponse.statusCode;
            String str = tiktokMinisLinkResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C2196951Ayb) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(tiktokMinisLinkResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 3));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchMetaData, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C2196951Ayb c2196951Ayb = (C2196951Ayb) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c2196951Ayb.getClass();
            c259800zU2.element = new NetworkResponse(tiktokMinisLinkResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchMetaData, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$5(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse = (TiktokMinisLinkParseResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisLinkParseResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchMinisLinkParseMeta, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = tiktokMinisLinkParseResponse.statusCode;
            String str = tiktokMinisLinkParseResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C2196951Ayb) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(tiktokMinisLinkParseResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 4));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchMinisLinkParseMeta, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C2196951Ayb c2196951Ayb = (C2196951Ayb) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c2196951Ayb.getClass();
            c259800zU2.element = new NetworkResponse(tiktokMinisLinkParseResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchMinisLinkParseMeta, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$6(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        RecommendMinisMetasResponse recommendMinisMetasResponse = (RecommendMinisMetasResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(recommendMinisMetasResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchRecommendMinisMeta, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = recommendMinisMetasResponse.statusCode;
            String str = recommendMinisMetasResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C2196951Ayb) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(recommendMinisMetasResponse, 0, false, null, false, null, null);
                ((C2196951Ayb) akS326S0200000_19.l1).LJIIIIZZ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 5));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchRecommendMinisMeta, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C2196951Ayb c2196951Ayb = (C2196951Ayb) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c2196951Ayb.getClass();
            c259800zU2.element = new NetworkResponse(recommendMinisMetasResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchRecommendMinisMeta, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$7(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        MinisAdPlacementValidateResponse minisAdPlacementValidateResponse = (MinisAdPlacementValidateResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(minisAdPlacementValidateResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchMinisAdPlacementValidateResponse, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = minisAdPlacementValidateResponse.statusCode;
            String str = minisAdPlacementValidateResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1236730iHv) akS326S0200000_19.l1).getClass();
                c259800zU.element = C1236730iHv.LIZ(minisAdPlacementValidateResponse, 0);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 6));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchMinisAdPlacementValidateResponse, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1236730iHv c1236730iHv = (C1236730iHv) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1236730iHv.getClass();
            c259800zU2.element = C1236730iHv.LIZ(minisAdPlacementValidateResponse, iIntValue);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchMinisAdPlacementValidateResponse, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$8(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        ContentPbResponse contentPbResponse = (ContentPbResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(contentPbResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchContentPbForDMShare, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = contentPbResponse.statusCode;
            String str = contentPbResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1378740lyy) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(contentPbResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 7));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchContentPbForDMShare, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1378740lyy c1378740lyy = (C1378740lyy) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1378740lyy.getClass();
            c259800zU2.element = new NetworkResponse(contentPbResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchContentPbForDMShare, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static final Object apply$9(AkS326S0200000_19 akS326S0200000_19, Object obj) {
        int iIntValue;
        ContentPbResponse contentPbResponse = (ContentPbResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(contentPbResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchContentPbForDMShare, middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = contentPbResponse.statusCode;
            String str = contentPbResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS326S0200000_19.l0;
                ((C1378750lyz) akS326S0200000_19.l1).getClass();
                c259800zU.element = new NetworkResponse(contentPbResponse, 0, false, null, false, null, null);
                return AbstractC19484711Kz.LJII(new C1266110j3J((C259800zU) akS326S0200000_19.l0, 8));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchContentPbForDMShare, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS326S0200000_19.l0;
            C1378750lyz c1378750lyz = (C1378750lyz) akS326S0200000_19.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1378750lyz.getClass();
            c259800zU2.element = new NetworkResponse(contentPbResponse, Integer.valueOf(iIntValue), false, null, false, null, null);
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchContentPbForDMShare, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((NetworkResponse) ((C259800zU) akS326S0200000_19.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS326S0200000_19.l0).element);
        }
    }

    public AkS326S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
