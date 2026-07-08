package X;

import com.bytedance.keva.Keva;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816020Vzk {
    public static final C816020Vzk LIZ = new C816020Vzk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(429));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZIZ(String str, InterfaceC815880VzW interfaceC815880VzW) {
        if (Intrinsics.LJFF(interfaceC815880VzW.getType(), "minis")) {
            return;
        }
        String strJ4 = C786410Ut5.j4("create_%s_timestamp", Arrays.copyOf(new Object[]{interfaceC815880VzW.getType()}, 1));
        String strJ42 = C786410Ut5.j4("create_%s_from", Arrays.copyOf(new Object[]{interfaceC815880VzW.getType()}, 1));
        LIZ().storeLong(strJ4, System.currentTimeMillis());
        LIZ().storeString(strJ42, str);
    }
}
