package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ov0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634720Ov0 extends ConstraintLayout {
    public final SmartImageView LL;

    public C634720Ov0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        C634730Ov1.LIZ.getClass();
        if (C634730Ov1.LIZ().bubbleStyle == EnumC634740Ov2.SMALL.getStyle()) {
            i2 = R.layout.bog;
        } else {
            i2 = R.layout.bof;
        }
        C786410Ut5.Td(C786410Ut5.ne(context), i2, this, true);
        this.LL = (SmartImageView) findViewById(R.id.cxi);
    }
}
