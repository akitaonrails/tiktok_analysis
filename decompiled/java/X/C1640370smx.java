package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0smx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1640370smx extends C2217421BqW implements Function0<Unit> {
    public C1640370smx(Object obj) {
        super(0, obj, AbstractC1640400sn0.class, "onLoadMoreTriggered", "onLoadMoreTriggered()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractC1640400sn0 abstractC1640400sn0 = (AbstractC1640400sn0) this.receiver;
        InterfaceC1640330smt<DATA> interfaceC1640330smt = abstractC1640400sn0.LIZJ;
        if (interfaceC1640330smt != 0) {
            interfaceC1640330smt.se2();
        }
        abstractC1640400sn0.LJJIFFI.onNext(Long.valueOf(System.currentTimeMillis()));
        return Unit.LIZ;
    }
}
