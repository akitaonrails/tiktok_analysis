package X;

import Y.ALAdapterS23S0200000_29;
import Y.AObserverS231S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.10td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19390710td extends AbstractC19391210ti {
    public C19390510tb LJIJI;
    public PipFeedWindowVM LJIJJ;
    public C19386210su LJIJJLI;
    public final C01GW LJIL;

    @Override // X.AbstractC19391210ti
    public final void LIZIZ() {
        EnumC19384410sc value;
        super.LIZIZ();
        C19390510tb c19390510tb = this.LJIJI;
        if (c19390510tb != null) {
            c19390510tb.LL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            c19390510tb.getViewModelStore().clear();
            c19390510tb.LJI();
        }
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM == null || (value = pipFeedWindowVM.LLILLJJLI.getValue()) == null) {
            return;
        }
        C19390810te.LIZIZ(new C19390910tf(value, this.LJIIIIZZ, this.LJIIIZ, this.LJIILJJIL));
    }

    @Override // X.AbstractC19391210ti
    public final C19386210su LJ() {
        return this.LJIJJLI;
    }

    public C19390710td(Context context) {
        super(context);
        this.LJIJJLI = new C19386210su(AbstractC19391210ti.LJIIZILJ, true, C19384810sg.LIZIZ(EnumC19384410sc.valueOf(C19390810te.LIZ().getString("last_window_size", LivePreviewCTASmartDisplayManager.DEFAULT))));
        this.LJIL = C587650N3b.LIZ("PipFeedFloatingWindow");
    }

    @Override // X.AbstractC19391210ti
    public final void LIZJ(ValueAnimator valueAnimator) {
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM == null) {
            pipFeedWindowVM = null;
        }
        EnumC19384410sc value = pipFeedWindowVM.LLILLJJLI.getValue();
        if (value != null && pipFeedWindowVM.LLILZIL != value) {
            valueAnimator.addListener(new ALAdapterS23S0200000_29(pipFeedWindowVM, value, 21));
            for (InterfaceC1631620sYq interfaceC1631620sYq : (ArrayList) pipFeedWindowVM.LLILZLL) {
                EnumC19384410sc enumC19384410sc = pipFeedWindowVM.LLILZIL;
                if (enumC19384410sc != null) {
                    interfaceC1631620sYq.invoke(valueAnimator.getAnimatedValue(), enumC19384410sc, value);
                }
            }
        }
    }

    @Override // X.AbstractC19391210ti
    public final void LIZLLL(String str) {
        EnumC19384410sc value;
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM == null) {
            pipFeedWindowVM = null;
        }
        pipFeedWindowVM.LLILLL.postValue(str);
        PipFeedWindowVM pipFeedWindowVM2 = this.LJIJJ;
        if (pipFeedWindowVM2 != null && (value = pipFeedWindowVM2.LLILLJJLI.getValue()) != null) {
            C19390810te.LIZIZ(new C19390910tf(value, this.LJIIIIZZ, this.LJIIIZ, this.LJIILJJIL));
        }
    }

    @Override // X.AbstractC19391210ti
    public final void LJII(C19386110st c19386110st) {
        super.LJII(c19386110st);
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM == null) {
            pipFeedWindowVM = null;
        }
        pipFeedWindowVM.LLILZ.postValue(Boolean.TRUE);
    }

    public final C19390510tb LJIIJ(Context context) {
        View viewFindViewById;
        C19390510tb c19390510tb = new C19390510tb(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dv4, c19390510tb, true);
        c19390510tb.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        c19390510tb.LJ();
        Iterator<? extends AbstractC19385210sk> it2 = c19390510tb.LLILZIL.LIZ.iterator();
        while (it2.hasNext()) {
            for (AbstractC19390410ta abstractC19390410ta : (ArrayList) it2.next().LIZ) {
                int i = abstractC19390410ta.LL;
                if (i != -1) {
                    viewFindViewById = c19390510tb.findViewById(i);
                } else {
                    viewFindViewById = c19390510tb;
                }
                abstractC19390410ta.LLILZIL = c19390510tb.getContext();
                abstractC19390410ta.LLILZ = c19390510tb.getResources();
                if (viewFindViewById instanceof ViewGroup) {
                    View viewLJI = abstractC19390410ta.LJI(c19390510tb.getContext());
                    abstractC19390410ta.LLILLJJLI = viewLJI;
                    if (viewLJI != null) {
                        ((ViewGroup) viewFindViewById).addView(viewLJI);
                    }
                } else if (viewFindViewById instanceof ViewStub) {
                    abstractC19390410ta.LLILLJJLI = C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
                }
                View view = abstractC19390410ta.LLILLJJLI;
                if (view != null) {
                    abstractC19390410ta.LJIILJJIL(view);
                }
            }
        }
        this.LJIJI = c19390510tb;
        C19390510tb c19390510tb2 = this.LJIJI;
        if (c19390510tb2 != null) {
            PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) new ViewModelProvider(c19390510tb2.getViewModelStore(), c19390510tb2.getDefaultViewModelProviderFactory(), C903300Zc8.LIZJ).get(PipFeedWindowVM.class);
            this.LJIJJ = pipFeedWindowVM;
            PipFeedWindowVM pipFeedWindowVM2 = null;
            if (pipFeedWindowVM == null) {
                pipFeedWindowVM = null;
            }
            pipFeedWindowVM.LLILLJJLI.observe(c19390510tb2, new AObserverS231S0100000_29(this, 251));
            PipFeedWindowVM pipFeedWindowVM3 = this.LJIJJ;
            if (pipFeedWindowVM3 != null) {
                pipFeedWindowVM2 = pipFeedWindowVM3;
            }
            pipFeedWindowVM2.LL.observe(c19390510tb2, new AObserverS231S0100000_29(this, 252));
        }
        return c19390510tb;
    }

    public final void LJIIJJI(WindowManager.LayoutParams layoutParams) {
        int i;
        int i2;
        EnumC19384410sc enumC19384410scValueOf = EnumC19384410sc.valueOf(C19390810te.LIZ().getString("last_window_size", LivePreviewCTASmartDisplayManager.DEFAULT));
        boolean z = false;
        Point point = new Point(C19390810te.LIZ().getInt("last_window_position_x", 0), C19390810te.LIZ().getInt("last_window_position_y", 0));
        boolean z2 = C19390810te.LIZ().getBoolean("last_window_adhere_to_left", false);
        float f = C19390810te.LIZ().getFloat("last_window_position_y_relative", -1.0f);
        C19390910tf c19390910tf = new C19390910tf(enumC19384410scValueOf, point, z2, f);
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LJIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setDefaultPosition] recover last position with state ");
        sbLIZ.append(c19390910tf);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Rect rect = this.LIZLLL;
        if (z2) {
            i = rect.left;
        } else {
            i = rect.right;
        }
        layoutParams.x = i;
        Float fValueOf = Float.valueOf(f);
        float fFloatValue = fValueOf.floatValue();
        if (fFloatValue > 0.0f && fFloatValue < 1.0f) {
            z = true;
        }
        PipFeedWindowVM pipFeedWindowVM = null;
        if (z) {
            float fFloatValue2 = fValueOf.floatValue();
            int i3 = this.LJIIJJI;
            i2 = ((int) (fFloatValue2 * ((i3 - r1) - this.LJIILIIL))) + this.LJIIL;
        } else {
            i2 = point.y;
        }
        Rect rect2 = this.LIZLLL;
        layoutParams.y = C419990GdR.LIZIZ(i2, rect2.top, rect2.bottom);
        this.LJIIIZ = z2;
        PipFeedWindowVM pipFeedWindowVM2 = this.LJIJJ;
        if (pipFeedWindowVM2 != null) {
            pipFeedWindowVM = pipFeedWindowVM2;
        }
        pipFeedWindowVM.LLILLJJLI.setValue(enumC19384410scValueOf);
        this.LJIIIIZZ.set(layoutParams.x, layoutParams.y);
    }
}
