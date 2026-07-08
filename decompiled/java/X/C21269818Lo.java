package X;

import Y.ARunnableS11S1100000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.18Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269818Lo {
    public static final C21269818Lo LIZ = new C21269818Lo();
    public static final int LIZIZ = C0H9I.LIZ(4.0d);
    public static final int LIZJ = C0H9I.LIZ(7.0d);
    public static final int LIZLLL = C0H9I.LIZ(8.0d);
    public static final int LJ = C0H9I.LIZ(12.0d);
    public static final int LJFF = C0H9I.LIZ(16.0d);

    public static void LIZIZ(TuxTextView tuxTextView) {
        if (tuxTextView == null) {
            return;
        }
        HandlerHook.viewPost(tuxTextView, new ARunnableS11S1100000_6(tuxTextView, tuxTextView.getText().toString(), 1));
    }

    public static void LIZJ(View view, boolean z, boolean z2, AnchorProductInfoModel anchorProductInfoModel) {
        Integer num = anchorProductInfoModel.extraData.platform;
        if (num != null && num.intValue() == 5) {
            if (view instanceof TuxIconView) {
                TuxIconView tuxIconView = (TuxIconView) view;
                C786410Ut5.LJLLLLLL(0, tuxIconView);
                tuxIconView.setIconRes(R.raw.icon_add_shopping_cart_ltr);
                tuxIconView.setBackground(null);
                if (z) {
                    tuxIconView.setTintColorRes(R.attr.a04);
                    return;
                } else {
                    if (!z2) {
                        return;
                    }
                    tuxIconView.setTintColorRes(R.attr.a1p);
                    return;
                }
            }
            if (!(view instanceof C197039127h)) {
                return;
            }
            C197039127h c197039127h = (C197039127h) view;
            if (z) {
                c197039127h.setEnabled(true);
                return;
            } else {
                if (!z2) {
                    return;
                }
                c197039127h.setEnabled(false);
                c197039127h.setSupportClickWhenDisable(true);
                return;
            }
        }
        C12ES.LJIILL(4, view);
    }

    public static C21270018Lq LIZ(C21269818Lo c21269818Lo, List list, boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        boolean z2 = z;
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        if ((i4 & 4) != 0) {
            i7 = LJFF;
        }
        if ((i4 & 8) != 0) {
            i6 = LJ;
        }
        if ((i4 & 16) != 0) {
            i5 = LIZIZ;
        }
        c21269818Lo.getClass();
        return new C21270018Lq(i6, i5, list, i7, z2);
    }
}
