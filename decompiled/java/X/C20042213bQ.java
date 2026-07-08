package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20042213bQ {
    public final Object LIZ;
    public boolean LIZIZ = true;
    public final C182900n5 LIZJ;

    public final void LIZ(Map<Object, Map<String, List<Object>>> map) {
        if (this.LIZIZ) {
            Map<String, List<Object>> mapG4 = this.LIZJ.g4();
            if (mapG4.isEmpty()) {
                map.remove(this.LIZ);
            } else {
                map.put(this.LIZ, mapG4);
            }
        }
    }

    public C20042213bQ(C20042013bO c20042013bO, Object obj) {
        this.LIZ = obj;
        this.LIZJ = new C182900n5(c20042013bO.LIZ.get(obj), new AwS609S0100000_30(c20042013bO, 241));
    }
}
