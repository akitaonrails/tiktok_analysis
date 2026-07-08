package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825920Wac {
    public static final Integer LIZ(Cert cert) {
        Object obj;
        Map<String, Object> mapCustomInfo = cert.customInfo();
        if (mapCustomInfo != null) {
            obj = mapCustomInfo.get("dataflowID");
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            return null;
        }
        return (Integer) obj;
    }
}
