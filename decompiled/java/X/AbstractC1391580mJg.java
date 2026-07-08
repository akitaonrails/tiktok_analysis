package X;

import X.AbstractC1391580mJg;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1391580mJg<T extends AbstractC1391580mJg<T>> {
    public final Context LL;
    public final C1391600mJi LLILLJJLI = new C1391600mJi();
    public C0P0T LLILLL;

    public C0P0T LIZIZ() {
        C1391600mJi c1391600mJi = this.LLILLJJLI;
        C0P0T c1391630mJl = c1391600mJi.LIZJ != null ? new C1391630mJl(this.LL, c1391600mJi) : new TuxTooltipPopupWindow(this.LL, this.LLILLJJLI);
        this.LLILLL = c1391630mJl;
        return c1391630mJl;
    }

    public final void LIZLLL() {
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ != null) {
            this.LLILLJJLI.LIZJ = (ViewGroup) activityLIZ.getWindow().getDecorView();
        }
    }

    public AbstractC1391580mJg(Context context) {
        this.LL = context;
    }

    public final void LIZJ(final Function1 function1) {
        this.LLILLJJLI.LJJI = new InterfaceC1340660kzY() { // from class: X.0kyl
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                function1.invoke(abstractC1391670mJp);
            }
        };
    }

    public final void LJ(final Function0 function0) {
        this.LLILLJJLI.LJJIFFI = new InterfaceC1391650mJn() { // from class: X.0mJh
            @Override // X.InterfaceC1391650mJn
            public final void onShow() {
                function0.invoke();
            }
        };
    }

    public final void LJI(int i) {
        this.LLILLJJLI.LIZ = Integer.valueOf(i);
    }

    public final void LJII(int i) {
        this.LLILLJJLI.LIZ = C1308910kAL.LIZJ(i, this.LL);
    }

    public final void LIZ(int i, int i2) {
        C1391600mJi c1391600mJi = this.LLILLJJLI;
        c1391600mJi.LJIILJJIL = i;
        c1391600mJi.LJIILL = i2;
    }

    public final void LJIIIIZZ(int i, int i2) {
        C1391600mJi c1391600mJi = this.LLILLJJLI;
        c1391600mJi.LJ = i;
        c1391600mJi.LJFF = i2;
    }

    public final void LJIIIZ(boolean z, View.OnClickListener onClickListener) {
        C1391600mJi c1391600mJi = this.LLILLJJLI;
        c1391600mJi.LJJ = z;
        c1391600mJi.LJIL = onClickListener;
    }
}
