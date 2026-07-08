package X;

import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.Map;
import kotlin.Unit;
import webcast.api.pgc_sub.PGCRecoverContractInAppResponse;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KAX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KAX {
    C11NZ<DataResponse<PGCCreateContractResult>> LIZ(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, int i2, String str7, int i3, int i4, String str8, String str9, Map<String, String> map);

    C11NZ<DataResponse<PGCTemplateListData>> LIZIZ(String str, int i, String str2, String str3, long j, long j2, boolean z, String str4, boolean z2);

    C11NZ LIZJ(String str, String str2, long j, String str3);

    C11JN checkSubOrder(String str, String str2);

    C11NZ<DataResponse<n>> getSubscribeInfo(boolean z, String str, boolean z2, String str2, int i);

    C11NZ getUserInfo(String str);

    C11NZ<DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>> resubscribeOrder(String str, String str2, String str3);

    C11NZ<DataResponse<Unit>> setRenewReminder(String str);
}
