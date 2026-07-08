package X;

import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819900WEi {
    public final Map<Class<?>, C0WF0<?>> LIZ;
    public final Map<Class<?>, C0WF4<?>> LIZIZ;
    public final C0WF0<Object> LIZJ;

    public final void LIZ(OutputStream outputStream, Object obj) {
        Map<Class<?>, C0WF0<?>> map = this.LIZ;
        C819960WEo c819960WEo = new C819960WEo(outputStream, map, this.LIZIZ, this.LIZJ);
        if (obj != null) {
            C0WF0<?> c0wf0 = map.get(obj.getClass());
            if (c0wf0 != null) {
                c0wf0.LIZ(obj, c819960WEo);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No encoder for ");
            sbLIZ.append(obj.getClass());
            throw new C820040WEw(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C819900WEi(Map map, Map map2, C819910WEj c819910WEj) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = c819910WEj;
    }
}
