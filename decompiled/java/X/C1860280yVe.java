package X;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860280yVe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1860270yVd LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860280yVe(C1860270yVd c1860270yVd, int i, int i2) {
        super(0);
        this.LL = c1860270yVd;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1860270yVd c1860270yVd = this.LL;
        View view = c1860270yVd.LIZ;
        if (view != null) {
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL;
            view.getLocationOnScreen(new int[2]);
            Magnifier magnifier = c1860270yVd.LIZJ;
            if (magnifier != null) {
                magnifier.show(i - r4[0], i2 - r4[1]);
            }
        }
        return Unit.LIZ;
    }
}
