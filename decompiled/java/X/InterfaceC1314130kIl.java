package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0kIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1314130kIl {
    void afterDispatchDraw(Canvas canvas);

    void afterDraw(Canvas canvas);

    void afterDrawChild(Canvas canvas, View view, long j);

    void beforeDispatchDraw(Canvas canvas);

    void beforeDraw(Canvas canvas);

    Rect beforeDrawChild(Canvas canvas, View view, long j);

    int getChildDrawingOrder(int i, int i2);

    boolean hasOverlappingRendering();

    void performLayoutChildrenUI();

    void performMeasureChildrenUI();
}
