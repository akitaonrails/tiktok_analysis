package X;

import android.os.MessageQueue;
import androidx.lifecycle.Lifecycle;
import java.util.List;

/* JADX INFO: renamed from: X.0FWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391590FWz implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C391590FWz c391590FWz) {
        ((C372050EiJ) c391590FWz.l0).LLLJL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProComponent runPreloadTaskIfNeeded:start delay ");
        C372050EiJ c372050EiJ = (C372050EiJ) c391590FWz.l0;
        sbLIZ.append(c372050EiJ.LLLJL - c372050EiJ.LLLJIL);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!((C372050EiJ) c391590FWz.l0).Xc2()) {
            ((C372050EiJ) c391590FWz.l0).y7();
            return false;
        }
        return false;
    }

    public static final boolean queueIdle$1(C391590FWz c391590FWz) {
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        List<String> listLJI;
        C0EIN c0ein = (C0EIN) c391590FWz.l0;
        c0ein.LLJJIII = null;
        if (!c0ein.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return false;
        }
        C0EIN c0ein2 = (C0EIN) c391590FWz.l0;
        if (!c0ein2.LLJJJIL) {
            c0ein2.o4();
            C0EGY c0egyH2 = ((C0EIN) c391590FWz.l0).H2();
            if (c0egyH2 != null && (interfaceC359940E9gAZ0 = c0egyH2.AZ0()) != null && (listLJI = interfaceC359940E9gAZ0.LJI()) != null) {
                ((C0EIN) c391590FWz.l0).e4(listLJI);
            }
        }
        return false;
    }

    public C391590FWz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
