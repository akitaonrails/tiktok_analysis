package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Et9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C378770Et9 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C378770Et9(C378730Et5 c378730Et5) {
        super(1, c378730Et5, C378730Et5.class, "onPuncStateChanged", "onPuncStateChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C378730Et5) this.receiver).d5(bool.booleanValue());
        return Unit.LIZ;
    }
}
