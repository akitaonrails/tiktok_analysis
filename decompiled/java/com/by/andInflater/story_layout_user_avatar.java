package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;

/* JADX INFO: loaded from: classes32.dex */
public class story_layout_user_avatar implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        AvatarComponentView avatarComponentView = new AvatarComponentView(new ContextThemeWrapper(context, R.style.y0));
        avatarComponentView.setId(R.id.bj1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), viewGroup);
        new d();
        d.LIZ(new a.c("size32"), avatarComponentView);
        android.view.a.LIZ(avatarComponentView);
        C786410Ut5.e7(avatarComponentView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(avatarComponentView);
        }
        return avatarComponentView;
    }
}
