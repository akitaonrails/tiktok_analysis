package X;

import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisAdPlacementValidateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCancelResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionChangeResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCreateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionReactivateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.edit.InstagramPresenter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0j3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266080j3G implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onSubscribe$12(C1266080j3G c1266080j3G, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$13(C1266080j3G c1266080j3G, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$14(C1266080j3G c1266080j3G, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
            case 3:
                onError$3(this, th);
                break;
            case 4:
                onError$4(this, th);
                break;
            case 5:
                onError$5(this, th);
                break;
            case 6:
                onError$6(this, th);
                break;
            case 7:
                onError$7(this, th);
                break;
            case 8:
                onError$8(this, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onError$9(this, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onError$10(this, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onError$11(this, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onError$12(this, th);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onError$13(this, th);
                break;
            case 14:
                onError$14(this, th);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                C2187451AjH.LIZ;
                break;
            case 2:
                C2187451AjH.LIZ;
                break;
            case 3:
                C2187451AjH.LIZ;
                break;
            case 4:
                C2187451AjH.LIZ;
                break;
            case 5:
                C2187451AjH.LIZ;
                break;
            case 6:
                C2187451AjH.LIZ;
                break;
            case 7:
                C2187451AjH.LIZ;
                break;
            case 8:
                C2187451AjH.LIZ;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C2187451AjH.LIZ;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C2187451AjH.LIZ;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C2187451AjH.LIZ;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSubscribe$12(this, interfaceC420801kM);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onSubscribe$13(this, interfaceC420801kM);
                break;
            case 14:
                onSubscribe$14(this, interfaceC420801kM);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSuccess$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onSuccess$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSuccess$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onSuccess$13(this, obj);
                break;
            case 14:
                onSuccess$14(this, obj);
                break;
        }
    }

    public C1266080j3G(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZLLL(th);
        ((InstagramPresenter) c1266080j3G.l0).LL.Qy0();
    }

    public static final void onError$1(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchContentPbForDMShare, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        NetworkResponse<ContentPbResponse> networkResponse = new NetworkResponse<>(null, -1, false, null, false, null, null);
        InterfaceC1236720iHu interfaceC1236720iHu = (InterfaceC1236720iHu) c1266080j3G.l0;
        if (interfaceC1236720iHu != null) {
            interfaceC1236720iHu.LIZ(false, networkResponse);
        }
    }

    public static final void onError$10(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCreateSubscription, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse minisPaymentNetworkResponse = new MinisPaymentNetworkResponse(null, -1);
        InterfaceC1233030iBx interfaceC1233030iBx = (InterfaceC1233030iBx) c1266080j3G.l0;
        if (interfaceC1233030iBx != null) {
            interfaceC1233030iBx.LIZ(false, minisPaymentNetworkResponse);
        }
    }

    public static final void onError$11(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doReactiveSubscription, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionReactivateResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1232900iBk interfaceC1232900iBk = (InterfaceC1232900iBk) c1266080j3G.l0;
        if (interfaceC1232900iBk != null) {
            interfaceC1232900iBk.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onError$12(C1266080j3G c1266080j3G, Throwable th) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }

    public static final void onError$13(C1266080j3G c1266080j3G, Throwable th) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }

    public static final void onError$14(C1266080j3G c1266080j3G, Throwable th) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }

    public static final void onError$2(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMetaData, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1236660iHo interfaceC1236660iHo = (InterfaceC1236660iHo) c1266080j3G.l0;
        if (interfaceC1236660iHo != null) {
            interfaceC1236660iHo.LIZJ();
        }
    }

    public static final void onError$3(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preFetchMetaDataForLaterUse, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onError$4(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMinisLinkParseData, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        NetworkResponse<MinisAdPlacementValidateResponse> networkResponse = new NetworkResponse<>(null, -1, false, null, false, null, null);
        InterfaceC1236750iHx interfaceC1236750iHx = (InterfaceC1236750iHx) c1266080j3G.l0;
        if (interfaceC1236750iHx != null) {
            interfaceC1236750iHx.LIZ(false, networkResponse, th);
        }
    }

    public static final void onError$5(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doFetchSubscriptionList, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionListResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1232530iB9 interfaceC1232530iB9 = (InterfaceC1232530iB9) c1266080j3G.l0;
        if (interfaceC1232530iB9 != null) {
            interfaceC1232530iB9.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onError$6(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCancelSubscription, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionCancelResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1232730iBT interfaceC1232730iBT = (InterfaceC1232730iBT) c1266080j3G.l0;
        if (interfaceC1232730iBT != null) {
            interfaceC1232730iBT.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onError$7(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doChangeSubscription, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionChangeResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1232920iBm interfaceC1232920iBm = (InterfaceC1232920iBm) c1266080j3G.l0;
        if (interfaceC1232920iBm != null) {
            interfaceC1232920iBm.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onError$8(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCreateSubscription, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionCreateResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1233000iBu interfaceC1233000iBu = (InterfaceC1233000iBu) c1266080j3G.l0;
        if (interfaceC1233000iBu != null) {
            interfaceC1233000iBu.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onError$9(C1266080j3G c1266080j3G, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doFetchSubscriptionDetailInfo, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> minisPaymentNetworkResponse = new MinisPaymentNetworkResponse<>(null, -1);
        InterfaceC1232940iBo interfaceC1232940iBo = (InterfaceC1232940iBo) c1266080j3G.l0;
        if (interfaceC1232940iBo != null) {
            interfaceC1232940iBo.LIZ(false, minisPaymentNetworkResponse, th);
        }
    }

    public static final void onSubscribe$0(C1266080j3G c1266080j3G, InterfaceC420801kM interfaceC420801kM) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InstagramPresenter", "Start onSubscribe");
    }

    public static final void onSuccess$0(C1266080j3G c1266080j3G, Object obj) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InstagramPresenter", "unbind onSuccess");
        ((InstagramPresenter) c1266080j3G.l0).LL.aB0(null);
    }

    public static final void onSuccess$1(C1266080j3G c1266080j3G, Object obj) {
        NetworkResponse<ContentPbResponse> networkResponse = (NetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchContentPbForDMShare, onSuccess:");
        sbLIZ.append(networkResponse.data);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1236720iHu interfaceC1236720iHu = (InterfaceC1236720iHu) c1266080j3G.l0;
        if (interfaceC1236720iHu != null) {
            interfaceC1236720iHu.LIZ(true, networkResponse);
        }
    }

    public static final void onSuccess$10(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1233030iBx interfaceC1233030iBx = (InterfaceC1233030iBx) c1266080j3G.l0;
            if (interfaceC1233030iBx != null) {
                interfaceC1233030iBx.LIZ(true, minisPaymentNetworkResponse);
                return;
            }
            return;
        }
        InterfaceC1233030iBx interfaceC1233030iBx2 = (InterfaceC1233030iBx) c1266080j3G.l0;
        if (interfaceC1233030iBx2 == null) {
            return;
        }
        interfaceC1233030iBx2.LIZ(false, minisPaymentNetworkResponse);
    }

    public static final void onSuccess$11(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionReactivateResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1232900iBk interfaceC1232900iBk = (InterfaceC1232900iBk) c1266080j3G.l0;
            if (interfaceC1232900iBk != null) {
                interfaceC1232900iBk.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1232900iBk interfaceC1232900iBk2 = (InterfaceC1232900iBk) c1266080j3G.l0;
        if (interfaceC1232900iBk2 == null) {
            return;
        }
        interfaceC1232900iBk2.LIZ(false, minisPaymentNetworkResponse, null);
    }

    public static final void onSuccess$12(C1266080j3G c1266080j3G, Object obj) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(obj, null);
        }
    }

    public static final void onSuccess$13(C1266080j3G c1266080j3G, Object obj) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(obj, null);
        }
    }

    public static final void onSuccess$14(C1266080j3G c1266080j3G, Object obj) {
        Function2 function2 = (Function2) c1266080j3G.l0;
        if (function2 != null) {
            function2.invoke(obj, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccess$2(X.C1266080j3G r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.minis.model.NetworkResponse r5 = (com.ss.android.ugc.aweme.minis.model.NetworkResponse) r5
            T r0 = r5.data
            com.ss.android.ugc.aweme.minis.model.MinisDevAuthorizationResponse r0 = (com.ss.android.ugc.aweme.minis.model.MinisDevAuthorizationResponse) r0
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r2 = r4.l0
            X.0iHo r2 = (X.InterfaceC1236660iHo) r2
            java.lang.Boolean r1 = r0.isTargetUser
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L21
            r0 = 1
            r2.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L1f:
            if (r0 != 0) goto L2a
        L21:
            java.lang.Object r0 = r4.l0
            X.0iHo r0 = (X.InterfaceC1236660iHo) r0
            if (r0 == 0) goto L2a
            r0.LIZ(r3)
        L2a:
            return
        L2b:
            if (r2 == 0) goto L21
            r2.LIZ(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266080j3G.onSuccess$2(X.0j3G, java.lang.Object):void");
    }

    public static final void onSuccess$3(C1266080j3G c1266080j3G, Object obj) {
        Object objLJJJLL;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        List list = (List) networkResponse.data;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        ((Function1) c1266080j3G.l0).invoke(new NetworkResponse(objLJJJLL, networkResponse.errorCode, networkResponse.dataSourceFromDiskCache, null, false, null, null));
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preFetchMetaDataForLaterUse, onSuccess:");
        sbLIZ.append(objLJJJLL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onSuccess$4(C1266080j3G c1266080j3G, Object obj) {
        Integer num;
        NetworkResponse<MinisAdPlacementValidateResponse> networkResponse = (NetworkResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMinisLinkParseData, onSuccess, statusCode:");
        MinisAdPlacementValidateResponse minisAdPlacementValidateResponse = networkResponse.data;
        if (minisAdPlacementValidateResponse != null) {
            num = minisAdPlacementValidateResponse.statusCode;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(", data:");
        sbLIZ.append(networkResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        Integer num2 = networkResponse.errorCode;
        if (num2 != null && num2.intValue() == 0) {
            InterfaceC1236750iHx interfaceC1236750iHx = (InterfaceC1236750iHx) c1266080j3G.l0;
            if (interfaceC1236750iHx != null) {
                interfaceC1236750iHx.LIZ(true, networkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1236750iHx interfaceC1236750iHx2 = (InterfaceC1236750iHx) c1266080j3G.l0;
        if (interfaceC1236750iHx2 == null) {
            return;
        }
        interfaceC1236750iHx2.LIZ(false, networkResponse, null);
    }

    public static final void onSuccess$5(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionListResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1232530iB9 interfaceC1232530iB9 = (InterfaceC1232530iB9) c1266080j3G.l0;
            if (interfaceC1232530iB9 != null) {
                interfaceC1232530iB9.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1232530iB9 interfaceC1232530iB92 = (InterfaceC1232530iB9) c1266080j3G.l0;
        if (interfaceC1232530iB92 == null) {
            return;
        }
        interfaceC1232530iB92.LIZ(false, minisPaymentNetworkResponse, null);
    }

    public static final void onSuccess$6(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionCancelResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1232730iBT interfaceC1232730iBT = (InterfaceC1232730iBT) c1266080j3G.l0;
            if (interfaceC1232730iBT != null) {
                interfaceC1232730iBT.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1232730iBT interfaceC1232730iBT2 = (InterfaceC1232730iBT) c1266080j3G.l0;
        if (interfaceC1232730iBT2 == null) {
            return;
        }
        interfaceC1232730iBT2.LIZ(false, minisPaymentNetworkResponse, null);
    }

    public static final void onSuccess$7(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionChangeResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1232920iBm interfaceC1232920iBm = (InterfaceC1232920iBm) c1266080j3G.l0;
            if (interfaceC1232920iBm != null) {
                interfaceC1232920iBm.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1232920iBm interfaceC1232920iBm2 = (InterfaceC1232920iBm) c1266080j3G.l0;
        if (interfaceC1232920iBm2 == null) {
            return;
        }
        interfaceC1232920iBm2.LIZ(false, minisPaymentNetworkResponse, null);
    }

    public static final void onSuccess$8(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisSubscriptionCreateResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1233000iBu interfaceC1233000iBu = (InterfaceC1233000iBu) c1266080j3G.l0;
            if (interfaceC1233000iBu != null) {
                interfaceC1233000iBu.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1233000iBu interfaceC1233000iBu2 = (InterfaceC1233000iBu) c1266080j3G.l0;
        if (interfaceC1233000iBu2 == null) {
            return;
        }
        interfaceC1233000iBu2.LIZ(false, minisPaymentNetworkResponse, null);
    }

    public static final void onSuccess$9(C1266080j3G c1266080j3G, Object obj) {
        MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        Integer num = minisPaymentNetworkResponse.errorCode;
        if (num != null && num.intValue() == 0) {
            InterfaceC1232940iBo interfaceC1232940iBo = (InterfaceC1232940iBo) c1266080j3G.l0;
            if (interfaceC1232940iBo != null) {
                interfaceC1232940iBo.LIZ(true, minisPaymentNetworkResponse, null);
                return;
            }
            return;
        }
        InterfaceC1232940iBo interfaceC1232940iBo2 = (InterfaceC1232940iBo) c1266080j3G.l0;
        if (interfaceC1232940iBo2 == null) {
            return;
        }
        interfaceC1232940iBo2.LIZ(false, minisPaymentNetworkResponse, null);
    }
}
