package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.searchengine.accounts.AccountsSearchEngine$assembleBusinessData$3", f = "AccountsSearchEngine.kt", l = {}, m = "invokeSuspend")
public final class C06Y3 extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C0Y8T>>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C1240470iNx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y3(C1240470iNx c1240470iNx, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1240470iNx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Y3(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountsSearchEngine@d281.assembleBusinessData$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        C1240470iNx c1240470iNx = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8tInvoke = c1240470iNx.LIZLLL.invoke(it2.next());
            if (c0y8tInvoke != null) {
                arrayList.add(c0y8tInvoke);
            }
        }
        List<String> list2 = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C0Y8T) it3.next()).getConversationId());
        }
        List<C0Y8T> listInvoke = this.LLILLJJLI.LJ.invoke(C13LP.LLIIII(C13LP.LJLLLLLL(list2, C13LP.LLIIJI(arrayList2))));
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.addAll(arrayList);
        c13dvLIZIZ.addAll(listInvoke);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        C1C7U.LIZIZ("AccountsSearchEngine@d281.assembleBusinessData$3");
        return listLIZ;
    }
}
