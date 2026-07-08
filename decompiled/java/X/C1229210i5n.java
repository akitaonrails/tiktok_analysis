package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.external.ExternalCreateGroupProcessor$createGroupAndShowExternalPanel$1", f = "ExternalCreateGroupProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1229210i5n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseSharePackage LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229210i5n(BaseSharePackage baseSharePackage, DialogC1389620mGW dialogC1389620mGW, Context context, InterfaceC1364105Vn<? super C1229210i5n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseSharePackage;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1229210i5n(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SharePackage sharePackage;
        String aid;
        C1C7U.LIZ("ExternalCreateGroupProcessor@9665.createGroupAndShowExternalPanel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShareService shareService = C621180OYa.LIZ;
        BaseSharePackage baseSharePackage = this.LL;
        if (baseSharePackage instanceof SharePackage) {
            sharePackage = (SharePackage) baseSharePackage;
        } else {
            sharePackage = null;
        }
        Aweme awemeLJJIJIL = shareService.LJJIJIL(sharePackage);
        if (awemeLJJIJIL == null || (aid = awemeLJJIJIL.getAid()) == null) {
            aid = "";
        }
        String string = this.LL.extras.getString("open_platform_biz_line");
        if (string == null) {
            string = "ci";
        }
        String string2 = this.LL.extras.getString("open_platform_biz_scene");
        if (string2 == null) {
            string2 = "share_panel";
        }
        String string3 = this.LL.extras.getString("open_platform_source");
        if (string3 == null) {
            string3 = "native";
        }
        IMGroupChatApi.LIZIZ.getClass();
        C1231470i9R c1231470i9R = new C1231470i9R(string, string2, string3);
        C1229390i65 c1229390i65 = new C1229390i65(Collections.singletonList(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()), null, EnumC913760Zt0.EXTERNAL_SHARE_GROUP, null, null, C2097908Jt.LIZJ(new Pair("a:item_id", aid)), null, null, null, 474);
        C1229400i66 c1229400i66 = new C1229400i66("share", "share_post_and_group_chat_panel", C2097908Jt.LIZJ(new Pair("a:item_id", aid)), 8);
        final DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI;
        final Context context = this.LLILLL;
        final BaseSharePackage baseSharePackage2 = this.LL;
        c1231470i9R.LIZ(c1229390i65, c1229400i66, new C1231500i9U() { // from class: X.0i5o
            @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                super.LIZIZ(c0ymw);
                C786410Ut5.LJIIJ(dialogC1389620mGW);
            }

            @Override // X.C1231500i9U, X.InterfaceC863580XuG
            /* JADX INFO: renamed from: LIZJ */
            public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                super.LJ(c0y8t, c0ymw);
                C786410Ut5.LJIIJ(dialogC1389620mGW);
                IMWebSocketBridgeApi.LIZ.getClass();
                IMWebSocketBridgeApi iMWebSocketBridgeApiLIZ = C892310YzV.LIZ();
                if (iMWebSocketBridgeApiLIZ == null || !iMWebSocketBridgeApiLIZ.isConnected()) {
                    C23250099c.LIZLLL(C1229230i5p.LIZIZ, null, null, new C1566006Be(null), 3);
                }
                if (c0y8t != null) {
                    ((IExternalCreateGroupService) C1229250i5r.LIZ.getValue()).LIZLLL(context, c0y8t, baseSharePackage2);
                }
            }
        }, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExternalCreateGroupProcessor@9665.createGroupAndShowExternalPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
