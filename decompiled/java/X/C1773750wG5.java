package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0wG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1773750wG5 extends C2217421BqW implements Function2<Integer, String, Unit> {
    public C1773750wG5(C1773130wF5 c1773130wF5) {
        super(2, c1773130wF5, C1773130wF5.class, "loadMoreWhenBind", "loadMoreWhenBind(ILjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        ((C1773130wF5) this.receiver).P5(num.intValue(), str);
        return Unit.LIZ;
    }
}
