package X;

import android.content.Context;
import android.util.ArrayMap;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.LinkMicDropSeiForCode2;
import com.bytedance.android.livesdk.dataChannel.RustArchEnableEvent;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.SeiEmptyRegion;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965660bEi implements InterfaceC945140ahc, InterfaceC966770bGV {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Context LIZ;
    public final Room LIZIZ;
    public final LinkCoreService LIZJ;
    public final DataChannel LIZLLL;
    public InterfaceC937900aVw LJ;
    public final long LJFF;
    public C965340bEC LJI;
    public C951280arW LJII;
    public long LJIIIIZZ;

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final boolean LIZ(int i, String str) {
        return true;
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LJ(InterfaceC968210bIp interfaceC968210bIp) {
    }

    @Override // X.InterfaceC945140ahc
    public final InterfaceC954180awC LJFF(int i, String str) {
        return null;
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LJII(InterfaceC968210bIp interfaceC968210bIp) {
    }

    @Override // X.InterfaceC945140ahc
    public final synchronized InterfaceC954180awC LJIIIZ() {
        C965340bEC c965340bEC;
        String strLJIIL = LJIIL(123);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("obtainSession start, roomId=");
        sbLIZ.append(this.LJFF);
        c965340bEC = null;
        C1AZW.LJIIJ(12, strLJIIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C965340bEC c965340bECLJIIJJI = this.LJI;
        if (c965340bECLJIIJJI != null) {
            c965340bEC = c965340bECLJIIJJI;
        } else {
            c965340bECLJIIJJI = LJIIJJI();
            if (c965340bECLJIIJJI != null) {
                String strLJIIL2 = LJIIL(123);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("obtainSession, create end, session:");
                sbLIZ2.append(c965340bECLJIIJJI.hashCode());
                C1AZW.LJIIJ(12, strLJIIL2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                boolean z = this.LIZJ.LLILLL;
                C951280arW c951280arW = new C951280arW(String.valueOf(this.LIZIZ.getId()));
                Context context = this.LIZ;
                DataChannel dataChannel = this.LIZLLL;
                if (context == null || dataChannel == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("obtainSession, can't not init layout layer, context:");
                    sbLIZ3.append(context != null ? context.hashCode() : 0);
                    sbLIZ3.append(" dataChannel:");
                    sbLIZ3.append(dataChannel != null ? dataChannel.hashCode() : 0);
                    C20441214yg.LJ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    c951280arW.LIZ(context, dataChannel, c965340bECLJIIJJI.LLJLILLLLZIIL(), z);
                }
                this.LJII = c951280arW;
                if (!z) {
                    C20441214yg.LJIIIZ("LinkMicManagerV2", "addPlayerEventListener");
                    C965680bEk.LIZIZ.getValue().LIZ(this);
                }
                if (C952600ate.LIZ) {
                    DataChannelGlobal.LLILZ.FQ2(RustArchEnableEvent.class, new Pair(0, Boolean.TRUE));
                }
                c965340bEC = c965340bECLJIIJJI;
            }
        }
        return c965340bEC;
    }

    public final synchronized C965340bEC LJIIJJI() {
        long jLongValue;
        int i;
        MultiLiveUserSettings multiLiveUserSettings;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        ArrayMap<Integer, Long> arrayMap2;
        C20441214yg.LJIIIZ(LJIIL(482), "createUnionSession start");
        Context context = this.LIZ;
        boolean z = this.LIZJ.LLILLL;
        RoomLinkInfo linkMicInfo = this.LIZIZ.getLinkMicInfo();
        if (linkMicInfo != null) {
            jLongValue = linkMicInfo.linkmicUnifyChannelId;
        } else {
            C20441214yg.LJ("LinkMicManagerV2", "createUnionSession linkMicInfo is null");
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            MultiLiveUserSettings multiLiveUserSettings2 = this.LIZIZ.multiLiveUserSettings;
            jLongValue = ((multiLiveUserSettings2 == null || (arrayMap2 = multiLiveUserSettings2.channelMap) == null || (l = arrayMap2.get(4)) == null) && ((multiLiveUserSettings = this.LIZIZ.multiLiveUserSettings) == null || (arrayMap = multiLiveUserSettings.channelMap) == null || (l = arrayMap.get(2)) == null)) ? 0L : l.longValue();
        }
        if (context == null) {
            String strLJIIL = LJIIL(513);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createUnionSession end, session: ");
            C965340bEC c965340bEC = this.LJI;
            sbLIZ.append(c965340bEC != null ? Integer.valueOf(c965340bEC.hashCode()) : null);
            sbLIZ.append(", channelId: ");
            sbLIZ.append(jLongValue);
            sbLIZ.append(", context: ");
            sbLIZ.append((Object) null);
            C20441214yg.LJIIIZ(strLJIIL, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (!z && jLongValue == 0) {
            String strLJIIL2 = LJIIL(513);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createUnionSession end, session: ");
            C965340bEC c965340bEC2 = this.LJI;
            sbLIZ2.append(c965340bEC2 != null ? Integer.valueOf(c965340bEC2.hashCode()) : null);
            sbLIZ2.append(", channelId: ");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", context: ");
            sbLIZ2.append(Integer.valueOf(context.hashCode()));
            C20441214yg.LJIIIZ(strLJIIL2, C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        try {
        } catch (Throwable th) {
            th = th;
            i = 513;
        }
        try {
            C965340bEC c965340bEC3 = new C965340bEC(context, 0, -1, this.LIZIZ, z, z ? 0L : jLongValue, null, z ? this.LJ : null);
            this.LJ = null;
            this.LJI = c965340bEC3;
            String strLJIIL3 = LJIIL(513);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createUnionSession end, session: ");
            C965340bEC c965340bEC4 = this.LJI;
            sbLIZ3.append(c965340bEC4 != null ? Integer.valueOf(c965340bEC4.hashCode()) : null);
            sbLIZ3.append(", channelId: ");
            sbLIZ3.append(jLongValue);
            sbLIZ3.append(", context: ");
            sbLIZ3.append(Integer.valueOf(context.hashCode()));
            C20441214yg.LJIIIZ(strLJIIL3, C2188811AlT.LIZIZ(sbLIZ3));
            return c965340bEC3;
        } catch (Throwable th2) {
            th = th2;
            i = 513;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            String strLJIIL4 = LJIIL(i);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("createUnionSession end, session: ");
            C965340bEC c965340bEC5 = this.LJI;
            sbLIZ4.append(c965340bEC5 != null ? Integer.valueOf(c965340bEC5.hashCode()) : null);
            sbLIZ4.append(", channelId: ");
            sbLIZ4.append(jLongValue);
            sbLIZ4.append(", context: ");
            sbLIZ4.append(Integer.valueOf(context.hashCode()));
            C20441214yg.LJIIIZ(strLJIIL4, C2188811AlT.LIZIZ(sbLIZ4));
            throw th;
        }
    }

    @Override // X.InterfaceC945140ahc
    public final InterfaceC925030aBB ag() {
        return null;
    }

    @Override // X.InterfaceC945140ahc
    public final void dispose() {
        C1AZW c1azw = C1AZW.LIZ;
        String strLJIIL = LJIIL(298);
        c1azw.getClass();
        C1AZW.LIZ(strLJIIL, "dispose start", null, null);
        this.LIZJ.LIZLLL();
        C965750bEr c965750bEr = C965750bEr.LIZ;
        String strValueOf = String.valueOf(this.LJFF);
        synchronized (c965750bEr) {
            C965750bEr.LIZIZ.remove(strValueOf);
        }
        C951280arW c951280arW = this.LJII;
        if (c951280arW != null) {
            FrameLayout frameLayout = c951280arW.LIZIZ;
            if (frameLayout != null) {
                InterfaceC2181771Aa7 interfaceC2181771Aa7 = c951280arW.LIZJ;
                if (interfaceC2181771Aa7 != null) {
                    EnumC965630bEf enumC965630bEf = EnumC965630bEf.DROP;
                    C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                    interfaceC2181771Aa7.LJLLLL(enumC965630bEf, C973010bQZ.LJFF("launcher destroy"));
                }
                C500260Jjc.LJJJLL(frameLayout);
                c951280arW.LIZIZ = null;
            }
            C951280arW.LIZLLL = null;
            this.LJII = null;
        }
        C965680bEk value = C965680bEk.LIZIZ.getValue();
        value.LIZ.remove(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removePlayerEventListener, listener=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", size=");
        sbLIZ.append(value.LIZ.size());
        C20441214yg.LIZIZ("LinkMicStreamPlayerEventDispatcher", C2188811AlT.LIZIZ(sbLIZ));
        C965340bEC c965340bEC = this.LJI;
        if (c965340bEC != null) {
            c965340bEC.LLJLIL(c965340bEC.LJIILIIL());
        }
        this.LJI = null;
        this.LIZ = null;
    }

    public static final String LJIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LINKER.getValue());
        sbLIZ.append("_LinkMicManagerV2_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIIZZ(C945320ahu c945320ahu, SeiAppData seiAppData) {
        Long l;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        Integer numValueOf3;
        Integer numValueOf4;
        String str2;
        String str3;
        LiveSeiStruct liveSeiStruct;
        SeiContainerInfo seiContainerInfo = seiAppData.linkMicContainer;
        StringBuilder sb = new StringBuilder("ts=");
        Integer numValueOf5 = null;
        if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null) {
            l = liveSeiStruct.ts;
        } else {
            l = null;
        }
        sb.append(l);
        sb.append(", hash=");
        if (c945320ahu != null && (str3 = c945320ahu.LIZIZ) != null) {
            numValueOf = Integer.valueOf(str3.hashCode());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(", raw_len=");
        if (c945320ahu != null && (str2 = c945320ahu.LIZIZ) != null) {
            numValueOf2 = Integer.valueOf(str2.length());
        } else {
            numValueOf2 = null;
        }
        sb.append(numValueOf2);
        sb.append(", channel=");
        sb.append(seiAppData.channelId);
        sb.append(", group_channel=");
        sb.append(seiAppData.groupChannelId);
        sb.append(", layout_key=");
        if (seiContainerInfo != null) {
            str = seiContainerInfo.layoutKey;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", dsl_ver=");
        if (seiContainerInfo != null) {
            numValueOf3 = Integer.valueOf(seiContainerInfo.dslVersion);
        } else {
            numValueOf3 = null;
        }
        sb.append(numValueOf3);
        sb.append(", scene_from_dsl=");
        sb.append(Integer.valueOf(seiAppData.LJIIJ()));
        sb.append(", linker_arch=");
        sb.append(Integer.valueOf(seiAppData.linkerArchType));
        sb.append(", is_union=");
        sb.append(Boolean.valueOf(seiAppData.LJIJ()));
        sb.append(", grids=");
        List<SeiRegion> list = seiAppData.grids;
        if (list != null) {
            numValueOf4 = Integer.valueOf(list.size());
        } else {
            numValueOf4 = null;
        }
        sb.append(numValueOf4);
        sb.append(", empty_grids=");
        List<SeiEmptyRegion> list2 = seiAppData.emptyGrids;
        if (list2 != null) {
            numValueOf5 = Integer.valueOf(list2.size());
        }
        sb.append(numValueOf5);
        return sb.toString();
    }

    @Override // X.InterfaceC966770bGV
    public final void LIZJ(C945320ahu c945320ahu, Function2<? super C945320ahu, ? super InterfaceC940430aa1, Unit> function2) {
        String str;
        Integer numValueOf;
        Pair pair;
        Long l;
        Integer numValueOf2 = null;
        if (c945320ahu != null) {
            str = c945320ahu.LIZIZ;
        } else {
            str = null;
        }
        boolean z = false;
        long jLongValue = 0;
        if (str != null) {
            String str2 = c945320ahu.LIZIZ;
            if (str2 != null && a0.LJJJ(str2, "ByteVC", 0, false, 6) == -1) {
                SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                if (seiAppDataLJII != null) {
                    LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
                    if (liveSeiStruct != null && (l = liveSeiStruct.ts) != null) {
                        jLongValue = l.longValue();
                    }
                    this.LJIIIIZZ = jLongValue;
                    if (function2 != null) {
                        function2.invoke(c945320ahu, seiAppDataLJII);
                    }
                    C965340bEC c965340bEC = this.LJI;
                    if (c965340bEC != null) {
                        String strLJIIIIZZ = LJIIIIZZ(c945320ahu, seiAppDataLJII);
                        if (c965340bEC.LLJLLL()) {
                            pair = new Pair(Boolean.TRUE, 1);
                        } else {
                            int i = seiAppDataLJII.linkerMode;
                            if (i != 0 && (i != 1 ? (i == 2 || i == 3) && seiAppDataLJII.linkerArchType == C1AZU.Cross.intoInt() : seiAppDataLJII.linkerArchType == C1AZU.Inner.intoInt())) {
                                pair = new Pair(Boolean.valueOf(LinkMicDropSeiForCode2.INSTANCE.isEnable()), 2);
                            } else {
                                pair = new Pair(Boolean.FALSE, 0);
                            }
                        }
                        if (((Boolean) pair.getFirst()).booleanValue()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onSeiUpdate, ignore, code=");
                            sbLIZ.append(((Number) pair.getSecond()).intValue());
                            sbLIZ.append(", session_channel=");
                            sbLIZ.append(c965340bEC.U3());
                            sbLIZ.append(", ");
                            sbLIZ.append(strLJIIIIZZ);
                            C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        if (Intrinsics.LJFF(c965340bEC.U3(), seiAppDataLJII.channelId)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onSeiUpdate, dispatch to session, session_channel=");
                            sbLIZ2.append(c965340bEC.U3());
                            sbLIZ2.append(", ");
                            sbLIZ2.append(strLJIIIIZZ);
                            C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
                            C500260Jjc.LJJLIIIJILLIZJL(new C966640bGI(c965340bEC, c945320ahu, seiAppDataLJII));
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onSeiUpdate, channelId not match, session_channel=");
                        sbLIZ3.append(c965340bEC.U3());
                        sbLIZ3.append(", ");
                        sbLIZ3.append(strLJIIIIZZ);
                        C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ3));
                        C500260Jjc.LJJLIIIJILLIZJL(new C966820bGa(c965340bEC, c945320ahu));
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onSeiUpdate, session is null, ");
                    sbLIZ4.append(LJIIIIZZ(c945320ahu, seiAppDataLJII));
                    C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                if (this.LJIIIIZZ > 0) {
                    this.LJIIIIZZ = 0L;
                }
                C965340bEC c965340bEC2 = this.LJI;
                if (c965340bEC2 != null) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C966830bGb(c965340bEC2, c945320ahu));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onSeiUpdate, ignore ByteVC sei, hash:");
            String str3 = c945320ahu.LIZIZ;
            if (str3 != null) {
                numValueOf = Integer.valueOf(str3.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ5.append(numValueOf);
            sbLIZ5.append(", raw_len:");
            String str4 = c945320ahu.LIZIZ;
            if (str4 != null) {
                numValueOf2 = Integer.valueOf(str4.length());
            }
            sbLIZ5.append(numValueOf2);
            C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        if (this.LJIIIIZZ > 0) {
            this.LJIIIIZZ = 0L;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("onSeiUpdate, sei origin is null, has_session:");
        if (this.LJI != null) {
            z = true;
        }
        sbLIZ6.append(z);
        C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ6));
        C965340bEC c965340bEC3 = this.LJI;
        if (c965340bEC3 != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C966840bGc(c965340bEC3));
        }
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LJIIJ(C945320ahu c945320ahu, AwS381S0200000_15 awS381S0200000_15) {
        if (c945320ahu != null && c945320ahu.LIZIZ != null) {
            String str = c945320ahu.LIZIZ;
            if (str != null && a0.LJJJ(str, "ByteVC", 0, false, 6) == -1) {
                awS381S0200000_15.invoke(C969340bKe.LJII(c945320ahu));
                return;
            }
            return;
        }
        awS381S0200000_15.invoke(null);
    }

    @Override // X.InterfaceC966770bGV
    public final void onVideoSizeChanged(int i, int i2) {
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoSizeChanged, width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LinkMicManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        C965340bEC c965340bEC = this.LJI;
        if (c965340bEC != null) {
            interfaceC964790bDJLLJLILLLLZIIL = c965340bEC.LLJLILLLLZIIL();
        } else {
            interfaceC964790bDJLLJLILLLLZIIL = null;
        }
        if (interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC2181771Aa7) {
            InterfaceC2181771Aa7 interfaceC2181771Aa7 = (InterfaceC2181771Aa7) interfaceC964790bDJLLJLILLLLZIIL;
            InterfaceC2181941AaO interfaceC2181941AaOLJLIL = interfaceC2181771Aa7.LJLIL();
            if (interfaceC2181941AaOLJLIL != null) {
                interfaceC2181941AaOLJLIL.LIZIZ(i, i2);
            }
            interfaceC2181771Aa7.LLFF(i, i2);
        }
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LIZLLL(C945320ahu c945320ahu, Function1<? super SeiAppData, Unit> function1, Function2<? super String, ? super C945320ahu, Unit> function2) {
        String str;
        if (c945320ahu != null && c945320ahu.LIZIZ != null && (str = c945320ahu.LIZIZ) != null && a0.LJJJ(str, "ByteVC", 0, false, 6) == -1) {
            SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
            if (seiAppDataLJII != null) {
                function1.invoke(seiAppDataLJII);
                return;
            }
            String str2 = c945320ahu.LIZIZ;
            if (str2 == null || a0.LJJIIZI(str2, "ktv_sei", false) || function2 == null) {
                return;
            }
            function2.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz", c945320ahu);
        }
    }

    @Override // X.InterfaceC945140ahc
    @InterfaceC1294060jmO
    public final void LJI(C945320ahu c945320ahu, AwS594S0100000_15 awS594S0100000_15, AwS381S0200000_15 awS381S0200000_15) {
        if (c945320ahu == null) {
            return;
        }
        Object objLJIIIIZZ = C969340bKe.LJIIIIZZ(VoiceChatSeiAppData.class, c945320ahu.LIZIZ);
        if (objLJIIIIZZ != null) {
            awS594S0100000_15.invoke(objLJIIIIZZ);
            if (Unit.LIZ != null) {
                return;
            }
        }
        awS381S0200000_15.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz");
    }

    public C965660bEi(Context context, Room room, LinkCoreService linkCoreService, DataChannel dataChannel, InterfaceC937900aVw interfaceC937900aVw) {
        this.LIZ = context;
        this.LIZIZ = room;
        this.LIZJ = linkCoreService;
        this.LIZLLL = dataChannel;
        this.LJ = interfaceC937900aVw;
        this.LJFF = room.getId();
    }
}
