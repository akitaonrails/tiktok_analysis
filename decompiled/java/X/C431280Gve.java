package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431280Gve {
    public static final TuxTextView LIZ(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
        int i;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), 0, false, 16);
        tuxTextView.setTuxFont(101);
        tuxTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        if (Intrinsics.LJFF(str, "center")) {
            i = 1;
        } else {
            i = 8388611;
        }
        tuxTextView.setGravity(i);
        return tuxTextView;
    }
}
