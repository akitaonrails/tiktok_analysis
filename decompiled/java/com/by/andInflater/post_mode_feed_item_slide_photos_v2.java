package com.by.andInflater;

import X.C0SLX;
import X.C12P4;
import X.C19ME;
import X.C716660S9g;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.i;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class post_mode_feed_item_slide_photos_v2 implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.qeg);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View c0slx = new C0SLX(context, null);
        c0slx.setId(R.id.qez);
        C19ME c19me = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me)) {
            c19me.verticalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(c0slx);
        if (c0slx.getParent() == null) {
            constraintLayout.addView(c0slx, c19me);
        }
        View view = new View(context);
        view.setId(R.id.qer);
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.LayoutParams c19me2 = new C19ME(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me2);
        }
        View c716660S9g = new C716660S9g(context);
        c716660S9g.setId(R.id.qen);
        c716660S9g.setBackgroundResource(R.drawable.aov);
        c716660S9g.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c716660S9g.getPaddingTop(), c716660S9g.getPaddingRight(), c716660S9g.getPaddingBottom());
        c716660S9g.setPadding(c716660S9g.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), c716660S9g.getPaddingRight(), c716660S9g.getPaddingBottom());
        c716660S9g.setPadding(c716660S9g.getPaddingLeft(), c716660S9g.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c716660S9g.getPaddingBottom());
        c716660S9g.setPadding(c716660S9g.getPaddingLeft(), c716660S9g.getPaddingTop(), c716660S9g.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, c716660S9g);
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        a.LIZ(c716660S9g);
        if (c716660S9g.getParent() == null) {
            constraintLayout.addView(c716660S9g, c19me3);
        }
        C12P4 c12p4 = new C12P4(context);
        c12p4.setId(R.id.m67);
        C786410Ut5.T4(c12p4, 0.0f);
        C19ME c19me4 = new C19ME(-1, (int) TypedValue.applyDimension(1, 114.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me4)) {
            ((LinearLayout.LayoutParams) c19me4).weight = 1;
        }
        new i();
        i.LIZ("app:tux_shadeColor", new a.b("2131099754", "attr"), c12p4);
        i.LIZ("app:tux_beginShadeOpacity", new a.c(".24"), c12p4);
        i.LIZ("app:tux_endShadeOpacity", new a.c(CardStruct.IStatusCode.DEFAULT), c12p4);
        i.LIZ("app:tux_shader", new a.c("ease_out"), c12p4);
        i.LIZ("app:tux_style", new a.c("vertical"), c12p4);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        android.view.a.LIZ(c12p4);
        if (c12p4.getParent() == null) {
            constraintLayout.addView(c12p4, c19me4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.m66);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        C786410Ut5.T4(tuxTextView, 0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zi});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setText(2131829936);
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), android.view.a.LIZIZ(R.attr.ou, context));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), 0.0f, tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(10.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        C19ME c19me5 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Bold"), tuxTextView);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me5);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.qeu);
        tuxIconView.setBackgroundResource(R.drawable.aov);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingTop(), tuxIconView.getPaddingRight(), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingRight(), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), tuxIconView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), tuxIconView.getPaddingTop(), tuxIconView.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setContentDescription(context.getResources().getString(2131824065));
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774027", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.qf0);
        viewStub.setInflatedId(R.id.qej);
        viewStub.setLayoutResource(R.layout.e_i);
        C19ME c19me7 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = 0;
        }
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            constraintLayout.addView(viewStub, c19me7);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
