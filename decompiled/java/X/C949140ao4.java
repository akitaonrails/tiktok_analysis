package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ao4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949140ao4 {
    public final Map<String, C949120ao2> LIZ = new LinkedHashMap();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public final boolean LIZ(String str) {
        Map<String, C949120ao2> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_dance");
        sbLIZ.append('_');
        sbLIZ.append(str);
        C949120ao2 c949120ao2 = (C949120ao2) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (c949120ao2 != null) {
            return c949120ao2.LJFF;
        }
        return false;
    }
}
