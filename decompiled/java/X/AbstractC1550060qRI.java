package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1550060qRI implements InterfaceC1550120qRO {
    public final Map<String, String> LL;

    public final JSONObject LIZ() {
        Map<String, String> map = this.LL;
        return (map == null || map.isEmpty()) ? new JSONObject() : new JSONObject(this.LL);
    }

    public AbstractC1550060qRI(Map<String, String> map) {
        this.LL = map;
    }
}
