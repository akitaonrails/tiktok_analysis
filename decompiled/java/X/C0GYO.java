package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GYO extends RelativeLayout {
    public TextView LL;

    public void setInfoText(CharSequence charSequence) {
        this.LL.setText(charSequence);
    }

    public C0GYO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), R.layout.bbr, this);
        this.LL = (TextView) findViewById(R.id.tv_warn_info);
    }
}
