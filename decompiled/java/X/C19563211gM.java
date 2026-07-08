package X;

/* JADX INFO: renamed from: X.11gM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19563211gM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str, boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i));
        c543670LTx.LIZ.put("tab_name", str);
        C1637890six.LJ("sound_effect_list", i2, c543670LTx.LJ());
    }

    public static void LIZJ(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i2));
        c543670LTx.LIZ.put("type", Integer.valueOf(i));
        C1637890six.LJ("sound_effect_tab", i3, c543670LTx.LJ());
    }

    public static void LIZ(Integer num, String str, String str2, boolean z) {
        int i;
        int iIntValue = 0;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C543670LTx c543670LTx = new C543670LTx();
        if (num != null) {
            iIntValue = num.intValue();
        }
        c543670LTx.LIZ.put("error_code", Integer.valueOf(iIntValue));
        c543670LTx.LIZ.put("sid", str);
        if (str2 == null) {
            str2 = "";
        }
        c543670LTx.LIZ.put("error_msg", str2);
        C1637890six.LJ("sound_effect_download", i, c543670LTx.LJ());
    }
}
