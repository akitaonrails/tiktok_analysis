package X;

import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import java.util.Map;

/* JADX INFO: renamed from: X.0CZU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CZU {
    public static final Float LIZ(ModuleDecision moduleDecision, String str) {
        Object obj;
        Number number;
        Map<String, Object> map = moduleDecision.featureParams;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (!(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Float.valueOf(number.floatValue());
    }

    public static final Integer LIZIZ(ModuleDecision moduleDecision, String str) {
        Object obj;
        Number number;
        Map<String, Object> map = moduleDecision.featureParams;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (!(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Integer.valueOf(number.intValue());
    }

    public static final Long LIZJ(ModuleDecision moduleDecision, String str) {
        Object obj;
        Number number;
        Map<String, Object> map = moduleDecision.featureParams;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (!(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Long.valueOf(number.longValue());
    }
}
