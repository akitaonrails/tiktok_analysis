package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GUN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUN extends C0GUM {
    public C0GUN() {
        throw null;
    }

    @Override // X.C0GUM, android.view.View
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(getRect(), null, 31);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    public C0GUN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
