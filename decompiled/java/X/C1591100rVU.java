package X;

import android.text.TextPaint;
import com.bytedance.tux.input.TuxTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0rVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591100rVU {
    public static WeakReference<C1592950rYT> LIZIZ;
    public static AbstractC1591090rVT LIZLLL;
    public static final C1591100rVU LIZ = new C1591100rVU();
    public static String LIZJ = "";

    public static void LIZ(String str) {
        C1592950rYT c1592950rYT;
        TuxTextView tabTitleView;
        float fLIZIZ;
        WeakReference<C1592950rYT> weakReference = LIZIZ;
        if (weakReference != null && (c1592950rYT = weakReference.get()) != null && (tabTitleView = c1592950rYT.getTabTitleView()) != null) {
            int width = tabTitleView.getWidth();
            if (width <= 0) {
                width = C497820Jfg.LIZIZ(tabTitleView.getContext()) / 5;
            }
            if (C20588115hH.LIZLLL(tabTitleView, str, new TextPaint(), width, Float.valueOf(C418440Gaw.LIZIZ(10)), true).getLineCount() > 1) {
                if (C20588115hH.LIZLLL(tabTitleView, str, new TextPaint(), width, Float.valueOf(C418440Gaw.LIZIZ(9)), true).getLineCount() > 1) {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(9);
                }
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(10);
            }
            AbstractC1591090rVT abstractC1591090rVT = LIZLLL;
            if (abstractC1591090rVT == null) {
                abstractC1591090rVT = null;
            }
            abstractC1591090rVT.LJJJJIZL(fLIZIZ);
            tabTitleView.setText(str);
        }
    }
}
