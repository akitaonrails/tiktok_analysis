package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0EqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376920EqA {
    public static final String[] LIZ;

    static {
        String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("enable_upload_ugc_template_prop", String[].class, C376940EqC.LIZ);
        if (strArr == null) {
            strArr = new String[0];
        }
        LIZ = strArr;
    }
}
