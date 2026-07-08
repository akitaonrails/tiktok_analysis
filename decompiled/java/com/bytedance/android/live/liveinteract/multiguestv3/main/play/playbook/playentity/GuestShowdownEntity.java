package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.AbstractC928510aGn;
import X.C01EI;
import X.C01GW;
import X.C01ZC;
import X.C13BV;
import X.C1697810uHb;
import X.C176600m4;
import X.C19748512Ol;
import X.C1AZW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C921170a4x;
import X.C930480aJy;
import X.C930540aK4;
import X.C941700ac4;
import X.C946060aj6;
import X.C948450amx;
import X.C986270blx;
import X.InterfaceC20354714kj;
import X.InterfaceC941720ac6;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownEnableSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.GuestShowdownConfigChannel;
import com.bytedance.android.livesdk.model.GuestShowdownEntityFinishEvent;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestShowdownEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("guest_showdown", 0, 38500000, 0, C1697810uHb.LJIIJJI("guest_showdown_ongoing", "guest_showdown_publishing", "guest_showdown_finished", "never"), "guest_showdown_ongoing", 4080);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(109));

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        return C176600m4.LIZIZ(interfaceC941720ac6LIZIZ != null ? Boolean.valueOf(interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown")) : null);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    public static GuestShowdownConfig LJJLIIIJ(GuestShowdownEntityConfig guestShowdownEntityConfig) {
        GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
        guestShowdownConfig.duration = guestShowdownEntityConfig.duration;
        guestShowdownConfig.loserNum = guestShowdownEntityConfig.loserNum;
        int i = guestShowdownEntityConfig.winnerNum;
        if (i <= 0) {
            i = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultWinnerNum;
        }
        guestShowdownConfig.winnerNum = i;
        return guestShowdownConfig;
    }

    public static GuestShowdownEntityConfig LJJLIIIJJI(String str) {
        Object objLJII;
        try {
            objLJII = C19748512Ol.LIZJ.LJII(str, GuestShowdownEntityConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objLJII == null) {
            objLJII = null;
        }
        GuestShowdownEntityConfig guestShowdownEntityConfig = (GuestShowdownEntityConfig) objLJII;
        if (guestShowdownEntityConfig == null || (guestShowdownEntityConfig.loserNum == 0 && guestShowdownEntityConfig.duration == 0 && guestShowdownEntityConfig.winnerNum == 0)) {
            return null;
        }
        return guestShowdownEntityConfig;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJIJ() && !C500260Jjc.LJJIL()) {
            if (MultiGuestGuestShowdownEnableSetting.INSTANCE.isEnable() && !C930540aK4.LJJIJ()) {
                return true;
            }
            return false;
        }
        return C986270blx.LIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.BQ2(LJJJJ(), GuestShowdownEntityFinishEvent.class, new AwS594S0100000_15(this, 401));
        }
    }

    public final boolean LJJLIIIJILLIZJL(Object obj) {
        Boolean boolValueOf;
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown"));
        } else {
            boolValueOf = null;
        }
        return C176600m4.LIZIZ(boolValueOf);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        GuestShowdownConfig guestShowdownConfigLJJLIIIJ;
        AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ;
        GuestShowdownEntityConfig guestShowdownEntityConfigLJJLIIIJJI;
        String str = c20361214lm.LJI;
        if (str != null && !a0.LJJJIL(str) && (guestShowdownEntityConfigLJJLIIIJJI = LJJLIIIJJI(str)) != null) {
            guestShowdownConfigLJJLIIIJ = LJJLIIIJ(guestShowdownEntityConfigLJJLIIIJJI);
        } else {
            guestShowdownConfigLJJLIIIJ = null;
        }
        if (guestShowdownConfigLJJLIIIJ == null) {
            return false;
        }
        AnchorBusinessUserManager anchorBusinessUserManager = (AnchorBusinessUserManager) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((anchorBusinessUserManager == null || (abstractC928510aGnLJJJLZIJ = anchorBusinessUserManager.LJJJLZIJ()) == null || C921170a4x.LIZJ(abstractC928510aGnLJJJLZIJ) <= 0) && !z) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        List list;
        GuestShowdownEntityConfig guestShowdownEntityConfigLJJLIIIJJI = LJJLIIIJJI(c20424814w2.LJII);
        if (guestShowdownEntityConfigLJJLIIIJJI != null) {
            int i2 = guestShowdownEntityConfigLJJLIIIJJI.winnerNum;
            if (i2 <= 0) {
                i2 = 1;
            }
            ArrayList arrayList = new ArrayList();
            if (C01ZC.LIZIZ()) {
                arrayList.add(C497740JfY.LJIJJ(2131852894, Integer.valueOf(i2)));
            }
            long j = guestShowdownEntityConfigLJJLIIIJJI.duration;
            if (j > 0) {
                long j2 = 60;
                arrayList.add(C497740JfY.LJIJJ(2131854137, String.valueOf(j / j2), String.valueOf(guestShowdownEntityConfigLJJLIIIJJI.duration % j2)));
            }
            list = arrayList;
            if (!C01ZC.LIZIZ()) {
                arrayList.add(C497740JfY.LJIJJ(2131854138, Integer.valueOf(guestShowdownEntityConfigLJJLIIIJJI.loserNum)));
                list = arrayList;
            }
        } else {
            list = C13BV.INSTANCE;
        }
        return new C20361314ln(C497740JfY.LJIJI(2131852903), C497740JfY.LJIJI(2131852903), R.attr.dkg, R.attr.dkg, list, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 12);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(final X.C20361214lm r13, final X.InterfaceC979390bar r14, androidx.lifecycle.LifecycleOwner r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntity.LJJIIZ(X.14lm, X.0bar, androidx.lifecycle.LifecycleOwner):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC20356314kz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(X.C20361214lm r17, java.lang.String r18, X.C334801Rq r19, X.InterfaceC953350aur r20, android.content.Context r21) {
        /*
            r16 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            int r0 = X.C921180a4y.LJIIL(r0)
            r4 = 0
            r5 = 1
            r3 = r20
            if (r0 > 0) goto L2f
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting.INSTANCE
            boolean r0 = r0.isChangeMinGuestCount()
            if (r0 == 0) goto L2d
            r2 = 1
        L17:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r4] = r0
            r0 = 2131755864(0x7f100358, float:1.914262E38)
            java.lang.String r0 = X.C497740JfY.LJIIL(r0, r2, r1)
            X.C766270U4b.LJIIJJI(r0)
            r3.LIZ(r4, r5)
            return
        L2d:
            r2 = 2
            goto L17
        L2f:
            r0 = r17
            java.lang.String r1 = r0.LJI
            if (r1 == 0) goto L83
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L83
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntityConfig r0 = LJJLIIIJJI(r1)
            if (r0 == 0) goto L83
            webcast.data.multi_guest_play.GuestShowdownConfig r4 = LJJLIIIJ(r0)
            if (r4 == 0) goto L83
            X.0aWx r0 = X.C01IB.LIZ()
            r1 = 0
            if (r0 == 0) goto L7f
            long r10 = r0.getPlayId()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L81
            X.0aWx r0 = X.C01IB.LIZ()
            if (r0 == 0) goto L81
            boolean r0 = r0.isRunning()
            if (r0 != r5) goto L81
            r12 = 1
        L64:
            X.0aWx r5 = X.C01IB.LIZ()
            if (r5 == 0) goto L7e
            long r6 = r4.duration
            int r8 = r4.loserNum
            int r9 = r4.winnerNum
            kotlin.jvm.internal.AwS594S0100000_15 r15 = new kotlin.jvm.internal.AwS594S0100000_15
            r0 = 400(0x190, float:5.6E-43)
            r15.<init>(r3, r0)
            r14 = r19
            r13 = r18
            r5.LJIIIIZZ(r6, r8, r9, r10, r12, r13, r14, r15)
        L7e:
            return
        L7f:
            r10 = 0
        L81:
            r12 = 0
            goto L64
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntity.LJJIZ(X.14lm, java.lang.String, X.01Rq, X.0aur, android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        GuestShowdownConfig guestShowdownConfigLJJLIIIJ;
        GuestShowdownEntityConfig guestShowdownEntityConfigLJJLIIIJJI;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 321));
        }
        if (LJJLIIIJILLIZJL(null)) {
            C1AZW.LJIILL(C01EI.LIZ(245, this.LLJJJJJIL.LIZ), "toastOnGoing", null, null);
            C766270U4b.LIZLLL(2131854098);
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        String str4 = c20361214lm.LJI;
        if (str4 != null && !a0.LJJJIL(str4) && (guestShowdownEntityConfigLJJLIIIJJI = LJJLIIIJJI(str4)) != null) {
            guestShowdownConfigLJJLIIIJ = LJJLIIIJ(guestShowdownEntityConfigLJJLIIIJJI);
        } else {
            guestShowdownConfigLJJLIIIJ = null;
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        dataChannel.zW(GuestShowdownConfigChannel.class, new C946060aj6(guestShowdownConfigLJJLIIIJ, str3, new AwS293S0300000_15(this, (GuestShowdownEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 7), new AwS224S0300000_15(this, c20361214lm, interfaceC20354714kj, 14), new AwS559S0100000_15(this, 322), new AwS224S0300000_15(this, (GuestShowdownEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 15), null, new AwS224S0300000_15(this, (GuestShowdownEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 16), !LJJLIIIJILLIZJL(null), this.LLIZ, null, new C334801Rq(str, l, str2), 4752));
    }
}
