package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* JADX INFO: renamed from: X.11kP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19588311kP<T extends StickerModel> extends FrameLayout implements InterfaceC487330J9f, InterfaceC19592111l1<T> {
    public final C19591211ks LL;
    public C0P0T LLILLJJLI;
    public PointF LLILLL;
    public InteractStickerStruct LLILZ;

    public AbstractC19588311kP(Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
    }

    public void LJIIZILJ() {
    }

    @Override // X.InterfaceC19592111l1
    public void destroy() {
    }

    public View getView() {
        return this;
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIJJLI() {
        LJIIZILJ();
    }

    public final C19591211ks getInteractStickerContainerCommonParam() {
        return this.LL;
    }

    public final PointF getLastDownPoint() {
        return this.LLILLL;
    }

    public final InteractStickerStruct getStruct() {
        return this.LLILZ;
    }

    public final C0P0T getTuxActionTooltip() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLILLL = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLastDownPoint(PointF pointF) {
        this.LLILLL = pointF;
    }

    public final void setStruct(InteractStickerStruct interactStickerStruct) {
        this.LLILZ = interactStickerStruct;
    }

    public final void setTuxActionTooltip(C0P0T c0p0t) {
        this.LLILLJJLI = c0p0t;
    }

    public void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t = this.LLILLJJLI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public AbstractC19588311kP(int i, Context context, AttributeSet attributeSet, C19591211ks c19591211ks) {
        super(context, attributeSet, i);
        this.LL = c19591211ks;
        this.LLILLL = new PointF(0.0f, 0.0f);
        this.LLILZ = new InteractStickerStruct();
    }

    public /* synthetic */ AbstractC19588311kP(int i, int i2, Context context, AttributeSet attributeSet) {
        this((i2 & 4) != 0 ? 0 : i, context, (i2 & 2) != 0 ? null : attributeSet, (C19591211ks) null);
    }
}
