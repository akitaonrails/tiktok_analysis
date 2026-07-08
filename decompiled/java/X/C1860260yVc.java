package X;

import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860260yVc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1860270yVd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860260yVc(C1860270yVd c1860270yVd) {
        super(0);
        this.LL = c1860270yVd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Magnifier magnifier = this.LL.LIZJ;
        if (magnifier != null) {
            magnifier.dismiss();
        }
        return Unit.LIZ;
    }
}
