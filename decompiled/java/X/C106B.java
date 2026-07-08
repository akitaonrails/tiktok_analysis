package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.106B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C106B extends C2217421BqW implements Function1<Boolean, Unit> {
    public C106B(C191905105v c191905105v) {
        super(1, c191905105v, C191905105v.class, "updateEnable", "updateEnable(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C191905105v) this.receiver).LJIJJ(bool.booleanValue());
        return Unit.LIZ;
    }
}
