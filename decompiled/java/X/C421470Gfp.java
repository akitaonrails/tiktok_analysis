package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421470Gfp extends TuxTextView {
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;

    public final int getCount() {
        return this.LLJJJJJIL;
    }

    public final int getEndPosition() {
        return this.LLJJJJ;
    }

    public final int getSpeed() {
        return this.LLJJJJLIIL;
    }

    public final int getTaskInterval() {
        return this.LLJJL;
    }

    public final void setCount(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setEndPosition(int i) {
        this.LLJJJJ = i;
    }

    public final void setSpeed(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setTaskInterval(int i) {
        this.LLJJL = i;
    }

    public C421470Gfp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        this.LLJJJJLIIL = 40;
        this.LLJJL = 25;
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }
}
