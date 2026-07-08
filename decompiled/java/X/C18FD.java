package X;

import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;

/* JADX INFO: renamed from: X.18FD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FD {
    public static final String LIZ;
    public static final String LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmViewUtils_");
        sbLIZ.append("show");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BtmViewUtils_");
        sbLIZ2.append("hide");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Boolean bool) {
        C18CK.LJIIL(LIZIZ, new C21260418Hy(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getClass().getName()));
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.getPageLifecycle().LJFF(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, bool, null);
        btmSDK.getPageLifecycle().LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, BtmPageLifecycle.State.PAUSED);
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Boolean bool) {
        C18CK.LJIIL(LIZ, new C21260518Hz(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getClass().getName()));
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.getPageLifecycle().LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, bool, null);
        btmSDK.getPageLifecycle().LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, BtmPageLifecycle.State.RESUMED);
    }
}
