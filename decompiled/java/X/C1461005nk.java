package X;

import Y.ACallableS410S0100000_2;
import Y.AfS32S1000000_2;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.05nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1461005nk implements C0Z2F {
    public static final C1461005nk LIZ = new C1461005nk();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<C05QR>> LIZIZ = new ConcurrentHashMap<>();
    public static final LruCache<String, ConcurrentHashMap<String, C1462005nu>> LIZJ = new LruCache<>(50);
    public static final LruCache<String, List<C1462005nu>> LIZLLL = new LruCache<>(50);
    public static final LruCache<String, List<C1462005nu>> LJ = new LruCache<>(50);
    public static final ConcurrentHashMap<String, AbstractC879060Ye8> LJFF = new ConcurrentHashMap<>();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1414));

    public static Set LJII(String str) {
        List<C1462005nu> list = LIZLLL.get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1462005nu> it2 = list.iterator();
            while (it2.hasNext()) {
                String uid = it2.next().getUid();
                if (uid != null) {
                    arrayList.add(uid);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    public static final int LJIIIIZZ(String str) {
        C0YAE member;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (member = c0y8tLIZ.getMember()) != null) {
            return member.getRole();
        }
        return -1;
    }

    @Override // X.C0Z2F
    public final int LIZLLL(C0Y8T c0y8t) {
        List<C1462005nu> list;
        if (c0y8t == null || (list = LIZLLL.get(c0y8t.getConversationId())) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (C1462005nu c1462005nu : list) {
            C0YAE member = c1462005nu.getMember();
            if (member != null && member.getRole() == C0Z9N.ADMIN.getValue()) {
                arrayList.add(c1462005nu);
            }
        }
        return arrayList.size();
    }

    @Override // X.C0Z2F
    public final void LIZJ(String str, C05QR c05qr) {
        CopyOnWriteArraySet<C05QR> copyOnWriteArraySet = LIZIZ.get(str);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(c05qr);
        }
    }

    @Override // X.C0Z2F
    public final void LJ(String str, C05QR c05qr) {
        ConcurrentHashMap<String, CopyOnWriteArraySet<C05QR>> concurrentHashMap = LIZIZ;
        CopyOnWriteArraySet<C05QR> copyOnWriteArraySet = concurrentHashMap.get(str);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        }
        copyOnWriteArraySet.add(c05qr);
        concurrentHashMap.put(str, copyOnWriteArraySet);
    }

    @Override // X.C0Z2F
    public final int LJFF(Long l, String str) {
        List<C1462005nu> list;
        Object objValueOf;
        C0YAE member;
        if (str == null || (list = LIZLLL.get(str)) == null) {
            return -1;
        }
        Iterator<C1462005nu> it2 = list.iterator();
        while (true) {
            objValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            C1462005nu next = it2.next();
            C0YAE member2 = next.getMember();
            if (member2 != null) {
                objValueOf = Long.valueOf(member2.getUid());
            }
            if (Intrinsics.LJFF(objValueOf, l)) {
                objValueOf = next;
                break;
            }
        }
        C1462005nu c1462005nu = (C1462005nu) objValueOf;
        if (c1462005nu == null || (member = c1462005nu.getMember()) == null) {
            return -1;
        }
        return member.getRole();
    }

    public static void LJIIJ(C05QT c05qt, String str, List list) {
        List<C1462005nu> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.05nn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer numValueOf;
                C1462005nu c1462005nu = (C1462005nu) obj2;
                C0YAE member = ((C1462005nu) obj).getMember();
                Integer numValueOf2 = null;
                if (member != null) {
                    numValueOf = Integer.valueOf(member.getRole());
                } else {
                    numValueOf = null;
                }
                int iLIZ = C1461605nq.LIZ(numValueOf);
                C0YAE member2 = c1462005nu.getMember();
                if (member2 != null) {
                    numValueOf2 = Integer.valueOf(member2.getRole());
                }
                return iLIZ - C1461605nq.LIZ(numValueOf2);
            }
        }, list);
        LIZLLL.put(str, listLJLLLL);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 23))), null, null, new C05BC(str, null), 3);
        CopyOnWriteArraySet<C05QR> copyOnWriteArraySet = LIZIZ.get(str);
        if (copyOnWriteArraySet != null) {
            Iterator<C05QR> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().Ys1(c05qt, str, listLJLLLL);
            }
        }
        ConcurrentHashMap<String, C1462005nu> concurrentHashMap = new ConcurrentHashMap<>();
        for (C1462005nu c1462005nu : listLJLLLL) {
            String uid = c1462005nu.getUid();
            if (uid == null) {
                uid = "";
            }
            concurrentHashMap.put(uid, c1462005nu);
        }
        LIZJ.put(str, concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.05nu] */
    @Override // X.C0Z2F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1462005nu LIZIZ(X.EnumC1461905nt r12, X.C1461805ns r13, final X.InterfaceC1461705nr r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1461005nk.LIZIZ(X.05nt, X.05ns, X.05nr):X.05nu");
    }

    public final boolean LJIIIZ(C0Y8T c0y8t, Long l, boolean z) {
        List listLJLIL;
        Long lValueOf;
        C0YAE member;
        if (c0y8t == null) {
            return false;
        }
        long jLIZJ = C461720I8s.LIZJ();
        int role = -1;
        if (l != null && l.longValue() == jLIZJ) {
            C0YAE member2 = c0y8t.getMember();
            if (member2 != null) {
                role = member2.getRole();
            }
            if (role != C0Z9N.OWNER.getValue() && role != C0Z9N.ADMIN.getValue()) {
                return false;
            }
            return true;
        }
        long owner = c0y8t.getCoreInfo().getOwner();
        if (l != null && l.longValue() == owner) {
            return true;
        }
        int iLJFF = LJFF(l, c0y8t.getConversationId());
        if (iLJFF != -1) {
            if (iLJFF != C0Z9N.OWNER.getValue() && iLJFF != C0Z9N.ADMIN.getValue()) {
                return false;
            }
            return true;
        }
        String conversationId = c0y8t.getConversationId();
        List<C1462005nu> list = LIZLLL.get(conversationId);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C1462005nu c1462005nu : list) {
                C1462005nu c1462005nu2 = c1462005nu;
                C0YAE member3 = c1462005nu2.getMember();
                if ((member3 != null && member3.getRole() == C0Z9N.ADMIN.getValue()) || ((member = c1462005nu2.getMember()) != null && member.getRole() == C0Z9N.OWNER.getValue())) {
                    arrayList.add(c1462005nu);
                }
            }
            List<C1462005nu> list2 = LJ.get(conversationId);
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            listLJLIL = C13LP.LJLIL(list2, arrayList);
        } else {
            listLJLIL = null;
        }
        if (C866950Xzh.LIZIZ(listLJLIL)) {
            if (listLJLIL == null) {
                return false;
            }
            for (Object obj : listLJLIL) {
                C0YAE member4 = ((C1462005nu) obj).getMember();
                if (member4 != null) {
                    lValueOf = Long.valueOf(member4.getUid());
                } else {
                    lValueOf = null;
                }
                if (Intrinsics.LJFF(lValueOf, l)) {
                    if (obj == null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1366805Wo(c0y8t.getConversationId(), null), 3);
        }
        return false;
    }

    public static void LJI(String str, List list, AbstractC2252651DEx abstractC2252651DEx, AbstractC2252651DEx abstractC2252651DEx2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(abstractC2252651DEx.plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 22))), null, null, new C05QP(list, abstractC2252651DEx2, str, null), 3);
    }

    @Override // X.C0Z2F
    public final void LIZ(String str, C05QR c05qr, AbstractC2252651DEx abstractC2252651DEx, AbstractC2252651DEx abstractC2252651DEx2) {
        C05QR c05qr2;
        List<C1462005nu> list = LIZLLL.get(str);
        Integer numValueOf = null;
        if (c05qr != null) {
            final WeakReference weakReference = new WeakReference(c05qr);
            c05qr2 = new C05QR() { // from class: X.05iF
                @Override // X.C05QR
                public final void WB2(String str2) {
                    C05QR c05qr3 = weakReference.get();
                    if (c05qr3 != null) {
                        c05qr3.WB2(str2);
                    }
                }

                @Override // X.C05QR
                public final void Ys1(C05QT c05qt, String str2, List list2) {
                    C05QR c05qr3 = weakReference.get();
                    if (c05qr3 != null) {
                        c05qr3.Ys1(c05qt, str2, list2);
                    } else {
                        C1461005nk.LIZ.LIZJ(str2, this);
                    }
                }
            };
            LJ(str, c05qr2);
        } else {
            c05qr2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGroupMemberList conversation id = ");
        sbLIZ.append(str);
        sbLIZ.append(" cache size = ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && !list.isEmpty()) {
            LJI(str, list, abstractC2252651DEx, abstractC2252651DEx2);
            if (c05qr2 != null) {
                c05qr2.Ys1(C05QT.READ_FROM_CACHE, str, list);
                return;
            }
            return;
        }
        ConcurrentHashMap<String, AbstractC879060Ye8> concurrentHashMap = LJFF;
        AbstractC879060Ye8 abstractC879060Ye8 = concurrentHashMap.get(str);
        AbstractC879060Ye8 abstractC879060Ye82 = abstractC879060Ye8;
        if (abstractC879060Ye8 == null) {
            C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
            final String str2 = c866530Xz1LIZIZ.LIZIZ;
            c866530Xz1LIZIZ.LJIIJJI(new InterfaceC866850XzX() { // from class: X.05Wk
                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LLIIII(int i, String str3) {
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LLIILZL(int i, String str3, List list2) {
                }

                @Override // X.InterfaceC868050Y3n
                public final int LLLIIII() {
                    return -100;
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJJJJJL(C0Y8T c0y8t) {
                    String conversationId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDissolveConversation, conversationId = ");
                    if (c0y8t != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C23250099c.LIZLLL((InterfaceC497601wk) C05B9.LIZIZ.getValue(), new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 16), null, new C05B3(str2, null), 2);
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJJLIIIJ(C0Y8T c0y8t) {
                    String conversationId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDeleteConversation, conversationId = ");
                    if (c0y8t != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJJLJLI(List<C0YAE> list2) {
                    Integer numValueOf2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onRemoveMember, list.size = ");
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1461005nk c1461005nk = C1461005nk.LIZ;
                    String str3 = str2;
                    c1461005nk.getClass();
                    if (str3 != null && str3.length() != 0 && list2 != null && !list2.isEmpty()) {
                        List<C1462005nu> list3 = C1461005nk.LIZLLL.get(str3);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list3) {
                            if (!C13LP.LJJJJ(((C1462005nu) obj).getMember(), list2)) {
                                arrayList.add(obj);
                            }
                        }
                        C1461005nk c1461005nk2 = C1461005nk.LIZ;
                        C05QT c05qt = C05QT.REMOVE_MEMBER;
                        c1461005nk2.getClass();
                        C1461005nk.LJIIJ(c05qt, str3, arrayList);
                    }
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJJLL(final List<C0YAE> list2) {
                    Integer numValueOf2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onAddMember, list.size = ");
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1461005nk c1461005nk = C1461005nk.LIZ;
                    String str3 = str2;
                    c1461005nk.getClass();
                    if (list2 != null && !list2.isEmpty()) {
                        List<C1462005nu> list3 = C1461005nk.LIZLLL.get(str3);
                        if (list3 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                        final ArrayList arrayList = new ArrayList(list3);
                        final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((BaseContact) it2.next()).getUid());
                        }
                        ((C11NJ) C1461005nk.LJI.getValue()).LIZ(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.05Wl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("GroupMemberUtil@7ee8.addMemberToCache$1");
                                List<C0YAE> list4 = list2;
                                List<String> list5 = arrayList2;
                                List<C1462005nu> list6 = arrayList;
                                for (C0YAE c0yae : list4) {
                                    if (!list5.contains(String.valueOf(c0yae.getUid()))) {
                                        C1462005nu c1462005nu = new C1462005nu(String.valueOf(c0yae.getUid()), c0yae.getSecUid());
                                        c1462005nu.setMember(c0yae);
                                        list6.add(c1462005nu);
                                    }
                                }
                                List<C1462005nu> list7 = arrayList;
                                C1C7U.LIZIZ("GroupMemberUtil@7ee8.addMemberToCache$1");
                                return list7;
                            }
                        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS32S1000000_2(str3, 4), new C09JN() { // from class: X.00PP
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("GroupMemberUtil@7ee8.addMemberToCache$3");
                                C1C7U.LIZIZ("GroupMemberUtil@7ee8.addMemberToCache$3");
                            }
                        }));
                    }
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJJZZI(List<C0YAE> list2) {
                    Integer numValueOf2;
                    List<C1462005nu> list3;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUpdate, list.size = ");
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1461005nk c1461005nk = C1461005nk.LIZ;
                    String str3 = str2;
                    c1461005nk.getClass();
                    if (str3 != null && str3.length() != 0 && list2 != null && !list2.isEmpty() && (list3 = C1461005nk.LIZLLL.get(str3)) != null) {
                        for (C1462005nu c1462005nu : list3) {
                            int iIndexOf = list2.indexOf(c1462005nu.getMember());
                            if (iIndexOf > -1) {
                                c1462005nu.setMember((C0YAE) ListProtector.get(list2, iIndexOf));
                            }
                        }
                        C1461005nk c1461005nk2 = C1461005nk.LIZ;
                        C05QT c05qt = C05QT.UPDATE_MEMBER;
                        c1461005nk2.getClass();
                        C1461005nk.LJIIJ(c05qt, str3, list3);
                    }
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJLILLLLZI(C0Y8T c0y8t) {
                    String conversationId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onCreateConversation, conversationId = ");
                    if (c0y8t != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJLL(C1711306n1 c1711306n1) {
                    String conversationId;
                    C0Y8T c0y8t;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onSyncConversation, conversationId = ");
                    if (c1711306n1 != null && (c0y8t = c1711306n1.LIZIZ) != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJZI(C0Y8T c0y8t) {
                    String conversationId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLeaveConversation, conversationId = ");
                    if (c0y8t != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1461005nk.LIZLLL.remove(str2);
                    C1461005nk.LIZJ.remove(str2);
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJLI(String str3, List<C0YAE> list2) {
                    ArrayList arrayList;
                    if (list2 != null) {
                        list2.size();
                        arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C0YAE> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().getUid()));
                        }
                    } else {
                        arrayList = null;
                    }
                    Objects.toString(arrayList);
                    C1461005nk.LIZ.getClass();
                    if (list2 != null && (!list2.isEmpty())) {
                        ((C11NJ) C1461005nk.LJI.getValue()).LIZ(AbstractC19484711Kz.LJIJI(new ACallableS410S0100000_2(list2, 18)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS32S1000000_2(str3, 5), new C09JN() { // from class: X.00PQ
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("GroupMemberUtil@7ee8.fetchMemberInfo$3");
                                C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchMemberInfo$3");
                            }
                        }));
                    }
                }

                @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
                public final void LJLJI(int i, C0Y8T c0y8t) {
                    String conversationId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUpdateConversation, conversationId = ");
                    if (c0y8t != null) {
                        conversationId = c0y8t.getConversationId();
                    } else {
                        conversationId = null;
                    }
                    sbLIZ2.append(conversationId);
                    sbLIZ2.append(" reason = ");
                    sbLIZ2.append(i);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            });
            concurrentHashMap.put(str, c866530Xz1LIZIZ);
            abstractC879060Ye82 = c866530Xz1LIZIZ;
        }
        abstractC879060Ye82.LJIIJ(new C1769306wN(abstractC2252651DEx, 9));
    }
}
