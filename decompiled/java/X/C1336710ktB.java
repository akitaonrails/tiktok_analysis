package X;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ktB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336710ktB extends AbstractC1336950ktZ<C1336730ktD> {
    public Boolean LLL;

    public C1336710ktB(Context context) {
        new LinkedHashMap();
        super(new C1336730ktD(context), context);
        this.LLL = Boolean.FALSE;
    }

    public final void setForceCanScroll(boolean z) {
        getMViewPager().setMForceCanScroll(z);
    }

    public final void setPagerChangeAnimation(boolean z) {
        getMViewPager().setMPagerChangeAnimation(z);
    }

    @Override // X.AbstractC1336950ktZ
    public void setTabBarElementAdded(boolean z) {
        this.LLL = Boolean.valueOf(z);
    }

    public final void setViewPagerOverScrollMode(boolean z) {
        if (z) {
            getMViewPager().setOverScrollMode(0);
        } else {
            getMViewPager().setOverScrollMode(2);
        }
    }
}
