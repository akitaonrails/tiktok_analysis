package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AYV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AYV extends C1AYS {
    public final InterfaceC2181151AXx LJIIIIZZ;

    public static String LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_LiveDataProvider_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1AX3 LJIIIIZZ(int i) {
        String key;
        String key2;
        C1AZW c1azw = C1AZW.LIZ;
        String strLIZLLL = LIZLLL(305);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMicWindow pos=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLIZLLL, strLIZIZ, null, null);
        Layout layout = this.LJ;
        String strLIZLLL2 = LIZLLL(308);
        c1azw.getClass();
        C1AZW.LIZ(strLIZLLL2, "LiveDataProvider getMicWindow", null, null);
        C1AX3 c1ax3 = null;
        if (layout == null) {
            C1AZW.LJFF(LIZLLL(310), "live currentLayout is null", null, null);
            C1CC2.LIZ("live currentLayout is null.", new Throwable());
            return LIZIZ(EnumC918810a19.StateInit);
        }
        if (!layout.isFixedType() && !this.LIZJ.LIZ()) {
            for (Map.Entry<String, OnLineMicInfo> entry : this.LJIIIIZZ.LJJII().entrySet()) {
                if (this.LJIIIIZZ.LJIIL()) {
                    MicPositionInfo micPositionInfo = entry.getValue().micPositionData;
                    if (micPositionInfo != null && micPositionInfo.uiPos == i) {
                        key2 = entry.getKey();
                        break;
                    }
                } else {
                    MicPositionInfo micPositionInfo2 = entry.getValue().micPositionData;
                    if (micPositionInfo2 != null && micPositionInfo2.position == i) {
                        key2 = entry.getKey();
                        break;
                    }
                }
            }
            key2 = null;
            Iterator<C1AX3> it2 = this.LJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1AX3 next = it2.next();
                C1AX3 c1ax32 = next;
                if (key2 != null && Intrinsics.LJFF(c1ax32.LIZ.LIZJ, key2)) {
                    c1ax3 = next;
                    break;
                }
            }
            C1AX3 c1ax33 = c1ax3;
            if (c1ax33 == null) {
                return LIZIZ(EnumC918810a19.StateIdle);
            }
            return c1ax33;
        }
        for (Map.Entry<String, OnLineMicInfo> entry2 : this.LJIIIIZZ.LIZ().entrySet()) {
            if (this.LJIIIIZZ.LJIIL()) {
                MicPositionInfo micPositionInfo3 = entry2.getValue().micPositionData;
                if (micPositionInfo3 != null && micPositionInfo3.uiPos == i) {
                    key = entry2.getKey();
                    break;
                }
            } else {
                MicPositionInfo micPositionInfo4 = entry2.getValue().micPositionData;
                if (micPositionInfo4 != null && micPositionInfo4.position == i) {
                    key = entry2.getKey();
                    break;
                }
            }
        }
        key = null;
        Iterator<C1AX3> it3 = this.LJI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1AX3 next2 = it3.next();
            C1AX3 c1ax34 = next2;
            if (key != null && Intrinsics.LJFF(c1ax34.LIZ.LIZJ, key)) {
                c1ax3 = next2;
                break;
            }
        }
        C1AX3 c1ax35 = c1ax3;
        if (c1ax35 != null) {
            return c1ax35;
        }
        return LIZIZ(EnumC918810a19.StateInit);
    }

    public C1AYV(Context context, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw, int i) {
        super(context, interfaceC2181151AXx, c2181141AXw, i);
        this.LJIIIIZZ = interfaceC2181151AXx;
    }
}
