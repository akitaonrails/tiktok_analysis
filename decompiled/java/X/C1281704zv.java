package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281704zv implements InterfaceC1281804zw {
    public final HashMap<String, String> LIZ;

    public C1281704zv(HashMap<String, String> map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC1281804zw
    public final void LIZ(List<? extends InterfaceC1282004zy> list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, Object> entry : ((InterfaceC1282004zy) it2.next()).keyParams().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    this.LIZ.put(key, value.toString());
                }
            }
        }
    }
}
