package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import qo2.w;

/* JADX INFO: renamed from: X.01Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01Z6 {
    public static void LIZ(boolean z) {
        String str;
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        int iLJIIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_guest_window_click");
        c474500IjALIZ.LJJII(strLJIIJ, "link_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iLJIIL), "guest_cnt");
        c474500IjALIZ.LJJII("click", "action_type");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_empty");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
            c474500IjALIZ.LJJII(room.getOwner().getIdStr(), "anchor_id");
            c474500IjALIZ.LJJII("live_voice", "live_type");
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null) {
            layoutId = interfaceC937820aVoLJJJJZ.getLayoutId();
        } else {
            layoutId = null;
        }
        c474500IjALIZ.LJJII(layoutId, "layout_id");
        c474500IjALIZ.LIZ();
    }
}
