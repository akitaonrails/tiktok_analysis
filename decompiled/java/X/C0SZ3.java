package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZ3 extends RelativeLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    public C0SZ3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.LJLLJ(getContext(), R.layout.b7z, this);
        int iLIZJ = (int) C12ES.LIZJ(16.0f, getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(14.0f, getContext());
        setPadding(iLIZJ, iLIZJ2, iLIZJ, iLIZJ2);
        setGravity(16);
        this.LL = (TuxTextView) findViewById(R.id.desc);
        findViewById(R.id.l8u);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.jxe);
    }
}
