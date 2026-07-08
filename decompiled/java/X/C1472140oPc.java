package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1472140oPc {
    public final List<WeakReference<C1472150oPd>> LIZ = new CopyOnWriteArrayList();

    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : (CopyOnWriteArrayList) this.LIZ) {
            if (reference.get() == null || ((TTVideoEngine) reference.get()).LJL()) {
                arrayList.add(reference);
            }
        }
        if (arrayList.size() > 0) {
            ((CopyOnWriteArrayList) this.LIZ).removeAll(arrayList);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineInstanceWatcher:");
        sb.append(((CopyOnWriteArrayList) this.LIZ).size());
        sb.append(e3.e);
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            C1472150oPd c1472150oPd = (C1472150oPd) ((Reference) it2.next()).get();
            if (c1472150oPd != null) {
                sb.append(c1472150oPd);
                sb.append('#');
                sb.append(c1472150oPd.LJJI.LIZLLL);
                sb.append(":");
                int iLJJJJZI = c1472150oPd.LJJJJZI(57);
                sb.append(iLJJJJZI != 1 ? iLJJJJZI != 2 ? iLJJJJZI != 3 ? iLJJJJZI != 4 ? iLJJJJZI != 5 ? "UNKNOWN" : "RELEASE" : "ERROR" : "PLAYER_RUNNING" : "PARSING_DNS" : "FETCHING_INFO");
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final void LIZIZ(C1472150oPd c1472150oPd) {
        LIZ();
        Reference reference = null;
        for (Reference reference2 : (CopyOnWriteArrayList) this.LIZ) {
            if (reference2.get() == c1472150oPd) {
                reference = reference2;
            }
        }
        if (reference != null) {
            ((CopyOnWriteArrayList) this.LIZ).remove(reference);
            SimRadar.keyScan("MTTVideoEngine", toString(), new Object[0]);
        }
    }
}
