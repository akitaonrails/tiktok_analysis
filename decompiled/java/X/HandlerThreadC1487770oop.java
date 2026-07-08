package X;

import android.os.Process;
import ci3.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class HandlerThreadC1487770oop extends a {
    public final List<String> LL;
    public int LLILLJJLI;

    @Override // java.lang.Thread
    public final String toString() {
        if (!C1487750oon.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MHandlerThread : ");
            sbLIZ.append(getName());
            sbLIZ.append(", ");
            sbLIZ.append(this.LL.toString());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MHandlerThread : ");
        sbLIZ2.append(getName());
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LL.toString());
        sbLIZ2.append(", isAlive:");
        sbLIZ2.append(isAlive());
        sbLIZ2.append(" state:");
        sbLIZ2.append(getState());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZIZ(int i) {
        if (getThreadId() == -1) {
            if (C1487750oon.LIZIZ()) {
                C1487750oon.LIZ("MediaLogger", "getThreadId = -1, error happened");
            }
        } else {
            if (i == this.LLILLJJLI) {
                if (C1487750oon.LIZIZ()) {
                    C1487750oon.LIZ("MediaLogger", "priority not change");
                    return;
                }
                return;
            }
            this.LLILLJJLI = i;
            Process.setThreadPriority(getThreadId(), i);
            if (C1487750oon.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("optimize Update thread priority:");
                sbLIZ.append(i);
                C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public HandlerThreadC1487770oop(String str, int i) {
        super(str, i);
        this.LL = new ArrayList();
        this.LLILLJJLI = i;
    }
}
