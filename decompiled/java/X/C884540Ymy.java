package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ymy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$fireAccessoryUpdateJob$1", f = "ChatListEngine.kt", l = {745}, m = "invokeSuspend")
public final class C884540Ymy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatListEngine LLILLJJLI;
    public final /* synthetic */ C884270YmX LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884540Ymy(ChatListEngine chatListEngine, C884270YmX c884270YmX, String str, InterfaceC1364105Vn<? super C884540Ymy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatListEngine;
        this.LLILLL = c884270YmX;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884540Ymy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Collection<C879540Yeu<?>> collectionLJJIIZI;
        C1C7U.LIZ("ChatListEngine@4c4f.fireAccessoryUpdateJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.LJIIL.LIZ().LIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListEngine@4c4f.fireAccessoryUpdateJob$1");
                return objLJFF;
            }
        }
        C884690YnD c884690YnD = this.LLILLL.LJ;
        if (c884690YnD != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("source", this.LLILZ);
            Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIJ = this.LLILLL.LJIIJ();
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> it2 = mapLJIIJ.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue(), arrayList);
            }
            pairArr[1] = new Pair("before_filter_size", C2286608xc.LJ(arrayList.size()));
            Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIIZ = this.LLILLL.LJIIIZ();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> it3 = mapLJIIIZ.entrySet().iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getValue(), arrayList2);
            }
            pairArr[2] = new Pair("after_filter_size", C2286608xc.LJ(arrayList2.size()));
            c884690YnD.LIZLLL("fire_accessory_update", C2097608Jq.LJIIIIZZ(pairArr));
        }
        C884270YmX c884270YmX = this.LLILLL;
        if (c884270YmX.LJIIL == null) {
            this.LLILLJJLI.LJIJI(c884270YmX);
        }
        C013C c013c = new C013C();
        String str = this.LLILLJJLI.LIZIZ;
        Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIJ2 = this.LLILLL.LJIIJ();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> it4 = mapLJIIJ2.entrySet().iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJI(it4.next().getValue(), arrayList3);
        }
        arrayList3.size();
        Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIIZ2 = this.LLILLL.LJIIIZ();
        ArrayList arrayList4 = new ArrayList();
        Iterator<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> it5 = mapLJIIIZ2.entrySet().iterator();
        while (it5.hasNext()) {
            C19719612Di.LJJI(it5.next().getValue(), arrayList4);
        }
        arrayList4.size();
        Objects.toString(this.LLILLL.LIZ.getKey());
        C309160C9y.LIZLLL(str);
        Set<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> setEntrySet = this.LLILLL.LJIIJ().entrySet();
        ChatListEngine chatListEngine = this.LLILLJJLI;
        C884270YmX c884270YmX2 = this.LLILLL;
        String str2 = this.LLILZ;
        Iterator<T> it6 = setEntrySet.iterator();
        while (it6.hasNext()) {
            Map.Entry entry = (Map.Entry) it6.next();
            C884710YnF c884710YnF = (C884710YnF) entry.getKey();
            Set set = (Set) entry.getValue();
            ArrayList arrayList5 = new ArrayList();
            Iterator it7 = set.iterator();
            while (it7.hasNext()) {
                C879540Yeu<?> c879540Yeu = c884270YmX2.LJIILIIL().get(it7.next());
                if (c879540Yeu != null) {
                    arrayList5.add(c879540Yeu);
                }
            }
            if (!arrayList5.isEmpty()) {
                c013c.element = z;
                String str3 = c884710YnF.LIZ;
                chatListEngine.LJJIII(c884270YmX2, c884710YnF.LJII, true, arrayList5, str3, false, false);
                if (c884270YmX2.LIZ.LIZLLL().getSecond().LIZ()) {
                    collectionLJJIIZI = chatListEngine.LJJIIZI(c884270YmX2, c884270YmX2.LJIILIIL().values(), str3);
                } else {
                    collectionLJJIIZI = chatListEngine.LJJIIZI(c884270YmX2, arrayList5, str3);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : collectionLJJIIZI) {
                    if (set.contains(((C879540Yeu) obj2).LIZIZ)) {
                        arrayList6.add(obj2);
                    }
                }
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(((C879540Yeu) it8.next()).LIZIZ);
                }
                chatListEngine.LJJII(c884270YmX2, C13LP.LJLLLLLL(set, C13LP.LLIIJI(arrayList7)), str2);
                chatListEngine.LJJI(c884270YmX2, c884710YnF.LJII, true, arrayList6, str3, false, false);
                chatListEngine.LJJIIJZLJL(c884270YmX2, c884710YnF.LJIIIIZZ, true, arrayList6, str3, false, false);
                chatListEngine.LJJIJ(c884270YmX2, arrayList6, str3, false, false);
            }
            z = true;
        }
        Set<Map.Entry<C884710YnF, Set<InterfaceC1491305sd>>> setEntrySet2 = this.LLILLL.LJIIIZ().entrySet();
        ChatListEngine chatListEngine2 = this.LLILLJJLI;
        C884270YmX c884270YmX3 = this.LLILLL;
        Iterator<T> it9 = setEntrySet2.iterator();
        while (it9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it9.next();
            C884710YnF c884710YnF2 = (C884710YnF) entry2.getKey();
            Set set2 = (Set) entry2.getValue();
            ArrayList arrayList8 = new ArrayList();
            Iterator it10 = set2.iterator();
            while (it10.hasNext()) {
                C879540Yeu<?> c879540Yeu2 = c884270YmX3.LJIIIIZZ().get(it10.next());
                if (c879540Yeu2 != null) {
                    arrayList8.add(c879540Yeu2);
                }
            }
            if (!arrayList8.isEmpty()) {
                c013c.element = true;
                String str4 = c884710YnF2.LIZ;
                chatListEngine2.LJJI(c884270YmX3, c884710YnF2.LJII, true, arrayList8, str4, false, false);
                chatListEngine2.LJJIIJZLJL(c884270YmX3, c884710YnF2.LJIIIIZZ, true, arrayList8, str4, false, false);
                chatListEngine2.LJJIJ(c884270YmX3, arrayList8, str4, false, false);
            }
        }
        if (c013c.element) {
            ChatListEngine chatListEngine3 = this.LLILLJJLI;
            C884270YmX c884270YmX4 = this.LLILLL;
            chatListEngine3.LJIL(c884270YmX4, C13LP.LJLLLL(new Comparator() { // from class: X.0YnM
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) t2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) t).getSortOrder()));
                }
            }, c884270YmX4.LJIIL().values()), this.LLILZ, false);
            ChatListEngine chatListEngine4 = this.LLILLJJLI;
            C884270YmX c884270YmX5 = this.LLILLL;
            chatListEngine4.LJIJJLI(c884270YmX5, c884270YmX5.LJIILIIL().values(), this.LLILZ);
            ChatListEngine chatListEngine5 = this.LLILLJJLI;
            C884270YmX c884270YmX6 = this.LLILLL;
            chatListEngine5.LJIJJ(c884270YmX6, c884270YmX6.LJIIIIZZ().values(), this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.fireAccessoryUpdateJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
