package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0xvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837700xvE extends AbstractC1837610xv5 implements InterfaceC1837810xvP {
    public final Map<String, String> LJIIIZ(InterfaceC1837420xum interfaceC1837420xum) {
        HashMap<String, String> mapLIZ = C1837740xvI.LIZ(this);
        mapLIZ.putAll(LJI(interfaceC1837420xum));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("merchant_id", ((C1837690xvD) this).LJIIJ());
        linkedHashMap.put("relation_type", String.valueOf(C1837690xvD.LJIIJJI()));
        mapLIZ.putAll(linkedHashMap);
        return mapLIZ;
    }

    public AbstractC1837700xvE(WeakReference weakReference, long j, long j2, long j3, String str) {
        super(weakReference, j, j2, j3, str);
    }
}
