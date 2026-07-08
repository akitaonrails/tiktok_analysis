package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883920z7m {
    public static final /* synthetic */ int LIZLLL = 0;
    public final boolean LIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ;
    public InterfaceC1541990qEH LIZJ;

    public final void LIZ() {
        if (this.LIZ) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LLD(true);
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
    }

    public final String LIZIZ() {
        SparkContext sparkContext;
        C1537480q70 hybridContext;
        if (this.LIZ) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
            if (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null) {
                return null;
            }
            return hybridContext.containerId;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL) == null) {
            return null;
        }
        return sparkContext.containerId;
    }

    public final View LIZJ() {
        if (!this.LIZ) {
            return this.LIZIZ;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.e1();
        }
        return null;
    }

    public C1883920z7m(boolean z) {
        this.LIZ = z;
    }

    public final void LIZLLL(String str, JSONObject jSONObject) {
        if (this.LIZ) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ(str, jSONObject);
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ(str, jSONObject);
    }
}
