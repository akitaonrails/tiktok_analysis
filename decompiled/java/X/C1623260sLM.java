package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1623260sLM extends C2217421BqW implements Function1<C1627370sRz, Unit> {
    public C1623260sLM(AbstractC1623220sLI abstractC1623220sLI) {
        super(1, abstractC1623220sLI, AbstractC1623220sLI.class, "beforeEffectSDKApplySticker", "beforeEffectSDKApplySticker(Lcom/ss/android/ugc/aweme/sticker/presenter/handler/session/SelectedStickerHandleSession;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1627370sRz c1627370sRz) {
        AbstractC1622390sJx abstractC1622390sJx;
        C1627370sRz c1627370sRz2 = c1627370sRz;
        AbstractC1623220sLI abstractC1623220sLI = (AbstractC1623220sLI) this.receiver;
        for (InterfaceC1622080sJS interfaceC1622080sJS : new C13EO(abstractC1623220sLI.LIZJ().LL)) {
            if ((interfaceC1622080sJS instanceof AbstractC1622390sJx) && (abstractC1622390sJx = (AbstractC1622390sJx) interfaceC1622080sJS) != null) {
                abstractC1622390sJx.LJIL(c1627370sRz2);
            }
        }
        for (InterfaceC1622080sJS interfaceC1622080sJS2 : abstractC1623220sLI.LLILZ) {
            if (interfaceC1622080sJS2 instanceof AbstractC1622390sJx) {
                ((AbstractC1622390sJx) interfaceC1622080sJS2).LJIL(c1627370sRz2);
            }
        }
        return Unit.LIZ;
    }
}
