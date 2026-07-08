package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0JN0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0JN0 extends FrameLayout {
    public C0JO7 LL;
    public InterfaceC497601wk LLILLJJLI;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public final InterfaceC489790JIr getGestureLayout() {
        C0JO7 c0jo7 = this.LL;
        if (c0jo7 != null) {
            return c0jo7.getGestureLayout();
        }
        return null;
    }

    public final C0JN1 getOverlayLayout() {
        C0JO7 c0jo7 = this.LL;
        if (c0jo7 != null) {
            return c0jo7.getOverlayLayout();
        }
        return null;
    }

    public final C0JNE getPlayerChannel() throws Exception {
        C0JNE playerChannel;
        C0JO7 c0jo7 = this.LL;
        if (c0jo7 == null || (playerChannel = c0jo7.getPlayerChannel()) == null) {
            throw new Exception("player channel should not be null");
        }
        return playerChannel;
    }

    public final C0JN2 getVideoLayout() {
        C0JO7 c0jo7 = this.LL;
        if (c0jo7 != null) {
            return c0jo7.getVideoLayout();
        }
        return null;
    }

    public final C0JO7 getBaseParent() {
        return this.LL;
    }

    public final InterfaceC497601wk getCoroutineScope() {
        return this.LLILLJJLI;
    }

    public final void setBaseParent(C0JO7 c0jo7) {
        this.LL = c0jo7;
    }

    public final void setCoroutineScope(InterfaceC497601wk interfaceC497601wk) {
        this.LLILLJJLI = interfaceC497601wk;
    }

    public C0JN0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    }

    public final void LIZJ(C0JO7 c0jo7, InterfaceC497601wk interfaceC497601wk) {
        this.LL = c0jo7;
        this.LLILLJJLI = interfaceC497601wk;
        LIZIZ();
        LIZ();
    }
}
