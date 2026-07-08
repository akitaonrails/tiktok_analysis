package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.142h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202005142h implements InterfaceC202007142j {
    public final Map<String, InterfaceC202007142j> LIZ;
    public final C202006142i LIZIZ;

    public C202005142h() {
        HashMap map = new HashMap();
        this.LIZ = map;
        C202006142i c202006142i = new C202006142i();
        this.LIZIZ = c202006142i;
        map.put("android.permission.CAMERA", c202006142i);
        map.put("android.permission.RECORD_AUDIO", c202006142i);
    }

    @Override // X.InterfaceC202007142j
    public final boolean LIZ(Context context, String str) {
        if (((HashMap) this.LIZ).containsKey(str)) {
            return ((InterfaceC202007142j) ((HashMap) this.LIZ).get(str)).LIZ(context, str);
        }
        return this.LIZIZ.LIZ(context, str);
    }
}
