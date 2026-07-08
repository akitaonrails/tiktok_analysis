package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C385570F9v extends C2217421BqW implements Function1<Integer, Unit> {
    public C385570F9v(C385410F9f c385410F9f) {
        super(1, c385410F9f, C385410F9f.class, "applyColor", "applyColor(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C385410F9f) this.receiver).K4(num.intValue());
        return Unit.LIZ;
    }
}
