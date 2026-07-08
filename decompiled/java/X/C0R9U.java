package X;

import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R9U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9U extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ RootCellComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9U(RootCellComponent rootCellComponent) {
        super(1);
        this.LL = rootCellComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        c062p.LIZ = new C690430R6j(this.LL.LLJJJJLIIL.LL);
        return Unit.LIZ;
    }
}
