package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ELF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELF extends AbstractC371450EhL<C0E8A> {
    public final C19EG LIZLLL;
    public final C0E48 LJ;

    public C0ELF(C0EI6 c0ei6) {
        this.LIZLLL = (C19EG) c0ei6.LIZ(C19EG.class);
        this.LJ = (C0E48) c0ei6.LIZ(C0E48.class);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0EaY] */
    @Override // X.AbstractC371450EhL
    public final Object LIZJ(InterfaceC1364105Vn<? super C0E8A> interfaceC1364105Vn) {
        return new C0E8A(new C0ELG(new C366960Ea6(), new C369610EeN(this.LIZLLL), new C367190EaT(this.LIZLLL, this.LJ), new C368270EcD(this.LIZLLL), new InterfaceC369160Ede(this.LIZLLL) { // from class: X.0EaY
            public final boolean LIZ;
            public final Paint LIZIZ;
            public final C444890HcV LIZJ;
            public float LIZLLL;
            public final TuxIconDrawable LJ;
            public final String LJFF;
            public final Rect LJI;
            public final Path LJII;
            public int LJIIIIZZ;
            public int LJIIIZ;
            public int LJIIJ;
            public int LJIIJJI;
            public int LJIIL;
            public final int LJIILIIL;
            public final int LJIILJJIL;
            public int LJIILL;

            @Override // X.InterfaceC369160Ede
            public final int LIZIZ() {
                return this.LJIILL;
            }

            {
                int i;
                boolean zLIZJ = C444960Hcc.LIZJ(c19eg);
                this.LIZ = zLIZJ;
                Paint paint = new Paint();
                this.LIZIZ = paint;
                C444890HcV c444890HcV = new C444890HcV();
                if (zLIZJ) {
                    c444890HcV.setTextAlign(Paint.Align.RIGHT);
                }
                this.LIZJ = c444890HcV;
                this.LIZLLL = C418440Gaw.LIZIZ(8);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_effect_rectangle_alt_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LJFF = true;
                this.LJ = c419910GdJ.LIZ(c19eg);
                String string = c19eg.getString(2131833283);
                this.LJFF = string;
                Rect rect = new Rect();
                this.LJI = rect;
                this.LJII = new Path();
                this.LJIIIIZZ = C0FU0.LIZ(8.0f);
                this.LJIIIZ = AbstractC367990Ebl.LJIILJJIL;
                this.LJIIJ = C0FU0.LIZ(9.0f);
                this.LJIIJJI = C0FU0.LIZ(4.0f);
                this.LJIIL = C0FU0.LIZ(8.0f);
                int iLIZ = C0FU0.LIZ(16.0f);
                this.LJIILIIL = iLIZ;
                int iLIZ2 = C0FU0.LIZ(8.0f);
                this.LJIILJJIL = iLIZ2;
                paint.setAntiAlias(true);
                paint.setColor(c19eg.getResources().getColor(R.color.b3));
                c444890HcV.setAntiAlias(true);
                if (C293820BfQ.LIZ()) {
                    i = 62;
                } else {
                    i = 51;
                }
                c444890HcV.LIZ(i);
                c444890HcV.setStrokeWidth(1.0f);
                c444890HcV.setStyle(Paint.Style.FILL_AND_STROKE);
                c444890HcV.setColor(c19eg.getResources().getColor(R.color.f569bc));
                c444890HcV.getTextBounds(string, 0, string.length(), rect);
                this.LJIILL = this.LJIIIIZZ + iLIZ + this.LJIIJJI + rect.width() + iLIZ2;
            }

            @Override // X.InterfaceC369160Ede
            public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
                canvas.save();
                if (C293820BfQ.LIZ()) {
                    int iAbs = (int) Math.abs(f4 - f2);
                    this.LJIIIZ = iAbs;
                    this.LJIIL = (iAbs - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
                    this.LJIIJ = (this.LJIIIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
                    this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    this.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    this.LIZLLL = C418440Gaw.LIZIZ(8);
                }
                this.LJIILL = this.LJIIIIZZ + this.LJIILIIL + this.LJIIJJI + this.LJI.width() + this.LJIILJJIL;
                if (Math.abs(f - f3) < this.LJIILL) {
                    this.LJII.reset();
                    Path path = this.LJII;
                    float f5 = this.LIZLLL;
                    path.addRoundRect(f, f2, f3, f4, f5, f5, Path.Direction.CW);
                    canvas.clipPath(this.LJII);
                }
                TuxIconDrawable tuxIconDrawable = this.LJ;
                if (tuxIconDrawable != null) {
                    if (this.LIZ) {
                        int i = ((int) f3) - this.LJIIIIZZ;
                        int i2 = this.LJIILIIL;
                        int i3 = ((int) f2) + this.LJIIJ;
                        tuxIconDrawable.setBounds(i - i2, i3, i, i2 + i3);
                    } else {
                        int i4 = ((int) f) + this.LJIIIIZZ;
                        int i5 = ((int) f2) + this.LJIIJ;
                        int i6 = this.LJIILIIL;
                        tuxIconDrawable.setBounds(i4, i5, i4 + i6, i6 + i5);
                    }
                    tuxIconDrawable.draw(canvas);
                    if (this.LIZ) {
                        canvas.drawText(this.LJFF, ((f3 - this.LJIIIIZZ) - this.LJIILIIL) - this.LJIIJJI, this.LJIIL + f2 + this.LIZJ.getTextSize(), this.LIZJ);
                    } else {
                        canvas.drawText(this.LJFF, this.LJIIIIZZ + f + this.LJIILIIL + this.LJIIJJI, this.LJIIL + f2 + this.LIZJ.getTextSize(), this.LIZJ);
                    }
                }
                if (this.LIZ) {
                    float fMax = f3 - Math.max(f3 - f, this.LJIILL);
                    float f6 = this.LIZLLL;
                    canvas.drawRoundRect(fMax, f2, f3, f4, f6, f6, this.LIZIZ);
                } else {
                    float fMax2 = f + Math.max(f3 - f, this.LJIILL);
                    float f7 = this.LIZLLL;
                    canvas.drawRoundRect(f, f2, fMax2, f4, f7, f7, this.LIZIZ);
                }
                canvas.restore();
            }
        }, new C366970Ea7(this.LIZLLL), new AwS549S0100000_5(this, 1284)));
    }
}
