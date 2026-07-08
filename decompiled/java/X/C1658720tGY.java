package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1658720tGY extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1658720tGY(Object obj) {
        super(1, obj, C1658700tGW.class, "onPanelShowStateChange", "onPanelShowStateChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C1658700tGW) this.receiver).v3(bool.booleanValue());
        return Unit.LIZ;
    }
}
