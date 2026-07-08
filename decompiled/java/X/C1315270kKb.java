package X;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315270kKb extends C1315350kKj {
    public final C1315840kLW LIZJ;

    @Override // X.C1315350kKj, X.InterfaceC1315360kKk
    public final float LIZ() {
        C1315840kLW c1315840kLW;
        int i = this.LIZ;
        if (i <= 0 && (c1315840kLW = this.LIZJ) != null) {
            i = c1315840kLW.LIZ;
        }
        return i;
    }

    @Override // X.C1315350kKj, X.InterfaceC1315360kKk
    public final float LIZIZ() {
        C1315840kLW c1315840kLW;
        int i = this.LIZIZ;
        if (i <= 0 && (c1315840kLW = this.LIZJ) != null) {
            i = c1315840kLW.LIZIZ;
        }
        return -i;
    }

    public final void LIZLLL(Canvas canvas, Rect rect) {
        C1315840kLW c1315840kLW = this.LIZJ;
        if (c1315840kLW != null && c1315840kLW.LJFF != null) {
            canvas.save();
            if (this.LIZ > 0 && this.LIZIZ > 0) {
                this.LIZJ.LJFF.setBounds(rect);
                canvas.clipRect(rect);
            } else {
                C1315840kLW c1315840kLW2 = this.LIZJ;
                c1315840kLW2.LJFF.setBounds(rect.left, rect.top, c1315840kLW2.LIZ, c1315840kLW2.LIZIZ);
            }
            this.LIZJ.LJFF.draw(canvas);
            canvas.restore();
        }
    }

    public C1315270kKb(C1315840kLW c1315840kLW, int i, int i2) {
        super(i, i2);
        this.LIZJ = c1315840kLW;
    }
}
