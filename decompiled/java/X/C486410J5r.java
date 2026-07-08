package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0J5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486410J5r implements InterfaceC486470J5x {
    public static final C486410J5r LL = new C486410J5r();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C486440J5u());
    public static boolean LLILLL;

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        Iterator it2 = ((CopyOnWriteArrayList) LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC486470J5x) it2.next()).LIZIZ(wsChannelMsg);
        }
    }
}
