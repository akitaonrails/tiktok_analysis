package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZQ extends TuxTextView {
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final float LLJL = C418440Gaw.LIZIZ(200);
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    public float LLJJJJ;
    public Integer LLJJJJJIL;
    public Integer LLJJJJLIIL;

    public C0GZQ(Context context) {
        super(context, null, 0);
        this.LLJJJJ = LLJL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int i = LLJJL;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = LLJJLIIIJLLLLLLLZ;
        C426750GoL.LJIIL(this, numValueOf, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), 16);
        setGravity(16);
        setTuxFont(71);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
