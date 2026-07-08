package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0mdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403980mdg {
    public static final boolean LIZ(Map<String, SingleAdjustInfo> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, SingleAdjustInfo> entry : map.entrySet()) {
                if (C1404000mdi.LIZLLL(entry.getValue().getIntensity(), entry.getKey())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
