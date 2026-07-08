package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0YVB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.searchengine.message.MessageSearchEngine$assembleBusinessData$2", f = "MessageSearchEngine.kt", l = {}, m = "invokeSuspend")
public final class C0YVB extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C0Y8T>>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C1240310iNh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YVB(List<String> list, C1240310iNh c1240310iNh, InterfaceC1364105Vn<? super C0YVB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1240310iNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YVB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("MessageSearchEngine@252d.assembleBusinessData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list2 = this.LL;
        C1240310iNh c1240310iNh = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8tLIZ = c1240310iNh.LIZ.LIZ(it2.next());
            if (c0y8tLIZ != null) {
                arrayList.add(c0y8tLIZ);
            }
        }
        List<String> list3 = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C0Y8T) it3.next()).getConversationId());
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LJLLLLLL(list3, C13LP.LLIIJI(arrayList2)));
        if (listLLIIII.isEmpty()) {
            list = C13BV.INSTANCE;
        } else {
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = this.LLILLJJLI.LIZ.LJIIJJI(C869770YAd.LIZ(new C869690Y9v(C1262604wq.LIZ(listLLIIII), null, null, null, null, null, 1022), 0, 0L, false, 62));
            if (c0y6qLJIIJJI.LIZIZ == null) {
                list = c0y6qLJIIJJI.LIZ.LIZIZ;
            } else {
                list = C13BV.INSTANCE;
            }
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.addAll(arrayList);
        c13dvLIZIZ.addAll(list);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        C1C7U.LIZIZ("MessageSearchEngine@252d.assembleBusinessData$2");
        return listLIZ;
    }
}
