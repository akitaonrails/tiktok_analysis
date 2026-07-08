package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FNP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FNP extends C2217421BqW implements Function1<Integer, Unit> {
    public C0FNP(C1409560mmg c1409560mmg) {
        super(1, c1409560mmg, C1409560mmg.class, "onItemClick", "onItemClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C1409560mmg) this.receiver).M5(num.intValue());
        return Unit.LIZ;
    }
}
