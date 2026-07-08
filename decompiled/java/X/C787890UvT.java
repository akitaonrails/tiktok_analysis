package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787890UvT extends FrameLayout {
    public final SmartImageView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    public C787890UvT(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e2g, this, true);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.l8b);
        this.LL = (SmartImageView) findViewById(R.id.l8c);
        this.LLILLL = (TuxTextView) findViewById(R.id.z9g);
        this.LLILZ = (TuxTextView) findViewById(R.id.zpf);
    }
}
