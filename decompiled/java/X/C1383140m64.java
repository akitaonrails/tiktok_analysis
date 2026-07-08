package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383140m64 {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;

    public static C1392240mKk LIZ(C1378790lz3 c1378790lz3) {
        String str = LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1378790lz3.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        String strLIZIZ = C1943007jI.LIZIZ(LIZJ, c1378790lz3.LIZLLL);
        if (strLIZIZ != null) {
            str2 = strLIZIZ;
        }
        C1392240mKk c1392240mKk = new C1392240mKk(str, str3, str4, str2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateShareInfo, data:");
        sbLIZ.append(c1392240mKk);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1392240mKk;
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, MinisViewModel minisViewModel, InterfaceC1383150m65 interfaceC1383150m65) {
        String str2;
        String str3;
        InterfaceC1541990qEH kitView;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        String str4;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent2;
        NetworkResponse<MinisMetaResp> value2;
        MinisMetaResp minisMetaResp2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent3;
        NetworkResponse<MinisMetaResp> value3;
        MinisMetaResp minisMetaResp3;
        if (minisViewModel != null && (singleLiveEvent3 = minisViewModel.LLILLJJLI) != null && (value3 = singleLiveEvent3.getValue()) != null && (minisMetaResp3 = value3.data) != null) {
            str2 = minisMetaResp3.clientKey;
        } else {
            str2 = null;
        }
        LIZ = str2;
        if (minisViewModel != null && (singleLiveEvent2 = minisViewModel.LLILLJJLI) != null && (value2 = singleLiveEvent2.getValue()) != null && (minisMetaResp2 = value2.data) != null) {
            str3 = minisMetaResp2.name;
        } else {
            str3 = null;
        }
        LIZIZ = str3;
        LIZJ = str;
        WeakReference<InterfaceC1383150m65> weakReference = C1383160m66.LLILLL;
        C1383160m66.LLILLL = new WeakReference<>(interfaceC1383150m65);
        if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null && (str4 = minisMetaResp.packageConfig) != null && str4.length() != 0) {
            new C1383160m66();
            C1383160m66.LIZJ(new InterfaceC1383180m68() { // from class: X.0m3Q
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // X.InterfaceC1383180m68
                public final String getDesc() {
                    return "";
                }

                @Override // X.InterfaceC1383180m68
                public final String getImageUrl() {
                    return "";
                }

                @Override // X.InterfaceC1383180m68
                public final Map<String, Object> getQuery() {
                    return null;
                }

                @Override // X.InterfaceC1383180m68
                public final String getTitle() {
                    return "";
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
                public final List<String> provideParamList() {
                    return C13BV.INSTANCE;
                }
            }, new CompletionBlock<InterfaceC1383190m69>() { // from class: X.0m63
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onSuccess(XBaseResultModel xBaseResultModel, String str5) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onFailure(int i, String str5, XBaseResultModel xBaseResultModel) {
                }
            });
        } else if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("minis.share", null);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeGetShareInfoSignal, sendEventByJSON, view: ");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
