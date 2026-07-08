package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ey1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109070ey1 extends ConstraintLayout {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final C0KVZ LLILLL;

    public C1109070ey1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.gqw, this);
        this.LL = (TextView) findViewById(R.id.dpf);
        this.LLILLJJLI = (TextView) findViewById(R.id.p09);
        this.LLILLL = (C0KVZ) findViewById(R.id.bqd);
    }
}
