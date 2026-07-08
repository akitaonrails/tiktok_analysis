package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936090aT1 extends AbstractC960470b6L<C936100aT2> {
    public final Function1<C936100aT2, Unit> LL;
    public final Function1<C936100aT2, Unit> LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final View LLILZ;
    public final C20515915Pp LLILZIL;
    public final LiveIconView LLILZLL;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        int i3;
        float f;
        C936100aT2 c936100aT2 = (C936100aT2) obj;
        Object tag = this.itemView.getTag();
        this.itemView.setTag(c936100aT2);
        View view = this.LLILZ;
        int i4 = 0;
        if (c936100aT2.LJI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        boolean z = c936100aT2.LIZLLL;
        int i5 = c936100aT2.LJ;
        C20515915Pp c20515915Pp = this.LLILZIL;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        int visibility = c20515915Pp.getVisibility();
        c20515915Pp.setVisibility(i3);
        C1602160rnK.LIZIZ(visibility, i3, c20515915Pp);
        setProgress(i5);
        LiveIconView liveIconView = this.LLILZLL;
        if (!c936100aT2.LJFF) {
            i4 = 8;
        }
        C786410Ut5.LLJJIJIL(liveIconView, i4);
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c936100aT2.LJII) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        C786410Ut5.h5(c1324720kZq, f);
        if (!Intrinsics.LJFF(tag, c936100aT2)) {
            C1819620xS4.LIZ().LJIIIZ(c936100aT2.LIZIZ).LJJI(this.LLILLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C936090aT1(Context context, ViewGroup viewGroup, Function1<? super C936100aT2, Unit> function1, Function1<? super C936100aT2, Unit> function12) {
        super(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.he2, viewGroup, false));
        this.LL = function1;
        this.LLILLJJLI = function12;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 189), this.itemView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke((int) C497740JfY.LIZIZ(2.0f), C20736316Cj.LIZIZ(R.attr.c5w, context));
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(12.0f));
        this.LLILLL = (C1324720kZq) this.itemView.findViewById(R.id.l9h);
        View viewFindViewById = this.itemView.findViewById(R.id.bk6);
        viewFindViewById.setBackground(gradientDrawable);
        this.LLILZ = viewFindViewById;
        this.itemView.findViewById(R.id.l_0);
        C20515915Pp c20515915Pp = (C20515915Pp) this.itemView.findViewById(R.id.bjk);
        c20515915Pp.setStrokeWidth((int) C497740JfY.LIZIZ(4.0f));
        c20515915Pp.setMaxProgress(100);
        this.LLILZIL = c20515915Pp;
        LiveIconView liveIconView = (LiveIconView) this.itemView.findViewById(R.id.l9r);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(C20736316Cj.LIZIZ(R.attr.ezy, context));
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, (int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f), 0.0f, 0.0f, (int) C497740JfY.LIZIZ(8.0f), (int) C497740JfY.LIZIZ(8.0f)});
        liveIconView.setBackground(gradientDrawable2);
        C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 190));
        this.LLILZLL = liveIconView;
    }
}
