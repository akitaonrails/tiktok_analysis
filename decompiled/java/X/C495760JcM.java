package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0JcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495760JcM extends AbstractC495740JcK {
    public final EnumC495860JcW LJ;

    @Override // X.AbstractC495740JcK
    public final void LIZ() {
        ViewGroup viewGroup;
        Iterator<AbstractC495790JcP<?>> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            View viewLIZ = this.LIZIZ.LIZ(it2.next());
            if (viewLIZ != null && (viewGroup = this.LIZJ) != null) {
                viewGroup.addView(viewLIZ, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    @Override // X.AbstractC495740JcK
    public final EnumC495860JcW LIZLLL() {
        return this.LJ;
    }

    public C495760JcM(C495920Jcc c495920Jcc, C495810JcR c495810JcR) {
        super(c495920Jcc, c495810JcR);
        this.LJ = EnumC495860JcW.FRAME_EXPLANATION;
    }
}
