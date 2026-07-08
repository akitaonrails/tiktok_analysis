package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116810fAV extends AbstractC1116830fAX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long j;
        long id;
        try {
            j = CastLongProtector.parseLong(((InterfaceC1116820fAW) xBaseParamModel).getTargetMessageId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = -1;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        if (((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).gh2(id, j)) {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1116840fAY.class, null), "");
        } else {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
        }
    }
}
