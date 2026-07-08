package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_effect_share_card_content implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RoundingCornerLayoutLL roundingCornerLayoutLL = new RoundingCornerLayoutLL(context);
        roundingCornerLayoutLL.setId(R.id.evm);
        roundingCornerLayoutLL.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), -2, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding((int) resources.getDimension(R.dimen.sb), (int) resources.getDimension(R.dimen.sb), (int) resources.getDimension(R.dimen.sb), (int) resources.getDimension(R.dimen.sb));
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, roundingCornerLayoutLL);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.gwk);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        c cVar = new c();
        cVar.LIZIZ("fresco:placeholderImage", new a.b("2130972297", "drawable"), smartImageView);
        cVar.LIZIZ("fresco:roundedCornerRadius", new a.b("2131296285", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.y3j);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        tuxTextView.setPadding((int) resources.getDimension(R.dimen.sz), tuxTextView.getPaddingTop(), (int) resources.getDimension(R.dimen.sz), tuxTextView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) resources.getDimension(R.dimen.sb);
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.foa;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.gwk;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalChainStyle = 2;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Semibold"), tuxTextView);
        tuxTextView.setLineSpacing(0.0f, 1.0f);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.foa);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.y3j;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.use_effect_btn);
        c197039127h.setGravity(17);
        c197039127h.setText(2131857979);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) resources.getDimension(R.dimen.sb);
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.foa;
        }
        new f();
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("H4_Semibold"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me4);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            roundingCornerLayoutLL.addView(constraintLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(roundingCornerLayoutLL);
        C786410Ut5.W5(roundingCornerLayoutLL, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayoutLL);
        }
        return roundingCornerLayoutLL;
    }
}
