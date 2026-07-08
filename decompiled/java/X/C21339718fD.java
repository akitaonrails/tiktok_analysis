package X;

import Y.ATListenerS464S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS433S0200000_32;

/* JADX INFO: renamed from: X.18fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21339718fD extends ConstraintLayout {
    public DataChannel LL;
    public final C01GW LLILLJJLI;

    public C21339718fD(Context context) {
        this(context, null, 6, 0);
    }

    public C21339718fD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLILLJJLI.getValue();
    }

    public final DataChannel getDataChannel() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public C21339718fD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS433S0200000_32(context, this, 5));
        setOnTouchListener(new ATListenerS464S0100000_32(this, 0));
    }

    public /* synthetic */ C21339718fD(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
