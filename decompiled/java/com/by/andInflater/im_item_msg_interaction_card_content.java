package com.by.andInflater;

import X.C1294120jmU;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_interaction_card_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.kvn);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.qkl);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("2131296287", "dimen"), smartImageView);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d(CardStruct.IStatusCode.DEFAULT, "dp"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me);
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.fid);
        C786410Ut5.LJZI(8, smartImageView2);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 82.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            constraintLayout.addView(smartImageView2, c19me2);
        }
        C1294120jmU c1294120jmU = new C1294120jmU(context, null, 6);
        c1294120jmU.setId(R.id.ay0);
        C786410Ut5.LJLLLLLL(8, c1294120jmU);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 280.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        android.view.a.LIZ(c1294120jmU);
        if (c1294120jmU.getParent() == null) {
            constraintLayout.addView(c1294120jmU, c19me3);
        }
        SmartImageView smartImageView3 = new SmartImageView(context);
        smartImageView3.setId(R.id.hyk);
        C786410Ut5.LJZI(8, smartImageView3);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 280.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        android.view.a.LIZ(smartImageView3);
        if (smartImageView3.getParent() == null) {
            constraintLayout.addView(smartImageView3, c19me4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.exv);
        tuxTextView.setGravity(17);
        tuxTextView.setTextAlignment(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ej});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 280.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Regular"), tuxTextView);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me5);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
