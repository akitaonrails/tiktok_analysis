package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ViewSwitcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.carousel.VSAProductCarouselView$CarouselHandler;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q6 extends ViewSwitcher implements InterfaceC21280718Pt {
    public final VSAProductCarouselView$CarouselHandler LL;
    public final List<EcUgProduct> LLILLJJLI;
    public C18QB LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public volatile boolean LLILZLL;

    @Override // X.InterfaceC21280718Pt
    public final void hide() {
        C18QA c18qa;
        if (this.LLILZIL && this.LLILZLL) {
            this.LLILZLL = false;
            this.LL.removeCallbacksAndMessages(null);
        }
        KeyEvent.Callback currentView = getCurrentView();
        if (!(currentView instanceof C18QA) || (c18qa = (C18QA) currentView) == null) {
            return;
        }
        c18qa.hide();
    }

    @Override // X.InterfaceC21280718Pt
    public final void show() {
        C18QA c18qa;
        if (this.LLILZIL && !this.LLILZLL) {
            this.LLILZLL = true;
            this.LL.removeCallbacksAndMessages(null);
            this.LL.sendEmptyMessageDelayed(0, 2000L);
        }
        KeyEvent.Callback currentView = getCurrentView();
        if (!(currentView instanceof C18QA) || (c18qa = (C18QA) currentView) == null) {
            return;
        }
        c18qa.show();
    }

    @Override // X.InterfaceC21280718Pt
    public final void LLIZLLLIL() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        if (this.LLILZIL && this.LLILZLL) {
            this.LLILZLL = false;
            this.LL.removeCallbacksAndMessages(null);
        }
        this.LLILLL = null;
        this.LLILZ = 0;
        this.LLILZIL = false;
        this.LLILZLL = false;
        ((ArrayList) this.LLILLJJLI).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(View view) {
        C18QA c18qa;
        EcUgProduct ecUgProduct = (EcUgProduct) C13LP.LJJJLZIJ(this.LLILZ, this.LLILLJJLI);
        if (ecUgProduct != null && (view instanceof C18QA) && (c18qa = (C18QA) view) != null) {
            c18qa.LIZ(this.LLILZ, ecUgProduct, !this.LLILZIL, this.LLILLL);
        }
    }

    public C18Q6(Context context, AttributeSet attributeSet) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        Object objLIZ;
        super(context, attributeSet);
        VSAProductCarouselView$CarouselHandler vSAProductCarouselView$CarouselHandler = new VSAProductCarouselView$CarouselHandler(new WeakReference(this));
        this.LL = vSAProductCarouselView$CarouselHandler;
        this.LLILLJJLI = new ArrayList();
        addView(C18Q9.LIZ(context));
        addView(C18Q9.LIZ(context));
        if (IMainSAFLifecycleKt.getEnableViewSAFLifecycleRefactor()) {
            LifecycleOwner lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(context);
            if (lifecycleOwnerLIZIZ != null && ((!(lifecycleOwnerLIZIZ instanceof C199Y) || !(lifecycleOwnerLIZIZ instanceof InterfaceC1711206n0) || ((objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwnerLIZIZ)) != null && (objLIZ instanceof C0J5E) && (lifecycleOwnerLIZIZ = (Fragment) objLIZ) != null)) && (lifecycle2 = lifecycleOwnerLIZIZ.getLifecycle()) != null)) {
                lifecycle2.addObserver(vSAProductCarouselView$CarouselHandler);
            }
        } else {
            LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this);
            if (lifecycleOwnerLIZ != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null) {
                lifecycle.addObserver(vSAProductCarouselView$CarouselHandler);
            }
        }
        if (C444960Hcc.LIZJ(context)) {
            setInAnimation(AnimationUtils.loadAnimation(context, R.anim.c_));
            setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.cb));
        } else {
            setInAnimation(AnimationUtils.loadAnimation(context, R.anim.c9));
            setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.ca));
        }
    }

    public final C18Q6 LIZ(List list, C18PN c18pn) {
        LLIZLLLIL();
        this.LLILLL = c18pn;
        boolean z = true;
        if (!list.isEmpty()) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            ((ArrayList) this.LLILLJJLI).addAll(list);
            if (list.size() <= 1) {
                z = false;
            }
            this.LLILZIL = z;
            LIZIZ(getCurrentView());
            return this;
        }
        c18pn.LIZJ();
        return null;
    }
}
