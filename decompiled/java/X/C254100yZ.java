package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.00yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C254100yZ extends C09AY implements Function1<List<? extends BagItem>, Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254100yZ(int i, long j, Function1 function1) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends BagItem> list) {
        List<? extends BagItem> list2 = list;
        boolean z = false;
        if (list2 != null) {
            int i = this.LLILLJJLI;
            long j = this.LLILLL;
            if (!list2.isEmpty()) {
                Iterator<? extends BagItem> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    BagItem next = it2.next();
                    if (next.itemType == i && next.itemId == j) {
                        z = true;
                        break;
                    }
                }
            }
        }
        this.LL.invoke(Boolean.valueOf(z));
        return Unit.LIZ;
    }
}
