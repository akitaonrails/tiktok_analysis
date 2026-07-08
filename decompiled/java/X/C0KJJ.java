package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0KJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJJ {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0KJY());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0KJI());

    public final MutableLiveData LIZ(String str, final Function1 function1) {
        this.LIZIZ.getValue().getClass();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        C480460Ism.LIZ().getClass();
        C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getUserInfo(str, 0L, 0L, 0), EnumC510330Jzr.GENERAL, C515280KIs.class.getSimpleName(), "sub/user/info", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00iq
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubPackageInfoService@3a43.fetchSubUserInfo$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && baseResponse.data != null) {
                    mutableLiveData.setValue((SubscribeUserInfoResponse) baseResponse.data);
                    function1.invoke((SubscribeUserInfoResponse) baseResponse.data);
                }
                C1C7U.LIZIZ("SubPackageInfoService@3a43.fetchSubUserInfo$1");
            }
        }, new C09JN() { // from class: X.00MI
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SubPackageInfoService@3a43.fetchSubUserInfo$2");
                C1C7U.LIZIZ("SubPackageInfoService@3a43.fetchSubUserInfo$2");
            }
        });
        return mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0KJJ r17, android.content.Context r18, com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo r19, java.lang.String r20, java.lang.String r21, X.C0KMQ r22, java.util.Map r23, java.lang.String r24, boolean r25, X.EnumC513390KBl r26, boolean r27, int r28) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KJJ.LIZIZ(X.0KJJ, android.content.Context, com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo, java.lang.String, java.lang.String, X.0KMQ, java.util.Map, java.lang.String, boolean, X.0KBl, boolean, int):void");
    }
}
