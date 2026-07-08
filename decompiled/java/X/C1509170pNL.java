package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1509170pNL extends C1509180pNM {
    public static final /* synthetic */ int LIZIZ = 0;
    public final ConcurrentHashMap<String, C1509180pNM> LIZ = new ConcurrentHashMap<>();

    @Override // X.C1509180pNM
    public void LIZ(C1510230pP3 c1510230pP3) {
        Iterator<Map.Entry<String, C1509180pNM>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ(c1510230pP3);
        }
    }

    @Override // X.C1509180pNM
    public void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        Iterator<Map.Entry<String, C1509180pNM>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZIZ(c1510230pP3, c1509310pNZ);
        }
    }
}
