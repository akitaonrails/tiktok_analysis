package X;

import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: X.0W1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816520W1i extends AbstractC816530W1j<String> {
    public static String LIZ() throws ClassNotFoundException {
        C844470XAv.LIZ.getClass();
        if (C2204961BRm.LLIILZL((TelephonyManager) C786410Ut5.H2(C844470XAv.LIZ(), "phone"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KPq6bInH2De5jQfMGwaFIZgbD5AkW0n6", null)) == 2) {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getMethod("get", String.class).invoke(cls, "ro.cdma.home.operator.numeric")).substring(0, 3);
        }
        int i = C844470XAv.LIZ().getResources().getConfiguration().mcc;
        return i == 0 ? "" : String.valueOf(i);
    }
}
