package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0wHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774860wHs extends AbstractC1771870wD3 {
    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallSaveRebuildGlobalContextData", new InterfaceC1775150wIL() { // from class: X.0wHt
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                Integer num;
                Object obj = map.get("key");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                Object obj2 = map.get("type");
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                Object obj3 = map.get("value");
                if (obj == null) {
                    c21175917tt.LIZ(0, "key is null", null);
                    return;
                }
                if (num != null && new IntRange(0, 1).LJLJL(num.intValue())) {
                    int iIntValue = num.intValue();
                    if (obj3 != null) {
                        C01GW c01gw = C1774880wHu.LIZ;
                        ((ConcurrentHashMap) c01gw.getValue()).remove(obj);
                        C01GW c01gw2 = C1774880wHu.LIZIZ;
                        ((ConcurrentHashMap) c01gw2.getValue()).remove(obj);
                        if (iIntValue == 0) {
                            ((ConcurrentHashMap) c01gw.getValue()).put(obj, obj3);
                        } else {
                            ((ConcurrentHashMap) c01gw2.getValue()).put(obj, obj3);
                        }
                    } else {
                        ((ConcurrentHashMap) C1774880wHu.LIZ.getValue()).remove(obj);
                        ((ConcurrentHashMap) C1774880wHu.LIZIZ.getValue()).remove(obj);
                    }
                    c21175917tt.LIZ(1, "success", null);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invalid type: ");
                sbLIZ.append(num);
                c21175917tt.LIZ(0, C2188811AlT.LIZIZ(sbLIZ), null);
            }
        });
    }
}
