package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C871650YHj extends C2217421BqW implements Function1<Integer, Unit> {
    public C871650YHj(Object obj) {
        super(1, obj, C0YGO.class, "removeFromPending", "removeFromPending$core_release(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C0YGO) this.receiver).LJFF(num.intValue());
        return Unit.LIZ;
    }
}
