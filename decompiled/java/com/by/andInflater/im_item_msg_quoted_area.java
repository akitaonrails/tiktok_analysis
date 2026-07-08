package com.by.andInflater;

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
import android.widget.Space;
import android.widget.ViewFlipper;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaOverlapLinearLayout;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_item_msg_quoted_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        QuotedAreaOverlapLinearLayout quotedAreaOverlapLinearLayout = new QuotedAreaOverlapLinearLayout(context, null, 6);
        quotedAreaOverlapLinearLayout.setClipChildren(false);
        quotedAreaOverlapLinearLayout.setClipToPadding(false);
        quotedAreaOverlapLinearLayout.setOrientation(1);
        quotedAreaOverlapLinearLayout.setTranslationZ(TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.sp4);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, quotedAreaOverlapLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            quotedAreaOverlapLinearLayout.addView(tuxTextView, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sp1);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, quotedAreaOverlapLinearLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        ViewFlipper viewFlipper = new ViewFlipper(context);
        viewFlipper.setId(R.id.sp2);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        Space space = new Space(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, viewFlipper);
        android.view.a.LIZ(space);
        if (space.getParent() == null) {
            viewFlipper.addView(space, marginLayoutParamsLJ4);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.view_stub_im_item_msg_quoted_text);
        viewStub.setLayoutResource(R.layout.cln);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, viewFlipper);
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            viewFlipper.addView(viewStub, marginLayoutParamsLJ5);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.view_stub_im_item_msg_quoted_media);
        viewStub2.setLayoutResource(R.layout.cll);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ(-2, -2, viewFlipper);
        viewStub2.setInflatedId(-1);
        android.view.a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            viewFlipper.addView(viewStub2, marginLayoutParamsLJ6);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.view_stub_im_item_msg_quoted_preview);
        viewStub3.setLayoutResource(R.layout.clm);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-2, -2, viewFlipper);
        viewStub3.setInflatedId(-1);
        android.view.a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            viewFlipper.addView(viewStub3, marginLayoutParamsLJ7);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.view_stub_im_item_msg_quoted_thought);
        viewStub4.setLayoutResource(R.layout.clo);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-2, -2, viewFlipper);
        viewStub4.setInflatedId(-1);
        android.view.a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            viewFlipper.addView(viewStub4, marginLayoutParamsLJ8);
        }
        android.view.a.LIZ(viewFlipper);
        if (viewFlipper.getParent() == null) {
            frameLayout.addView(viewFlipper, layoutParams);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.stx);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        viewStub5.setInflatedId(-1);
        android.view.a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            quotedAreaOverlapLinearLayout.addView(frameLayout, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(quotedAreaOverlapLinearLayout);
        C786410Ut5.W5(quotedAreaOverlapLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(quotedAreaOverlapLinearLayout);
        }
        return quotedAreaOverlapLinearLayout;
    }
}
