package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687030QxB extends FrameLayout {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
    public final TuxTextView LL;
    public final SurfaceHolderCallbackC1324390kZJ LLILLJJLI;
    public final SurfaceHolderCallbackC1324410kZL LLILLL;
    public final SmartImageView LLILZ;
    public ObjectAnimator LLILZIL;

    public final void LIZ() {
        C786410Ut5.LJLLLLLL(8, this);
        SurfaceHolderCallbackC1324390kZJ surfaceHolderCallbackC1324390kZJ = this.LLILLJJLI;
        if (surfaceHolderCallbackC1324390kZJ != null) {
            C786410Ut5.LJLLLLLL(8, surfaceHolderCallbackC1324390kZJ);
        }
        SurfaceHolderCallbackC1324410kZL surfaceHolderCallbackC1324410kZL = this.LLILLL;
        if (surfaceHolderCallbackC1324410kZL != null) {
            C786410Ut5.LJLLLLLL(8, surfaceHolderCallbackC1324410kZL);
        }
    }

    public final void LIZIZ(long j) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCountDownTime: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        SurfaceHolderCallbackC1324390kZJ surfaceHolderCallbackC1324390kZJ = this.LLILLJJLI;
        if (surfaceHolderCallbackC1324390kZJ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j);
            sbLIZ2.append('s');
            surfaceHolderCallbackC1324390kZJ.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public C687030QxB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bol, this, true);
        this.LL = (TuxTextView) findViewById(R.id.e3g);
        this.LLILLJJLI = (SurfaceHolderCallbackC1324390kZJ) findViewById(R.id.f04);
        this.LLILLL = (SurfaceHolderCallbackC1324410kZL) findViewById(R.id.s8q);
        this.LLILZ = (SmartImageView) findViewById(R.id.e3o);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LLIZLLLIL, LLJ);
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = LLILZLL;
        layoutParams.setMarginEnd(0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
