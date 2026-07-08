package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetAnchorViewAbility;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774630wHV extends AbstractC1771870wD3 {
    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallGetViewFrame", new InterfaceC1775150wIL() { // from class: X.0wHU
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                InterfaceC21159017rA interfaceC21159017rA;
                String str;
                String str2;
                String str3;
                View viewLIZ;
                View view;
                GetAnchorViewAbility getAnchorViewAbility;
                C1774640wHW c1774640wHWLz1;
                Object obj = map2.get("bridge_center_extra_bridge_center_context");
                View view2 = null;
                if ((obj instanceof InterfaceC21159017rA) && (interfaceC21159017rA = (InterfaceC21159017rA) obj) != null) {
                    Object obj2 = map.get("tab_id");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    Object obj3 = map.get("item_id");
                    if (obj3 instanceof String) {
                        str2 = (String) obj3;
                    } else {
                        str2 = null;
                    }
                    Object obj4 = map.get("element_id");
                    if (obj4 instanceof String) {
                        str3 = (String) obj4;
                    } else {
                        str3 = null;
                    }
                    if (str2 != null) {
                        C19EG c19eg = this.LIZ.LIZIZ().LIZLLL().LIZLLL;
                        if (c19eg != null && (getAnchorViewAbility = (GetAnchorViewAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), GetAnchorViewAbility.class, null)) != null && (c1774640wHWLz1 = getAnchorViewAbility.lz1(str2, str3, str)) != null) {
                            view = c1774640wHWLz1.LIZIZ;
                            view2 = c1774640wHWLz1.LIZJ;
                        } else {
                            view = null;
                        }
                        viewLIZ = view2;
                        view2 = view;
                    } else if (C703302op.LIZ(str3)) {
                        viewLIZ = interfaceC21159017rA.LIZ(str3);
                    } else {
                        viewLIZ = null;
                    }
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ecMixMallGetViewFrame, tabId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", itemId=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", elementId=");
                    sbLIZ.append(str3);
                    sbLIZ.append(", frameView=");
                    sbLIZ.append(view2);
                    sbLIZ.append(", elementView=");
                    sbLIZ.append(viewLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                    if (view2 == null) {
                        c21175917tt.LIZ(0, "cannot find frameView or elementView", null);
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    view2.getLocationOnScreen(new int[2]);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C1774630wHV c1774630wHV = this.LIZ;
                    linkedHashMap2.put("left", Integer.valueOf(C11VU.LJII(r15[0], c1774630wHV.LIZ())));
                    linkedHashMap2.put("top", Integer.valueOf(C11VU.LJII(r15[1], c1774630wHV.LIZ())));
                    linkedHashMap2.put("right", Integer.valueOf(C11VU.LJII((C11VU.LJ(c1774630wHV.LIZ()) - r15[0]) - view2.getWidth(), c1774630wHV.LIZ())));
                    linkedHashMap2.put("bottom", Integer.valueOf(C11VU.LJII((C11VU.LIZLLL(c1774630wHV.LIZ()) - r15[1]) - view2.getHeight(), c1774630wHV.LIZ())));
                    linkedHashMap2.put("width", Integer.valueOf(C11VU.LJII(view2.getWidth(), c1774630wHV.LIZ())));
                    linkedHashMap2.put("height", Integer.valueOf(C11VU.LJII(view2.getHeight(), c1774630wHV.LIZ())));
                    linkedHashMap.put("item_frame", linkedHashMap2);
                    if (viewLIZ != null) {
                        C1774630wHV c1774630wHV2 = this.LIZ;
                        viewLIZ.getLocationOnScreen(new int[2]);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("left", Integer.valueOf(C11VU.LJII(r11[0], c1774630wHV2.LIZ())));
                        linkedHashMap3.put("top", Integer.valueOf(C11VU.LJII(r11[1], c1774630wHV2.LIZ())));
                        linkedHashMap3.put("right", Integer.valueOf(C11VU.LJII((C11VU.LJ(c1774630wHV2.LIZ()) - r11[0]) - viewLIZ.getWidth(), c1774630wHV2.LIZ())));
                        linkedHashMap3.put("bottom", Integer.valueOf(C11VU.LJII((C11VU.LIZLLL(c1774630wHV2.LIZ()) - r11[1]) - viewLIZ.getHeight(), c1774630wHV2.LIZ())));
                        linkedHashMap3.put("width", Integer.valueOf(C11VU.LJII(viewLIZ.getWidth(), c1774630wHV2.LIZ())));
                        linkedHashMap3.put("height", Integer.valueOf(C11VU.LJII(viewLIZ.getHeight(), c1774630wHV2.LIZ())));
                        linkedHashMap.put("element_frame", linkedHashMap3);
                    }
                    c21175917tt.LIZ(1, "success", linkedHashMap);
                    return;
                }
                c21175917tt.LIZ(0, "bridgeContext is null", null);
            }
        });
    }
}
