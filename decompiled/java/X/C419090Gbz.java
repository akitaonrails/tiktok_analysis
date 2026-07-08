package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C419090Gbz extends LinearLayout {
    public C418880Gbe LL;
    public TextView LLILLJJLI;

    public final void LIZ() {
        LinearLayout.inflate(getContext(), R.layout.h5b, this);
        setOrientation(1);
        setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.e_7));
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        this.LL = (C418880Gbe) findViewById(R.id.b4e);
        this.LLILLJJLI = (TextView) findViewById(R.id.xrk);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            this.LL.LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.LIZJ();
    }

    public C419090Gbz(Context context) {
        super(context);
        LIZ();
    }

    public void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.LLILLJJLI.setText(getContext().getString(2131853470));
        } else {
            this.LLILLJJLI.setText(charSequence);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.LL.LIZIZ();
            return;
        }
        C418880Gbe c418880Gbe = this.LL;
        if (!c418880Gbe.LLJ) {
            return;
        }
        c418880Gbe.LIZJ();
    }

    public C419090Gbz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ();
    }

    public C419090Gbz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ();
    }
}
