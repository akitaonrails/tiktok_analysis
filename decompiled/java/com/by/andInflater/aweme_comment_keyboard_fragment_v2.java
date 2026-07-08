package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.commentv2.commentpage.ui.ClipFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class aweme_comment_keyboard_fragment_v2 implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ClipFrameLayout clipFrameLayout = new ClipFrameLayout(context, null, 6);
        clipFrameLayout.setId(R.id.m_o);
        clipFrameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View view = new View(context);
        view.setId(R.id.pvy);
        C786410Ut5.T4(view, 0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1_});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(0, view);
        view.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-1, -1, clipFrameLayout);
        a.LIZ(view);
        if (view.getParent() == null) {
            clipFrameLayout.addView(view, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.m2y);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-1, -2, clipFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 80;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            clipFrameLayout.addView(frameLayout, marginLayoutParamsLJ3);
        }
        a.LIZ(clipFrameLayout);
        C786410Ut5.W5(clipFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(clipFrameLayout);
        }
        return clipFrameLayout;
    }
}
