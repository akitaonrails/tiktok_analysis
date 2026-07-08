package X;

import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2041307z9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(Class cls, String str) {
        if (Intrinsics.LJFF(cls, Integer.class)) {
            return Integer.valueOf(CastIntegerProtector.parseInt(str));
        }
        if (Intrinsics.LJFF(cls, Boolean.class)) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (Intrinsics.LJFF(cls, Short.class)) {
            return Short.valueOf(CastShortProtector.parseShort(str));
        }
        if (Intrinsics.LJFF(cls, Long.class)) {
            return Long.valueOf(CastLongProtector.parseLong(str));
        }
        if (Intrinsics.LJFF(cls, Float.class)) {
            return Float.valueOf(CastFloatProtector.parseFloat(str));
        }
        if (Intrinsics.LJFF(cls, Double.class)) {
            return Double.valueOf(CastDoubleProtector.parseDouble(str));
        }
        if (Intrinsics.LJFF(cls, Byte.class)) {
            return Byte.valueOf(CastByteProtector.parseByte(str));
        }
        if (!Intrinsics.LJFF(cls, Character.class)) {
            return str;
        }
        return Character.valueOf(C13LN.LJLLI(str));
    }
}
