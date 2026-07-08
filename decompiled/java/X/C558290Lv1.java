package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Lv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558290Lv1 {
    public Context LIZ;
    public C558300Lv2 LIZIZ = new C558300Lv2("", null, null, null, false, false, 144, 48, null, false);
    public View LIZJ;

    public final void LIZ() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void LIZIZ() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void LIZLLL() {
        View view = this.LIZJ;
        if (view == null) {
            return;
        }
        Context context = this.LIZ;
        if (context == null) {
            context = view.getContext();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) C12ES.LIZJ(this.LIZIZ.getWidthDp(), context);
            layoutParams.height = (int) C12ES.LIZJ(this.LIZIZ.getHeightDp(), context);
            C786410Ut5.W5(view, layoutParams);
        }
        TextView textView = (TextView) view.findViewById(R.id.dhh);
        if (textView != null) {
            textView.setText(this.LIZIZ.getText());
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dhc);
        if (this.LIZIZ.getIconRes() != null) {
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            Integer iconRes = this.LIZIZ.getIconRes();
            if (iconRes != null) {
                tuxIconView.setIconRes(iconRes.intValue());
            }
        } else if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.bh2);
        C1847590yBB c1847590yBB = (C1847590yBB) view.findViewById(R.id.amw);
        String avatarUrl = this.LIZIZ.getAvatarUrl();
        if (avatarUrl == null || a0.LJJJIL(avatarUrl)) {
            View viewFindViewById = view.findViewById(R.id.bi2);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (c1847590yBB != null) {
                c1847590yBB.setHollowTemplateBitmap(null);
            }
        } else {
            Uri uri = UriProtector.parse(avatarUrl);
            View viewFindViewById2 = view.findViewById(R.id.bi2);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
            c1331670kl3LJI.LJJIJL(context);
            c1331670kl3LJI.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJI);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.user_name);
        if (this.LIZIZ.getUserName() != null) {
            C786410Ut5.LLIL(textView2, 0);
            textView2.setText(this.LIZIZ.getUserName());
        } else {
            C786410Ut5.LLIL(textView2, 8);
        }
        View viewFindViewById3 = view.findViewById(R.id.amx);
        if (this.LIZIZ.getShowAiBadge()) {
            if (c1847590yBB != null) {
                int visibility = c1847590yBB.getVisibility();
                c1847590yBB.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1847590yBB);
            }
            if (viewFindViewById3 != null) {
                C0GZ3.LIZ(viewFindViewById3);
            }
        } else if (c1847590yBB != null) {
            int visibility2 = c1847590yBB.getVisibility();
            c1847590yBB.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1847590yBB);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context);
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setCornerRadius(C12ES.LIZJ(100.0f, context));
        view.setBackground(gradientDrawable);
        C786410Ut5.I7(new AkS80S0100000_8(this, 0), view);
        C786410Ut5.LJLLLLLL(this.LIZIZ.getVisible() ? 0 : 8, view);
    }

    public final void LIZJ(C558300Lv2 c558300Lv2) {
        this.LIZIZ = c558300Lv2;
        LIZLLL();
    }
}
