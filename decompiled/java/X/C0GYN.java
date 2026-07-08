package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GYN extends RelativeLayout {
    public View LL;
    public View LLILLJJLI;

    private int getLayoutId() {
        return C497740JfY.LJJ() ? R.layout.hr1 : R.layout.hr0;
    }

    public View getDanmuContainer() {
        return this.LL;
    }

    public View getDanmuInput() {
        return this.LLILLJJLI;
    }

    public C0GYN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), getLayoutId(), this);
        this.LL = findViewById(R.id.ffh);
        this.LLILLJJLI = findViewById(R.id.fff);
    }
}
