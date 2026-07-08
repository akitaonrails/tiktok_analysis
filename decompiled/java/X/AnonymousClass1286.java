package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1286, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1286 extends TuxTextView {
    public AnonymousClass1285 LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final ARunnableS129S0100000_29 LLJL;

    public final int getCount() {
        return this.LLJJJJLIIL;
    }

    public final int getEndPosition() {
        return this.LLJJJJJIL;
    }

    public final int getSpeed() {
        return this.LLJJL;
    }

    public final int getTaskInterval() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final void setCount(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setEndPosition(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setSpeed(int i) {
        this.LLJJL = i;
    }

    public final void setTaskInterval(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public AnonymousClass1286(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        this.LLJJJJLIIL = -1;
        this.LLJJL = 40;
        this.LLJJLIIIJLLLLLLLZ = 25;
        this.LLJL = new ARunnableS129S0100000_29(this, 171);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        AnonymousClass1285 anonymousClass1285 = this.LLJJJJ;
        if (anonymousClass1285 != null && !anonymousClass1285.LJII) {
            anonymousClass1285.LJII = true;
        }
        this.LLJJJJ = null;
        super.setText(charSequence, bufferType);
    }
}
