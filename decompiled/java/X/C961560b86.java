package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961560b86 extends LinearLayout {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;

    public C961560b86(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9b, this, true);
        setOrientation(0);
        setGravity(16);
        this.LL = (TextView) findViewById(R.id.zt1);
        this.LLILLJJLI = (TextView) findViewById(R.id.zq2);
        this.LLILLL = (TextView) findViewById(R.id.zxs);
        this.LLILZ = (TextView) findViewById(R.id.tv_seconds);
    }
}
