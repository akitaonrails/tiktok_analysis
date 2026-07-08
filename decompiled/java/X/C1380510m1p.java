package X;

import com.ss.android.ugc.aweme.longpress.LongPressComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1380510m1p {
    public final List<InterfaceC1380530m1r> LIZ = new ArrayList();
    public final Map<String, C1379540m0G> LIZIZ = new LinkedHashMap();

    public void LIZ(List<? extends InterfaceC1380530m1r> list) {
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZ).addAll(list);
        ((LinkedHashMap) this.LIZIZ).clear();
        for (InterfaceC1380530m1r interfaceC1380530m1r : (ArrayList) this.LIZ) {
            InterfaceC1380660m24 interfaceC1380660m24LIZJ = interfaceC1380530m1r.LIZJ().LIZJ();
            if (!(interfaceC1380660m24LIZJ instanceof C1379100lzY) || interfaceC1380660m24LIZJ == null) {
                interfaceC1380530m1r.LIZJ().getKey();
            }
            List<InterfaceC1380660m24> listLIZIZ = interfaceC1380530m1r.LIZIZ();
            ArrayList<LongPressComponent> arrayList = new ArrayList();
            for (InterfaceC1380660m24 interfaceC1380660m24 : listLIZIZ) {
                if (interfaceC1380660m24 instanceof LongPressComponent) {
                    arrayList.add(interfaceC1380660m24);
                }
            }
            for (LongPressComponent longPressComponent : arrayList) {
                if (Intrinsics.LJFF(longPressComponent.type, "action")) {
                    this.LIZIZ.put(longPressComponent.actionId, new C1379540m0G(longPressComponent));
                }
            }
        }
    }
}
