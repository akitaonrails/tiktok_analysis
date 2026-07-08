package X;

import Y.ACListenerS133S0200000_31;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14wY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20428014wY extends AbstractC960470b6L<C20427614wU> {
    public final Function1<C20427614wU, Unit> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C20428014wY(View view, Function1<? super C20427614wU, Unit> function1) {
        super(view);
        this.LL = function1;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C20427614wU c20427614wU = (C20427614wU) obj;
        View viewFindViewById = this.itemView.findViewById(R.id.kb6);
        viewFindViewById.getLayoutParams().width = C971140bNY.LIZIZ(this.itemView);
        viewFindViewById.getLayoutParams().height = C971140bNY.LIZ(this.itemView);
        C1841350y17 c1841350y17 = (C1841350y17) this.itemView.findViewById(R.id.sp_);
        c1841350y17.setChecked(c20427614wU.LIZIZ);
        C786410Ut5.B7(c1841350y17, new C16HE(this, 0));
        C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(c20427614wU.LIZ));
        c1324610kZfLJIIJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIJ.LJJI(viewFindViewById);
        C786410Ut5.I7(new ACListenerS133S0200000_31(this, c20427614wU, 2), this.itemView);
    }
}
