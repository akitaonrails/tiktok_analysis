package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.core.TarsProcessorSpi;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z0L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0L {
    public final Map<InterfaceC892680Z0g, List<InterfaceC892680Z0g>> LIZ = new LinkedHashMap();
    public final Map<String, InterfaceC892680Z0g> LIZIZ = new LinkedHashMap();
    public final Map<InterfaceC892680Z0g, List<C0Z0D>> LIZJ = new LinkedHashMap();
    public ExecutorService LIZLLL;
    public Function2<? super String, ? super Map<String, String>, Unit> LJ;

    public final C0Z0A LIZIZ() throws C892820Z0u {
        if (this.LIZIZ.isEmpty()) {
            throw new C892820Z0u("nodes map is empty,pls add note to pipeline", "runtime");
        }
        if (!this.LIZIZ.containsKey("start")) {
            throw new C892820Z0u("pls create start node", "runtime");
        }
        if (((LinkedHashMap) this.LIZ).get(((LinkedHashMap) this.LIZIZ).get("start")) == null) {
            throw new C892820Z0u("there is no task following start node", "runtime");
        }
        InterfaceC892680Z0g interfaceC892680Z0g = (InterfaceC892680Z0g) ((LinkedHashMap) this.LIZIZ).get("start");
        if (interfaceC892680Z0g != null) {
            if (LIZJ(interfaceC892680Z0g, new LinkedHashMap(), this.LIZ)) {
                throw new C892820Z0u("there is a task circle in your chain ,pls check it with ", "runtime");
            }
        }
        ExecutorService executorService = this.LIZLLL;
        if (executorService == null) {
            throw new C892820Z0u("pls set default executors", "runtime");
        }
        C0Z0A c0z0a = new C0Z0A(executorService);
        c0z0a.LIZIZ.putAll(this.LIZ);
        c0z0a.LIZJ.putAll(this.LIZIZ);
        c0z0a.LIZLLL.putAll(this.LIZJ);
        c0z0a.LJFF = this.LJ;
        return c0z0a;
    }

    public C0Z0L() {
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        this.LIZLLL = tarsSharedInterface != null ? tarsSharedInterface.LJ() : null;
    }

    public static void LIZ(C0Z0L c0z0l, InterfaceC892680Z0g interfaceC892680Z0g) {
        if (!c0z0l.LIZIZ.containsKey(interfaceC892680Z0g.getName())) {
            c0z0l.LIZIZ.put(interfaceC892680Z0g.getName(), interfaceC892680Z0g);
            c0z0l.LIZJ.put(interfaceC892680Z0g, new ArrayList());
            List list = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
            if (list != null) {
                list.addAll(C13BV.INSTANCE);
            }
            final TarsConfig.Processor processor = interfaceC892680Z0g.LJIIIIZZ().preprocessor;
            if (processor != null) {
                if (!processor.keyMapping.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(processor.type);
                    sbLIZ.append(" mapping");
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    final List<TarsConfig.TarsMapping> list2 = processor.keyMapping;
                    C0Z0D c0z0d = new C0Z0D(strLIZIZ, list2) { // from class: X.0Z0V
                        public final /* synthetic */ List<TarsConfig.TarsMapping> LIZ;

                        @Override // X.C0Z0D
                        public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                        }

                        @Override // X.C0Z0D
                        public final Unit LIZ(C0Z09 c0z09) {
                            c0z09.onSuccess(null);
                            return Unit.LIZ;
                        }

                        {
                            this.LIZ = list2;
                        }

                        @Override // X.C0Z0D
                        public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                            Object obj;
                            for (TarsConfig.TarsMapping tarsMapping : this.LIZ) {
                                if (!Intrinsics.LJFF(tarsMapping.sourceKey, tarsMapping.targetKey) && (obj = map.get(tarsMapping.sourceKey)) != null) {
                                    map.remove(tarsMapping.sourceKey);
                                    map.put(tarsMapping.targetKey, obj);
                                }
                            }
                        }
                    };
                    List list3 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                    if (list3 != null) {
                        list3.add(c0z0d);
                    }
                }
                C0Z0D c0z0d2 = new C0Z0D() { // from class: X.0Z0b
                    @Override // X.C0Z0D
                    public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                    }

                    @Override // X.C0Z0D
                    public final Unit LIZ(C0Z09 c0z09) {
                        TarsProcessorSpi tarsProcessorSpi = (TarsProcessorSpi) PluggableExtentionKt.pluggableSpi$default(TarsProcessorSpi.class, false, false, false, 14, null);
                        if (tarsProcessorSpi != null) {
                            TarsConfig.Processor processor2 = processor;
                            InterfaceC892650Z0d interfaceC892650Z0dLIZ = tarsProcessorSpi.LIZ(processor2.type, processor2);
                            if (interfaceC892650Z0dLIZ != null) {
                                interfaceC892650Z0dLIZ.LIZ(c0z09);
                            }
                        }
                        return Unit.LIZ;
                    }

                    @Override // X.C0Z0D
                    public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                        TarsProcessorSpi tarsProcessorSpi = (TarsProcessorSpi) PluggableExtentionKt.pluggableSpi$default(TarsProcessorSpi.class, false, false, false, 14, null);
                        if (tarsProcessorSpi != null) {
                            TarsConfig.Processor processor2 = processor;
                            InterfaceC892650Z0d interfaceC892650Z0dLIZ = tarsProcessorSpi.LIZ(processor2.type, processor2);
                            if (interfaceC892650Z0dLIZ != null) {
                                interfaceC892650Z0dLIZ.LIZJ(map);
                            }
                        }
                    }
                };
                List list4 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                if (list4 != null) {
                    list4.add(c0z0d2);
                }
                if (!processor.keyMapping.isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(processor.type);
                    sbLIZ2.append(" mapping");
                    final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    final List<TarsConfig.TarsMapping> list5 = processor.keyMapping;
                    C0Z0D c0z0d3 = new C0Z0D(strLIZIZ2, list5) { // from class: X.0Z0V
                        public final /* synthetic */ List<TarsConfig.TarsMapping> LIZ;

                        @Override // X.C0Z0D
                        public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                        }

                        @Override // X.C0Z0D
                        public final Unit LIZ(C0Z09 c0z09) {
                            c0z09.onSuccess(null);
                            return Unit.LIZ;
                        }

                        {
                            this.LIZ = list5;
                        }

                        @Override // X.C0Z0D
                        public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                            Object obj;
                            for (TarsConfig.TarsMapping tarsMapping : this.LIZ) {
                                if (!Intrinsics.LJFF(tarsMapping.sourceKey, tarsMapping.targetKey) && (obj = map.get(tarsMapping.sourceKey)) != null) {
                                    map.remove(tarsMapping.sourceKey);
                                    map.put(tarsMapping.targetKey, obj);
                                }
                            }
                        }
                    };
                    List list6 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                    if (list6 != null) {
                        list6.add(c0z0d3);
                    }
                }
            }
            final TarsConfig.Processor processor2 = interfaceC892680Z0g.LJIIIIZZ().postprocessor;
            if (processor2 != null) {
                if (!processor2.keyMapping.isEmpty()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(processor2.type);
                    sbLIZ3.append(" mapping");
                    final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    final List<TarsConfig.TarsMapping> list7 = processor2.keyMapping;
                    C0Z0D c0z0d4 = new C0Z0D(strLIZIZ3, list7) { // from class: X.0Z0X
                        public final /* synthetic */ List<TarsConfig.TarsMapping> LIZ;

                        @Override // X.C0Z0D
                        public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                        }

                        @Override // X.C0Z0D
                        public final Unit LIZ(C0Z09 c0z09) {
                            c0z09.onSuccess(null);
                            return Unit.LIZ;
                        }

                        {
                            this.LIZ = list7;
                        }

                        @Override // X.C0Z0D
                        public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                            Object obj;
                            for (TarsConfig.TarsMapping tarsMapping : this.LIZ) {
                                if (!Intrinsics.LJFF(tarsMapping.sourceKey, tarsMapping.targetKey) && (obj = map2.get(tarsMapping.sourceKey)) != null) {
                                    map2.remove(tarsMapping.sourceKey);
                                    map2.put(tarsMapping.targetKey, obj);
                                }
                            }
                        }
                    };
                    List list8 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                    if (list8 != null) {
                        list8.add(c0z0d4);
                    }
                }
                C0Z0D c0z0d5 = new C0Z0D() { // from class: X.0Z0a
                    @Override // X.C0Z0D
                    public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                    }

                    @Override // X.C0Z0D
                    public final Unit LIZ(C0Z09 c0z09) {
                        TarsProcessorSpi tarsProcessorSpi = (TarsProcessorSpi) PluggableExtentionKt.pluggableSpi$default(TarsProcessorSpi.class, false, false, false, 14, null);
                        if (tarsProcessorSpi != null) {
                            TarsConfig.Processor processor3 = processor2;
                            InterfaceC892650Z0d interfaceC892650Z0dLIZ = tarsProcessorSpi.LIZ(processor3.type, processor3);
                            if (interfaceC892650Z0dLIZ != null) {
                                interfaceC892650Z0dLIZ.LIZ(c0z09);
                            }
                        }
                        return Unit.LIZ;
                    }

                    @Override // X.C0Z0D
                    public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                        TarsProcessorSpi tarsProcessorSpi = (TarsProcessorSpi) PluggableExtentionKt.pluggableSpi$default(TarsProcessorSpi.class, false, false, false, 14, null);
                        if (tarsProcessorSpi != null) {
                            TarsConfig.Processor processor3 = processor2;
                            InterfaceC892650Z0d interfaceC892650Z0dLIZ = tarsProcessorSpi.LIZ(processor3.type, processor3);
                            if (interfaceC892650Z0dLIZ != null) {
                                interfaceC892650Z0dLIZ.LIZIZ(map, map2, map3);
                            }
                        }
                    }
                };
                List list9 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                if (list9 != null) {
                    list9.add(c0z0d5);
                }
                if (!processor2.keyMapping.isEmpty()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(processor2.type);
                    sbLIZ4.append(" mapping");
                    final String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                    final List<TarsConfig.TarsMapping> list10 = processor2.keyMapping;
                    C0Z0D c0z0d6 = new C0Z0D(strLIZIZ4, list10) { // from class: X.0Z0X
                        public final /* synthetic */ List<TarsConfig.TarsMapping> LIZ;

                        @Override // X.C0Z0D
                        public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, Object> map) {
                        }

                        @Override // X.C0Z0D
                        public final Unit LIZ(C0Z09 c0z09) {
                            c0z09.onSuccess(null);
                            return Unit.LIZ;
                        }

                        {
                            this.LIZ = list10;
                        }

                        @Override // X.C0Z0D
                        public final void LIZJ(InterfaceC892680Z0g interfaceC892680Z0g2, Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                            Object obj;
                            for (TarsConfig.TarsMapping tarsMapping : this.LIZ) {
                                if (!Intrinsics.LJFF(tarsMapping.sourceKey, tarsMapping.targetKey) && (obj = map2.get(tarsMapping.sourceKey)) != null) {
                                    map2.remove(tarsMapping.sourceKey);
                                    map2.put(tarsMapping.targetKey, obj);
                                }
                            }
                        }
                    };
                    List list11 = (List) ((LinkedHashMap) c0z0l.LIZJ).get(interfaceC892680Z0g);
                    if (list11 != null) {
                        list11.add(c0z0d6);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("has the same name tars nodes as ");
        sbLIZ5.append(interfaceC892680Z0g);
        throw new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ5), "runtime");
    }

    public static boolean LIZJ(InterfaceC892680Z0g interfaceC892680Z0g, Map map, Map map2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num = (Integer) linkedHashMap.get(interfaceC892680Z0g);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        Integer num2 = (Integer) linkedHashMap.get(interfaceC892680Z0g);
        if (num2 != null && num2.intValue() == 2) {
            return false;
        }
        map.put(interfaceC892680Z0g, 1);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
        List list = (List) linkedHashMap2.get(interfaceC892680Z0g);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (LIZJ((InterfaceC892680Z0g) it2.next(), map, linkedHashMap2)) {
                return true;
            }
        }
        map.put(interfaceC892680Z0g, 2);
        return false;
    }
}
