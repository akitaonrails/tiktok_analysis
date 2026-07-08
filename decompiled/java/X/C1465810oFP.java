package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0oFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465810oFP {
    public static final C1465810oFP LIZ = new C1465810oFP();
    public static final ConcurrentHashMap<String, C1465860oFU> LIZIZ = new ConcurrentHashMap<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static volatile long LIZLLL;

    public static void LIZ(String str) {
        C1465860oFU c1465860oFU = LIZIZ.get(str);
        if (c1465860oFU != null) {
            c1465860oFU.LJFF = System.currentTimeMillis();
            C201950140e c201950140e = C201950140e.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StoryPublishStateMonitor onClickPublish key=");
            sbLIZ.append(str);
            C201955140j.LIZJ(c201950140e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        if (LIZJ.compareAndSet(false, true)) {
            C1906580ziK.LIZJ().LJII().LJJIL(new InterfaceC19483011Ki() { // from class: X.0oFS
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    C1465810oFP.LIZ.getClass();
                    return ((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1711206n0;
                }
            }).LJJLL(new C09JN() { // from class: X.0oFR
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StoryPublishStateMonitor@8724.init$2");
                    C1465810oFP.LIZ.getClass();
                    C1465810oFP.LIZLLL = System.currentTimeMillis();
                    C201950140e c201950140e = C201950140e.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StoryPublishStateMonitor onMainActivityDestroyed ownerCount=");
                    sbLIZ.append(C1465810oFP.LIZIZ.size());
                    C201955140j.LIZJ(c201950140e, C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("StoryPublishStateMonitor@8724.init$2");
                }
            }, new C09JN() { // from class: X.0nbE
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StoryPublishStateMonitor@8724.init$3");
                    C201955140j.LJIIJ(C201950140e.LIZIZ, "StoryPublishStateMonitor destroyed error", (Throwable) obj);
                    C1C7U.LIZIZ("StoryPublishStateMonitor@8724.init$3");
                }
            });
            C1906580ziK.LIZJ().LJIIJ().LJJIL(new InterfaceC19483011Ki() { // from class: X.0oFT
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    C1465810oFP.LIZ.getClass();
                    return ((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1711206n0;
                }
            }).LJJLL(new C09JN() { // from class: X.0oFQ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int i;
                    EnumC055200Ic enumC055200Ic;
                    int i2;
                    C1C7U.LIZ("StoryPublishStateMonitor@8724.init$5");
                    C1465810oFP.LIZ.getClass();
                    ConcurrentHashMap<String, C1465860oFU> concurrentHashMap = C1465810oFP.LIZIZ;
                    if (!concurrentHashMap.isEmpty()) {
                        long j = C1465810oFP.LIZLLL;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator<Map.Entry<String, C1465860oFU>> it2 = concurrentHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, C1465860oFU> next = it2.next();
                            String key = next.getKey();
                            C1465860oFU value = next.getValue();
                            value.LJ = j;
                            if (value.LIZIZ || value.LJFF > 0) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("enter_from", value.LIZ);
                                String str4 = value.LIZJ;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                linkedHashMap.put("enter_method", str4);
                                linkedHashMap.put("is_from_story_entrance", Integer.valueOf(value.LIZIZ ? 1 : 0));
                                if (value.LJ > 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                linkedHashMap.put("is_main_activity_destroyed", Integer.valueOf(i));
                                if (value.LJ <= 0) {
                                    enumC055200Ic = EnumC055200Ic.NOT_DESTROYED;
                                } else if (value.LJFF > 0 && value.LJ >= value.LJFF) {
                                    enumC055200Ic = EnumC055200Ic.DURING_PUBLISH;
                                } else {
                                    enumC055200Ic = EnumC055200Ic.BEFORE_PUBLISH;
                                }
                                linkedHashMap.put("destroy_timing", enumC055200Ic.name());
                                if (value.LJFF > 0) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                linkedHashMap.put("is_publish_clicked", Integer.valueOf(i2));
                                linkedHashMap.put("end_to_end_duration", Long.valueOf(jCurrentTimeMillis - value.LIZLLL));
                                if (value.LJ > 0) {
                                    linkedHashMap.put("main_page_invisible_duration", Long.valueOf(jCurrentTimeMillis - value.LJ));
                                }
                                if (value.LJFF > 0) {
                                    linkedHashMap.put("edit_duration", Long.valueOf(value.LJFF - value.LIZLLL));
                                    linkedHashMap.put("publish_to_resume_duration", Long.valueOf(jCurrentTimeMillis - value.LJFF));
                                }
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    c2344009Gk.LJFF((String) entry.getKey(), entry.getValue().toString());
                                }
                                C20684815ws.LJIILLIIL("tool_performance_story_publish_state_monitor", c2344009Gk.LIZ);
                                C201950140e c201950140e = C201950140e.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("StoryPublishStateMonitor report key=");
                                sbLIZ.append(key);
                                sbLIZ.append(" params=");
                                sbLIZ.append(linkedHashMap);
                                C201955140j.LIZJ(c201950140e, C2188811AlT.LIZIZ(sbLIZ));
                            }
                            it2.remove();
                        }
                        C1465810oFP.LIZLLL = 0L;
                    }
                    C1C7U.LIZIZ("StoryPublishStateMonitor@8724.init$5");
                }
            }, new C09JN() { // from class: X.0nbF
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StoryPublishStateMonitor@8724.init$6");
                    C201955140j.LJIIJ(C201950140e.LIZIZ, "StoryPublishStateMonitor resumed error", (Throwable) obj);
                    C1C7U.LIZIZ("StoryPublishStateMonitor@8724.init$6");
                }
            });
        }
        LIZIZ.put(str, new C1465860oFU(str2, z, str3));
        C201950140e c201950140e = C201950140e.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPublishStateMonitor onEnterEdit key=");
        sbLIZ.append(str);
        sbLIZ.append(" enterFrom=");
        sbLIZ.append(str2);
        sbLIZ.append(" enterMethod=");
        sbLIZ.append(str3);
        C201955140j.LIZJ(c201950140e, C2188811AlT.LIZIZ(sbLIZ));
    }
}
