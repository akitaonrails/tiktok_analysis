package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0VcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801590VcT {
    public static Field LIZ;

    public static final long LIZ(ByteBuffer byteBuffer) throws IllegalAccessException {
        Long l;
        Field declaredField = LIZ;
        if (declaredField == null) {
            try {
                declaredField = Buffer.class.getDeclaredField("address");
                declaredField.setAccessible(true);
                LIZ = declaredField;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1L;
            }
        }
        Object obj = declaredField.get(byteBuffer);
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return l.longValue();
        }
        return 0L;
    }
}
