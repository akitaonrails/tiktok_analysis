package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876680YaI implements InterfaceC876750YaP {
    public static final /* synthetic */ int LJI = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C876510Ya1(this));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C876560Ya6(this));
    public final C876720YaM LIZJ;
    public final C876800YaU LIZLLL;
    public final C11NJ LJ;
    public final InterfaceC876710YaL LJFF;

    public final C879090YeB LIZIZ() {
        return (C879090YeB) this.LIZIZ.getValue();
    }

    public final C0Z2O LIZJ() {
        return (C0Z2O) this.LIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0YaY] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.05q7, X.0XzV] */
    public C876680YaI() {
        C876720YaM c876720YaM = new C876720YaM();
        this.LIZJ = c876720YaM;
        this.LIZLLL = new C876800YaU(c876720YaM);
        C11NJ c11nj = new C11NJ();
        this.LJ = c11nj;
        InterfaceC876710YaL interfaceC876710YaL = new InterfaceC876710YaL(this) { // from class: X.0YaO
            public final Keva LIZ = Keva.getRepo("keva_repo_im_notification");
            public final C01GW LIZIZ;

            @Override // X.InterfaceC876710YaL
            public final boolean LIZJ() {
                C876900Yae c876900Yae = C876900Yae.LIZ;
                return !((IIMChatRoomService) C876900Yae.LJI.getValue()).LJ(C876900Yae.LIZIZ()) && C19212010Ec.LIZJ.LJJIJIIJI();
            }

            @Override // X.InterfaceC876710YaL
            public final C876390YZp LJFF() {
                return (C876390YZp) this.LIZIZ.getValue();
            }

            @Override // X.InterfaceC876710YaL
            public final Keva LIZ() {
                return this.LIZ;
            }

            {
                this.LIZIZ = C452501pT.LIZIZ(new C876480YZy(this));
            }

            public static final void LJI(InterfaceC876750YaP interfaceC876750YaP) {
                C876900Yae c876900Yae = C876900Yae.LIZ;
                ((ArrayList) C876900Yae.LJ).add(interfaceC876750YaP);
            }

            @Override // X.InterfaceC876710YaL
            public final void LIZIZ(C876680YaI c876680YaI) {
                ArrayList arrayList = (ArrayList) C876900Yae.LJ;
                if (arrayList.contains(c876680YaI)) {
                    arrayList.remove(c876680YaI);
                }
            }

            @Override // X.InterfaceC876710YaL
            public final boolean LIZLLL(boolean z) {
                C876900Yae c876900Yae = C876900Yae.LIZ;
                return C876900Yae.LJ(z);
            }

            @Override // X.InterfaceC876710YaL
            public final void LJ(int i, String str, String str2) {
                C876900Yae.LIZ.LJI(i, str, str2);
            }
        };
        this.LJFF = interfaceC876710YaL;
        c11nj.LIZ(C1906580ziK.LIZJ().LJIIJ().LJJLJLI(new C09JN() { // from class: X.0YaK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMInnerPushManager@1506.subscribeToAppStateChanges$1");
                this.LL.LJFF.LJ(0, C876680YaI.class.getName(), "activity_resume");
                C1C7U.LIZIZ("IMInnerPushManager@1506.subscribeToAppStateChanges$1");
            }
        }));
        c11nj.LIZ(C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0YaJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMInnerPushManager@1506.subscribeToAppStateChanges$3");
                if (((C606810Nr5) obj).LIZIZ) {
                    this.LL.LJFF.LJ(1, C876680YaI.class.getName(), "to_background");
                } else {
                    this.LL.LJ(1000L);
                }
                C1C7U.LIZIZ("IMInnerPushManager@1506.subscribeToAppStateChanges$3");
            }
        }));
        C876740YaO.LJI(this);
        final C876390YZp c876390YZpLJFF = interfaceC876710YaL.LJFF();
        if (c876390YZpLJFF != null) {
            c876390YZpLJFF.LJI = new C0Y6L() { // from class: X.0YaY
                public final Map<String, C0Y8T> LL = new LinkedHashMap();
                public boolean LLILLJJLI;

                @Override // X.C0Y6L
                public final void LIZ() {
                }

                @Override // X.C0Y6L
                @InterfaceC1294060jmO
                public final void LIZJ() {
                }

                @Override // X.C0Y6L
                public final void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
                    boolean z;
                    List listLJLLLL;
                    if (this.LLILLJJLI) {
                        return;
                    }
                    IMChatListApi.LJJIII.getClass();
                    InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
                    if (interfaceC882680YjyLJJIL != null && !interfaceC882680YjyLJJIL.LJIIIIZZ(c0y6x.LIZ.LIZ)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = !z;
                    if (C310690CFv.LIZ().mergeUnreadMUFInInnerPush || z2) {
                        Map<String, C0Y8T> map = this.LL;
                        List<C0Y8T> list = c0y6x.LIZIZ;
                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                        if (iLIZIZ < 16) {
                            iLIZIZ = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                        for (C0Y8T c0y8t : list) {
                            linkedHashMap.put(c0y8t.getConversationId(), c0y8t);
                        }
                        map.putAll(linkedHashMap);
                        if (z2) {
                            if (C310690CFv.LIZ().mergeUnreadMUFInInnerPush) {
                                Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJLIIIL = C19212010Ec.LIZJ.LJLIIIL();
                                final FilterTabType first = pairLJLIIIL.getFirst();
                                final Set<EnumC880480YgQ> second = pairLJLIIIL.getSecond();
                                Map<String, C0Y8T> map2 = this.LL;
                                ArrayList arrayList = new ArrayList(map2.size());
                                Iterator it2 = ((LinkedHashMap) map2).entrySet().iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((Map.Entry) it2.next()).getValue());
                                }
                                listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0YaZ
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        IMChatListApi.LJJIII.getClass();
                                        return C20085613iQ.LIZIZ(C890330YwJ.LIZ().LJJJ().LIZ(((C0Y8T) t2).getConversationId(), first, new C876860Yaa(second)), C890330YwJ.LIZ().LJJJ().LIZ(((C0Y8T) t).getConversationId(), first, new C876860Yaa(second)));
                                    }
                                }, arrayList);
                            } else {
                                Map<String, C0Y8T> map3 = this.LL;
                                ArrayList arrayList2 = new ArrayList(map3.size());
                                Iterator it3 = ((LinkedHashMap) map3).entrySet().iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((Map.Entry) it3.next()).getValue());
                                }
                                listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.05sl
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        long index;
                                        C869590Y9l lastShowMessage = ((C0Y8T) t2).getLastShowMessage();
                                        long index2 = 0;
                                        if (lastShowMessage != null) {
                                            index = lastShowMessage.getIndex();
                                        } else {
                                            index = 0;
                                        }
                                        Long lValueOf = Long.valueOf(index);
                                        C869590Y9l lastShowMessage2 = ((C0Y8T) t).getLastShowMessage();
                                        if (lastShowMessage2 != null) {
                                            index2 = lastShowMessage2.getIndex();
                                        }
                                        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(index2));
                                    }
                                }, arrayList2);
                            }
                            C876390YZp c876390YZp = c876390YZpLJFF;
                            C23250099c.LIZLLL(c876390YZp.LJIIIIZZ, null, null, new C876350YZl(c876390YZp, listLJLLLL, null), 3);
                            ((LinkedHashMap) this.LL).clear();
                            this.LLILLJJLI = true;
                            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIL(this);
                        }
                    }
                }
            };
            ?? r1 = new C1475605q6() { // from class: X.05q7
                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJLJI(int i, C0Y8T c0y8t) {
                    if (i == 3 && c0y8t != null && c0y8t.getUnreadCount() == 0) {
                        C23250099c.LIZLLL(c876390YZpLJFF.LJIIIIZZ, null, null, new C05JM(c0y8t, null), 3);
                    }
                }
            };
            c876390YZpLJFF.LJ = r1;
            C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
            C0YSQ.LIZIZ(c0ysq).LJI(r1);
            C876840YaY c876840YaY = c876390YZpLJFF.LJI;
            if (c876840YaY != null) {
                C0YSQ.LIZIZ(c0ysq).LJJIFFI(c876840YaY);
            }
            long j = C876390YZp.LJIIIZ;
            if (c876390YZpLJFF.LIZLLL != null) {
                C23250099c.LIZLLL(c876390YZpLJFF.LJIIIIZZ, null, null, new C876450YZv(j, c876390YZpLJFF, null), 3);
            }
            C23250099c.LIZLLL(c876390YZpLJFF.LJIIIIZZ, null, null, new C0YZG(j, c876390YZpLJFF, null), 3);
        }
    }

    @Override // X.InterfaceC876750YaP
    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C879090YeB c879090YeBLIZIZ = LIZIZ();
                    EnumC1989807qq enumC1989807qq = EnumC1989807qq.TURN_TO_DISCARD;
                    c879090YeBLIZIZ.LIZJ(enumC1989807qq);
                    LIZIZ().LIZLLL(enumC1989807qq);
                    return;
                }
                return;
            }
            if (!C1906580ziK.LJI()) {
                return;
            }
            LIZIZ().LIZLLL(EnumC1989807qq.TURN_TO_BG);
            return;
        }
        LJ(1000L);
    }

    public final void LJ(long j) {
        if (!LIZIZ().LJIIL()) {
            C1908480zlO.LIZIZ.LJFF(j);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0NKG(j, this, null), 3);
    }

    public static void LJI(C876680YaI c876680YaI, List list) {
        long index;
        long index2;
        synchronized (c876680YaI) {
            if (list != null) {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                    if (c869590Y9l != null) {
                        index = c869590Y9l.getIndex();
                    } else {
                        index = Long.MIN_VALUE;
                    }
                    Long lValueOf = Long.valueOf(index);
                    while (it2.hasNext()) {
                        C869590Y9l c869590Y9l2 = (C869590Y9l) it2.next();
                        if (c869590Y9l2 != null) {
                            index2 = c869590Y9l2.getIndex();
                        } else {
                            index2 = Long.MIN_VALUE;
                        }
                        Long lValueOf2 = Long.valueOf(index2);
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                    if (lValueOf != null && lValueOf.longValue() > c876680YaI.LJFF.LIZ().getLong("index_of_latest_message_consumed_by_push", Long.MIN_VALUE)) {
                        c876680YaI.LJFF.LIZ().storeLong("index_of_latest_message_consumed_by_push", lValueOf.longValue());
                    }
                }
            }
        }
    }

    public final void LIZLLL(EnumC876540Ya4 enumC876540Ya4, long j) {
        int i = C876530Ya3.LIZ[enumC876540Ya4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZJ.LJ = SystemClock.elapsedRealtime() - j;
                    return;
                }
                return;
            }
            this.LIZJ.LIZLLL = SystemClock.elapsedRealtime() - j;
            return;
        }
        this.LIZJ.LIZ = SystemClock.elapsedRealtime() - j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (X.C19328310jZ.LIZIZ.LJFF() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C869590Y9l> LJFF(java.util.List<? extends X.C869590Y9l> r9, X.EnumC876540Ya4 r10) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C876680YaI.LJFF(java.util.List, X.0Ya4):java.util.List");
    }
}
