package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0FDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C386450FDf extends C2217421BqW implements Function2<Boolean, Boolean, Unit> {
    public C386450FDf(C0FDW c0fdw) {
        super(2, c0fdw, C0FDW.class, "onApplyToAllChanged", "onApplyToAllChanged(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        ((C0FDW) this.receiver).v5(bool.booleanValue(), bool2.booleanValue());
        return Unit.LIZ;
    }
}
