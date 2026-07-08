package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.model.TouchPointsResponse;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS47S0200100_28;

/* JADX INFO: renamed from: X.0zTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897590zTp {
    public static final C01GW<C1897590zTp> LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1897670zTx());
    public final Keva LIZ = Keva.getRepo("touch_point_request_repo");
    public final String LIZIZ = "request_time";
    public boolean LIZJ = true;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1897640zTu());
    public AnonymousClass0956 LJ;

    public static String LIZ(List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (list == null || !(!list.isEmpty())) {
            return "";
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int i2 = ((TouchPoint) ListProtector.get(list, i)).touchPointId;
            if (i < list.size() - 1) {
                sb.append(i2);
                sb.append(",");
            } else {
                sb.append(i2);
            }
        }
        return sb.toString();
    }

    public final void LIZIZ(Integer num, List<Integer> list) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW<C1897600zTq> c01gw = C1897600zTq.LJII;
        C1897460zTc.LIZ().LIZ(num, list, null, new InterfaceC1897660zTw() { // from class: X.0zTs
            @Override // X.InterfaceC1897660zTw
            public final void LIZ() {
            }

            @Override // X.InterfaceC1897660zTw
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1897660zTw
            public final void onFail() {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C01GW<C1897600zTq> c01gw2 = C1897600zTq.LJII;
                    Integer num2 = C1897460zTc.LIZ().LJFF;
                    iTouchPointModuleService.LJJIIZI(0, num2 != null ? num2.intValue() : 1, C1897460zTc.LIZ().LJ, C1897460zTc.LIZ().LJI.LLILLL, jCurrentTimeMillis2, "");
                }
            }

            @Override // X.InterfaceC1897660zTw
            public final void onSuccess(List<TouchPoint> list2) {
                C01U6.LIZIZ(new AwS47S0200100_28(this.LIZ, (C1897590zTp) list2, (List<TouchPoint>) jCurrentTimeMillis, 0L));
            }
        });
    }

    public final void LIZJ(Integer num, TouchPointsResponse touchPointsResponse, C07UF c07uf) {
        AwS394S0200000_28 awS394S0200000_28;
        List<Long> list;
        List<String> list2;
        boolean zLJI = MethodIDManager.LJI(137706);
        this.LIZ.storeLong(this.LIZIZ, C1899200zWQ.LIZ(C1899200zWQ.LIZ));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (c07uf == null || (((list = c07uf.LIZ) == null || list.isEmpty()) && ((list2 = c07uf.LIZIZ) == null || list2.isEmpty()))) {
            awS394S0200000_28 = new AwS394S0200000_28(num, touchPointsResponse, 60);
        } else {
            awS394S0200000_28 = new AwS394S0200000_28(num, c07uf, 59);
        }
        awS394S0200000_28.invoke(new InterfaceC1897660zTw() { // from class: X.0zTr
            @Override // X.InterfaceC1897660zTw
            public final void LIZ() {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJJIIJZLJL(false);
                }
            }

            @Override // X.InterfaceC1897660zTw
            public final void LIZIZ() {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJJIIJZLJL(true);
                }
            }

            @Override // X.InterfaceC1897660zTw
            public final void onFail() {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C01GW<C1897600zTq> c01gw = C1897600zTq.LJII;
                    Integer num2 = C1897460zTc.LIZ().LJFF;
                    iTouchPointModuleService.LJJIIZI(0, num2 != null ? num2.intValue() : 1, C1897460zTc.LIZ().LJ, C1897460zTc.LIZ().LJI.LLILLL, jCurrentTimeMillis2, "");
                }
                this.LIZ.LIZJ = false;
            }

            @Override // X.InterfaceC1897660zTw
            public final void onSuccess(List<TouchPoint> list3) {
                int iIntValue;
                this.LIZ.getClass();
                String strLIZ = C1897590zTp.LIZ(list3);
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C01GW<C1897600zTq> c01gw = C1897600zTq.LJII;
                    Integer num2 = C1897460zTc.LIZ().LJFF;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    iTouchPointModuleService.LJJIIZI(1, iIntValue, C1897460zTc.LIZ().LJ, C1897460zTc.LIZ().LJI.LLILLL, jCurrentTimeMillis2, strLIZ);
                }
                this.LIZ.LIZJ = true;
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
