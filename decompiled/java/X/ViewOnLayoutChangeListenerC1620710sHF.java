package X;

import Y.ARunnableS124S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.series.feed.tab.skylight.SeriesSkyLightAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewOnLayoutChangeListenerC1620710sHF implements View.OnLayoutChangeListener {
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
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1620710sHF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            ((C1592370rXX) viewOnLayoutChangeListenerC1620710sHF.l0).LIZJ();
            ((C1592370rXX) viewOnLayoutChangeListenerC1620710sHF.l0).LIZ();
            Function0<Unit> function0 = ((C1592370rXX) viewOnLayoutChangeListenerC1620710sHF.l0).LLJ;
            if (function0 != null) {
                function0.invoke();
            }
            C1592370rXX c1592370rXX = (C1592370rXX) viewOnLayoutChangeListenerC1620710sHF.l0;
            HandlerHook.viewPost(c1592370rXX, new ARunnableS124S0100000_24(c1592370rXX, 2));
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((SeriesSkyLightAssem) viewOnLayoutChangeListenerC1620710sHF.l0).Ho();
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AutoScrollComponent autoScrollComponent = (AutoScrollComponent) viewOnLayoutChangeListenerC1620710sHF.l0;
        if (autoScrollComponent.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            ((LiveData) autoScrollComponent.LLLI.getValue()).setValue(-1);
        } else {
            ((LiveData) autoScrollComponent.LLLI.getValue()).setValue(Integer.valueOf(i4));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int iIntValue;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1620710sHF);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewOnLayoutChangeListenerC1620710sHF.l0;
        Integer numValueOf = Integer.valueOf(view.getBottom());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (Boolean.valueOf(z).booleanValue()) {
            iIntValue = Integer.valueOf(numValueOf.intValue() + AutoScrollComponent.LLLIL).intValue();
        } else {
            iIntValue = AutoScrollComponent.LLLIILIL;
        }
        marginLayoutParams.topMargin = iIntValue;
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1620710sHF);
        C1592450rXf c1592450rXf = (C1592450rXf) viewOnLayoutChangeListenerC1620710sHF.l0;
        c1592450rXf.LJIIIIZZ(c1592450rXf.getSelectedTabPosition());
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1620710sHF);
        if (((MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0).LLILLJJLI.getTabLayoutScrollRange() > 0) {
            if ((((MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0).LLILLJJLI.getSelectedScrollX() == 0 || ((MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0).LLILLJJLI.getSelectedScrollX() != ((MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0).LLILLJJLI.getScrollX()) && !((MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0).LLILLJJLI.LJIILLIIL()) {
                MainTabStrip mainTabStrip = (MainTabStrip) viewOnLayoutChangeListenerC1620710sHF.l0;
                mainTabStrip.LLILLJJLI.LJIIIIZZ(mainTabStrip.LLJ);
            }
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1620710sHF viewOnLayoutChangeListenerC1620710sHF, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1563660qnE) viewOnLayoutChangeListenerC1620710sHF.l0).LIZIZ.LIZJ(new C1557630qdV(new InterfaceC1557660qdY() { // from class: X.0qda
        }));
    }
}
