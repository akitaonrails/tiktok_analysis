package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZO extends C09AY implements Function0<List<? extends Integer>> {
    public final /* synthetic */ C1690080u58 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZO(C1690080u58 c1690080u58) {
        super(0);
        this.LL = c1690080u58;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Integer> invoke() {
        List<C06XG> listLJII = this.LL.LJIIIZ().LJII();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
        Iterator<C06XG> it2 = listLJII.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getIndex()));
        }
        return arrayList;
    }
}
