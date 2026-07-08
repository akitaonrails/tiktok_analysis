package X;

import android.view.View;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.DiscountTemplateEditAssem;

/* JADX INFO: renamed from: X.0wJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnLayoutChangeListenerC1775800wJO implements View.OnLayoutChangeListener {
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
        }
    }

    public ViewOnLayoutChangeListenerC1775800wJO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1775800wJO viewOnLayoutChangeListenerC1775800wJO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1775800wJO);
        ((DiscountTemplateEditAssem) viewOnLayoutChangeListenerC1775800wJO.l0).Ip();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1775800wJO viewOnLayoutChangeListenerC1775800wJO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((C1774420wHA) viewOnLayoutChangeListenerC1775800wJO.l0).LLJLL) {
            if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                C1774420wHA c1774420wHA = (C1774420wHA) viewOnLayoutChangeListenerC1775800wJO.l0;
                c1774420wHA.z6(c1774420wHA.LLJL, c1774420wHA.LLJLILLLLZIIL, c1774420wHA.LLJLL);
            }
        }
    }
}
