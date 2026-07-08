package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1Bx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2221461Bx2 extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C2221461Bx2(InterfaceC2221571BxD interfaceC2221571BxD) {
        super(2, interfaceC2221571BxD, InterfaceC2221571BxD.class, "tryDisplayFriendsPublishTooltip", "tryDisplayFriendsPublishTooltip(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        ((InterfaceC2221571BxD) this.receiver).gL(num.intValue(), num2.intValue());
        return Unit.LIZ;
    }
}
