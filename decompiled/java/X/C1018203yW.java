package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.03yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1018203yW {
    public static final String[] LIZ = {"search_result_id", "search_id", "search_entrance"};

    public static final String[] LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("search_pdp_tracking_params_list", String[].class, strArr);
        return strArr2 != null ? strArr2 : strArr;
    }
}
