package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.Map;

/* JADX INFO: renamed from: X.0lbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364300lbg {
    public final Context LIZ;
    public final SharePanelViewModel LIZIZ;
    public final InterfaceC1364320lbi LIZJ;
    public IMContact LIZLLL;

    public final void LIZ() {
        Bundle bundle;
        SharePackage sharePackage = this.LIZIZ.LL;
        String string = (sharePackage == null || (bundle = sharePackage.extras) == null) ? null : bundle.getString("enter_method");
        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(sharePackage);
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        EnterChatParams enterChatParams = new EnterChatParams(this.LIZ, this.LIZLLL);
        enterChatParams.setEnterFromForMob(this.LIZIZ.LJIIL());
        enterChatParams.setEnterMethodForMob(string);
        enterChatParams.setEnterFrom(6);
        enterChatParams.setAuthorId(C735370Ssx.LIZLLL(awemeLJJIJIL));
        enterChatParams.setGroupId(C735370Ssx.LIZJ(awemeLJJIJIL));
        enterChatParams.setQuickChat(true);
        Map<String, String> extraMobParams = enterChatParams.getExtraMobParams();
        if (string == null) {
            string = "share_panel";
        }
        extraMobParams.put("panel_source", string);
        iIMServiceLIZ.getImChatService().LJIILLIIL(enterChatParams, null);
    }

    public final void LIZIZ() {
        String string;
        Bundle bundle;
        SharePackage sharePackage = this.LIZIZ.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("event_type")) == null) {
            string = "";
        }
        ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJJJJJ(this.LIZ, string, EnumC1373490lqV.LONG_PRESS);
    }

    public C1364300lbg(Context context, SharePanelViewModel sharePanelViewModel, InterfaceC1364320lbi interfaceC1364320lbi) {
        this.LIZ = context;
        this.LIZIZ = sharePanelViewModel;
        this.LIZJ = interfaceC1364320lbi;
    }
}
