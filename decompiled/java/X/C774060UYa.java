package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774060UYa extends C2217421BqW implements Function2<Boolean, Integer, Unit> {
    public C774060UYa(Object obj) {
        super(2, obj, C0UYG.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        ((C0UYG) this.receiver).LIZIZ(num.intValue(), zBooleanValue);
        return Unit.LIZ;
    }
}
