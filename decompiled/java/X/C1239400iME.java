package X;

import android.content.Context;
import android.text.Spanned;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS135S1200000_19;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.AwS7S2201000_19;

/* JADX INFO: renamed from: X.0iME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239400iME {
    public static final C1239400iME LIZ = new C1239400iME();

    public static void LIZJ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowingCount() == 0) {
            c2344009Gk.LJ(Boolean.TRUE, "zero_following_flag");
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("login_type", str2);
        C20684815ws.LJIILLIIL("show_manage_feeds_half_sheet", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", "click");
        c2344009Gk.LJIIIIZZ("value", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("click_in_manage_feeds_half_sheet", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Spanned LIZ(Context context, int i, int i2, int i3, int i4, String str, String str2, int i5, Function0 function0) {
        if (C296530Bjn.LIZ()) {
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = context.getString(2131838207);
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(i4);
            c444940Hca.LJIIIIZZ = new AwS135S1200000_19(context, str, function0, 6);
            CharSequence charSequenceLIZ = c444940Hca.LIZ(context);
            C444940Hca c444940Hca2 = new C444940Hca();
            c444940Hca2.LIZJ = context.getString(2131838208);
            c444940Hca2.LIZLLL(1);
            c444940Hca2.LIZIZ = false;
            c444940Hca2.LIZIZ(i4);
            c444940Hca2.LJIIIIZZ = new AwS135S1200000_19(context, str, function0, 7);
            return C20588115hH.LIZJ(context, 2131838206, charSequenceLIZ, c444940Hca2.LIZ(context));
        }
        if (C1076010e6h.LIZJ.LJIJI()) {
            C444940Hca c444940Hca3 = new C444940Hca();
            c444940Hca3.LIZJ = context.getString(2131834666);
            c444940Hca3.LIZLLL(1);
            c444940Hca3.LIZIZ = false;
            c444940Hca3.LIZIZ(i4);
            c444940Hca3.LJIIIIZZ = new AwS7S2201000_19(i5, context, str, str2, function0, 0);
            CharSequence charSequenceLIZ2 = c444940Hca3.LIZ(context);
            C444940Hca c444940Hca4 = new C444940Hca();
            c444940Hca4.LIZJ = context.getString(2131834667);
            c444940Hca4.LIZLLL(1);
            c444940Hca4.LIZIZ = false;
            c444940Hca4.LIZIZ(i4);
            c444940Hca4.LJIIIIZZ = new C1211870hdp(i5, context, str, function0);
            CharSequence charSequenceLIZ3 = c444940Hca4.LIZ(context);
            C444940Hca c444940Hca5 = new C444940Hca();
            c444940Hca5.LIZJ = context.getString(2131834665);
            c444940Hca5.LIZLLL(1);
            c444940Hca5.LIZIZ = false;
            c444940Hca5.LIZIZ(i4);
            c444940Hca5.LJIIIIZZ = new AwS404S0200000_3(context, function0, 71);
            return C20588115hH.LIZJ(context, i3, charSequenceLIZ2, charSequenceLIZ3, c444940Hca5.LIZ(context));
        }
        C444940Hca c444940Hca6 = new C444940Hca();
        c444940Hca6.LIZJ = context.getString(i2);
        c444940Hca6.LIZLLL(1);
        c444940Hca6.LIZIZ = false;
        c444940Hca6.LIZIZ(i4);
        c444940Hca6.LJIIIIZZ = new AwS7S2201000_19(i5, context, str, str2, function0, 1);
        return C20588115hH.LIZJ(context, i, c444940Hca6.LIZ(context));
    }
}
