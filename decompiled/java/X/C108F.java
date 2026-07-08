package X;

import Y.ACListenerS79S0300000_12;
import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.108F, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108F {
    public static final C108F LIZ = new C108F();

    public static String LIZIZ(Context context, Boolean bool, Boolean bool2) {
        int i;
        Object[] objArr = new Object[2];
        Boolean bool3 = Boolean.TRUE;
        int i2 = 2131838683;
        if (Intrinsics.LJFF(bool, bool3)) {
            i = 2131838683;
        } else {
            i = R.string.mf6;
        }
        objArr[0] = context.getString(i);
        if (!Intrinsics.LJFF(bool2, bool3)) {
            i2 = R.string.mf6;
        }
        objArr[1] = context.getString(i2);
        return context.getString(2131837189, objArr);
    }

    public static void LIZ(TuxIconView tuxIconView, Context context, int i, Function1 function1) {
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = tuxIconView;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LJIIJ(i);
        c450720Hlu.LJII(R.attr.zh);
        c450720Hlu.LLILLJJLI.LJIJJLI = true;
        C786410Ut5.I7(new ACListenerS79S0300000_12(function1, tuxIconView, c450720Hlu.LIZIZ(), 29), tuxIconView);
    }

    public static void LIZJ(C108I c108i, boolean z, boolean z2, Boolean bool) {
        Object obj;
        Object obj2;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_from", "personal_homepage");
        pairArr[1] = new Pair("pop_up_type", "one_button");
        String str = "on";
        if (z2) {
            obj = "on";
        } else {
            obj = "off";
        }
        pairArr[2] = new Pair("post_view_status", obj);
        if (z) {
            obj2 = "on";
        } else {
            obj2 = "off";
        }
        pairArr[3] = new Pair("profile_view_status", obj2);
        if (bool != null) {
            if (!bool.booleanValue()) {
                str = "off";
            }
        } else {
            str = null;
        }
        pairArr[4] = new Pair("to_status", str);
        pairArr[5] = new Pair("action_type", c108i.LL);
        c1163504gr.onEventV3("viewer_history_pop_up_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
