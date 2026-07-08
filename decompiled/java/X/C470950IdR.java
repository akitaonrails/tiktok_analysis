package X;

import Y.AObserverS211S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C470950IdR extends C470960IdS {
    public final ViewGroup LL;
    public final C16FZ LLILLJJLI;
    public final PagingViewModel LLILLL;

    @Override // X.C470960IdS
    public final void I5() {
        this.LLILLL.LL.observeForever(new AObserverS211S0100000_7(this, 57));
    }

    public C470950IdR(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LLILLL = pagingViewModel;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.nlo);
        this.LL = viewGroup;
        C16FZ c16fz = new C16FZ(view.getContext(), null);
        this.LLILLJJLI = c16fz;
        viewGroup.addView(c16fz);
    }
}
