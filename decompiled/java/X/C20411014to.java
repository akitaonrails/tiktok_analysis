package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.14to, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20411014to implements InterfaceC986020blY {
    public static final C20411014to LIZ = new C20411014to();
    public static final List<C20411114tp> LIZIZ = new ArrayList();

    static {
        for (C20407014tA c20407014tA : (ArrayList) C20396814rW.LIZLLL.LIZIZ) {
            LIZ.LIZIZ(c20407014tA.LIZ, C20396814rW.LIZLLL.LIZ, c20407014tA.LIZIZ);
        }
        for (Map.Entry entry : ((LinkedHashMap) C20396814rW.LIZLLL.LIZJ).entrySet()) {
            LIZJ(C20396814rW.LIZLLL.LIZ).LIZLLL.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static C20411114tp LIZJ(EnumC499801x6 enumC499801x6) {
        Object next;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C20411114tp) next).LIZ == enumC499801x6) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20411114tp c20411114tp = (C20411114tp) next;
        if (c20411114tp == null) {
            c20411114tp = new C20411114tp(enumC499801x6);
            if (0 == 0) {
                ((ArrayList) LIZIZ).add(c20411114tp);
            }
        }
        return c20411114tp;
    }

    @Override // X.InterfaceC986020blY
    public final String LIZ(EnumC20429914wr enumC20429914wr, EnumC499801x6 enumC499801x6) {
        C915890ZwR c915890ZwR;
        C20411114tp next;
        String str;
        Object next2;
        C915890ZwR c915890ZwR2;
        Object next3;
        boolean z;
        Iterator<C20411114tp> it2 = LIZIZ.iterator();
        while (true) {
            c915890ZwR = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC499801x6) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20411114tp c20411114tp = next;
        String str2 = "";
        if (c20411114tp == null) {
            return "";
        }
        try {
            int i = C20411314tr.LIZ[enumC20429914wr.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C978380bZE c978380bZE = C978380bZE.LIZ;
                    C13E8 c13e8 = (C13E8) ((LinkedHashMap) C978380bZE.LIZIZ).get(enumC499801x6);
                    if (c13e8 != null) {
                        Iterator it3 = new C13EO(c13e8).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next3 = it3.next();
                                if (((ArrayList) c20411114tp.LIZJ).contains(((C915890ZwR) next3).LIZ)) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        c915890ZwR2 = (C915890ZwR) next3;
                        c915890ZwR = c915890ZwR2;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C978380bZE c978380bZE2 = C978380bZE.LIZ;
                C13E8 c13e82 = (C13E8) ((LinkedHashMap) C978380bZE.LIZIZ).get(enumC499801x6);
                if (c13e82 != null) {
                    Iterator it4 = new C13EO(c13e82).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next2 = it4.next();
                            if (((ArrayList) c20411114tp.LIZIZ).contains(((C915890ZwR) next2).LIZ)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    c915890ZwR2 = (C915890ZwR) next2;
                    c915890ZwR = c915890ZwR2;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (c915890ZwR != null && (str = c915890ZwR.LIZ) != null) {
            str2 = str;
        }
        String str3 = (String) ((LinkedHashMap) c20411114tp.LIZLLL).get(str2);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    @Override // X.InterfaceC986020blY
    public final void LIZIZ(EnumC20429914wr enumC20429914wr, EnumC499801x6 enumC499801x6, String str) {
        C20411114tp c20411114tpLIZJ = LIZJ(enumC499801x6);
        int i = C20411214tq.LIZ[enumC20429914wr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((ArrayList) c20411114tpLIZJ.LIZJ).add(str);
                return;
            }
            throw new C1954807lC();
        }
        ((ArrayList) c20411114tpLIZJ.LIZIZ).add(str);
    }
}
