package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;

/* JADX INFO: renamed from: X.0z07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879170z07 extends AbstractC1879140z04 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1879150z05 interfaceC1879150z05 = (InterfaceC1879150z05) xBaseParamModel;
        if (!TextUtils.isEmpty(interfaceC1879150z05.getItemID())) {
            PromoteReplaceMusicRequest promoteReplaceMusicRequest = new PromoteReplaceMusicRequest();
            promoteReplaceMusicRequest.setItemID(interfaceC1879150z05.getItemID());
            promoteReplaceMusicRequest.setOriginalMusicID("");
            promoteReplaceMusicRequest.setRetryScene(EnumC1879180z08.CLEAR.getId());
            ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
            PromoteReplaceMusicRequest promoteReplaceMusicRequestLIZLLL = C1911640zqU.LIZLLL(interfaceC1879150z05.getItemID());
            if (promoteReplaceMusicRequestLIZLLL != null) {
                promoteReplaceMusicRequestLIZLLL.setRetryScene(EnumC1879180z08.RETRY.getId());
                promoteReplaceMusicRequest = promoteReplaceMusicRequestLIZLLL;
            }
            if (promoteReplaceMusicRequestLIZLLL == null) {
                C2382909Vj.LIZ(completionBlock, 0, "has no data for retry with this itemID", null, 4);
                promoteReplaceMusicRequestLIZLLL = promoteReplaceMusicRequest;
            } else {
                promoteReplaceMusicRequestLIZLLL.setRetryScene(EnumC1879180z08.RETRY.getId());
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1879130z03.class, null);
                InterfaceC1879130z03 interfaceC1879130z03 = (InterfaceC1879130z03) xBaseModelLIZJ;
                interfaceC1879130z03.setCode(1);
                interfaceC1879130z03.setMsg("has no data for retry with this itemID");
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
            ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).retryInPromoteScene(promoteReplaceMusicRequestLIZLLL);
        }
    }
}
