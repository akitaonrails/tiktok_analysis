package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1907290zjT extends C2217421BqW implements Function0<Unit> {
    public C1907290zjT(Object obj) {
        super(0, obj, C1907120zjC.class, "onNudgeClick", "onNudgeClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractViewOnClickListenerC1907000zj0 abstractViewOnClickListenerC1907000zj0 = (AbstractViewOnClickListenerC1907000zj0) this.receiver;
        InterfaceC1907020zj2 mBridge = abstractViewOnClickListenerC1907000zj0.getMBridge();
        if (mBridge != null) {
            mBridge.q(null);
        }
        InterfaceC1907020zj2 mBridge2 = abstractViewOnClickListenerC1907000zj0.getMBridge();
        if (mBridge2 != null) {
            mBridge2.LLD(EnumC1154130g8h.OTHERS);
        }
        return Unit.LIZ;
    }
}
