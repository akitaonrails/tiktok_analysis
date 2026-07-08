package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819220xRQ extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ RecyclerView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819220xRQ(RecyclerView recyclerView) {
        super(1);
        this.LL = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.LL.smoothScrollToPosition(num.intValue());
        return Unit.LIZ;
    }
}
