package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$getPageListObserver$1$onQueryConversationWithCategory$2", f = "ChatListConversationDataSource.kt", l = {}, m = "invokeSuspend")
public final class C878410Yd5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878460YdA LL;
    public final /* synthetic */ C0Y6X LLILLJJLI;
    public final /* synthetic */ C878470YdB LLILLL;
    public final /* synthetic */ C0Y6P LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878410Yd5(C0Y6P c0y6p, C0Y6X c0y6x, C878460YdA c878460YdA, C878470YdB c878470YdB, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878460YdA;
        this.LLILLJJLI = c0y6x;
        this.LLILLL = c878470YdB;
        this.LLILZ = c0y6p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C878460YdA c878460YdA = this.LL;
        return new C878410Yd5(this.LLILZ, this.LLILLJJLI, c878460YdA, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Map map;
        Map map2;
        Integer num;
        C878420Yd6 c878420Yd6PutIfAbsent;
        C1C7U.LIZ("ChatListConversationDataSource@6f28.getPageListObserver$1$onQueryConversationWithCategory$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C878460YdA c878460YdA = this.LL;
        C0Y6X c0y6x = this.LLILLJJLI;
        C878470YdB c878470YdB = this.LLILLL;
        C0Y6P c0y6p = this.LLILZ;
        ConcurrentHashMap<C878470YdB, C878420Yd6> concurrentHashMapLJIILJJIL = c878460YdA.LJIILJJIL();
        C878420Yd6 c878420Yd6 = concurrentHashMapLJIILJJIL.get(c878470YdB);
        if (c878420Yd6 == null && (c878420Yd6PutIfAbsent = concurrentHashMapLJIILJJIL.putIfAbsent(c878470YdB, (c878420Yd6 = new C878420Yd6()))) != null) {
            c878420Yd6 = c878420Yd6PutIfAbsent;
        }
        C878420Yd6 c878420Yd62 = c878420Yd6;
        C879540Yeu c879540Yeu = null;
        if (C880900Yh6.LIZIZ() && c878420Yd62.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("solveNormalResult return(stopLoadingFlag == true), tab=");
            sbLIZ.append(c878470YdB.LIZ.LLILLL);
            sbLIZ.append(", page=");
            sbLIZ.append(c878470YdB.LIZ);
            sbLIZ.append(", loadingParam: ");
            sbLIZ.append(c878420Yd62.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZ();
            c878420Yd62.LIZJ = c878420Yd62.LIZ;
            c878420Yd62.LIZ = null;
        } else {
            c878420Yd62.LIZ = null;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (C0Y8T c0y8t : c0y6x.LIZIZ) {
                C878670YdV.LIZ.getClass();
                if (!C878670YdV.LIZIZ(c0y8t)) {
                    i++;
                } else {
                    if (C878670YdV.LIZ(c0y8t)) {
                        C879540Yeu c879540YeuLJIILLIIL = C878460YdA.LJIILLIIL(c0y8t, c878470YdB.LIZ.LL);
                        if (c879540YeuLJIILLIIL != null) {
                            arrayList2.add(c879540YeuLJIILLIIL);
                        } else {
                            c879540YeuLJIILLIIL = c879540Yeu;
                        }
                        Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                        C877210Yb9 c877210Yb9 = c878470YdB.LIZIZ;
                        if (C880370YgF.LJFF(c0y8t, c877210Yb9.LIZ, c877210Yb9.LIZIZ) && c879540YeuLJIILLIIL != null) {
                            arrayList.add(c879540YeuLJIILLIIL);
                            arrayList3.add(c0y8t);
                        }
                    }
                    c879540Yeu = null;
                }
            }
            ((C0Y69) c0y6p).LIZ(arrayList3);
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null && (map2 = (Map) abstractC883730YlfLJ.LIZJ.getValue()) != null && (num = (Integer) map2.get(c878470YdB.LIZ)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
            if (abstractC883730YlfLJ2 != null && (map = (Map) abstractC883730YlfLJ2.LIZJ.getValue()) != null) {
                map.put(c878470YdB.LIZ, Integer.valueOf(iIntValue + i));
            }
            String str = c878460YdA.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("after solveNormalResult, tab=");
            sbLIZ2.append(c878470YdB.LIZ.LLILLL);
            sbLIZ2.append(", size=");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(", rawSize=");
            sbLIZ2.append(arrayList2.size());
            sbLIZ2.append(", invalidCount=");
            sbLIZ2.append(i);
            sbLIZ2.append(", nextCursor=");
            sbLIZ2.append(c0y6x.LIZLLL);
            sbLIZ2.append(", hasMore=");
            sbLIZ2.append(c0y6x.LIZJ);
            sbLIZ2.append(", query=");
            sbLIZ2.append(c0y6x.LIZ);
            sbLIZ2.append(", page=");
            sbLIZ2.append(c878470YdB.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C309160C9y.LIZLLL(str);
            C878550YdJ c878550YdJLJIIJ = c878460YdA.LJIIJ(c878470YdB, new C878550YdJ(c0y6x.LIZJ, new C877600Ybm((AbstractC877620Ybo) new C877610Ybn(c0y6x.LIZLLL), 2), true));
            CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = c878460YdA.LJIILL().get(c878470YdB);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC878540YdI> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL(c878470YdB.LIZ, arrayList, arrayList2, c878550YdJLJIIJ, false, true, C878360Yd0.LIZIZ(c878460YdA.LIZ, "normal"));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.getPageListObserver$1$onQueryConversationWithCategory$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
