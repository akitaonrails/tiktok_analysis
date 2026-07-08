package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_mention_panel implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        C786410Ut5.LJLLLLLL(8, constraintLayout);
        constraintLayout.setFocusable(true);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), viewGroup);
        View view = new View(context);
        view.setId(R.id.o1b);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.oz});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.o5z);
        recyclerView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 84.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        a.LIZ(recyclerView);
        if (recyclerView.getParent() == null) {
            constraintLayout.addView(recyclerView, c19me2);
        }
        TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(context);
        tuxSkeletonLayout.setId(R.id.o5y);
        tuxSkeletonLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxSkeletonLayout.getPaddingTop(), tuxSkeletonLayout.getPaddingRight(), tuxSkeletonLayout.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, tuxSkeletonLayout);
        C19ME c19me3 = new C19ME(-1, (int) TypedValue.applyDimension(1, 84.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        new jem.a();
        jem.a.LIZ("app:tux_skeletonLoading", new a.c("true"), tuxSkeletonLayout);
        jem.a.LIZ("app:tux_skeletonPreviewItem", new a.b("2131562691", "layout"), tuxSkeletonLayout);
        jem.a.LIZ("app:tux_skeletonRepeat", new a.c(CardStruct.IStatusCode.DEFAULT), tuxSkeletonLayout);
        jem.a.LIZ("app:tux_skeletonRepeatOrientation", new a.c("horizontal"), tuxSkeletonLayout);
        android.view.a.LIZ(tuxSkeletonLayout);
        if (tuxSkeletonLayout.getParent() == null) {
            constraintLayout.addView(tuxSkeletonLayout, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
