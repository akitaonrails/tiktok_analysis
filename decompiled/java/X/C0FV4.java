package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0FV4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV4 extends View {
    public final String LL;
    public final String LLILLJJLI;
    public C0FV5 LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final Rect LLJ;
    public final RectF LLJI;

    public final C0FV5 getFrameCache() {
        C0FV5 c0fv5 = this.LLILLL;
        if (c0fv5 != null) {
            return c0fv5;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132 A[LOOP:0: B:8:0x0067->B:29:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0164 A[EDGE_INSN: B:37:0x0164->B:34:0x0164 BREAK  A[LOOP:0: B:8:0x0067->B:29:0x0132], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FV4.onDraw(android.graphics.Canvas):void");
    }

    public final void setFrameCache(C0FV5 c0fv5) {
        this.LLILLL = c0fv5;
    }

    public C0FV4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "";
        this.LLILLJJLI = "video";
        new Point(0, 0);
        this.LLILZ = C355430Dwb.LIZ(30.0f);
        this.LLILZIL = C355430Dwb.LIZ(56.0f);
        this.LLILZLL = LSPassThroughRecordSizeConfig.DEFAULT;
        Context context2 = getContext();
        Point point = new Point();
        C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context2, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ypn5c8zr9ebrqAOEaWNXw1jlXnzh4", null)).getRealSize(point);
        int i = point.x;
        this.LLIZ = (-i) * 2;
        this.LLIZLLLIL = i * 2;
        this.LLJ = new Rect();
        this.LLJI = new RectF();
    }
}
