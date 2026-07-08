package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.0Gie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C423220Gie extends AppCompatTextView {
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public C423220Gie(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
