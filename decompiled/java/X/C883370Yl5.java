package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.im.core.api.depend.IWsDepend;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Yl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883370Yl5 implements InterfaceC883440YlC, IWsDepend {
    public static final C883370Yl5 LL;
    public static final C01GW LLILLJJLI;

    static {
        C883370Yl5 c883370Yl5 = new C883370Yl5();
        LL = c883370Yl5;
        LLILLJJLI = C452501pT.LIZIZ(new C883430YlB());
        C882400YjW.LIZ.getClass();
        C882400YjW.LJII();
        WsDependImpl.LL.LJ(c883370Yl5);
    }

    public static final boolean LIZIZ() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LJII();
        return WsDependImpl.LL.LIZJ();
    }

    public static final void LIZJ(InterfaceC883440YlC interfaceC883440YlC) {
        ((CopyOnWriteArraySet) LLILLJJLI.getValue()).add(interfaceC883440YlC);
    }

    public static final void LIZLLL(WsChannelMsg wsChannelMsg) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMsg: ");
        sbLIZ.append(wsChannelMsg.service);
        sbLIZ.append(", ");
        sbLIZ.append(wsChannelMsg.method);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("WsBridge");
        C882400YjW.LJII();
        WsDependImpl.LL.LJFF(wsChannelMsg);
    }

    @Override // X.InterfaceC883440YlC
    public final void LIZ(C0Z46 c0z46) {
        String strLJJLL;
        if (c0z46.LIZ == C0XE1.CONNECTED) {
            String str = c0z46.LIZIZ;
            if (str != null) {
                strLJJLL = a0.LJJLL('?', str, str);
            } else {
                strLJJLL = null;
            }
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStateChanged: connected url: ");
            sbLIZ.append(strLJJLL);
            C882690Yjz.LJIIIZ("WsBridge", C2188811AlT.LIZIZ(sbLIZ));
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onStateChanged: state: ");
        sbLIZ2.append(c0z46.LIZ);
        C882690Yjz.LJIIIZ("WsBridge", C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = ((CopyOnWriteArraySet) LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC883440YlC) it2.next()).LIZ(c0z46);
        }
    }

    @Override // X.InterfaceC883440YlC
    public final void LJI(WsChannelMsg wsChannelMsg) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceivedMsg: ");
        sbLIZ.append(wsChannelMsg.service);
        sbLIZ.append(", ");
        sbLIZ.append(wsChannelMsg.method);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("WsBridge");
        Iterator it2 = ((CopyOnWriteArraySet) LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC883440YlC) it2.next()).LJI(wsChannelMsg);
        }
    }
}
