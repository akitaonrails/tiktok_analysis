package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ViewSwitcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.detail.VSAProductDetailMixedScrollingView$ScrollingHandler;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18Q3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q3 extends ViewSwitcher {
    public final VSAProductDetailMixedScrollingView$ScrollingHandler LL;
    public EcUgProduct LLILLJJLI;
    public final List<Integer> LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public volatile boolean LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Q3.LIZ(android.view.View):void");
    }

    public C18Q3(Context context, AttributeSet attributeSet) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        Object objLIZ;
        super(context, attributeSet);
        VSAProductDetailMixedScrollingView$ScrollingHandler vSAProductDetailMixedScrollingView$ScrollingHandler = new VSAProductDetailMixedScrollingView$ScrollingHandler(new WeakReference(this));
        this.LL = vSAProductDetailMixedScrollingView$ScrollingHandler;
        this.LLILLL = new ArrayList();
        addView(new C18Q7(context));
        addView(new C18Q7(context));
        if (IMainSAFLifecycleKt.getEnableViewSAFLifecycleRefactor()) {
            LifecycleOwner lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(context);
            if (lifecycleOwnerLIZIZ != null && ((!(lifecycleOwnerLIZIZ instanceof C199Y) || !(lifecycleOwnerLIZIZ instanceof InterfaceC1711206n0) || ((objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwnerLIZIZ)) != null && (objLIZ instanceof C0J5E) && (lifecycleOwnerLIZIZ = (Fragment) objLIZ) != null)) && (lifecycle2 = lifecycleOwnerLIZIZ.getLifecycle()) != null)) {
                lifecycle2.addObserver(vSAProductDetailMixedScrollingView$ScrollingHandler);
            }
        } else {
            LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this);
            if (lifecycleOwnerLIZ != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null) {
                lifecycle.addObserver(vSAProductDetailMixedScrollingView$ScrollingHandler);
            }
        }
        setInAnimation(AnimationUtils.loadAnimation(context, R.anim.c7));
        setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.c8));
    }
}
