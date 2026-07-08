package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVQ extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final ObjectAnimator LLILLL;

    public final TuxIconView getGuideIcon() {
        return this.LL;
    }

    public final TuxTextView getTextView() {
        return this.LLILLJJLI;
    }

    public C0EVQ(Context context) {
        super(context, null, 0);
        float fLIZIZ = C0EGK.LIZIZ() * 6.0f;
        C786410Ut5.Sd(R.layout.t4, C786410Ut5.ne(context), this);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.lg_);
        this.LL = tuxIconView;
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.zkr);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "translationY", 0.0f, -fLIZIZ, 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(3);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        this.LLILLL = objectAnimatorOfFloat;
        setOrientation(1);
    }
}
