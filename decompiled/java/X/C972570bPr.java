package X;

import android.util.LruCache;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicTaskCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRustJoinChannelBlock;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LivesdkLsWatchLinkmicSettingsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C972570bPr extends C2217421BqW implements Function0<InterfaceC966930bGl> {
    public C972570bPr(C966020bFI c966020bFI) {
        super(0, c966020bFI, C966020bFI.class, "createLinker", "createLinker()Lcom/bytedance/android/livesdk/comp/impl/linkcore/impl/rust/linkmic/ILinkerDelegate;", 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0bKU] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1Ac3] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC966930bGl invoke() {
        ByteBuffer byteBufferAllocateDirect;
        InterfaceC966930bGl c2234371Ccl;
        int i;
        ByteBuffer byteBufferAllocateDirect2;
        Long l;
        int i2;
        ChannelInfo channelInfo;
        InterfaceC965990bFF interfaceC965990bFF;
        InterfaceC1279800jPO interfaceC1279800jPO;
        int i3;
        ByteBuffer byteBufferAllocateDirect3;
        Long l2;
        int i4;
        ByteBuffer byteBufferAllocateDirect4;
        Long l3;
        final C966020bFI c966020bFI = (C966020bFI) this.receiver;
        c966020bFI.getClass();
        C1276910jKj c1276910jKj = new C1276910jKj(c966020bFI.LIZ, c966020bFI.LIZIZ, c966020bFI.LIZJ, c966020bFI);
        int i5 = c966020bFI.LIZJ;
        boolean z = c966020bFI.LIZIZ;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        C965980bFE c965980bFE = new C965980bFE(c966020bFI);
        c966020bFI.LJJIJ.LIZ(c965980bFE);
        c966020bFI.LJIL = c965980bFE;
        C972580bPs c972580bPs = new C972580bPs();
        c972580bPs.LIZ = UserService.getInstance().user().getCurrentUserId();
        c972580bPs.LIZIZ = c966020bFI.LIZIZ;
        long id = c966020bFI.LIZ.getId();
        long ownerUserId = c966020bFI.LIZ.getOwnerUserId();
        Room room = c966020bFI.LIZ;
        int i6 = room.liveRoomMode;
        c972580bPs.LIZJ = new C972620bPw(id, ownerUserId, i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 6 ? i6 != 7 ? EnumC972600bPu.Normal : EnumC972600bPu.LiveVoice : EnumC972600bPu.LiveStudio : EnumC972600bPu.Screen : EnumC972600bPu.Audio : EnumC972600bPu.Media : EnumC972600bPu.Obs : EnumC972600bPu.Normal, room.netMode);
        c972580bPs.LIZLLL = new C972640bPy(iHostAppContext.appId(), iHostAppContext.liveId(), iHostAppContext.getChannel());
        final C965350bED c965350bED = c966020bFI.LJJ;
        c972580bPs.LJ = new InterfaceC2181451AZb(c965350bED) { // from class: X.1AZX
            public final InterfaceC2181441AZa LL;

            {
                this.LL = c965350bED;
            }

            @Override // X.InterfaceC2181451AZb
            public final void LIZ(C1AZZ c1azz) {
                String str = c1azz.LIZ;
                int i7 = C2183011Ac7.LIZ[c1azz.LIZIZ.ordinal()];
                ArrayList arrayList = null;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    C1AZW.LJIIIZ(this.LL, str, c1azz.LIZJ, null, c1azz.LIZLLL);
                                    return;
                                } else {
                                    C1AZW.LJI(this.LL, str, c1azz.LIZJ, null, c1azz.LIZLLL);
                                    return;
                                }
                            }
                            C1AZW.LJIILLIIL(this.LL, str, c1azz.LIZJ, null, c1azz.LIZLLL);
                            return;
                        }
                        C1AZW.LIZIZ(this.LL, str, c1azz.LIZJ, null, c1azz.LIZLLL);
                        return;
                    }
                    C1AZW.LJIIIZ(this.LL, str, c1azz.LIZJ, null, c1azz.LIZLLL);
                    return;
                }
                InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
                String str2 = c1azz.LIZJ;
                Map<String, String> map = c1azz.LIZLLL;
                C1AZW.LIZ.getClass();
                String strLJIIJJI = C1AZW.LJIIJJI(str, map);
                StringBuilder sb = new StringBuilder();
                sb.append(C1AZW.LIZLLL(str2, map));
                sb.append(", params:");
                if (map != null) {
                    arrayList = new ArrayList(map.size());
                    Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        arrayList.add(new JSONObject(map));
                    }
                }
                sb.append(arrayList);
                sb.append("");
                C20441214yg.LJIIJJI(strLJIIJJI, sb.toString());
                C1AZW.LIZ.getClass();
                C1AZW.LJIIL(interfaceC2181441AZa, "v", str, str2, null, map);
            }

            @Override // X.InterfaceC2181451AZb
            public final void LIZJ(EnumC2183041AcA enumC2183041AcA, String str, String str2, String str3) {
                int i7 = C2183011Ac7.LIZ[enumC2183041AcA.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str2);
                                    sbLIZ.append(", extra=");
                                    sbLIZ.append(str3);
                                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str2);
                                sbLIZ2.append(", extra=");
                                sbLIZ2.append(str3);
                                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(str2);
                            sbLIZ3.append(", extra=");
                            sbLIZ3.append(str3);
                            C20441214yg.LJIIL(str, C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str2);
                        sbLIZ4.append(", extra=");
                        sbLIZ4.append(str3);
                        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ4));
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str2);
                    sbLIZ5.append(", extra=");
                    sbLIZ5.append(str3);
                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(str2);
                sbLIZ6.append(", extra=");
                sbLIZ6.append(str3);
                C20441214yg.LJIIJJI(str, C2188811AlT.LIZIZ(sbLIZ6));
            }
        };
        C2183171AcN c2183171AcN = new C2183171AcN(c965350bED);
        c966020bFI.LJJIJ.LIZ(c2183171AcN);
        c972580bPs.LJI = c2183171AcN;
        c972580bPs.LJII = c965980bFE;
        C972540bPo c972540bPo = new C972540bPo(c966020bFI.LJJIII);
        c966020bFI.LJJIJ.LIZ(c972540bPo);
        c972580bPs.LJFF = c972540bPo;
        c972580bPs.LJIIIIZZ = c1276910jKj;
        final boolean z2 = c966020bFI.LIZIZ;
        final C967660bHw c967660bHw = new C967660bHw(c966020bFI);
        final ?? r1 = new InterfaceC969250bKV() { // from class: X.0bKU
            @Override // X.InterfaceC969250bKV
            public final long currentTimeMillis() {
                try {
                    return C158B.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("TimeProvider", e);
                    return C963140bAe.LIZIZ();
                }
            }
        };
        c972580bPs.LJIIIZ = new C1CJX(z2, c967660bHw, r1) { // from class: X.0bKT
            public final boolean LL;
            public final Function0<Boolean> LLILLJJLI;
            public final InterfaceC969250bKV LLILLL;

            @Override // X.C1CJX
            public final boolean LIZJ(long j) {
                return false;
            }

            @Override // X.C1CJX
            public final EnumC972330bPT G8() {
                return this.LLILLJJLI.invoke().booleanValue() ? EnumC972330bPT.Fixed : EnumC972330bPT.Float;
            }

            @Override // X.C1CJX
            public final long LIZ() {
                return this.LLILLL.currentTimeMillis();
            }

            @Override // X.C1CJX
            public final String LIZLLL(C969260bKW c969260bKW) {
                LiveMode streamType;
                n nVar;
                k kVarLJJIIZ;
                if (this.LL) {
                    return LiveAbLabelSetting.INSTANCE.getStringValue(c969260bKW.LIZ);
                }
                LruCache<String, n> lruCache = C931820aM8.LIZ;
                String str = c969260bKW.LIZ;
                String strLJIL = null;
                try {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    if (room2 != null) {
                        streamType = room2.getStreamType();
                    } else {
                        streamType = null;
                    }
                    if (streamType != LiveMode.LIVE_STUDIO && streamType != LiveMode.THIRD_PARTY) {
                        Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                        if (room3 != null && (nVar = C931820aM8.LIZ.get(room3.getIdStr())) != null && (kVarLJJIIZ = nVar.LJJIIZ(str)) != null) {
                            strLJIL = kVarLJJIIZ.LJIL();
                        }
                    } else {
                        k kVar = LivesdkLsWatchLinkmicSettingsSetting.INSTANCE.getValue().get(str);
                        if (kVar != null) {
                            strLJIL = kVar.LJIL();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getStringValue error ");
                    sbLIZ.append(str);
                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                }
                if (strLJIL != null) {
                    return strLJIL;
                }
                return "";
            }

            {
                this.LL = z2;
                this.LLILLJJLI = c967660bHw;
                this.LLILLL = r1;
            }
        };
        C1CIS c1cis = new C1CIS(new C1CIG(6452906720779386986L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2182961Ac2(new InterfaceC2182981Ac4() { // from class: X.1Ac3
            @Override // X.InterfaceC2182981Ac4
            public final String LIZ(C2182991Ac5 c2182991Ac5) {
                String string;
                Object settingValue = SettingsManager.INSTANCE.getSettingValue(c2182991Ac5.LIZ);
                if (settingValue == null || (string = settingValue.toString()) == null) {
                    return c2182991Ac5.LIZIZ;
                }
                return string;
            }
        })))));
        int iEncodedSize = C1CIS.ADAPTER.encodedSize(c1cis);
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            c1cis.encode(new C1283530jVP(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        MoltenFfiLinkMicSdk.MoltenFfiNativeSetSettingsProviderX8193175361753388272(byteBufferAllocateDirect);
        int i7 = c966020bFI.LIZJ;
        if (i7 == 2) {
            c972580bPs.LJIIJJI = new InterfaceC968360bJ4() { // from class: X.0bIh
                @Override // X.InterfaceC968360bJ4
                public final void LIZ(C966210bFb c966210bFb, LinkMicTaskCallback linkMicTaskCallback) {
                    c966020bFI.LJI(c966210bFb, linkMicTaskCallback, 2);
                }
            };
        } else if (i7 == 4 && c966020bFI.LIZIZ && LinkMicRustJoinChannelBlock.INSTANCE.enable()) {
            c972580bPs.LJIIJJI = new InterfaceC968360bJ4() { // from class: X.0bFU
                @Override // X.InterfaceC968360bJ4
                public final void LIZ(C966210bFb c966210bFb, LinkMicTaskCallback linkMicTaskCallback) {
                    EnumC972970bQV enumC972970bQV = c966210bFb.LIZ;
                    if (enumC972970bQV == EnumC972970bQV.JoinRtcChannel || enumC972970bQV == EnumC972970bQV.PreJoinRtcChannel) {
                        if (C968320bJ0.LIZ.get()) {
                            c966020bFI.LJI(c966210bFb, linkMicTaskCallback, 1);
                            return;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c966210bFb.LIZIZ);
                        linkedHashMap.put("success", "1");
                        linkMicTaskCallback.LIZIZ(linkedHashMap);
                    }
                }
            };
        }
        c972580bPs.LJIIJ = new C972830bQH(new C968170bIl(c966020bFI));
        if (c972580bPs.LIZJ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c972580bPs.LIZLLL == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c972580bPs.LJI == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c972580bPs.LJII == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c972580bPs.LJIIIIZZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c972580bPs.LJIIIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LinkMicConfig linkMicConfig = new LinkMicConfig(c972580bPs.LIZ, c972580bPs.LIZIZ, c972580bPs.LIZJ, c972580bPs.LIZLLL, c972580bPs.LJ, c972580bPs.LJFF, c972580bPs.LJI, c972580bPs.LJII, c972580bPs.LJIIIIZZ, c972580bPs.LJIIIZ, c972580bPs.LJIIJ, c972580bPs.LJIIJJI);
        c966020bFI.LJJIIJZLJL = linkMicConfig;
        long j = c966020bFI.LIZLLL;
        C967790bI9 c967790bI9 = new C967790bI9(c966020bFI, c966020bFI.LJJ, c966020bFI.LJIJ);
        c966020bFI.LJIJJLI = c967790bI9;
        boolean z3 = C1304650k3T.LIZ;
        boolean z4 = !C965700bEm.LIZIZ && C965700bEm.LIZ;
        if (i5 == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkerDelegate[");
            sbLIZ.append(z4);
            sbLIZ.append("] -> unionLinker[");
            sbLIZ.append(z ? "host" : "guest");
            sbLIZ.append(']');
            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "UnionLinker[Biz]");
            C1CIY c1ciy = new C1CIY(Long.valueOf(linkMicConfig.LIZIZ()), Long.valueOf(j), C2231651CWd.LJFF(c967790bI9));
            int iEncodedSize2 = C1CIY.ADAPTER.encodedSize(c1ciy);
            if (iEncodedSize2 > 0) {
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iEncodedSize2);
                c1ciy.encode(new C1283530jVP(byteBufferAllocateDirect2));
                i = 0;
            } else {
                i = 0;
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeCreateUnionLinkerX7882249084914884145 = MoltenFfiLinkMicSdk.MoltenFfiNativeCreateUnionLinkerX7882249084914884145(byteBufferAllocateDirect2);
            try {
                l = C1C31.ADAPTER.decode(byteBufferMoltenFfiNativeCreateUnionLinkerX7882249084914884145 == null ? new ByteArrayInputStream(new byte[i]) : new C19924412xW(byteBufferMoltenFfiNativeCreateUnionLinkerX7882249084914884145)).ret;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                l = C1C31.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeCreateUnionLinkerX7882249084914884145 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeCreateUnionLinkerX7882249084914884145);
            }
            c2234371Ccl = new C2234371Ccl(new LinkMicCrossLinker(new C1283590jVV(l.longValue())), z);
        } else if (i5 != 4) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("linkerDelegate[");
            sbLIZ2.append(z4);
            sbLIZ2.append("] -> crossLinker[");
            sbLIZ2.append(z ? "host" : "guest");
            sbLIZ2.append(']');
            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ2), "CrossLinker[Biz]");
            C1CIY c1ciy2 = new C1CIY(Long.valueOf(linkMicConfig.LIZIZ()), Long.valueOf(j), C2231651CWd.LJFF(c967790bI9));
            int iEncodedSize3 = C1CIY.ADAPTER.encodedSize(c1ciy2);
            if (iEncodedSize3 > 0) {
                byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(iEncodedSize3);
                c1ciy2.encode(new C1283530jVP(byteBufferAllocateDirect4));
                i4 = 0;
            } else {
                i4 = 0;
                byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeCreateCrossLinkerX4666288658257170903 = MoltenFfiLinkMicSdk.MoltenFfiNativeCreateCrossLinkerX4666288658257170903(byteBufferAllocateDirect4);
            try {
                l3 = C1C31.ADAPTER.decode(byteBufferMoltenFfiNativeCreateCrossLinkerX4666288658257170903 == null ? new ByteArrayInputStream(new byte[i4]) : new C19924412xW(byteBufferMoltenFfiNativeCreateCrossLinkerX4666288658257170903)).ret;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                l3 = C1C31.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeCreateCrossLinkerX4666288658257170903 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeCreateCrossLinkerX4666288658257170903);
            }
            c2234371Ccl = new C2234371Ccl(new LinkMicCrossLinker(new C1283590jVV(l3.longValue())), z);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("linkerDelegate[");
            sbLIZ3.append(z4);
            sbLIZ3.append("] -> multiLinker[");
            sbLIZ3.append(z ? "host" : "guest");
            sbLIZ3.append(']');
            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ3), "MultiLinker[Biz]");
            C1CIY c1ciy3 = new C1CIY(Long.valueOf(linkMicConfig.LIZIZ()), Long.valueOf(j), C2231651CWd.LJFF(c967790bI9));
            int iEncodedSize4 = C1CIY.ADAPTER.encodedSize(c1ciy3);
            if (iEncodedSize4 > 0) {
                byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(iEncodedSize4);
                c1ciy3.encode(new C1283530jVP(byteBufferAllocateDirect3));
                i3 = 0;
            } else {
                i3 = 0;
                byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeCreateMultiLinkerX5866490011149426443 = MoltenFfiLinkMicSdk.MoltenFfiNativeCreateMultiLinkerX5866490011149426443(byteBufferAllocateDirect3);
            try {
                l2 = C1C37.ADAPTER.decode(byteBufferMoltenFfiNativeCreateMultiLinkerX5866490011149426443 == null ? new ByteArrayInputStream(new byte[i3]) : new C19924412xW(byteBufferMoltenFfiNativeCreateMultiLinkerX5866490011149426443)).ret;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                l2 = C1C37.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeCreateMultiLinkerX5866490011149426443 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeCreateMultiLinkerX5866490011149426443);
            }
            c2234371Ccl = new C2234651CdD(new LinkMicMultiLinker(new C1283590jVV(l2.longValue())), z);
        }
        C966050bFL c966050bFL = c966020bFI.LJJI;
        LinkMicRtcDispatcher linkMicRtcDispatcherLJLIIL = c2234371Ccl.LJLIIL();
        InterfaceC2181441AZa interfaceC2181441AZa = c966050bFL.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[attach] rtcDispatcher=");
        sbLIZ4.append(linkMicRtcDispatcherLJLIIL);
        C1AZW.LJIIIZ(interfaceC2181441AZa, "RustRtcEngine", C2188811AlT.LIZIZ(sbLIZ4), null, null);
        c966050bFL.LIZIZ = c1276910jKj;
        C1276910jKj c1276910jKj2 = c966050bFL.LIZIZ;
        if (c1276910jKj2 != null) {
            c1276910jKj2.LLJJLIIIJLLLLLLLZ = linkMicRtcDispatcherLJLIIL;
            InterfaceC965990bFF interfaceC965990bFF2 = c1276910jKj2.LLILZ.LJIIZILJ;
            if ((interfaceC965990bFF2 instanceof InterfaceC1279800jPO) && (interfaceC1279800jPO = (InterfaceC1279800jPO) interfaceC965990bFF2) != null) {
                c1276910jKj2.LLJJJ = interfaceC1279800jPO;
            }
        }
        c966020bFI.LJJII = new C967370bHT(c2234371Ccl, new C967460bHc(c966020bFI));
        C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
        boolean z5 = c966020bFI.LIZIZ;
        C965860bF2 c965860bF2 = new C965860bF2(c966020bFI);
        c967770bI7.LIZLLL = c2234371Ccl;
        c967770bI7.LJ = z5;
        c967770bI7.LJFF = c965860bF2;
        C969310bKb.LIZLLL.LIZ(new RunnableC966310bFl(new C966760bGU(c966020bFI)));
        long j2 = 0;
        if (c966020bFI.LIZLLL > 0 && (interfaceC965990bFF = c966020bFI.LJIIZILJ) != null) {
            interfaceC965990bFF.LJLJJLL(c966020bFI.LIZLLL);
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C968330bJ1(c966020bFI));
        if (!c966020bFI.LIZIZ) {
            RoomLinkInfo linkMicInfo = c966020bFI.LIZ.getLinkMicInfo();
            if (linkMicInfo != null && (channelInfo = linkMicInfo.channelInfo) != null) {
                j2 = channelInfo.groupChannelId;
            }
            RoomLinkInfo linkMicInfo2 = c966020bFI.LIZ.getLinkMicInfo();
            if (linkMicInfo2 != null) {
                i2 = linkMicInfo2.linkerMode;
            } else {
                int i8 = C1CX3.LJFF[EnumC2231621CWa.Unknown.ordinal()];
                i2 = 2;
                if (i8 != 1) {
                    if (i8 != 2) {
                        i2 = 3;
                        if (i8 != 3) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 1;
                    }
                }
            }
            c2234371Ccl.LJJLIIIJLLLLLLLZ(j2, i2, EnumC2233251Cax.RoomModel);
        }
        return c2234371Ccl;
    }
}
