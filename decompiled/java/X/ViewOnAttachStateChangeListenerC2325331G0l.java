package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1G0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class ViewOnAttachStateChangeListenerC2325331G0l implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC2325331G0l viewOnAttachStateChangeListenerC2325331G0l, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC2325331G0l viewOnAttachStateChangeListenerC2325331G0l, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC2325331G0l(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC2325331G0l viewOnAttachStateChangeListenerC2325331G0l, View view) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = ((SearchNestedAutoplayCardHelper) viewOnAttachStateChangeListenerC2325331G0l.l0).LLILZIL;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        ((SearchNestedAutoplayCardHelper) viewOnAttachStateChangeListenerC2325331G0l.l0).LLILZIL = null;
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC2325331G0l viewOnAttachStateChangeListenerC2325331G0l, View view) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = ((SearchAdBrandZoneNestedAutoplayCardHelper) viewOnAttachStateChangeListenerC2325331G0l.l0).LLILZLL;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = (SearchAdBrandZoneNestedAutoplayCardHelper) viewOnAttachStateChangeListenerC2325331G0l.l0;
        searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL = null;
        if (!searchAdBrandZoneNestedAutoplayCardHelper.LLJI.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(searchAdBrandZoneNestedAutoplayCardHelper.LLJI);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C1DWF) it2.next()).N6();
            }
        }
    }
}
