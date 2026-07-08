package X;

import Y.ALAdapterS1S0110000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424820GlE extends C214906198m {
    public final View LL;
    public final RecyclerView LLILLJJLI;
    public ObjectAnimator LLILLL;
    public boolean LLILZ;

    public final void hide() {
        LJJIIJ(new Pair(Integer.valueOf(this.LL.getMeasuredWidth()), Integer.valueOf(this.LL.getMeasuredHeight())), false);
        this.LLILZ = false;
    }

    public C424820GlE(Context context) {
        super(context);
        View viewSd = C786410Ut5.Sd(R.layout.bp5, C786410Ut5.ne(context), null);
        this.LL = viewSd;
        setContentView(viewSd);
        setBackgroundDrawable(new ColorDrawable(0));
        RecyclerView recyclerView = (RecyclerView) viewSd.findViewById(R.id.kbj);
        this.LLILLJJLI = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    public final void LJJIIJ(Pair pair, boolean z) {
        float f;
        ObjectAnimator objectAnimator = this.LLILLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.LL;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = -((Number) pair.getSecond()).intValue();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = -((Number) pair.getSecond()).intValue();
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new ALAdapterS1S0110000_6(this, z, 1));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLILLL = objectAnimatorOfFloat;
    }
}
