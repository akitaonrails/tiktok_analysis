package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384240F4s extends FrameLayout {
    public InterfaceC383900F3k LL;
    public final List<Pair<Long, Float>> LLILLJJLI;
    public final List<List<Float>> LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public final InterfaceC383900F3k getPainter() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC383900F3k interfaceC383900F3k;
        super.dispatchDraw(canvas);
        if ((!((ArrayList) this.LLILLJJLI).isEmpty() || !((ArrayList) this.LLILLL).isEmpty()) && (interfaceC383900F3k = this.LL) != null) {
            interfaceC383900F3k.LIZIZ(canvas, this, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILLL);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setPainter(InterfaceC383900F3k interfaceC383900F3k) {
        if (!Intrinsics.LJFF(this.LL, interfaceC383900F3k)) {
            this.LL = interfaceC383900F3k;
        }
    }

    public final void setStartRecordTime(long j) {
        InterfaceC383900F3k interfaceC383900F3k = this.LL;
        if (interfaceC383900F3k != null) {
            interfaceC383900F3k.LIZ();
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

    public C384240F4s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
    }
}
