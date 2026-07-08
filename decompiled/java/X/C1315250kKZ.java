package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0kKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315250kKZ extends View implements InterfaceC1315370kKl {
    public final int LL;
    public final C1315260kKa LLILLJJLI;
    public final C1315220kKW LLILLL;

    @Override // X.InterfaceC1315370kKl
    public final void LIZ(C1315320kKg c1315320kKg, Rect rect) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1315260kKa c1315260kKa = this.LLILLJJLI;
        if (c1315260kKa == null) {
            return;
        }
        C1315220kKW c1315220kKW = this.LLILLL;
        c1315220kKW.canvas_ = canvas;
        c1315260kKa.LIZ.drawExtraContent(c1315220kKW, this.LL);
    }

    public C1315250kKZ(Context context, C1315260kKa c1315260kKa, int i) {
        super(context);
        setWillNotDraw(false);
        this.LLILLJJLI = c1315260kKa;
        this.LL = i;
        this.LLILLL = new C1315220kKW(null, c1315260kKa.LIZ.getResourceManager(), this);
    }
}
