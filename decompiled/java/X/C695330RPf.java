package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695330RPf extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ InteractRightAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695330RPf(InteractRightAreaComponent interactRightAreaComponent) {
        super(1);
        this.LL = interactRightAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        String strLIZ;
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if ((!((Boolean) C265710AbB.LIZ.getValue()).booleanValue() || this.LL.LLJJIJI) && (this.LL.LJJIJL() instanceof ViewGroup)) {
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                C0RGG c0rggLIZ = C586380MzE.LIZ();
                C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
                if (c0rjnLIZIZ != null) {
                    strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
                } else {
                    strLIZ = null;
                }
                boolean zLIZIZ = c0rggLIZ.LIZIZ(strLIZ);
                Iterator<View> it2 = new C09RD((ViewGroup) this.LL.LJJIJL()).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    View view = (View) c09re.next();
                    if (Intrinsics.LJFF(view.getTag(C700100RdA.LJIIL), Boolean.TRUE)) {
                        C695510RPx.LIZ.getClass();
                        C695510RPx.LJ(view, !bool2.booleanValue(), true, !zLIZIZ);
                    } else {
                        C695510RPx.LIZ.getClass();
                        C695510RPx.LJ(view, bool2.booleanValue(), true, !zLIZIZ);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
