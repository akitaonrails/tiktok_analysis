package X;

import com.bytedance.android.starship.wrapper.StarshipWrapper;
import java.util.Map;

/* JADX INFO: renamed from: X.0k7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306950k7B {
    public static InterfaceC1306890k75 LIZ(int i) {
        C01GW<Map<Integer, InterfaceC1306890k75>> c01gw = StarshipWrapper.containers$delegate;
        InterfaceC1306890k75 interfaceC1306890k75 = c01gw.getValue().get(Integer.valueOf(i));
        if (interfaceC1306890k75 == null) {
            InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306940k7A.LIZ.LIZ(EnumC1306750k6r.values()[i]);
            c01gw.getValue().put(Integer.valueOf(i), interfaceC1306890k75LIZ);
            return interfaceC1306890k75LIZ;
        }
        return interfaceC1306890k75;
    }
}
