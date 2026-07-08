package X;

import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1074550e4L extends AbstractC1906720ziY {
    public final Class<? extends PowerCell<?>>[] LLIZLLLIL;
    public List<? extends InterfaceC1891350zJl> LLJ;
    public View LLJI;
    public View LLJIJIL;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        Class<? extends PowerCell<?>>[] clsArr = this.LLIZLLLIL;
        LJIILIIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        List<? extends InterfaceC1891350zJl> list = this.LLJ;
        if (list != null) {
            this.LLILZLL.LJIILL(list, null);
            this.LLJ = null;
        }
        View view = this.LLJI;
        if (view != null) {
            LJII(view);
            this.LLJI = null;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            LIZ(view2);
            this.LLJIJIL = null;
        }
    }

    public C1074550e4L(Class<? extends PowerCell<?>>... clsArr) {
        this.LLIZLLLIL = clsArr;
    }

    public final void LJJ(C03DU c03du) {
        if (c03du != null && Intrinsics.LJFF(c03du.getTag(C386801es.DEFAULT), Boolean.TRUE)) {
            return;
        }
        if (this.LLILLL) {
            LJII(c03du);
        } else {
            this.LLJI = c03du;
        }
        if (c03du != null) {
            c03du.setTag(C386801es.DEFAULT, Boolean.TRUE);
        }
    }
}
