package X;

import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430700Gui {
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(174));
    public final View LIZ;
    public final TuxTextView LIZIZ;

    public C430700Gui(View view, TuxTextView tuxTextView) {
        this.LIZ = view;
        this.LIZIZ = tuxTextView;
    }

    public final int LIZ(float f, String str, int i) {
        int i2 = 0;
        if (str.length() == 0 || i <= 0) {
            return 0;
        }
        try {
            TextPaint textPaint = new TextPaint(this.LIZIZ.getPaint());
            textPaint.setTextSize(f * this.LIZ.getResources().getDisplayMetrics().scaledDensity);
            textPaint.setAntiAlias(true);
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setMaxLines(3).build();
            int lineCount = staticLayoutBuild.getLineCount();
            if (lineCount > 1) {
                do {
                    str.substring(staticLayoutBuild.getLineStart(i2), staticLayoutBuild.getLineEnd(i2));
                    i2++;
                } while (i2 < lineCount);
            }
            return lineCount;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }
}
