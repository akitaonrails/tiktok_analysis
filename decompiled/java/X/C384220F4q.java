package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384220F4q extends FrameLayout {
    public InterfaceC384230F4r LL;
    public final List<Pair<Long, Float>> LLILLJJLI;
    public final List<List<Float>> LLILLL;

    public final InterfaceC384230F4r getPainter() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC384230F4r interfaceC384230F4r;
        super.dispatchDraw(canvas);
        if ((!((ArrayList) this.LLILLJJLI).isEmpty() || !((ArrayList) this.LLILLL).isEmpty()) && (interfaceC384230F4r = this.LL) != null) {
            interfaceC384230F4r.LIZIZ(canvas, this, this.LLILLJJLI, this.LLILLL);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setPainter(InterfaceC384230F4r interfaceC384230F4r) {
        if (!Intrinsics.LJFF(this.LL, interfaceC384230F4r)) {
            this.LL = interfaceC384230F4r;
        }
    }

    public final void setStartRecordTime(long j) {
        InterfaceC384230F4r interfaceC384230F4r = this.LL;
        if (interfaceC384230F4r != null) {
            interfaceC384230F4r.LIZ();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        invalidate();
    }

    public final void setWavePointList(List<? extends List<Float>> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
        invalidate();
    }

    public final void setWavePoints(List<Pair<Long, Float>> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        invalidate();
    }

    public C384220F4q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
    }
}
