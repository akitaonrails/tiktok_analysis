package X;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389210tO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19389110tN LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19389210tO(C19389110tN c19389110tN, int i, int i2) {
        super(0);
        this.LL = c19389110tN;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View view;
        C19389110tN c19389110tN = this.LL;
        if (!c19389110tN.LIZLLL && (view = c19389110tN.LIZ) != null) {
            view.getLocationOnScreen(new int[2]);
            float fLIZLLL = C13LZ.LIZLLL(this.LLILLJJLI - r5[0], 0.0f, view.getWidth());
            float fLIZLLL2 = C13LZ.LIZLLL(this.LLILLL - r5[1], 0.0f, view.getHeight());
            Magnifier magnifier = this.LL.LIZJ;
            if (magnifier != null) {
                magnifier.show(fLIZLLL, fLIZLLL2);
            }
        }
        return Unit.LIZ;
    }
}
