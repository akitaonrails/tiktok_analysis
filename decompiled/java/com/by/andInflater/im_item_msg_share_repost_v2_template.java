package com.by.andInflater;

import X.C21415018rM;
import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class im_item_msg_share_repost_v2_template implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.evm);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.bc4);
        linearLayout2.setGravity(48);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C427660Gpo c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.biz);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            linearLayout2.addView(c427660Gpo, layoutParams2);
        }
        C21415018rM c21415018rM = new C21415018rM(context);
        c21415018rM.setId(R.id.bcc);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        a.LIZ(c21415018rM);
        if (c21415018rM.getParent() == null) {
            linearLayout2.addView(c21415018rM, layoutParams3);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.pcg);
        viewStub.setInflatedId(R.id.pcf);
        viewStub.setLayoutResource(R.layout.cm4);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams4);
        }
        a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
