package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0i5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229200i5m {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1453));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1451));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1452));

    public static final int LIZLLL(Context context) {
        return context.getResources().getDimensionPixelSize(C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android"));
    }

    public static final TuxNavBar LIZ(Context context, Function0<Unit> function0) {
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(function0);
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        return tuxNavBar;
    }

    public static final void LIZJ(Context context, String str) {
        C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "im", "select_user_panel");
        C1228470i4b c1228470i4b = new C1228470i4b(new C1228650i4t("school_group_page", str, EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), EnumC1219960hqs.CAMPUS.getValue(), new C1228700i4y(0, 0, "school_group_page", null, null, 27), false, null, null, true, null, false, null, null, null, null, 0, 0, false, null, null, null, -1088, 1), new C1228810i59(null, null, null, false, false, null, 0L, null, null, null, 0, null, null, null, null, null, false, null, null, 4194303));
        InterfaceC1228540i4i.LIZ.getClass();
        c1231470i9RLIZIZ.LIZLLL(context, c1228470i4b, C1228590i4n.LIZ().LIZ(context, c1228470i4b.LIZ));
    }

    public static TuxTextView LJ(Context context, int i, int i2, Integer num, int i3) {
        int i4;
        if ((i3 & 8) != 0) {
            num = null;
        }
        if ((i3 & 32) != 0) {
            i4 = 8388659;
        } else {
            i4 = 0;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        if (num != null) {
            tuxTextView.setText(num.intValue());
        }
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(i2);
        tuxTextView.setGravity(i4);
        return tuxTextView;
    }

    public static ViewGroup.MarginLayoutParams LIZIZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i3 = 0;
        }
        if ((i8 & 8) != 0) {
            i4 = 0;
        }
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        if ((i8 & 32) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i2);
        marginLayoutParams.setMarginStart(i7);
        marginLayoutParams.setMarginEnd(i7);
        if (i3 != 0) {
            marginLayoutParams.setMarginStart(i3);
        }
        marginLayoutParams.topMargin = i4;
        if (i5 != 0) {
            marginLayoutParams.setMarginEnd(i5);
        }
        marginLayoutParams.bottomMargin = i6;
        return marginLayoutParams;
    }
}
