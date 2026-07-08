package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0C5N, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5N implements InterfaceC304970BxP, C0C5F {
    public static final C0C5N LL = new C0C5N();

    @Override // X.C0C5F
    public final Map<String, k> LIZIZ() {
        if (C0C5L.LIZIZ.compareAndSet(false, true)) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0C5O
                public static void LIZ() {
                    Set<String> allKey;
                    C0C5L c0c5l = C0C5L.LIZ;
                    synchronized (c0c5l) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            c0c5l.LIZ();
                            Keva keva = C0C5L.LIZLLL;
                            if (keva != null && (allKey = keva.getAllKey()) != null) {
                                for (String str : allKey) {
                                    Keva keva2 = C0C5L.LIZLLL;
                                    String string = keva2 != null ? keva2.getString(str, "") : null;
                                    if (C123100dR.LIZ(string)) {
                                        linkedHashMap.put(str, (k) C08JS.LIZ(string, k.class));
                                    }
                                }
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("read cost:");
                            sbLIZ.append(jCurrentTimeMillis2);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C0C5L.LIZJ = linkedHashMap;
                    }
                    if (C0C5G.LIZIZ.size() != 0) {
                        C0C5G.LIZJ = true;
                    }
                }

                @Override // java.lang.Runnable
                @C1BCF(distinctId = HotSearchInfo.serialVersionUID, scene = "boot", taskPriority = EnumC21352718hJ.UI)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CreativeToolReversalKeva@554e.get$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CreativeToolReversalKeva@554e.get$1");
                }
            });
        }
        return C0C5L.LIZJ;
    }

    @Override // X.InterfaceC304970BxP
    public final void LIZ() {
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0C5M
            public static void LIZ() {
                try {
                    C0C5L c0c5l = C0C5L.LIZ;
                    synchronized (c0c5l) {
                        c0c5l.LIZ();
                        Map<String, k> linkedHashMap = new LinkedHashMap<>();
                        Keva keva = C0C5L.LIZLLL;
                        if (keva != null) {
                            keva.clear();
                        }
                        try {
                            linkedHashMap = C0C5L.LIZIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C0C5L.LIZJ = linkedHashMap;
                    }
                    if (C0C5G.LIZIZ.size() != 0) {
                        C0C5G.LIZJ = true;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CreativeToolReversalDataInterceptorOpt@3dd0.onChanged$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CreativeToolReversalDataInterceptorOpt@3dd0.onChanged$1");
            }
        });
    }
}
