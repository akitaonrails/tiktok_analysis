package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C19MW;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_share_card_not_in_live implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.unlive_title_tv);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(3);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(2131847878);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zk});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-2, -2, viewGroup);
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).topToTop = 0;
        }
        if (C19ME.class.isInstance(layoutParamsLJ)) {
            ((C19ME) layoutParamsLJ).bottomToTop = R.id.unlive_avatar_iv;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            viewGroup.addView(tuxTextView, layoutParamsLJ);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.unlive_avatar_iv);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = android.view.a.LJ((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).bottomToTop = R.id.unlive_name_tv;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundAsCircle", new a.c("true"), smartImageView);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131099768", "attr"), smartImageView);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("1", "dp"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            viewGroup.addView(smartImageView, marginLayoutParamsLJ);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.unlive_name_tv);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ2)) {
            ((C19ME) marginLayoutParamsLJ2).bottomToTop = R.id.unlive_btn_barrier;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            viewGroup.addView(tuxTextView2, marginLayoutParamsLJ2);
        }
        C19MW c19mw = new C19MW(context);
        c19mw.setId(R.id.unlive_btn_barrier);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-2, -2, viewGroup);
        new ule.a();
        ule.a.LIZ(new a.c("top"), c19mw);
        c19mw.setReferencedIds(new int[]{R.id.unlive_follow_iv, R.id.unlive_more_video_tv});
        android.view.a.LIZ(c19mw);
        if (c19mw.getParent() == null) {
            viewGroup.addView(c19mw, layoutParamsLJ2);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.unlive_follow_iv);
        c197039127h.setText(2131847876);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        c197039127h.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        c197039127h.setBackgroundResource(R.drawable.c__);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) resources.getDimension(R.dimen.sn);
        }
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("false"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ3)) {
            ((C19ME) marginLayoutParamsLJ3).bottomToBottom = 0;
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            viewGroup.addView(c197039127h, marginLayoutParamsLJ3);
        }
        C197039127h c197039127h2 = new C197039127h(context);
        c197039127h2.setId(R.id.unlive_more_video_tv);
        c197039127h2.setBackgroundResource(R.drawable.c_a);
        c197039127h2.setText(2131847877);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        c197039127h2.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.bottomMargin = (int) resources.getDimension(R.dimen.sn);
        }
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("false"), c197039127h2);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h2);
        f.LIZ("app:tux_buttonVariant", new a.c("none"), c197039127h2);
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).startToStart = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ4)) {
            ((C19ME) marginLayoutParamsLJ4).bottomToBottom = 0;
        }
        android.view.a.LIZ(c197039127h2);
        if (c197039127h2.getParent() == null) {
            viewGroup.addView(c197039127h2, marginLayoutParamsLJ4);
        }
        return viewGroup;
    }
}
