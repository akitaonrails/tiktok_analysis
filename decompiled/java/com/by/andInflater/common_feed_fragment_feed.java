package com.by.andInflater;

import X.C0JAD;
import X.C0JAE;
import X.C1604620rrI;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes8.dex */
public class common_feed_fragment_feed implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.huk);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.vid);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.vim);
        frameLayout2.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        C0JAD c0jad = new C0JAD(context);
        c0jad.setId(R.id.vio);
        c0jad.setInflater(new C0JAE() { // from class: X.0J9r
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams3) {
                context2.getResources();
                SmartImageView smartImageView = new SmartImageView(context2);
                smartImageView.setId(R.id.vio);
                C786410Ut5.LJZI(8, smartImageView);
                a.LIZ(smartImageView);
                return smartImageView;
            }
        });
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (c0jad.getParent() == null) {
            frameLayout.addView(c0jad, layoutParams3);
        }
        C1604620rrI c1604620rrI = new C1604620rrI(context);
        c1604620rrI.setId(R.id.vie);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.b6q, c1604620rrI, false, 0);
        if (viewLIZ.getParent() == null) {
            c1604620rrI.addView(viewLIZ);
        }
        C0JAD c0jad2 = new C0JAD(context);
        c0jad2.setId(R.id.ip7);
        c0jad2.setInflater(new C0JAE() { // from class: X.16Eh
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams5) {
                Resources resources2 = context2.getResources();
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setId(R.id.ip7);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                C786410Ut5.LJLLLLLL(8, linearLayout);
                TuxIconView tuxIconView = new TuxIconView(context2);
                tuxIconView.setId(R.id.ip6);
                tuxIconView.setFocusable(false);
                tuxIconView.setImportantForAccessibility(2);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                new k();
                k.LIZ("app:tux_icon", new a.b("2130772417", "raw"), tuxIconView);
                k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
                android.view.a.LIZ(tuxIconView);
                if (tuxIconView.getParent() == null) {
                    linearLayout.addView(tuxIconView, layoutParams6);
                }
                TuxTextView tuxTextView = new TuxTextView(context2);
                tuxTextView.setId(R.id.ip8);
                tuxTextView.setText(2131848936);
                TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
                tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                typedArrayObtainStyledAttributes.recycle();
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                }
                new o();
                o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
                android.view.a.LIZ(tuxTextView);
                if (tuxTextView.getParent() == null) {
                    linearLayout.addView(tuxTextView, layoutParams7);
                }
                android.view.a.LIZ(linearLayout);
                return linearLayout;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-2, -2, c1604620rrI);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 49;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 49;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 49;
        }
        c0jad2.LIZ(R.id.ip8);
        c0jad2.LIZ(R.id.ip6);
        if (c0jad2.getParent() == null) {
            c1604620rrI.addView(c0jad2, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(c1604620rrI);
        if (c1604620rrI.getParent() == null) {
            frameLayout.addView(c1604620rrI, layoutParams4);
        }
        View view2 = new View(context);
        view2.setId(R.id.vi_);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 80;
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams5);
        }
        C0JAD c0jad3 = new C0JAD(context);
        c0jad3.setId(R.id.ug9);
        c0jad3.setInflater(new C0JAE() { // from class: X.0J9p
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams6) {
                context2.getResources();
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setId(R.id.ug9);
                C786410Ut5.LJLLLLLL(8, frameLayout3);
                frameLayout3.setClipChildren(false);
                android.view.a.LIZ(frameLayout3);
                return frameLayout3;
            }
        });
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        if (c0jad3.getParent() == null) {
            frameLayout.addView(c0jad3, layoutParams6);
        }
        View constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.fsx);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams7);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 98.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 8388613;
        }
        C0JAD c0jad4 = new C0JAD(context);
        c0jad4.setId(R.id.qob);
        c0jad4.setInflater(new C0JAE() { // from class: X.0J9u
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams9) {
                context2.getResources();
                View viewLIZ2 = C20742916Ex.LIZ(context2, R.layout.b_p, viewGroup2, false, 0);
                viewLIZ2.setId(R.id.qob);
                C786410Ut5.LJLLLLLL(8, viewLIZ2);
                return viewLIZ2;
            }
        });
        if (c0jad4.getParent() == null) {
            linearLayout.addView(c0jad4);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        C0JAD c0jad5 = new C0JAD(context);
        c0jad5.setId(R.id.bei);
        c0jad5.setInflater(new C0JAE() { // from class: X.0J9v
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams10) {
                context2.getResources();
                View viewLIZ2 = C20742916Ex.LIZ(context2, R.layout.b57, viewGroup2, false, 0);
                viewLIZ2.setId(R.id.bei);
                C786410Ut5.LJLLLLLL(8, viewLIZ2);
                return viewLIZ2;
            }
        });
        if (c0jad5.getParent() == null) {
            frameLayout3.addView(c0jad5);
        }
        C0JAD c0jad6 = new C0JAD(context);
        c0jad6.setId(R.id.bej);
        c0jad6.setInflater(new C0JAE() { // from class: X.0J9w
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams10) {
                context2.getResources();
                View viewLIZ2 = C20742916Ex.LIZ(context2, R.layout.b57, viewGroup2, false, 0);
                viewLIZ2.setId(R.id.bej);
                C786410Ut5.LJLLLLLL(8, viewLIZ2);
                return viewLIZ2;
            }
        });
        if (c0jad6.getParent() == null) {
            frameLayout3.addView(c0jad6);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams9);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams8);
        }
        C0JAD c0jad7 = new C0JAD(context);
        c0jad7.setId(R.id.s__);
        c0jad7.setInflater(new C0JAE() { // from class: X.0J9t
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams10) {
                context2.getResources();
                FrameLayout frameLayout4 = new FrameLayout(context2);
                frameLayout4.setId(R.id.s__);
                C786410Ut5.LJLLLLLL(8, frameLayout4);
                android.view.a.LIZ(frameLayout4);
                return frameLayout4;
            }
        });
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        if (c0jad7.getParent() == null) {
            frameLayout.addView(c0jad7, layoutParams10);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
