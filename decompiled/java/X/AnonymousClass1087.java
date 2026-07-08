package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS177S1100000_28;

/* JADX INFO: renamed from: X.1087, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1087 {
    public static final AnonymousClass1087 LIZ = new AnonymousClass1087();

    public static SpannableStringBuilder LIZ(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ(2131839134);
        c444940Hca.LIZLLL(5);
        c444940Hca.LIZIZ(52);
        c444940Hca.LJIIIIZZ = new AwS177S1100000_28(context, str, 14);
        c444940Hca.LIZIZ = false;
        spannableStringBuilder.append(c444940Hca.LIZ(context));
        return spannableStringBuilder;
    }

    public static Spanned LIZIZ(Context context, int i, String str) {
        return C20588115hH.LIZJ(context, i, LIZ(context, str));
    }

    public static void LIZJ(View view, View view2, TuxTextView tuxTextView) {
        Context context = view.getContext();
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        tuxTextView.setTextColorRes(R.attr.a1j);
        tuxTextView.setTuxFont(51);
        C191880104w.LIZ.getClass();
        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), "pause_interaction_from", 0);
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.LJLLLLLL(8, view2);
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            } else {
                tuxTextView.setText(C20588115hH.LIZJ(context, 2131839165, LIZ(context, "privacy_setting_page_reminder")));
                return;
            }
        }
        tuxTextView.setText(C20588115hH.LIZJ(context, 2131839164, LIZ(context, "privacy_setting_page_reminder")));
    }
}
