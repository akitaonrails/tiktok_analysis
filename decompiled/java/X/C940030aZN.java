package X;

import Y.AObjectS390S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestFeedPreviewOptSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiInfos;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdk.sei.VoiceChatSeiRegion;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940030aZN implements InterfaceC2175461ACa {
    public C940490aa7 LL;
    public C945320ahu LLILLJJLI;
    public InterfaceC958990b3x LLILZ;
    public InterfaceC940230aZh LLILZIL;
    public InterfaceC940300aZo LLILZLL;
    public SeiAppData LLJ;
    public boolean LLJI;
    public FrameLayout LLJIJIL;
    public Object LLJILJIL;
    public InterfaceC464060IHs LLJILJILJ;
    public ViewGroup.LayoutParams LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(389));
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1032));

    @Override // X.InterfaceC2175461ACa
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.InterfaceC2175461ACa
    public final Pair<Rect, Bitmap> LJJIJIL() {
        return null;
    }

    public final C940020aZM LIZ() {
        return (C940020aZM) this.LLILLL.getValue();
    }

    public final boolean LIZIZ() {
        InterfaceC940230aZh interfaceC940230aZh;
        return LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable() ? this.LLIZ.get() && this.LLIZLLLIL.get() && (interfaceC940230aZh = this.LLILZIL) != null && interfaceC940230aZh.LJFF() : this.LLIZ.get() && this.LLIZLLLIL.get();
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJII() {
        C945320ahu c945320ahu = this.LLILLJJLI;
        if (c945320ahu != null) {
            this.LLILLJJLI = null;
            LIZJ(c945320ahu);
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final boolean LJIJJLI() {
        C940490aa7 c940490aa7 = this.LL;
        return C917280Zyg.LIZ(C940890aal.LIZ, c940490aa7 != null ? c940490aa7.LJIIIIZZ : 0, Integer.valueOf(C940890aal.LIZIZ)) == EnumC918830a1B.CAN_APPLY;
    }

    @Override // X.InterfaceC2175461ACa
    public final boolean LJJIII() {
        SeiAppData seiAppData = this.LLJ;
        return C500260Jjc.LJJJI(seiAppData != null ? Boolean.valueOf(seiAppData.LJIILLIIL()) : null);
    }

    @Override // X.InterfaceC2175461ACa
    public final C942150acn LJIJ() {
        C935650aSJ state;
        C940020aZM c940020aZMLIZ = LIZ();
        SeiAppData seiAppData = c940020aZMLIZ.LLJJJJLIIL;
        String str = null;
        if (seiAppData == null) {
            seiAppData = null;
        }
        if (seiAppData == null) {
            C937310aUz.LJII("feed_new_layout", "getPreviewLayoutSnapshot return null as seiAppData is null");
            return null;
        }
        if (seiAppData.linkMicContainer == null) {
            C937310aUz.LJII("feed_new_layout", "getPreviewLayoutSnapshot return null as linkMicContainer is null");
            return null;
        }
        EnumC939140aXw enumC939140aXw = EnumC939140aXw.NEW_LAYOUT;
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = c940020aZMLIZ.LLIZ;
        if (multiGuestSharedBgGuestViewModel != null && (state = multiGuestSharedBgGuestViewModel.getState()) != null) {
            str = state.LLILZ;
        }
        return new C942150acn(enumC939140aXw, str);
    }

    @Override // X.InterfaceC2175461ACa
    public final int LJJII() {
        List<C957030b0n> listLJLLJ;
        InterfaceC940060aZQ interfaceC940060aZQ = LIZ().LLJJJJJIL;
        int i = 0;
        if (interfaceC940060aZQ != null && (listLJLLJ = interfaceC940060aZQ.LJLLJ()) != null && !listLJLLJ.isEmpty()) {
            Iterator<C957030b0n> it2 = listLJLLJ.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().LIZIZ != null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIJ() {
        InterfaceC964790bDJ interfaceC964790bDJ;
        C940020aZM c940020aZMLIZ = LIZ();
        if (c940020aZMLIZ == null || (interfaceC964790bDJ = c940020aZMLIZ.LLJJJJ) == null) {
            return;
        }
        interfaceC964790bDJ.LJJLIIIJJI();
    }

    @Override // X.InterfaceC2175461ACa
    public final int LJJIJLIJ() {
        List<C957030b0n> listLJLLJ;
        InterfaceC940060aZQ interfaceC940060aZQ = LIZ().LLJJJJJIL;
        if (interfaceC940060aZQ == null || (listLJLLJ = interfaceC940060aZQ.LJLLJ()) == null) {
            return 0;
        }
        return listLJLLJ.size();
    }

    @Override // X.InterfaceC2175461ACa
    public final C940490aa7 LJJIJIIJIL() {
        return this.LL;
    }

    public final void LIZJ(C945320ahu c945320ahu) {
        boolean z;
        int length;
        boolean z2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        LiveSeiStruct liveSeiStruct;
        VoiceChatSeiAppData voiceChatSeiAppData;
        List<VoiceChatSeiRegion> list;
        boolean z3;
        LiveSeiStruct liveSeiStruct2;
        SeiAppData seiAppData;
        List<SeiRegion> list2;
        LiveSeiStruct liveSeiStruct3;
        SeiAppData seiAppData2;
        List<SeiRegion> list3;
        LiveSeiStruct liveSeiStruct4;
        LinkMicSei linkMicSei;
        List<SeiInfos> list4;
        int iIntValue;
        boolean z4;
        boolean z5;
        LiveSeiStruct liveSeiStruct5;
        LinkMicSei linkMicSei2;
        List<SeiInfos> list5;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleSei seiNull=");
        if (c945320ahu == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" originLength=");
        if (c945320ahu != null && (str = c945320ahu.LIZIZ) != null) {
            length = str.length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append(" hasSeiStruct=");
        ArrayList arrayList = null;
        if (c945320ahu != null && c945320ahu.LIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        C940020aZM c940020aZMLIZ = LIZ();
        c940020aZMLIZ.getClass();
        if (c945320ahu != null && (liveSeiStruct5 = c945320ahu.LIZ) != null && (linkMicSei2 = liveSeiStruct5.LIZJ) != null && (list5 = linkMicSei2.infos) != null) {
            boolValueOf = Boolean.valueOf(!list5.isEmpty());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c945320ahu != null && (liveSeiStruct4 = c945320ahu.LIZ) != null && (linkMicSei = liveSeiStruct4.LIZJ) != null && (list4 = linkMicSei.infos) != null) {
                for (SeiInfos seiInfos : list4) {
                    Integer num = seiInfos.vol;
                    if (num != null && num.intValue() == 0) {
                        if (linkedHashMap.get(seiInfos.linkMicId) == null) {
                            String str2 = seiInfos.linkMicId;
                            if (str2 == null) {
                                str2 = "";
                            }
                            Integer num2 = seiInfos.talk;
                            if (num2 != null && num2.intValue() > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            linkedHashMap.put(str2, new Pair(0, Boolean.valueOf(z5)));
                        }
                    } else {
                        String str3 = seiInfos.linkMicId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Integer num3 = seiInfos.vol;
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer num4 = seiInfos.talk;
                        if (num4 != null && num4.intValue() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        linkedHashMap.put(str3, new Pair(numValueOf, Boolean.valueOf(z4)));
                    }
                }
            }
            arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new InteractAudioVolumeInfo((String) entry.getKey(), ((Boolean) ((Pair) entry.getValue()).getSecond()).booleanValue(), ((Number) ((Pair) entry.getValue()).getFirst()).intValue()));
            }
        } else {
            if (c945320ahu != null && (liveSeiStruct3 = c945320ahu.LIZ) != null && (seiAppData2 = liveSeiStruct3.LIZ) != null && (list3 = seiAppData2.grids) != null) {
                boolValueOf2 = Boolean.valueOf(!list3.isEmpty());
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                if (c945320ahu != null && (liveSeiStruct2 = c945320ahu.LIZ) != null && (seiAppData = liveSeiStruct2.LIZ) != null && (list2 = seiAppData.grids) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (SeiRegion seiRegion : list2) {
                        arrayList.add(new InteractAudioVolumeInfo(seiRegion.uidStr, !seiRegion.muteAudioBool, seiRegion.talk));
                    }
                }
            } else if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && (voiceChatSeiAppData = liveSeiStruct.LIZIZ) != null && (list = voiceChatSeiAppData.grids) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (VoiceChatSeiRegion voiceChatSeiRegion : list) {
                    String str4 = voiceChatSeiRegion.linkMicId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (voiceChatSeiRegion.isMuteAudio <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new InteractAudioVolumeInfo(str4, z3, voiceChatSeiRegion.talkVolume));
                }
            }
        }
        c940020aZMLIZ.LJJIFFI("updateVolumeBySei", arrayList);
        InterfaceC938500aWu interfaceC938500aWu = (InterfaceC938500aWu) c940020aZMLIZ.LLJILJIL.getValue();
        if (interfaceC938500aWu != null) {
            interfaceC938500aWu.LIZ(c945320ahu, new AwS594S0100000_15(c940020aZMLIZ, 1088));
        }
        AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(this, c945320ahu, 154);
        C940040aZO c940040aZO = new C940040aZO(this);
        if (c945320ahu != null && c945320ahu.LIZIZ != null) {
            String str5 = c945320ahu.LIZIZ;
            if (str5 != null && a0.LJJJ(str5, "ByteVC", 0, false, 6) == -1) {
                SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                if (seiAppDataLJII != null) {
                    awS381S0200000_15.invoke(seiAppDataLJII);
                    return;
                } else {
                    c940040aZO.invoke(c945320ahu);
                    return;
                }
            }
            return;
        }
        c940040aZO.invoke(c945320ahu);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIIZ(C945320ahu c945320ahu) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSeiString opt=");
        sbLIZ.append(LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable());
        sbLIZ.append(" hadAllReady=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" cachedFirstFrame=");
        if (this.LLILLJJLI != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJI) {
            C937310aUz.LJII("feed_new_layout", "onSeiString return as stopLinkMicUpdateView is true");
        } else {
            LIZLLL(new AwS416S0200000_15(this, c945320ahu, 93), new AwS416S0200000_15(this, c945320ahu, 94));
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
        this.LLILZIL = interfaceC940230aZh;
        LIZ().LJJIIJ(interfaceC940230aZh);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIZILJ(LiveWidget liveWidget) {
        Boolean boolValueOf;
        InterfaceC926460aDU interfaceC926460aDU;
        InterfaceC926460aDU interfaceC926460aDU2;
        C940490aa7 c940490aa7 = this.LL;
        if (c940490aa7 != null) {
            c940490aa7.LJI = liveWidget;
        }
        C940020aZM c940020aZMLIZ = LIZ();
        c940020aZMLIZ.getClass();
        C937310aUz.LJII("feed_new_layout", "setLiveWidget");
        if (!c940020aZMLIZ.LLJJIJI) {
            C937310aUz.LJII("feed_new_layout", "tryInitDataByDataChannel");
            if (!c940020aZMLIZ.LLJJIJI && c940020aZMLIZ.LJII() != null) {
                c940020aZMLIZ.LLJJIJI = true;
            }
            C940490aa7 c940490aa72 = c940020aZMLIZ.LLILLJJLI;
            if (c940490aa72 != null) {
                boolValueOf = Boolean.valueOf(C933980aPc.LJIIIZ(c940490aa72.LJIILJJIL));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C924500aAK c924500aAK = new C924500aAK();
                DataChannel dataChannelLJII = c940020aZMLIZ.LJII();
                if (dataChannelLJII != null) {
                    dataChannelLJII.SX0(C956950b0f.class, c924500aAK);
                }
                DataChannel dataChannelLJII2 = c940020aZMLIZ.LJII();
                if (dataChannelLJII2 != null) {
                    dataChannelLJII2.SX0(C956960b0g.class, c924500aAK);
                }
                DataChannel dataChannelLJII3 = c940020aZMLIZ.LJII();
                if (dataChannelLJII3 != null && (interfaceC926460aDU2 = (InterfaceC926460aDU) dataChannelLJII3.gg0(C956960b0g.class)) != null) {
                    interfaceC926460aDU2.LIZ((AbstractC922600a7G) c940020aZMLIZ.LLJIJIL.getValue());
                }
                DataChannel dataChannelLJII4 = c940020aZMLIZ.LJII();
                if (dataChannelLJII4 != null && (interfaceC926460aDU = (InterfaceC926460aDU) dataChannelLJII4.gg0(C956960b0g.class)) != null) {
                    interfaceC926460aDU.LIZ(new C920840a4Q(false));
                }
            }
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIJJ(C940490aa7 c940490aa7) {
        Long l;
        String str;
        EnumC945310aht enumC945310aht;
        InterfaceC964790bDJ interfaceC964790bDJ;
        InterfaceC940060aZQ interfaceC940060aZQ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init roomId=");
        sbLIZ.append(c940490aa7.LIZ);
        sbLIZ.append(" pageType=");
        sbLIZ.append(c940490aa7.LJFF);
        sbLIZ.append(" roomMode=");
        sbLIZ.append(c940490aa7.LJIILJJIL);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = c940490aa7;
        this.LLIZ.set(true);
        C940020aZM c940020aZMLIZ = LIZ();
        c940020aZMLIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init roomId=");
        sbLIZ2.append(c940490aa7.LIZ);
        sbLIZ2.append(" ownerId=");
        sbLIZ2.append(c940490aa7.LIZIZ);
        sbLIZ2.append(" pageType=");
        sbLIZ2.append(c940490aa7.LJFF);
        sbLIZ2.append(" roomMode=");
        sbLIZ2.append(c940490aa7.LJIILJJIL);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ2));
        c940020aZMLIZ.LLILLJJLI = c940490aa7;
        Context context = c940490aa7.LIZJ;
        if (context != null && (l = c940490aa7.LIZIZ) != null) {
            long jLongValue = l.longValue();
            long j = c940490aa7.LIZ;
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
            if (c940490aa7.LJIILJJIL == 7) {
                str = "live_voice";
            } else {
                str = "";
            }
            if (C917250Zyd.LIZ[c940490aa7.LJFF.ordinal()] == 1) {
                enumC945310aht = EnumC945310aht.SEARCH;
            } else {
                enumC945310aht = EnumC945310aht.COMMON_FEED;
            }
            InterfaceC937900aVw interfaceC937900aVwYU1 = iMultiGuestV3InternalServiceV2LJIIIIZZ.yU1(jLongValue, j, context, enumC945310aht, str, false);
            c940020aZMLIZ.LJIJJ().LIZIZ.LIZJ = j;
            if (interfaceC937900aVwYU1 instanceof InterfaceC964790bDJ) {
                interfaceC964790bDJ = (InterfaceC964790bDJ) interfaceC937900aVwYU1;
            } else {
                interfaceC964790bDJ = null;
            }
            c940020aZMLIZ.LLJJJJ = interfaceC964790bDJ;
            if (interfaceC937900aVwYU1 instanceof InterfaceC940060aZQ) {
                interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwYU1;
            } else {
                interfaceC940060aZQ = null;
            }
            c940020aZMLIZ.LLJJJJJIL = interfaceC940060aZQ;
            C937850aVr c937850aVr = c940020aZMLIZ.LJIJJ().LIZIZ;
            if (!C943630afB.LIZ().useInjectedLayoutManager) {
                interfaceC937900aVwYU1 = null;
            }
            c937850aVr.LIZLLL = interfaceC937900aVwYU1;
        }
        LIZ().LJJIIJZLJL(this.LLILZLL);
        LIZ().LJJIIJ(this.LLILZIL);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIL(InterfaceC940300aZo interfaceC940300aZo) {
        this.LLILZLL = interfaceC940300aZo;
        LIZ().LJJIIJZLJL(interfaceC940300aZo);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJ(int i) {
        this.LLJI = true;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJI(InterfaceC958990b3x interfaceC958990b3x) {
        this.LLILZ = interfaceC958990b3x;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIZ(int i) {
        this.LLJJIII = i;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIZI(Function1<? super Rect, Unit> function1) {
        C940020aZM c940020aZMLIZ = LIZ();
        c940020aZMLIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlayerSizeCallback hasCb=");
        sbLIZ.append(true);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        c940020aZMLIZ.LLJLLIL = function1;
        c940020aZMLIZ.LJJIJ(null);
    }

    @Override // X.InterfaceC2175461ACa
    public final Map<String, Rect> LJJIJ(boolean z) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C957020b0m> listLJIIIZ = LIZ().LJIJJ().LIZIZ.LJIIIZ();
        ArrayList<C957020b0m> arrayList = new ArrayList();
        for (C957020b0m c957020b0m : listLJIIIZ) {
            PosIdentity posIdentity = c957020b0m.getPosIdentity();
            if (posIdentity != null && posIdentity.type == 1) {
                arrayList.add(c957020b0m);
            }
        }
        for (C957020b0m c957020b0m2 : arrayList) {
            PosIdentity posIdentity2 = c957020b0m2.getPosIdentity();
            if (posIdentity2 != null && (str = posIdentity2.value) != null) {
                if (z) {
                    linkedHashMap.put(str, c957020b0m2.getShapeDescriptor().LIZ);
                } else {
                    Rect rect = new Rect();
                    c957020b0m2.getGlobalVisibleRect(rect);
                    linkedHashMap.put(str, rect);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC2175461ACa
    public final C940530aaB LJJIJIIJI(boolean z) {
        return new C940530aaB(null, 0L, 0L, 0L, null, 511);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(kotlin.jvm.functions.Function0<kotlin.Unit> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "safeRun hadAllReady="
            r2.append(r0)
            boolean r0 = r3.LIZIZ()
            r2.append(r0)
            java.lang.String r0 = " hasInit="
            r2.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LLIZ
            boolean r0 = r0.get()
            r2.append(r0)
            java.lang.String r0 = " hasContainerReady="
            r2.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LLIZLLLIL
            boolean r0 = r0.get()
            r2.append(r0)
            java.lang.String r0 = " hasFirstFrame="
            r2.append(r0)
            X.0aZh r0 = r3.LLILZIL
            if (r0 == 0) goto L58
            boolean r1 = r0.LJFF()
            r0 = 1
            if (r1 != r0) goto L58
        L3c:
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "feed_new_layout"
            X.C937310aUz.LJII(r0, r1)
            boolean r0 = r3.LIZIZ()
            if (r0 == 0) goto L52
            r4.invoke()
        L51:
            return
        L52:
            if (r5 == 0) goto L51
            r5.invoke()
            return
        L58:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940030aZN.LIZLLL(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIFFI(int i, int i2) {
        LIZ().LJJII(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    @Override // X.InterfaceC2175461ACa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940030aZN.LJJIIJZLJL(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIILIIL(int i, int i2, View view) {
        C940020aZM c940020aZMLIZ = LIZ();
        if (c940020aZMLIZ != null) {
            c940020aZMLIZ.LLJJIII = view;
        }
        LJJIFFI(i, i2);
        LIZLLL(new C940100aZU(view, this, i, i2), null);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIIIZZ(FrameLayout frameLayout, int i, int i2, int i3) {
        boolean z;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUpLayoutContainer root=");
        if (frameLayout != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" video=");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        sbLIZ.append(" bottomViewHeight=");
        sbLIZ.append(i3);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (frameLayout == null) {
            return;
        }
        this.LLJIJIL = frameLayout;
        this.LLIZLLLIL.set(true);
        C940020aZM c940020aZMLIZ = LIZ();
        c940020aZMLIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("attachContainer video=");
        sbLIZ2.append(i);
        sbLIZ2.append('x');
        sbLIZ2.append(i2);
        sbLIZ2.append(" bottomViewHeight=");
        sbLIZ2.append(i3);
        sbLIZ2.append(" pendingLayoutRefresh=");
        sbLIZ2.append(c940020aZMLIZ.LLJLIL);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ2));
        FrameLayout frameLayout2 = c940020aZMLIZ.LLJJLIIIJLLLLLLLZ;
        c940020aZMLIZ.LLJJLIIIJLLLLLLLZ = frameLayout;
        c940020aZMLIZ.LJJII(i, i2);
        InterfaceC940060aZQ interfaceC940060aZQ = c940020aZMLIZ.LLJJJJJIL;
        if (interfaceC940060aZQ != null && !interfaceC940060aZQ.isDestroyed()) {
            interfaceC940060aZQ.LJJIIJ(i3);
            if (interfaceC940060aZQ.LLIILII() && Intrinsics.LJFF(frameLayout2, frameLayout)) {
                if (!C943630afB.LIZ().layoutAttachParentOpt) {
                    interfaceC940060aZQ.LLFFF(frameLayout, (C917100ZyO) c940020aZMLIZ.LLLFF.getValue());
                }
            } else {
                c940020aZMLIZ.LJJIJIIJI(frameLayout);
            }
            C942080acg c942080acgLJLJI = interfaceC940060aZQ.LJLJI();
            if (c942080acgLJLJI != null) {
                c940020aZMLIZ.LJJIJ(c942080acgLJLJI);
            }
            if (c940020aZMLIZ.LLJLIL) {
                c940020aZMLIZ.LJJIII("container_ready");
            }
        }
        if (this.LLJILJIL == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createDebugBallOrNull channel:");
            sbLIZ3.append(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel());
            C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ3));
            Object obj = null;
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("createDebugBallOrNull return null as is not in debug mode channel:");
                sbLIZ4.append(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel());
                C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                try {
                    c098200Yq = Class.forName("com.bytedance.android.livesdk.interact.debugservice.feednewlayout.tools.FeedNewLayoutDebugTools").getDeclaredMethod("attach", FrameLayout.class, Function0.class).invoke(null, frameLayout, new AObjectS390S0100000_15(this, 10));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("createDebugBallOrNull result:");
                sbLIZ5.append((Object) C189200o6.m9toStringimpl(c098200Yq));
                C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ5));
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
            }
            this.LLJILJIL = obj;
        }
    }
}
