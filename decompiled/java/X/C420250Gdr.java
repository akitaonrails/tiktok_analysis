package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Gdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420250Gdr {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static void LIZ(FrameLayout frameLayout, C419180Gc8 c419180Gc8, boolean z) {
        c419180Gc8.setTuxFont(72);
        Float fValueOf = Float.valueOf(4.0f);
        if (z) {
            C786410Ut5.LJZ(8, frameLayout);
            C786410Ut5.LLLLZLL(c419180Gc8, 0);
            c419180Gc8.setTextColorRes(R.attr.a09);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0h);
            c384050F3z.LIZJ = Float.valueOf(C0HD5.LIZIZ(c419180Gc8, fValueOf));
            c419180Gc8.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.a6(frameLayout, layoutParams);
            return;
        }
        C786410Ut5.LJZ(0, frameLayout);
        C786410Ut5.LLLLZLL(c419180Gc8, 0);
        c419180Gc8.setTextColorRes(R.attr.a1k);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C0HD5.LIZIZ(c419180Gc8, fValueOf));
        c419180Gc8.setBackground(c384050F3z2.LIZ(frameLayout.getContext()));
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.height = -2;
        C786410Ut5.a6(frameLayout, layoutParams2);
    }
}
