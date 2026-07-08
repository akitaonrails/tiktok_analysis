package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0E2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C358250E2t extends C2217421BqW implements Function1<Integer, Unit> {
    public C358250E2t(C358200E2o c358200E2o) {
        super(1, c358200E2o, C358200E2o.class, "changeProgress", "changeProgress(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C358200E2o) this.receiver).E5(num.intValue());
        return Unit.LIZ;
    }
}
