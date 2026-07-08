package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1581540rG4 {
    public C1548440qOg LIZ;
    public SparkContext LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LJ;

    public abstract String LIZ();

    public boolean LJ() {
        return this instanceof C1581580rG8;
    }

    public abstract String LJI();

    public final void LIZIZ() {
        C1548440qOg c1548440qOgLIZJ;
        if (this.LIZJ) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LIZJ && (c1548440qOgLIZJ = LIZJ()) != null) {
                    C1581010rFD.LIZIZ.LIZIZ(LIZ(), LJI(), c1548440qOgLIZJ);
                    this.LIZJ = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Register schema bizId: ");
                    sbLIZ.append(LIZ());
                    sbLIZ.append(", schema: ");
                    sbLIZ.append(LJI());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C1548440qOg LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = C1581010rFD.LIZIZ.LIZJ(C2097608Jq.LJ(), C13BV.INSTANCE, LJ(), LJFF());
        }
        return this.LIZ;
    }

    public final SparkContext LIZLLL() {
        C1548440qOg c1548440qOgLIZJ;
        if (this.LIZIZ == null && (c1548440qOgLIZJ = LIZJ()) != null) {
            this.LIZIZ = C1581010rFD.LIZIZ.LJ(LJI(), c1548440qOgLIZJ);
        }
        return this.LIZIZ;
    }

    public EnumC1548460qOi LJFF() {
        return EnumC1548460qOi.FOREST_RESOURCE_PRELOAD;
    }

    public final void LJII(JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        LIZIZ();
        WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference = this.LJ;
        if (weakReference != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = weakReference.get()) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.d1(C786410Ut5.J3(jSONObject));
        }
    }
}
