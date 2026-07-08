package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.websocket.experiment.WsConnectionExtrasConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0XDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC845060XDc implements InterfaceC2203441BLq {
    public volatile long LIZIZ;
    public volatile C0XE1 LIZ = C0XE1.CONNECTION_UNKNOWN;
    public String LIZJ = "";
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C845070XDd());
    public final C01GW LJ = C452501pT.LIZIZ(new C845080XDe());
    public final C01GW LJFF = C452501pT.LIZIZ(new C845100XDg());

    public final ConcurrentHashMap<C845110XDh, InterfaceC486470J5x> LJIILIIL() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC2203441BLq
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2203441BLq
    public final C0XE1 getState() {
        return this.LIZ;
    }

    public static C821320WJu LJIIL(String str) throws JSONException {
        String frontierBoeUrl;
        InterfaceC1910030znt currentI18nItem;
        String language;
        C0WKO c0wko;
        ArrayList arrayList = new ArrayList();
        C845540XEy c845540XEy = C845540XEy.LIZ;
        c845540XEy.getClass();
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            frontierBoeUrl = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getFrontierBoeUrl();
            if (frontierBoeUrl == null || frontierBoeUrl.length() <= 0) {
                frontierBoeUrl = "ws:///ws/v2";
            }
        } else {
            WsConnectionExtrasConfig.FrontierConnectionExtra frontierConnectionExtra = WsConnectionExtrasConfig.LIZ;
            if (frontierConnectionExtra.enableDomainChange) {
                frontierBoeUrl = frontierConnectionExtra.privateProtocolDomain;
            } else {
                frontierBoeUrl = C845090XDf.LIZ;
            }
        }
        arrayList.add(frontierBoeUrl);
        C0WKN c0wkn = new C0WKN(1239108);
        c0wkn.LJII = "e1bd35ec9db7b8d846de66ed140b1ad9";
        c0wkn.LJFF = 9;
        C844470XAv.LIZ.getClass();
        c0wkn.LJ = C844470XAv.LJIIJ;
        c0wkn.LJI = (int) C844470XAv.LIZIZ();
        c0wkn.LJIIIIZZ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        c0wkn.LJIIIZ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
        Map mapLIZJ = C847400XMc.LIZJ((String) ListProtector.get(arrayList, 0));
        String str2 = "1";
        if (mapLIZJ == null || mapLIZJ.isEmpty()) {
            C845400XEk.LIZIZ(C845320XEc.LJII, "[getChannelInfo], addRequestHeader is null or empty, use backup fields");
            mapLIZJ = C2097608Jq.LJIIIIZZ(new Pair("X-Tt-Token", C847400XMc.LJI()), new Pair("sdk-version", "2"), new Pair("passport-sdk-version", "1"));
        }
        ((HashMap) c0wkn.LIZJ).putAll(mapLIZJ);
        WsConnectionExtrasConfig.FrontierConnectionExtra frontierConnectionExtra2 = WsConnectionExtrasConfig.LIZ;
        C845320XEc c845320XEc = C845320XEc.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[getChannelInfo], enablePrivateProtocol: ");
        sbLIZ.append(frontierConnectionExtra2.enablePrivateProtocol);
        C2188811AlT.LIZIZ(sbLIZ);
        if (frontierConnectionExtra2.enablePrivateProtocol) {
            c0wkn.LJIIJ = true;
            List listSingletonList = Collections.singletonList(5);
            if (listSingletonList != null) {
                ((ArrayList) c0wkn.LJIIJJI).addAll(listSingletonList);
            }
            c0wkn.LIZJ(frontierConnectionExtra2.privateProtocolDomain);
            int i = frontierConnectionExtra2.transportMode;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            c0wko = C0WKO.TUDP;
                        } else {
                            c0wko = C0WKO.TUDP_PROXY;
                        }
                    } else {
                        c0wko = C0WKO.HTTP2;
                    }
                } else {
                    c0wko = C0WKO.TLS;
                }
            } else {
                c0wko = C0WKO.TUDP;
            }
            c0wkn.LJIILIIL = c0wko;
            c0wkn.LIZIZ("fallback_timeout_mills", String.valueOf(frontierConnectionExtra2.wsFallbackTimeoutMillis));
        }
        c0wkn.LIZIZ("x-accept-ack", "1");
        ((ArrayList) c0wkn.LIZLLL).addAll(arrayList);
        HashMap map = new HashMap();
        C0XDN.LIZLLL(map, false, C0XDP.L0);
        map.remove("mac_address");
        map.remove("device_id");
        map.put("ne", String.valueOf(C845540XEy.LIZ(c845540XEy)));
        if (!C1906580ziK.LJI()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_background", str2);
        map.put("em", str);
        map.put("qos_level", "2");
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class, false);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
        ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
        if (iSettingService != null && (currentI18nItem = iSettingService.getCurrentI18nItem(C844470XAv.LIZ())) != null && (language = currentI18nItem.getLanguage()) != null && !TextUtils.isEmpty(language)) {
            map.put("language", language);
        }
        Map<String, String> map2 = frontierConnectionExtra2.extras;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[dynamicExtras], value is ");
        sbLIZ2.append(map2);
        C845400XEk.LIZIZ("WsUtils", C2188811AlT.LIZIZ(sbLIZ2));
        if (!map2.isEmpty()) {
            map.putAll(map2);
        }
        ((HashMap) c0wkn.LIZIZ).putAll(map);
        return c0wkn.LIZ();
    }

    @Override // X.InterfaceC2203441BLq
    public final void LIZLLL(C0XEZ c0xez) {
        ((CopyOnWriteArraySet) this.LJFF.getValue()).add(c0xez);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIIZ(InterfaceC486470J5x interfaceC486470J5x) {
        ((CopyOnWriteArraySet) this.LJ.getValue()).remove(interfaceC486470J5x);
        for (Map.Entry<C845110XDh, InterfaceC486470J5x> entry : LJIILIIL().entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), interfaceC486470J5x)) {
                LJIILIIL().remove(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIJJI(C0XEZ c0xez) {
        ((CopyOnWriteArraySet) this.LJFF.getValue()).remove(c0xez);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJII(int i, int i2) {
        LJIILIIL().remove(new C845110XDh(i, i2));
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJI(int i, int i2, InterfaceC486470J5x interfaceC486470J5x) {
        if (i == -10000 && i2 == -10000) {
            ((CopyOnWriteArraySet) this.LJ.getValue()).add(interfaceC486470J5x);
        } else {
            LJIILIIL().put(new C845110XDh(i, i2), interfaceC486470J5x);
        }
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIIIZZ(long j, long j2, int i, int i2, byte[] bArr, String str, String str2, Map<String, String> map) {
        C0WKM c0wkm = new C0WKM(1239108);
        c0wkm.LJIIIIZZ = j;
        c0wkm.LIZJ = j2;
        c0wkm.LIZLLL = i;
        c0wkm.LJ = i2;
        c0wkm.LJFF = bArr;
        c0wkm.LJI = str;
        c0wkm.LJII = str2;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0wkm.LIZ(entry.getKey(), entry.getValue());
            }
        }
        ((C845320XEc) this).LIZ(c0wkm.LIZIZ());
    }
}
