package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0V6O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6O extends C0V6N {
    public final /* synthetic */ Context LIZ;

    public static final Map<String, String> LIZ() {
        Map<String, String> queryParams;
        Context context = C792400V6o.LIZ;
        synchronized (C792400V6o.class) {
            InterfaceC792020V5c interfaceC792020V5c = C792400V6o.LJJI;
            if (interfaceC792020V5c == null || (queryParams = interfaceC792020V5c.getQueryParams()) == null || queryParams.size() <= 0) {
                C792410V6p c792410V6p = C792400V6o.LJIL;
                if (c792410V6p != null) {
                    return c792410V6p.LJIIIIZZ;
                }
                return null;
            }
            if (C792400V6o.LJIL.LJIIIIZZ == null) {
                return queryParams;
            }
            HashMap map = new HashMap(C792400V6o.LJIL.LJIIIIZZ);
            map.putAll(queryParams);
            return map;
        }
    }

    public C0V6O(Context context) {
        this.LIZ = context;
    }
}
