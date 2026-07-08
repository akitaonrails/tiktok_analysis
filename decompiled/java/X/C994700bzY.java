package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994700bzY extends FrameLayout {
    public final C1295960jpS LL;
    public final C1295960jpS LLILLJJLI;
    public final C1295960jpS LLILLL;
    public AnimatorSet LLILZ;

    public C994700bzY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h32, this, true);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.ntz);
        this.LL = c1295960jpS;
        C1295960jpS c1295960jpS2 = (C1295960jpS) findViewById(R.id.nu0);
        this.LLILLJJLI = c1295960jpS2;
        C1295960jpS c1295960jpS3 = (C1295960jpS) findViewById(R.id.nu1);
        this.LLILLL = c1295960jpS3;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS.cancelAnimation();
        }
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
            c1295960jpS2.cancelAnimation();
        }
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllAnimatorListeners();
            c1295960jpS3.cancelAnimation();
        }
    }
}
