package com.by.andInflater;

import X.C12BX;
import X.C19ME;
import X.C20584815gk;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class story_layout_note_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C12BX c12bx = new C12BX(context, null, 6);
        c12bx.setId(R.id.w9l);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(c12bx);
        if (c12bx.getParent() == null) {
            constraintLayout.addView(c12bx, c19me);
        }
        C20584815gk c20584815gk = new C20584815gk(context, null, 6);
        c20584815gk.setId(R.id.tv_text);
        C19ME c19me2 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.bh2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalChainStyle = 2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        a.LIZ(c20584815gk);
        if (c20584815gk.getParent() == null) {
            constraintLayout.addView(c20584815gk, c19me2);
        }
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.bh2);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 160.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 160.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.tv_text;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me3);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
