package X;

import X.C19PH;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: renamed from: X.19Pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21534719Pl<S extends C19PH> extends AbstractC21534819Pm {
    public static final C21535219Pq LLJJIII = new AbstractC20731716Ap<C21534719Pl>() { // from class: X.19Pq
        @Override // X.AbstractC20731716Ap
        public final float LIZ(C21534719Pl c21534719Pl) {
            return c21534719Pl.LLJJ * 10000.0f;
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C21534719Pl c21534719Pl = (C21534719Pl) obj;
            c21534719Pl.LLJJ = f / 10000.0f;
            c21534719Pl.invalidateSelf();
        }
    };
    public AbstractC21534019Pe<S> LLJILJIL;
    public final C21581419d6 LLJILJILJ;
    public final C21616519il LLJILLL;
    public float LLJJ;
    public boolean LLJJI;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LLJILJIL.LIZLLL();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LLJILJIL.LJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.LLJILLL.LIZLLL();
        this.LLJJ = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            AbstractC21534019Pe<S> abstractC21534019Pe = this.LLJILJIL;
            float fLIZIZ = LIZIZ();
            abstractC21534019Pe.LIZ.LIZ();
            abstractC21534019Pe.LIZ(fLIZIZ, canvas);
            this.LLJILJIL.LIZJ(canvas, this.LLJ);
            this.LLJILJIL.LIZIZ(canvas, this.LLJ, 0.0f, this.LLJJ, C19PM.LIZ(this.LLILLJJLI.LIZJ[0], this.LLJI));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.LLJJI) {
            this.LLJILLL.LIZLLL();
            this.LLJJ = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        this.LLJILLL.LJI(this.LLJJ * 10000.0f);
        this.LLJILLL.LJII(i);
        return true;
    }

    public C21534719Pl(Context context, C19PH c19ph, AbstractC21534019Pe<S> abstractC21534019Pe) {
        super(context, c19ph);
        this.LLJILJIL = abstractC21534019Pe;
        abstractC21534019Pe.LIZIZ = this;
        C21581419d6 c21581419d6 = new C21581419d6();
        this.LLJILJILJ = c21581419d6;
        c21581419d6.LIZ(1.0f);
        c21581419d6.LIZIZ(50.0f);
        C21616519il c21616519il = new C21616519il(this, LLJJIII);
        this.LLJILLL = c21616519il;
        c21616519il.LJJ = c21581419d6;
        if (this.LLIZLLLIL != 1.0f) {
            this.LLIZLLLIL = 1.0f;
            invalidateSelf();
        }
    }

    @Override // X.AbstractC21534819Pm
    public final boolean LJFF(boolean z, boolean z2, boolean z3) {
        boolean zLJFF = super.LJFF(z, z2, z3);
        C21534419Pi c21534419Pi = this.LLILLL;
        ContentResolver contentResolver = this.LL.getContentResolver();
        c21534419Pi.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.LLJJI = true;
            return zLJFF;
        }
        this.LLJJI = false;
        this.LLJILJILJ.LIZIZ(50.0f / f);
        return zLJFF;
    }
}
