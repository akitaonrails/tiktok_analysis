package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1285690jYt {
    NO_ERROR(0),
    RESOURCE_NOT_FOUND(1),
    LIBRARY_INIT_ERROR(12),
    VIDEO_PLAYER_ERROR(100),
    VIDEO_PLAYER_ERROR_HAS_OCCURRED(101),
    BLOCK_DEVICE(200);

    public final int LL;

    public static Map<String, Object> createBlockErrorParam() {
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(BLOCK_DEVICE.ordinal()));
        map.put("msg", "The device is not support.");
        return map;
    }

    public static Map<String, Object> createLibraryInitErrorParam() {
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(LIBRARY_INIT_ERROR.ordinal()));
        map.put("msg", "Library init error.");
        return map;
    }

    public int getErrorCode() {
        return this.LL;
    }

    public static EnumC1285690jYt valueOf(String str) {
        return (EnumC1285690jYt) C08FF.LIZ(EnumC1285690jYt.class, str);
    }

    EnumC1285690jYt(int i) {
        this.LL = i;
    }
}
