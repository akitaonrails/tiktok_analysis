package X;

import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1756306uH implements InterfaceC1737306rD {
    public final Map<String, Long> LIZ = new LinkedHashMap();
    public final Map<String, Long> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r10v0, types: [X.06uK] */
    public static final void LIZLLL(final C1736706r7 c1736706r7, String str, String str2, final List list) {
        FakeMsgProtocol fakeMsgProtocol;
        final InterfaceC1757306uR interfaceC1757306uRJ31;
        Integer numValueOf;
        Integer numValueOf2;
        Object next;
        final C118300cf c118300cf = new C118300cf();
        final C118300cf c118300cf2 = new C118300cf();
        final C259800zU c259800zU = new C259800zU();
        final Object obj = new Object();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            final C1736606r6 c1736606r6LIZIZ = ((C1684506ih) it2.next()).LIZIZ();
            List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
            if (listLIZIZ != null) {
                Iterator it3 = ((ArrayList) listLIZIZ).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((FakeMsgProtocol) next).Sv1() == c1736606r6LIZIZ.LIZ) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                fakeMsgProtocol = (FakeMsgProtocol) next;
            } else {
                fakeMsgProtocol = null;
            }
            final ?? r10 = new InterfaceC1757506uT() { // from class: X.06uK
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str3) {
                    InterfaceC1757606uU interfaceC1757606uU = c1736706r7;
                    if (interfaceC1757606uU != null) {
                        interfaceC1757606uU.LIZIZ(c1736606r6, i, str3);
                    }
                    Object obj2 = obj;
                    C118300cf c118300cf3 = c118300cf;
                    C118300cf c118300cf4 = c118300cf2;
                    C259800zU<String> c259800zU2 = c259800zU;
                    List<C1684506ih> list2 = list;
                    InterfaceC1757606uU interfaceC1757606uU2 = c1736706r7;
                    synchronized (obj2) {
                        try {
                            c118300cf3.element++;
                            if (i == 1) {
                                c118300cf4.element++;
                            } else {
                                c259800zU2.element = str3;
                            }
                            if (c118300cf3.element != list2.size()) {
                                return;
                            }
                            if (interfaceC1757606uU2 != null) {
                                String str4 = c259800zU2.element;
                                interfaceC1757606uU2.LIZ();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            };
            if (fakeMsgProtocol != null) {
                interfaceC1757306uRJ31 = fakeMsgProtocol.j31();
                InterfaceC1756706uL interfaceC1756706uLXf1 = fakeMsgProtocol.xf1();
                if (interfaceC1756706uLXf1 != null) {
                    numValueOf = Integer.valueOf(interfaceC1756706uLXf1.LJI());
                    numValueOf2 = Integer.valueOf(interfaceC1756706uLXf1.LIZIZ());
                }
                if (fakeMsgProtocol != null || interfaceC1757306uRJ31 == null || ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf2 != null && numValueOf2.intValue() == 2))) {
                    r10.LIZIZ(c1736606r6LIZIZ, -2, "can't upgrade fake msg");
                } else if (str2 == null) {
                    r10.LIZIZ(c1736606r6LIZIZ, -2, "sessionUuid is null");
                } else {
                    interfaceC1757306uRJ31.LIZ();
                    String strLIZIZ = interfaceC1757306uRJ31.LIZIZ(c1736606r6LIZIZ);
                    final C1756006uE c1756006uELIZ = C1756206uG.LIZ(str2, strLIZIZ);
                    C1756206uG.LIZIZ(str2, strLIZIZ, false);
                    if (c1756006uELIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("contains no memory message ");
                        sbLIZ.append(str);
                        sbLIZ.append('-');
                        sbLIZ.append(strLIZIZ);
                        r10.LIZIZ(c1736606r6LIZIZ, -2, C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        C869590Y9l c869590Y9l = c1756006uELIZ.LIZ;
                        if (c869590Y9l != null) {
                            c869590Y9l.setCreatedAt(System.currentTimeMillis());
                            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIJL(c869590Y9l, new InterfaceC863600XuI<C869590Y9l>() { // from class: X.06uM
                                @Override // X.InterfaceC863600XuI
                                public final void LIZIZ(C0YMW c0ymw) {
                                    String statusMsg;
                                    InterfaceC1757506uT interfaceC1757506uT = r10;
                                    if (interfaceC1757506uT != null) {
                                        C1736606r6 c1736606r6 = c1736606r6LIZIZ;
                                        if (c0ymw != null) {
                                            statusMsg = c0ymw.getStatusMsg();
                                        } else {
                                            statusMsg = null;
                                        }
                                        interfaceC1757506uT.LIZIZ(c1736606r6, -2, statusMsg);
                                    }
                                }

                                @Override // X.InterfaceC863600XuI
                                public final void onSuccess(C869590Y9l c869590Y9l2) {
                                    InterfaceC1757506uT interfaceC1757506uT = r10;
                                    if (interfaceC1757506uT != null) {
                                        interfaceC1757506uT.LIZIZ(c1736606r6LIZIZ, 1, null);
                                    }
                                    if (c1756006uELIZ.LIZ != null) {
                                        interfaceC1757306uRJ31.LIZJ();
                                    }
                                }
                            });
                        }
                    }
                }
            } else {
                interfaceC1757306uRJ31 = null;
            }
            numValueOf = null;
            numValueOf2 = null;
            if (fakeMsgProtocol != null) {
            }
            r10.LIZIZ(c1736606r6LIZIZ, -2, "can't upgrade fake msg");
        }
    }

    @Override // X.InterfaceC1737306rD
    public final void LIZ(String str, String str2, C1736606r6 c1736606r6, FakeMsgProtocol fakeMsgProtocol, InterfaceC1757506uT interfaceC1757506uT) {
        InterfaceC1757006uO interfaceC1757006uOH80;
        boolean zContainsKey;
        if (fakeMsgProtocol != null) {
            interfaceC1757006uOH80 = fakeMsgProtocol.h80();
        } else {
            interfaceC1757006uOH80 = null;
        }
        if (fakeMsgProtocol != null && interfaceC1757006uOH80 != null) {
            if (interfaceC1757006uOH80.LIZLLL(c1736606r6)) {
                if (interfaceC1757506uT != null) {
                    interfaceC1757506uT.LIZIZ(c1736606r6, -2, "can't delete msg, it's intercepted");
                    return;
                }
                return;
            }
            String strLIZIZ = interfaceC1757006uOH80.LIZIZ(c1736606r6);
            if (strLIZIZ == null) {
                if (interfaceC1757506uT != null) {
                    interfaceC1757506uT.LIZIZ(c1736606r6, -2, "can't delete msg, msgUuid is null");
                    return;
                }
                return;
            }
            C869590Y9l c869590Y9lBuild = new C869680Y9u(0L, "").build();
            c869590Y9lBuild.setUuid(strLIZIZ);
            c869590Y9lBuild.setConversationId(str);
            int iLJI = fakeMsgProtocol.xf1().LJI();
            if (iLJI != 1) {
                if (iLJI == 2) {
                    if (str2 == null) {
                        if (interfaceC1757506uT != null) {
                            interfaceC1757506uT.LIZIZ(c1736606r6, -2, "sessionUuid is null");
                            return;
                        }
                        return;
                    }
                    C1756906uN c1756906uN = C1756206uG.LIZ.get(str2);
                    if (c1756906uN != null) {
                        synchronized (c1756906uN) {
                            zContainsKey = c1756906uN.LIZ.containsKey(strLIZIZ);
                        }
                        if (zContainsKey) {
                            C1756206uG.LIZIZ(str2, strLIZIZ, true);
                            interfaceC1757006uOH80.LIZJ(c1736606r6);
                            return;
                        }
                    }
                    C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(c869590Y9lBuild, true, new C1769106wL(interfaceC1757506uT, c1736606r6, interfaceC1757006uOH80, strLIZIZ, 1));
                    return;
                }
                return;
            }
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(c869590Y9lBuild, true, new C1769106wL(interfaceC1757506uT, c1736606r6, interfaceC1757006uOH80, strLIZIZ, 0));
            return;
        }
        if (interfaceC1757506uT != null) {
            interfaceC1757506uT.LIZIZ(c1736606r6, -2, "can't delete fake msg for protocol type");
        }
    }

    public final List<C1736806r8> LIZJ(String str, String str2, final List<C1684506ih> list, C0Y8T c0y8t, final InterfaceC1757606uU interfaceC1757606uU) {
        long lastMessageOrderIndex;
        long lastMessageIndex;
        final C118300cf c118300cf = new C118300cf();
        final C118300cf c118300cf2 = new C118300cf();
        final C259800zU c259800zU = new C259800zU();
        final Object obj = new Object();
        if (c0y8t != null) {
            lastMessageOrderIndex = c0y8t.getLastMessageOrderIndex();
        } else {
            lastMessageOrderIndex = 0;
        }
        long jMax = Math.max(lastMessageOrderIndex, 10000L);
        if (c0y8t != null) {
            lastMessageIndex = c0y8t.getLastMessageIndex();
        } else {
            lastMessageIndex = 1;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1684506ih> it2 = list.iterator();
        while (it2.hasNext()) {
            C1736606r6 c1736606r6LIZIZ = it2.next().LIZIZ();
            List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
            FakeMsgProtocol fakeMsgProtocol = null;
            Object obj2 = null;
            if (listLIZIZ != null) {
                Iterator it3 = ((ArrayList) listLIZIZ).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((FakeMsgProtocol) next).Sv1() == c1736606r6LIZIZ.LIZ) {
                        obj2 = next;
                        break;
                    }
                }
                fakeMsgProtocol = (FakeMsgProtocol) obj2;
            }
            jMax++;
            lastMessageIndex++;
            C1736806r8 c1736806r8LIZIZ = LIZIZ(str, str2, c1736606r6LIZIZ, fakeMsgProtocol, C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str), jMax, lastMessageIndex, new InterfaceC1757506uT() { // from class: X.06uI
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str3) {
                    InterfaceC1757606uU interfaceC1757606uU2 = interfaceC1757606uU;
                    if (interfaceC1757606uU2 != null) {
                        interfaceC1757606uU2.LIZIZ(c1736606r6, i, str3);
                    }
                    Object obj3 = obj;
                    C118300cf c118300cf3 = c118300cf;
                    C118300cf c118300cf4 = c118300cf2;
                    C259800zU<String> c259800zU2 = c259800zU;
                    List<C1684506ih> list2 = list;
                    InterfaceC1757606uU interfaceC1757606uU3 = interfaceC1757606uU;
                    synchronized (obj3) {
                        try {
                            c118300cf3.element++;
                            if (i == 1) {
                                c118300cf4.element++;
                            } else {
                                c259800zU2.element = str3;
                            }
                            if (c118300cf3.element != list2.size()) {
                                return;
                            }
                            if (interfaceC1757606uU3 != null) {
                                String str4 = c259800zU2.element;
                                interfaceC1757606uU3.LIZ();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
            if (c1736806r8LIZIZ != null) {
                arrayList.add(c1736806r8LIZIZ);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1737306rD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1736806r8 LIZIZ(java.lang.String r20, java.lang.String r21, final X.C1736606r6 r22, com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol r23, X.C0Y8T r24, long r25, long r27, final X.InterfaceC1757506uT r29) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1756306uH.LIZIZ(java.lang.String, java.lang.String, X.06r6, com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol, X.0Y8T, long, long, X.06uT):X.06r8");
    }
}
