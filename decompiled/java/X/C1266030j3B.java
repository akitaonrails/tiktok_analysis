package X;

import com.ss.android.ugc.aweme.component.preformance.FeedLiveCardAwarenessComponent;
import com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomContainerComponent;
import java.util.AbstractCollection;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0j3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266030j3B implements InterfaceC1616070s9l {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onBeforePageChange$0(C1266030j3B c1266030j3B) {
    }

    public static final /* synthetic */ void onBeforePageChange$1(C1266030j3B c1266030j3B) {
    }

    public static final void onPageScrollStateChanged$1(C1266030j3B c1266030j3B, int i) {
    }

    public static final void onPageScrolled$0(C1266030j3B c1266030j3B, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1266030j3B c1266030j3B, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$0(C1266030j3B c1266030j3B, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$1(C1266030j3B c1266030j3B, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(C1266030j3B c1266030j3B, int i) {
    }

    public static final void onPageSelected$0(C1266030j3B c1266030j3B, int i, boolean z) {
    }

    public static final void onPageSelected$1(C1266030j3B c1266030j3B, int i, boolean z) {
    }

    public static final void onPageUnSelected$0(C1266030j3B c1266030j3B, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$1(C1266030j3B c1266030j3B, C0SZ8 c0sz8) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C1266030j3B c1266030j3B, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C1266030j3B c1266030j3B, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C1266030j3B c1266030j3B, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C1266030j3B c1266030j3B, int i, boolean z) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
        switch (this.$t) {
            case 0:
                onBeforePageChange$0(this);
                break;
            case 1:
                onBeforePageChange$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
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

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
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

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolledEnd$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolledEnd$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
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

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i, z);
                break;
            case 1:
                onPageSelected$1(this, i, z);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
        switch (this.$t) {
            case 0:
                onPageUnSelected$0(this, c0sz8);
                break;
            case 1:
                onPageUnSelected$1(this, c0sz8);
                break;
        }
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
        switch (this.$t) {
            case 0:
                onScrollToItemStart$0(this, i);
                break;
            case 1:
                onScrollToItemStart$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
        switch (this.$t) {
            case 0:
                onScrollToItemStart$0(this, i, z);
                break;
            case 1:
                onScrollToItemStart$1(this, i, z);
                break;
        }
    }

    public C1266030j3B(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1266030j3B c1266030j3B, int i) {
        if (C1389300mG0.LJIL(((FeedLiveCardAwarenessComponent) c1266030j3B.l0).getPanelContext())) {
            C487180J8q.LIZIZ = i;
            if (C487180J8q.LIZIZ != 0) {
                return;
            }
            while (true) {
                C01GW c01gw = C487180J8q.LIZLLL;
                if (!((AbstractCollection) c01gw.getValue()).isEmpty()) {
                    ((Runnable) ((LinkedList) c01gw.getValue()).removeFirst()).run();
                } else {
                    return;
                }
            }
        } else if (C1389300mG0.LJIIIIZZ(((FeedLiveCardAwarenessComponent) c1266030j3B.l0).getPanelContext())) {
            C487180J8q.LIZJ = i;
            if (C487180J8q.LIZJ != 0) {
                return;
            }
            while (true) {
                C01GW c01gw2 = C487180J8q.LJ;
                if (!((AbstractCollection) c01gw2.getValue()).isEmpty()) {
                    ((Runnable) ((LinkedList) c01gw2.getValue()).removeFirst()).run();
                } else {
                    return;
                }
            }
        }
    }

    public static final void onPageSelected$1(C1266030j3B c1266030j3B, int i) {
        ((DetailBottomContainerComponent) c1266030j3B.l0).bo(false);
    }
}
