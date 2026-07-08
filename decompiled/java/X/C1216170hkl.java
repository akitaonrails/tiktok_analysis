package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216170hkl extends AbstractC1216180hkm {
    public static final /* synthetic */ int LL = 0;

    public C1216170hkl(View view, String str, String str2) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.jkv);
        if (TextUtils.isEmpty(str)) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        } else {
            tuxTextView.setText(str);
            C10MV.LIZ.getClass();
            if (C10MV.LIZ()) {
                C426750GoL.LJIIIZ(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58))), null, null, false, 29);
                tuxTextView.LJJJJI(32.0f);
                tuxTextView.setGravity(1);
            } else {
                C345460DgW.LIZ(tuxTextView);
            }
            if (C1911400zq6.LIZ(view.getContext())) {
                tuxTextView.setTuxFont(13);
                tuxTextView.setGravity(8388611);
                tuxTextView.setTextAlignment(1);
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.uhp);
        if (TextUtils.isEmpty(str2)) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            return;
        }
        tuxTextView2.setText(str2);
        C10MV.LIZ.getClass();
        if (C10MV.LIZ()) {
            tuxTextView2.LJJJJI(14.0f);
            tuxTextView2.setGravity(1);
        } else {
            C345460DgW.LIZ(tuxTextView2);
        }
        if (!C1911400zq6.LIZ(view.getContext())) {
            return;
        }
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setTextAlignment(1);
    }
}
