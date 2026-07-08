package X;

/* JADX INFO: renamed from: X.0515, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0515 {
    public static final Object LIZ(Object obj, String str) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(AnonymousClass0516.LIZ().getBoolean(str, false));
        }
        if (obj instanceof String) {
            return AnonymousClass0516.LIZ().getString(str, "");
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(AnonymousClass0516.LIZ().getInt(str, 0));
        }
        if (obj instanceof Long) {
            return Long.valueOf(AnonymousClass0516.LIZ().getLong(str, 0L));
        }
        if (obj instanceof Float) {
            return Float.valueOf(AnonymousClass0516.LIZ().getFloat(str, 0.0f));
        }
        if (obj instanceof Double) {
            return Double.valueOf(AnonymousClass0516.LIZ().getDouble(str, 0.0d));
        }
        throw new IllegalArgumentException("Unsupported type");
    }

    public static final void LIZIZ(Object obj, String str) {
        if (obj instanceof Boolean) {
            AnonymousClass0516.LIZ().storeBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            AnonymousClass0516.LIZ().storeString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            AnonymousClass0516.LIZ().storeInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            AnonymousClass0516.LIZ().storeLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            AnonymousClass0516.LIZ().storeFloat(str, ((Number) obj).floatValue());
        } else {
            if (obj instanceof Double) {
                AnonymousClass0516.LIZ().storeDouble(str, ((Number) obj).doubleValue());
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported type: ");
            sbLIZ.append(obj.getClass());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
