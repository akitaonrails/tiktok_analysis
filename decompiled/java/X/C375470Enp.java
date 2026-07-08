package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Enp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C375470Enp extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C375470Enp(C375480Enq c375480Enq) {
        super(2, c375480Enq, C375480Enq.class, "updateCanvasSize", "updateCanvasSize(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        ((C375480Enq) this.receiver).k5(num.intValue(), num2.intValue());
        return Unit.LIZ;
    }
}
