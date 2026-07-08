package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623210OcR {
    public C620650OVz LIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public ARunnableS109S0100000_9 LJFF;
    public C623230OcT LJI;
    public final List<C620650OVz> LIZIZ = new ArrayList();
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZIZ() {
        if (!(!this.LIZIZ.isEmpty())) {
            C0OPX.LJII("[Scheduler] Queue empty, all animations done");
            return;
        }
        C620650OVz c620650OVz = (C620650OVz) ListProtector.remove(this.LIZIZ, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] Process next from queue: ");
        sbLIZ.append(C0OXA.LIZ(c620650OVz));
        sbLIZ.append(", remainingQueue=");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        LIZ(c620650OVz);
    }

    public final void LIZ(C620650OVz c620650OVz) {
        if (c620650OVz.LIZ == c620650OVz.LIZIZ && c620650OVz.LIZJ == c620650OVz.LIZLLL && c620650OVz.LJ == c620650OVz.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Scheduler] Skip invalid change (no actual change): ");
            sbLIZ.append(C0OXA.LIZ(c620650OVz));
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Scheduler] Execute animation: ");
        sbLIZ2.append(C0OXA.LIZ(c620650OVz));
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZJ = true;
        C623230OcT c623230OcT = this.LJI;
        if (c623230OcT != null) {
            c623230OcT.invoke(c620650OVz);
        }
    }
}
