package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$Companion$autoArchiveInactiveConversations$1", f = "ChatListConversationDataSource.kt", l = {777}, m = "invokeSuspend")
public final class C878660YdU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878660YdU(List<C0Y8T> list, InterfaceC1364105Vn<? super C878660YdU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C878660YdU c878660YdU = new C878660YdU(this.LLILLL, interfaceC1364105Vn);
        c878660YdU.LLILLJJLI = obj;
        return c878660YdU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it2;
        C1C7U.LIZ("ChatListConversationDataSource$Companion@531b.autoArchiveInactiveConversations$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(C878730Ydb.LIZ().expirationTimeToAutoArchiveDay);
            List<C0Y8T> list = this.LLILLL;
            if (list != null) {
                arrayList = new ArrayList();
                for (C0Y8T c0y8t : list) {
                    C0Y8T c0y8t2 = c0y8t;
                    if (!c0y8t2.isStickTop() && c0y8t2.getSortOrder() < jCurrentTimeMillis && !C879070Ye9.LIZIZ(c0y8t2) && !C879070Ye9.LJ(c0y8t2, true)) {
                        arrayList.add(c0y8t);
                    }
                }
            } else {
                C0Y6Q<C867240Y0k> c0y6qLJIIJJI = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIJJI(C869770YAd.LIZ(new C869690Y9v(null, new C0YB9(C0YZX.PRIMARY), null, null, null, null, 1019), 0, jCurrentTimeMillis, false, 54));
                if (c0y6qLJIIJJI.LIZIZ == null) {
                    List<C0Y8T> list2 = c0y6qLJIIJJI.LIZ.LIZIZ;
                    arrayList = new ArrayList();
                    for (C0Y8T c0y8t3 : list2) {
                        C0Y8T c0y8t4 = c0y8t3;
                        C878670YdV.LIZ.getClass();
                        if (C878670YdV.LIZIZ(c0y8t4) && C878670YdV.LIZ(c0y8t4) && !c0y8t4.isStickTop() && !C879070Ye9.LIZIZ(c0y8t4) && !C879070Ye9.LJ(c0y8t4, true)) {
                            arrayList.add(c0y8t3);
                        }
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChatListConversationDataSource$Companion@531b.autoArchiveInactiveConversations$1");
                    return unit;
                }
            }
            arrayList.size();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C0Y8T) it3.next()).getConversationId());
            }
            arrayList2.toString();
            C309160C9y.LIZLLL("ChatListConversationDataSource");
            C885310YoD c885310YoD = C885310YoD.LIZ;
            int size = arrayList.size();
            int i2 = C878730Ydb.LIZ().expirationTimeToAutoArchiveDay;
            c885310YoD.getClass();
            C885310YoD.LJIJJ().sendEvent("auto_archive_inactive_chat", C2097608Jq.LJIIIIZZ(new Pair("conv_count", String.valueOf(size)), new Pair("inactive_days", String.valueOf(i2))));
            it2 = C13LP.LJJJIL(arrayList, 99).iterator();
        }
        while (it2.hasNext()) {
            List list3 = (List) it2.next();
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJL(list3, Collections.singletonList(EnumC879080YeA.SECONDARY), C1697810uHb.LJIIJJI(EnumC879080YeA.PRIMARY, EnumC879080YeA.SPAM), false, new C914150Ztd(list3, 0));
            long j = C878730Ydb.LIZ().autoArchiveInactiveIntervalMs;
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListConversationDataSource$Companion@531b.autoArchiveInactiveConversations$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource$Companion@531b.autoArchiveInactiveConversations$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
