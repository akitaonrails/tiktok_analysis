package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Kas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC520320Kas implements Runnable {
    public final /* synthetic */ C520330Kat LL;

    public RunnableC520320Kas(C520330Kat c520330Kat) {
        this.LL = c520330Kat;
    }

    public final void LIZ() {
        int size = ((ArrayList) this.LL.LJ).size();
        C520330Kat c520330Kat = this.LL;
        if (size > c520330Kat.LIZLLL) {
            int size2 = ((ArrayList) c520330Kat.LJ).size();
            C520330Kat c520330Kat2 = this.LL;
            List<InterfaceC520350Kav> listSubList = ((ArrayList) c520330Kat2.LJ).subList(0, size2 - c520330Kat2.LIZLLL);
            C520330Kat c520330Kat3 = this.LL;
            for (InterfaceC520350Kav interfaceC520350Kav : listSubList) {
                interfaceC520350Kav.onDestroy();
                Room room = c520330Kat3.LIZ;
                Long lValueOf = null;
                Long lValueOf2 = room != null ? Long.valueOf(room.getId()) : null;
                Room room2 = c520330Kat3.LIZ;
                if (room2 != null) {
                    lValueOf = Long.valueOf(room2.getOwnerUserId());
                }
                C182700n3.LIZ(lValueOf2, lValueOf, Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "multi_tab_remove", interfaceC520350Kav.LIZLLL(), 1, null, interfaceC520350Kav.LIZ());
            }
            listSubList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("XMultiTabManager@5889.trimRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XMultiTabManager@5889.trimRunnable$1");
    }
}
