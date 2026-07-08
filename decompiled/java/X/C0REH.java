package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0REH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REH extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ CellGradualComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REH(CellGradualComponent cellGradualComponent) {
        super(1);
        this.LL = cellGradualComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        View view = this.LL.LLJL;
        if (view != null && view.getVisibility() == 0 && view.getHeight() > 0 && Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        int visibility = 0;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            CellGradualComponent cellGradualComponent = this.LL;
            if (!cellGradualComponent.LLJLLIL) {
                View view2 = cellGradualComponent.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    visibility = view2.getVisibility();
                }
                cellGradualComponent.LLJLL = visibility;
                this.LL.LLJLLIL = true;
            }
            View view3 = this.LL.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        } else {
            CellGradualComponent cellGradualComponent2 = this.LL;
            View view4 = cellGradualComponent2.LLJJLIIIJLLLLLLLZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(cellGradualComponent2.LLJLL, view4);
            }
            this.LL.LLJLLIL = false;
        }
        return Unit.LIZ;
    }
}
