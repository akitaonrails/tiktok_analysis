package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315210kKV extends View implements InterfaceC1315370kKl {
    public final int LL;
    public final C1315260kKa LLILLJJLI;
    public final C1315200kKU LLILLL;
    public final C1315220kKW LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1315260kKa c1315260kKa = this.LLILLJJLI;
        if (c1315260kKa == null) {
            return;
        }
        this.LLILZ.canvas_ = canvas;
        float[] regionRect = c1315260kKa.LIZ.getRegionRect(this.LL);
        canvas.translate(-regionRect[0], -regionRect[1]);
        C1315260kKa c1315260kKa2 = this.LLILLJJLI;
        if (c1315260kKa2.LIZIZ == 0) {
            c1315260kKa2.LIZ.drawRegion(this.LLILZ, this.LL);
        } else {
            c1315260kKa2.LIZ.drawTypewriterRegion(this.LLILZ, this.LL, this.LLILLL.LLL, c1315260kKa2.LJII);
        }
    }

    @Override // X.InterfaceC1315370kKl
    public final void LIZ(C1315320kKg c1315320kKg, Rect rect) {
        if (c1315320kKg.LJ.equals(this.LLILLJJLI.LJIIIZ)) {
            LynxBaseUI next = c1315320kKg.LJFF;
            if (next == null) {
                String str = c1315320kKg.LJ;
                LynxBaseUI lynxBaseUI = this.LLILLL.LLILLJJLI.get();
                if (lynxBaseUI != null) {
                    Iterator<LynxBaseUI> it2 = lynxBaseUI.getChildren().iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (str.equals(next.getIdSelector())) {
                        }
                    }
                    return;
                }
                return;
            }
            next.setLeft(rect.left);
            next.setTop(rect.top);
        }
    }

    public C1315210kKV(Context context, C1315260kKa c1315260kKa, C1315200kKU c1315200kKU, int i) {
        super(context);
        setWillNotDraw(false);
        this.LLILLL = c1315200kKU;
        this.LLILLJJLI = c1315260kKa;
        this.LL = i;
        this.LLILZ = new C1315220kKW(null, c1315260kKa.LIZ.getResourceManager(), this);
    }
}
