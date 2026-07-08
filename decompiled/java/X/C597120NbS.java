package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$fullUpdate$overallCost$1$2", f = "GroupSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
public final class C597120NbS extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C907840ZjS>>, Object> {
    public final /* synthetic */ List<C0Y8T> LL;
    public final /* synthetic */ C907490Zit LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597120NbS(List<C0Y8T> list, C907490Zit c907490Zit, InterfaceC1364105Vn<? super C597120NbS> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c907490Zit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597120NbS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C907840ZjS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9.fullUpdate$overallCost$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0Y8T> list = this.LL;
        Function1<C0Y8T, C907840ZjS> function1 = this.LLILLJJLI.LJII;
        ArrayList arrayList = new ArrayList();
        Iterator<C0Y8T> it2 = list.iterator();
        while (it2.hasNext()) {
            C907840ZjS c907840ZjSInvoke = function1.invoke(it2.next());
            if (c907840ZjSInvoke != null) {
                arrayList.add(c907840ZjSInvoke);
            }
        }
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.fullUpdate$overallCost$1$2");
        return arrayList;
    }
}
