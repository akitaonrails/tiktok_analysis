package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0RTY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTY {
    public final C0RTY LIZ;
    public final Map<C187300nn, InterfaceC111300bX> LIZIZ;

    public C0RTY() {
        this(null);
    }

    public final void LIZ() {
        try {
            Collection collectionValues = ((LinkedHashMap) this.LIZIZ).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof InterfaceC457790HxJ) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC457790HxJ) it2.next()).LIZ();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        ((LinkedHashMap) this.LIZIZ).clear();
    }

    public C0RTY(C0RTY c0rty) {
        this.LIZ = c0rty;
        this.LIZIZ = new LinkedHashMap();
    }

    public final <T> T LIZIZ(Class<T> cls, String str) {
        C187300nn c187300nn = new C187300nn(cls, str);
        String canonicalName = cls.getCanonicalName();
        for (C0RTY c0rty = this; c0rty != null; c0rty = c0rty.LIZ) {
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("try find hierarchy data in ");
                        sbLIZ.append(c0rty);
                        sbLIZ.append(", ");
                        sbLIZ.append(canonicalName);
                        sbLIZ.append(", parent is ");
                        sbLIZ.append(c0rty.LIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (c0rty.LIZIZ.containsKey(c187300nn)) {
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("find hierarchy data in ");
                            sbLIZ2.append(c0rty);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log("assem_hierarchy_data", strLIZIZ2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                return (T) ((LinkedHashMap) c0rty.LIZIZ).get(c187300nn);
            }
        }
        throw new C0RTZ("No such data hierarchy by parent.");
    }

    public final <T> T LIZJ(Class<T> cls, String str) {
        C187300nn c187300nn = new C187300nn(cls, str);
        String canonicalName = cls.getCanonicalName();
        for (C0RTY c0rty = this; c0rty != null; c0rty = c0rty.LIZ) {
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("try find hierarchy data in ");
                        sbLIZ.append(c0rty);
                        sbLIZ.append(", ");
                        sbLIZ.append(canonicalName);
                        sbLIZ.append(", , parent is ");
                        sbLIZ.append(c0rty.LIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (c0rty.LIZIZ.containsKey(c187300nn)) {
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("find hierarchy data in ");
                            sbLIZ2.append(c0rty);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log("assem_hierarchy_data", strLIZIZ2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                return (T) ((LinkedHashMap) c0rty.LIZIZ).get(c187300nn);
            }
        }
        return null;
    }

    public final void LIZLLL(InterfaceC111300bX interfaceC111300bX, String str, Class<?> cls) {
        if (interfaceC111300bX == null) {
            return;
        }
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store hierarchy data in ");
                    sbLIZ.append(this);
                    sbLIZ.append(", key is ");
                    sbLIZ.append(str);
                    sbLIZ.append(", data is ");
                    sbLIZ.append(interfaceC111300bX);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Map<C187300nn, InterfaceC111300bX> map = this.LIZIZ;
        if (cls == null) {
            cls = interfaceC111300bX.getClass();
        }
        map.put(new C187300nn(cls, str), interfaceC111300bX);
    }
}
