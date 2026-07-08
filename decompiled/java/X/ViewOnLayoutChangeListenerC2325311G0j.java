package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;

/* JADX INFO: renamed from: X.1G0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class ViewOnLayoutChangeListenerC2325311G0j implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC2325311G0j(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC2325311G0j viewOnLayoutChangeListenerC2325311G0j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2325311G0j);
        SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = (SearchNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0;
        if (searchNestedAutoplayCardHelper.LLILZLL && searchNestedAutoplayCardHelper.LLILZIL == null && (interfaceC652740PiyLIZIZ = searchNestedAutoplayCardHelper.LLILLL.LIZIZ(searchNestedAutoplayCardHelper.LL, 0, searchNestedAutoplayCardHelper.LIZIZ().keySet())) != null && (searchServiceCenter$AutoPlayAbility = ((SearchNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0).LIZIZ().get(interfaceC652740PiyLIZIZ)) != null) {
            ((SearchNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0).LIZLLL(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC2325311G0j viewOnLayoutChangeListenerC2325311G0j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2325311G0j);
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = (SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0;
        if (searchAdBrandZoneNestedAutoplayCardHelper.LLIZ && searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL == null && (interfaceC652740PiyLIZIZ = searchAdBrandZoneNestedAutoplayCardHelper.LLILLL.LIZIZ(searchAdBrandZoneNestedAutoplayCardHelper.LL, 0, searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ().keySet())) != null && (searchServiceCenter$AutoPlayAbility = ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0).LIZIZ().get(interfaceC652740PiyLIZIZ)) != null) {
            ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325311G0j.l0).LIZLLL(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC2325311G0j viewOnLayoutChangeListenerC2325311G0j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((ViewOnTouchListenerC2260921DeU) viewOnLayoutChangeListenerC2325311G0j.l0).LJ();
    }
}
