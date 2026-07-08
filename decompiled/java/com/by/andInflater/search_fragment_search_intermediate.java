package com.by.andInflater;

import X.C496570Jdf;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class search_fragment_search_intermediate implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.tpe);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.e3u);
        C786410Ut5.LLIIIJ(viewStub, 8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.kko);
        C786410Ut5.LLIIIJ(viewStub2, 8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams4);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.t0q);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.weight = 1;
        }
        a.LIZ(recyclerView);
        if (recyclerView.getParent() == null) {
            linearLayout.addView(recyclerView, layoutParams5);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams2);
        }
        C496570Jdf c496570Jdf = new C496570Jdf(context);
        c496570Jdf.setId(R.id.kwv);
        C786410Ut5.LJLLLLLL(8, c496570Jdf);
        ViewGroup.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, c496570Jdf);
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R.id.jpm);
        C786410Ut5.LJLLLLLL(8, recyclerView2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(recyclerView2);
        if (recyclerView2.getParent() == null) {
            linearLayout2.addView(recyclerView2, layoutParams7);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.tq1);
        linearLayout3.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams8);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            c496570Jdf.addView(linearLayout2, layoutParamsLJ);
        }
        a.LIZ(c496570Jdf);
        if (c496570Jdf.getParent() == null) {
            relativeLayout.addView(c496570Jdf, layoutParams6);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.chc);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(12, -1);
        }
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            relativeLayout.addView(viewStub3, layoutParams9);
        }
        a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
