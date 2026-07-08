package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0Ijx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474990Ijx {
    public View LIZ;
    public View LIZIZ;
    public CompoundButton LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public DataChannel LJFF;
    public Context LJI;
    public boolean LJII;

    public final void LIZ() {
        if (this.LJ) {
            LIZIZ(false);
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Long l = (Long) dataChannelGlobal.gg0(C1148080fyw.class);
        long jLongValue = l != null ? l.longValue() : 3L;
        Long l2 = (Long) dataChannelGlobal.gg0(C1148090fyx.class);
        long jLongValue2 = l2 != null ? l2.longValue() : 3L;
        if (jLongValue != 1) {
            LIZIZ(false);
            return;
        }
        LIZIZ(true);
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        LIZIZ(true);
        CompoundButton compoundButton = this.LIZJ;
        if (compoundButton != null) {
            compoundButton.setEnabled(true);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            view2.setEnabled(true);
        }
        boolean z = jLongValue2 == 1;
        CompoundButton compoundButton2 = this.LIZJ;
        if (compoundButton2 != null) {
            compoundButton2.setChecked(z);
        }
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 289);
        View view3 = this.LIZ;
        if (view3 != null) {
            C786410Ut5.I7(null, view3);
        }
        View view4 = this.LIZLLL;
        if (view4 != null) {
            C786410Ut5.I7(aCListenerS142S0100000_7, view4);
        }
    }

    public final void LIZIZ(boolean z) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        if (this.LJII == z) {
            return;
        }
        this.LJII = z;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (z) {
            View view = this.LIZIZ;
            if (view != null) {
                layoutParams3 = view.getLayoutParams();
            }
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.bottomMargin = C439101nJ.LIZ(8);
            }
            C500260Jjc.LLFFF(this.LIZ);
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            layoutParams3 = view2.getLayoutParams();
        }
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.bottomMargin = C439101nJ.LIZ(16);
        }
        C500260Jjc.LJIILIIL(this.LIZ);
    }
}
