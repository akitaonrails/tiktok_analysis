package X;

import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341060l0C {
    public static void LIZ(Comment comment, TuxTextView tuxTextView) {
        String labelText = comment.getLabelText();
        if (comment.getIsTakoGenerated()) {
            C786410Ut5.LLIL(tuxTextView, 0);
            tuxTextView.setText(tuxTextView.getResources().getString(2131822438));
            tuxTextView.setTextColor(C1351950lHl.LJ(R.attr.a1k, R.attr.a1k, tuxTextView.getContext()));
            return;
        }
        if (!TextUtils.isEmpty(labelText) && comment.getLabelType() != 9) {
            C786410Ut5.LLIL(tuxTextView, 0);
            tuxTextView.setText(labelText);
            if (comment.getLabelType() != 1 && comment.getLabelType() != 22) {
                tuxTextView.setTextColor(C1351950lHl.LJ(R.attr.a1k, R.color.di, tuxTextView.getContext()));
                return;
            }
            C1340350kz3.LIZJ(tuxTextView);
            if (C293960Bfe.LIZ()) {
                C1340350kz3.LIZIZ(tuxTextView);
                return;
            } else {
                tuxTextView.setTuxFont(62);
                return;
            }
        }
        C786410Ut5.LLIL(tuxTextView, 8);
    }

    public static void LIZIZ(Comment comment, TuxTextView tuxTextView) {
        if (!TextUtils.isEmpty(comment.getLabelText()) || comment.getIsTakoGenerated()) {
            String strTrim = C786410Ut5.j4(tuxTextView.getResources().getString(2131829168), new Object[]{""}).trim();
            if (!TextUtils.isEmpty(strTrim)) {
                C786410Ut5.LLIL(tuxTextView, 0);
                tuxTextView.setText(strTrim);
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColor(C1351950lHl.LJ(R.attr.a1k, R.attr.a1k, tuxTextView.getContext()));
                return;
            }
        }
        C786410Ut5.LLIL(tuxTextView, 8);
    }
}
