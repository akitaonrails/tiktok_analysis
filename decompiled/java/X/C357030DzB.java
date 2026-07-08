package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357030DzB {
    public static final boolean LIZ(C354510Dv7 c354510Dv7) {
        Object obj;
        HashMap<String, Object> map = c354510Dv7.LJI;
        if (map != null) {
            obj = map.get("GamePlayResourceSubType");
        } else {
            obj = null;
        }
        return Intrinsics.LJFF(obj, EnumC357040DzC.I2V.getTypeName());
    }
}
