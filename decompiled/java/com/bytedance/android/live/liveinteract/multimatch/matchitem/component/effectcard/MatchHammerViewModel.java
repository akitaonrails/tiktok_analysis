package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard;

import X.AnonymousClass0956;
import X.C001A;
import X.C099R;
import X.C0PEM;
import X.C0UEA;
import X.C0UED;
import X.C1017903yT;
import X.C1144600ftK;
import X.C1144730ftX;
import X.C1161920gLG;
import X.C13LP;
import X.C1555970qap;
import X.C1559260qg8;
import X.C158Y;
import X.C1780050wQF;
import X.C1954807lC;
import X.C20441214yg;
import X.C204703158b;
import X.C204704158c;
import X.C204705158d;
import X.C204706158e;
import X.C204708158g;
import X.C20483515Dd;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C755810Tkp;
import X.C755820Tkq;
import X.C776250Uch;
import X.C817503Hh;
import X.C915980Zwa;
import X.C970370bMJ;
import X.EnumC1780040wQE;
import X.EnumC1780060wQG;
import X.EnumC919030a1V;
import X.EnumC919170a1j;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC20483715Df;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleResultAnimationEndEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSpecialEffectCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSpecialEffectDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDizzinessEffectEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSpecialEffectResourceIdSetting;
import com.bytedance.android.livesdk.model.message.AnchorPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS145S1100000_31;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchHammerViewModel extends AssemViewModel<C204708158g> implements IHammerAbility, OnMessageListener, InterfaceC20483715Df {
    public IMessageManager LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public DataChannel LLILZ;
    public final C1559260qg8 LLILZIL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1144600ftK.class, (Class<Object>) null, (String) 13), true);
    public final long LLILZLL = 5;
    public final long LLIZ = 100;
    public final int LLIZLLLIL = 1;
    public final int LLJ = 3;
    public final String LLJI = LiveMatchSpecialEffectResourceIdSetting.INSTANCE.getResourceId();
    public final List<ConcurrentLinkedQueue<C204703158b>> LLJIJIL;
    public final AtomicInteger LLJILJIL;
    public final ConcurrentLinkedQueue<String> LLJILJILJ;
    public final ConcurrentLinkedQueue<String> LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final ConcurrentLinkedQueue<C158Y> LLJJI;
    public final ConcurrentLinkedQueue<C158Y> LLJJIII;
    public volatile EnumC1780040wQE LLJJIJI;
    public volatile boolean LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public volatile EnumC1780060wQG LLJJJ;
    public volatile EnumC1780060wQG LLJJJIL;
    public volatile long LLJJJJ;
    public volatile long LLJJJJJIL;
    public volatile long LLJJJJLIIL;
    public volatile boolean LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJL;
    public volatile boolean LLJLIL;
    public volatile boolean LLJLILLLLZIIL;
    public volatile boolean LLJLL;
    public volatile boolean LLJLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLJJL = false;
        this.LLJLLIL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        this.LLJLL = false;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        EnumC1780060wQG enumC1780060wQG = EnumC1780060wQG.LL;
        this.LLJJJ = enumC1780060wQG;
        this.LLJJJIL = enumC1780060wQG;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0L;
        this.LLJJJJLIIL = 0L;
        this.LLJILJIL.set(0);
        vQ2();
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        ((ArrayList) C20483515Dd.LJIIIIZZ).remove(this);
        JQ2("viewModel onCleared");
        wQ2();
        this.LLILZ = null;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.onCleared();
    }

    public final void IQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LLJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C204704158c(this, null), 2);
        }
    }

    public final void KQ2() {
        long j;
        int i = C1780050wQF.LIZ[this.LLJJIJI.ordinal()];
        if (i == 1) {
            this.LLJJIJI = (yQ2() || this.LLJJIJIIJIL || this.LLJJIJIL) ? EnumC1780040wQE.FAN : zQ2() ? EnumC1780040wQE.REGULAR : EnumC1780040wQE.NONE;
            return;
        }
        if (i == 2) {
            if (!yQ2() && !this.LLJJIJIIJIL && !this.LLJJIJIL) {
                this.LLJJIJI = zQ2() ? EnumC1780040wQE.REGULAR : EnumC1780040wQE.NONE;
                NQ2("individual fan queue drained");
                return;
            } else {
                if (this.LLJL) {
                    xQ2(true, this.LLJJI);
                    xQ2(false, this.LLJJIII);
                    return;
                }
                return;
            }
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        if (!zQ2()) {
            this.LLJJIJI = yQ2() ? EnumC1780040wQE.FAN : EnumC1780040wQE.NONE;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJJJLIIL < C20483515Dd.LIZ.LJI()) {
            return;
        }
        int size = ((ArrayList) this.LLJIJIL).size();
        int i2 = this.LLJILJIL.get();
        do {
            j = ((long) size) & 4294967295L;
            int i3 = (int) ((((long) this.LLJILJIL.get()) & 4294967295L) % j);
            if (i3 < 0 || i3 >= ((ArrayList) this.LLJIJIL).size()) {
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ListProtector.get(this.LLJIJIL, i3);
            this.LLJILJIL.incrementAndGet();
            if (!concurrentLinkedQueue.isEmpty()) {
                C204703158b c204703158b = (C204703158b) concurrentLinkedQueue.poll();
                if (c204703158b != null) {
                    this.LLJJJJLIIL = jCurrentTimeMillis;
                    setState(new AwS610S0100000_31(c204703158b, 80));
                    return;
                }
                return;
            }
        } while (i2 != ((int) ((((long) this.LLJILJIL.get()) & 4294967295L) % j)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C204708158g(0);
    }

    @Override // X.InterfaceC20483715Df
    public final void dx() {
        JQ2("onMatchDowngradeChanged");
        vQ2();
        setState(AFwS276S0000000_31.get$arr$(22));
    }

    public final void vQ2() {
        this.LLJILJILJ.clear();
        this.LLJILLL.clear();
        Iterator<ConcurrentLinkedQueue<C204703158b>> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        this.LLJJI.clear();
        this.LLJJIII.clear();
    }

    public final void wQ2() {
        if (this.LLILLJJLI && LiveMatchDizzinessEffectEnableSetting.INSTANCE.isEnabled()) {
            C20441214yg.LIZIZ("MatchItemHammerVM", "dismiss Star Effect");
            if (C2296808zG.LJI(ViewModelKt.getViewModelScope(this))) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C755810Tkp(this, null), 2);
            } else {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C755820Tkq(this, null), 2);
            }
        }
    }

    public final boolean yQ2() {
        return (this.LLJJI.isEmpty() ^ true) || (this.LLJJIII.isEmpty() ^ true);
    }

    public final boolean zQ2() {
        if ((!this.LLJILJILJ.isEmpty()) || (!this.LLJILLL.isEmpty())) {
            return true;
        }
        List<ConcurrentLinkedQueue<C204703158b>> list = this.LLJIJIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<ConcurrentLinkedQueue<C204703158b>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public MatchHammerViewModel() {
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        do {
            arrayList.add(new ConcurrentLinkedQueue());
            i++;
        } while (i < 4);
        this.LLJIJIL = arrayList;
        this.LLJILJIL = new AtomicInteger(0);
        this.LLJILJILJ = new ConcurrentLinkedQueue<>();
        this.LLJILLL = new ConcurrentLinkedQueue<>();
        this.LLJJI = new ConcurrentLinkedQueue<>();
        this.LLJJIII = new ConcurrentLinkedQueue<>();
        this.LLJJIJI = EnumC1780040wQE.NONE;
        EnumC1780060wQG enumC1780060wQG = EnumC1780060wQG.LL;
        this.LLJJJ = enumC1780060wQG;
        this.LLJJJIL = enumC1780060wQG;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        Room room;
        User owner;
        super.onPrepared();
        this.LLILZ = ((C1144600ftK) this.LLILZIL.getValue()).LLILLJJLI;
        this.LLILLJJLI = ((C1144600ftK) this.LLILZIL.getValue()).LL;
        DataChannel dataChannel = this.LLILZ;
        this.LL = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        DataChannel dataChannel2 = this.LLILZ;
        this.LLILLL = (dataChannel2 == null || (room = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) ? 0L : owner.getId();
        this.LLJJL = false;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_BATTLE_ITEM_CARD.getIntType(), this);
        }
        DataChannel dataChannel3 = this.LLILZ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(BattleStateChannel.class, this, new AwS610S0100000_31(this, 77));
            dataChannel3.CQ2(BattleResultAnimationEndEvent.class, this, new AwS610S0100000_31(this, 78));
            dataChannel3.CQ2(BattleIsCurrentWinChannel.class, this, new AwS610S0100000_31(this, 79));
            dataChannel3.CQ2(BattleSpecialEffectDebuffChannel.class, this, new C204705158d(this));
            dataChannel3.CQ2(BattleSpecialEffectCardEffectChannel.class, this, new C204706158e(this));
        }
        C20483515Dd.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C755830Tkr
            if (r0 == 0) goto L7e
            r7 = r9
            X.0Tkr r7 = (X.C755830Tkr) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r3 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 1
            if (r0 == 0) goto L4b
            if (r0 != r5) goto L84
            com.bytedance.android.live.effect.api.IEffectService r2 = r7.LLILLJJLI
            java.lang.Object r4 = r7.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r3)
        L28:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r3
            if (r3 == 0) goto L48
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "try to remove current Sticker panel = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MatchItemHammerVM"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0U78 r0 = r2.composerManagerB()
            r0.LJIIJ(r3, r4)
        L48:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r0 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r0
            boolean r0 = r0.ni()
            if (r0 != 0) goto L5f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            java.lang.String r3 = r8.LLJI
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r2 = (com.bytedance.android.live.effect.api.IEffectService) r2
            X.0UEA r1 = r2.getLiveEffectController()
            java.lang.String r4 = "livehorizontaleffects"
            r7.LL = r4
            r7.LLILLJJLI = r2
            r7.LLILZIL = r5
            java.lang.String r0 = "all"
            java.lang.Object r3 = r1.LIZJ(r3, r4, r0, r7)
            if (r3 != r6) goto L28
            return r6
        L7e:
            X.0Tkr r7 = new X.0Tkr
            r7.<init>(r8, r9)
            goto L12
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel.DQ2(X.05Vn):java.lang.Object");
    }

    public final void GQ2(UUID uuid) {
        Object objGg0;
        if (!this.LLILLJJLI || !LiveMatchDizzinessEffectEnableSetting.INSTANCE.isEnabled() || !((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni() || C970370bMJ.LJ()) {
            return;
        }
        C20441214yg.LIZIZ("MatchItemHammerVM", "try to show dizziness effect");
        String str = this.LLJI;
        C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
        if (liveEffectController.LJIIIIZZ(str, "livehorizontaleffects")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is using effect, effect resourceId = ");
            sbLIZ.append(str);
            C20441214yg.LJ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleSpecialEffectDebuffChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC919030a1V.NORMAL) {
            C20441214yg.LJ("MatchItemHammerVM", "rival side special effect is not effecting ,can't add dizziness");
        } else {
            C20441214yg.LJ("MatchItemHammerVM", "before play star effect");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0UED(liveEffectController, str, "livehorizontaleffects", this, uuid, null), 2);
        }
    }

    public final void HQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show hammer queue isSelfSide = ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJL = true;
        IQ2();
    }

    public final void JQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop processing Job source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJ = null;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        this.LLJJIJI = EnumC1780040wQE.NONE;
        EnumC1780060wQG enumC1780060wQG = EnumC1780060wQG.LL;
        this.LLJJJ = enumC1780060wQG;
        this.LLJJJIL = enumC1780060wQG;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0L;
        this.LLJJJJLIIL = 0L;
    }

    public final void LQ2(boolean z) {
        EnumC1780060wQG enumC1780060wQG;
        ConcurrentLinkedQueue<C158Y> concurrentLinkedQueue;
        ConcurrentLinkedQueue<String> concurrentLinkedQueue2;
        boolean z2;
        EnumC1780060wQG enumC1780060wQG2;
        boolean z3;
        String str;
        long j;
        String strPoll;
        if (z) {
            enumC1780060wQG = this.LLJJJ;
            concurrentLinkedQueue = this.LLJJI;
            concurrentLinkedQueue2 = this.LLJILJILJ;
            z2 = this.LLJJIJIIJIL;
        } else {
            enumC1780060wQG = this.LLJJJIL;
            concurrentLinkedQueue = this.LLJJIII;
            concurrentLinkedQueue2 = this.LLJILLL;
            z2 = this.LLJJIJIL;
        }
        int iOrdinal = enumC1780060wQG.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (concurrentLinkedQueue2.isEmpty()) {
                        FQ2(z, EnumC1780060wQG.LL);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (z) {
                        j = this.LLJJJJ;
                    } else {
                        j = this.LLJJJJJIL;
                    }
                    if (jCurrentTimeMillis - j >= C20483515Dd.LIZ.LJI() && (strPoll = concurrentLinkedQueue2.poll()) != null) {
                        setState(new AwS43S0010000_31(z, 0));
                        if (z) {
                            this.LLJJJJ = jCurrentTimeMillis;
                        } else {
                            this.LLJJJJJIL = jCurrentTimeMillis;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("regular dispatched isSelfSide=");
                        sbLIZ.append(z);
                        sbLIZ.append(" hammer=");
                        sbLIZ.append(strPoll);
                        C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            if (!this.LLJL) {
                return;
            }
            xQ2(z, concurrentLinkedQueue);
            if (z) {
                z3 = this.LLJJIJIIJIL;
            } else {
                z3 = this.LLJJIJIL;
            }
            if (concurrentLinkedQueue.isEmpty() && !z3) {
                FQ2(z, EnumC1780060wQG.LL);
                if (!yQ2() && !this.LLJJIJIIJIL && !this.LLJJIJIL) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("side ");
                    if (z) {
                        str = "self";
                    } else {
                        str = "rival";
                    }
                    sbLIZ2.append(str);
                    sbLIZ2.append(" fan drained");
                    NQ2(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            return;
        }
        if (!(!concurrentLinkedQueue.isEmpty()) && !z2) {
            if (!concurrentLinkedQueue2.isEmpty()) {
                enumC1780060wQG2 = EnumC1780060wQG.LLILLL;
            } else {
                enumC1780060wQG2 = EnumC1780060wQG.LL;
            }
        } else {
            enumC1780060wQG2 = EnumC1780060wQG.LLILLJJLI;
        }
        if (enumC1780060wQG2 != EnumC1780060wQG.LL) {
            FQ2(z, enumC1780060wQG2);
        }
    }

    public final void MQ2(String str) {
        if (this.LLJLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerSettlementPause re-entered source=");
            sbLIZ.append(str);
            sbLIZ.append(", ignore");
            C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJLLIL = true;
        boolean z = this.LLJJIJIIJIL;
        boolean z2 = this.LLJJIJIL;
        C1555970qap c1555970qap = new C1555970qap(true, z, z2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerSettlementPause source=");
        sbLIZ2.append(str);
        sbLIZ2.append(" self=");
        sbLIZ2.append(z);
        sbLIZ2.append(" rival=");
        sbLIZ2.append(z2);
        C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ2));
        setState(new AwS610S0100000_31(c1555970qap, 81));
    }

    public final void NQ2(String str) {
        if (!this.LLJLIL || this.LLJLILLLLZIIL || this.LLJLL || yQ2()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroying fan container, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJI.clear();
        this.LLJJIII.clear();
        this.LLJL = false;
        this.LLJLIL = false;
        setState(AFwS276S0000000_31.get$arr$(23));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r23) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static final void AQ2(MatchHammerViewModel matchHammerViewModel, ConcurrentLinkedQueue<C158Y> concurrentLinkedQueue) {
        while (true) {
            C158Y c158yPoll = concurrentLinkedQueue.poll();
            if (c158yPoll == null) {
                return;
            }
            Iterator<AnchorPair> it2 = c158yPoll.LJI.iterator();
            while (it2.hasNext()) {
                matchHammerViewModel.CQ2(c158yPoll.LIZ, it2.next(), c158yPoll.LIZLLL);
            }
        }
    }

    public final void FQ2(boolean z, EnumC1780060wQG enumC1780060wQG) {
        EnumC1780060wQG enumC1780060wQG2;
        String str;
        if (z) {
            enumC1780060wQG2 = this.LLJJJ;
        } else {
            enumC1780060wQG2 = this.LLJJJIL;
        }
        if (enumC1780060wQG2 == enumC1780060wQG) {
            return;
        }
        if (z) {
            this.LLJJJ = enumC1780060wQG;
        } else {
            this.LLJJJIL = enumC1780060wQG;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("side ");
        if (z) {
            str = "self";
        } else {
            str = "rival";
        }
        sbLIZ.append(str);
        sbLIZ.append(" state: ");
        sbLIZ.append(enumC1780060wQG2);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC1780060wQG);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.IHammerAbility
    public final void dP2(long j, boolean z) {
        int i;
        if (j < this.LLILZLL && !z) {
            return;
        }
        if (z) {
            this.LLJJL = true;
        }
        if (j < this.LLIZ && !z) {
            i = this.LLIZLLLIL;
        } else {
            i = this.LLJ;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String strLIZ = C1017903yT.LIZ();
            this.LLJILJILJ.offer(strLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offer self hammer = ");
            sbLIZ.append(strLIZ);
            C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        }
        HQ2(true);
    }

    public final void xQ2(boolean z, ConcurrentLinkedQueue<C158Y> concurrentLinkedQueue) {
        boolean z2;
        String str;
        C158Y c158yPoll = concurrentLinkedQueue.poll();
        if (c158yPoll == null) {
            return;
        }
        if (z) {
            z2 = this.LLJJIJIIJIL;
        } else {
            z2 = this.LLJJIJIL;
        }
        if (z2) {
            str = "update";
        } else {
            str = "start";
            if (z) {
                this.LLJJIJIIJIL = true;
            } else {
                this.LLJJIJIL = true;
            }
        }
        setState(new AwS145S1100000_31(c158yPoll, str, 2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fan hammer dispatched eventType=");
        sbLIZ.append(str);
        sbLIZ.append(" self=");
        sbLIZ.append(z);
        sbLIZ.append(" count=");
        sbLIZ.append(c158yPoll.LIZLLL);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void BQ2(boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFanHammerPlayFinished isSelfSide=");
        sbLIZ.append(z);
        sbLIZ.append(" success=");
        sbLIZ.append(z2);
        sbLIZ.append(" shouldFallback=");
        sbLIZ.append(z3);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        if (z3) {
            this.LLJJLIIIJLLLLLLLZ = true;
            this.LLJL = false;
            this.LLJJIJIIJIL = false;
            this.LLJJIJIL = false;
            C20441214yg.LIZIZ("MatchItemHammerVM", "migrating fan queues to regular queues");
            if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                while (true) {
                    C158Y c158yPoll = this.LLJJI.poll();
                    if (c158yPoll == null) {
                        break;
                    }
                    int i = c158yPoll.LIZLLL;
                    for (int i2 = 0; i2 < i; i2++) {
                        this.LLJILJILJ.offer(UUID.randomUUID().toString());
                    }
                }
                while (true) {
                    C158Y c158yPoll2 = this.LLJJIII.poll();
                    if (c158yPoll2 == null) {
                        break;
                    }
                    int i3 = c158yPoll2.LIZLLL;
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.LLJILLL.offer(UUID.randomUUID().toString());
                    }
                }
            } else {
                AQ2(this, this.LLJJI);
                AQ2(this, this.LLJJIII);
            }
            this.LLJJIJI = EnumC1780040wQE.REGULAR;
        } else if (z) {
            this.LLJJIJIIJIL = false;
        } else {
            this.LLJJIJIL = false;
        }
        if (!yQ2() && !this.LLJJIJIIJIL && !this.LLJJIJIL) {
            NQ2("fan play finished, queues empty");
        }
    }

    public final void CQ2(UUID uuid, AnchorPair anchorPair, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            UUID uuidRandomUUID = UUID.randomUUID();
            int iLIZIZ = C1144730ftX.LIZIZ(anchorPair.sourceAnchorId);
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) C13LP.LJJJLZIJ(iLIZIZ, this.LLJIJIL);
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.offer(new C204703158b(uuid, uuidRandomUUID, anchorPair, iLIZIZ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("offer anchor pair matchItemId=");
                sbLIZ.append((Object) uuid.toString());
                sbLIZ.append(" hammer=");
                sbLIZ.append(uuidRandomUUID);
                sbLIZ.append(" anchorIndex= ");
                sbLIZ.append(iLIZIZ);
                sbLIZ.append(" affectedAnchorPair=");
                sbLIZ.append(anchorPair);
                C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.IHammerAbility
    public final void uH0(UUID uuid, long j, boolean z) {
        int i;
        if (j < this.LLILZLL && !z) {
            return;
        }
        if (j < this.LLIZ && !z) {
            i = this.LLIZLLLIL;
        } else {
            i = this.LLJ;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String strLIZ = C1017903yT.LIZ();
            this.LLJILLL.offer(strLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offer rival hammer = ");
            sbLIZ.append(strLIZ);
            C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        }
        GQ2(uuid);
        HQ2(false);
    }

    public final Object EQ2(UUID uuid, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (!((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            return Unit.LIZ;
        }
        if (LiveMatchDizzinessEffectEnableSetting.INSTANCE.isEnabled()) {
            Object objLJFF = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController().LJFF(str, str2, "all", interfaceC1364105Vn, AFwS199S0000000_12.get$arr$(476), null, new AwS378S0200000_12(this, uuid, 96), true, false);
            if (objLJFF == C099R.LJFF()) {
                return objLJFF;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.IHammerAbility
    public final void XU1(UUID uuid, List<AnchorPair> list, long j, boolean z) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        if (j < this.LLILZLL && !z) {
            return;
        }
        if (z) {
            this.LLJJL = true;
        }
        if (j < this.LLIZ && !z) {
            i = this.LLIZLLLIL;
        } else {
            i = this.LLJ;
        }
        Iterator<AnchorPair> it2 = list.iterator();
        while (it2.hasNext()) {
            CQ2(uuid, it2.next(), i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show hammer for pair queue matchItemId = ");
        sbLIZ.append((Object) uuid.toString());
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJL = true;
        IQ2();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.IHammerAbility
    public final void lG(UUID uuid, boolean z, CommunityHeartMeInfo communityHeartMeInfo, String str, List<AnchorPair> list) {
        if (this.LLJJLIIIJLLLLLLLZ) {
            C20441214yg.LIZIZ("MatchItemHammerVM", "fan fallback triggered, routing initial card to regular WebP path");
            if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                XU1(uuid, list, 0L, true);
                return;
            } else if (z) {
                C970370bMJ.LJIIIIZZ();
                dP2(0L, true);
                return;
            } else {
                C970370bMJ.LJIIIIZZ();
                uH0(uuid, 0L, true);
                return;
            }
        }
        C158Y c158y = new C158Y(uuid, z, 0L, this.LLJ, communityHeartMeInfo, str, list);
        if (z) {
            this.LLJJI.offer(c158y);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offer fan initial self hammer matchItemId=");
            sbLIZ.append((Object) uuid.toString());
            C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            this.LLJJIII.offer(c158y);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("offer fan initial rival hammer matchItemId=");
            sbLIZ2.append((Object) uuid.toString());
            C20441214yg.LJIIIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ2));
            GQ2(uuid);
        }
        if (!this.LLJLIL) {
            this.LLJLIL = true;
            setState(AFwS276S0000000_31.get$arr$(21));
        }
        this.LLJJL = true;
        IQ2();
    }
}
