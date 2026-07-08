package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814140Vwi {
    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZJ(Intent intent) {
        Bundle bundleLIZ;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (bundleLIZ = LIZ(intent)) == null) {
            return false;
        }
        return "1".equals(bundleLIZ.getString("google.c.a.e"));
    }

    public static void LIZIZ(Bundle bundle, String str) {
        String str2;
        String string;
        try {
            C818880WAk.LIZIZ();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string2 = bundle.getString("google.c.a.c_id");
            if (string2 != null) {
                C786410Ut5.LJJJI("_nmid", string2, bundle2);
            }
            String string3 = bundle.getString("google.c.a.c_l");
            if (string3 != null) {
                C786410Ut5.LJJJI("_nmn", string3, bundle2);
            }
            String string4 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string4)) {
                C786410Ut5.LJJJI("label", string4, bundle2);
            }
            String string5 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string5)) {
                C786410Ut5.LJJJI("message_channel", string5, bundle2);
            }
            String string6 = bundle.getString("from");
            if (string6 != null && string6.startsWith("/topics/")) {
                C786410Ut5.LJJJI("_nt", string6, bundle2);
            }
            String string7 = bundle.getString("google.c.a.ts");
            if (string7 != null) {
                try {
                    bundle2.putInt("_nmt", CastIntegerProtector.parseInt(string7));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (bundle.containsKey("google.c.a.udt") && (string = bundle.getString("google.c.a.udt")) != null) {
                try {
                    bundle2.putInt("_ndt", CastIntegerProtector.parseInt(string));
                } catch (NumberFormatException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (C814070Vwb.LJFF(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                C786410Ut5.LJJJI("_nmc", str2, bundle2);
            }
            C818880WAk c818880WAkLIZIZ = C818880WAk.LIZIZ();
            c818880WAkLIZIZ.LIZ();
            InterfaceC814150Vwj interfaceC814150Vwj = (InterfaceC814150Vwj) c818880WAkLIZIZ.LIZLLL.LIZIZ(InterfaceC814150Vwj.class);
            if (interfaceC814150Vwj != null) {
                interfaceC814150Vwj.LIZ(str, bundle2);
            }
        } catch (IllegalStateException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
