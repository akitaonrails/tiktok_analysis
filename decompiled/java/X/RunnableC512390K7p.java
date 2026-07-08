package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeEntryShareUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC512390K7p implements Runnable {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;
    public final /* synthetic */ C0K8A LLILLJJLI;

    public RunnableC512390K7p(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage, C0K8A c0k8a) {
        this.LL = subPrivilegeDetailFullPage;
        this.LLILLJJLI = c0k8a;
    }

    public final void LIZ() {
        String strLIZLLL;
        String strLIZIZ;
        User user;
        GetSubPrivilegeDetailResponse.Data data = this.LL.LLJJJJ;
        if (data == null || (user = data.anchorDetail) == null || (strLIZLLL = C0KVU.LIZ(user)) == null) {
            strLIZLLL = C0KVU.LIZLLL(UserService.getInstance().user().LJIJJLI());
        }
        C0K8F c0k8f = C0K8F.LIZ;
        final C19EG activity = this.LL.getActivity();
        C0K8A c0k8a = this.LLILLJJLI;
        C512420K7s c512420K7s = new C512420K7s(this.LL);
        final C512410K7r c512410K7r = new C512410K7r(this.LL);
        c0k8f.getClass();
        if (activity != null) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("snssdk");
                sbLIZ.append(iHostAppContext.appId());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            C1106200etO c1106200etO = new C1106200etO();
            String str = c0k8a.LIZ;
            LiveSubscribeEntryShareUrl liveSubscribeEntryShareUrl = LiveSubscribeEntryShareUrl.INSTANCE;
            C495520Jby c495520Jby = new C495520Jby(liveSubscribeEntryShareUrl.getValue());
            c512420K7s.invoke(c495520Jby);
            c495520Jby.LIZJ("show_entrance", "host_share_notification");
            String string = UriProtector.parse(c495520Jby.LIZLLL()).toString();
            C495520Jby c495520Jby2 = new C495520Jby(liveSubscribeEntryShareUrl.getValue());
            c512420K7s.invoke(c495520Jby2);
            c495520Jby2.LIZJ("show_entrance", "share_link");
            c495520Jby2.LIZJ("cover_url", c0k8a.LIZIZ);
            c495520Jby2.LIZJ("lang", C2273311DyT.LIZ(iHostAppContext != null ? iHostAppContext.currentLocale() : null));
            String string2 = UriProtector.parse(c495520Jby2.LIZLLL()).toString();
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("://");
                string2 = u.LJJIFFI(string2, "sslocal://", C2188811AlT.LIZIZ(sbLIZ2), false);
            }
            C518420KUu.LIZ(c1106200etO, str, string, string2, C497740JfY.LJIJJ(2131844198, strLIZLLL), "www.tiktok.com", C497740JfY.LJIJI(2131844193), C497740JfY.LJIJI(2131844192), C497740JfY.LJIJI(2131844194), "dm_linkShare_liveSub_title", Collections.singletonList(strLIZLLL), "dm_linkShare_liveSub_preview_sender", "dm_push_preview_shared_a_link", "im_quote_link", C497740JfY.LJIJJ(2131844200, strLIZLLL), null, 699392);
            ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).shareSubscribeLink(activity, new C1106210etP(c1106200etO), new InterfaceC1372610lp5() { // from class: X.0K7q
                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LIZIZ(HashMap map) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LIZLLL(HashMap map) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJ(HashMap map) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJFF(Dialog dialog) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJI(Dialog dialog) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJII() {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void onDismiss() {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void onShow(int i) {
                }

                @Override // X.InterfaceC1372610lp5
                public final void LIZ(Throwable th) {
                    C20441214yg.LIZ("share fail");
                }

                @Override // X.InterfaceC1372610lp5
                public final void LIZJ(String str2, String str3, Bundle bundle) {
                    String string3;
                    C19EG c19eg;
                    if (Intrinsics.LJFF("chat_merge", str2) && Intrinsics.LJFF("link", str3) && (c19eg = activity) != null) {
                        C766270U4b.LIZJ(c19eg, C497740JfY.LJIJI(2131844199));
                    }
                    Function2<String, String, Unit> function2 = c512410K7r;
                    if (bundle != null) {
                        string3 = bundle.getString("shareIdList", "");
                    } else {
                        string3 = null;
                    }
                    function2.invoke(str2, string3);
                    C20441214yg.LIZ("share success");
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SubPrivilegeDetailFullPage@2c1.onSubLinkShare$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@2c1.onSubLinkShare$1");
    }
}
