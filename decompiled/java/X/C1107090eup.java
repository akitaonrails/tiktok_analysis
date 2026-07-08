package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsEntrancePermissionRollback;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBToolInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107090eup extends AbstractC1107140euu {
    public final int LLJJIJI = 4;
    public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.SERVICE_PLUS_FORM;
    public String LLJJIJIL = "";

    @Override // X.AbstractC1107140euu
    public final boolean LJIIJJI() {
        SMBToolInfo sMBToolInfo;
        if (!C1083940eJU.LIZIZ(this.LLILZLL)) {
            return false;
        }
        Room room = this.LLILZLL;
        return room == null || (sMBToolInfo = room.smbToolInfo) == null || sMBToolInfo.showFormEntrance || LivePcsEntrancePermissionRollback.INSTANCE.rollback();
    }

    @Override // X.AbstractC1107140euu
    public final int LJIIL() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1107140euu
    public final EnumC1107860ew4 LJIILIIL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1107140euu, X.AbstractC1107400evK
    public final boolean LJIIIIZZ(C1107220ev2 c1107220ev2) {
        User owner;
        String secUid;
        boolean z = false;
        if (!LJIIJJI() || ((IPinCardService) this.LLILZ.getValue()).Qi(this.LLJJIJIIJIL)) {
            return false;
        }
        this.LLJJIJIL = String.valueOf(c1107220ev2.LIZ.id);
        Room room = this.LLILZLL;
        String string = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        }
        String str = "";
        if (string == null) {
            string = "";
        }
        Room room2 = this.LLILZLL;
        if (room2 != null && (owner = room2.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
            str = secUid;
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        }
        C1823250xXv c1823250xXv = new C1823250xXv(new C1822490xWh());
        final C1107110eur c1107110eur = new C1107110eur(this, c1107220ev2);
        final C1107100euq c1107100euq = new C1107100euq(this, c1107220ev2);
        c1823250xXv.LIZJ(new C1823280xXy(str, string, z, EnumC1822480xWg.FETCH_REMOTE_ONLY_WHEN_NO_CACHE)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0K08
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ServiceBioUseCaseExtKt@7610.fetchSmbPreviewFromRemoteWhenNoCache$3");
                AbstractC509020Jxk abstractC509020Jxk = (AbstractC509020Jxk) obj;
                if (abstractC509020Jxk instanceof C509040Jxm) {
                    C1158720gG6 c1158720gG6 = ((C509040Jxm) abstractC509020Jxk).LIZ;
                    if (c1158720gG6 != null) {
                        c1107110eur.invoke(c1158720gG6);
                    }
                } else if (abstractC509020Jxk instanceof C509030Jxl) {
                    c1107110eur.invoke(((C509030Jxl) abstractC509020Jxk).LIZ);
                } else if (abstractC509020Jxk instanceof C490400JLa) {
                    c1107100euq.invoke(((C490400JLa) abstractC509020Jxk).LIZ);
                } else {
                    throw new C1954807lC();
                }
                C1C7U.LIZIZ("ServiceBioUseCaseExtKt@7610.fetchSmbPreviewFromRemoteWhenNoCache$3");
            }
        }, new C09JN() { // from class: X.07z2
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ServiceBioUseCaseExtKt@7610.fetchSmbPreviewFromRemoteWhenNoCache$4");
                c1107100euq.invoke(obj);
                C1C7U.LIZIZ("ServiceBioUseCaseExtKt@7610.fetchSmbPreviewFromRemoteWhenNoCache$4");
            }
        });
        return true;
    }

    @Override // X.AbstractC1107140euu
    public final String LJIILJJIL(String str) {
        boolean z;
        Object obj;
        String strLIZ;
        Room room = this.LLILZLL;
        if (room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "old_schema");
        String str2 = "form_pin_card";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            String string = builderBuildUpon.appendQueryParameter("show_entrance", str2).build().toString();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str3, "old_schema")) {
                    Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                    while (it2.hasNext()) {
                        builderClearQuery.appendQueryParameter(str3, it2.next());
                    }
                }
            }
            builderClearQuery.appendQueryParameter("old_schema", string);
            strLIZ = builderClearQuery.build().toString();
        } else {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pcs_params");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "{}";
                }
                Map<String, Object> mapLJ = C08HX.LJ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3));
                linkedHashMap.put("show_entrance", "form_pin_card");
                for (Map.Entry entry : ((LinkedHashMap) mapLJ).entrySet()) {
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                linkedHashMap.put("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
                linkedHashMap.put("is_single_sku", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("is_service_plus_revamp", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage())) ? 1 : 0));
                C189200o6.m2constructorimpl(linkedHashMap);
                obj = linkedHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Map mapLJ2 = C2097608Jq.LJ();
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = mapLJ2;
            }
            C490590JLt.LIZ.getClass();
            strLIZ = C490590JLt.LIZ(str, "pcs_params", (Map) obj2);
        }
        C490590JLt c490590JLt = C490590JLt.LIZ;
        String str4 = this.LLJJIJIL;
        c490590JLt.getClass();
        return C490590JLt.LJIIIZ(strLIZ, str4);
    }
}
