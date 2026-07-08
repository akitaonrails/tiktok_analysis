package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1845307Kp {
    public static final String[] LIZ;
    public static final C01GW<Map<String, Boolean>> LIZIZ;

    static {
        String[] strArr = {""};
        String[] strArr2 = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("ecosystem_precodecache_urls", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        LIZ = strArr;
        LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(495));
    }
}
