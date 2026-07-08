package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129900fVc extends LinearLayout {
    public final C16FS LL;

    public C1129900fVc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.go6, this);
        this.LL = (C16FS) findViewById(R.id.p_y);
    }
}
