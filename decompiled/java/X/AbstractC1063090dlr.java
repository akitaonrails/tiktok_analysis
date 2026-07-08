package X;

import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;

/* JADX INFO: renamed from: X.0dlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1063090dlr {
    public final String LIZ;
    public final InteractiveBrandedEffectInfo LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public boolean LJFF;

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public final boolean LIZ() {
        return this.LJFF;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB a0() {
        return this.LJ;
    }

    public AbstractC1063090dlr(String str, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, int i, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        interactiveBrandedEffectInfo = (i2 & 2) != 0 ? null : interactiveBrandedEffectInfo;
        i = (i2 & 4) != 0 ? 0 : i;
        this.LIZ = str;
        this.LIZIZ = interactiveBrandedEffectInfo;
        this.LIZJ = i;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = false;
    }
}
