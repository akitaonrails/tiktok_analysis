package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022140cho {
    public final Context LIZ;
    public final AwemeRawAd LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(562));
    public DialogC1378340lyK LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJFF;

    public final void LIZ() {
        Unit unit;
        try {
            DialogC1378340lyK dialogC1378340lyK = this.LIZLLL;
            if (dialogC1378340lyK != null) {
                dialogC1378340lyK.dismiss();
                C785410UrT.LIZ(dialogC1378340lyK);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZLLL = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
        }
        this.LJFF = null;
        this.LJ = null;
    }

    public C1022140cho(Context context, AwemeRawAd awemeRawAd) {
        this.LIZ = context;
        this.LIZIZ = awemeRawAd;
    }
}
