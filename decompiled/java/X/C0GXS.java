package X;

import android.content.Context;
import android.graphics.Canvas;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0GXS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXS extends TuxIconDrawable {
    public float LJIIZILJ;

    @Override // com.bytedance.tux.drawable.TuxIconDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        canvas.save();
        canvas.rotate(this.LJIIZILJ, getBounds().left + (iWidth / 2.0f), getBounds().top + (iHeight / 2.0f));
        super.draw(canvas);
        canvas.restore();
    }

    public C0GXS(Context context, int i) {
        super(context, i);
    }
}
