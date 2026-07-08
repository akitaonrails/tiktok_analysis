package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import nv7.c0;

/* JADX INFO: renamed from: X.0t21, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649710t21 implements InterfaceC487670JAn {
    public final /* synthetic */ ViewGroup LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C1649710t21(C19GS c19gs, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = c19gs;
    }

    @Override // X.InterfaceC487670JAn
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        Context context = this.LIZIZ;
        c0 c0Var = c0.LIZ;
        c0Var.LJII();
        View viewFindViewById = view.findViewById(R.id.kgb);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(context) + context.getResources().getDimensionPixelSize(R.dimen.adk);
        C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        c0Var.LJIIIIZZ();
        View viewFindViewById2 = view.findViewById(R.id.tp4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById2.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin + C0LEO.LIZ());
        C786410Ut5.W5(viewFindViewById2, layoutParams);
        if (C1649700t20.LIZ) {
            this.LIZ.addView(view);
        }
    }
}
