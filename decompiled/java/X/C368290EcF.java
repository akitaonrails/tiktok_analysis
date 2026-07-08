package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368290EcF extends View implements InterfaceC368470EcX {
    public final C368300EcG LL;
    public NLETrackSlot LLILLJJLI;
    public InterfaceC369190Edh LLILLL;
    public InterfaceC369150Edd LLILZ;

    @Override // X.InterfaceC368470EcX
    public final boolean LIZ() {
        InterfaceC369150Edd interfaceC369150Edd = this.LLILZ;
        if (interfaceC369150Edd != null) {
            return interfaceC369150Edd.LIZ();
        }
        return false;
    }

    @Override // X.InterfaceC368470EcX
    public final void LJ() {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLL;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LJ();
        }
    }

    @Override // X.InterfaceC368470EcX
    public final boolean LJIIIIZZ() {
        InterfaceC369150Edd interfaceC369150Edd = this.LLILZ;
        if (interfaceC369150Edd != null) {
            return interfaceC369150Edd.LJIIIIZZ();
        }
        return false;
    }

    @Override // X.InterfaceC368470EcX
    public final NLETimeSpaceNode LJIIIZ() {
        InterfaceC369150Edd interfaceC369150Edd = this.LLILZ;
        if (interfaceC369150Edd != null) {
            return interfaceC369150Edd.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC368470EcX
    public int getItemHeight() {
        return getMeasuredHeight();
    }

    @Override // X.InterfaceC368470EcX
    public int getItemWidth() {
        return getMeasuredWidth();
    }

    @Override // X.InterfaceC368470EcX
    public final void LJFF() {
        invalidate();
    }

    public final InterfaceC369150Edd getCallback() {
        return this.LLILZ;
    }

    public final InterfaceC369190Edh getFrameSelectChangeChangeListener() {
        return this.LLILLL;
    }

    public final void LIZIZ(C0E6E c0e6e) {
        NLETrackSlot nLETrackSlot;
        int i = C0E6G.LIZ[c0e6e.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                int visibility = getVisibility();
                setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, this);
                return;
            }
            throw new C1954807lC();
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        invalidate();
        if (getVisibility() != 0 || (nLETrackSlot = this.LLILLJJLI) == null) {
            return;
        }
        this.LL.LJFF(nLETrackSlot);
    }

    @Override // X.InterfaceC368470EcX
    public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLL;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LIZJ(nLETimeSpaceNode);
        }
    }

    @Override // X.InterfaceC368470EcX
    public final void LIZLLL(long j) {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLL;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LIZLLL(j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILLJJLI != null && getVisibility() == 0) {
            this.LL.LIZIZ(canvas, this.LLILLJJLI);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long jLongValue;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        NLETrackSlot nLETrackSlot = this.LLILLJJLI;
        if (nLETrackSlot == null) {
            return super.onTouchEvent(motionEvent);
        }
        C368300EcG c368300EcG = this.LL;
        c368300EcG.getClass();
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action == 1) {
                long j = c368300EcG.LJ;
                if (j > 0) {
                    c368300EcG.LIZ.LIZLLL(j);
                }
            }
        } else {
            Long lLIZ = c368300EcG.LIZ(nLETrackSlot, motionEvent.getX());
            if (lLIZ != null) {
                jLongValue = lLIZ.longValue();
            } else {
                jLongValue = -1;
            }
            c368300EcG.LJ = jLongValue;
            if (!c368300EcG.LIZ.LIZ() || !c368300EcG.LIZ.LJIIIIZZ() || c368300EcG.LJ <= 0) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCallback(InterfaceC369150Edd interfaceC369150Edd) {
        this.LLILZ = interfaceC369150Edd;
    }

    public final void setFrameSelectChangeChangeListener(InterfaceC369190Edh interfaceC369190Edh) {
        this.LLILLL = interfaceC369190Edh;
    }

    public final void setFrameViewCallback(InterfaceC369150Edd interfaceC369150Edd) {
        this.LLILZ = interfaceC369150Edd;
        this.LL.LJFF = new AwS549S0100000_5(this, 969);
    }

    public final void setSlot(NLETrackSlot nLETrackSlot) {
        this.LLILLJJLI = nLETrackSlot;
        if (nLETrackSlot != null) {
            this.LL.LJ(nLETrackSlot);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C368290EcF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C368300EcG(this, context);
    }
}
