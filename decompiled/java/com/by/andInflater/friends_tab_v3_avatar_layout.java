package com.by.andInflater;

import X.C426140GnM;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_avatar_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.bhk);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.bh2);
        avatarComponentView.setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.sf));
        }
        new d();
        d.LIZ(new a.c("size40"), avatarComponentView);
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            frameLayout.addView(avatarComponentView, layoutParams);
        }
        View c426140GnM = new C426140GnM(context, null);
        c426140GnM.setId(R.id.iff);
        C786410Ut5.LJLLLLLL(8, c426140GnM);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 8388693;
        }
        android.view.a.LIZ(c426140GnM);
        if (c426140GnM.getParent() == null) {
            frameLayout.addView(c426140GnM, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
