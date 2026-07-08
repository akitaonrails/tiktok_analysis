package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.05zZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.newconversation.FriendContentTabDataSourceProtocol$onRefresh$2", f = "FriendContentTabDataSourceProtocol.kt", l = {180, 182}, m = "invokeSuspend")
public final class C1534305zZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228060i3w LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1534305zZ(C1228060i3w c1228060i3w, InterfaceC1364105Vn<? super C1534305zZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1228060i3w;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1534305zZ c1534305zZ = new C1534305zZ(this.LLILLL, interfaceC1364105Vn);
        c1534305zZ.LLILLJJLI = obj;
        return c1534305zZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends AbstractC1223800hx4> list;
        AnonymousClass0956 anonymousClass0956;
        C1C7U.LIZ("FriendContentTabDataSourceProtocol@b484.onRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    list = (List) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                list = (List) obj;
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1228060i3w c1228060i3w = this.LLILLL;
            C099G c099g = c1228060i3w.LLILZ;
            list = c1228060i3w.LLILZIL;
            if (list == null) {
                if (c099g != null && c099g.isActive()) {
                    this.LL = 1;
                    obj = c099g.LJLIIIL(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.onRefresh$2");
                        return objLJFF;
                    }
                    list = (List) obj;
                } else {
                    C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228070i3x(c1228060i3w, null), 3);
                    this.LL = 2;
                    obj = c099gLIZIZ.LJLIIIL(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.onRefresh$2");
                        return objLJFF;
                    }
                    list = (List) obj;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1223800hx4 abstractC1223800hx4 : list) {
            if (abstractC1223800hx4 instanceof C1224840hyk) {
                arrayList.add(abstractC1223800hx4);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1224840hyk) it2.next()).LLILZ);
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList2);
        if (System.currentTimeMillis() - C05L9.LIZ >= 10000) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 5))), null, null, new C05L8(listLJJJJI, null), 3);
        }
        C1533905zV c1533905zV = C1533905zV.LLILZIL;
        c1533905zV.getClass();
        if (!listLJJJJI.isEmpty() && ((anonymousClass0956 = c1533905zV.LLILLL) == null || !anonymousClass0956.isActive())) {
            c1533905zV.LLILLL = C23250099c.LIZLLL(C1533905zV.LLILZLL, null, null, new C1533605zS(c1533905zV, listLJJJJI, null), 3);
        }
        C1223660hwq c1223660hwq = new C1223660hwq(list);
        C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.onRefresh$2");
        return c1223660hwq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
