package X;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543510qGj {
    public final boolean LIZ;
    public final InterfaceC634840OvC LIZIZ;
    public final ConcurrentHashMap<EnumC1063300dmC, ConcurrentHashMap<String, Class<? extends InterfaceC1063710dmr>>> LIZJ;
    public final C1549460qQK LIZLLL;

    public C1543510qGj() {
        this(0);
    }

    public /* synthetic */ C1543510qGj(int i) {
        this(false, null);
    }

    public C1543510qGj(boolean z, InterfaceC634840OvC interfaceC634840OvC) {
        String containerID;
        this.LIZ = z;
        this.LIZIZ = interfaceC634840OvC;
        this.LIZJ = new ConcurrentHashMap<>();
        if (z) {
            C1549460qQK c1549460qQK = new C1549460qQK();
            if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
                C1543810qHD.LIZ.put(containerID, new WeakReference<>(c1549460qQK));
            }
            this.LIZLLL = c1549460qQK;
        }
    }

    public final Class<? extends InterfaceC1063710dmr> LIZ(EnumC1063300dmC enumC1063300dmC, String str) {
        ConcurrentHashMap<String, Class<? extends InterfaceC1063710dmr>> concurrentHashMap;
        if (enumC1063300dmC == EnumC1063300dmC.NONE || (concurrentHashMap = this.LIZJ.get(enumC1063300dmC)) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public final void LIZIZ(Class<? extends InterfaceC1063710dmr> cls, EnumC1063300dmC enumC1063300dmC) {
        String strLIZ;
        List listSingletonList;
        List listSingletonList2;
        String strLIZ2;
        if (!C1544000qHW.LIZJ) {
            EnumC1063300dmC enumC1063300dmC2 = EnumC1063300dmC.ALL;
            if (enumC1063300dmC == enumC1063300dmC2) {
                listSingletonList2 = C1697810uHb.LJIIJJI(enumC1063300dmC2, EnumC1063300dmC.WEB, EnumC1063300dmC.LYNX, EnumC1063300dmC.RN);
            } else {
                listSingletonList2 = Collections.singletonList(enumC1063300dmC);
            }
            for (Object obj : listSingletonList2) {
                ConcurrentHashMap<String, Class<? extends InterfaceC1063710dmr>> concurrentHashMap = this.LIZJ.get(obj);
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap<>();
                }
                if (!this.LIZ) {
                    C1549460qQK c1549460qQKLIZ = C1543810qHD.LIZ(null);
                    if (c1549460qQKLIZ != null) {
                        strLIZ2 = c1549460qQKLIZ.LIZ(cls);
                        if (strLIZ2 == null && strLIZ2.length() != 0) {
                            concurrentHashMap.put(strLIZ2, cls);
                            this.LIZJ.put((EnumC1063300dmC) obj, concurrentHashMap);
                        }
                    }
                } else {
                    C1549460qQK c1549460qQK = this.LIZLLL;
                    if (c1549460qQK != null) {
                        strLIZ2 = c1549460qQK.LIZ(cls);
                        if (strLIZ2 == null) {
                        }
                    }
                }
            }
            return;
        }
        if (!this.LIZ) {
            C1549460qQK c1549460qQKLIZ2 = C1543810qHD.LIZ(null);
            if (c1549460qQKLIZ2 != null) {
                strLIZ = c1549460qQKLIZ2.LIZ(cls);
            } else {
                return;
            }
        } else {
            C1549460qQK c1549460qQK2 = this.LIZLLL;
            if (c1549460qQK2 != null) {
                strLIZ = c1549460qQK2.LIZ(cls);
            } else {
                return;
            }
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            EnumC1063300dmC enumC1063300dmC3 = EnumC1063300dmC.ALL;
            if (enumC1063300dmC == enumC1063300dmC3) {
                listSingletonList = C1697810uHb.LJIIJJI(enumC1063300dmC3, EnumC1063300dmC.WEB, EnumC1063300dmC.LYNX, EnumC1063300dmC.RN);
            } else {
                listSingletonList = Collections.singletonList(enumC1063300dmC);
            }
            for (Object obj2 : listSingletonList) {
                ConcurrentHashMap<String, Class<? extends InterfaceC1063710dmr>> concurrentHashMap2 = this.LIZJ.get(obj2);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap<>();
                }
                concurrentHashMap2.put(strLIZ, cls);
                this.LIZJ.put((EnumC1063300dmC) obj2, concurrentHashMap2);
            }
        }
    }
}
