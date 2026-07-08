package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337230DJx extends FrameLayout implements InterfaceC337240DJy {
    public C337230DJx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.dm5, this);
    }

    @Override // X.InterfaceC337240DJy
    public final void LIZ(User user, C449940Hke c449940Hke) {
        int i;
        DisplayMetrics displayMetrics;
        Resources resources;
        int iLIZIZ;
        View viewFindViewById = findViewById(R.id.sn8);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        if (C467860IWi.LIZ(getContext())) {
            i = R.attr.a1f;
        } else {
            i = R.attr.a1e;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
        TextView textView = (TextView) findViewById(R.id.a0u);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.uqj);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.suy);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            recommendReason = "";
        }
        boolean zBooleanValue = ((Boolean) C0AX4.LIZ.getValue()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(user.getNickname());
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        int i2 = 8;
        if (!a0.LJJJIL(recommendReason)) {
            if (!zBooleanValue) {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i2);
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            tuxTextView2.setText(recommendReason);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView2.getLayoutParams();
            if (zBooleanValue) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                iLIZIZ = 0;
            }
            marginLayoutParams.setMarginStart(iLIZIZ);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginEnd(0);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            tuxTextView2.setText("");
            ((ViewGroup.MarginLayoutParams) tuxTextView2.getLayoutParams()).setMarginStart(0);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginEnd(0);
        }
        View viewFindViewById2 = findViewById(R.id.e29);
        C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        C786410Ut5.I7(new ViewOnClickListenerC511801z2(c449940Hke, viewFindViewById2, 0), viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.sn8);
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ == null || (resources = activityLIZ.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            displayMetrics = getResources().getDisplayMetrics();
        }
        int iLIZIZ2 = ((displayMetrics.widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(128))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.W5(viewFindViewById3, layoutParams);
        viewFindViewById3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
        if (viewFindViewById3.getMeasuredWidth() < iLIZIZ2) {
            iLIZIZ2 = viewFindViewById3.getMeasuredWidth();
        }
        layoutParams2.width = iLIZIZ2;
        C786410Ut5.W5(viewFindViewById3, layoutParams2);
    }
}
