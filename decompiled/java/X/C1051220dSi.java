package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051220dSi implements InterfaceC1051160dSc {
    public final SparkContext LIZ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ;

    @Override // X.InterfaceC1051160dSc
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
            SparkContext sparkContext = this.LIZ;
            c1051410dT1.getClass();
            if (sparkContext == null) {
                C811103Ev.LIZ(null);
            } else {
                sparkContext.LJJ(C1051230dSj.class, new C1051230dSj(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB));
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            }
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final SparkContext LLIILZL() {
        SparkContext sparkContext = this.LIZ;
        if (sparkContext != null) {
            return sparkContext;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        }
        return null;
    }

    @Override // X.InterfaceC1051160dSc
    public final void destroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final String getContainerId() {
        SparkContext sparkContext;
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (str = sparkContext.containerId) != null) {
            return str;
        }
        SparkContext sparkContext2 = this.LIZ;
        if (sparkContext2 != null) {
            return sparkContext2.containerId;
        }
        return null;
    }

    @Override // X.InterfaceC1051160dSc
    public final InterfaceC1541990qEH getKitView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        }
        return null;
    }

    @Override // X.InterfaceC1051160dSc
    public final void release() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final void close() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1059280dfiLJJIJLIJ = sparkContextLLIILZL.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.close();
    }

    @Override // X.InterfaceC1051160dSc
    public final void onHide() {
        InterfaceC1541990qEH kitView = getKitView();
        if (kitView != null) {
            kitView.onHide();
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final void refresh() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1059280dfiLJJIJLIJ = sparkContextLLIILZL.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.refresh();
    }

    @Override // X.InterfaceC1051160dSc
    public final View getView() {
        return this.LIZIZ;
    }

    public C1051220dSi(SparkContext sparkContext, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LIZ = sparkContext;
        this.LIZIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    @Override // X.InterfaceC1051160dSc
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView = getKitView();
        if (kitView != null) {
            kitView.LIZ(str, jSONObject);
        }
    }
}
