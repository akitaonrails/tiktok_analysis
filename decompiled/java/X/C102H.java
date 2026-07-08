package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.tiktok.pns.utils.network.api.UserSettingsApi;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.102H, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102H {
    public static final /* synthetic */ C102H LIZ = new C102H();
    public static final C01GW<UserSettingsApi> LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(436));

    public static Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
        C844470XAv.LIZ.getClass();
        SharedPreferences sharedPreferencesLJ = c813020VuuLJIIL.LJ(C844470XAv.LIZ());
        if (sharedPreferencesLJ == null) {
            string = null;
        } else {
            string = sharedPreferencesLJ.getString("last_user_setting_version", "");
        }
        return LIZIZ.getValue().getUserSettings(string, interfaceC1364105Vn);
    }
}
