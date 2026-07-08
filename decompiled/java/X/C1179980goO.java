package X;

import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0goO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179980goO {
    public static C19M4 LIZ(Context context, int i, int i2) {
        C19M4 c19m4 = new C19M4(context, null, 6);
        c19m4.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        c19m4.setTextColorRes(R.attr.a1h);
        c19m4.setTuxFont(42);
        c19m4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
        c19m4.setText(context.getString(i));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZ = i2;
        c19m4.setStartIcon(c419910GdJ);
        return c19m4;
    }

    public static final C19M4 LIZIZ(LinearLayout linearLayout, int i, int i2, Function1 function1) {
        C19M4 c19m4LIZ = LIZ(linearLayout.getContext(), i, i2);
        C786410Ut5.c9(c19m4LIZ, new ACListenerS121S0200000_18(function1, c19m4LIZ, 64));
        return c19m4LIZ;
    }
}
