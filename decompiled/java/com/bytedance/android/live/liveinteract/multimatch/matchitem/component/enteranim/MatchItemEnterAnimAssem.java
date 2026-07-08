package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim;

import X.C0PEM;
import X.C1144600ftK;
import X.C1144770ftb;
import X.C1144990ftx;
import X.C1294320jmo;
import X.C1295960jpS;
import X.C1312005Bm;
import X.C1324720kZq;
import X.C1558520qew;
import X.C1559260qg8;
import X.C158B;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2476909nD;
import X.C497740JfY;
import X.C723590SZx;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C978440bZK;
import X.EnumC1144980ftw;
import X.EnumC964170bCJ;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS50S0300000_17;
import Y.ARunnableS86S0200000_17;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaEntranceAnimEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFanHammerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVaultBoostingCardSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemEnterAnimAssem extends UIContentAssem implements IMatchItemEnterAnimAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJJL = 0;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1144600ftK.class, null), checkSupervisorPrepared());
    public DataChannel LLJ;
    public boolean LLJI;
    public Room LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public C1295960jpS LLJILLL;
    public C1324720kZq LLJJ;
    public final ConcurrentLinkedDeque<C1144990ftx> LLJJI;
    public boolean LLJJIII;
    public final BPEAHandler LLJJIJI;
    public final Map<C1144770ftb, Long> LLJJIJIIJIL;
    public final Integer LLJJIJIL;
    public final Integer LLJJJ;
    public final Integer LLJJJIL;
    public final Integer LLJJJJ;
    public final Integer LLJJJJJIL;
    public final Integer LLJJJJLIIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJJIII = false;
        this.LLJJI.clear();
        C1295960jpS c1295960jpS = this.LLJILLL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLJILLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.clearAnimation();
        }
        C1295960jpS c1295960jpS3 = this.LLJILLL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.setImageDrawable(null);
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -883074619) {
            return null;
        }
        return this;
    }

    public MatchItemEnterAnimAssem() {
        MatchItemCardLynxUrlSetting.INSTANCE.getMatchItemsGuide();
        this.LLJILJIL = (int) C497740JfY.LIZIZ(40.0f);
        this.LLJILJILJ = (int) C497740JfY.LIZIZ(15.0f);
        this.LLJJI = new ConcurrentLinkedDeque<>();
        this.LLJJIJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJIJIL = 1;
        this.LLJJJ = 2;
        this.LLJJJIL = 4;
        this.LLJJJJ = 7;
        this.LLJJJJJIL = 8;
        this.LLJJJJLIIL = 9;
    }

    public final boolean Oo() {
        Room room;
        if (!C915980Zwa.LJFF().r82() || !C915980Zwa.LJII().L6()) {
            return false;
        }
        long jFf = C915980Zwa.LJII().ff();
        if (jFf <= 0 || (room = this.LLJIJIL) == null) {
            return false;
        }
        long ownerUserId = room.getOwnerUserId();
        if (jFf == ownerUserId) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Enlarge] hide enter anim enlargedUid=");
        sbLIZ.append(jFf);
        sbLIZ.append(" ownerId=");
        sbLIZ.append(ownerUserId);
        C20441214yg.LJIIIZ("MatchItemEnterAnim", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Ho(ItemInfo4FE itemInfo4FE) {
        boolean z;
        boolean z2;
        Long lRemove = this.LLJJIJIIJIL.remove(new C1144770ftb(itemInfo4FE.itemId));
        Object objGg0 = null;
        if (lRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            IMatchItemAbility iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMatchItemAbility.class, null);
            if (iMatchItemAbility != null) {
                iMatchItemAbility.fo0(itemInfo4FE.itemId, jElapsedRealtime);
            }
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleStateChannel.class);
        }
        if (objGg0 == EnumC964170bCJ.PUNISH_START && itemInfo4FE.itemType == 4) {
            z = true;
        } else {
            z = false;
        }
        if (objGg0 != EnumC964170bCJ.MATCH_START && !z) {
            C20441214yg.LJ("MatchItemEnterAnim", "battle state not start");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("waiting List size End  = ");
        ConcurrentLinkedDeque<C1144990ftx> concurrentLinkedDeque = this.LLJJI;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("MatchItemEnterAnim", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = false;
        ConcurrentLinkedDeque<C1144990ftx> concurrentLinkedDeque2 = this.LLJJI;
        if (concurrentLinkedDeque2 == null || concurrentLinkedDeque2.isEmpty()) {
            return;
        }
        So(0L, "Animation end");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.IMatchItemEnterAnimAbility
    public final void I01(ItemInfo4FE itemInfo4FE) {
        if (itemInfo4FE.effectStartTimeSec * ((long) LSPassThroughRecordSizeConfig.DEFAULT) <= C158B.LIZIZ()) {
            this.LLJJI.offerFirst(new C1144990ftx(EnumC1144980ftw.LL, itemInfo4FE));
        } else {
            this.LLJJI.offerLast(new C1144990ftx(EnumC1144980ftw.LL, itemInfo4FE));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.IMatchItemEnterAnimAbility
    public final void aX(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1312005Bm(this, str, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Room room;
        View view2;
        super.onViewCreated(view);
        C20441214yg.LIZIZ("MatchItemEnterAnim", "onViewCreated");
        this.LLJ = ((C1144600ftK) this.LLIZLLLIL.getValue()).LLILLJJLI;
        this.LLJI = ((C1144600ftK) this.LLIZLLLIL.getValue()).LL;
        DataChannel dataChannel = ((C1144600ftK) this.LLIZLLLIL.getValue()).LLILLJJLI;
        C1324720kZq c1324720kZq = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJIJIL = room;
        this.LLJILLL = (C1295960jpS) view.findViewById(R.id.las);
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            c1324720kZq = (C1324720kZq) view2.findViewById(R.id.lfx);
        }
        this.LLJJ = c1324720kZq;
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleStateChannel.class, this, new AwS596S0100000_17(this, 45));
            dataChannel2.CQ2(BattleEnigmaEntranceAnimEvent.class, this, new AwS596S0100000_17(this, 46));
        }
    }

    public final void Jo(ItemInfo4FE itemInfo4FE, long j) {
        IMatchItemAbility iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMatchItemAbility.class, null);
        if (iMatchItemAbility != null) {
            iMatchItemAbility.yX0(itemInfo4FE.itemId, this.LLJJI.size());
        }
        this.LLJJIJIIJIL.put(new C1144770ftb(itemInfo4FE.itemId), Long.valueOf(SystemClock.elapsedRealtime()));
        C20441214yg.LJIIIZ("MatchItemEnterAnim", "show Self Use Card Animation first step load finish success");
        int i = itemInfo4FE.itemType;
        if (i == 1) {
            Go(new ARunnableS86S0200000_17(this, itemInfo4FE.itemId, 76), this.LLJJIJIL, 3100 - j);
            return;
        }
        if (i == 2) {
            Go(new ARunnableS86S0200000_17(this, itemInfo4FE.itemId, 77), this.LLJJJ, 3300 - j);
            return;
        }
        if (i == 4) {
            if (itemInfo4FE.LIZ == 1 && LiveMatchFanHammerSetting.INSTANCE.isEnabled()) {
                Go(new ARunnableS86S0200000_17(this, itemInfo4FE, 75), this.LLJJJIL, 3300 - j);
                return;
            } else {
                Go(new ARunnableS50S0300000_17(this, itemInfo4FE.affectedAnchorPairs, itemInfo4FE.itemId, 23), this.LLJJJIL, 3300 - j);
                return;
            }
        }
        if (i == 7 && LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
            Go(new ARunnableS86S0200000_17(this, itemInfo4FE.itemId, 78), this.LLJJJJ, 3100 - j);
            return;
        }
        if (itemInfo4FE.itemType == 8 && LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
            Go(new ARunnableS86S0200000_17(this, itemInfo4FE.itemId, 79), this.LLJJJJJIL, 3100 - j);
        } else {
            if (itemInfo4FE.itemType != 9 || !LiveMatchVaultBoostingCardSettings.INSTANCE.getValue()) {
                return;
            }
            Go(new ARunnableS86S0200000_17(this, itemInfo4FE.itemId, 80), this.LLJJJJLIIL, 3100 - j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void So(long r24, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem.So(long, java.lang.String):void");
    }

    public final void Go(Runnable runnable, Object obj, long j) {
        C786410Ut5.LJLIIIL(this.LLJJIJI, runnable, obj, SystemClock.uptimeMillis() + j);
    }

    public static void No(Bitmap bitmap, C1294320jmo c1294320jmo, boolean z, boolean z2) {
        if (c1294320jmo != null) {
            if (z2) {
                c1294320jmo.LJFF = null;
            } else {
                if (bitmap == null) {
                    return;
                }
                if (z && (bitmap = C2476909nD.LIZ(bitmap)) == null) {
                    return;
                }
                c1294320jmo.LJFF = C978440bZK.LJIIJJI(c1294320jmo.LIZ, c1294320jmo.LIZIZ, bitmap);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo(final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r26, final long r27, java.lang.String r29, final android.graphics.Bitmap r30, final android.graphics.Bitmap r31, final com.bytedance.android.live.base.model.ImageModel r32, final X.C1144970ftv r33) {
        /*
            r25 = this;
            boolean r3 = X.C497740JfY.LJJ()
            r4 = r25
            if (r3 == 0) goto L11
            X.0jpS r1 = r4.LLJILLL
            if (r1 == 0) goto L11
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.C786410Ut5.Wb(r1, r0)
        L11:
            X.0jpS r1 = r4.LLJILLL
            r5 = r26
            int r2 = r5.itemType
            r0 = 1
            r8 = r33
            if (r2 == r0) goto L89
            r0 = 3
            if (r2 == r0) goto L86
            r0 = 4
            if (r2 == r0) goto L7d
            r0 = 7
            if (r2 == r0) goto L75
            r0 = 8
            if (r2 == r0) goto L75
            r0 = 9
            if (r2 != r0) goto L8e
            java.lang.String r0 = "tiktok_live_interaction_demand_18"
        L2f:
            java.lang.String r20 = "images"
            X.0ftu r3 = new X.0ftu
            r11 = r32
            r10 = r31
            r6 = r27
            r9 = r30
            r3.<init>()
            kotlin.jvm.internal.AwS34S0600000_17 r12 = new kotlin.jvm.internal.AwS34S0600000_17
            r19 = 0
            r13 = r11
            r14 = r5
            r15 = r8
            r16 = r4
            r17 = r9
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r23 = java.lang.Boolean.FALSE
            r21 = 1
            r19 = r29
            r22 = r3
            r24 = r12
            r17 = r1
            r18 = r0
            X.C1143680frq.LJIIL(r17, r18, r19, r20, r21, r22, r23, r24)
            X.0jpS r0 = r4.LLJILLL
            if (r0 == 0) goto L66
            r0.removeAllAnimatorListeners()
        L66:
            X.0jpS r2 = r4.LLJILLL
            if (r2 == 0) goto L74
            Y.ALAdapterS12S0200000_17 r1 = new Y.ALAdapterS12S0200000_17
            r0 = 32
            r1.<init>(r4, r5, r0)
            r2.addAnimatorListener(r1)
        L74:
            return
        L75:
            if (r3 != 0) goto L7a
            java.lang.String r0 = "tiktok_live_interaction_demand_17"
            goto L2f
        L7a:
            java.lang.String r0 = "tiktok_live_interaction_demand_22"
            goto L2f
        L7d:
            if (r8 == 0) goto L83
            java.lang.String r0 = r8.LIZIZ
            if (r0 != 0) goto L2f
        L83:
            java.lang.String r0 = "tiktok_live_interaction_demand_6"
            goto L2f
        L86:
            java.lang.String r0 = "tiktok_live_interaction_demand_5"
            goto L2f
        L89:
            if (r3 == 0) goto L8e
            java.lang.String r0 = "tiktok_live_interaction_demand_20"
            goto L2f
        L8e:
            java.lang.String r0 = "tiktok_live_interaction_demand_3"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem.Lo(com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, long, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, com.bytedance.android.live.base.model.ImageModel, X.0ftv):void");
    }
}
