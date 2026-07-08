package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: X.19cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21580519cx extends EdgeEffect {
    public final View LIZ;
    public final int LIZIZ;
    public C21616519il LIZJ;

    public final C21616519il LIZ() {
        C21616519il c21616519il = this.LIZJ;
        if (c21616519il == null) {
            c21616519il = new C21616519il(this.LIZ, AbstractC21616419ik.LJIILIIL);
        }
        C21581419d6 c21581419d6 = new C21581419d6();
        c21581419d6.LJIIIIZZ = 0.0f;
        c21581419d6.LIZ(1.0f);
        c21581419d6.LIZIZ(200.0f);
        c21616519il.LJJ = c21581419d6;
        return c21616519il;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        int i = this.LIZIZ == 0 ? 1 : -1;
        C21616519il c21616519il = this.LIZJ;
        return (c21616519il == null || !c21616519il.LJFF) && this.LIZ.getTranslationY() * ((float) i) <= 0.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        if ((this.LIZIZ != 0 || this.LIZ.getTranslationY() <= 0.0f) && (this.LIZIZ != 1 || this.LIZ.getTranslationY() >= 0.0f)) {
            return;
        }
        C21616519il c21616519ilLIZ = LIZ();
        this.LIZJ = c21616519ilLIZ;
        c21616519ilLIZ.LJIIIZ();
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return !isFinished();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        int i2;
        super.onAbsorb(i);
        if (this.LIZIZ == 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        float f = i2 * i * 0.5f;
        C21616519il c21616519il = this.LIZJ;
        if (c21616519il != null) {
            c21616519il.LIZLLL();
        }
        C21616519il c21616519ilLIZ = LIZ();
        c21616519ilLIZ.LIZ = f;
        this.LIZJ = c21616519ilLIZ;
        c21616519ilLIZ.LJIIIZ();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        int i;
        super.onPull(f, f2);
        if (this.LIZIZ == 0) {
            i = 1;
        } else {
            i = -1;
        }
        float translationY = this.LIZ.getTranslationY() + (i * this.LIZ.getWidth() * f * 0.4f);
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            if (translationY < 0.0f) {
                return;
            }
        } else if (i2 == 1 && translationY > 0.0f) {
            return;
        }
        C786410Ut5.ed(this.LIZ, translationY);
        C21616519il c21616519il = this.LIZJ;
        if (c21616519il != null) {
            c21616519il.LIZLLL();
        }
    }

    public C21580519cx(int i, Context context, View view) {
        super(context);
        this.LIZ = view;
        this.LIZIZ = i;
    }
}
