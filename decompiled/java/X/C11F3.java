package X;

import Y.ACListenerS163S0100000_29;
import Y.AObjectS403S0100000_29;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS238S0300000_29;

/* JADX INFO: renamed from: X.11F3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11F3 extends RecyclerView.ViewHolder {
    public final int LL;
    public final int[] LLILLJJLI;
    public final SmartImageView LLILLL;
    public final int LLILZ;
    public Banner LLILZIL;
    public int LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;

    public C11F3(View view, int i, int i2, long j, long j2) {
        super(view);
        int[] iArr = new int[2];
        this.LLILLJJLI = iArr;
        this.LL = i;
        this.LLILZ = i2;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
        C11F4 c11f4 = new C11F4(view);
        AObjectS403S0100000_29 aObjectS403S0100000_29 = new AObjectS403S0100000_29(this, 6);
        AObjectS403S0100000_29 aObjectS403S0100000_292 = new AObjectS403S0100000_29(this, 7);
        View view2 = c11f4.LIZ;
        if (view2 != null) {
            C2211631BhB.LJ(view2, new AwS238S0300000_29(aObjectS403S0100000_29, aObjectS403S0100000_292, c11f4, 0));
        }
        this.LLILLL = (SmartImageView) view.findViewById(R.id.u3q);
        if (C12VA.LIZ().LJIIJ.invoke().booleanValue()) {
            SmartImageView smartImageView = this.LLILLL;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C341940Daq.LIZ(10);
            smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        }
        View viewFindViewById = view.findViewById(R.id.u3q);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 165), viewFindViewById);
        }
        int iLJIIJ = C12ES.LJIIJ(view.getContext()) - ((int) (C12ES.LIZJ(16.0f, view.getContext()) * 2.0f));
        iArr[0] = iLJIIJ;
        iArr[1] = (int) (iLJIIJ * 0.26239067f);
    }
}
