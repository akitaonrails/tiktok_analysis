package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C419320GcM extends FrameLayout {
    public TuxTextView LL;
    public TextView LLILLJJLI;
    public ImageView LLILLL;

    public C419320GcM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d8p, this, true);
        this.LL = (TuxTextView) findViewById(R.id.tv_title);
        this.LLILLJJLI = (TextView) findViewById(R.id.zhs);
        this.LLILLL = (ImageView) findViewById(R.id.kgu);
    }
}
