package X;

import Y.ARunnableS20S0110000_1;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851910XbR {
    public static final C851910XbR LIZ = new C851910XbR();

    public static C0HZQ LIZ(View view, boolean z, boolean z2, final String str, final String str2, final Function1 function1, boolean z3) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, view);
            C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.phm);
            if (z3) {
                C1236880iIA.LIZ(c0hzq, c0hzq.getContext());
            }
            C0XWJ.LIZ.getClass();
            C0XWJ.LJIILJJIL(str, str2);
            C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0XHa
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    C0XWJ c0xwj = C0XWJ.LIZ;
                    String str3 = str;
                    String str4 = str2;
                    c0xwj.getClass();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("login_panel_type", str3);
                    c0xgr.LIZLLL("enter_method", "checkbox");
                    c0xgr.LIZ(z4 ? 1 : 0, "opt_in");
                    c0xgr.LIZLLL("channel", str4);
                    C20684815ws.LJIILLIIL("save_login_info_click", c0xgr.LIZ);
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.valueOf(z4));
                    }
                }
            });
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS20S0110000_1(c0hzq, z2, 3), 100L);
            return c0hzq;
        }
        C786410Ut5.LJLLLLLL(8, view);
        return null;
    }
}
