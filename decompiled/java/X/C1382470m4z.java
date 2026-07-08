package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.0m4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382470m4z {
    public final Function1<Map<String, Boolean>, Unit> LIZ;
    public final InterfaceC897330ZId LIZIZ;

    public C1382470m4z(AwS610S0100000_31 awS610S0100000_31) {
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897520ZIw c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.CAMERA_DM_SHARE_PANEL, false);
        this.LIZ = awS610S0100000_31;
        this.LIZIZ = c897520ZIwLJI;
        if (c897520ZIwLJI != null) {
            c897520ZIwLJI.LIZIZ(false, new C0NYY() { // from class: X.0NZ2
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    Function1<Map<String, Boolean>, Unit> function1 = this.LL.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                    Iterator<T> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        linkedHashMap.put(entry.getKey(), Boolean.valueOf(C896480ZEw.LIZJ((C595660NXw) entry.getValue())));
                    }
                    function1.invoke(linkedHashMap);
                    return Unit.LIZ;
                }
            });
        }
    }
}
