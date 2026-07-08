package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Dht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnLayoutChangeListenerC346310Dht implements View.OnLayoutChangeListener {
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

    public ViewOnLayoutChangeListenerC346310Dht(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC346310Dht viewOnLayoutChangeListenerC346310Dht, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DialogC194308110g dialogC194308110g = (DialogC194308110g) viewOnLayoutChangeListenerC346310Dht.l0;
        int measuredHeight = view.getMeasuredHeight();
        dialogC194308110g.getClass();
        try {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((View) ((RelativeLayout) dialogC194308110g.findViewById(R.id.q9t)).getParent());
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setPeekHeight(measuredHeight);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC346310Dht);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC346310Dht viewOnLayoutChangeListenerC346310Dht, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC346310Dht);
        if (((InterfaceC20236714Gf) viewOnLayoutChangeListenerC346310Dht.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) viewOnLayoutChangeListenerC346310Dht.l0;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }
}
