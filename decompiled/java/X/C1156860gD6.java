package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156860gD6 implements InterfaceC1156870gD7 {
    public final /* synthetic */ C1162990gMz LIZ;

    public C1156860gD6(C1162990gMz c1162990gMz) {
        this.LIZ = c1162990gMz;
    }

    @Override // X.InterfaceC1156870gD7
    public final void LIZ(Map<String, ? extends Object> map) {
        long jCurrentTimeMillis;
        Long l;
        Object obj = ((LinkedHashMap) map).get("t_draw_end");
        C1156700gCq c1156700gCq = null;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C1156700gCq c1156700gCq2 = this.LIZ.LJFF;
        if (c1156700gCq2 != null) {
            c1156700gCq = c1156700gCq2;
        }
        c1156700gCq.getClass();
        c1156700gCq.LJI(new C1156730gCt(jCurrentTimeMillis, true));
    }

    @Override // X.InterfaceC1156870gD7
    public final void LIZIZ(Map<String, ? extends Object> map) {
        long jCurrentTimeMillis;
        Long l;
        Object obj = ((LinkedHashMap) map).get("t_draw_end");
        C1156700gCq c1156700gCq = null;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C1156700gCq c1156700gCq2 = this.LIZ.LJFF;
        if (c1156700gCq2 != null) {
            c1156700gCq = c1156700gCq2;
        }
        c1156700gCq.getClass();
        c1156700gCq.LJI(new C1156730gCt(jCurrentTimeMillis, false));
    }
}
