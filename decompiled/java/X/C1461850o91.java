package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0o91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1461850o91 extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C1461850o91(C1461800o8w c1461800o8w) {
        super(2, c1461800o8w, C1461800o8w.class, "onSwapDone", "onSwapDone(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        ((C1461800o8w) this.receiver).d6(num.intValue(), num2.intValue());
        return Unit.LIZ;
    }
}
