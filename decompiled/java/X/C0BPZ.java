package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BPZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4509));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4510));

    public static boolean LIZ() {
        C01GW c01gw = LIZ;
        int i = ((Keva) c01gw.getValue()).getInt("ttk_internal_share_clear_server_data_version", 0);
        C01GW c01gw2 = LIZIZ;
        if (i >= ((Number) c01gw2.getValue()).intValue()) {
            return false;
        }
        ((Keva) c01gw.getValue()).storeInt("ttk_internal_share_clear_server_data_version", ((Number) c01gw2.getValue()).intValue());
        return true;
    }
}
