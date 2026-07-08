package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0DTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTJ extends ConstraintLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final float LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public DataChannel LLJJ;

    public final DataChannel getDataChannel() {
        return this.LLJJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DTJ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJJ = dataChannel;
    }

    public C0DTJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = C497740JfY.LIZIZ(12);
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
        this.LLJIJIL = C497740JfY.LIZIZ(30);
    }
}
