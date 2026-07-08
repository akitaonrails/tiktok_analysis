package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import nv7.c0;

/* JADX INFO: renamed from: X.0t22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649720t22 {
    public static final void LIZIZ(ViewGroup viewGroup) {
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
            C786410Ut5.LJLZ(8, viewGroup);
        }
        C1649700t20.LIZ = false;
    }

    public static final void LIZ(final Context context, final ViewGroup viewGroup, boolean z, final boolean z2, final C1DRG c1drg) {
        if (z) {
            C18L3 c18l3 = new C18L3(context);
            C1649700t20.LIZ = true;
            c18l3.LIZ(R.layout.vx, viewGroup, new InterfaceC487670JAn() { // from class: X.0t1z
                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    int i2;
                    View viewFindViewById = view.findViewById(R.id.top);
                    int statusBarHeight = ScreenUtils.getStatusBarHeight(context);
                    View viewFindViewById2 = view.findViewById(R.id.s9p);
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    int visibility = viewFindViewById2.getVisibility();
                    viewFindViewById2.setVisibility(i2);
                    C1602160rnK.LIZIZ(visibility, i2, viewFindViewById2);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.adm) + statusBarHeight;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
                    marginLayoutParams.topMargin = dimensionPixelSize;
                    C786410Ut5.W5(viewFindViewById2, marginLayoutParams);
                    int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.adk) + statusBarHeight;
                    if (viewFindViewById != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                        marginLayoutParams2.topMargin = dimensionPixelSize2;
                        C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
                    }
                    View viewFindViewById3 = view.findViewById(R.id.kgb);
                    int dimensionPixelSize3 = statusBarHeight + context.getResources().getDimensionPixelSize(R.dimen.adk);
                    if (viewFindViewById3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) viewFindViewById3.getLayoutParams();
                        marginLayoutParams3.topMargin = dimensionPixelSize3;
                        C786410Ut5.W5(viewFindViewById3, marginLayoutParams3);
                    }
                    ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = (ViewOnTouchListenerC1649580t1o) view.findViewById(R.id.ste);
                    viewOnTouchListenerC1649580t1o.setObjectContainer(c1drg);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewOnTouchListenerC1649580t1o.getLayoutParams();
                    c0.LIZ.LJIIIIZZ();
                    layoutParams.bottomMargin = C0LEO.LIZ() + C366700EZg.LIZ(40.0d);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1649580t1o);
                    viewOnTouchListenerC1649580t1o.setLayoutParams(layoutParams);
                    if (C1649700t20.LIZ) {
                        viewGroup.addView(view);
                    }
                }
            });
        }
    }
}
