package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.effectconfig.EffectConfigViewModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622840sKg {
    public final C19EG LIZ;
    public final ShortVideoContext LIZIZ;
    public final InterfaceC1622860sKi LIZJ;
    public final LifecycleOwner LIZLLL;

    public final boolean LIZIZ() {
        if (TextUtils.isEmpty(this.LIZIZ.effectMetaInfo)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LIZIZ.effectMetaInfo);
            jSONObject.optString("effect_key");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "effect_meta_info_value");
            InterfaceC1622860sKi interfaceC1622860sKi = this.LIZJ;
            C786410Ut5.J3(jSONObject2);
            interfaceC1622860sKi.LIZ();
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sKh] */
    public final void LIZ(final InterfaceC1622450sK3 interfaceC1622450sK3) {
        if (!TextUtils.isEmpty(this.LIZIZ.effectImage)) {
            try {
                final JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(this.LIZIZ.effectImage), "effect_image_list");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (final int i = 0; i < length; i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        final String strOptString = jSONObject.optString("effect_key");
                        C1498800p6c.LIZ(this.LIZ, jSONObject.optString("effect_image_value"), new C1622870sKj(strOptString, i, jSONArray, interfaceC1622450sK3) { // from class: X.0sKh
                            public final /* synthetic */ int LLILLJJLI;
                            public final /* synthetic */ JSONArray LLILLL;
                            public final /* synthetic */ InterfaceC1622450sK3 LLILZ;

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                if (downloadInfo != null) {
                                    C1622840sKg c1622840sKg = this.LL;
                                    int i2 = this.LLILLJJLI;
                                    JSONArray jSONArray2 = this.LLILLL;
                                    InterfaceC1622450sK3 interfaceC1622450sK32 = this.LLILZ;
                                    InterfaceC1622860sKi interfaceC1622860sKi = c1622840sKg.LIZJ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(downloadInfo.getSavePath());
                                    sbLIZ.append(downloadInfo.getName());
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    interfaceC1622860sKi.LIZIZ();
                                    if (i2 == jSONArray2.length() - 1 && interfaceC1622450sK32 != null) {
                                        interfaceC1622450sK32.onSuccess();
                                    }
                                }
                            }

                            {
                                this.LLILLJJLI = i;
                                this.LLILLL = jSONArray;
                                this.LLILZ = interfaceC1622450sK3;
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1622840sKg(C19GS c19gs, ShortVideoContext shortVideoContext, C1621290sIB c1621290sIB, EffectConfigViewModel effectConfigViewModel, LifecycleOwner lifecycleOwner) {
        this.LIZ = c19gs;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = c1621290sIB;
        this.LIZLLL = lifecycleOwner;
    }
}
