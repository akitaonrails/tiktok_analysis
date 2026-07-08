package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20479115Bl extends View {
    public final List<C20479215Bm> LL;

    public C20479115Bl(Context context) {
        this(context, null, 6);
    }

    public C20479115Bl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        ((ArrayList) this.LL).clear();
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (C20479215Bm c20479215Bm : this.LL) {
            canvas.drawRect(c20479215Bm.LIZ, c20479215Bm.LIZIZ);
        }
    }

    public final void setAreas(List<C20479215Bm> list) {
        if (list != null) {
            ((ArrayList) this.LL).addAll(list);
        }
        invalidate();
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public C20479115Bl(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new ArrayList();
    }
}
