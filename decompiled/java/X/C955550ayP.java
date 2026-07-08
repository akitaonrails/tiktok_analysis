package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import java.util.Collections;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0ayP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955550ayP {
    public final IMultiHostService LIZ;
    public final InterfaceC954310awP LIZIZ;

    public C955550ayP(IMultiHostService iMultiHostService) {
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZ = iMultiHostService;
        this.LIZIZ = c0tw8;
    }

    public final void LIZIZ(AbstractC957040b0o abstractC957040b0o) {
        int i;
        boolean z;
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            InterfaceC954310awP interfaceC954310awP = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBattleEvent, event: ");
            sbLIZ.append(abstractC957040b0o);
            sbLIZ.append(". QuickBattle is disabled");
            interfaceC954310awP.d("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int iLIZ = abstractC957040b0o.LIZ();
        InterfaceC954310awP interfaceC954310awP2 = this.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBattleEvent, event: ");
        sbLIZ2.append(abstractC957040b0o);
        sbLIZ2.append(". battleInviteType=");
        sbLIZ2.append(iLIZ);
        interfaceC954310awP2.d("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ2));
        if (iLIZ != 5) {
            return;
        }
        boolean z2 = true;
        int i2 = 0;
        if (abstractC957040b0o instanceof C955730ayh) {
            C955730ayh c955730ayh = (C955730ayh) abstractC957040b0o;
            if (this.LIZ.LLILL(c955730ayh.LIZJ) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                InterfaceC954310awP interfaceC954310awP3 = this.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onBattleAccept, event: ");
                sbLIZ3.append(c955730ayh);
                sbLIZ3.append(". inviterUserId=");
                sbLIZ3.append(c955730ayh.LIZJ);
                sbLIZ3.append(" not found in co-host list");
                interfaceC954310awP3.e("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            InterfaceC954310awP interfaceC954310awP4 = this.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onBattleAccept, event: ");
            sbLIZ4.append(c955730ayh);
            sbLIZ4.append(". Call inviteReply");
            interfaceC954310awP4.i("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ4));
            long j = c955730ayh.LIZJ;
            GiftGalleryBadgeInfo giftGalleryBadgeInfo = c955730ayh.LJ;
            C957560b1e c957560b1e = c955730ayh.LIZLLL;
            if (c957560b1e != null) {
                i2 = c957560b1e.LIZ;
            }
            LIZ(true, j, giftGalleryBadgeInfo, i2);
            this.LIZ.LLILZIL(new C945210ahj(0, 0L, c955730ayh.LIZJ, 0L, 0L, (String) null, 1, C2097608Jq.LJ(), (MHJoinReplyBizContent) null, (List) null, 1840), null, C915280ZvS.LIZ);
            return;
        }
        if (abstractC957040b0o instanceof C955740ayi) {
            C955740ayi c955740ayi = (C955740ayi) abstractC957040b0o;
            if (this.LIZ.LLILL(c955740ayi.LIZJ) == null) {
                z2 = false;
            }
            if (!z2) {
                InterfaceC954310awP interfaceC954310awP5 = this.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onBattleReject, event: ");
                sbLIZ5.append(c955740ayi);
                sbLIZ5.append(". inviterUserId=");
                sbLIZ5.append(c955740ayi.LIZJ);
                sbLIZ5.append(" not found in co-host list");
                interfaceC954310awP5.e("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            InterfaceC954310awP interfaceC954310awP6 = this.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("onBattleReject, event: ");
            sbLIZ6.append(c955740ayi);
            sbLIZ6.append(". Call inviteReply");
            interfaceC954310awP6.i("BattleUserBehaviorListener", C2188811AlT.LIZIZ(sbLIZ6));
            long j2 = c955740ayi.LIZJ;
            GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = c955740ayi.LJ;
            C957560b1e c957560b1e2 = c955740ayi.LIZLLL;
            if (c957560b1e2 != null) {
                i = c957560b1e2.LIZ;
            } else {
                i = 0;
            }
            LIZ(false, j2, giftGalleryBadgeInfo2, i);
            this.LIZ.LLILZIL(new C945210ahj(0, 0L, c955740ayi.LIZJ, 0L, 0L, (String) null, 2, C2097608Jq.LJ(), (MHJoinReplyBizContent) null, (List) null, 1840), null, C915280ZvS.LIZ);
            return;
        }
        throw new C1954807lC();
    }

    public static void LIZ(boolean z, long j, GiftGalleryBadgeInfo giftGalleryBadgeInfo, int i) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        Integer numValueOf = Integer.valueOf(i);
        EnumC955760ayk enumC955760ayk = EnumC955760ayk.NONE;
        JoinGroupMessageExtra joinGroupMessageExtra = new JoinGroupMessageExtra();
        joinGroupMessageExtra.sourceType = i;
        JoinGroupMessageExtra.RivalExtra rivalExtra = new JoinGroupMessageExtra.RivalExtra();
        rivalExtra.giftGalleryBadgeInfo = giftGalleryBadgeInfo;
        joinGroupMessageExtra.extra = rivalExtra;
        C955400ayA.LIZ.LLFII(false, z, false, j, c13bv, null, numValueOf, enumC955760ayk, joinGroupMessageExtra, false, "", false, Collections.emptyList(), 0L, null);
    }
}
