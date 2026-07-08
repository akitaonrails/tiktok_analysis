package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.19b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21568419b0 extends GradientDrawable {
    public final Context LIZ;
    public final C0OVA LIZIZ;
    public final C0OTJ LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(542));
    public final float LJFF = C418440Gaw.LIZIZ(4);
    public final Path LJI;

    public Paint LIZ() {
        throw null;
    }

    public final Paint LIZIZ() {
        return (Paint) this.LJ.getValue();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        C0OV6 c0ov6;
        super.draw(canvas);
        C21568519b1 c21568519b1 = (C21568519b1) this;
        if (c21568519b1.LJII) {
            if ((this.LIZJ.isMirror() && !this.LIZLLL) || (!this.LIZJ.isMirror() && this.LIZLLL)) {
                canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
            }
        } else if ((this.LIZJ.isSubscriberMirror() && this.LIZLLL) || (!this.LIZJ.isSubscriberMirror() && !this.LIZLLL)) {
            canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        }
        canvas.save();
        canvas.translate(this.LJFF - 1, 0.0f);
        C0OV6 c0ov62 = this.LIZIZ.LIZ;
        if (c0ov62 != null) {
            f = c0ov62.LIZ;
            f2 = c0ov62.LIZIZ;
            f3 = c0ov62.LIZJ;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (!this.LIZJ.hasTail() && (c0ov6 = this.LIZIZ.LIZ) != null) {
            f4 = c0ov6.LIZLLL;
        } else {
            f4 = 0.0f;
        }
        int i = 0;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getBounds().width() - this.LJFF, getBounds().height()), fArr, Path.Direction.CW);
        canvas.drawPath(path, LIZ());
        Path path2 = new Path();
        path2.addRect(0.0f, getBounds().height() - this.LJFF, 0.0f, getBounds().height(), Path.Direction.CW);
        AnonymousClass0123 anonymousClass0123 = c21568519b1.LIZIZ.LIZIZ;
        if (anonymousClass0123 != null) {
            anonymousClass0123.LIZ(c21568519b1.LIZ, c21568519b1.LIZIZ());
        }
        c21568519b1.LIZIZ().setStyle(Paint.Style.FILL);
        Paint paintLIZIZ = c21568519b1.LIZIZ();
        C0OT1 c0ot1 = c21568519b1.LIZIZ.LIZJ;
        if (c0ot1 != null) {
            i = c0ot1.LIZ;
        }
        paintLIZIZ.setColor(i);
        Paint paintLIZIZ2 = c21568519b1.LIZIZ();
        paintLIZIZ2.setShader(c21568519b1.LIZJ());
        canvas.drawPath(path2, paintLIZIZ2);
        canvas.restore();
        canvas.save();
        canvas.translate(0.0f, getBounds().height() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        if (this.LIZJ.hasTail()) {
            canvas.drawPath(this.LJI, LIZ());
        }
        canvas.restore();
    }

    public C21568419b0(Context context, C0OVA c0ova, C0OTJ c0otj) {
        this.LIZ = context;
        this.LIZIZ = c0ova;
        this.LIZJ = c0otj;
        this.LIZLLL = C426750GoL.LIZLLL(context);
        Path path = new Path();
        path.moveTo(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(9));
        path.lineTo(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(Double.valueOf(0.828d)));
        path.cubicTo(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(Double.valueOf(2.0265d)), C418440Gaw.LIZIZ(Double.valueOf(3.4626d)), C418440Gaw.LIZIZ(Double.valueOf(3.1619d)), C418440Gaw.LIZIZ(Double.valueOf(2.5357d)), C418440Gaw.LIZIZ(Double.valueOf(3.9216d)));
        path.lineTo(C418440Gaw.LIZIZ(Double.valueOf(0.7454d)), C418440Gaw.LIZIZ(Double.valueOf(5.389d)));
        path.cubicTo(C418440Gaw.LIZIZ(Double.valueOf(0.2736d)), C418440Gaw.LIZIZ(Double.valueOf(5.7758d)), C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(Double.valueOf(6.3537d)), C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(Double.valueOf(6.9638d)));
        path.cubicTo(C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(Double.valueOf(8.0884d)), C418440Gaw.LIZIZ(Double.valueOf(0.9116d)), C418440Gaw.LIZIZ(9), C418440Gaw.LIZIZ(Double.valueOf(2.0362d)), C418440Gaw.LIZIZ(9));
        path.lineTo(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(9));
        path.close();
        this.LJI = path;
    }
}
