package com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel;

import X.C001A;
import X.C0K04;
import X.C1078580eAq;
import X.C1104800er8;
import X.C1104820erA;
import X.C1104870erF;
import X.C1144590ftJ;
import X.C1144600ftK;
import X.C1144630ftN;
import X.C1144720ftW;
import X.C1144730ftX;
import X.C1144750ftZ;
import X.C1144770ftb;
import X.C1144790ftd;
import X.C13LP;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C470430Icb;
import X.C500260Jjc;
import X.C776250Uch;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C970370bMJ;
import X.C973740bRk;
import X.EnumC1144570ftH;
import X.EnumC1144700ftU;
import X.EnumC919030a1V;
import X.EnumC964170bCJ;
import X.InterfaceC0148002o;
import X.InterfaceC1141530foN;
import X.InterfaceC973730bRj;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalStrikeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemDebuffIconNotifications;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSyncEnterRoomChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationEndEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleResultAnimationEndEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSpecialEffectCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2DebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3DebuffChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfoList;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemViewModel extends AssemViewModel<C1144720ftW> implements IMatchItemAbility, OnMessageListener, InterfaceC1141530foN {
    public IMessageManager LL;
    public Room LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public DataChannel LLILZIL;
    public Long LLJI;
    public C1104820erA LLJIJIL;
    public C1104870erF LLJILJIL;
    public final C1559260qg8 LLILZLL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1144600ftK.class, (Class<Object>) null, (String) 13), true);
    public EnumC964170bCJ LLIZ = EnumC964170bCJ.NONE;
    public long LLIZLLLIL = System.currentTimeMillis();
    public final Map<C1144770ftb, C1144750ftZ> LLJ = new LinkedHashMap();
    public boolean LLJILJILJ = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1144720ftW(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C20441214yg.LJ("MatchItemViewModel", "onClear");
        this.LLJI = null;
        wQ2(true, EnumC1144700ftU.MATCH_ENDED);
        DataChannel dataChannel3 = this.LLILZIL;
        if (dataChannel3 != null) {
            dataChannel3.zW(BattleCriticalStrikeCardEffectChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel4 = this.LLILZIL;
        if (dataChannel4 != null) {
            dataChannel4.zW(BattleSmokeCardEffectChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel5 = this.LLILZIL;
        if (dataChannel5 != null) {
            dataChannel5.zW(BattleSmokeDebuffChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel6 = this.LLILZIL;
        if (dataChannel6 != null) {
            dataChannel6.zW(BattleSpecialEffectCardEffectChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel7 = this.LLILZIL;
        if (dataChannel7 != null) {
            dataChannel7.zW(BattleTop2CardEffectChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel8 = this.LLILZIL;
        if (dataChannel8 != null) {
            dataChannel8.zW(BattleTop3CardEffectChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel9 = this.LLILZIL;
        if (dataChannel9 != null) {
            dataChannel9.zW(BattleTop2DebuffChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel10 = this.LLILZIL;
        if (dataChannel10 != null) {
            dataChannel10.zW(BattleTop3DebuffChannel.class, EnumC919030a1V.NORMAL);
        }
        DataChannel dataChannel11 = this.LLILZIL;
        if (dataChannel11 != null) {
            dataChannel11.zQ2(this);
        }
        C1104870erF c1104870erF = this.LLJILJIL;
        if (c1104870erF != null) {
            c1104870erF.LJ.removeCallbacks(c1104870erF.LJFF);
            WeakReference<DataChannel> weakReference = c1104870erF.LIZ;
            if (weakReference != null && (dataChannel2 = weakReference.get()) != null) {
                dataChannel2.zQ2(c1104870erF);
            }
            c1104870erF.LIZ = null;
        }
        this.LLJILJIL = null;
        C1104820erA c1104820erA = this.LLJIJIL;
        if (c1104820erA != null) {
            c1104820erA.LIZ();
            WeakReference<DataChannel> weakReference2 = c1104820erA.LIZIZ;
            if (weakReference2 != null && (dataChannel = weakReference2.get()) != null) {
                dataChannel.zQ2(c1104820erA);
            }
            c1104820erA.LIZIZ = null;
            C1104800er8.LIZ.clear();
        }
        this.LLJIJIL = null;
        this.LLILZIL = null;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C1548820qPI.LJIIIIZZ("EVENT_MATCH_ITEM_DISPLAYED", this);
        C1548820qPI.LJIIIIZZ("EVENT_MATCH_ITEM_EVENT_TRACKING", this);
        C1548820qPI.LJIIIIZZ("EVENT_MATCH_ITEM_CLOSE_ALL", this);
        C500260Jjc.LJJIJIIJIL(null);
        super.onCleared();
    }

    public final C1104820erA xQ2() {
        DataChannel dataChannel;
        C1104820erA c1104820erA = this.LLJIJIL;
        if (c1104820erA == null) {
            c1104820erA = new C1104820erA();
            DataChannel dataChannel2 = this.LLILZIL;
            WeakReference<DataChannel> weakReference = c1104820erA.LIZIZ;
            if (weakReference != null && (dataChannel = weakReference.get()) != null) {
                dataChannel.zQ2(c1104820erA);
            }
            c1104820erA.LIZIZ = dataChannel2 != null ? new WeakReference<>(dataChannel2) : null;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(BattleMvpAnimationStartEvent.class, c1104820erA, new AwS596S0100000_17(c1104820erA, 434));
                dataChannel2.CQ2(BattleMvpAnimationEndEvent.class, c1104820erA, new AwS596S0100000_17(c1104820erA, 435));
                dataChannel2.CQ2(BattleResultAnimationEndEvent.class, c1104820erA, new AwS596S0100000_17(c1104820erA, 436));
                dataChannel2.CQ2(BattleStateChannel.class, c1104820erA, new AwS596S0100000_17(c1104820erA, 437));
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJJJI() && !c1104820erA.LIZJ) {
                    c1104820erA.LIZJ = true;
                    c1104820erA.LIZLLL = 0L;
                    if (c1104820erA.LJ != null) {
                        c1104820erA.LIZJ();
                    }
                }
            }
            this.LLJIJIL = c1104820erA;
        }
        return c1104820erA;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        EnumC964170bCJ enumC964170bCJ;
        DataChannel dataChannel;
        User owner;
        super.onPrepared();
        C20441214yg.LJIIIZ("MatchItemViewModel", "onPrepared");
        this.LLILZIL = ((C1144600ftK) this.LLILZLL.getValue()).LLILLJJLI;
        this.LLILLL = ((C1144600ftK) this.LLILZLL.getValue()).LL;
        DataChannel dataChannel2 = this.LLILZIL;
        this.LL = dataChannel2 != null ? (IMessageManager) dataChannel2.gg0(C776250Uch.class) : null;
        DataChannel dataChannel3 = this.LLILZIL;
        Room room = dataChannel3 != null ? (Room) dataChannel3.gg0(RoomChannel.class) : null;
        this.LLILLJJLI = room;
        this.LLILZ = (room == null || (owner = room.getOwner()) == null) ? 0L : owner.getId();
        this.LLJI = null;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_BATTLE_ITEM_CARD.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LL;
        if (iMessageManager2 != null) {
            iMessageManager2.addStickyMessageListener(C001A.LINK_MIC_BATTLE_ARTIFACT_MESSAGE.getIntType(), this);
        }
        C1548820qPI.LIZLLL("EVENT_MATCH_ITEM_DISPLAYED", this);
        C1548820qPI.LIZLLL("EVENT_MATCH_ITEM_EVENT_TRACKING", this);
        C1548820qPI.LIZLLL("EVENT_MATCH_ITEM_CLOSE_ALL", this);
        DataChannel dataChannel4 = this.LLILZIL;
        if (dataChannel4 == null || (enumC964170bCJ = (EnumC964170bCJ) dataChannel4.gg0(BattleStateChannel.class)) == null) {
            enumC964170bCJ = EnumC964170bCJ.NONE;
        }
        this.LLIZ = enumC964170bCJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current State, on Prepare = ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LJIIIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel5 = this.LLILZIL;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(BattleStateChannel.class, this, new AwS596S0100000_17(this, 48));
            dataChannel5.CQ2(BattleItemSyncEnterRoomChannel.class, this, new AwS596S0100000_17(this, 49));
            dataChannel5.CQ2(BattleIsCurrentWinChannel.class, this, new AwS596S0100000_17(this, 50));
            dataChannel5.CQ2(BattleItemDebuffIconNotifications.class, this, new AwS596S0100000_17(this, 51));
        }
        C1104870erF c1104870erF = new C1104870erF();
        DataChannel dataChannel6 = this.LLILZIL;
        c1104870erF.LIZIZ = this.LLILLL;
        WeakReference<DataChannel> weakReference = c1104870erF.LIZ;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            dataChannel.zQ2(c1104870erF);
        }
        c1104870erF.LIZ = dataChannel6 != null ? new WeakReference<>(dataChannel6) : null;
        if (dataChannel6 != null) {
            EnumC964170bCJ enumC964170bCJ2 = (EnumC964170bCJ) dataChannel6.gg0(BattleStateChannel.class);
            dataChannel6.CQ2(BattleStateChannel.class, c1104870erF, new AwS596S0100000_17(c1104870erF, 438));
            if (enumC964170bCJ2 != null) {
                c1104870erF.LIZ(enumC964170bCJ2);
            }
        }
        this.LLJILJIL = c1104870erF;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void A90(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Type inference failed for: r2v157, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE] */
    /* JADX WARN: Type inference failed for: r2v162, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE] */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(com.ss.ugc.live.sdk.message.data.IMessage r31) {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.BQ2(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void DQ2(BattleInfoResponse battleInfoResponse) {
        List<VirtualTicketEnvelopeInfo> list;
        if (battleInfoResponse == null) {
            return;
        }
        Map<Long, VirtualTicketEnvelopeInfoList> map = battleInfoResponse.teamVirtualTicketEnvelopes;
        if (map.isEmpty()) {
            return;
        }
        xQ2().LJI = true;
        try {
            Iterator<Map.Entry<Long, VirtualTicketEnvelopeInfoList>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                VirtualTicketEnvelopeInfoList value = it2.next().getValue();
                if (value != null && (list = value.envelopes) != null && !list.isEmpty()) {
                    Iterator<VirtualTicketEnvelopeInfo> it3 = list.iterator();
                    while (it3.hasNext()) {
                        xQ2().LIZLLL(it3.next());
                    }
                }
            }
            xQ2().LJI = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            xQ2().LJI = false;
            throw th;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void Oq1(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void Qk0(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void Rr0(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void eY(List<Long> list) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retainAllMatchItems = ");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Map<C1144770ftb, C1144750ftZ> map = this.LLJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (true ^ ((ArrayList) list).contains(Long.valueOf(((C1144750ftZ) entry.getValue()).LIZ.LJ))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (C1144750ftZ c1144750ftZ : C13LP.LLIIII(linkedHashMap.values())) {
            if (c1144750ftZ.LIZ.LJ == this.LLILZ) {
                z = true;
            } else {
                z = false;
            }
            if (C970370bMJ.LJIIIIZZ() && !z) {
                C20441214yg.LJ("MatchItemViewModel", "teamMatch not clear all, still have mate effecting");
                return;
            } else if (CQ2(c1144750ftZ.LIZ.LIZ, z)) {
                C1144630ftN.LJJIJIIJI(c1144750ftZ, AQ2(c1144750ftZ.LIZ.LIZIZ, z), EnumC1144700ftU.ITEM_TIME_EXPIRED);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void eq1(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void lj2(UUID uuid) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[PHI: r1
      0x0066: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v33 java.lang.Integer) binds: [B:11:0x0020, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.mh2(X.00zr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r18) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:322:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r50) {
        /*
            Method dump skipped, instruction units count: 3668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.yQ2(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse):void");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final C1144750ftZ yk2(UUID uuid) {
        return (C1144750ftZ) ((LinkedHashMap) this.LLJ).get(new C1144770ftb(uuid));
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void z01(BattleInfoResponse battleInfoResponse) {
        long jLongValue;
        Long l;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncWhenEnterRoom, battleInfo = ");
        sbLIZ.append(battleInfoResponse);
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C973740bRk c973740bRk = C973740bRk.LIZ;
        if (battleInfoResponse != null && (l = battleInfoResponse.battleId) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c973740bRk.LIZIZ(jLongValue);
        long jLIZIZ = C1078580eAq.LIZIZ(20, this.LLILLJJLI, this.LLILZIL);
        if (jLIZIZ > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("low device -> MatchItemViewModel.syncWhenEnterRoom is invoked on ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            sbLIZ2.append(" at ");
            sbLIZ2.append(jElapsedRealtime);
            C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C470430Icb(jLIZIZ, jElapsedRealtime, this, battleInfoResponse, null), 3);
            return;
        }
        yQ2(battleInfoResponse);
    }

    public final int AQ2(int i, boolean z) {
        List<ItemInfo4FE> list;
        BattleItem4FEModel battleItem4FEModelZQ2 = zQ2(i, z);
        if (battleItem4FEModelZQ2 != null && (list = battleItem4FEModelZQ2.itemList) != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean CQ2(UUID uuid, boolean z) {
        int i;
        BattleItem4FEModel battleItem4FEModelZQ2;
        C1144750ftZ c1144750ftZRemove = this.LLJ.remove(new C1144770ftb(uuid));
        if (c1144750ftZRemove == null || (battleItem4FEModelZQ2 = zQ2((i = c1144750ftZRemove.LIZ.LIZIZ), z)) == null) {
            return false;
        }
        C1144790ftd c1144790ftd = new C1144790ftd(Collections.singletonList(new C1144770ftb(uuid)), C1144730ftX.LIZLLL(battleItem4FEModelZQ2.itemList, uuid), i, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove ItemId = ");
        sbLIZ.append((Object) uuid.toString());
        sbLIZ.append(", removedType = ");
        sbLIZ.append(battleItem4FEModelZQ2.itemType);
        sbLIZ.append(" and itemList = ");
        sbLIZ.append(battleItem4FEModelZQ2.itemList);
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        List<ItemInfo4FE> list = battleItem4FEModelZQ2.itemList;
        if (list == null || list.isEmpty()) {
            battleItem4FEModelZQ2 = new BattleItem4FEModel();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setStateWithAction: isSelfRoom ");
        sbLIZ2.append(z);
        sbLIZ2.append(" newItems4FE ");
        sbLIZ2.append(battleItem4FEModelZQ2.itemList);
        C20441214yg.LJIIIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        return true;
                                    }
                                } else {
                                    setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 8));
                                    return true;
                                }
                            } else {
                                setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 7));
                                return true;
                            }
                        } else {
                            setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 6));
                            return true;
                        }
                    } else {
                        setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 5));
                        return true;
                    }
                } else {
                    setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 3));
                    return true;
                }
            }
            setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 4));
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return true;
                                }
                            } else {
                                setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 2));
                                return true;
                            }
                        } else {
                            setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 1));
                            return true;
                        }
                    } else {
                        setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 0));
                        return true;
                    }
                } else {
                    setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 11));
                    return true;
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("hhhhhhhhhhh setStateWithAction: newItems4FE ");
                sbLIZ3.append(battleItem4FEModelZQ2.itemList);
                C20441214yg.LJIIIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ3));
                setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 9));
                return true;
            }
        }
        setState(new AwS383S0200000_17(battleItem4FEModelZQ2, c1144790ftd, 10));
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void Gf1(UUID uuid, String str) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        Pair pairLJIL = C1144630ftN.LJIL(c1144750ftZYk2);
        EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
        C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
        C0K04.LJFF("reason", str, c1144590ftJ.LIZIZ);
        C1144630ftN.LJJIJIIJIL(enumC1144570ftH, "match_item_ui_show_failed", c1144590ftJ);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void fo0(UUID uuid, long j) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 != null && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            Pair pairLJIL = C1144630ftN.LJIL(c1144750ftZYk2);
            EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
            C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
            C1144630ftN.LJIJJ(c1144590ftJ.LIZIZ, c1144750ftZYk2);
            C0K04.LJ("anim_duration_ms", j, c1144590ftJ.LIZIZ);
            C1144630ftN.LJJIJIIJIL(enumC1144570ftH, "match_item_enter_animation_complete", c1144590ftJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void hE0(UUID uuid, boolean z) {
        C1144750ftZ c1144750ftZYk2;
        if (z || (c1144750ftZYk2 = yk2(uuid)) == null) {
            return;
        }
        C1144630ftN.LJJIJ(c1144750ftZYk2);
    }

    public final void wQ2(boolean z, EnumC1144700ftU enumC1144700ftU) {
        vQ2(1, true, enumC1144700ftU);
        vQ2(2, true, enumC1144700ftU);
        vQ2(3, true, enumC1144700ftU);
        vQ2(7, true, enumC1144700ftU);
        vQ2(8, true, enumC1144700ftU);
        vQ2(9, true, enumC1144700ftU);
        vQ2(1, false, enumC1144700ftU);
        vQ2(2, false, enumC1144700ftU);
        vQ2(3, false, enumC1144700ftU);
        vQ2(7, false, enumC1144700ftU);
        vQ2(8, false, enumC1144700ftU);
        vQ2(9, false, enumC1144700ftU);
        if (z) {
            EnumC1144700ftU enumC1144700ftU2 = EnumC1144700ftU.MATCH_ENDED;
            vQ2(4, true, enumC1144700ftU2);
            vQ2(4, false, enumC1144700ftU2);
            ((LinkedHashMap) this.LLJ).clear();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void yX0(UUID uuid, int i) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        Pair pairLJIL = C1144630ftN.LJIL(c1144750ftZYk2);
        EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
        C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
        C1144630ftN.LJIJJ(c1144590ftJ.LIZIZ, c1144750ftZYk2);
        C0K04.LIZLLL(i, "queue_length", c1144590ftJ.LIZIZ);
        C1144630ftN.LJJIJIIJIL(enumC1144570ftH, "match_item_enter_animation_show", c1144590ftJ);
    }

    public final BattleItem4FEModel zQ2(int i, boolean z) {
        C1144720ftW state = getState();
        if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        return null;
                                    }
                                    return state.LL;
                                }
                                return state.LLILZLL;
                            }
                            return state.LLILZIL;
                        }
                        return state.LLILZ;
                    }
                    return state.LLILLL;
                }
                return state.LLILLJJLI;
            }
            return state.LL;
        }
        if (!z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        return null;
                                    }
                                    return state.LLIZ;
                                }
                                return state.LLJILJIL;
                            }
                            return state.LLJIJIL;
                        }
                        return state.LLJI;
                    }
                    return state.LLJ;
                }
                return state.LLIZLLLIL;
            }
            return state.LLIZ;
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void lX0(UUID uuid, boolean z, EnumC1144700ftU enumC1144700ftU) {
        C1144750ftZ c1144750ftZYk2 = yk2(uuid);
        if (c1144750ftZYk2 == null) {
            return;
        }
        int i = c1144750ftZYk2.LIZ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove match item: matchItemId = ");
        sbLIZ.append((Object) uuid.toString());
        sbLIZ.append(" cardType = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (CQ2(uuid, z)) {
            C1144630ftN.LJJIJIIJI(c1144750ftZYk2, AQ2(i, z), enumC1144700ftU);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(int r11, boolean r12, X.EnumC1144700ftU r13) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.vQ2(int, boolean, X.0ftU):void");
    }
}
