package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385780mAK {
    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(List list) throws C1172904iN, C1385840mAQ, C1385810mAN, C1385870mAT, C1385880mAU, C1385850mAR, C1385860mAS {
        List list2;
        List list3;
        Map map;
        final String str;
        final String str2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map2 = (Map) it2.next();
            Object obj = map2.get("matcher");
            if (obj != null) {
                if (obj instanceof Map) {
                    try {
                        InterfaceC1367540lgu interfaceC1367540lguLIZ = C1385660mA8.LIZ((Map) obj);
                        Object obj2 = map2.get("query_preprocessor");
                        C1385700mAC c1385700mAC = 0;
                        final Map mapLJ = null;
                        c1385700mAC = 0;
                        c1385700mAC = 0;
                        c1385700mAC = 0;
                        if (obj2 instanceof List) {
                            list2 = (List) obj2;
                        } else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            try {
                                List listLIZ = C1385790mAL.LIZ(list2);
                                Object obj3 = map2.get("target_preprocessor");
                                if (obj3 instanceof List) {
                                    list3 = (List) obj3;
                                } else {
                                    list3 = null;
                                }
                                if (list3 != null) {
                                    try {
                                        List listLIZ2 = C1385790mAL.LIZ(list3);
                                        Object obj4 = map2.get("dimension");
                                        if ((obj4 instanceof Integer) || (obj4 instanceof Number)) {
                                            int iIntValue = ((Number) obj4).intValue();
                                            Object obj5 = map2.get("threshold");
                                            if ((obj5 instanceof Double) || (obj5 instanceof Number)) {
                                                double dDoubleValue = ((Number) obj5).doubleValue();
                                                Object obj6 = map2.get("filter");
                                                if (obj6 != null) {
                                                    if (obj6 instanceof Map) {
                                                        map = (Map) obj6;
                                                    } else {
                                                        map = null;
                                                    }
                                                    if (map != null) {
                                                        Object obj7 = map.get("type");
                                                        if (!(obj7 instanceof String)) {
                                                            obj7 = null;
                                                        }
                                                        if (obj7 != null && Intrinsics.LJFF(obj7, "psp")) {
                                                            Object obj8 = map.get("scene_key");
                                                            if (obj8 instanceof String) {
                                                                str = (String) obj8;
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (str != null) {
                                                                Object obj9 = map.get("strategy_key");
                                                                if (obj9 instanceof String) {
                                                                    str2 = (String) obj9;
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (str2 != null) {
                                                                    Object obj10 = map.get("extra_params");
                                                                    if (obj10 instanceof Map) {
                                                                        mapLJ = (Map) obj10;
                                                                    }
                                                                    if (mapLJ == null) {
                                                                        mapLJ = C2097608Jq.LJ();
                                                                    }
                                                                    c1385700mAC = new InterfaceC1381640m3e(str, str2, mapLJ) { // from class: X.0mAC
                                                                        public final String LIZ;
                                                                        public final String LIZIZ;
                                                                        public final Map<String, Object> LIZJ;

                                                                        {
                                                                            this.LIZ = str;
                                                                            this.LIZIZ = str2;
                                                                            this.LIZJ = mapLJ;
                                                                        }

                                                                        @Override // X.InterfaceC1381640m3e
                                                                        public final List LIZ(int i, List list4, List list5) {
                                                                            boolean zBooleanValue;
                                                                            InterfaceC830890Wid interfaceC830890WidLIZ;
                                                                            List list6;
                                                                            Boolean bool;
                                                                            Object obj11 = this.LIZJ.get("include_source");
                                                                            Object objLIZJ = null;
                                                                            if ((obj11 instanceof Boolean) && (bool = (Boolean) obj11) != null) {
                                                                                zBooleanValue = bool.booleanValue();
                                                                            } else {
                                                                                zBooleanValue = false;
                                                                            }
                                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                            ArrayList<InterfaceC1381610m3b> arrayList2 = new ArrayList();
                                                                            ArrayList arrayList3 = (ArrayList) list4;
                                                                            for (Object obj12 : arrayList3) {
                                                                                String searchDimension = ((InterfaceC1381610m3b) obj12).getSearchDimension(i);
                                                                                if (searchDimension != null && searchDimension.length() != 0) {
                                                                                    arrayList2.add(obj12);
                                                                                }
                                                                            }
                                                                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                                                            for (InterfaceC1381610m3b interfaceC1381610m3b : arrayList2) {
                                                                                C23094093c.LIZ.getClass();
                                                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                String itemId = interfaceC1381610m3b.getItemId();
                                                                                String str3 = "";
                                                                                if (itemId == null) {
                                                                                    itemId = "";
                                                                                }
                                                                                linkedHashMap2.put("unique_id", itemId);
                                                                                String strValueOf = String.valueOf(interfaceC1381610m3b.getRelationship().getValue());
                                                                                if (strValueOf == null) {
                                                                                    strValueOf = "";
                                                                                }
                                                                                linkedHashMap2.put("relationship", strValueOf);
                                                                                if (zBooleanValue) {
                                                                                    String searchDimension2 = interfaceC1381610m3b.getSearchDimension(i);
                                                                                    if (searchDimension2 != null) {
                                                                                        str3 = searchDimension2;
                                                                                    }
                                                                                    ArrayList arrayList5 = new ArrayList(str3.length());
                                                                                    for (int i2 = 0; i2 < str3.length(); i2++) {
                                                                                        arrayList5.add(String.valueOf(str3.charAt(i2)));
                                                                                    }
                                                                                    linkedHashMap2.put("source_array", arrayList5);
                                                                                }
                                                                                arrayList4.add(linkedHashMap2);
                                                                            }
                                                                            linkedHashMap.put("searchables", arrayList4);
                                                                            linkedHashMap.put("extra_params", this.LIZJ);
                                                                            linkedHashMap.put("query_array", list5);
                                                                            C23094093c.LIZ.getClass();
                                                                            linkedHashMap.putAll(C23094093c.LIZIZ);
                                                                            if (!C23094093c.LIZ(linkedHashMap) || (interfaceC830890WidLIZ = C1386050mAl.LIZJ.LIZ().LIZ(this.LIZ)) == null) {
                                                                                return list4;
                                                                            }
                                                                            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZ, this.LIZIZ, new TTMParamData((Map<String, Object>) linkedHashMap));
                                                                            if (interfaceC805220ViKRunScene != null) {
                                                                                objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                                                                            }
                                                                            if ((objLIZJ instanceof List) && (list6 = (List) objLIZJ) != null) {
                                                                                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list4, 10));
                                                                                if (iLIZIZ < 16) {
                                                                                    iLIZIZ = 16;
                                                                                }
                                                                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                                                                                for (Object obj13 : arrayList3) {
                                                                                    linkedHashMap3.put(((InterfaceC1381610m3b) obj13).getItemId(), obj13);
                                                                                }
                                                                                ArrayList arrayList6 = new ArrayList();
                                                                                Iterator it3 = list6.iterator();
                                                                                while (it3.hasNext()) {
                                                                                    Object obj14 = linkedHashMap3.get(it3.next());
                                                                                    if (obj14 != null) {
                                                                                        arrayList6.add(obj14);
                                                                                    }
                                                                                }
                                                                                return arrayList6;
                                                                            }
                                                                            return list4;
                                                                        }
                                                                    };
                                                                } else {
                                                                    throw new C1172904iN("strategy_key");
                                                                }
                                                            } else {
                                                                throw new C1172904iN("scene_key");
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                final C1381630m3d c1381630m3d = new C1381630m3d(iIntValue, interfaceC1367540lguLIZ, listLIZ, listLIZ2, dDoubleValue, c1385700mAC);
                                                arrayList.add(new InterfaceC1157890gEl(c1381630m3d) { // from class: X.0m3c
                                                    public final InterfaceC1367540lgu LIZ;
                                                    public final int LIZIZ;
                                                    public final double LIZJ;
                                                    public final List<InterfaceC1381650m3f> LIZLLL;
                                                    public final List<InterfaceC1381650m3f> LJ;
                                                    public final InterfaceC1381640m3e LJFF;

                                                    @Override // X.InterfaceC1157890gEl
                                                    public final int getDimension() {
                                                        return this.LIZIZ;
                                                    }

                                                    {
                                                        this.LIZ = c1381630m3d.LIZIZ;
                                                        this.LIZIZ = c1381630m3d.LIZ;
                                                        this.LIZJ = c1381630m3d.LJ;
                                                        this.LIZLLL = c1381630m3d.LIZJ;
                                                        this.LJ = c1381630m3d.LIZLLL;
                                                        this.LJFF = c1381630m3d.LJFF;
                                                    }

                                                    @Override // X.InterfaceC1157890gEl
                                                    public final void LIZ(String str3, List list4) {
                                                        Iterator<InterfaceC1381650m3f> it3 = this.LIZLLL.iterator();
                                                        while (it3.hasNext()) {
                                                            str3 = it3.next().LIZ(str3);
                                                        }
                                                        ArrayList arrayList2 = new ArrayList(str3.length());
                                                        for (int i = 0; i < str3.length(); i++) {
                                                            arrayList2.add(String.valueOf(str3.charAt(i)));
                                                        }
                                                        InterfaceC1381640m3e interfaceC1381640m3e = this.LJFF;
                                                        if (interfaceC1381640m3e != null) {
                                                            list4 = interfaceC1381640m3e.LIZ(this.LIZIZ, list4, arrayList2);
                                                        }
                                                        for (InterfaceC1381610m3b interfaceC1381610m3b : list4) {
                                                            String searchDimension = interfaceC1381610m3b.getSearchDimension(this.LIZIZ);
                                                            if (searchDimension == null) {
                                                                searchDimension = "";
                                                            }
                                                            Iterator<InterfaceC1381650m3f> it4 = this.LJ.iterator();
                                                            String strLIZ = searchDimension;
                                                            while (it4.hasNext()) {
                                                                strLIZ = it4.next().LIZ(strLIZ);
                                                            }
                                                            C1369340ljo c1369340ljoLIZ = this.LIZ.LIZ(str3, strLIZ);
                                                            if (c1369340ljoLIZ.LIZ >= this.LIZJ) {
                                                                C1368220li0 c1368220li0 = new C1368220li0(this.LIZ, this.LIZIZ, searchDimension, c1369340ljoLIZ);
                                                                if (interfaceC1381610m3b.getPrimaryMatchMeta() == null) {
                                                                    interfaceC1381610m3b.setPrimaryMatchMeta(c1368220li0);
                                                                }
                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(interfaceC1381610m3b.getAllMatchMeta());
                                                                linkedHashMap.put(Integer.valueOf(this.LIZIZ), c1368220li0);
                                                                interfaceC1381610m3b.setAllMatchMeta(linkedHashMap);
                                                            }
                                                        }
                                                    }
                                                });
                                            } else {
                                                throw C1385880mAU.INSTANCE;
                                            }
                                        } else {
                                            throw C1385840mAQ.INSTANCE;
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw C1385870mAT.INSTANCE;
                                    }
                                } else {
                                    throw C1385870mAT.INSTANCE;
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw C1385860mAS.INSTANCE;
                            }
                        } else {
                            throw C1385860mAS.INSTANCE;
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        String message = e3.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        throw new C1385810mAN(message);
                    }
                } else {
                    throw C1385850mAR.INSTANCE;
                }
            } else {
                throw C1385850mAR.INSTANCE;
            }
        }
        return arrayList;
    }
}
