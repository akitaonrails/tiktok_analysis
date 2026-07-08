package X;

import com.ss.android.ugc.aweme.detail.panel.StickerButtonPanel;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0maw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402280maw implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1402280maw c1402280maw, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1402280maw c1402280maw, int i) {
    }

    public static final void onPageScrolled$0(C1402280maw c1402280maw, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1402280maw c1402280maw, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
        }
    }

    public C1402280maw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1402280maw c1402280maw, int i) {
        ((StickerButtonPanel) c1402280maw.l0).S0();
    }

    public static final void onPageSelected$1(C1402280maw c1402280maw, int i) {
        int size;
        C1353070lJZ c1353070lJZ;
        InteractionFragment interactionFragment = (InteractionFragment) c1402280maw.l0;
        interactionFragment.NR(interactionFragment.LLJI, i, "");
        InteractionFragment interactionFragment2 = (InteractionFragment) c1402280maw.l0;
        if (interactionFragment2.LLJ != null) {
            List<Integer> list = interactionFragment2.LLJIJIL;
            if (list != null) {
                size = ((LinkedList) list).size();
            } else {
                size = 0;
            }
            if (i < size && (c1353070lJZ = interactionFragment2.LL) != null) {
                c1353070lJZ.setEnableSwipeRightToClose(false);
            }
        }
    }
}
