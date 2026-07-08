package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1G0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class ViewOnLayoutChangeListenerC2325321G0k implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC2325321G0k(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC2325321G0k viewOnLayoutChangeListenerC2325321G0k, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC713360RyY interfaceC713360RyY;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2325321G0k);
        Object objFindViewHolderForAdapterPosition = ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325321G0k.l0).LL.findViewHolderForAdapterPosition(((C640750PBh) viewOnLayoutChangeListenerC2325321G0k.l1).LIZ);
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = null;
        if (objFindViewHolderForAdapterPosition != null && (objFindViewHolderForAdapterPosition instanceof InterfaceC713360RyY) && (interfaceC713360RyY = (InterfaceC713360RyY) objFindViewHolderForAdapterPosition) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) != null && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, SearchServiceCenter$AutoPlayAbility.class, null)) != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility, ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325321G0k.l0).LLIZLLLIL))) {
            searchServiceCenter$AutoPlayAbility2 = searchServiceCenter$AutoPlayAbility;
        }
        ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnLayoutChangeListenerC2325321G0k.l0).LLILZLL = searchServiceCenter$AutoPlayAbility2;
        C640750PBh c640750PBh = ((C640750PBh) viewOnLayoutChangeListenerC2325321G0k.l1).LIZIZ;
        if (c640750PBh != null) {
            if (searchServiceCenter$AutoPlayAbility2 != null) {
                searchServiceCenter$AutoPlayAbility2.Ot0(c640750PBh, (Function0) viewOnLayoutChangeListenerC2325321G0k.l2);
                return;
            }
            return;
        }
        ((Function0) viewOnLayoutChangeListenerC2325321G0k.l2).invoke();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC2325321G0k viewOnLayoutChangeListenerC2325321G0k, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((C1D21) viewOnLayoutChangeListenerC2325321G0k.l0).LIZIZ.getHeight() > 0 && ((C1D21) viewOnLayoutChangeListenerC2325321G0k.l0).LIZIZ.getWidth() > 0) {
            ((C1D21) viewOnLayoutChangeListenerC2325321G0k.l0).LIZLLL((Rect) viewOnLayoutChangeListenerC2325321G0k.l1, (Function0) viewOnLayoutChangeListenerC2325321G0k.l2);
            ((C1D21) viewOnLayoutChangeListenerC2325321G0k.l0).LIZIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2325321G0k);
        }
    }
}
