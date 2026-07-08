package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C406001hy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (C931790aM5.LIZIZ()) {
            map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
        }
        map.put("is_show_layout", (!C931790aM5.LIZIZ() ? !((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || interfaceC937820aVoLJJJJZ.getLayoutId() == null) : !C940770aaZ.LIZ().getDataSource().LJJIIZ()) ? CardStruct.IStatusCode.DEFAULT : "1");
        C0KX4.LIZ("livesdk_multi_show_layout_show", map, null, true);
    }

    public static void LIZ(boolean z) {
        String str;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (C931790aM5.LIZIZ()) {
            map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
        }
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        map.put("switch_to", str);
        C0KX4.LIZ("livesdk_multi_show_layout_on_and_off", map, null, true);
    }
}
