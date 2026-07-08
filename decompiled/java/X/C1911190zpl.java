package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.AwS41S1400000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911190zpl {
    public static final C1911190zpl LIZ = new C1911190zpl();

    public static int LIZ(Context context) throws Throwable {
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+DrHTBH8htKpeBrC50Mnt33QGplcXYXHEzSrg50JkNS+4YaG/XGG", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayLLILZIL.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void LIZIZ(boolean z, C1911150zph c1911150zph, SparkContext sparkContext, Context context, String str) {
        FragmentManager fragmentManagerLJIL;
        C19EG c19egLIZ;
        LiveSheetHostFragment liveSheetHostFragment;
        Dialog dialog;
        Window window;
        View decorView;
        C013C c013c = new C013C();
        c013c.element = z;
        C20484615Do c20484615DoLIZ = C464790IKn.LIZ.LIZ();
        if (c20484615DoLIZ != null && (liveSheetHostFragment = c20484615DoLIZ.LIZLLL) != null && (dialog = liveSheetHostFragment.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.hasWindowFocus()) {
            if (!c013c.element && !Intrinsics.LJFF(C1388190mED.LIZ(context), c20484615DoLIZ.LIZ)) {
                c013c.element = true;
            }
        } else {
            c013c.element = true;
        }
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            fragmentManagerLJIL = null;
            if (context instanceof C19GS) {
                c19egLIZ = (C19EG) context;
            } else if (C500260Jjc.LIZ(context) != null) {
                c19egLIZ = C500260Jjc.LIZ(context);
            } else {
                Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
                if (topActivity instanceof C19GS) {
                    c19egLIZ = (C19EG) topActivity;
                }
            }
            if (c19egLIZ != null) {
                fragmentManagerLJIL = c19egLIZ.getSupportFragmentManager();
            }
        } else {
            fragmentManagerLJIL = C520010KaN.LJIL(context, true);
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS41S1400000_28(str, c1911150zph, c013c, fragmentManagerLJIL, sparkContext, 1));
    }
}
