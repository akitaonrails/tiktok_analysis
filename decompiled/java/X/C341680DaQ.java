package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341680DaQ extends FrameLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    public C341680DaQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.dzz, this);
        this.LL = (TuxTextView) findViewById(R.id.r07);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.r06);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(200));
        setBackground(c384050F3z.LIZ(getContext()));
    }
}
