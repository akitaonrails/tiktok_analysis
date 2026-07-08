package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816360xMo extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1816340xMm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816360xMo(C1816340xMm c1816340xMm) {
        super(1);
        this.LL = c1816340xMm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LIZJ = bool.booleanValue();
        return Unit.LIZ;
    }
}
