package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03G4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03G4 {
    public static ViewGroup LIZ(Context context, SellerDetailInfo sellerDetailInfo) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setText(sellerDetailInfo.countShowContent);
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C786410Ut5.R6(tuxTextView2, marginLayoutParams);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setText(sellerDetailInfo.content);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tuxTextView2);
        return linearLayout;
    }
}
