package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154550g9N {
    public static InterfaceC499101wz LIZ(Map map) throws C1154510g9J, C1154500g9I, C1154530g9L, C1154540g9M {
        Map map2;
        String str;
        List list;
        Object obj = map.get("matching_strategy_orchestrator");
        if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
            Object obj2 = map2.get("type");
            if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                Object obj3 = map2.get("matching_strategies");
                if ((obj3 instanceof List) && (list = (List) obj3) != null) {
                    try {
                        final List listLIZ = C1385780mAK.LIZ(list);
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (Intrinsics.LJFF(lowerCase, "match_all")) {
                            return new InterfaceC499101wz(listLIZ) { // from class: X.0gEm
                                public final List<InterfaceC1157890gEl> LIZ;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.LIZ = listLIZ;
                                }

                                @Override // X.InterfaceC499101wz
                                public final List LIZ(String str2, List list2) {
                                    ArrayList arrayList = new ArrayList(list2);
                                    for (InterfaceC1157890gEl interfaceC1157890gEl : this.LIZ) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj4 : arrayList) {
                                            Map<Integer, C1368220li0> allMatchMeta = ((InterfaceC1381610m3b) obj4).getAllMatchMeta();
                                            if (!allMatchMeta.isEmpty()) {
                                                Iterator<Map.Entry<Integer, C1368220li0>> it2 = allMatchMeta.entrySet().iterator();
                                                while (it2.hasNext()) {
                                                    if (it2.next().getKey().intValue() == interfaceC1157890gEl.getDimension()) {
                                                        break;
                                                    }
                                                }
                                            }
                                            arrayList2.add(obj4);
                                        }
                                        if (arrayList2.isEmpty()) {
                                            break;
                                        }
                                        interfaceC1157890gEl.LIZ(str2, arrayList2);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj5 : arrayList) {
                                        if (((InterfaceC1381610m3b) obj5).getPrimaryMatchMeta() != null) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                    return arrayList3;
                                }
                            };
                        }
                        if (Intrinsics.LJFF(lowerCase, "match_and_quit")) {
                            return new InterfaceC499101wz(listLIZ) { // from class: X.0gEk
                                public final List<InterfaceC1157890gEl> LIZ;

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.LIZ = listLIZ;
                                }

                                @Override // X.InterfaceC499101wz
                                public final List LIZ(String str2, List list2) {
                                    ArrayList arrayList = new ArrayList(list2);
                                    for (InterfaceC1157890gEl interfaceC1157890gEl : this.LIZ) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj4 : arrayList) {
                                            if (((InterfaceC1381610m3b) obj4).getPrimaryMatchMeta() == null) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        if (arrayList2.isEmpty()) {
                                            break;
                                        }
                                        interfaceC1157890gEl.LIZ(str2, arrayList2);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj5 : arrayList) {
                                        if (((InterfaceC1381610m3b) obj5).getPrimaryMatchMeta() != null) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                    return arrayList3;
                                }
                            };
                        }
                        throw new C1154500g9I(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        String message = e.getMessage();
                        if (message == null) {
                            message = "error in creating strategies using strategiesFromArray";
                        }
                        throw new C1154500g9I(message);
                    }
                }
                throw C1154530g9L.INSTANCE;
            }
            throw C1154540g9M.INSTANCE;
        }
        throw C1154510g9J.INSTANCE;
    }
}
