package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04FF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FF {
    public static TuxTextView LIZ(Context context, ReviewFilterStruct reviewFilterStruct) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
        tuxTextView.setTuxFont(71);
        tuxTextView.setGravity(17);
        int i = C958103op.LIZLLL;
        int i2 = C958103op.LJI;
        tuxTextView.setPadding(i, i2, i, i2);
        tuxTextView.setBackgroundResource(R.drawable.b7w);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(reviewFilterStruct.name);
        sbLIZ.append(' ');
        sbLIZ.append(reviewFilterStruct.countStr);
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = i;
        marginLayoutParams.bottomMargin = i;
        marginLayoutParams.setMarginEnd(i);
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        tuxTextView.setTag(reviewFilterStruct);
        return tuxTextView;
    }
}
