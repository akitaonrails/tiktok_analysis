package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0JJC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJC extends C09AY implements Function0<List<? extends C0JKB>> {
    public C0JJC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0JKB> invoke() {
        return C1697810uHb.LJIIJJI(new C0JKB() { // from class: X.0JJK
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/allinone");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                User userLJIJJLI = null;
                if (interfaceC500940JkiUser != null) {
                    userLJIJJLI = interfaceC500940JkiUser.LJIJJLI();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dm_schema");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "form_schema");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null || Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, CardStruct.IStatusCode.DEFAULT) || !(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4))) && (userLJIJJLI == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = userLJIJJLI.getSecUid()) == null)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                }
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("is_anchor", false);
                boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("force_new_style", false);
                if (C520010KaN.LJIL(context, false) != null) {
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJFF(new C521380Kca(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, booleanQueryParameter, str), C2097608Jq.LJIIIIZZ(new Pair("dm_schema", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), new Pair("form_schema", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)), false, booleanQueryParameter2, null);
                }
                return true;
            }
        }, new C0JKB() { // from class: X.0JJB
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/smb_optin");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                HashMap map2 = new HashMap();
                Iterator<String> it2 = UriProtector.getQueryParameterNames(uri).iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    map2.put(next, str);
                }
                String str2 = (String) map2.get("show_entrance");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) map2.get("anchor_id");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = (String) map2.get("sec_anc_id");
                if (str4 != null) {
                    str = str4;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIJ(context, new PcsServicePlusOptinPageParams(str3, str, str2, 0L, "", map2));
                return true;
            }
        }, new C0JKB() { // from class: X.0JIs
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_queue_anchor_start");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long id;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                HashMap map2 = new HashMap();
                map2.put("sec_anchor_id", UserService.getInstance().user().getCurrentUser().getSecUid());
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        map2.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                C0JKF c0jkfW2 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2();
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                map2.put("sec_anchor_id", UserService.getInstance().user().getCurrentUser().getSecUid());
                c0jkfW2.LIZ(id, context, map2);
                return true;
            }
        });
    }
}
