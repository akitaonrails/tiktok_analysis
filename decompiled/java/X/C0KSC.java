package X;

import Y.AcS494S0100000_7;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: renamed from: X.0KSC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSC {
    public static final C0KSC LIZ = new C0KSC();

    public static void LIZIZ(C501470JlZ c501470JlZ, int i) {
        String strLJIJI;
        if (c501470JlZ == null || (strLJIJI = c501470JlZ.getPrompt()) == null || strLJIJI.length() <= 0) {
            strLJIJI = C497740JfY.LJIJI(i);
        }
        C766270U4b.LJIIJJI(strLJIJI);
    }

    public static void LIZ(Context context, String str, String str2) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131851997), new AcS494S0100000_7(context, 1));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131851998), new InterfaceC743640TFa() { // from class: X.0KSD
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
