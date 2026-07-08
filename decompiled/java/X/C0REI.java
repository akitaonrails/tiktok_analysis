package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0REI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REI extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ CellGradualComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REI(CellGradualComponent cellGradualComponent) {
        super(1);
        this.LL = cellGradualComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        int i;
        View view;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i = 4;
        } else {
            i = 0;
        }
        CellGradualComponent cellGradualComponent = this.LL;
        if (!cellGradualComponent.LLJLILLLLZIIL && (view = cellGradualComponent.LLJJJJLIIL) != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        this.LL.sm0(!Intrinsics.LJFF(bool, r3));
        return Unit.LIZ;
    }
}
