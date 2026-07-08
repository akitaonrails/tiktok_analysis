package X;

import Y.AObjectS393S0100000_19;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ieG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250580ieG {
    public static Unit LIZ(TextView textView) {
        Context context = textView.getContext();
        if (context != null) {
            textView.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
        }
        return Unit.LIZ;
    }

    public static void LIZIZ(C19EG c19eg) {
        long jLongValue = ((Number) C303460Buy.LJFF.getValue()).longValue();
        if (jLongValue != -1) {
            C786410Ut5.LJLIIL(jLongValue, C799570VYd.LIZIZ(), new ARunnableS111S0100000_11(c19eg, 103));
            return;
        }
        if (!C20673215v0.LIZIZ(c19eg, "profile_fragment_user_mt")) {
            C20673215v0.LJII(c19eg, "profile_fragment_user_mt");
        }
        if (C20673215v0.LIZIZ(c19eg, "profile_fragment_aweme_list_mus")) {
            return;
        }
        C20673215v0.LJII(c19eg, "profile_fragment_aweme_list_mus");
    }

    public static void LIZLLL(Boolean bool, Boolean bool2) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (bool.booleanValue()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(bool2.booleanValue() ? 1 : 0, "complete_status");
        C20684815ws.LJIILLIIL("show_profile_bio", c2344009Gk.LIZ);
    }

    public static void LIZJ(TuxTextView tuxTextView, String str, List list, Boolean bool) {
        List<SignatureExtraInfo> listLJIIJ;
        Context context;
        boolean zBooleanValue;
        AObjectS393S0100000_19 aObjectS393S0100000_19;
        if (tuxTextView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            tuxTextView.setText(2131848245);
            return;
        }
        String strReplaceAll = str;
        while (strReplaceAll.contains("\n\n")) {
            try {
                strReplaceAll = strReplaceAll.replaceAll("\n\n", "\n");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (list != null && !list.isEmpty()) {
                    SpannableString spannableStringLJIIIZ = C1239630iMb.LJIIIZ(tuxTextView.getContext(), strReplaceAll, C1239630iMb.LJIIJ(str, strReplaceAll, list), bool.booleanValue(), new AObjectS393S0100000_19(tuxTextView, 16));
                    tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                    tuxTextView.setText(spannableStringLJIIIZ, TextView.BufferType.SPANNABLE);
                    throw th;
                }
                tuxTextView.setText(strReplaceAll);
                throw th;
            }
        }
        try {
            strReplaceAll = Pattern.compile("\\s*$", 8).matcher(strReplaceAll).replaceAll("");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (list != null && !list.isEmpty()) {
                listLJIIJ = C1239630iMb.LJIIJ(str, strReplaceAll, list);
                context = tuxTextView.getContext();
                zBooleanValue = bool.booleanValue();
                aObjectS393S0100000_19 = new AObjectS393S0100000_19(tuxTextView, 16);
            }
            tuxTextView.setText(strReplaceAll);
        }
        if (list != null && !list.isEmpty()) {
            listLJIIJ = C1239630iMb.LJIIJ(str, strReplaceAll, list);
            context = tuxTextView.getContext();
            zBooleanValue = bool.booleanValue();
            aObjectS393S0100000_19 = new AObjectS393S0100000_19(tuxTextView, 16);
            SpannableString spannableStringLJIIIZ2 = C1239630iMb.LJIIIZ(context, strReplaceAll, listLJIIJ, zBooleanValue, aObjectS393S0100000_19);
            tuxTextView.setMovementMethod(C431260Gvc.LIZ);
            tuxTextView.setText(spannableStringLJIIIZ2, TextView.BufferType.SPANNABLE);
            return;
        }
        tuxTextView.setText(strReplaceAll);
    }
}
