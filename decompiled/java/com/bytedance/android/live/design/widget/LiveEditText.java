package com.bytedance.android.live.design.widget;

import X.C20743316Fb;
import X.C20745516Fx;
import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public class LiveEditText extends C20743316Fb {
    public boolean LLJ;
    public C20745516Fx LLJI;

    public LiveEditText() {
        throw null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        this.LLJI.LJIIIIZZ(i);
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cc0);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, this.LLJI.LJIIIZ(f));
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.LLJ) {
            this.LLJ = true;
            C20745516Fx c20745516Fx = new C20745516Fx(this);
            this.LLJI = c20745516Fx;
            c20745516Fx.LJII(attributeSet, i, 0);
        }
    }
}
