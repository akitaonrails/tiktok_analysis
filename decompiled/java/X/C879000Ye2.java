package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ye2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879000Ye2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, C872090YJb> LL;
    public final /* synthetic */ C881600YiE LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C879000Ye2(Map<String, C872090YJb> map, C881600YiE c881600YiE, InterfaceC879010Ye3 interfaceC879010Ye3) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = c881600YiE;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = new ArrayList();
        Set<String> setKeySet = this.LL.keySet();
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new AnonymousClass0617(interfaceC879010Ye3.getBizId(), (String) it2.next()));
        }
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJLI = this.LLILLJJLI.LJIJJLI();
            InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILLL;
            C881600YiE c881600YiE = this.LLILLJJLI;
            Iterator<InterfaceC1482905rH> it3 = copyOnWriteArrayListLJIJJLI.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(interfaceC879010Ye32, arrayList, c881600YiE.LIZIZ(), c881600YiE.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
