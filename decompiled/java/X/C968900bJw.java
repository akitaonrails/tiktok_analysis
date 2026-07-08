package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRustMixerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtLinkMicRustManagerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968900bJw implements C1AXQ {
    public final C966020bFI LIZ;
    public final InterfaceC968960bK2 LIZIZ;
    public final InterfaceC968950bK1 LIZJ;
    public final C968840bJq LIZLLL = new C968840bJq();
    public final C967140bH6 LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public Map<Integer, Integer> LJII;

    @Override // X.C1AXQ
    public final LinkUser LJJJJ(long j) {
        return null;
    }

    @Override // X.C1AXQ
    @InterfaceC1294060jmO
    public final void LJJLIIIJL() {
    }

    @Override // X.C1AXQ
    public final Map<String, OnLineMicInfo> LIZ() {
        List<C968340bJ2> listLIZ;
        C967370bHT c967370bHT = this.LIZ.LJJII;
        if (c967370bHT == null || (listLIZ = c967370bHT.LJI.LIZ(false)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C968340bJ2 c968340bJ2 : listLIZ) {
            Pair pair = new Pair(c968340bJ2.LIZ, LJJJJZ(LJJJJLL((int) c968340bJ2.LIZIZ, C1CX9.Undefined)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        LJJIIZI(linkedHashMap2);
        return linkedHashMap2;
    }

    @Override // X.C1AXQ
    public final int LIZIZ() {
        C967370bHT c967370bHT = this.LIZ.LJJII;
        if (c967370bHT != null) {
            return c967370bHT.LJI.LIZ(false).size() + c967370bHT.LJII.LIZ(false).size();
        }
        return 0;
    }

    @Override // X.C1AXQ
    public final List<LinkUser> LIZLLL() {
        return LIZLLL();
    }

    @Override // X.C1AXQ
    public final void LJI() {
        this.LIZ.LJJI.LIZ("", C13BV.INSTANCE);
    }

    @Override // X.C1AXQ
    public final long LJIIJJI() {
        return this.LIZ.LIZ.netMode;
    }

    @Override // X.C1AXQ
    public final boolean LJIIL() {
        Map<Integer, Integer> map = this.LJII;
        return map != null && (map.isEmpty() ^ true);
    }

    @Override // X.C1AXQ
    public final void LJIILIIL() {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj == null || (interfaceC1276380jJs = c1276910jKj.LLJJJJ) == null) {
            return;
        }
        interfaceC1276380jJs.LJIILIIL();
    }

    @Override // X.C1AXQ
    public final List<C1276580jKC> LJIILL() {
        List<C1276580jKC> listLJIILL;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj == null) {
            return new ArrayList();
        }
        InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
        return (interfaceC1276380jJs == null || (listLJIILL = interfaceC1276380jJs.LJIILL()) == null) ? new ArrayList() : listLJIILL;
    }

    @Override // X.C1AXQ
    public final int LJJI() {
        return this.LIZ.LJIILL;
    }

    @Override // X.C1AXQ
    public final Map<String, OnLineMicInfo> LJJII() {
        List<C968340bJ2> listLIZ;
        List<C968980bK4> listLIZ2;
        C967370bHT c967370bHT = this.LIZ.LJJII;
        if (c967370bHT == null || (listLIZ = c967370bHT.LJI.LIZ(false)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        C967370bHT c967370bHT2 = this.LIZ.LJJII;
        if (c967370bHT2 == null || (listLIZ2 = c967370bHT2.LJII.LIZ(false)) == null) {
            listLIZ2 = C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C968340bJ2 c968340bJ2 : listLIZ) {
            linkedHashMap.put(c968340bJ2.LIZ, LJJJJZ(LJJJJLL((int) c968340bJ2.LIZIZ, C1CX9.Undefined)));
        }
        for (C968980bK4 c968980bK4 : listLIZ2) {
            linkedHashMap.put(c968980bK4.LIZIZ, LJJJJZ(LJJJJLL((int) c968980bK4.LIZ, C1CX9.Stream)));
        }
        return linkedHashMap;
    }

    @Override // X.C1AXQ
    public final String LJJIIJ() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // X.C1AXQ
    public final boolean LJJIIZ() {
        return C781520UlC.LJFF(this.LIZ.LIZ);
    }

    @Override // X.C1AXQ
    public final boolean LJJIJ() {
        return this.LIZ.LIZJ == 0;
    }

    @Override // X.C1AXQ
    public final Map<String, OnLineMicInfo> LJJIJIIJIL() {
        List<C968340bJ2> listLJJJJZI = this.LIZ.LJ().LJJJJZI();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJJJZI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C968340bJ2 c968340bJ2 : listLJJJJZI) {
            Pair pair = new Pair(c968340bJ2.LIZ, LJJJJZ(LJJJJLL((int) c968340bJ2.LIZIZ, C1CX9.Undefined)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        LJJIIZI(linkedHashMap2);
        return linkedHashMap2;
    }

    @Override // X.C1AXQ
    public final int LJJIL() {
        return LJJIL();
    }

    @Override // X.C1AXQ
    public final boolean LJJJI() {
        EnumC952680atm enumC952680atm;
        EnumC952680atm enumC952680atm2;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj == null || (enumC952680atm = c1276910jKj.LLIZLLLIL) == null) {
            enumC952680atm = EnumC952680atm.DEFAULT;
        }
        if (enumC952680atm == EnumC952680atm.SINGLE_VIEWMODE) {
            return true;
        }
        C1276910jKj c1276910jKj2 = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj2 == null || (enumC952680atm2 = c1276910jKj2.LLIZLLLIL) == null) {
            enumC952680atm2 = EnumC952680atm.DEFAULT;
        }
        return enumC952680atm2 == EnumC952680atm.SINGLE_VIEWMODE_V2;
    }

    @Override // X.C1AXQ
    public final Pair<Integer, Integer> LJJJJJ() {
        C1275030jHh config;
        C1274930jHX c1274930jHXLIZ;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj == null) {
            return new Pair<>(0, 0);
        }
        InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
        return (interfaceC1276380jJs == null || (config = interfaceC1276380jJs.getConfig()) == null || (c1274930jHXLIZ = config.LIZ()) == null) ? new Pair<>(0, 0) : new Pair<>(Integer.valueOf(c1274930jHXLIZ.LIZ), Integer.valueOf(c1274930jHXLIZ.LIZIZ));
    }

    public final InterfaceC968930bJz LJJJJJL() {
        return this.LJFF ? this.LIZLLL : this.LIZ.LJJII;
    }

    public final C967140bH6 LJJJJL() {
        if (this.LJI) {
            return this.LJ;
        }
        return null;
    }

    @Override // X.C1AXQ
    public final boolean LJJJZ() {
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        return C176600m4.LIZIZ(c1276910jKj != null ? Boolean.valueOf(c1276910jKj.LLIZ) : null);
    }

    @Override // X.C1AXQ
    public final void LJJLIIIJILLIZJL() {
        C1304630k3R.LIZLLL(6, "[rust call updateRtcVideoParamInfo]", "RustLinkLayoutProvider");
        this.LIZ.LJ().LJLIIIL();
    }

    @Override // X.C1AXQ
    public final InterfaceC1268870j7l LJJLIIIJLJLI() {
        InterfaceC754220TiG interfaceC754220TiG;
        InterfaceC1273910jFt liveCore;
        InterfaceC1272980jEO interfaceC1272980jEOLLFF;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj == null || (interfaceC754220TiG = c1276910jKj.LLJJJIL) == null || (liveCore = interfaceC754220TiG.getLiveCore()) == null || !(liveCore instanceof AbstractC1273900jFs) || (interfaceC1272980jEOLLFF = ((AbstractC1273900jFs) liveCore).LLFF()) == null) {
            return null;
        }
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = (ViewOnTouchListenerC1268840j7i) interfaceC1272980jEOLLFF;
        return viewOnTouchListenerC1268840j7i.LIZJ(viewOnTouchListenerC1268840j7i.LLILZ);
    }

    @Override // X.C1AXQ
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LIZ.isWithLinkMic();
    }

    @Override // X.C1AXQ
    public final boolean LJJLJ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // X.C1AXQ
    public final String getChannelId() {
        return String.valueOf(this.LIZ.LIZLLL);
    }

    @Override // X.C1AXQ
    public final DataChannel getDataChannel() {
        BizConfig bizConfigInvoke;
        C945380ai0 c945380ai0;
        Function0<BizConfig> function0 = this.LIZ.LJIILIIL;
        if (function0 == null || (bizConfigInvoke = function0.invoke()) == null || (c945380ai0 = bizConfigInvoke.businessConfig) == null) {
            return null;
        }
        return c945380ai0.LJ;
    }

    @Override // X.C1AXQ
    public final String getGroupChannelId() {
        String string;
        Long groupChannelId = this.LIZ.getGroupChannelId();
        return (groupChannelId == null || (string = groupChannelId.toString()) == null) ? "" : string;
    }

    @Override // X.C1AXQ
    public final Map<String, OnLineMicInfo> LJIIIIZZ() {
        Map<String, OnLineMicInfo> mapLJIIIIZZ;
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        return (interfaceC968930bJzLJJJJJL == null || (mapLJIIIIZZ = interfaceC968930bJzLJJJJJL.LJIIIIZZ()) == null) ? LIZ() : mapLJIIIIZZ;
    }

    @Override // X.C1AXQ
    public final List<LinkUser> LJIIIZ() {
        List<LinkUser> listLJIIIZ;
        C967140bH6 c967140bH6LJJJJL = LJJJJL();
        return (c967140bH6LJJJJL == null || (listLJIIIZ = c967140bH6LJJJJL.LJIIIZ()) == null) ? this.LIZ.LJJIFFI.LJIJI : listLJIIIZ;
    }

    @Override // X.C1AXQ
    public final int LJJIIJZLJL() {
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        return interfaceC968930bJzLJJJJJL != null ? interfaceC968930bJzLJJJJJL.LJJIIJZLJL() : LIZIZ();
    }

    @Override // X.C1AXQ
    public final void LJJJIL() {
        if (LJJJJL() == null) {
            getClass();
        }
    }

    @Override // X.C1AXQ
    public final String LJJJJI() {
        String str;
        C967140bH6 c967140bH6LJJJJL = LJJJJL();
        if (c967140bH6LJJJJL != null && (str = c967140bH6LJJJJL.LJIILJJIL) != null) {
            return str;
        }
        getClass();
        return "";
    }

    @Override // X.C1AXQ
    public final Map<String, OnLineMicInfo> LJJJJIZL() {
        Map<String, OnLineMicInfo> mapLJJJJIZL;
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        return (interfaceC968930bJzLJJJJJL == null || (mapLJJJJIZL = interfaceC968930bJzLJJJJJL.LJJJJIZL()) == null) ? LJJII() : mapLJJJJIZL;
    }

    @Override // X.C1AXQ
    public final void LJJZZI() {
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        if (interfaceC968930bJzLJJJJJL != null) {
            interfaceC968930bJzLJJJJJL.LJJJJJ();
        }
    }

    @Override // X.C1AXQ
    public final C00IA z9() {
        return C00IA.NONE;
    }

    public static OnLineMicInfo LJJJJZ(MicPositionInfo micPositionInfo) {
        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
        builder.setMicPositionData(micPositionInfo);
        return builder.build();
    }

    @Override // X.C1AXQ
    public final void LIZJ(String str) {
        this.LIZ.LJJI.LIZIZ(str);
    }

    @Override // X.C1AXQ
    public final boolean LJ(String str) {
        return this.LIZIZ.LJ(str);
    }

    @Override // X.C1AXQ
    public final OnLineMicInfo LJFF(String str) {
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) ((LinkedHashMap) LJJII()).get(str);
        if (onLineMicInfo == null) {
            return LJJJJLI(str);
        }
        return onLineMicInfo;
    }

    @Override // X.C1AXQ
    public final int LJII(int i) {
        Integer num;
        if (LJIIL()) {
            Map<Integer, Integer> map = this.LJII;
            if (map != null && (num = map.get(Integer.valueOf(i))) != null) {
                return num.intValue();
            }
            return -1;
        }
        return i;
    }

    @Override // X.C1AXQ
    public final LinkUser LJIIJ(String str) {
        C967140bH6 c967140bH6LJJJJL = LJJJJL();
        if (c967140bH6LJJJJL != null) {
            return c967140bH6LJJJJL.LJIIJ(str);
        }
        return null;
    }

    @Override // X.C1AXQ
    public final int LJIILLIIL(int i) {
        if (LJIIL()) {
            Map<Integer, Integer> map = this.LJII;
            if (map != null) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().intValue() == i) {
                        return entry.getKey().intValue();
                    }
                }
                return -1;
            }
            return -1;
        }
        return i;
    }

    @Override // X.C1AXQ
    public final void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1) {
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        if (interfaceC968930bJzLJJJJJL != null) {
            interfaceC968930bJzLJJJJJL.LJIIZILJ(interfaceC940430aa1);
        }
    }

    @Override // X.C1AXQ
    public final void LJIJ(Map<Integer, Integer> map) {
        this.LJII = map;
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        if (interfaceC968930bJzLJJJJJL != null) {
            interfaceC968930bJzLJJJJJL.LJIJ(map);
        }
    }

    @Override // X.C1AXQ
    public final OnLineMicInfo LJIJI(String str) {
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) ((LinkedHashMap) LIZ()).get(str);
        if (onLineMicInfo == null) {
            return LJJJJLI(str);
        }
        return onLineMicInfo;
    }

    @Override // X.C1AXQ
    public final void LJIL(InterfaceC940430aa1 interfaceC940430aa1) {
        C967140bH6 c967140bH6LJJJJL = LJJJJL();
        if (c967140bH6LJJJJL != null) {
            c967140bH6LJJJJL.LJIL(interfaceC940430aa1);
        } else {
            LJIL(interfaceC940430aa1);
        }
    }

    @Override // X.C1AXQ
    public final void LJJ(Map<String, String> map) {
        this.LIZJ.LIZLLL(map);
    }

    @Override // X.C1AXQ
    public final LinkUser LJJIFFI(String str) {
        return LJJIFFI(str);
    }

    public final void LJJIIZI(Map map) {
        List<C968980bK4> listLIZ;
        C967370bHT c967370bHT = this.LIZ.LJJII;
        if (c967370bHT == null || (listLIZ = c967370bHT.LJII.LIZ(false)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        for (C968980bK4 c968980bK4 : listLIZ) {
            map.put(c968980bK4.LIZIZ, LJJJJZ(LJJJJLL((int) c968980bK4.LIZ, c968980bK4.LIZJ)));
        }
    }

    @Override // X.C1AXQ
    public final OnLineMicInfo LJJIJIIJI(String str) {
        OnLineMicInfo onLineMicInfoLJJIJIIJI;
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        if (interfaceC968930bJzLJJJJJL == null || (onLineMicInfoLJJIJIIJI = interfaceC968930bJzLJJJJJL.LJJIJIIJI(str)) == null) {
            return LJIJI(str);
        }
        return onLineMicInfoLJJIJIIJI;
    }

    @Override // X.C1AXQ
    public final LinkUser LJJIJL(long j) {
        return LJJIJL(j);
    }

    @Override // X.C1AXQ
    public final OnLineMicInfo LJJIJLIJ(String str) {
        OnLineMicInfo onLineMicInfoLJJIJLIJ;
        InterfaceC968930bJz interfaceC968930bJzLJJJJJL = LJJJJJL();
        if (interfaceC968930bJzLJJJJJL == null || (onLineMicInfoLJJIJLIJ = interfaceC968930bJzLJJJJJL.LJJIJLIJ(str)) == null) {
            return LJFF(str);
        }
        return onLineMicInfoLJJIJLIJ;
    }

    @Override // X.C1AXQ
    public final LinkUser LJJIZ(String str) {
        C967140bH6 c967140bH6LJJJJL = LJJJJL();
        if (c967140bH6LJJJJL != null) {
            return c967140bH6LJJJJL.LJJIZ(str);
        }
        return LJJIZ(str);
    }

    public final OnLineMicInfo LJJJJLI(String str) {
        C968340bJ2 next;
        int i;
        C967370bHT c967370bHT = this.LIZ.LJJII;
        if (c967370bHT == null) {
            return null;
        }
        Iterator<C968340bJ2> it2 = c967370bHT.LJI.LIZ(false).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C968340bJ2 c968340bJ2 = next;
        if (c968340bJ2 == null || (i = (int) c968340bJ2.LIZIZ) < 0) {
            return null;
        }
        return LJJJJZ(LJJJJLL(i, C1CX9.Undefined));
    }

    @Override // X.C1AXQ
    public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
        this.LIZJ.LJIIIIZZ(map);
    }

    @Override // X.C1AXQ
    public final void LJJLIIIIJ(List<C1276780jKW> list) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LJJLJ("stopLayoutAnimation", list);
            EnumC952680atm enumC952680atm = c1276910jKj.LLIZLLLIL;
            if ((enumC952680atm == EnumC952680atm.SINGLE_VIEWMODE_V2 || enumC952680atm == EnumC952680atm.SINGLE_VIEWMODE) && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
                interfaceC1276380jJs.LJJJ(list);
            }
        }
    }

    @Override // X.C1AXQ
    public final boolean LJJLIIIJ(String str) {
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(this.LIZ.LIZ.getId())) && !this.LIZ.LJ().LJ(str)) {
            return false;
        }
        return true;
    }

    @Override // X.C1AXQ
    public final void LJJLIIIJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
        C1276910jKj c1276910jKj;
        InterfaceC1276380jJs interfaceC1276380jJs;
        this.LIZJ.LJ(linkLayerRTCMessage);
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage);
        if (json != null && (c1276910jKj = this.LIZ.LJJI.LIZIZ) != null && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
            interfaceC1276380jJs.sendRoomMessage(json);
        }
    }

    @Override // X.C1AXQ
    public final void LJJLIIJ(Object obj) {
        InterfaceC2235471CeX interfaceC2235471CeX;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayerCreated, layer=");
        sbLIZ.append(obj.hashCode());
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZ.LIZJ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZ.LIZ.getId());
        C20441214yg.LIZIZ("RustLinkLayoutProvider", C2188811AlT.LIZIZ(sbLIZ));
        C966020bFI c966020bFI = this.LIZ;
        c966020bFI.getClass();
        if ((obj instanceof InterfaceC2235471CeX) && (interfaceC2235471CeX = (InterfaceC2235471CeX) obj) != null) {
            C969310bKb.LIZLLL.LIZ(new RunnableC966310bFl(new C968140bIi(c966020bFI, interfaceC2235471CeX)));
        }
    }

    @Override // X.C1AXQ
    public final LiveStreamMixer LJJLIL(C968920bJy c968920bJy) {
        if (LinkMicRustMixerSetting.INSTANCE.enable()) {
            return new C2181381AYu(c968920bJy.LIZ, c968920bJy.LIZIZ, c968920bJy.LIZJ, c968920bJy.LJFF, c968920bJy.LIZLLL, c968920bJy.LJ, c968920bJy.LJII, c968920bJy.LJIIIIZZ, c968920bJy.LJIIIZ, c968920bJy.LJIIJ, c968920bJy.LJIIJJI, c968920bJy.LJIIL, c968920bJy.LJIILIIL, c968920bJy.LJIILJJIL, c968920bJy.LJIILL, c968920bJy.LJIILLIIL);
        }
        return null;
    }

    @Override // X.C1AXQ
    public final void LJJLJLI(List<C1276780jKW> list) {
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LJJLJ("setCompositeLayout", list);
        }
    }

    @Override // X.C1AXQ
    public final InterfaceC1268870j7l LJJLL(String str) {
        InterfaceC754220TiG interfaceC754220TiG;
        InterfaceC1273910jFt liveCore;
        InterfaceC1272980jEO interfaceC1272980jEOLLFF;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null && (interfaceC754220TiG = c1276910jKj.LLJJJIL) != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null && (liveCore instanceof AbstractC1273900jFs) && (interfaceC1272980jEOLLFF = ((AbstractC1273900jFs) liveCore).LLFF()) != null) {
            return ((ViewOnTouchListenerC1268840j7i) interfaceC1272980jEOLLFF).LIZJ(str);
        }
        return null;
    }

    @Override // X.C1AXQ
    public final void LJL(C969030bK9 c969030bK9) {
        this.LIZ.LJ().LJJJLZIJ(true);
        c969030bK9.LIZ(new JoinRtcChannelResult(null));
    }

    @Override // X.C1AXQ
    public final void LJLI(InterfaceC1280020jPk interfaceC1280020jPk) {
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LLJLL = interfaceC1280020jPk;
        }
    }

    @Override // X.C1AXQ
    public final void LJIILJJIL(String str, C1276750jKT c1276750jKT) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null && (interfaceC1276380jJs = c1276910jKj.LLJJJJ) != null) {
            interfaceC1276380jJs.LJIILJJIL(str, c1276750jKT);
        }
    }

    @Override // X.C1AXQ
    public final void LJIJJ(String str, boolean z) {
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LJIJJ(str, z);
        }
    }

    @Override // X.C1AXQ
    public final void LJIJJLI(String str, boolean z) {
        this.LIZJ.LIZJ(str, z);
    }

    @Override // X.C1AXQ
    public final void LJJIII(String str, List<? extends C1276580jKC> list) {
        this.LIZ.LJJI.LIZ(str, list);
    }

    public final MicPositionInfo LJJJJLL(int i, C1CX9 c1cx9) {
        int iIntValue;
        Map<Integer, Integer> map;
        Integer num;
        if (this.LJII != null && (!r0.isEmpty()) && (map = this.LJII) != null && (num = map.get(Integer.valueOf(i))) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = i;
        }
        return new MicPositionInfo(0, i, iIntValue, 0L, c1cx9.intoInt(), null);
    }

    @Override // X.C1AXQ
    public final void LJJLIIIJJIZ(List<LinkUser> list, List<LinkUser> list2) {
        this.LIZJ.LJIILL(list, list2);
    }

    @Override // X.C1AXQ
    public final void LJJZ(List<LinkUser> list, List<LinkUser> list2) {
        this.LIZJ.LJI(list, list2);
    }

    @Override // X.C1AXQ
    public final void LJJZZIII(List list, C1AXU c1axu) {
        LJJJJJ(list, c1axu);
    }

    public C968900bJw(C966020bFI c966020bFI, C1303170k15 c1303170k15, C964760bDG c964760bDG) {
        C967140bH6 c967140bH6;
        this.LIZ = c966020bFI;
        this.LIZIZ = c1303170k15;
        this.LIZJ = c964760bDG;
        int i = c966020bFI.LIZJ;
        if (i != 4 && i != 0) {
            c967140bH6 = null;
        } else {
            c967140bH6 = new C967140bH6();
        }
        this.LJ = c967140bH6;
        this.LJFF = MtLinkMicRustManagerSetting.positionEnable();
        this.LJI = MtLinkMicRustManagerSetting.userEnable();
    }

    @Override // X.C1AXQ
    public final void LJJIJIL(String str, float f, boolean z) {
        C1276910jKj c1276910jKj = this.LIZ.LJJI.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LJJIJIL(str, f, z);
        }
    }

    @Override // X.C1AXQ
    public final void LJJJ(int i, int i2, InterfaceC1303110k0z interfaceC1303110k0z, String str) {
        this.LIZIZ.LJJJ(i, i2, interfaceC1303110k0z, str);
    }

    @Override // X.C1AXQ
    public final void LJJL(int i, String str, InterfaceC1303160k14 interfaceC1303160k14, String str2) {
        this.LIZIZ.LJJL(i, str, interfaceC1303160k14, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    @Override // X.C1AXQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI(java.lang.String r25, java.lang.String r26, java.util.List<? extends X.C1276580jKC> r27, java.util.List<X.C1276780jKW> r28, java.util.List<? extends X.C1276580jKC> r29, java.util.List<X.C1276780jKW> r30, java.lang.String r31, org.json.JSONObject r32, org.json.JSONObject r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C968900bJw.LJJLI(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }
}
