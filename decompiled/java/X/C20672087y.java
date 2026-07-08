package X;

import com.bef.effectsdk.message.MessageCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.087y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C20672087y implements InterfaceC19428410zi, MessageCenter.Listener {
    public final List<MessageCenter.Listener> LL = new ArrayList();

    @Override // X.InterfaceC19428410zi
    public final void Kq(MessageCenter.Listener listener) {
        if (!((ArrayList) this.LL).contains(listener)) {
            ((ArrayList) this.LL).add(listener);
        }
    }

    @Override // X.InterfaceC19428410zi
    public final void g9(MessageCenter.Listener listener) {
        if (((ArrayList) this.LL).contains(listener)) {
            ((ArrayList) this.LL).remove(listener);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((MessageCenter.Listener) it2.next()).onMessageReceived(i, i2, i3, str);
        }
    }
}
