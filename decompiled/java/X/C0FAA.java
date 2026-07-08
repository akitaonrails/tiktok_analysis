package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FAA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAA extends RecyclerView.ViewHolder {
    public final int LL;
    public final FrameLayout LLILLJJLI;
    public final C1295960jpS LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FAA(View view, int i, int i2, int i3, int i4) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.iov);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.xp6);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.iow);
        View viewFindViewById = view.findViewById(R.id.bwa);
        this.LL = i;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = c1295960jpS;
        this.LLILZ = tuxIconView;
        this.LLILZIL = viewFindViewById;
        C786410Ut5.a6(this.LLILLJJLI, new RecyclerView.LayoutParams(i2, i3));
        int i5 = (i4 - i3) / 2;
        C426750GoL.LJIIIZ(frameLayout, null, Integer.valueOf(i5), null, Integer.valueOf(i5), false, 21);
        if (C293810BfP.LIZ()) {
            View view2 = this.LLILZIL;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i3 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                layoutParams2.gravity = 17;
                C786410Ut5.W5(view2, layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
