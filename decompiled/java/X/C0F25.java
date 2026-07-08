package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F25, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F25 extends C2217421BqW implements Function1<Integer, Unit> {
    public C0F25(C383420F1o c383420F1o) {
        super(1, c383420F1o, C383420F1o.class, "onColorClick", "onColorClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C383420F1o) this.receiver).O4(num.intValue());
        return Unit.LIZ;
    }
}
