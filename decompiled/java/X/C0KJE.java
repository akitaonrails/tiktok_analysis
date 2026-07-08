package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KJE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJE extends C0K07<C0KJG> {
    public final FlashDataProvider LL;
    public final FrameLayout LLILLJJLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public C0KJG LLILZ;

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        LynxView lynxView;
        C0KJG c0kjg = (C0KJG) interfaceC515600KJy;
        C0KJG c0kjg2 = this.LLILZ;
        JSONObject jSONObjectLIZ = null;
        if (c0kjg2 == null) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LIZIZ();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C470320IcQ.LIZ.LIZ(this.itemView.getContext(), c0kjg.LL, "", true, AFwS290S0000000_7.get$arr$(1));
            this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ != null) {
                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView();
                if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                    FlashDataProvider flashDataProvider = this.LL;
                    if (flashDataProvider != null) {
                        jSONObjectLIZ = flashDataProvider.LIZ();
                    }
                    lynxView.updateData(String.valueOf(jSONObjectLIZ));
                }
                FrameLayout frameLayout = this.LLILLJJLI;
                if (frameLayout != null) {
                    frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                }
            }
        } else if (this.LLILLL != null && !Intrinsics.LJFF(c0kjg2, c0kjg) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL) != null) {
            String str = c0kjg.LL;
            FlashDataProvider flashDataProvider2 = this.LL;
            if (flashDataProvider2 != null) {
                jSONObjectLIZ = flashDataProvider2.LIZ();
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(TemplateData.LJIIIIZZ(String.valueOf(jSONObjectLIZ)), str, false);
        }
        this.LLILZ = c0kjg;
    }

    public C0KJE(View view, FlashDataProvider flashDataProvider) {
        super(view);
        this.LL = flashDataProvider;
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.vsu);
    }
}
