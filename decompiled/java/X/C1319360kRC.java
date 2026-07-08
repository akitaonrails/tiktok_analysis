package X;

import android.content.Context;
import android.util.AttributeSet;
import com.lynx.xelement.scroll.coordinator.ScrollCoordinatorAppBarLayout$Behavior;

/* JADX INFO: renamed from: X.0kRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@InterfaceC1319520kRS(ScrollCoordinatorAppBarLayout$Behavior.class)
public class C1319360kRC extends AbstractC1319380kRE {
    public InterfaceC20747116Gn LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ScrollCoordinatorAppBarLayout$Behavior LLJJIJIL;

    @Override // X.C16GX, X.C16G4
    public C16BC getBehavior() {
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new ScrollCoordinatorAppBarLayout$Behavior(this);
        }
        return this.LLJJIJIL;
    }

    public int getTopAndBottomOffset() {
        ScrollCoordinatorAppBarLayout$Behavior scrollCoordinatorAppBarLayout$Behavior = this.LLJJIJIL;
        if (scrollCoordinatorAppBarLayout$Behavior != null) {
            return scrollCoordinatorAppBarLayout$Behavior.getTopAndBottomOffset();
        }
        return 0;
    }

    public void setScrollListener(InterfaceC20747116Gn interfaceC20747116Gn) {
        this.LLJJIJI = interfaceC20747116Gn;
    }

    public void setTouchStopFlingEnabled(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public C1319360kRC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIJIIJIL = true;
    }
}
