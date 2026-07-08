package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21188517vv {
    public static final HashMap<String, C21188517vv> LJ = new HashMap<>();
    public static final Object LJFF = new Object();
    public final String LIZ;
    public Room LIZIZ;
    public long LIZJ;
    public final Map<String, String> LIZLLL;

    public C21188517vv(String str) {
        this.LIZ = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("room_id", str);
        this.LIZLLL = linkedHashMap;
    }

    public final void LIZ(String str, String str2) {
        this.LIZLLL.put(str, str2);
    }
}
