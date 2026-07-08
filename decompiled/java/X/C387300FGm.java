package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C387300FGm extends C2217421BqW implements Function1<Integer, Unit> {
    public C387300FGm(C387270FGj c387270FGj) {
        super(1, c387270FGj, C387270FGj.class, "onPageSelected", "onPageSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C387270FGj) this.receiver).onPageSelected(num.intValue());
        return Unit.LIZ;
    }
}
