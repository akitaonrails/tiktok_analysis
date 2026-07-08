package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ZwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915960ZwY {
    public static void LIZ() {
        String string;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        EnumC921070a4n enumC921070a4nLLILIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01Z4.LIZ(null, linkedHashMap);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        int i = multiGuestDataHolder != null ? multiGuestDataHolder.LJJIFFI : 0;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (enumC921070a4nLLILIL = interfaceC937900aVwLLIIJLIL.LLILIL()) == null || (string = enumC921070a4nLLILIL.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("adaptation_type", string);
        linkedHashMap.put("guest_connected_cnt", String.valueOf(i));
        linkedHashMap.put("view_type", C930540aK4.LJFF() ? "guest" : "viewer");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_layout_adaptation");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }
}
