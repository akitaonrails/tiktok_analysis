package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911380zq4 {
    public static C1911390zq5 LIZ(ViewGroup viewGroup, String str, String str2, String str3, String str4) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czj, viewGroup, false);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.jkv);
        TextView textView = (TextView) viewTd.findViewById(R.id.jko);
        if (str.length() > 0 && tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (str2.length() > 0 && textView != null) {
            textView.setText(str2);
        }
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(32.0f);
        }
        if (str3 != null) {
            C1911410zq7.LIZ("RevampedHeaderHolder", "textAlignmentStyle: ".concat(str3));
            if (Intrinsics.LJFF(str3, "center")) {
                C1911410zq7.LIZ("RevampedHeaderHolder", "TEXT_ALIGNMENT_STYLE_CENTER");
                if (tuxTextView != null) {
                    tuxTextView.setGravity(1);
                }
                if (textView != null) {
                    textView.setGravity(1);
                }
            } else if (Intrinsics.LJFF(str3, "start")) {
                C1911410zq7.LIZ("RevampedHeaderHolder", "TEXT_ALIGNMENT_STYLE_START");
                if (tuxTextView != null) {
                    tuxTextView.setGravity(8388611);
                }
                if (textView != null) {
                    textView.setGravity(8388611);
                }
            }
        }
        if (Intrinsics.LJFF(str4, "revamp_skip")) {
            C426750GoL.LJIIIZ(viewTd, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), null, null, false, 29);
        }
        if (tuxTextView != null && textView != null && C1911400zq6.LIZ(tuxTextView.getContext())) {
            C426750GoL.LJIIIZ(viewTd, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, false, 29);
            tuxTextView.setTuxFont(13);
        }
        return new C1911390zq5(viewTd);
    }
}
