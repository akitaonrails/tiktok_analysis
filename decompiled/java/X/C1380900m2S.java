package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0m2S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380900m2S {
    public static final HashMap<String, String> LIZ = new HashMap<>();

    public static final String LIZ() {
        return LIZ.get("push_aid");
    }

    public static final String LIZIZ() {
        return LIZ.get("push_id");
    }

    public static final String LIZJ() {
        return LIZ.get("push_type");
    }

    public static final int LIZLLL() {
        String str = LIZ.get("is_from_push");
        if (str != null) {
            return CastIntegerProtector.parseInt(str);
        }
        return 0;
    }
}
