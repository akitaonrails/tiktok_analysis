package X;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Zim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C907420Zim extends C2217421BqW implements Function2<List<? extends C907840ZjS>, List<? extends C907840ZjS>, Pair<? extends List<? extends C907840ZjS>, ? extends List<? extends C907840ZjS>>> {
    public C907420Zim(Object obj) {
        super(2, obj, C907810ZjP.class, "getSearchContentActionList", "getSearchContentActionList(Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<? extends List<? extends C907840ZjS>, ? extends List<? extends C907840ZjS>> invoke(List<? extends C907840ZjS> list, List<? extends C907840ZjS> list2) {
        List<? extends C907840ZjS> list3 = list;
        List<? extends C907840ZjS> list4 = list2;
        this.receiver.getClass();
        Set setLJJL = C13LP.LJJL(list3, C13LP.LLIIJI(list4));
        return new Pair<>(C13LP.LLIIII(C13LP.LJLLLLLL(list3, setLJJL)), C13LP.LLIIII(C13LP.LJLLLLLL(list4, setLJJL)));
    }
}
