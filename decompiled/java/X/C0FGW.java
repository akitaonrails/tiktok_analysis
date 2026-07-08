package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FGW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FGW extends C2217421BqW implements Function1<Integer, Unit> {
    public C0FGW(C0FGO c0fgo) {
        super(1, c0fgo, C0FGO.class, "onPageSelected", "onPageSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C0FGO) this.receiver).onPageSelected(num.intValue());
        return Unit.LIZ;
    }
}
