package X;

import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R9X, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9X extends C09AY implements Function0<C698980RbM> {
    public final /* synthetic */ RootCellComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9X(RootCellComponent rootCellComponent) {
        super(0);
        this.LL = rootCellComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C698980RbM invoke() {
        return new C698980RbM(this.LL);
    }
}
