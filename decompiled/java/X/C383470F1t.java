package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS654S0100000_5;

/* JADX INFO: renamed from: X.0F1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383470F1t extends RecyclerView.ViewHolder {
    public final RecyclerView LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public AwS619S0100000_5 LLILZ;
    public AwS654S0100000_5 LLILZIL;
    public AwS619S0100000_5 LLILZLL;
    public final C367060EaG LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public C383450F1r LLJI;

    public C383470F1t(C1361400lX0 c1361400lX0, RecyclerView recyclerView, View view, TuxTextView tuxTextView) {
        int iIntValue;
        int iIntValue2;
        super(view);
        this.LL = recyclerView;
        this.LLILLJJLI = view;
        this.LLILLL = tuxTextView;
        C367060EaG c367060EaG = (C367060EaG) view.findViewById(R.id.ha3);
        this.LLIZ = c367060EaG;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.p09);
        this.LLIZLLLIL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.s8j);
        this.LLJ = tuxTextView3;
        View view2 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            C786410Ut5.W5(view2, layoutParams);
            C426750GoL.LJIIIZ(tuxTextView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null, null, false, 30);
            C426750GoL.LJIIIZ(tuxTextView3, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, false, 27);
            C426750GoL.LJIIL(c367060EaG, null, 0, null, 0, 21);
            C426750GoL.LJIIIZ(c367060EaG, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, false, 18);
            C366990Ea9 c366990Ea9 = new C366990Ea9();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            c366990Ea9.LIZ = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = -16777216;
            }
            c366990Ea9.LIZIZ = iIntValue2;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.oz, c1361400lX0);
            c366990Ea9.LIZLLL = numLIZJ3 != null ? numLIZJ3.intValue() : -16777216;
            c367060EaG.setProgressDrawable(c366990Ea9);
            c367060EaG.setEnableThumbAlign(true);
            float fLIZIZ = C418440Gaw.LIZIZ(20);
            float fLIZIZ2 = C418440Gaw.LIZIZ(24);
            c367060EaG.LLJJJJJIL = fLIZIZ;
            c367060EaG.LLJJJJLIIL = fLIZIZ2;
            C786410Ut5.zb(c367060EaG, new C391570FWx(this, 5));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
