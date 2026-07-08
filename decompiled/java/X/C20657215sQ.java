package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15sQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20657215sQ extends C2217421BqW implements Function2<EnumC20657015sO, EnumC20657015sO, Unit> {
    public C20657215sQ(Object obj) {
        super(2, obj, AbstractC20656215sG.class, "onPopupStateChanged", "onPopupStateChanged(Lcom/bytedance/poplayer/PopupState;Lcom/bytedance/poplayer/PopupState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        ((AbstractC20656215sG) this.receiver).onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
        return Unit.LIZ;
    }
}
