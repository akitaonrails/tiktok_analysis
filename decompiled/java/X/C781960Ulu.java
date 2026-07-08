package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0Ulu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C781960Ulu extends AbstractC782010Ulz {
    public final Context LL;
    public final WindowManager LLILLJJLI;
    public final WindowManager.LayoutParams LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ = true;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public ValueAnimator LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;

    public C781960Ulu(Context context) {
        this.LL = context;
        this.LLILLJJLI = (WindowManager) C786410Ut5.H2(context, "window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LLILLL = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.windowAnimations = 0;
        this.LLJJ = (int) C497740JfY.LIZIZ(12.0f);
        this.LLJJI = (int) C497740JfY.LIZIZ(12.0f);
        this.LLJJIII = (int) C497740JfY.LIZIZ(12.0f);
        this.LLJJIJI = (int) C497740JfY.LIZIZ(200.0f);
    }
}
