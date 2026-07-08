package X;

import X.InterfaceC368560Ecg;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Ecf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC368550Ecf<ItemView extends View & InterfaceC368560Ecg> implements InterfaceC368720Ecw {
    public volatile boolean LL;
    public final RectF LLILLJJLI = new RectF();

    @Override // X.InterfaceC368720Ecw
    public boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC368720Ecw
    public boolean LJ() {
        return false;
    }

    public abstract ItemView LJIIIZ();

    @Override // X.InterfaceC368720Ecw
    public final int LJI() {
        return ((InterfaceC368560Ecg) LJIIIZ()).getBgColor();
    }

    @Override // X.InterfaceC368720Ecw
    public final void destroy() {
        ViewGroup viewGroup;
        View viewLJIIIZ = LJIIIZ();
        ViewParent parent = viewLJIIIZ.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewLJIIIZ, viewGroup);
    }

    @Override // X.InterfaceC368720Ecw
    public final ItemView getView() {
        return (ItemView) LJIIIZ();
    }

    public AbstractC368550Ecf(Context context) {
    }

    @Override // X.InterfaceC368720Ecw
    public final void LIZIZ(int i) {
        ((InterfaceC368560Ecg) LJIIIZ()).LIZIZ(i);
    }

    @Override // X.InterfaceC368720Ecw
    public final void LIZJ(int i) {
        ((InterfaceC368560Ecg) LJIIIZ()).setBgRadius(i);
    }

    @Override // X.InterfaceC368720Ecw
    public final void LIZLLL(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC368720Ecw
    public final void LJIIIIZZ(int i) {
        ((InterfaceC368560Ecg) LJIIIZ()).setBgColor(i);
    }

    @Override // X.InterfaceC368720Ecw
    public void setClipping(boolean z) {
        ((InterfaceC368560Ecg) LJIIIZ()).setClipping(z);
    }

    @Override // X.InterfaceC368720Ecw
    public final void setDrawDivider(boolean z) {
        ((InterfaceC368560Ecg) LJIIIZ()).setDrawDivider(z);
    }

    @Override // X.InterfaceC368720Ecw
    public final void setItemSelected(boolean z) {
        ((InterfaceC368560Ecg) LJIIIZ()).setItemSelected(z);
        if (!z) {
            ((InterfaceC368560Ecg) LJIIIZ()).setClipStart(0.0f);
            ((InterfaceC368560Ecg) LJIIIZ()).setClipLength(0.0f);
            ((InterfaceC368560Ecg) LJIIIZ()).setClipRectF(new RectF());
        }
    }

    @Override // X.InterfaceC368720Ecw
    public void setSegment(NLETrackSlot nLETrackSlot) {
        ((InterfaceC368560Ecg) LJIIIZ()).setSegment(nLETrackSlot);
    }

    @Override // X.InterfaceC368720Ecw
    public void setTimelineScale(float f) {
        ((InterfaceC368560Ecg) LJIIIZ()).setTimelineScale(f);
    }

    @Override // X.InterfaceC368720Ecw
    public final void LJII(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, C0E6E c0e6e) {
        ((InterfaceC368560Ecg) LJIIIZ()).setClipStart(f5);
        ((InterfaceC368560Ecg) LJIIIZ()).setClipLength(f6);
        canvas.save();
        this.LLILLJJLI.set(f, f2, f3, f4);
        ((InterfaceC368560Ecg) LJIIIZ()).setClipRectF(this.LLILLJJLI);
        canvas.clipRect(this.LLILLJJLI);
        canvas.translate(f, f2);
        ((InterfaceC368560Ecg) LJIIIZ()).setTrackStyle(c0e6e);
        ((InterfaceC368560Ecg) LJIIIZ()).LJI(canvas);
        canvas.restore();
    }
}
