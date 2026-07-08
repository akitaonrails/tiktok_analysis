package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteCountDownSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0a3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920310a3Z {
    public final Map<String, C466310IQj> LIZ = new LinkedHashMap();
    public final int LIZIZ = MultiGuestInviteCountDownSetting.getCountDownSeconds();

    public final void LIZJ() {
        C20441214yg.LIZIZ("InviteCountDownManager", "InviteCountDownManager clear");
        Iterator it2 = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((C466310IQj) it2.next()).LIZ();
        }
        ((LinkedHashMap) this.LIZ).clear();
    }

    public final void LIZ(final String str) {
        C925320aBe.LIZ.getClass();
        if (C925320aBe.LIZLLL() || C925320aBe.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InviteCountDownManager addCountDownTimer uid=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("InviteCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
            C466310IQj c466310IQj = (C466310IQj) ((LinkedHashMap) this.LIZ).get(str);
            if (c466310IQj != null) {
                c466310IQj.LIZ();
            }
            C466310IQj c466310IQj2 = new C466310IQj(((long) this.LIZIZ) * 1000, 1000L, new InterfaceC466320IQk() { // from class: X.0a0h
                @Override // X.InterfaceC466320IQk
                public final void LJJI(long j) {
                }

                @Override // X.InterfaceC466320IQk
                public final void onStart() {
                }

                @Override // X.InterfaceC466320IQk
                public final void LIZLLL() {
                    InterfaceC954180awC interfaceC954180awCLLJLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("InviteCountDownManager onFinish, uid=");
                    sbLIZ2.append(str);
                    C20441214yg.LIZIZ("InviteCountDownManager", C2188811AlT.LIZIZ(sbLIZ2));
                    C920310a3Z c920310a3Z = this;
                    String str2 = str;
                    c920310a3Z.getClass();
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room == null || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null) {
                        return;
                    }
                    long id = room.getId();
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                    interfaceC954180awCLLJLL.LJJJJLL(new C920400a3i(id, lLJIILIIL != null ? lLJIILIIL.longValue() : 0L, 0L, 60), null);
                }
            });
            c466310IQj2.LJ();
            this.LIZ.put(str, c466310IQj2);
        }
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteCountDownManager cancelCountDownTimer uid=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("InviteCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        C466310IQj c466310IQj = (C466310IQj) ((LinkedHashMap) this.LIZ).get(str);
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LIZ.remove(str);
    }
}
