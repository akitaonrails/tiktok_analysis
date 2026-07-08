package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0blW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986000blW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ C985990blV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986000blW(RecyclerView recyclerView, C985990blV c985990blV) {
        super(0);
        this.LL = recyclerView;
        this.LLILLJJLI = c985990blV;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.removeOnScrollListener(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
