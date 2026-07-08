package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.TrackShowType;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC368090Ebv extends View implements InterfaceC368560Ecg, InterfaceC368470EcX {
    public final C368300EcG LL;
    public InterfaceC369190Edh LLILLJJLI;
    public InterfaceC369170Edf LLILLL;
    public final C01GW LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public C0E6E LLIZ;
    public float LLIZLLLIL;
    public NLETrackSlot LLJ;
    public InterfaceC368600Eck LLJI;

    public abstract /* synthetic */ int getBgColor();

    public abstract /* synthetic */ int getBgRadius();

    public abstract /* synthetic */ float getClipLength();

    public abstract /* synthetic */ RectF getClipRectF();

    public abstract /* synthetic */ boolean getDrawDivider();

    public abstract /* synthetic */ float getTimelineScale();

    public abstract /* synthetic */ void setBgColor(int i);

    public abstract /* synthetic */ void setBgRadius(int i);

    public abstract /* synthetic */ void setClipLength(float f);

    public abstract /* synthetic */ void setClipRectF(RectF rectF);

    public abstract /* synthetic */ void setDrawDivider(boolean z);

    public abstract /* synthetic */ void setItemSelected(boolean z);

    public abstract /* synthetic */ void setTimelineScale(float f);

    @Override // X.InterfaceC368470EcX
    public final boolean LIZ() {
        InterfaceC369170Edf interfaceC369170Edf = this.LLILLL;
        return interfaceC369170Edf != null && interfaceC369170Edf.LIZ() && LJII();
    }

    @Override // X.InterfaceC368470EcX
    public final void LJ() {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLJJLI;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LJ();
        }
    }

    @Override // X.InterfaceC368470EcX
    public final NLETimeSpaceNode LJIIIZ() {
        InterfaceC369170Edf interfaceC369170Edf = this.LLILLL;
        if (interfaceC369170Edf != null) {
            return interfaceC369170Edf.LIZIZ();
        }
        return null;
    }

    public final boolean LJIIJJI() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC368470EcX
    public final boolean LJIIIIZZ() {
        return LJII();
    }

    @Override // X.InterfaceC368470EcX
    public int getItemHeight() {
        return getMeasuredHeight();
    }

    @Override // X.InterfaceC368470EcX
    public int getItemWidth() {
        return getMeasuredWidth();
    }

    public final ViewGroup getParentView() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup parentView = getParentView();
        if (parentView != null) {
            this.LL.LJFF = new AwS549S0100000_5(parentView, 32);
        }
    }

    @Override // X.InterfaceC368470EcX
    public final void LJFF() {
        invalidate();
    }

    @Override // X.InterfaceC368560Ecg
    public float getClipStart() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC369170Edf getFrameDelegate() {
        return this.LLILLL;
    }

    public final InterfaceC369190Edh getListener() {
        return this.LLILLJJLI;
    }

    public final NLETrackSlot getNleTrackSlot$editor_trackpanel_release() {
        return this.LLJ;
    }

    public final int getTrackHeight() {
        return this.LLILZIL;
    }

    public C0E6E getTrackStyle() {
        return this.LLIZ;
    }

    public final InterfaceC368600Eck getViewDrawerDelegate() {
        return this.LLJI;
    }

    @Override // X.InterfaceC368560Ecg
    public final void LIZIZ(int i) {
        postInvalidateOnAnimation();
    }

    @Override // X.InterfaceC368470EcX
    public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLJJLI;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LIZJ(nLETimeSpaceNode);
        }
    }

    @Override // X.InterfaceC368470EcX
    public final void LIZLLL(long j) {
        InterfaceC369190Edh interfaceC369190Edh = this.LLILLJJLI;
        if (interfaceC369190Edh != null) {
            interfaceC369190Edh.LIZLLL(j);
        }
    }

    public void LJI(Canvas canvas) {
        NLETrackSlot nLETrackSlot = this.LLJ;
        if (nLETrackSlot == null) {
            return;
        }
        if (LIZ()) {
            this.LL.LJFF(nLETrackSlot);
            this.LL.LIZIZ(canvas, nLETrackSlot);
        }
        InterfaceC368600Eck interfaceC368600Eck = this.LLJI;
        if (interfaceC368600Eck != null) {
            interfaceC368600Eck.LIZJ(canvas);
        }
    }

    public final int LJIIJ(TrackShowType trackShowType) {
        if (LJII()) {
            return 0;
        }
        if (LJIIJJI()) {
            if (this.LLILZIL > AbstractC367990Ebl.LJIILJJIL - 1) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (trackShowType == TrackShowType.NORMAL) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        NLETrackSlot nLETrackSlot = this.LLJ;
        if (nLETrackSlot == null) {
            return;
        }
        this.LL.LIZIZ(canvas, nLETrackSlot);
        InterfaceC368600Eck interfaceC368600Eck = this.LLJI;
        if (interfaceC368600Eck != null) {
            interfaceC368600Eck.LIZJ(canvas);
        }
    }

    @Override // X.InterfaceC368560Ecg
    public void setClipStart(float f) {
        this.LLIZLLLIL = f;
        this.LL.LIZLLL = f;
        InterfaceC368600Eck interfaceC368600Eck = this.LLJI;
        if (interfaceC368600Eck != null) {
            interfaceC368600Eck.LIZLLL();
        }
    }

    @Override // X.InterfaceC368560Ecg
    public void setClipping(boolean z) {
        if (this.LLILZLL == z) {
            return;
        }
        this.LLILZLL = z;
        if (!z) {
            C368300EcG c368300EcG = this.LL;
            c368300EcG.LIZJ = 0;
            c368300EcG.LIZLLL = 0.0f;
            InterfaceC368600Eck interfaceC368600Eck = this.LLJI;
            if (interfaceC368600Eck != null) {
                interfaceC368600Eck.LIZ();
            }
        }
    }

    public final void setFrameDelegate(InterfaceC369170Edf interfaceC369170Edf) {
        this.LLILLL = interfaceC369170Edf;
    }

    public final void setListener(InterfaceC369190Edh interfaceC369190Edh) {
        this.LLILLJJLI = interfaceC369190Edh;
    }

    public final void setNleTrackSlot$editor_trackpanel_release(NLETrackSlot nLETrackSlot) {
        this.LLJ = nLETrackSlot;
    }

    public void setSegment(NLETrackSlot nLETrackSlot) {
        this.LL.LJ(nLETrackSlot);
        InterfaceC368600Eck interfaceC368600Eck = this.LLJI;
        if (interfaceC368600Eck != null) {
            interfaceC368600Eck.LIZIZ(nLETrackSlot);
        }
    }

    public final void setTrackHeight(int i) {
        this.LLILZIL = i;
    }

    @Override // X.InterfaceC368560Ecg
    public void setTrackStyle(C0E6E c0e6e) {
        this.LLIZ = c0e6e;
    }

    public final void setViewDrawerDelegate(InterfaceC368600Eck interfaceC368600Eck) {
        this.LLJI = interfaceC368600Eck;
    }

    public AbstractC368090Ebv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C368300EcG(this, context);
        this.LLILZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(22));
        int i2 = C360610EBv.LIZ;
        this.LLILZIL = C360610EBv.LJ;
        this.LLIZ = C0E6E.NONE;
    }
}
