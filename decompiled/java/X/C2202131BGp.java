package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202131BGp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(167));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(168));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZIZ(String str) {
        if (str == null) {
            LIZ().erase("last_bubble_id");
        } else {
            LIZ().storeString("last_bubble_id", str);
        }
    }
}
