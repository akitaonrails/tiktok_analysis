package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958210b2h extends FrameLayout {
    public C1324720kZq LL;
    public C1324720kZq LLILLJJLI;
    public AnimatorSet LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet;
        super.onDetachedFromWindow();
        AnimatorSet animatorSet2 = this.LLILLL;
        if (animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.LLILLL) == null) {
            return;
        }
        animatorSet.end();
    }

    public C958210b2h(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.g3_, this);
        this.LL = (C1324720kZq) findViewById(R.id.biz);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.bjp);
    }
}
