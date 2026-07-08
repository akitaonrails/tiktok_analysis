package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ar4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C951000ar4 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C951000ar4(Object obj) {
        super(1, obj, C951010ar5.class, "handleStateChange", "handleStateChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C951010ar5) this.receiver).L5(bool.booleanValue());
        return Unit.LIZ;
    }
}
