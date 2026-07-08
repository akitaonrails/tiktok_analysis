package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Ug7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778370Ug7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC778710Ugf interfaceC778710Ugf, LiveIconView liveIconView) {
        ColorStateList colorStateList;
        if (interfaceC778710Ugf == null) {
            C439101nJ.LJI(liveIconView);
            return;
        }
        if (interfaceC778710Ugf instanceof AbstractC778620UgW) {
            AbstractC778620UgW abstractC778620UgW = (AbstractC778620UgW) interfaceC778710Ugf;
            C1143680frq.LIZLLL(liveIconView, abstractC778620UgW.LIZ(), abstractC778620UgW.LIZIZ());
            C12ES.LJIILL(0, liveIconView);
            return;
        }
        if (interfaceC778710Ugf instanceof AbstractC778630UgX) {
            AbstractC778630UgX abstractC778630UgX = (AbstractC778630UgX) interfaceC778710Ugf;
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(abstractC778630UgX.LIZ());
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
            Drawable drawable = ((C778360Ug6) abstractC778630UgX).getIcon().LIZ;
            if (drawable != null) {
                c1324610kZfLJIIIZ.LJIIJJI = drawable;
            }
            c1324610kZfLJIIIZ.LJJI(liveIconView);
            C12ES.LJIILL(0, liveIconView);
            return;
        }
        if (interfaceC778710Ugf.getIcon() != null) {
            C778580UgS icon = interfaceC778710Ugf.getIcon();
            Drawable drawable2 = null;
            if (icon != null && icon.LIZ != null) {
                C778580UgS icon2 = interfaceC778710Ugf.getIcon();
                if (icon2 != null) {
                    colorStateList = icon2.LIZIZ;
                } else {
                    colorStateList = null;
                }
                liveIconView.setIconTintList(colorStateList);
                C778580UgS icon3 = interfaceC778710Ugf.getIcon();
                if (icon3 != null) {
                    drawable2 = icon3.LIZ;
                }
                liveIconView.setIcon(drawable2);
                C12ES.LJIILL(0, liveIconView);
                return;
            }
        }
        C439101nJ.LJI(liveIconView);
    }

    public static void LIZIZ(AbstractC777950UfR abstractC777950UfR, C16F5 c16f5, LiveIconView liveIconView, LiveIconView liveIconView2, C16F5 c16f52, View view, View view2, View.OnClickListener onClickListener, int i) {
        int iIntValue;
        int iLIZ = abstractC777950UfR.LIZ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c9j, C497740JfY.LJII());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -419430401;
        }
        c16f5.setTextColor(iIntValue);
        c16f52.setTextColor(iIntValue);
        if (iLIZ != -1) {
            i = iLIZ;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(4));
        gradientDrawable.setColor(i);
        if (view2 != null) {
            view2.setBackground(gradientDrawable);
        }
        C12ES.LJIILL(0, view);
        LIZ(abstractC777950UfR.LIZ, liveIconView2);
        LIZ(abstractC777950UfR.LIZIZ, liveIconView);
        c16f5.setText(abstractC777950UfR.LIZLLL());
        CharSequence charSequence = abstractC777950UfR.LIZJ;
        if (charSequence != null) {
            c16f52.setText(charSequence);
            C12ES.LJIILL(0, c16f52);
        } else {
            C439101nJ.LJI(c16f52);
        }
        if (!C500260Jjc.LJJJJIZL(liveIconView) && !C500260Jjc.LJJJJIZL(c16f52)) {
            C439101nJ.LJI(view);
            if (view2 != null) {
                C786410Ut5.I7(null, view2);
                return;
            }
            return;
        }
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(onClickListener, 1097));
    }
}
