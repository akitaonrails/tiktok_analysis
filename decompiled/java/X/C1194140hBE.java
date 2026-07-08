package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194140hBE extends ConstraintLayout {
    public final InterfaceC1194150hBF LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final View LLILZLL;
    public boolean LLIZ;

    public final boolean getInDetail() {
        return this.LLILLJJLI;
    }

    public final boolean getInPosts() {
        return this.LLILZIL;
    }

    public C1194140hBE(Context context, InterfaceC1194150hBF interfaceC1194150hBF, boolean z, String str, String str2, boolean z2) {
        View viewFindViewById;
        View viewFindViewById2;
        super(context, null);
        this.LL = interfaceC1194150hBF;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z2;
        if (z) {
            if (z2) {
                View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.dym, this);
                this.LLILZLL = viewLJLLJ;
                if (viewLJLLJ != null && (viewFindViewById2 = viewLJLLJ.findViewById(R.id.brf)) != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                    layoutParams.height = (int) ((C497820Jfg.LIZIZ(context) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) / 5.0f);
                    C786410Ut5.W5(viewFindViewById2, layoutParams);
                    return;
                }
                return;
            }
            View viewLJLLJ2 = C786410Ut5.LJLLJ(context, R.layout.dyn, this);
            this.LLILZLL = viewLJLLJ2;
            if (viewLJLLJ2 == null || (viewFindViewById = viewLJLLJ2.findViewById(R.id.brf)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            layoutParams2.height = (int) ((C497820Jfg.LIZIZ(context) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) / 5.0f);
            C786410Ut5.W5(viewFindViewById, layoutParams2);
            return;
        }
        this.LLILZLL = C786410Ut5.LJLLJ(context, R.layout.dyl, this);
    }
}
