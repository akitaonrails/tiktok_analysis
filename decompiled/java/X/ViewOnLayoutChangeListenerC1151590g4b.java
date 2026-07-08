package X;

import Y.ARunnableS23S0201000_17;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0g4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewOnLayoutChangeListenerC1151590g4b implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public ViewOnLayoutChangeListenerC1151590g4b(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ViewOnLayoutChangeListenerC1151590g4b(C1103970epn c1103970epn, int i, AnonymousClass0151 anonymousClass0151, int i2) {
        this.$t = i2;
        this.l0 = c1103970epn;
        this.l1 = anonymousClass0151;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1151590g4b viewOnLayoutChangeListenerC1151590g4b, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC1103990epp interfaceC1103990epp = ((C1103970epn) viewOnLayoutChangeListenerC1151590g4b.l0).LL;
        ((AnonymousClass0151) viewOnLayoutChangeListenerC1151590g4b.l1).getBoardId();
        interfaceC1103990epp.LIZIZ(i4 - i2);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1151590g4b viewOnLayoutChangeListenerC1151590g4b, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((Runnable) viewOnLayoutChangeListenerC1151590g4b.l0).run();
        LinearLayout linearLayoutA1 = ((OnlineAudienceRankWidget) viewOnLayoutChangeListenerC1151590g4b.l1).A1();
        if (linearLayoutA1 != null) {
            linearLayoutA1.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151590g4b);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1151590g4b viewOnLayoutChangeListenerC1151590g4b, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HandlerHook.viewPost(view, new ARunnableS23S0201000_17(i4, (AbstractC1080560eE2) viewOnLayoutChangeListenerC1151590g4b.l1, (C1082400eH0) viewOnLayoutChangeListenerC1151590g4b.l0, 7));
    }
}
