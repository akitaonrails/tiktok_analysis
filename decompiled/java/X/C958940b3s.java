package X;

import Y.ARunnableS84S0200000_15;
import Y.AfS151S0200000_15;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedUserListRetryTimesSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCardOverdrawOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958940b3s implements InterfaceC940790aab {
    public final CopyOnWriteArrayList<AbstractC940410aZz> LL;
    public final ConcurrentHashMap<String, Boolean> LLILLJJLI;
    public final ConcurrentHashMap<String, Integer> LLILLL;
    public final ConcurrentHashMap<String, Integer> LLILZ;
    public InterfaceC937900aVw LLILZIL;
    public C940490aa7 LLILZLL;
    public InterfaceC958990b3x LLIZ;
    public InterfaceC940230aZh LLIZLLLIL;
    public SeiAppData LLJ;
    public long LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public long LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public long LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C969570bL1 LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public final C01GW LLJJJJ;
    public final ConcurrentHashMap<String, C958950b3t> LLJJJJJIL;
    public Pair<Integer, Integer> LLJJJJLIIL;
    public final C958960b3u LLJJL;
    public final C969580bL2 LLJJLIIIJLLLLLLLZ;
    public final List<Pair<Integer, Boolean>> LLJL;
    public final long LLJLIL;
    public final AtomicBoolean LLJLILLLLZIIL;

    @Override // X.InterfaceC940550aaD
    public final C948800anW LIZ() {
        return null;
    }

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
    }

    @Override // X.InterfaceC940550aaD
    public final int LJJI() {
        return 0;
    }

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC940380aZw
    public final void LJJZZIII(LinkMicSei linkMicSei) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJIL() {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLLJIL(C945320ahu c945320ahu) {
    }

    @Override // X.InterfaceC940550aaD
    public final boolean LJ() {
        return this.LLJJL.LJI().size() > 2;
    }

    public final long LJFF() {
        C940490aa7 c940490aa7 = this.LLILZLL;
        if (c940490aa7 == null) {
            return 0L;
        }
        long j = c940490aa7.LIZ;
        return j > 0 ? j + this.LLJLIL : j;
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
        InterfaceC958970b3v layoutChangedListener;
        C20441214yg.LJIIIZ("MultiHostFeedHandler", "onWindowRefreshFinished");
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 == null || (layoutChangedListener = c969570bL1.getLayoutChangedListener()) == null) {
            return;
        }
        layoutChangedListener.LJJJI();
    }

    @Override // X.InterfaceC940550aaD
    public final long getChannelId() {
        if (this.LLJJIII == EnumC467700IVs.CROSS_ROOM_ARCH.getType()) {
            long j = this.LLJI;
            if (j != 0) {
                return j;
            }
        }
        return this.LLJJL.LJFF();
    }

    @Override // X.InterfaceC940550aaD
    public final String getSubMatchType() {
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(this.LLJIJIL));
        int size = this.LLJJL.LJI().size();
        c917350Zyn.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1jLIZ, size);
    }

    @Override // X.InterfaceC940380aZw
    public final void release() {
        LiveWidget liveWidget;
        DataChannel dataChannel;
        C20441214yg.LJIIIZ("MultiHostFeedHandler", "release");
        C940490aa7 c940490aa7 = this.LLILZLL;
        if (c940490aa7 != null && (liveWidget = c940490aa7.LJI) != null && (dataChannel = liveWidget.dataChannel) != null) {
            dataChannel.zQ2(this);
        }
        InterfaceC958990b3x interfaceC958990b3x = this.LLIZ;
        if (interfaceC958990b3x != null) {
            interfaceC958990b3x.LIZIZ(this.LLJL, this.LLJJLIIIJLLLLLLLZ);
        }
        ((C11NJ) this.LLJJJJ.getValue()).LJ();
        this.LLJJJJJIL.clear();
        this.LLIZ = null;
        this.LLILZLL = null;
        InterfaceC937900aVw interfaceC937900aVw = this.LLILZIL;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.V4(true);
        }
        this.LLILZIL = null;
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null) {
            C500260Jjc.LJJJLL(c969570bL1);
        }
        C969570bL1 c969570bL12 = this.LLJJIJIL;
        if (c969570bL12 != null) {
            c969570bL12.LIZIZ();
        }
        this.LLJJIJIL = null;
        Iterator<AbstractC940410aZz> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
        this.LL.clear();
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
        this.LLILZ.clear();
        if (!LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost()) {
            View view = this.LLJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            C500260Jjc.LJJJLL(view3);
        }
        View view4 = this.LLJJJIL;
        if (view4 != null) {
            C500260Jjc.LJJJLL(view4);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZJ(LJFF(), "feed_release");
    }

    @Override // X.InterfaceC940550aaD
    public final int LIZLLL() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC940550aaD
    public final int LJIIIZ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC940550aaD
    public final long lr() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0bL2] */
    public C958940b3s(int i) {
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        new ConcurrentHashMap();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap3 = new ConcurrentHashMap<>();
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = concurrentHashMap;
        this.LLILLL = concurrentHashMap2;
        this.LLILZ = concurrentHashMap3;
        this.LLILZIL = null;
        this.LLJJIII = EnumC467700IVs.MULTI_ARCH.getType();
        this.LLJJJJ = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(306));
        this.LLJJJJJIL = new ConcurrentHashMap<>();
        this.LLJJL = new C958960b3u(this);
        this.LLJJLIIIJLLLLLLLZ = new OnIMMessageListener() { // from class: X.0bL2
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "preview_multi";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C958940b3s c958940b3s = this.LL;
                c958940b3s.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("message = ");
                sbLIZ.append(iMessage);
                C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
                C969570bL1 c969570bL1 = c958940b3s.LLJJIJIL;
                if (c969570bL1 != null) {
                    C969650bL9 c969650bL9 = c969570bL1.LLIZLLLIL;
                    if (c969650bL9.LJ) {
                        C969610bL5 c969610bL5 = c969650bL9.LIZIZ;
                        c969610bL5.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("message = ");
                        sbLIZ2.append(iMessage);
                        C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                        if (iMessage instanceof LinkMicBattleMessage) {
                            C0UHI.LIZ(new ARunnableS84S0200000_15(c969610bL5, iMessage, 64));
                            return;
                        }
                        if (iMessage instanceof LinkMicBattleArmiesMessage) {
                            C0UHI.LIZ(new ARunnableS84S0200000_15(c969610bL5, iMessage, 65));
                            return;
                        }
                        if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
                            C0UHI.LIZ(new ARunnableS84S0200000_15(c969610bL5, iMessage, 66));
                        } else if (iMessage instanceof LinkMicBattleItemCard) {
                            C0UHI.LIZ(new ARunnableS84S0200000_15(c969610bL5, iMessage, 67));
                        } else {
                            C20441214yg.LJ("MatchFeedWidgetPresenter", "mMessageReceiver-> receive message is not support");
                        }
                    }
                }
            }
        };
        Integer numValueOf = Integer.valueOf(C001A.LINK_MIC_BATTLE.getIntType());
        Boolean bool = Boolean.FALSE;
        this.LLJL = C1697810uHb.LJIIJJI(new Pair(numValueOf, bool), new Pair(Integer.valueOf(C001A.LINK_MIC_BATTLE_ARMIES.getIntType()), bool), new Pair(Integer.valueOf(C001A.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType()), bool), new Pair(Integer.valueOf(C001A.LINK_MIC_BATTLE_ITEM_CARD.getIntType()), Boolean.TRUE));
        this.LLJLIL = 1L;
        this.LLJLILLLLZIIL = new AtomicBoolean(true);
        new AtomicBoolean(true);
    }

    @Override // X.InterfaceC940550aaD
    public final long LIZIZ(boolean z) {
        if (z) {
            return this.LLJILJIL;
        }
        return C973900bS0.LIZ.LIZ();
    }

    @Override // X.InterfaceC940380aZw
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
        this.LLIZLLLIL = interfaceC940230aZh;
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerRangeCalculateFinish, layout=");
        sbLIZ.append(c2180891AWx);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJIJL(c2180891AWx);
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJJJIL(SeiAppData seiAppData) {
        long jLongValue;
        long jLongValue2;
        boolean z;
        boolean z2;
        LiveWidget liveWidget;
        int size;
        boolean z3;
        boolean z4;
        Long l;
        C940490aa7 c940490aa7;
        long j;
        long j2;
        Long l2;
        AbstractC974680bTG abstractC974680bTG;
        C958980b3w feedWindowManager;
        C962790bA5 c962790bA5LIZ;
        String str;
        Map<String, String> map;
        int iIntValue;
        int iIntValue2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSeiAppData, data=");
        sbLIZ.append(seiAppData);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = seiAppData.channelId;
        if (str2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String str3 = seiAppData.anchorLinkMicId;
        int i = seiAppData.linkerArchType;
        String str4 = seiAppData.groupChannelId;
        if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        } else {
            jLongValue2 = 0;
        }
        this.LLJI = jLongValue2;
        this.LLJILJIL = seiAppData.battleId;
        Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
        if (map2 != null && (map = map2.get("match_info")) != null) {
            String str5 = map.get("match_type");
            if (str5 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLJIJIL = iIntValue;
            this.LLJILJILJ = C950220apo.LJJ(map.get("competition_id"));
            String str6 = map.get("match_stage");
            if (str6 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str6)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LLJILLL = iIntValue2;
        }
        if (this.LLJLILLLLZIIL.get()) {
            this.LLJLILLLLZIIL.set(false);
            this.LLJ = seiAppData;
            this.LLJJ = jLongValue;
            this.LLJJI = str3;
            this.LLJJIII = i;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSeiAppData, isInitial=true, newChannelId=");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", newLinkMicId=");
            sbLIZ2.append(str3);
            sbLIZ2.append(", newArcType=");
            sbLIZ2.append(i);
            C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ2));
            z2 = true;
        } else {
            boolean zLJIIZILJ = seiAppData.LJIIZILJ(this.LLJ);
            long j3 = this.LLJJ;
            String str7 = this.LLJJI;
            int i2 = this.LLJJIII;
            if (!zLJIIZILJ && j3 == jLongValue && Intrinsics.LJFF(str7, str3) && i2 == i) {
                z = true;
            } else {
                z = false;
            }
            z2 = !z;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onSeiAppData, isInitial=false, isConfigChange=");
            sbLIZ3.append(z2);
            sbLIZ3.append(", isSceneChange=");
            sbLIZ3.append(zLJIIZILJ);
            sbLIZ3.append(", oldChannelId=");
            sbLIZ3.append(j3);
            sbLIZ3.append(", oldLinkMicId=");
            sbLIZ3.append(str7);
            sbLIZ3.append(", oldArcType=");
            sbLIZ3.append(i2);
            sbLIZ3.append(", newChannelId=");
            sbLIZ3.append(jLongValue);
            sbLIZ3.append(", newLinkMicId=");
            sbLIZ3.append(str3);
            sbLIZ3.append(", newArcType=");
            sbLIZ3.append(i);
            C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ3));
            if (z2) {
                C20441214yg.LJIIIZ("MultiHostFeedHandler", "clearByConfigChange");
                ((C11NJ) this.LLJJJJ.getValue()).LJ();
                this.LLJJJJJIL.clear();
                InterfaceC937900aVw interfaceC937900aVw = this.LLILZIL;
                if (interfaceC937900aVw != null) {
                    interfaceC937900aVw.V4(true);
                }
                C969570bL1 c969570bL1 = this.LLJJIJIL;
                if (c969570bL1 != null) {
                    C500260Jjc.LJJJLL(c969570bL1);
                }
                C969570bL1 c969570bL12 = this.LLJJIJIL;
                if (c969570bL12 != null) {
                    c969570bL12.LIZIZ();
                }
                DataChannel dataChannel = null;
                this.LLJJIJIL = null;
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                C464550IJp.LIZJ(LJFF(), "feed_release_config_change");
                this.LLJ = seiAppData;
                this.LLJJ = jLongValue;
                this.LLJJI = str3;
                this.LLJJIII = i;
                long jLJFF = LJFF();
                C940490aa7 c940490aa72 = this.LLILZLL;
                if (c940490aa72 != null && (liveWidget = c940490aa72.LJI) != null) {
                    dataChannel = liveWidget.dataChannel;
                }
                C464550IJp.LIZ(jLJFF, dataChannel, "feed_config_change");
            }
        }
        HashMap map3 = new HashMap();
        int size2 = this.LLJJJJJIL.size();
        List<SeiRegion> list = seiAppData.grids;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("checkIfLinkedListChange, isCountSame=");
        if (size2 == size) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ4.append(z3);
        sbLIZ4.append(", oldCount=");
        sbLIZ4.append(size2);
        sbLIZ4.append(", newCount=");
        sbLIZ4.append(size);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ4));
        List<SeiRegion> list2 = seiAppData.grids;
        if (list2 != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            int size3 = list2.size();
            z4 = false;
            for (int i3 = 0; i3 < size3; i3++) {
                SeiRegion seiRegion = (SeiRegion) ListProtector.get(list2, i3);
                map3.put(seiRegion.uidStr, Integer.valueOf(seiRegion.position));
                if (!this.LLILLL.containsKey(seiRegion.uidStr)) {
                    z4 = true;
                }
                C958950b3t c958950b3t = this.LLJJJJJIL.get(seiRegion.uidStr);
                String str8 = "";
                if (c958950b3t != null) {
                    String str9 = this.LLJJI;
                    if (str9 != null) {
                        str8 = str9;
                    }
                    c958950b3t.LJ = str8;
                    c958950b3t.LIZLLL = this.LLJJ;
                    concurrentHashMap.put(seiRegion.uidStr, c958950b3t);
                } else {
                    String str10 = seiRegion.uidStr;
                    if (str10 == null) {
                        str = "";
                    } else {
                        str = str10;
                    }
                    C958950b3t c958950b3t2 = new C958950b3t(str);
                    String str11 = this.LLJJI;
                    if (str11 != null) {
                        str8 = str11;
                    }
                    c958950b3t2.LJ = str8;
                    c958950b3t2.LIZLLL = this.LLJJ;
                    concurrentHashMap.put(str10, c958950b3t2);
                }
            }
            this.LLJJJJJIL.putAll(concurrentHashMap);
        } else {
            z4 = false;
        }
        this.LLILLL.putAll(map3);
        if (z4 || z2) {
            C969570bL1 c969570bL13 = this.LLJJIJIL;
            if (c969570bL13 != null) {
                this.LLJJJJJIL.size();
                if (c969570bL13.LLJI == EnumC950120ape.Linked && (abstractC974680bTG = c969570bL13.LLIZLLLIL.LIZJ) != null) {
                    abstractC974680bTG.LJIILJJIL();
                }
            }
            C940490aa7 c940490aa73 = this.LLILZLL;
            if (c940490aa73 != null && (l = c940490aa73.LIZIZ) != null) {
                l.longValue();
                C20441214yg.LJIIIZ("MultiHostFeedHandler", "onLinkedListChange");
                if (this.LLJJ == 0 || ((c940490aa7 = this.LLILZLL) != null && (c940490aa7.LIZ == 0 || ((l2 = c940490aa7.LIZIZ) != null && l2.longValue() == 0)))) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("onLInkListChange return ");
                    sbLIZ5.append(this.LLJJ);
                    sbLIZ5.append(' ');
                    sbLIZ5.append(this.LLILZLL);
                    C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    C963140bAe.LIZIZ();
                    C962050b8t c962050b8t = new C962050b8t();
                    if (this.LLJJIII == EnumC467700IVs.CROSS_ROOM_ARCH.getType()) {
                        C480460Ism.LIZ().getClass();
                        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
                        C940490aa7 c940490aa74 = this.LLILZLL;
                        if (c940490aa74 != null) {
                            j2 = c940490aa74.LIZ;
                        } else {
                            j2 = 0;
                        }
                        ((C11NJ) this.LLJJJJ.getValue()).LIZ(coHostApi.updateUserListCrossArc(j2, this.LLJJ, 1).LJFF(new C0UO0()).LJJIII(LiveCohostFeedUserListRetryTimesSetting.INSTANCE.getValue()).LJJIIZ(new AfS151S0200000_15(this, c962050b8t, 41), new AfS151S0200000_15(this, c962050b8t, 42)));
                    } else {
                        C480460Ism.LIZ().getClass();
                        CoHostApi coHostApi2 = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
                        C940490aa7 c940490aa75 = this.LLILZLL;
                        if (c940490aa75 != null) {
                            j = c940490aa75.LIZ;
                        } else {
                            j = 0;
                        }
                        ((C11NJ) this.LLJJJJ.getValue()).LIZ(coHostApi2.updateUserList(j, this.LLJJ).LJFF(new C0UO0()).LJJIII(LiveCohostFeedUserListRetryTimesSetting.INSTANCE.getValue()).LJJIIZ(new AfS151S0200000_15(this, c962050b8t, 43), new AfS151S0200000_15(this, c962050b8t, 44)));
                    }
                }
            }
        }
        List<SeiRegion> list3 = seiAppData.grids;
        if (list3 != null) {
            for (SeiRegion seiRegion2 : list3) {
                String str12 = seiRegion2.uidStr;
                if (str12 != null && !Intrinsics.LJFF(this.LLILLJJLI.get(str12), Boolean.valueOf(seiRegion2.muteAudioBool))) {
                    C958950b3t c958950b3t3 = this.LLJJJJJIL.get(seiRegion2.uidStr);
                    if (c958950b3t3 != null) {
                        c958950b3t3.LJIIIZ = seiRegion2.muteAudioBool;
                    }
                    C969570bL1 c969570bL14 = this.LLJJIJIL;
                    if (c969570bL14 != null && (feedWindowManager = c969570bL14.getFeedWindowManager()) != null && (c962790bA5LIZ = feedWindowManager.LIZ(seiRegion2.uidStr)) != null) {
                        c962790bA5LIZ.setAudienceMuteState(seiRegion2.muteAudioBool);
                        this.LLILLJJLI.put(seiRegion2.uidStr, Boolean.valueOf(seiRegion2.muteAudioBool));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSeiBattleIdUpdated, seiAppData=");
        sbLIZ.append(seiAppData);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLJLILLLLZIIL(seiAppData);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserJoinedForHost, user=");
        sbLIZ.append(linkUser);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLLJ(linkUser);
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLJI(InterfaceC940430aa1 interfaceC940430aa1) {
        SeiAppData seiAppData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSeiAppData, data=");
        sbLIZ.append(interfaceC940430aa1);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        if ((interfaceC940430aa1 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC940430aa1) != null) {
            LLJJJJJIL(seiAppData);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreLayoutSwitch, layout=");
        sbLIZ.append(interfaceC937820aVo);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLLLL(interfaceC937820aVo);
        }
    }

    public static void LJII(CohostListUser cohostListUser, ConcurrentHashMap concurrentHashMap) {
        String str;
        C958950b3t c958950b3t = (C958950b3t) concurrentHashMap.get(cohostListUser.linkmicIdStr);
        if (c958950b3t != null) {
            LJIIIIZZ(cohostListUser, c958950b3t);
            return;
        }
        String str2 = cohostListUser.linkmicIdStr;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        C958950b3t c958950b3t2 = new C958950b3t(str);
        LJIIIIZZ(cohostListUser, c958950b3t2);
        concurrentHashMap.put(str2, c958950b3t2);
    }

    public static void LJIIIIZZ(CohostListUser cohostListUser, C958950b3t c958950b3t) {
        c958950b3t.LIZIZ = cohostListUser.userId.longValue();
        c958950b3t.LIZJ = cohostListUser.roomId.longValue();
        c958950b3t.LJI = new C754570Tip(cohostListUser.displayId, cohostListUser.nickName, cohostListUser.avatarThumb);
    }

    @Override // X.InterfaceC940380aZw
    public final void LLIIJI(FrameLayout frameLayout, Pair<Integer, Integer> pair) {
        Context context;
        ViewParent parent;
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveFeedContainerSet, container=");
        sbLIZ.append(frameLayout);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJLIIL = pair;
        if (!Intrinsics.LJFF(this.LLJJIJIIJIL, frameLayout)) {
            this.LLJJIJIIJIL = frameLayout;
            InterfaceC940230aZh interfaceC940230aZh = this.LLIZLLLIL;
            if (interfaceC940230aZh != null) {
                interfaceC940230aZh.LIZIZ();
            }
        }
        SeiAppData seiAppData = this.LLJ;
        if (seiAppData != null && !seiAppData.LJIILL()) {
            return;
        }
        if (this.LLJJJ == null || this.LLJJJIL == null) {
            C940490aa7 c940490aa7 = this.LLILZLL;
            Long lValueOf2 = null;
            if (c940490aa7 != null) {
                context = c940490aa7.LIZJ;
            } else {
                context = null;
            }
            FrameLayout frameLayout2 = this.LLJJIJIIJIL;
            if ((context != null || (frameLayout2 != null && (context = frameLayout2.getContext()) != null)) && frameLayout2 != null) {
                View view = this.LLJJJ;
                if (view != null) {
                    parent = view.getParent();
                } else {
                    parent = null;
                }
                if (!Intrinsics.LJFF(parent, frameLayout2)) {
                    LiveCardOverdrawOptSetting liveCardOverdrawOptSetting = LiveCardOverdrawOptSetting.INSTANCE;
                    C940490aa7 c940490aa72 = this.LLILZLL;
                    if (c940490aa72 != null) {
                        lValueOf = Long.valueOf(c940490aa72.LJIIJJI);
                    } else {
                        lValueOf = null;
                    }
                    if (liveCardOverdrawOptSetting.enableOverdrawOptForMultiHost(lValueOf)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("initEmptyView but enableOverdrawOptForMultiHost and webcastSdkVersion=");
                        C940490aa7 c940490aa73 = this.LLILZLL;
                        if (c940490aa73 != null) {
                            lValueOf2 = Long.valueOf(c940490aa73.LJIIJJI);
                        }
                        sbLIZ2.append(lValueOf2);
                        C20441214yg.LJIIIZ("live_overdraw_opt", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
                        layoutParams.gravity = 48;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
                        layoutParams2.gravity = 80;
                        View view2 = this.LLJJJ;
                        if (view2 != null) {
                            C500260Jjc.LJJJLL(view2);
                        }
                        View view3 = new View(context);
                        view3.setId(R.id.ybl);
                        C786410Ut5.LJLLLLLL(8, view3);
                        view3.setBackgroundColor(-16777216);
                        frameLayout2.addView(view3, layoutParams);
                        this.LLJJJ = view3;
                        View view4 = this.LLJJJIL;
                        if (view4 != null) {
                            C500260Jjc.LJJJLL(view4);
                        }
                        View view5 = new View(context);
                        view5.setId(R.id.ceu);
                        C786410Ut5.LJLLLLLL(8, view5);
                        view5.setBackgroundColor(-16777216);
                        frameLayout2.addView(view5, layoutParams2);
                        this.LLJJJIL = view5;
                    }
                }
            }
            View view6 = this.LLJJJ;
            if (view6 != null) {
                view6.bringToFront();
            }
            View view7 = this.LLJJJIL;
            if (view7 != null) {
                view7.bringToFront();
            }
            C969570bL1 c969570bL1 = this.LLJJIJIL;
            if (c969570bL1 != null) {
                c969570bL1.bringToFront();
            }
        }
        if (this.LLJJIJIL == null) {
            C20441214yg.LJIIIZ("MultiHostFeedHandler", "onLiveFeedContainerSet, cohostFeedContainer == null");
            C969570bL1 c969570bL12 = new C969570bL1(frameLayout.getContext());
            c969570bL12.setId(R.id.hsm);
            this.LLJJIJIL = c969570bL12;
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onLiveFeedContainerSet, cohostFeedContainer == ");
            sbLIZ3.append(this.LLJJIJIL);
            C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C969570bL1 c969570bL13 = this.LLJJIJIL;
        if (c969570bL13 != null) {
            if (frameLayout.indexOfChild(c969570bL13) != -1) {
                C20441214yg.LJIIIZ("MultiHostFeedHandler", "onLiveFeedContainerSet, container.contains(it) = true");
                return;
            }
            if (c969570bL13.getParent() != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onLiveFeedContainerSet, it.parent = ");
                sbLIZ4.append(c969570bL13.getParent());
                C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ4));
                c969570bL13.LIZIZ();
                C500260Jjc.LJJJLL(c969570bL13);
            }
            C969570bL1 c969570bL14 = (C969570bL1) frameLayout.findViewById(R.id.hsm);
            if (c969570bL14 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onLiveFeedContainerSet, oldCohostView = ");
                sbLIZ5.append(c969570bL14);
                C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ5));
                c969570bL14.LIZIZ();
                C500260Jjc.LJJJLL(c969570bL14);
            }
            frameLayout.addView(c969570bL13, 0);
            c969570bL13.LIZ(this.LLJJL);
            c969570bL13.bringToFront();
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        Boolean boolValueOf;
        SeiAppData seiAppData;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        View view2;
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutSwitch, layout=");
        sbLIZ.append(interfaceC937820aVo);
        sbLIZ.append(", switchType=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLIILII(interfaceC937820aVo, i);
        }
        if (interfaceC937820aVo.getLayoutName() == null) {
            return;
        }
        String layoutName = interfaceC937820aVo.getLayoutName();
        if (layoutName != null) {
            boolValueOf = Boolean.valueOf(C916560ZxW.LIZJ(layoutName));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf) && (seiAppData = this.LLJ) != null && seiAppData.LJIILL() && (frameLayout = this.LLJJIJIIJIL) != null) {
            Rect containerActualRange = interfaceC937820aVo.getContainerActualRange();
            View view3 = this.LLJJJ;
            if (view3 != null && (layoutParams2 = view3.getLayoutParams()) != null) {
                if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && layoutParams2.height == containerActualRange.top && (view2 = this.LLJJJ) != null && view2.getVisibility() == 0) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but topEmptyView is not changed");
                } else {
                    layoutParams2.height = containerActualRange.top;
                    View view4 = this.LLJJJ;
                    if (view4 != null) {
                        C786410Ut5.W5(view4, layoutParams2);
                    }
                    View view5 = this.LLJJJ;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(0, view5);
                    }
                }
            }
            View view6 = this.LLJJJIL;
            if (view6 != null && (layoutParams = view6.getLayoutParams()) != null) {
                int height = frameLayout.getHeight() - containerActualRange.bottom;
                if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && layoutParams.height == height && (view = this.LLJJJIL) != null && view.getVisibility() == 0) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but btmEmptyView is not changed");
                    return;
                }
                layoutParams.height = height;
                View view7 = this.LLJJJIL;
                if (view7 != null) {
                    C786410Ut5.W5(view7, layoutParams);
                }
                View view8 = this.LLJJJIL;
                if (view8 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view8);
            }
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutWindowUpdate, layout=");
        sbLIZ.append(c2180891AWx);
        sbLIZ.append(", preWindowCount=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLLIIIIL(c2180891AWx, i);
        }
    }

    public final void LJI(C940490aa7 c940490aa7, InterfaceC937900aVw interfaceC937900aVw, C919770a2h c919770a2h, InterfaceC958990b3x interfaceC958990b3x) {
        DataChannel dataChannel;
        LiveWidget liveWidget;
        LiveWidget liveWidget2;
        DataChannel dataChannel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, data=");
        sbLIZ.append(c940490aa7);
        sbLIZ.append(", linkLayoutManager=");
        sbLIZ.append(interfaceC937900aVw);
        sbLIZ.append(", audienceModel=");
        sbLIZ.append(c919770a2h);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = c940490aa7;
        this.LLILZIL = interfaceC937900aVw;
        this.LLIZ = interfaceC958990b3x;
        if (interfaceC958990b3x != null) {
            interfaceC958990b3x.LIZ(this.LLJL, this.LLJJLIIIJLLLLLLLZ);
        }
        C940490aa7 c940490aa72 = this.LLILZLL;
        if (c940490aa72 != null && (liveWidget2 = c940490aa72.LJI) != null && (dataChannel2 = liveWidget2.dataChannel) != null) {
            dataChannel2.CQ2(BattleStateChannel.class, this, AFwS250S0000000_15.get$arr$(180));
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        long jLJFF = LJFF();
        C940490aa7 c940490aa73 = this.LLILZLL;
        if (c940490aa73 != null && (liveWidget = c940490aa73.LJI) != null) {
            dataChannel = liveWidget.dataChannel;
        } else {
            dataChannel = null;
        }
        C464550IJp.LIZ(jLJFF, dataChannel, "feed_release");
    }

    @Override // X.InterfaceC958970b3v
    public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        InterfaceC958970b3v layoutChangedListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowStateChanged, window = ");
        sbLIZ.append(interfaceC937840aVq);
        sbLIZ.append(", isRoomOwnerWindow = ");
        sbLIZ.append(interfaceC937840aVq.LIZJ());
        sbLIZ.append(", oldState = ");
        sbLIZ.append(enumC918810a19);
        sbLIZ.append(", newState = ");
        sbLIZ.append(enumC918810a192);
        sbLIZ.append(", extra=");
        sbLIZ.append(c938510aWv);
        C20441214yg.LJIIIZ("MultiHostFeedHandler", C2188811AlT.LIZIZ(sbLIZ));
        C969570bL1 c969570bL1 = this.LLJJIJIL;
        if (c969570bL1 != null && (layoutChangedListener = c969570bL1.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJIILL(interfaceC937840aVq, enumC918810a19, enumC918810a192, c938510aWv);
        }
    }
}
