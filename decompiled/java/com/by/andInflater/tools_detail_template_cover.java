package com.by.andInflater;

import X.C20627315nb;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class tools_detail_template_cover implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(context);
        tuxSkeletonLayout.setId(R.id.trb);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        new jem.a();
        jem.a.LIZ("app:tux_skeletonLoading", new a.c("false"), tuxSkeletonLayout);
        C20627315nb c20627315nb = new C20627315nb(context, null, 6);
        c20627315nb.setId(R.id.bk_);
        C786410Ut5.LJLLLLLL(8, c20627315nb);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), tuxSkeletonLayout);
        android.view.a.LIZ(c20627315nb);
        if (c20627315nb.getParent() == null) {
            tuxSkeletonLayout.addView(c20627315nb, marginLayoutParamsLJ2);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.bh2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-1, -1, tuxSkeletonLayout);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("fitCenter"), smartImageView);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), smartImageView);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), smartImageView);
        cVar.LIZIZ("app:placeholderImage", new a.b("2130971108", "drawable"), smartImageView);
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("null", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            tuxSkeletonLayout.addView(smartImageView, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(tuxSkeletonLayout);
        C786410Ut5.W5(tuxSkeletonLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxSkeletonLayout);
        }
        return tuxSkeletonLayout;
    }
}
