package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1647920sz8 extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C1647920sz8(C1647860sz2 c1647860sz2) {
        super(2, c1647860sz2, C1647860sz2.class, "onColorChanged", "onColorChanged(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        ((C1647860sz2) this.receiver).N5(num.intValue(), num2.intValue());
        return Unit.LIZ;
    }
}
