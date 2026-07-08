package X;

import android.app.Activity;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Snh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732110Snh {
    public static final int LIZ;

    static {
        C844470XAv.LIZ.getClass();
        LIZ = C446980Hfs.LIZ(C844470XAv.LIZ(), R.color.cw);
    }

    public static int LIZ() {
        if (LJFF()) {
            return 0;
        }
        return (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public static void LIZIZ() {
        if (C0HCN.LIZJ()) {
            return;
        }
        LowScreenOptimizeAB.LIZIZ();
    }

    public static int LIZJ() {
        if (LJFF()) {
            return 0;
        }
        return (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    }

    public static float LIZLLL() {
        if (LJFF()) {
            return 0.0f;
        }
        return (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) ? 9.0f : 6.0f;
    }

    public static int LJ() {
        if (LJFF()) {
            return 0;
        }
        return (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) ? 6 : 11;
    }

    public static boolean LJFF() {
        Activity activityLJFF = C2214201BlK.LJFF();
        return activityLJFF != null && C0SXF.LJIL(activityLJFF);
    }

    public static void LJI(String str) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("rightInteractionArea", str);
    }

    public static void LJII(TuxTextView tuxTextView) {
        tuxTextView.setShadowLayer(2.0f, 0.0f, 2.0f, LIZ);
        if (((Number) C07CX.LIZ.getValue()).intValue() >= 2) {
            C07CX.LIZ(tuxTextView);
        }
    }
}
