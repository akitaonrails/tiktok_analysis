package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS462S0200000_27;

/* JADX INFO: renamed from: X.0yFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850480yFq extends AbstractC1850470yFp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1850500yFs interfaceC1850500yFs = (InterfaceC1850500yFs) xBaseParamModel;
        if (((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).checkStickerIntercept()) {
            C2382909Vj.LIZ(completionBlock, 0, "have no sticker permission", null, 4);
        } else if (C497700JfU.LIZ.LIZ() == EnumC768840UDy.CO_HOST) {
            C473410IhP.LIZIZ(new Runnable() { // from class: X.00kX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SetLiveStickerMethod@4d93.handle$1");
                    try {
                        C766270U4b.LIZLLL(2131844170);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SetLiveStickerMethod@4d93.handle$1");
                }
            });
            C2382909Vj.LIZ(completionBlock, 0, "can not set sticker when cohost", null, 4);
        } else {
            ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).ff2(interfaceC1850500yFs.getResourceId(), interfaceC1850500yFs.getContent(), interfaceC1850500yFs.getScene(), new AwS462S0200000_27(completionBlock, (CompletionBlock<InterfaceC1850490yFr>) this, (C1850480yFq) 8));
        }
    }
}
