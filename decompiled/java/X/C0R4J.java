package X;

import com.ss.android.ugc.aweme.search.common.ui.component.SearchInflowCommonComponent;
import com.ss.android.ugc.aweme.tako.detail.guide.TakoInflowCommonComponent;

/* JADX INFO: renamed from: X.0R4J, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4J implements InterfaceC1616070s9l {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onBeforePageChange$0(C0R4J c0r4j) {
    }

    public static final /* synthetic */ void onBeforePageChange$1(C0R4J c0r4j) {
    }

    public static final void onPageScrollStateChanged$0(C0R4J c0r4j, int i) {
    }

    public static final void onPageScrollStateChanged$1(C0R4J c0r4j, int i) {
    }

    public static final void onPageScrolled$0(C0R4J c0r4j, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C0R4J c0r4j, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$0(C0R4J c0r4j, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$1(C0R4J c0r4j, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(C0R4J c0r4j, int i, boolean z) {
    }

    public static final void onPageSelected$1(C0R4J c0r4j, int i, boolean z) {
    }

    public static final void onPageUnSelected$0(C0R4J c0r4j, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$1(C0R4J c0r4j, C0SZ8 c0sz8) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C0R4J c0r4j, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C0R4J c0r4j, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C0R4J c0r4j, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C0R4J c0r4j, int i, boolean z) {
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

    public C0R4J(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C0R4J c0r4j, int i) {
        SearchInflowCommonComponent searchInflowCommonComponent = (SearchInflowCommonComponent) c0r4j.l0;
        if (!searchInflowCommonComponent.LLILLJJLI) {
            C0PYP c0pyp = C0PYP.LIZ;
            C2189821An6 c2189821An6LIZ = C0SUC.LIZ(searchInflowCommonComponent.getContext());
            c0pyp.getClass();
            if (C0PYP.LIZ(c2189821An6LIZ)) {
                C0PYS.LIZ.storeBoolean("has_swiped_inner_flow", true);
            }
        }
        ((SearchInflowCommonComponent) c0r4j.l0).LLILLJJLI = false;
    }

    public static final void onPageSelected$1(C0R4J c0r4j, int i) {
        TakoInflowCommonComponent takoInflowCommonComponent = (TakoInflowCommonComponent) c0r4j.l0;
        if (!takoInflowCommonComponent.LLILLL) {
            if (C14TF.LIZIZ.LJJJJIZL(C0SUC.LIZ(takoInflowCommonComponent.getContext()).getEventType())) {
                C1860520yW2.LIZ.getClass();
                C1860520yW2.LJIIL().storeBoolean("has_swiped_inner_flow", true);
            }
            ((TakoInflowCommonComponent) c0r4j.l0).LLILLJJLI = false;
        }
        ((TakoInflowCommonComponent) c0r4j.l0).LLILLL = false;
    }
}
