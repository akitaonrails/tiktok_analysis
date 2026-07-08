package X;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0thJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675310thJ {
    public static final int LIZIZ(Context context) {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(context);
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context);
        return statusBarHeight + C366700EZg.LIZ(14.0d) + ((((((fullScreenHeight - statusBarHeight) - C366700EZg.LIZ(14.0d)) - ScreenUtils.getScreenWidth(context)) - c0.LIZ.p2()) - C366700EZg.LIZ(120.0d)) / 2);
    }

    public static final int[] LIZ(int i, int i2, View view) {
        boolean z;
        int iLLJJJJLIIL;
        int iN2;
        float f = i / i2;
        if (f == 0.75f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0CHQ.LIZ().LJJJJJ().getNowUIService().resetSurface(view, C0CHQ.LIZ);
            return new int[]{0, C0CHQ.LIZ().LJJJJJ().getNowUIService().getSurfaceTopMargin(C0CHQ.LIZ)};
        }
        if (f == 1.0f) {
            view.setClipToOutline(true);
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZf
                public final Float LIZ = null;
                public final float LIZIZ = 0.08f;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (view2 == null) {
                        return;
                    }
                    if (this.LIZ != null) {
                        if (outline != null) {
                            outline.setRoundRect(new Rect(0, 0, view2.getWidth(), view2.getHeight()), this.LIZ.floatValue());
                        }
                    } else {
                        if (outline == null) {
                            return;
                        }
                        outline.setRoundRect(new Rect(0, 0, view2.getWidth(), view2.getHeight()), view2.getWidth() * this.LIZIZ);
                    }
                }
            });
            int screenWidth = ScreenUtils.getScreenWidth(view.getContext());
            c0.LIZ.t2(screenWidth, screenWidth);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.width = screenWidth;
            marginLayoutParams.height = screenWidth;
            C426750GoL.LJIIJ(marginLayoutParams, view.getContext(), 0, Integer.valueOf(LIZIZ(view.getContext())), 0, 0, 32);
            C786410Ut5.W5(view, marginLayoutParams);
            return new int[]{0, LIZIZ(view.getContext())};
        }
        InterfaceC1674890tgd interfaceC1674890tgd = C196909122h.LIZJ;
        if (interfaceC1674890tgd != null) {
            interfaceC1674890tgd.q2(i, i2, view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        InterfaceC1674890tgd interfaceC1674890tgd2 = C196909122h.LIZJ;
        if (interfaceC1674890tgd2 != null) {
            iLLJJJJLIIL = interfaceC1674890tgd2.LLJJJJLIIL();
        } else {
            iLLJJJJLIIL = 0;
        }
        InterfaceC1674890tgd interfaceC1674890tgd3 = C196909122h.LIZJ;
        if (interfaceC1674890tgd3 != null) {
            iN2 = interfaceC1674890tgd3.n2();
        } else {
            iN2 = 0;
        }
        if (C196909122h.LIZJ instanceof c0) {
            return new int[]{(ScreenUtils.getScreenWidth(view.getContext()) - layoutParams.width) >> 1, iN2};
        }
        if (i * 16 > ((double) i2) * 9.01d) {
            return new int[]{0, (((ScreenUtils.getFullScreenHeight(view.getContext()) - iLLJJJJLIIL) - layoutParams.height) / 2) + iN2};
        }
        return new int[]{(ScreenUtils.getScreenWidth(view.getContext()) - layoutParams.width) >> 1, iN2};
    }
}
