package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1417740mzs extends C2217421BqW implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
    public C1417740mzs(C1417330mzD c1417330mzD) {
        super(1, c1417330mzD, C1417330mzD.class, "checkBottomLayout", "checkBottomLayout(Lkotlin/Pair;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        ((C1417330mzD) this.receiver).D5(pair);
        return Unit.LIZ;
    }
}
