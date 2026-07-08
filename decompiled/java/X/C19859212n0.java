package X;

import android.os.IBinder;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19859212n0 extends NetworkFileFetcher implements InterfaceC19858112mp {
    public final C19858912mx LL;
    public final BPEAHandler LLILLJJLI;
    public final Map<String, List<InterfaceC19859512n3>> LLILLL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("not implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19859212n0(C19858912mx c19858912mx) {
        this.LL = c19858912mx;
        c19858912mx.LJI = this;
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
        this.LLILLL = new LinkedHashMap();
    }

    @Override // X.InterfaceC19858112mp
    public final void LJJI(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            LJJJJI(str, -1);
            return;
        }
        List list = (List) ((LinkedHashMap) this.LLILLL).get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC19859512n3) it2.next()).notifySuccess(str2);
            }
        }
        this.LLILLL.remove(str);
    }

    @Override // X.InterfaceC19858112mp
    public final void LJJJJI(String str, int i) {
        if (str != null && i != 0) {
            List list = (List) ((LinkedHashMap) this.LLILLL).get(str);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC19859512n3) it2.next()).notifyError(i, "download error");
                }
            }
            this.LLILLL.remove(str);
        }
    }

    @Override // com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher
    public final void LJJJZ(final String str, final String str2, final C539420LDo c539420LDo) {
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new Runnable() { // from class: X.12mz
            /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 261
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC19859112mz.run():void");
            }
        });
    }
}
