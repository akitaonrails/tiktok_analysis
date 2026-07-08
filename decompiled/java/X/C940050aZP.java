package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940050aZP implements InterfaceC2181941AaO {
    public Rect LIZ;
    public final /* synthetic */ C940020aZM LIZIZ;

    @Override // X.InterfaceC2181941AaO
    public final void init() {
    }

    @Override // X.InterfaceC2181941AaO
    public final void reset() {
        this.LIZ = null;
    }

    @Override // X.InterfaceC2181941AaO
    public final Pair<Integer, Integer> getResolution() {
        C940020aZM c940020aZM = this.LIZIZ;
        Pair<Integer, Integer> pair = c940020aZM.LLJJL;
        if (pair != null) {
            return pair;
        }
        InterfaceC940300aZo interfaceC940300aZo = c940020aZM.LLJLILLLLZIIL;
        if (interfaceC940300aZo != null) {
            return interfaceC940300aZo.getVideoSize();
        }
        return null;
    }

    @Override // X.InterfaceC2181941AaO
    public final Rect getSize() {
        return this.LIZ;
    }

    public C940050aZP(C940020aZM c940020aZM) {
        this.LIZIZ = c940020aZM;
    }

    @Override // X.InterfaceC2181941AaO
    public final void LIZIZ(int i, int i2) {
        this.LIZIZ.LLJJL = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC2181941AaO
    public final void LIZ(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams;
        Rect rect = new Rect(i, i2, i3, i4);
        this.LIZ = rect;
        this.LIZIZ.getClass();
        if (this.LIZIZ.LJIIIZ() != null) {
            C940020aZM c940020aZM = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSize rect:");
            sbLIZ.append(rect);
            sbLIZ.append(" renderView:");
            sbLIZ.append(c940020aZM.LLJJIII);
            sbLIZ.append(" lp:");
            View view = c940020aZM.LLJJIII;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (view != null) {
                layoutParams2 = view.getLayoutParams();
            }
            sbLIZ.append(layoutParams2);
            C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
            View view2 = c940020aZM.LLJJIII;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams.width = rect.width();
                    layoutParams.height = rect.height();
                    layoutParams.leftMargin = rect.left;
                    layoutParams.topMargin = rect.top;
                    layoutParams.gravity = 8388659;
                    C786410Ut5.W5(view2, layoutParams);
                }
            }
        }
        Function1<? super Rect, Unit> function1 = this.LIZIZ.LLJLLIL;
        if (function1 != null) {
            function1.invoke(rect);
        }
    }
}
