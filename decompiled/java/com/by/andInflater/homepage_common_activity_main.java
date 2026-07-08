package com.by.andInflater;

import X.C0JAD;
import X.C0JAE;
import X.C1591390rVx;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class homepage_common_activity_main implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(final Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.j2f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        final AttributeSet attributeSet = null;
        View view = new C1591390rVx(context, attributeSet) { // from class: X.19gF
            public View a;
            public final C01GW b = C452501pT.LIZIZ(new C21601019gG());

            private final boolean getEnableFilter() {
                return ((Boolean) this.b.getValue()).booleanValue();
            }

            @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.a = null;
            }

            @Override // X.C21600219g8, android.view.ViewGroup, android.view.ViewParent
            public final void onDescendantInvalidated(View view2, View view3) {
                if (getEnableFilter() && view2.getParent() == this && view3 != view2) {
                    if (this.a == view3) {
                        return;
                    }
                    C21601319gJ c21601319gJLJIILLIIL = LJIILLIIL(view2);
                    if (c21601319gJLJIILLIIL != null && c21601319gJLJIILLIIL.LIZIZ != getCurrentItem()) {
                        this.a = view3;
                        return;
                    }
                }
                this.a = null;
                super.onDescendantInvalidated(view2, view3);
            }
        };
        view.setId(R.id.viewpager);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        C0JAD c0jad = new C0JAD(context);
        c0jad.setId(R.id.nw0);
        c0jad.setInflater(new C0JAE() { // from class: X.0JA6
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams2) {
                context2.getResources();
                C1591930rWp c1591930rWp = new C1591930rWp(context2);
                int visibility = c1591930rWp.getVisibility();
                c1591930rWp.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1591930rWp);
                c1591930rWp.setId(R.id.nw0);
                a.LIZ(c1591930rWp);
                return c1591930rWp;
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a3q));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 80;
        }
        if (c0jad.getParent() == null) {
            frameLayout.addView(c0jad, layoutParams2);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cdh, frameLayout, false, R.layout.cd3);
        if (viewLIZ.getParent() == null) {
            frameLayout.addView(viewLIZ);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.a93);
        viewStub.setLayoutResource(R.layout.b4y);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams3);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.a8u);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        a.LIZ(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams4);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.a91);
        viewStub3.setLayoutResource(R.layout.cd4);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        viewStub3.setInflatedId(-1);
        a.LIZ(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams5);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.emr);
        viewStub4.setLayoutResource(R.layout.b5w);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        viewStub4.setInflatedId(-1);
        a.LIZ(viewStub4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4, layoutParams6);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.kke);
        viewStub5.setLayoutResource(R.layout.de6);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setInflatedId(-1);
        a.LIZ(viewStub5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5, layoutParams7);
        }
        C0JAD c0jad2 = new C0JAD(context);
        c0jad2.setId(R.id.gdp);
        c0jad2.setInflater(new C0JAE() { // from class: X.0JA5
            @Override // X.C0JAE
            public final View LIZ(Context context2, ViewGroup viewGroup2, ViewGroup.LayoutParams layoutParams8) {
                context2.getResources();
                View view2 = new View(context2);
                view2.setId(R.id.gdp);
                C786410Ut5.LJLLLLLL(8, view2);
                a.LIZ(view2);
                return view2;
            }
        });
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.s7));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 80;
        }
        if (c0jad2.getParent() == null) {
            frameLayout.addView(c0jad2, layoutParams8);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
