package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.xelement.viewpager.CustomAppBarLayoutNG$Behavior;

/* JADX INFO: renamed from: X.0kRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@InterfaceC1319520kRS(CustomAppBarLayoutNG$Behavior.class)
public class C1319350kRB extends AbstractC1319370kRD {
    public InterfaceC20747016Gm LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public CustomAppBarLayoutNG$Behavior LLJJJ;

    @Override // X.C16GX, X.C16G4
    public C16BC getBehavior() {
        if (this.LLJJJ == null) {
            this.LLJJJ = new CustomAppBarLayoutNG$Behavior(this);
        }
        return this.LLJJJ;
    }

    public int getTopAndBottomOffset() {
        CustomAppBarLayoutNG$Behavior customAppBarLayoutNG$Behavior = this.LLJJJ;
        if (customAppBarLayoutNG$Behavior != null) {
            return customAppBarLayoutNG$Behavior.getTopAndBottomOffset();
        }
        return 0;
    }

    public void setEnableTouchStopFling(boolean z) {
        this.LLJJIJIL = z;
    }

    public void setScrollListener(InterfaceC20747016Gm interfaceC20747016Gm) {
        this.LLJJIJIIJIL = interfaceC20747016Gm;
    }

    public C1319350kRB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIJIL = true;
    }
}
