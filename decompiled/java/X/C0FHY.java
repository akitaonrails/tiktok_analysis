package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FHY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FHY extends C2217421BqW implements Function1<Integer, Unit> {
    public C0FHY(C0FHS c0fhs) {
        super(1, c0fhs, C0FHS.class, "onPageSelected", "onPageSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C0FHS) this.receiver).onPageSelected(num.intValue());
        return Unit.LIZ;
    }
}
