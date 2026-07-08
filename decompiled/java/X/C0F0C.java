package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F0C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F0C extends C2217421BqW implements Function1<Integer, Unit> {
    public C0F0C(C382850Ezj c382850Ezj) {
        super(1, c382850Ezj, C382850Ezj.class, "updateDuration", "updateDuration(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C382850Ezj) this.receiver).C5(num.intValue());
        return Unit.LIZ;
    }
}
