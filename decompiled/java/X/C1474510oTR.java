package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.videoshop.context.VideoContext;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: X.0oTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474510oTR {
    public VideoContext LIZLLL;
    public final Map<C1474420oTI, InterfaceC2178671AOj> LIZ = new HashMap();
    public final Map<C1474420oTI, C1A79> LIZIZ = new HashMap();
    public final Queue<C1474420oTI> LIZJ = new LinkedList();
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final C1A79 LIZ(C1474420oTI c1474420oTI) {
        if (c1474420oTI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retrieveTextureVideoView vid:");
            sbLIZ.append(c1474420oTI.LIZ);
            sbLIZ.append(" title:");
            sbLIZ.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((LinkedList) this.LIZJ).remove(c1474420oTI);
        return (C1A79) ((HashMap) this.LIZIZ).remove(c1474420oTI);
    }

    public final InterfaceC2178671AOj LIZIZ(C1474420oTI c1474420oTI) {
        if (c1474420oTI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retrieveVideoController vid:");
            sbLIZ.append(c1474420oTI.LIZ);
            sbLIZ.append(" title:");
            sbLIZ.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((LinkedList) this.LIZJ).remove(c1474420oTI);
        return (InterfaceC2178671AOj) ((HashMap) this.LIZ).remove(c1474420oTI);
    }
}
