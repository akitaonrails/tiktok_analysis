package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.10Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19263510Xx {
    public static String LIZJ() {
        String strLJIIIIZZ;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            String string = C810670Vr7.LIZJ(C01AB.LIZ(), 0, "test_setting").getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C01AB.LIZ(), "phone");
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLJIIIIZZ = C1300840jxK.LJIIIIZZ(telephonyManager);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIIIIZZ = "";
        }
        return !TextUtils.isEmpty(strLJIIIIZZ) ? strLJIIIIZZ.toUpperCase(Locale.getDefault()) : strLJIIIIZZ;
    }

    public static String LIZIZ() {
        return C786410Ut5.t2(LIZ(C01AB.LIZ()));
    }

    public static Locale LIZ(Context context) {
        Locale locale;
        if (context != null) {
            try {
                locale = (Locale) C19748512Ol.LIZIZ.LJII((String) C1305440k4k.LIZIZ(context).LIZLLL("sp_lanuage_last_select_tag", EnumC1305450k4l.STRING, ""), Locale.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!(locale instanceof Locale)) {
                locale = null;
            }
        } else {
            locale = null;
        }
        if (locale != null) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            if (TextUtils.isEmpty(C837920Wty.LIZIZ(locale))) {
                return new Locale(C786410Ut5.t2(locale), C837920Wty.LIZIZ(Locale.getDefault()), locale.getVariant());
            }
            return locale;
        }
        return Locale.getDefault();
    }
}
