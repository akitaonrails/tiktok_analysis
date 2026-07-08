package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177150gjp {
    public final Context LIZ;
    public final InterfaceC1176890gjP LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final ImageView LJ;
    public final ImageView LJFF;
    public final ImageView LJI;

    public C1177150gjp(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        this.LIZIZ = C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e38, new FrameLayout(context), false);
        this.LIZJ = viewTd;
        this.LIZLLL = (ImageView) viewTd.findViewById(R.id.r0n);
        this.LJ = (ImageView) viewTd.findViewById(R.id.r4t);
        this.LJFF = (ImageView) viewTd.findViewById(R.id.r4v);
        this.LJI = (ImageView) viewTd.findViewById(R.id.r4p);
    }

    public final void LIZ(boolean z, AbstractC443520HaI abstractC443520HaI, Function1 function1) {
        if (z) {
            C786410Ut5.LJZI(0, this.LJFF);
            C786410Ut5.LJZI(0, this.LJI);
            ImageView imageView = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i = C1177160gjq.LIZ;
            layoutParams.height = i;
            layoutParams.width = i;
            C786410Ut5.c6(imageView, layoutParams);
            ImageView imageView2 = this.LJI;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            int i2 = C1177160gjq.LIZJ;
            layoutParams2.height = i2;
            layoutParams2.width = i2;
            C786410Ut5.c6(imageView2, layoutParams2);
            ImageView imageView3 = this.LJ;
            ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            int i3 = i2 + C1177160gjq.LJ;
            layoutParams3.height = i3;
            layoutParams3.width = i3;
            C786410Ut5.c6(imageView3, layoutParams3);
        } else {
            C786410Ut5.LJZI(8, this.LJFF);
            C786410Ut5.LJZI(0, this.LJI);
            ImageView imageView4 = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
            int i4 = C1177160gjq.LIZIZ;
            layoutParams4.height = i4;
            layoutParams4.width = i4;
            C786410Ut5.c6(imageView4, layoutParams4);
            ImageView imageView5 = this.LJI;
            ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
            int i5 = C1177160gjq.LIZLLL;
            layoutParams5.height = i5;
            layoutParams5.width = i5;
            C786410Ut5.c6(imageView5, layoutParams5);
            ImageView imageView6 = this.LJ;
            ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
            int i6 = i5 + C1177160gjq.LJ;
            layoutParams6.height = i6;
            layoutParams6.width = i6;
            C786410Ut5.c6(imageView6, layoutParams6);
        }
        this.LIZLLL.setImageDrawable(abstractC443520HaI);
        function1.invoke(this.LIZIZ.LIZ(this.LIZJ));
    }
}
