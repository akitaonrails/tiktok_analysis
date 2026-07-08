package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEvent;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774810wHn extends AbstractC1771860wD2 implements InterfaceC1773850wGF {
    public final C1774890wHv LLILLL = new C1774890wHv();

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        C1774890wHv c1774890wHv = this.LLILLL;
        InterfaceC1773310wFN interfaceC1773310wFNLIZIZ = LIZIZ();
        C861640Xr8 c861640Xr8 = new C861640Xr8(new C1774900wHw(c1774890wHv, null), c1774890wHv.LIZJ);
        C1774130wGh.LIZ.getClass();
        C09IC.LJJI(C1774130wGh.LIZ().enableTrackReportOpt ? C817503Hh.LL : C2296808zG.LJII(ViewModelKt.getViewModelScope(interfaceC1773310wFNLIZIZ.LJIIIIZZ()), C0PEM.LIZJ), c861640Xr8);
        LIZIZ().getEventCenter().LJFF("ecMixMallSendApplog", new InterfaceC1775150wIL() { // from class: X.0wHo
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                List<Map> list;
                String str;
                String str2;
                C1775190wIP c1775190wIP;
                Object c098200Yq;
                C1773880wGI c1773880wGILIZ;
                Object obj = map.get("event_list");
                if ((obj instanceof List) && (list = (List) obj) != null) {
                    C1774810wHn c1774810wHn = this.LIZ;
                    for (Map map3 : list) {
                        Object obj2 = map3.get("item_id");
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        } else {
                            str = null;
                        }
                        Object obj3 = map3.get("tab_id");
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        } else {
                            str2 = null;
                        }
                        if (C123100dR.LIZ(str) && (c1773880wGILIZ = C1773390wFV.LIZ(c1774810wHn.LIZIZ(), str2, str)) != null && c1773880wGILIZ.LIZJ != null) {
                            c1775190wIP = c1773880wGILIZ.LIZJ.LJII;
                        } else {
                            c1775190wIP = null;
                        }
                        try {
                            c098200Yq = Boolean.valueOf(c1774810wHn.LJFF((ECMixMallTrackEvent) C08JS.LIZIZ().LIZJ(C08JS.LIZIZ().LJIJJLI(map3), ECMixMallTrackEvent.class), c1775190wIP));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                            c21175917tt.LIZ(-1001, "Invalid params: event_params", null);
                            return;
                        }
                    }
                }
                c21175917tt.LIZ(1, "success", null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallTrackBffEvent", new InterfaceC1775150wIL() { // from class: X.0wHp
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                String str2;
                String str3;
                List<String> list;
                int iIntValue;
                Map map3;
                Map map4;
                Integer num;
                Object obj = map.get("item_id");
                Map map5 = null;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get("tab_id");
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                Object obj3 = map.get("event_group");
                if (obj3 instanceof String) {
                    str3 = (String) obj3;
                } else {
                    str3 = null;
                }
                Object obj4 = map.get("event_name_list");
                if (obj4 instanceof List) {
                    list = (List) obj4;
                } else {
                    list = null;
                }
                Object obj5 = map.get("type");
                if ((obj5 instanceof Integer) && (num = (Integer) obj5) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Object obj6 = map.get("applog_params");
                if (obj6 instanceof Map) {
                    map3 = (Map) obj6;
                } else {
                    map3 = null;
                }
                Object obj7 = map.get("ad_params");
                if (obj7 instanceof Map) {
                    map4 = (Map) obj7;
                } else {
                    map4 = null;
                }
                Object obj8 = map.get("ad_extra_params");
                if (obj8 instanceof Map) {
                    map5 = (Map) obj8;
                }
                if (str != null && str.length() != 0) {
                    if (str3 != null && str3.length() != 0) {
                        C1773880wGI c1773880wGILIZ = C1773390wFV.LIZ(this.LIZ.LIZIZ(), str2, str);
                        if (c1773880wGILIZ == null) {
                            c21175917tt.LIZ(0, "can't find item", null);
                            return;
                        } else {
                            this.LIZ.LJIIJ(str3, c1773880wGILIZ.LIZJ, iIntValue, new C1774840wHq(map3, map4, map5), list);
                            c21175917tt.LIZ(1, "success", null);
                            return;
                        }
                    }
                    c21175917tt.LIZ(0, "Invalid params: event_group", null);
                    return;
                }
                c21175917tt.LIZ(0, "Invalid params: item_id", null);
            }
        });
        LIZIZ().LIZJ().LIZ(InterfaceC1773850wGF.class, this);
    }

    @Override // X.AbstractC1771860wD2
    public final void LJI() {
        this.LLILLL.getClass();
    }

    @Override // X.InterfaceC1773850wGF
    public final boolean LJFF(ECMixMallTrackEvent eCMixMallTrackEvent, C1775190wIP c1775190wIP) {
        C1775190wIP c1775190wIPLIZ;
        C1774890wHv c1774890wHv = this.LLILLL;
        InterfaceC1773310wFN interfaceC1773310wFNLIZIZ = LIZIZ();
        c1774890wHv.getClass();
        if (c1775190wIP != null) {
            c1775190wIPLIZ = c1775190wIP.LIZ();
        } else {
            c1775190wIPLIZ = null;
        }
        C1774960wI2 c1774960wI2 = new C1774960wI2(interfaceC1773310wFNLIZIZ, eCMixMallTrackEvent, c1775190wIPLIZ);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(interfaceC1773310wFNLIZIZ.LJIIIIZZ());
        boolean zLJI = C2296808zG.LJI(viewModelScope);
        C1774130wGh.LIZ.getClass();
        if (C1774130wGh.LIZ().enableTrackReportOpt) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C862310XsD(c1774890wHv, c1774960wI2, null), 2);
            return zLJI;
        }
        C23250099c.LIZLLL(viewModelScope, null, null, new C862320XsE(c1774890wHv, c1774960wI2, null), 3);
        return zLJI;
    }

    @Override // X.InterfaceC1773850wGF
    public final void LJIIJ(String str, AbstractC1773210wFD abstractC1773210wFD, int i, C1774840wHq c1774840wHq, List<String> list) {
        C1774840wHq c1774840wHq2;
        Map<String, ECMixMallTrackEventGroup> mapLIZIZ;
        ECMixMallTrackEventGroup eCMixMallTrackEventGroup;
        List<ECMixMallTrackEvent> list2;
        Map<String, ECMixMallTrackEventGroup> mapLIZIZ2;
        ECMixMallTrackEventGroup eCMixMallTrackEventGroup2;
        List<ECMixMallTrackEvent> list3;
        C1774890wHv c1774890wHv = this.LLILLL;
        InterfaceC1773310wFN interfaceC1773310wFNLIZIZ = LIZIZ();
        c1774890wHv.getClass();
        if (abstractC1773210wFD != null && abstractC1773210wFD.LJII.LIZ != null) {
            C1774130wGh.LIZ.getClass();
            if (C1774130wGh.LIZ().enableTrackReportOpt) {
                if (i != 2 && (mapLIZIZ2 = c1774890wHv.LIZ.LIZIZ(abstractC1773210wFD.LJII)) != null && (eCMixMallTrackEventGroup2 = mapLIZIZ2.get(str)) != null && (list3 = eCMixMallTrackEventGroup2.eventList) != null) {
                    Iterator<ECMixMallTrackEvent> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ECMixMallTrackEvent next = it2.next();
                        if (!next.LIZ.LIZ) {
                            if (next == null) {
                                break;
                            }
                        }
                    }
                } else {
                    if (i == 1 || (mapLIZIZ = c1774890wHv.LIZIZ.LIZIZ(abstractC1773210wFD.LJII)) == null || (eCMixMallTrackEventGroup = mapLIZIZ.get(str)) == null || (list2 = eCMixMallTrackEventGroup.eventList) == null) {
                        return;
                    }
                    for (ECMixMallTrackEvent eCMixMallTrackEvent : list2) {
                        if (!eCMixMallTrackEvent.LIZ.LIZ) {
                            if (eCMixMallTrackEvent == null) {
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            C1775190wIP c1775190wIPLIZ = abstractC1773210wFD.LJII.LIZ();
            Map<String, Object> map = abstractC1773210wFD.LJI;
            if (c1774840wHq != null) {
                c1774840wHq2 = new C1774840wHq(c1774840wHq.LIZ, c1774840wHq.LIZIZ, c1774840wHq.LIZJ);
            } else {
                c1774840wHq2 = null;
            }
            C1774920wHy c1774920wHy = new C1774920wHy(str, interfaceC1773310wFNLIZIZ, c1775190wIPLIZ, map, i, c1774840wHq2, list);
            C1774130wGh.LIZ.getClass();
            if (C1774130wGh.LIZ().enableTrackReportOpt) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C862330XsF(c1774890wHv, c1774920wHy, null), 2);
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(interfaceC1773310wFNLIZIZ.LJIIIIZZ()), null, null, new C862340XsG(c1774890wHv, c1774920wHy, null), 3);
            }
        }
    }
}
