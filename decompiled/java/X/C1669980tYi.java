package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669980tYi extends C09AY implements Function1<C21569819bE, Unit> {
    public final /* synthetic */ C941240abK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669980tYi(C941240abK c941240abK) {
        super(1);
        this.LL = c941240abK;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C21569819bE c21569819bE) {
        C21569819bE c21569819bE2 = c21569819bE;
        if (this.LL.LJFF) {
            int visibility = c21569819bE2.getVisibility();
            c21569819bE2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21569819bE2);
            c21569819bE2.LIZIZ();
            c21569819bE2.LJFF();
        } else {
            int visibility2 = c21569819bE2.getVisibility();
            c21569819bE2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c21569819bE2);
            c21569819bE2.LIZIZ();
        }
        return Unit.LIZ;
    }
}
