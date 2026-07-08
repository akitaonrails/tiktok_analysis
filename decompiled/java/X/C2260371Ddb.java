package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.1Ddb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260371Ddb extends FrameLayout {
    public InterfaceC2260401Dde LL;
    public C2260381Ddc LLILLJJLI;
    public boolean LLILLL;

    public final boolean getHasConsumed() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2260371Ddb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setHasConsumed(boolean z) {
        this.LLILLL = z;
    }

    public final void setOnGestureListener(InterfaceC2260401Dde interfaceC2260401Dde) {
        this.LL = interfaceC2260401Dde;
        this.LLILLJJLI = new C2260381Ddc(getContext(), interfaceC2260401Dde);
    }

    public C2260371Ddb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = true;
    }
}
