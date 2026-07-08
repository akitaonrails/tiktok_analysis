package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IVX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVX {
    public String LIZ;
    public String LIZIZ;

    public C0IVX() {
        this(0);
    }

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.LIZ.length() > 0) {
            linkedHashMap.put("small_picture_type", this.LIZ);
        }
        if (this.LIZIZ.length() > 0) {
            linkedHashMap.put("drawer_from_room_id", this.LIZIZ);
        }
        return linkedHashMap;
    }

    public /* synthetic */ C0IVX(int i) {
        this("", "");
    }

    public C0IVX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
