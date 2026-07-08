package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517770KSh extends C21578619ce {
    public boolean LL;
    public final BPEAHandler LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final View findFocus() {
        if (this.LL) {
            return findViewById(R.id.cel);
        }
        return null;
    }

    public C517770KSh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C517770KSh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper(), new C521750KdB(this, 3));
    }
}
