package com.by.andInflater;

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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class feed_skylight_friends_v3_story_cell_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 122.0f, resources.getDisplayMetrics()), viewGroup);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.viq);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        new d();
        d.LIZ(new a.c("size64"), avatarComponentView);
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.vir);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = R.id.viq;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = R.id.viq;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
