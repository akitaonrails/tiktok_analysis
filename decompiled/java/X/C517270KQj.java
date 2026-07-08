package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517270KQj extends AbstractC517300KQm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC517280KQk interfaceC517280KQk = (InterfaceC517280KQk) xBaseParamModel;
        User user = (User) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, interfaceC517280KQk.getUser(), User.class);
        int pushStatus = (int) user.getFollowInfo().getPushStatus();
        C0IL8 c0il8 = new C0IL8();
        c0il8.LIZIZ = String.valueOf(user.getId());
        c0il8.LIZJ = "jsb";
        c0il8.LIZLLL = "live_cell";
        for (Map.Entry<String, Object> entry : interfaceC517280KQk.getLogInfo().entrySet()) {
            ((HashMap) c0il8.LJ).put(entry.getKey(), entry.getValue().toString());
        }
        if (((int) user.getFollowInfo().getFollowStatus()) == 3) {
            user.getFollowInfo().setFollowStatus(0L);
        }
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        int followStatus = (int) user.getFollowInfo().getFollowStatus();
        String strLIZLLL = C0KVU.LIZLLL(user);
        String strValueOf = String.valueOf(user.getId());
        String strLIZ = C0KVU.LIZ(user);
        String secUid = user.getSecUid();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        iHostAction.showNotificationTipDialog(followStatus, strLIZLLL, strValueOf, strLIZ, secUid, pushStatus, view, "", c0il8, true, new InterfaceC517340KQq() { // from class: X.0KQl
            @Override // X.InterfaceC517340KQq
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC517340KQq
            public final void LIZ(int i) {
                this.LIZ.getClass();
                InterfaceC517310KQn interfaceC517310KQn = (InterfaceC517310KQn) C1909107dp.LIZJ(InterfaceC517310KQn.class, null);
                interfaceC517310KQn.setNotificationStatus(Integer.valueOf(i));
                completionBlock.onSuccess(interfaceC517310KQn, "");
            }
        });
    }
}
