package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0E1K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0E1K extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C0E1K(Object obj) {
        super(2, obj, C0E1I.class, "swapItem", "swapItem(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        ((C0E1I) this.receiver).y7(num.intValue(), num2.intValue());
        return Unit.LIZ;
    }
}
