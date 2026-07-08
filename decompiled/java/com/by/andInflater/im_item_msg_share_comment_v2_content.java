package com.by.andInflater;

import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.view.TightTuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_share_comment_v2_content implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.evm);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.bc4);
        linearLayout2.setGravity(48);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C427660Gpo c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.biz);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            linearLayout2.addView(c427660Gpo, layoutParams2);
        }
        TightTuxTextView tightTuxTextView = new TightTuxTextView(context);
        tightTuxTextView.setId(R.id.bcc);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tightTuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tightTuxTextView);
        android.view.a.LIZ(tightTuxTextView);
        if (tightTuxTextView.getParent() == null) {
            linearLayout2.addView(tightTuxTextView, layoutParams3);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        TightTuxTextView tightTuxTextView2 = new TightTuxTextView(context);
        tightTuxTextView2.setId(R.id.eev);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tightTuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tightTuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Regular"), tightTuxTextView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(tightTuxTextView2);
        if (tightTuxTextView2.getParent() == null) {
            linearLayout.addView(tightTuxTextView2, layoutParams4);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.o54);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.f765o5b);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics()));
        c cVar = new c();
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("2131296293", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams6);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lr3);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams7);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams5);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.o_r);
        viewStub.setLayoutResource(R.layout.clz);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams8);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
