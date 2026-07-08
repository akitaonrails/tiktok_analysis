package com.by.andInflater;

import X.C444350Hbd;
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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_set_sticker_content_slot implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        RoundingCornerLayout roundingCornerLayout = new RoundingCornerLayout(context, null, 6, 0);
        roundingCornerLayout.setId(R.id.evm);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics()), viewGroup);
        C444350Hbd c444350Hbd = new C444350Hbd(context);
        c444350Hbd.setId(R.id.qfn);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, roundingCornerLayout);
        c cVar = new c();
        cVar.LIZIZ("app:roundWithOverlayColor", new a.b("2131099676", "attr"), c444350Hbd);
        cVar.LIZIZ("app:roundedCornerRadius", new a.d("8", "dp"), c444350Hbd);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d(CardStruct.IStatusCode.DEFAULT, "dp"), c444350Hbd);
        cVar.LIZIZ("fresco:actualImageScaleType", new a.c("fitCenter"), c444350Hbd);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c444350Hbd);
        cVar.LIZIZ("app:failureImageScaleType", new a.c("centerCrop"), c444350Hbd);
        cVar.LIZIZ("app:placeholderImage", new a.b("2130972288", "drawable"), c444350Hbd);
        cVar.LIZIZ("app:failureImage", new a.b("2130972288", "drawable"), c444350Hbd);
        cVar.LIZ(c444350Hbd);
        android.view.a.LIZ(c444350Hbd);
        if (c444350Hbd.getParent() == null) {
            roundingCornerLayout.addView(c444350Hbd, layoutParamsLJ);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.hb1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        linearLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, roundingCornerLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 17;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774081", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(2131831013);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            roundingCornerLayout.addView(linearLayout, layoutParamsLJ2);
        }
        android.view.a.LIZ(roundingCornerLayout);
        C786410Ut5.W5(roundingCornerLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(roundingCornerLayout);
        }
        return roundingCornerLayout;
    }
}
