package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C431500Gw0 extends LinkMovementMethod {
    public static C431500Gw0 LJI;
    public static C431500Gw0 LJII;
    public long LIZIZ;
    public final TextPaint LIZJ = new TextPaint();
    public boolean LIZLLL = false;
    public boolean LJ = true;
    public final Paint.FontMetricsInt LJFF = new Paint.FontMetricsInt();
    public final long LIZ = ViewConfiguration.getLongPressTimeout();

    public void LIZJ(ClickableSpan clickableSpan) {
    }

    public static C431500Gw0 LIZ() {
        if (LJII == null) {
            LJII = new C431500Gw0();
        }
        C431500Gw0 c431500Gw0 = LJII;
        c431500Gw0.LJ = false;
        return c431500Gw0;
    }

    public void LIZIZ(ClickableSpan clickableSpan, TextView textView) {
        this.LIZLLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r23, android.text.Spannable r24, android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C431500Gw0.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
