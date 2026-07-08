package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS2S1410000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878590YdN implements InterfaceC884250YmV {
    public static C878650YdT LJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(359));
    public final ConcurrentHashMap<C877540Ybg, C0Y9E> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1310));
    public final String LIZLLL = "MessageRequestListDataSource";

    @Override // X.InterfaceC884250YmV
    public final void LJII(InterfaceC878560YdK interfaceC878560YdK) {
    }

    @Override // X.InterfaceC884250YmV
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIJJI(InterfaceC878560YdK interfaceC878560YdK) {
    }

    @Override // X.InterfaceC884250YmV
    public final void init() {
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZJ() {
        for (Map.Entry<C877540Ybg, C0Y9E> entry : this.LIZIZ.entrySet()) {
            entry.getKey().LJ.LJIIIZ(entry.getValue());
        }
        this.LIZIZ.clear();
        LJ = null;
    }

    @Override // X.InterfaceC884250YmV
    public final ConcurrentHashMap<InterfaceC878560YdK, CopyOnWriteArrayList<InterfaceC878540YdI>> LJIILL() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIILIIL() {
        LJIILL().clear();
    }

    @Override // X.InterfaceC884250YmV
    public final String getTag() {
        return this.LIZLLL;
    }

    public static Map LIZ(C877540Ybg c877540Ybg) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<InterfaceC878620YdQ> set = c877540Ybg.LJFF;
            if (set != null) {
                for (InterfaceC878620YdQ interfaceC878620YdQ : set) {
                    if (interfaceC878620YdQ.LJIIIIZZ(c877540Ybg)) {
                        interfaceC878620YdQ.getType();
                        linkedHashMap.put("message_request_spam", interfaceC878620YdQ.LJIIL(c877540Ybg));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public static C877600Ybm LIZIZ(EnumC880520YgU enumC880520YgU) {
        if (enumC880520YgU == EnumC880520YgU.PRIORITY) {
            return new C877600Ybm((AbstractC877620Ybo) new C877630Ybp(Double.MAX_VALUE), 2);
        }
        return new C877600Ybm((AbstractC877620Ybo) null, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C879540Yeu LJIIJ(X.C0Y8T r4) {
        /*
            X.0Y8Y r1 = r4.getCoreInfo()
            java.lang.String r3 = "a:msg_req_type"
            r0 = 0
            if (r1 == 0) goto L56
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r1.get(r3)
        L13:
            java.lang.String r2 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r1 != 0) goto L31
            X.0Y9l r1 = r4.getLastShowMessage()
            if (r1 == 0) goto L2b
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L2b
            java.lang.Object r0 = r1.get(r3)
        L2b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L45
        L31:
            X.068s r0 = com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r1 = X.C15596068s.LIZ()
            if (r1 == 0) goto L45
            java.lang.String r0 = r4.getConversationId()
            X.0693 r1 = (X.AnonymousClass0693) r1
            r1.LJIIJ(r0)
        L45:
            X.0YdR r2 = new X.0YdR
            java.lang.String r0 = r4.getConversationId()
            r2.<init>(r0)
            X.06mj r1 = X.C1709506mj.INSTANCE
            X.0Yeu r0 = new X.0Yeu
            r0.<init>(r1, r2, r4)
            return r0
        L56:
            r1 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878590YdN.LJIIJ(X.0Y8T):X.0Yeu");
    }

    @Override // X.InterfaceC884250YmV
    public final void LJ(InterfaceC878560YdK interfaceC878560YdK) {
        if (!(interfaceC878560YdK instanceof C877540Ybg)) {
            return;
        }
        C0Y9E c0y9eRemove = this.LIZIZ.remove(interfaceC878560YdK);
        if (c0y9eRemove != null) {
            ((C877540Ybg) interfaceC878560YdK).LJ.LJIIIZ(c0y9eRemove);
        }
        Set<InterfaceC878620YdQ> set = ((C877540Ybg) interfaceC878560YdK).LJFF;
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC878620YdQ) it2.next()).LJI((C878610YdP) this.LIZJ.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YdO, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v1 X.0Ybg
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // X.InterfaceC884250YmV
    public final void LJIIIZ(X.InterfaceC878560YdK r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C877540Ybg
            if (r0 != 0) goto L5
            return
        L5:
            r2 = r4
            X.0Ybg r2 = (X.C877540Ybg) r2
            X.0YdO r1 = new X.0YdO
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap<X.0Ybg, X.0Y9E> r0 = r3.LIZIZ
            r0.put(r4, r1)
            X.0YUD r0 = r2.LJ
            r0.LJIIIIZZ(r1)
            java.util.Set<X.0YdQ> r0 = r2.LJFF
            if (r0 == 0) goto L37
            java.util.Iterator r2 = r0.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r2.next()
            X.0YdQ r1 = (X.InterfaceC878620YdQ) r1
            X.01GW r0 = r3.LIZJ
            java.lang.Object r0 = r0.getValue()
            X.0YdP r0 = (X.C878610YdP) r0
            r1.LJIIJ(r0)
            goto L1f
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878590YdN.LJIIIZ(X.0YdK):void");
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIL(InterfaceC878560YdK interfaceC878560YdK) {
        C878580YdM.LIZIZ(this, interfaceC878560YdK);
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZLLL(InterfaceC878560YdK interfaceC878560YdK, List<? extends InterfaceC878540YdI> list) {
        C878580YdM.LIZ(this, interfaceC878560YdK, list);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJFF(InterfaceC878560YdK interfaceC878560YdK, String str) {
        if (!(interfaceC878560YdK instanceof C877540Ybg)) {
            return;
        }
        C877540Ybg c877540Ybg = (C877540Ybg) interfaceC878560YdK;
        Pair<List<C0Y8T>, Boolean> pairLJ = c877540Ybg.LJ.LJ();
        List<C0Y8T> first = pairLJ.getFirst();
        boolean zBooleanValue = pairLJ.getSecond().booleanValue();
        if ((!first.isEmpty()) && C880690Ygl.LIZIZ(c877540Ybg.LIZ.LLILLL)) {
            LJIILJJIL(c877540Ybg, new C0Y9D(C877570Ybj.LIZ(c877540Ybg.LIZ, "MessageRequestListDataSource:batch_update_reuse"), zBooleanValue, first));
        } else {
            c877540Ybg.LJ.LJI(c877540Ybg.LIZLLL, c877540Ybg.LIZ(C877570Ybj.LIZ(c877540Ybg.LIZ, "MessageRequestListDataSource:batch_update_refresh"), LIZIZ(c877540Ybg.LIZ.LLILLL)));
        }
        if (C880690Ygl.LIZIZ(c877540Ybg.LIZ.LLILLL) && C0CYO.LIZJ.LJIIIIZZ()) {
            c877540Ybg.LJ.LJII(Collections.singleton(EnumC879080YeA.MESSAGE_REQUEST_SPAM.getValue()));
        }
    }

    public final void LJIILJJIL(C877540Ybg c877540Ybg, C0Y9D c0y9d) {
        C877600Ybm c877600YbmLIZIZ;
        Object next;
        String strLJJJJZ;
        long jLongValue;
        Long lLJIILIIL;
        double dDoubleValue;
        Double dLJII;
        C877570Ybj c877570Ybj = c877540Ybg.LIZJ;
        String str = c0y9d.LIZ;
        C878960Ydy c878960Ydy = c877540Ybg.LIZ;
        c877570Ybj.getClass();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"#"}, 0, 6);
        if ((listLJJLIIIJILLIZJL instanceof Collection) && listLJJLIIIJILLIZJL.isEmpty()) {
            return;
        }
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), c878960Ydy.toString())) {
                if (C880690Ygl.LIZIZ(c877540Ybg.LIZ.LLILLL)) {
                    C879050Ye7.LIZ.LIZ("fetch_data_from_db_end");
                }
                C0Y8T c0y8t = (C0Y8T) C13LP.LJJLIIIJL(c0y9d.LIZIZ);
                if (c0y8t != null) {
                    C878960Ydy c878960Ydy2 = c877540Ybg.LIZ;
                    if (c878960Ydy2.LLILLL == EnumC880520YgU.PRIORITY) {
                        String conversationId = c0y8t.getConversationId();
                        EnumC877690Ybv.Companion.getClass();
                        String strLJFF = C0YNP.LJFF(conversationId, C877700Ybw.LIZ().getKey());
                        if (strLJFF != null && (dLJII = C2327809Ae.LJII(strLJFF)) != null) {
                            dDoubleValue = dLJII.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        c877600YbmLIZIZ = new C877600Ybm(new C877630Ybp(dDoubleValue), c0y8t.getConversationShortId());
                    } else if (c878960Ydy2.LLILZ == EnumC877640Ybq.SORT_BY_FOLLOWER_HIGH_TO_LOW) {
                        String strLJFF2 = C0YNP.LJFF(c0y8t.getConversationId(), EnumC877690Ybv.FOLLOWER_NUM.getKey());
                        if (strLJFF2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF2)) != null) {
                            jLongValue = lLJIILIIL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c877600YbmLIZIZ = new C877600Ybm(new C877610Ybn(jLongValue), c0y8t.getConversationShortId());
                    } else {
                        c877600YbmLIZIZ = new C877600Ybm(new C877610Ybn(c0y8t.getUpdatedTime()), c0y8t.getConversationShortId());
                    }
                } else {
                    c877600YbmLIZIZ = LIZIZ(c877540Ybg.LIZ.LLILLL);
                }
                List<C0Y8T> list = c0y9d.LIZIZ;
                boolean z = c0y9d.LIZJ;
                C877570Ybj c877570Ybj2 = c877540Ybg.LIZJ;
                String str2 = c0y9d.LIZ;
                c877570Ybj2.getClass();
                Iterator it3 = a0.LJJLIIIJILLIZJL(str2, new String[]{"#"}, 0, 6).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (u.LJJIIJZLJL((String) next, "a_data_source:", false)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String str3 = (String) next;
                if (str3 == null || (strLJJJJZ = a0.LJJJJZ("a_data_source:", str3)) == null) {
                    strLJJJJZ = "";
                }
                C1729806q0.LIZJ(c877540Ybg.LIZ, new AwS2S1410000_14((List) list, (List<C0Y8T>) this, (C878590YdN) c877540Ybg, (C877540Ybg) strLJJJJZ, (String) z, (boolean) c877600YbmLIZIZ, (C877600Ybm) 1));
                return;
            }
        }
    }

    public final void LJIILLIIL(C877540Ybg c877540Ybg, InterfaceC878540YdI interfaceC878540YdI, boolean z) {
        Object next;
        C879580Yey c879580YeyLJII;
        Map mapLIZ = LIZ(c877540Ybg);
        if (mapLIZ.isEmpty()) {
            if (z) {
                interfaceC878540YdI.LIZIZ(c877540Ybg.LIZ, "MessageRequestListDataSource:fallback_refresh_after_aggregation_data_load");
                return;
            }
            return;
        }
        Set setEntrySet = mapLIZ.entrySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() != null) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List<Map.Entry> list2 = (List) pair.getSecond();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value != null) {
                arrayList3.add(value);
            }
        }
        if (!arrayList3.isEmpty()) {
            interfaceC878540YdI.LIZJ(c877540Ybg.LIZ, arrayList3, arrayList3, this.LIZLLL);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry : list2) {
            Set<InterfaceC878620YdQ> set = c877540Ybg.LJFF;
            if (set != null) {
                Iterator<T> it3 = set.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        ((InterfaceC878620YdQ) next).getType();
                        if (Intrinsics.LJFF("message_request_spam", entry.getKey())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC878620YdQ interfaceC878620YdQ = (InterfaceC878620YdQ) next;
                if (interfaceC878620YdQ != null && (c879580YeyLJII = interfaceC878620YdQ.LJII()) != null) {
                    arrayList4.add(c879580YeyLJII);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            interfaceC878540YdI.LIZ(c877540Ybg.LIZ, arrayList4, arrayList4, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC884250YmV
    public final void LJI(InterfaceC878560YdK interfaceC878560YdK, C877600Ybm c877600Ybm, int i, String str) {
        if (!(interfaceC878560YdK instanceof C877540Ybg)) {
            return;
        }
        C877540Ybg c877540Ybg = (C877540Ybg) interfaceC878560YdK;
        if (c877540Ybg.LJ.LJFF()) {
            return;
        }
        if (!C612090Nzb.LIZ() && c877540Ybg.LIZ.LLILLL == EnumC880520YgU.PRIORITY) {
            return;
        }
        c877540Ybg.LJ.LJI(i, c877540Ybg.LIZ(C877570Ybj.LIZ(c877540Ybg.LIZ, "MessageRequestListDataSource:batch_update_loadmore"), c877600Ybm));
    }
}
