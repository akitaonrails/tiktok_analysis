package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0FFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFZ extends View {
    public final String LL;
    public final String LLILLJJLI;
    public C386930FFb LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final Rect LLJ;
    public final RectF LLJI;

    public final C386930FFb getFrameCache() {
        C386930FFb c386930FFb = this.LLILLL;
        if (c386930FFb != null) {
            return c386930FFb;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[LOOP:0: B:8:0x0047->B:29:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa A[EDGE_INSN: B:36:0x00fa->B:34:0x00fa BREAK  A[LOOP:0: B:8:0x0047->B:29:0x00c9], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FFZ.onDraw(android.graphics.Canvas):void");
    }

    public final void setFrameCache(C386930FFb c386930FFb) {
        this.LLILLL = c386930FFb;
    }

    public C0FFZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "";
        this.LLILLJJLI = "video";
        new Point(0, 0);
        this.LLILZ = C366700EZg.LIZ(30.0d);
        this.LLILZIL = C366700EZg.LIZ(56.0d);
        this.LLILZLL = LSPassThroughRecordSizeConfig.DEFAULT;
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(getContext());
        this.LLIZ = (-iLJIIIIZZ) * 2;
        this.LLIZLLLIL = iLJIIIIZZ * 2;
        this.LLJ = new Rect();
        this.LLJI = new RectF();
    }
}
