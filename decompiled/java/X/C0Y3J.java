package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS65S1000000_14;
import kotlin.jvm.internal.AwS7S0410000_9;
import kotlin.jvm.internal.AwS98S1200000_14;

/* JADX INFO: renamed from: X.0Y3J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3J implements InterfaceC603530Nln {
    public final C0YEM LIZ;

    public final C0Y9I LJIIIZ() {
        return this.LIZ.LJIIZILJ().getMessage().LIZLLL();
    }

    public final boolean LJIIJ() {
        return this.LIZ.LJIIIZ().LJJLIIIIJ.LJJJ;
    }

    @Override // X.InterfaceC603530Nln
    public final boolean LJ() {
        return LJIIJ();
    }

    public C0Y3J(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public static String LJIILIIL(C0Y3O c0y3o) {
        if (c0y3o instanceof C0Y3R) {
            return ((C0Y3R) c0y3o).LIZ;
        }
        if (c0y3o instanceof C0Y3Q) {
            c0y3o.getClass();
            return String.valueOf(0L);
        }
        if (c0y3o instanceof C0Y3P) {
            c0y3o.getClass();
            throw null;
        }
        throw new C1954807lC();
    }

    public static boolean LJIIL(C869590Y9l c869590Y9l, InterfaceC863600XuI interfaceC863600XuI) {
        String uuid = c869590Y9l.getUuid();
        if (uuid != null && uuid.length() != 0 && c869590Y9l.getLocalExt() != null) {
            return false;
        }
        if (interfaceC863600XuI != null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "invalid msg parameters";
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
        return true;
    }

    @Override // X.InterfaceC603530Nln
    public final void LJFF(List list, final boolean z, final C0Y3I c0y3i) {
        if (LJIIJ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                C869590Y9l c869590Y9l = (C869590Y9l) pair.getFirst();
                Object second = pair.getSecond();
                String uuid = c869590Y9l.getUuid();
                if (uuid != null && uuid.length() != 0) {
                    linkedHashMap.put(c869590Y9l.getUuid(), second);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                if (str != null && str.length() != 0 && !map.isEmpty()) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        linkedHashMap3.put(entry2.getKey(), LJIILIIL((C0Y3O) entry2.getValue()));
                    }
                    linkedHashMap2.put(str, new LinkedHashMap(linkedHashMap3));
                }
            }
            final C0Y9I c0y9iLJIIIZ = LJIIIZ();
            c0y9iLJIIIZ.getClass();
            if (!linkedHashMap2.isEmpty()) {
                C868780Y6i c868780Y6iLIZLLL = c0y9iLJIIIZ.LL.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MessageOperatorModelJava mutateMessageLocalExtBatch count:");
                sbLIZ.append(linkedHashMap2.size());
                sbLIZ.append(", notifyObservers:");
                sbLIZ.append(z);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                c0y9iLJIIIZ.LL.LJIIJJI().LIZJ(new C914040ZtS(c0y9iLJIIIZ, linkedHashMap2, 7), new InterfaceC864800XwE<List<C869590Y9l>>() { // from class: X.0XwW
                    public final /* synthetic */ InterfaceC863600XuI LIZ = null;

                    @Override // X.InterfaceC864800XwE
                    public final void LIZ(List<C869590Y9l> list2) {
                        List<C869590Y9l> list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            if (z) {
                                C868200Y4c c868200Y4c = c0y9iLJIIIZ.LL.LJIIZILJ().getDomain().LIZ;
                                C0Y9I c0y9i = c0y9iLJIIIZ;
                                C0Y3I c0y3i2 = c0y3i;
                                c0y9i.getClass();
                                if (c0y3i2 == null) {
                                    c0y3i2 = new C0Y3I("MessageOperatorModelJava");
                                }
                                c868200Y4c.LJJIIJZLJL(c0y3i2, list3);
                            }
                            InterfaceC863600XuI interfaceC863600XuI = this.LIZ;
                            if (interfaceC863600XuI != null) {
                                interfaceC863600XuI.onSuccess(Unit.LIZ);
                                return;
                            }
                            return;
                        }
                        InterfaceC863600XuI interfaceC863600XuI2 = this.LIZ;
                        if (interfaceC863600XuI2 == null) {
                            return;
                        }
                        interfaceC863600XuI2.LIZIZ(C0YMW.from(C0YIN.LJFF(c0y9iLJIIIZ.LL, -1046)));
                    }
                }, false, c0y9iLJIIIZ.LL.LJIIL().LIZJ());
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C869590Y9l c869590Y9l2 = (C869590Y9l) ((Pair) it3.next()).getFirst();
            String uuid2 = c869590Y9l2.getUuid();
            if (uuid2 != null && uuid2.length() != 0) {
                linkedHashMap4.put(c869590Y9l2.getUuid(), new HashMap(c869590Y9l2.getLocalExt()));
            }
        }
        if (!linkedHashMap4.isEmpty()) {
            final C0Y9I c0y9iLJIIIZ2 = LJIIIZ();
            c0y9iLJIIIZ2.getClass();
            if (!linkedHashMap4.isEmpty()) {
                C868780Y6i c868780Y6iLIZLLL2 = c0y9iLJIIIZ2.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MessageOperatorModelJava batchUpdateMessageLocalExt: ");
                sbLIZ2.append(linkedHashMap4.size());
                sbLIZ2.append(", notify update: ");
                sbLIZ2.append(z);
                c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                c0y9iLJIIIZ2.LL.LJIIJJI().LIZJ(new C914040ZtS(c0y9iLJIIIZ2, linkedHashMap4, 9), new InterfaceC864800XwE<List<C869590Y9l>>() { // from class: X.0XwY
                    @Override // X.InterfaceC864800XwE
                    public final void LIZ(List<C869590Y9l> list2) {
                        List<C869590Y9l> list3 = list2;
                        if (z) {
                            C868200Y4c c868200Y4c = c0y9iLJIIIZ2.LL.LJIIZILJ().getDomain().LIZ;
                            C0Y3I c0y3i2 = c0y3i;
                            c0y3i2.getClass();
                            c868200Y4c.LJJIIJZLJL(c0y3i2, list3);
                        }
                    }
                }, false, c0y9iLJIIIZ2.LL.LJIIL().LIZJ());
            }
        }
    }

    @Override // X.InterfaceC603530Nln
    public final void LIZJ(C869590Y9l c869590Y9l, C0Y3I c0y3i, boolean z, InterfaceC863600XuI interfaceC863600XuI) {
        if (LJIIL(c869590Y9l, interfaceC863600XuI)) {
            return;
        }
        if (LJIIJ()) {
            LJIIIIZZ(this, c869590Y9l.getUuid(), z, c0y3i, interfaceC863600XuI, new AwS65S1000000_14(5));
        } else {
            c869590Y9l.getLocalExt().remove("local_ext_paired_msg_id");
            LJIIJJI(c869590Y9l, c0y3i, z, interfaceC863600XuI);
        }
    }

    public final void LJIIJJI(C869590Y9l c869590Y9l, final C0Y3I c0y3i, boolean z, final InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        if (c0y3i == null) {
            c0y3i = null;
        }
        if (z) {
            LJIIIZ().LJJIIZ(c0y3i, c869590Y9l, interfaceC863600XuI);
            return;
        }
        final C0Y9I c0y9iLJIIIZ = LJIIIZ();
        String uuid = c869590Y9l.getUuid();
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        c0y9iLJIIIZ.LL.LIZLLL().LJIIJJI("MessageOperatorModelJava updateMessageLocalExtOnly");
        c0y9iLJIIIZ.LL.LJIIJJI().LIZJ(new C914060ZtU(c0y9iLJIIIZ, uuid, localExt, 2), new InterfaceC864800XwE<C869590Y9l>() { // from class: X.0XwU
            @Override // X.InterfaceC864800XwE
            public final void LIZ(C869590Y9l c869590Y9l2) {
                if (c869590Y9l2 != null) {
                    C868200Y4c c868200Y4c = c0y9iLJIIIZ.LL.LJIIZILJ().getDomain().LIZ;
                    C0Y3I c0y3i2 = c0y3i;
                    c0y3i2.getClass();
                    c868200Y4c.LJJIIJZLJL(c0y3i2, Collections.singletonList(c869590Y9l2));
                    InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                    if (interfaceC863600XuI2 != null) {
                        interfaceC863600XuI2.onSuccess(c869590Y9l2);
                        return;
                    }
                    return;
                }
                InterfaceC863600XuI interfaceC863600XuI3 = interfaceC863600XuI;
                if (interfaceC863600XuI3 == null) {
                    return;
                }
                interfaceC863600XuI3.LIZIZ(C0YMW.from(C0YIN.LJFF(c0y9iLJIIIZ.LL, -3001)));
            }
        }, false, c0y9iLJIIIZ.LL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC603530Nln
    @InterfaceC1294060jmO
    public final Object LIZ(C869590Y9l c869590Y9l, Map<String, ? extends C0Y3O> map, C0Y3I c0y3i, boolean z, InterfaceC1364105Vn<? super C0Y6Q<C869590Y9l>> interfaceC1364105Vn) {
        return C867000Xzm.LIZ(interfaceC1364105Vn, new AwS7S0410000_9((InterfaceC603530Nln) this, (InterfaceC603530Nln) c869590Y9l, (C869590Y9l) map, (Map<String, ? extends C0Y3O>) c0y3i, (C0Y3I) z, false));
    }

    @Override // X.InterfaceC603530Nln
    public final void LIZIZ(C869590Y9l c869590Y9l, Map<String, ? extends C0Y3O> map, C0Y3I c0y3i, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        if (LJIIL(c869590Y9l, interfaceC863600XuI)) {
            return;
        }
        if (LJIIJ()) {
            LJIIIIZZ(this, c869590Y9l.getUuid(), z, c0y3i, interfaceC863600XuI, new AwS380S0200000_14((Map) map, (Map<String, ? extends C0Y3O>) this, (C0Y3J) 84));
            return;
        }
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        for (Map.Entry<String, ? extends C0Y3O> entry : map.entrySet()) {
            localExt.put(entry.getKey(), LJIILIIL(entry.getValue()));
        }
        LJIIJJI(c869590Y9l, c0y3i, z, interfaceC863600XuI);
    }

    @Override // X.InterfaceC603530Nln
    public final void LIZLLL(C869590Y9l c869590Y9l, String str, C0Y3R c0y3r, C0Y3I c0y3i, boolean z) {
        if (LJIIL(c869590Y9l, null)) {
            return;
        }
        if (LJIIJ()) {
            LJIIIIZZ(this, c869590Y9l.getUuid(), z, c0y3i, null, new AwS98S1200000_14(str, this, c0y3r, 10));
        } else {
            c869590Y9l.getLocalExt().put(str, LJIILIIL(c0y3r));
            LJIIJJI(c869590Y9l, c0y3i, z, null);
        }
    }

    @Override // X.InterfaceC603530Nln
    @InterfaceC1294060jmO
    public final Object LJI(C869590Y9l c869590Y9l, Set<String> set, C0Y3I c0y3i, boolean z, InterfaceC1364105Vn<? super C0Y6Q<C869590Y9l>> interfaceC1364105Vn) {
        return C867000Xzm.LIZ(interfaceC1364105Vn, new AwS7S0410000_9((InterfaceC603530Nln) this, (InterfaceC603530Nln) c869590Y9l, (C869590Y9l) set, (Set<String>) c0y3i, (C0Y3I) z, true));
    }

    @Override // X.InterfaceC603530Nln
    public final void LJII(C869590Y9l c869590Y9l, Set<String> set, C0Y3I c0y3i, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        if (LJIIL(c869590Y9l, interfaceC863600XuI)) {
            return;
        }
        if (LJIIJ()) {
            LJIIIIZZ(this, c869590Y9l.getUuid(), z, c0y3i, interfaceC863600XuI, new AwS581S0100000_2((Set) set, (Set<String>) 425));
        } else {
            c869590Y9l.getLocalExt().keySet().removeAll(set);
            LJIIJJI(c869590Y9l, c0y3i, z, interfaceC863600XuI);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Y3L] */
    public static void LJIIIIZZ(C0Y3J c0y3j, final String str, final boolean z, final C0Y3I c0y3i, final InterfaceC863600XuI interfaceC863600XuI, final Function1 function1) {
        final boolean z2 = true;
        c0y3j.getClass();
        if (str != null && str.length() != 0) {
            final C0Y9I c0y9iLJIIIZ = c0y3j.LJIIIZ();
            final ?? r7 = new C0Y3N() { // from class: X.0Y3L
                @Override // X.C0Y3N
                public final void LIZ(Map<String, String> map) {
                    function1.invoke(map);
                }
            };
            C868780Y6i c868780Y6iLIZLLL = c0y9iLJIIIZ.LL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageOperatorModelJava mutateMessageLocalExt uuid:");
            sbLIZ.append(str);
            sbLIZ.append(", refreshConversation:");
            sbLIZ.append(z);
            sbLIZ.append(", notifyObservers:");
            sbLIZ.append(true);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c0y9iLJIIIZ.LL.LJIIJJI().LIZJ(new InterfaceC872410YKh<C869590Y9l>() { // from class: X.0Y3M
                @Override // X.InterfaceC872410YKh
                public final C869590Y9l LIZ() throws Throwable {
                    C869590Y9l c869590Y9lLJJJI = c0y9iLJIIIZ.LLILLJJLI.LJI().LJJJI(str);
                    if (c869590Y9lLJJJI == null) {
                        return null;
                    }
                    atomicBoolean.set(true);
                    if (c869590Y9lLJJJI.invalid()) {
                        return null;
                    }
                    Map<String, String> localExt = c869590Y9lLJJJI.getLocalExt();
                    r7.LIZ(localExt);
                    return z ? c0y9iLJIIIZ.LJ(c869590Y9lLJJJI, true) : c0y9iLJIIIZ.LLILLJJLI.LJI().LJLJJI(c869590Y9lLJJJI, new HashMap(localExt));
                }
            }, new InterfaceC864800XwE<C869590Y9l>() { // from class: X.0XwV
                @Override // X.InterfaceC864800XwE
                public final void LIZ(C869590Y9l c869590Y9l) {
                    int i;
                    if (c869590Y9l != null) {
                        if (z2) {
                            C868200Y4c c868200Y4c = c0y9iLJIIIZ.LL.LJIIZILJ().getDomain().LIZ;
                            C0Y9I c0y9i = c0y9iLJIIIZ;
                            C0Y3I c0y3i2 = c0y3i;
                            c0y9i.getClass();
                            if (c0y3i2 == null) {
                                c0y3i2 = new C0Y3I("MessageOperatorModelJava");
                            }
                            c868200Y4c.LJJIIJZLJL(c0y3i2, Collections.singletonList(c869590Y9l));
                        }
                        InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                        if (interfaceC863600XuI2 != null) {
                            interfaceC863600XuI2.onSuccess(c869590Y9l);
                            return;
                        }
                        return;
                    }
                    if (interfaceC863600XuI == null) {
                        return;
                    }
                    if (atomicBoolean.get()) {
                        i = -1046;
                    } else {
                        i = -1040;
                    }
                    interfaceC863600XuI.LIZIZ(C0YMW.from(C0YIN.LJFF(c0y9iLJIIIZ.LL, i)));
                }
            }, false, c0y9iLJIIIZ.LL.LJIIL().LIZJ());
            return;
        }
        if (interfaceC863600XuI == null) {
            return;
        }
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.code = -1040;
        c0ymw.statusMsg = "Message not found";
        interfaceC863600XuI.LIZIZ(c0ymw);
    }
}
