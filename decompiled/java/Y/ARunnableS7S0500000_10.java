package Y;

import X.AbstractC683590Qrd;
import X.C0P0T;
import X.C0QSB;
import X.C118300cf;
import X.C1391600mJi;
import X.C1C7U;
import X.C21415018rM;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C639530P6p;
import X.C669090QMh;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import android.content.Context;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.MixedRoundFloatingButtonAssem;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel.SearchMiddleBubbleViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS7S0500000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TuxIconView tuxIconView;
        MutableLiveData<Boolean> mutableLiveData;
        if (((MixedRoundFloatingButtonAssem) this.l0).LLJILLL && ((UIAssem) this.l1).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && (tuxIconView = ((MixedRoundFloatingButtonAssem) this.l0).LLJLILLLLZIIL) != null && tuxIconView.getParent() != null) {
            SearchMiddleBubbleViewModel searchMiddleBubbleViewModel = (SearchMiddleBubbleViewModel) ((MixedRoundFloatingButtonAssem) this.l0).LLLFFI.getValue();
            if (searchMiddleBubbleViewModel == null || (mutableLiveData = searchMiddleBubbleViewModel.LL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                MixedRoundFloatingButtonAssem mixedRoundFloatingButtonAssem = (MixedRoundFloatingButtonAssem) this.l0;
                C450720Hlu c450720Hlu = new C450720Hlu((Context) this.l3);
                c450720Hlu.LLILZ = ((Context) this.l3).getString(2131849848);
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LJII = 2000L;
                c1391600mJi.LIZIZ = (TuxIconView) this.l2;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c450720Hlu.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-5));
                c450720Hlu.LIZLLL();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                c1391600mJi2.LJIIIIZZ = iLIZIZ;
                c1391600mJi2.LIZJ = (ViewGroup) this.l4;
                c1391600mJi2.LJIJJ = true;
                c1391600mJi2.LJIJJLI = false;
                c450720Hlu.LJ(new AwS554S0100000_10((MixedRoundFloatingButtonAssem) this.l0, 391));
                c450720Hlu.LIZJ(new AwS589S0100000_10((MixedRoundFloatingButtonAssem) this.l0, 175));
                c450720Hlu.LJIIIZ(true, new ACListenerS145S0100000_10((MixedRoundFloatingButtonAssem) this.l0, 20));
                mixedRoundFloatingButtonAssem.LLJILJILJ = c450720Hlu.LIZIZ();
                C0P0T c0p0t = ((MixedRoundFloatingButtonAssem) this.l0).LLJILJILJ;
                if (c0p0t != null) {
                    c0p0t.show();
                }
                C0QSB.LIZ.getClass();
                ((Keva) C0QSB.LIZIZ.getValue()).storeBoolean(C0QSB.LIZIZ(), true);
            }
        }
    }

    public final void LIZ$1() {
        C669090QMh c669090QMh = C669090QMh.LIZ;
        LinearLayout linearLayout = (LinearLayout) this.l0;
        c669090QMh.getClass();
        C669090QMh.LJII(linearLayout);
        ((C21415018rM) this.l1).setTextLayout((Layout) this.l2);
        if (((Layout) this.l3) == null) {
            C21415018rM c21415018rM = (C21415018rM) this.l4;
            if (c21415018rM != null) {
                C786410Ut5.LJLLLLLL(8, c21415018rM);
                return;
            }
            return;
        }
        C21415018rM c21415018rM2 = (C21415018rM) this.l4;
        if (c21415018rM2 != null) {
            C786410Ut5.LJLLLLLL(0, c21415018rM2);
        }
        C21415018rM c21415018rM3 = (C21415018rM) this.l4;
        if (c21415018rM3 != null) {
            c21415018rM3.setTextLayout((Layout) this.l3);
        }
    }

    public final void LIZ$2() {
        C669090QMh c669090QMh = C669090QMh.LIZ;
        LinearLayout linearLayout = (LinearLayout) this.l0;
        c669090QMh.getClass();
        C669090QMh.LJII(linearLayout);
        ((C21415018rM) this.l1).setTextLayout((Layout) this.l2);
        if (((Layout) this.l3) == null) {
            C21415018rM c21415018rM = (C21415018rM) this.l4;
            if (c21415018rM != null) {
                C786410Ut5.LJLLLLLL(8, c21415018rM);
                return;
            }
            return;
        }
        C21415018rM c21415018rM2 = (C21415018rM) this.l4;
        if (c21415018rM2 != null) {
            C786410Ut5.LJLLLLLL(0, c21415018rM2);
        }
        C21415018rM c21415018rM3 = (C21415018rM) this.l4;
        if (c21415018rM3 != null) {
            c21415018rM3.setTextLayout((Layout) this.l3);
        }
    }

    public static final void run$0(ARunnableS7S0500000_10 aRunnableS7S0500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MixedRoundFloatingButtonAssem@59d2.subscribeVM$2$1");
        try {
            aRunnableS7S0500000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixedRoundFloatingButtonAssem@59d2.subscribeVM$2$1");
    }

    public static final void run$1(ARunnableS7S0500000_10 aRunnableS7S0500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAsyncPreloadLynxHelper@2d8b.doPrefetchLynxWithPos$1");
        try {
            C639530P6p c639530P6p = C639530P6p.LIZ;
            int i = ((C118300cf) aRunnableS7S0500000_10.l0).element;
            int i2 = ((C118300cf) aRunnableS7S0500000_10.l1).element;
            List list = (List) aRunnableS7S0500000_10.l2;
            Context context = (Context) aRunnableS7S0500000_10.l3;
            AbstractC683590Qrd abstractC683590Qrd = (AbstractC683590Qrd) aRunnableS7S0500000_10.l4;
            c639530P6p.getClass();
            C639530P6p.LIZ(i, i2, list, context, abstractC683590Qrd);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAsyncPreloadLynxHelper@2d8b.doPrefetchLynxWithPos$1");
    }

    public static final void run$2(ARunnableS7S0500000_10 aRunnableS7S0500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SugTextUtils@7a47.bindRichSug$1$1");
        try {
            aRunnableS7S0500000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SugTextUtils@7a47.bindRichSug$1$1");
    }

    public static final void run$3(ARunnableS7S0500000_10 aRunnableS7S0500000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SugTextUtils@7a47.bindRichSug$1$2");
        try {
            aRunnableS7S0500000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SugTextUtils@7a47.bindRichSug$1$2");
    }

    public ARunnableS7S0500000_10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
