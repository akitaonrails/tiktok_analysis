package X;

import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1By0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222061By0 implements InterfaceC2222291ByN {
    public final InterfaceC2222101By4 LIZ;
    public int LIZIZ;

    public C2222061By0(int i, InterfaceC2222101By4 interfaceC2222101By4) {
        this.LIZ = interfaceC2222101By4;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC2222291ByN
    public final int LIZ(List<? extends IMessage> list, C2222001Bxu c2222001Bxu) throws Exception {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LIZ.LJIIIIZZ().LJIILLIIL++;
        ArrayList arrayList = (ArrayList) list;
        if (!(!arrayList.isEmpty())) {
            list = null;
        }
        int i = 0;
        if (list != null) {
            Iterator<? extends IMessage> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                IMessage next = it2.next();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                c2222001Bxu.LJIIJ(next);
                i++;
                if (SystemClock.uptimeMillis() - jUptimeMillis2 > this.LIZIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("a message has timeout!!! ");
                    sbLIZ.append(SystemClock.uptimeMillis() - jUptimeMillis);
                    sbLIZ.append("ms ,");
                    sbLIZ.append(next.getClass());
                    this.LIZ.LIZIZ().log("MessageDispatchDelegate", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (SystemClock.uptimeMillis() - jUptimeMillis > this.LIZIZ) {
                    this.LIZ.LJIIIIZZ().LJIIZILJ++;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("messageList dispatch has timeout!!! ");
                    sbLIZ2.append(SystemClock.uptimeMillis() - jUptimeMillis);
                    sbLIZ2.append("ms, dispatchCount: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", messages size: ");
                    sbLIZ2.append(arrayList.size());
                    this.LIZ.LIZIZ().log("MessageDispatchDelegate", C2188811AlT.LIZIZ(sbLIZ2));
                    break;
                }
            }
        }
        return i;
    }
}
