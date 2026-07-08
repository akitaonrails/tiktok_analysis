package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420560GeM extends FrameLayout implements C0T8B {
    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public C420560GeM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.gol, this);
        TextView textView = (TextView) findViewById(R.id.iwr);
        textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), 500, context));
    }
}
