package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03EA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EA {
    public static final C03EA LIZ = new C03EA();

    public static View LIZ(ViewGroup viewGroup, SizeGuide sizeGuide, int i) {
        if (sizeGuide == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setGravity(17);
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(R.attr.a1k);
        String str = sizeGuide.skuSizeGuideButtonText;
        if (str == null) {
            str = sizeGuide.skuSizeGuideTitle;
        }
        tuxTextView.setText(str);
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconView.setTintColorRes(R.attr.a1k);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(tuxIconView);
        return linearLayout;
    }
}
