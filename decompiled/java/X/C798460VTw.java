package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0VTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798460VTw {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C798470VTx());

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ(int i, String str) {
        if (i != 1) {
            if (i == 2) {
                if (str == null) {
                    str = "";
                }
                LIZ().storeString("monitor_data_group_2", str);
                return;
            }
            return;
        }
        if (str == null) {
            str = "";
        }
        LIZ().storeString("monitor_data_group_1", str);
    }
}
