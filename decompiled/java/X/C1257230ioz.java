package X;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ioz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257230ioz {
    public static final int LIZIZ;
    public final C20515215Pi LIZ;

    static {
        C844470XAv.LIZ.getClass();
        int i = C14KI.LJI(C844470XAv.LIZ()) ? 42 : 49;
        Context contextLIZ = C844470XAv.LIZ();
        Drawable drawableLJ = C1308910kAL.LJ(R.attr.g1q, C844470XAv.LIZ());
        int intrinsicHeight = 0;
        if (drawableLJ != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                intrinsicHeight = drawableLJ.getOpticalInsets().bottom;
            } else if (i2 >= 24) {
                Outline outline = new Outline();
                int intrinsicHeight2 = drawableLJ.getIntrinsicHeight();
                drawableLJ.setBounds(0, 0, drawableLJ.getIntrinsicWidth(), intrinsicHeight2);
                drawableLJ.getOutline(outline);
                Rect rect = new Rect();
                outline.getRect(rect);
                intrinsicHeight = intrinsicHeight2 - rect.bottom;
            } else {
                intrinsicHeight = (drawableLJ.getIntrinsicHeight() * 44) / 162;
            }
        }
        LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((i + 8) - C418440Gaw.LJFF(intrinsicHeight, contextLIZ))));
    }

    public C1257230ioz(ViewGroup viewGroup, boolean z) {
        C20515215Pi c20515215Pi;
        if (z) {
            c20515215Pi = new C20515215Pi(viewGroup);
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LIZIZ = 8000L;
            c1057450dcl.LJIIIZ = LIZIZ;
        } else {
            c20515215Pi = new C20515215Pi(viewGroup);
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LIZIZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c1057450dcl2.LJIIIZ = LIZIZ;
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (SettingsManager.LJ("profile_use_view_in_profile_bottom_banner", 1) == 1) {
            c20515215Pi.LIZ.LJIILL = true;
        }
        this.LIZ = c20515215Pi;
    }
}
