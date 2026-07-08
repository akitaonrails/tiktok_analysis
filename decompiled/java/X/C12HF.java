package X;

import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import java.util.HashMap;

/* JADX INFO: renamed from: X.12HF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobBeautyOptimizeToastShow netStatus:");
        sbLIZ.append(str);
        sbLIZ.append(" type:");
        sbLIZ.append(str2);
        sbLIZ.append(" toastStatus:");
        sbLIZ.append(str3);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        HashMap map = new HashMap();
        map.put("net_status", str);
        map.put("type", str2);
        map.put("toast_status", str3);
        C12HG beautyDataMonitor = BeautyContext.INSTANCE.getBeautyDataMonitor();
        if (beautyDataMonitor != null) {
            beautyDataMonitor.LIZIZ(map);
        }
    }

    public static void LIZIZ(int i, String str, String str2) {
        if (C2281551ESb.LIZIZ.LJJIFFI()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorBeautyListFetch panel:");
        sbLIZ.append(str);
        sbLIZ.append(" code:");
        sbLIZ.append(i);
        sbLIZ.append(" msg:");
        sbLIZ.append(str2);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
