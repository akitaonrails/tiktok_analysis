package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class relation_rec_user_card_square_top_area implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.bkz);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), viewGroup);
        a.LIZ(smartAvatarImageView);
        C786410Ut5.W5(smartAvatarImageView, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(smartAvatarImageView);
        }
        return smartAvatarImageView;
    }
}
