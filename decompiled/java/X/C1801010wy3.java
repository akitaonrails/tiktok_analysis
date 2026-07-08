package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801010wy3 extends C1504590pFx {
    public C1801010wy3(AnonymousClass1520 anonymousClass1520) {
        super(anonymousClass1520);
    }

    public static JSONObject LJII(InterfaceC1798940wui interfaceC1798940wui) throws JSONException {
        JSONObject jSONObject;
        Map<String, Object> data;
        JSONObject jSONObject2 = new JSONObject();
        if (interfaceC1798940wui != null && (data = interfaceC1798940wui.getData()) != null) {
            jSONObject = C2348609Ie.LIZLLL(data);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject2.put("data", jSONObject);
        return jSONObject2;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(final Number number, final JSONObject jSONObject) throws JSONException {
        super.LIZLLL(number, jSONObject);
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", -1);
            jSONObject2.put("error_msg", "params is null");
            LJ(number, jSONObject2);
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        new C1799190wv7().LIZJ(new InterfaceC1799120wv0() { // from class: X.0wuz
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // X.InterfaceC1799120wv0
            public final String getAlbumId() {
                return jSONObject.optString("albumId");
            }

            @Override // X.InterfaceC1799120wv0
            public final String getClientKey() {
                return jSONObject.optString("clientKey");
            }

            @Override // X.InterfaceC1799120wv0
            public final String getEpisodeId() {
                return jSONObject.optString("episodeId");
            }

            @Override // X.InterfaceC1799120wv0
            public final String getVid() {
                return jSONObject.optString("vid");
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
            public final List<String> provideParamList() {
                return C13BV.INSTANCE;
            }
        }, new CompletionBlock<InterfaceC1798940wui>() { // from class: X.0wy4
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                C1801010wy3 c1801010wy3 = this.LIZ;
                Number number2 = number;
                c1801010wy3.getClass();
                c1801010wy3.LJFF(number2, C1801010wy3.LJII((InterfaceC1798940wui) xBaseResultModel));
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                C1801010wy3 c1801010wy3 = this.LIZ;
                Number number2 = number;
                JSONObject jSONObject3 = new JSONObject();
                C1801010wy3 c1801010wy32 = this.LIZ;
                jSONObject3.put("error_code", i);
                jSONObject3.put("error_msg", str);
                c1801010wy32.getClass();
                jSONObject3.put("data", C1801010wy3.LJII((InterfaceC1798940wui) xBaseResultModel));
                c1801010wy3.LJ(number2, jSONObject3);
            }
        });
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
