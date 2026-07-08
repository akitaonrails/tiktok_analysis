package X;

import android.view.View;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFanPrivilegeContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.summary.PaymentSummaryPanelDialog;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3MusicTitleAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3PageStateComponent;

/* JADX INFO: renamed from: X.1Amg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewOnLayoutChangeListenerC2189561Amg implements View.OnLayoutChangeListener {
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

    public ViewOnLayoutChangeListenerC2189561Amg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((SuperFanPrivilegeContentAssem) viewOnLayoutChangeListenerC2189561Amg.l0).kp();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2189561Amg);
        ((PaymentSummaryPanelDialog) viewOnLayoutChangeListenerC2189561Amg.l0).OR();
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (i9 == i7 - i5 && i10 == i11) {
            return;
        }
        ((FriendsV3MusicTitleAssem) viewOnLayoutChangeListenerC2189561Amg.l0).Zq(i9, i10);
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((FriendsV3PageStateComponent) viewOnLayoutChangeListenerC2189561Amg.l0).So(EnumC21696919vj.LAYOUT_CHANGE);
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float textSize = ((C1A51) viewOnLayoutChangeListenerC2189561Amg.l0).getTextSize();
        if (textSize != 0.0f) {
            C1A51 c1a51 = (C1A51) viewOnLayoutChangeListenerC2189561Amg.l0;
            if (textSize != c1a51.LLJJ) {
                c1a51.LLJJ = textSize;
                c1a51.getClass();
            }
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C21657819pQ) viewOnLayoutChangeListenerC2189561Amg.l0).LIZ();
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC2189561Amg viewOnLayoutChangeListenerC2189561Amg, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = ((C1AJP) viewOnLayoutChangeListenerC2189561Amg.l0).LLILZIL;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2189561Amg);
        }
        View view3 = ((C1AJP) viewOnLayoutChangeListenerC2189561Amg.l0).LLILZIL;
        if (view3 != null) {
            ((C1AJP) viewOnLayoutChangeListenerC2189561Amg.l0).LLIZ[1] = view3.getTop();
        }
        C1AJP c1ajp = (C1AJP) viewOnLayoutChangeListenerC2189561Amg.l0;
        InterfaceC2177371AJj interfaceC2177371AJj = c1ajp.LLJJJJLIIL;
        if (interfaceC2177371AJj != null) {
            interfaceC2177371AJj.LJJJJLL(c1ajp.LLIZ);
        }
    }
}
