package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773730wG3 extends AbstractC1771870wD3 {
    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallSwitchFeedTab", new InterfaceC1775150wIL() { // from class: X.0wFe
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                List<C1772690wEN> list;
                Object obj = map2.get("bridge_center_extra_bridge_center_context");
                if (obj instanceof InterfaceC21159017rA) {
                    int i = 0;
                    if (obj != null) {
                        Object obj2 = map.get("tab_id");
                        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                            C1772630wEH c1772630wEHC82 = this.LIZ.LIZIZ().LJIIIIZZ().c82();
                            if (c1772630wEHC82 == null) {
                                c21175917tt.LIZ(0, "controller get page vo is null", null);
                                return;
                            }
                            C1773710wG1 c1773710wG1LIZIZ = c1772630wEHC82.LIZIZ();
                            if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
                                Iterator<C1772690wEN> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (Intrinsics.LJFF(it2.next().LIZLLL, str)) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        i = -1;
                                        break;
                                    }
                                }
                                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ecMixMallSwitchFeedTab, tabId=");
                                sbLIZ.append(str);
                                sbLIZ.append(", index=");
                                sbLIZ.append(i);
                                C2188811AlT.LIZIZ(sbLIZ);
                                c599820Nfo.getClass();
                                C599820Nfo.LIZLLL();
                                C1773670wFx c1773670wFx = (C1773670wFx) this.LIZ.LIZIZ().LIZJ().getService(C1773670wFx.class);
                                if (c1773670wFx != null) {
                                    c1773670wFx.LIZ(i);
                                }
                                c21175917tt.LIZ(1, "success", null);
                                return;
                            }
                            c21175917tt.LIZ(0, "current page vo has no tabs", null);
                            return;
                        }
                        c21175917tt.LIZ(0, "tab_id is null", null);
                        return;
                    }
                }
                c21175917tt.LIZ(0, "bridgeContext is null", null);
            }
        });
    }
}
