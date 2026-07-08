package X;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ktR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336870ktR extends AbstractC1336850ktP<C1336800ktK> {
    public C1336870ktR(Context context) {
        new LinkedHashMap();
        super(new C1336800ktK(context), context);
    }

    public final void setForceCanScroll(boolean z) {
        getMViewPager().setMForceCanScroll(z);
    }

    public final void setPagerChangeAnimation(boolean z) {
        getMViewPager().setMPagerChangeAnimation(z);
    }

    public final void setViewPagerOverScrollMode(boolean z) {
        if (z) {
            getMViewPager().setOverScrollMode(0);
        } else {
            getMViewPager().setOverScrollMode(2);
        }
    }
}
