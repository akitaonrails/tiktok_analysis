package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20744116Fj extends C20744316Fl {
    public C20745516Fx LLIZ;
    public C20743916Fh LLIZLLLIL;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C20743916Fh c20743916Fh = this.LLIZLLLIL;
        if (c20743916Fh == null) {
            super.draw(canvas);
            return;
        }
        boolean zLJFF = c20743916Fh.LLILLJJLI.LJFF(canvas);
        super.draw(canvas);
        this.LLIZLLLIL.LLILLJJLI.getClass();
        if (!zLJFF) {
            return;
        }
        canvas.restore();
    }

    public C20744116Fj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C20743916Fh c20743916Fh = new C20743916Fh(this);
        this.LLIZLLLIL = c20743916Fh;
        c20743916Fh.LJII(attributeSet, R.attr.c8l, 0);
        C20745516Fx c20745516Fx = new C20745516Fx(this);
        this.LLIZ = c20745516Fx;
        c20745516Fx.LJII(attributeSet, R.attr.c8l, 0);
        new C20744816Fq(this).LJII(attributeSet, R.attr.c8l, 0);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.LLIZ.LJIIIIZZ(i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, this.LLIZ.LJIIIZ(f));
    }
}
