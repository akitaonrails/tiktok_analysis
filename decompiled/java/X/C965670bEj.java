package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.dataChannel.RustArchEnableEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkAudienceSeiMissedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestExp24q3OptLayoutSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class C965670bEj implements InterfaceC945140ahc, InterfaceC968120bIg {
    public final Context LIZ;
    public final Room LIZIZ;
    public final LinkCoreService LIZJ;
    public InterfaceC937900aVw LIZLLL;
    public final long LJ;
    public final CopyOnWriteArrayList<InterfaceC954180awC> LJFF = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC968210bIp> LJI = new CopyOnWriteArrayList<>();
    public final C0IXI LJII;

    @Override // X.InterfaceC945140ahc
    public final InterfaceC954180awC LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC945140ahc
    public final void dispose() {
        C1AZW c1azw = C1AZW.LIZ;
        String strLJIIL = LJIIL(298);
        c1azw.getClass();
        C1AZW.LIZ(strLJIIL, "dispose start", null, null);
        LinkCoreService linkCoreService = this.LIZJ;
        linkCoreService.getClass();
        String strLIZJ = linkCoreService.LIZJ(203);
        c1azw.getClass();
        C1AZW.LIZ(strLIZJ, "removeLinkerLiveCycleCallback start", null, null);
        linkCoreService.LLILZLL.remove(this);
        this.LIZJ.LIZLLL();
        C965750bEr c965750bEr = C965750bEr.LIZ;
        String strValueOf = String.valueOf(this.LJ);
        synchronized (c965750bEr) {
            C965750bEr.LIZIZ.remove(strValueOf);
        }
        this.LJFF.clear();
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null) {
            c0ixi.LIZIZ();
        }
    }

    @Override // X.InterfaceC945140ahc
    public final InterfaceC925030aBB ag() {
        return this.LJII;
    }

    public static final String LJIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LINKER.getValue());
        sbLIZ.append("_LinkMicManager_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC945140ahc
    public final void LIZIZ(boolean z) {
        C1AZW c1azw = C1AZW.LIZ;
        String strLJIIL = LJIIL(57);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisableSDK start scene=");
        sbLIZ.append(2);
        sbLIZ.append(" disable=");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLJIIL, strLIZIZ, null, null);
        LinkCoreService linkCoreService = this.LIZJ;
        linkCoreService.LLIZ.put(2, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC968120bIg
    public final void LIZJ(C965710bEn c965710bEn) {
        LinkLayerMessage linkLayerMessage;
        String strLJIIL = LJIIL(382);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkerDestroyed start info=");
        sbLIZ.append(c965710bEn);
        InterfaceC954180awC interfaceC954180awC = null;
        C1AZW.LJIIJ(12, strLJIIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        long j = c965710bEn.LIZ;
        Iterator<InterfaceC954180awC> it2 = this.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC954180awC next = it2.next();
            InterfaceC954180awC interfaceC954180awC2 = next;
            if (Intrinsics.LJFF(interfaceC954180awC2.U3(), String.valueOf(j)) && interfaceC954180awC2.scene() == c965710bEn.LIZIZ) {
                interfaceC954180awC = next;
                break;
            }
        }
        InterfaceC954180awC interfaceC954180awC3 = interfaceC954180awC;
        if (interfaceC954180awC3 != null) {
            if ((interfaceC954180awC3 instanceof C965340bEC) && (linkLayerMessage = c965710bEn.LIZLLL) != null) {
                ((C965340bEC) interfaceC954180awC3).LLJL(linkLayerMessage);
            }
            this.LJFF.remove(interfaceC954180awC3);
            if (!c965710bEn.LJ) {
                interfaceC954180awC3.LJLJI("dispose_on_linker_destroy", EnumC965730bEp.UNKNOWN);
            }
            Iterator<InterfaceC968210bIp> it3 = this.LJI.iterator();
            while (it3.hasNext()) {
                it3.next().LLLLLLLZIL(interfaceC954180awC3);
            }
        }
        if (c965710bEn.LJFF) {
            LJFF(c965710bEn.LIZIZ, String.valueOf(c965710bEn.LIZ));
        }
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null && this.LJFF.isEmpty()) {
            c0ixi.LIZIZ();
        }
    }

    @Override // X.InterfaceC945140ahc
    public final void LJ(InterfaceC968210bIp interfaceC968210bIp) {
        this.LJI.remove(interfaceC968210bIp);
    }

    @Override // X.InterfaceC945140ahc
    public final void LJII(InterfaceC968210bIp interfaceC968210bIp) {
        if (this.LJI.contains(interfaceC968210bIp)) {
            return;
        }
        this.LJI.add(interfaceC968210bIp);
    }

    @Override // X.InterfaceC968120bIg
    public final synchronized void LJIIIIZZ(C965710bEn c965710bEn) {
        String strLJIIL = LJIIL(308);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkerCreated start info=");
        sbLIZ.append(c965710bEn);
        InterfaceC954180awC interfaceC954180awC = null;
        C1AZW.LJIIJ(12, strLJIIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null) {
            c0ixi.LIZJ();
        }
        this.LIZJ.getClass();
        boolean zLIZIZ = LinkCoreService.LIZIZ();
        Iterator<InterfaceC954180awC> it2 = this.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC954180awC next = it2.next();
            InterfaceC954180awC interfaceC954180awC2 = next;
            if ((interfaceC954180awC2 instanceof C965340bEC) && ((C965340bEC) interfaceC954180awC2).LIZIZ == c965710bEn.LIZIZ && Intrinsics.LJFF(((C965340bEC) interfaceC954180awC2).U3(), String.valueOf(c965710bEn.LIZ))) {
                interfaceC954180awC = next;
                break;
            }
        }
        InterfaceC954180awC interfaceC954180awC3 = interfaceC954180awC;
        if (interfaceC954180awC3 == null) {
            if (zLIZIZ) {
                LJIIJJI(c965710bEn);
            }
        } else if (c965710bEn.LIZIZ != 2) {
            C500260Jjc.LJJLIIIJILLIZJL(new C965720bEo(this, interfaceC954180awC3, zLIZIZ, c965710bEn));
        }
    }

    public final synchronized C965340bEC LJIIJJI(C965710bEn c965710bEn) {
        C965340bEC c965340bEC;
        int value;
        InterfaceC937900aVw interfaceC937900aVw;
        Context context = this.LIZ;
        int i = c965710bEn.LIZIZ;
        if (i != 2) {
            if (i != 4) {
                value = -1;
            } else {
                MultiGuestExp24q3OptLayoutSetting multiGuestExp24q3OptLayoutSetting = MultiGuestExp24q3OptLayoutSetting.INSTANCE;
                if (multiGuestExp24q3OptLayoutSetting.getValue() > 0) {
                    value = multiGuestExp24q3OptLayoutSetting.getValue();
                } else {
                    LiveSdkMultiguestExpandGuestCountVersionV2Setting liveSdkMultiguestExpandGuestCountVersionV2Setting = LiveSdkMultiguestExpandGuestCountVersionV2Setting.INSTANCE;
                    if (liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue() >= 4) {
                        value = liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue();
                    } else {
                        value = LiveSdkMultiguestExpandGuestCountVersionSetting.INSTANCE.getValue();
                    }
                }
            }
        } else {
            value = 1;
        }
        Room room = this.LIZIZ;
        boolean z = this.LIZJ.LLILLL;
        long j = c965710bEn.LIZ;
        if (z && c965710bEn.LIZIZ == 4) {
            interfaceC937900aVw = this.LIZLLL;
        } else {
            interfaceC937900aVw = null;
        }
        c965340bEC = new C965340bEC(context, i, value, room, z, j, this, interfaceC937900aVw);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("obtainRustSession[");
        sbLIZ.append(c965710bEn.LIZIZ);
        sbLIZ.append("] channelId: ");
        sbLIZ.append(c965710bEn.LIZ);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "LinkMicManager");
        this.LIZLLL = null;
        C500260Jjc.LJJLIIIJILLIZJL(new C965690bEl(this, c965340bEC, c965710bEn));
        return c965340bEC;
    }

    @Override // X.InterfaceC945140ahc
    public final boolean LIZ(int i, String str) {
        for (InterfaceC954180awC interfaceC954180awC : this.LJFF) {
            InterfaceC954180awC interfaceC954180awC2 = interfaceC954180awC;
            if (interfaceC954180awC2 instanceof C965340bEC) {
                C965340bEC c965340bEC = (C965340bEC) interfaceC954180awC2;
                if (c965340bEC.LIZIZ == i && (i == 2 || str == null || Intrinsics.LJFF(str, c965340bEC.U3()))) {
                    if (interfaceC954180awC != null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC945140ahc
    public final synchronized InterfaceC954180awC LJFF(int i, String str) {
        C0IXI c0ixi;
        String strLJIIL = LJIIL(75);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("obtainSession start scene=");
        sbLIZ.append(i);
        sbLIZ.append(" channelId=");
        sbLIZ.append(str);
        sbLIZ.append(" liveType=");
        sbLIZ.append(C354201Zc.LIZ(this.LIZIZ.getStreamType()));
        C1AZW.LJIIJ(12, strLJIIL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (str != null && str.length() != 0 && (c0ixi = this.LJII) != null) {
            c0ixi.LIZJ();
        }
        return LJIILIIL(i, str);
    }

    @Override // X.InterfaceC945140ahc
    public final void LJIIJ(C945320ahu c945320ahu, AwS381S0200000_15 awS381S0200000_15) {
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null) {
            c0ixi.LIZ(c945320ahu);
        }
        if (c945320ahu != null && c945320ahu.LIZIZ != null) {
            String str = c945320ahu.LIZIZ;
            if (str != null && a0.LJJJ(str, "ByteVC", 0, false, 6) == -1) {
                SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                awS381S0200000_15.invoke(seiAppDataLJII);
                if (seiAppDataLJII != null) {
                    for (InterfaceC954180awC interfaceC954180awC : this.LJFF) {
                        SeiDsl seiDsl = seiAppDataLJII.dsl;
                        if (seiDsl != null && interfaceC954180awC.scene() == seiDsl.scene && Intrinsics.LJFF(interfaceC954180awC.U3(), seiAppDataLJII.channelId)) {
                            C500260Jjc.LJJLIIIJILLIZJL(new C967580bHo(interfaceC954180awC, c945320ahu, seiAppDataLJII));
                        } else {
                            C500260Jjc.LJJLIIIJILLIZJL(new C967700bI0(interfaceC954180awC, c945320ahu));
                        }
                    }
                    return;
                }
                Iterator<InterfaceC954180awC> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C967710bI1(it2.next(), c945320ahu));
                }
                return;
            }
            return;
        }
        awS381S0200000_15.invoke(null);
        Iterator<InterfaceC954180awC> it3 = this.LJFF.iterator();
        while (it3.hasNext()) {
            C500260Jjc.LJJLIIIJILLIZJL(new C967720bI2(it3.next()));
        }
    }

    public final InterfaceC954180awC LJIILIIL(int i, String str) {
        long jLongValue;
        Long lLJIILIIL;
        this.LIZJ.getClass();
        InterfaceC954180awC interfaceC954180awC = null;
        if (!LinkCoreService.LIZIZ()) {
            return null;
        }
        for (InterfaceC954180awC interfaceC954180awC2 : this.LJFF) {
            InterfaceC954180awC interfaceC954180awC3 = interfaceC954180awC2;
            if (interfaceC954180awC3 instanceof C965340bEC) {
                C965340bEC c965340bEC = (C965340bEC) interfaceC954180awC3;
                if (c965340bEC.LIZIZ == i && (i == 2 || str == null || Intrinsics.LJFF(str, c965340bEC.U3()))) {
                    interfaceC954180awC = interfaceC954180awC2;
                    break;
                }
            }
        }
        InterfaceC954180awC interfaceC954180awCLJIIJJI = interfaceC954180awC;
        if (interfaceC954180awCLJIIJJI == null) {
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = -1;
            }
            interfaceC954180awCLJIIJJI = LJIIJJI(new C965710bEn(jLongValue, i, this.LIZIZ, null, false, false, 56));
            if (C952600ate.LIZ) {
                DataChannelGlobal.LLILZ.FQ2(RustArchEnableEvent.class, new Pair(Integer.valueOf(i), Boolean.TRUE));
            }
        }
        return interfaceC954180awCLJIIJJI;
    }

    @Override // X.InterfaceC945140ahc
    public final void LIZLLL(C945320ahu c945320ahu, Function1<? super SeiAppData, Unit> function1, Function2<? super String, ? super C945320ahu, Unit> function2) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("LinkMicManager", "MtCoHostCrossRoomPushSDKSetting true");
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null) {
            c0ixi.LIZ(c945320ahu);
        }
        for (InterfaceC954180awC interfaceC954180awC : this.LJFF) {
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkMicManager#onReceivedSeiNew ");
            sbLIZ.append(interfaceC954180awC.scene());
            sbLIZ.append(' ');
            sbLIZ.append(interfaceC954180awC.U3());
            sbLIZ.append(' ');
            sbLIZ.append(interfaceC954180awC.hashCode());
            interfaceC937900aVwLLIIJLIL.LLFZ(500, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c945320ahu != null && c945320ahu.LIZIZ != null) {
            String str = c945320ahu.LIZIZ;
            if (str != null && a0.LJJJ(str, "ByteVC", 0, false, 6) == -1) {
                SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                if (seiAppDataLJII != null) {
                    function1.invoke(seiAppDataLJII);
                    for (InterfaceC954180awC interfaceC954180awC2 : this.LJFF) {
                        SeiDsl seiDsl = seiAppDataLJII.dsl;
                        if (seiDsl != null && interfaceC954180awC2.scene() == seiDsl.scene && Intrinsics.LJFF(interfaceC954180awC2.U3(), seiAppDataLJII.channelId)) {
                            C500260Jjc.LJJLIIIJILLIZJL(new C966630bGH(interfaceC954180awC2, c945320ahu, seiAppDataLJII));
                        } else {
                            C500260Jjc.LJJLIIIJILLIZJL(new C966790bGX(interfaceC954180awC2, c945320ahu));
                        }
                    }
                    return;
                }
                Iterator<InterfaceC954180awC> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C966800bGY(it2.next(), c945320ahu));
                }
                String str2 = c945320ahu.LIZIZ;
                if (str2 != null && !a0.LJJIIZI(str2, "ktv_sei", false) && function2 != null) {
                    function2.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz", c945320ahu);
                    return;
                }
                return;
            }
            return;
        }
        Iterator<InterfaceC954180awC> it3 = this.LJFF.iterator();
        while (it3.hasNext()) {
            C500260Jjc.LJJLIIIJILLIZJL(new C966810bGZ(it3.next()));
        }
    }

    @Override // X.InterfaceC945140ahc
    public final void LJI(C945320ahu c945320ahu, AwS594S0100000_15 awS594S0100000_15, AwS381S0200000_15 awS381S0200000_15) {
        InterfaceC954180awC next;
        C0IXI c0ixi = this.LJII;
        if (c0ixi != null) {
            c0ixi.LIZ(c945320ahu);
        }
        if (c945320ahu == null) {
            return;
        }
        VoiceChatSeiAppData voiceChatSeiAppData = (VoiceChatSeiAppData) C969340bKe.LJIIIIZZ(VoiceChatSeiAppData.class, c945320ahu.LIZIZ);
        if (voiceChatSeiAppData != null) {
            awS594S0100000_15.invoke(voiceChatSeiAppData);
            Iterator<InterfaceC954180awC> it2 = this.LJFF.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                InterfaceC954180awC interfaceC954180awC = next;
                SeiDsl seiDsl = voiceChatSeiAppData.dsl;
                if (seiDsl != null && interfaceC954180awC.scene() == seiDsl.scene && Intrinsics.LJFF(interfaceC954180awC.U3(), voiceChatSeiAppData.channelId)) {
                    break;
                }
            }
            InterfaceC954180awC interfaceC954180awC2 = next;
            if (interfaceC954180awC2 != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C967590bHp(interfaceC954180awC2, c945320ahu, voiceChatSeiAppData));
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        awS381S0200000_15.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz");
    }

    public C965670bEj(Context context, Room room, LinkCoreService linkCoreService, InterfaceC937900aVw interfaceC937900aVw) {
        this.LIZ = context;
        this.LIZIZ = room;
        this.LIZJ = linkCoreService;
        this.LIZLLL = interfaceC937900aVw;
        this.LJ = room.getId();
        linkCoreService.LLILZLL.add(this);
        if (!linkCoreService.LLILLL && MultiGuestSdkAudienceSeiMissedSetting.INSTANCE.enable()) {
            this.LJII = new C0IXI(room);
        }
    }
}
