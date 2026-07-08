package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor;

import X.AbstractC921450a5P;
import X.C20441214yg;
import X.C914870Zun;
import X.C918310a0L;
import X.C918350a0P;
import X.C918360a0Q;
import X.C918390a0T;
import X.EnumC918870a1F;
import X.InterfaceC918930a1L;
import X.InterfaceC920480a3q;
import X.InterfaceC948500an2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "DATA_MULTI_LIVE_INVITER_SHARE_HELPER")
public final class MultiLiveInviterShareHelper implements InterfaceC920480a3q {
    public static final /* synthetic */ int LIZIZ = 0;
    public final AbstractC921450a5P LIZ;

    public MultiLiveInviterShareHelper(AbstractC921450a5P abstractC921450a5P) {
        this.LIZ = abstractC921450a5P;
    }

    @Override // X.InterfaceC920480a3q
    public final void LIZJ(List list, Function0 function0) {
        AbstractC921450a5P abstractC921450a5P = this.LIZ;
        if (abstractC921450a5P != null) {
            abstractC921450a5P.LJJJLZIJ();
        }
        InterfaceC918930a1L interfaceC918930a1LLIZ = C914870Zun.LIZ();
        if (interfaceC918930a1LLIZ == null) {
            C20441214yg.LJIIL("IMultiLiveInviterShareHelper", "inviteFriendsBySharingMessage skipped: capability unavailable");
        } else {
            interfaceC918930a1LLIZ.LIZ(list, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // X.InterfaceC920480a3q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r13, java.lang.String r14, int r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17) {
        /*
            r12 = this;
            r9 = r14
            java.util.List<java.lang.String> r1 = r13.recommendTagList
            if (r1 == 0) goto L4a
            java.lang.String r0 = "randmatch_guest"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto L4a
        Le:
            X.0a0P r4 = new X.0a0P
            X.0a0S r5 = X.C918390a0T.LIZIZ(r13)
            X.0a0M r6 = new X.0a0M
            X.0a1F r7 = X.EnumC918870a1F.OUTSIDE_NON_FRIEND
            if (r0 == 0) goto L1c
            java.lang.String r9 = "multi_guest_invite_by_random_match"
        L1c:
            X.0a1D r10 = X.EnumC918850a1D.INVITE_GUEST_V2
            r11 = r16
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            X.0a0Q r3 = new X.0a0Q
            kotlin.jvm.internal.AwS559S0100000_15 r2 = new kotlin.jvm.internal.AwS559S0100000_15
            r0 = 282(0x11a, float:3.95E-43)
            r1 = r17
            r2.<init>(r1, r0)
            r1 = 6
            r0 = 0
            r3.<init>(r1, r2, r0, r0)
            r0 = 8
            r4.<init>(r5, r6, r3, r0)
            X.0a5P r0 = r12.LIZ
            if (r0 == 0) goto L40
            r0.LJJJLZIJ()
        L40:
            X.0a1L r0 = X.C914870Zun.LIZ()
            if (r0 == 0) goto L4c
            r0.LIZIZ(r4)
            return
        L4a:
            r0 = 0
            goto Le
        L4c:
            X.0a5P r0 = r12.LIZ
            if (r0 == 0) goto L54
            r0.LJJJLIIL(r4)
            return
        L54:
            java.lang.String r1 = "IMultiLiveInviterShareHelper"
            java.lang.String r0 = "dispatchInviteRequest skipped: capability unavailable"
            X.C20441214yg.LJIIL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper.LIZ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, java.lang.String, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    @Override // X.InterfaceC920480a3q
    public final void LIZIZ(LinkPlayerInfo linkPlayerInfo, int i, boolean z, String str, Function0<Unit> function0, Function1<? super Long, Unit> function1) {
        C918350a0P c918350a0P = new C918350a0P(C918390a0T.LIZIZ(linkPlayerInfo), new C918310a0L(EnumC918870a1F.OUTSIDE_FRIEND, i, z, str, function1), new C918360a0Q(6, new AwS559S0100000_15(function0, (Function0<Unit>) 281), null, null), 8);
        AbstractC921450a5P abstractC921450a5P = this.LIZ;
        if (abstractC921450a5P != null) {
            abstractC921450a5P.LJJJLZIJ();
        }
        InterfaceC918930a1L interfaceC918930a1LLIZ = C914870Zun.LIZ();
        if (interfaceC918930a1LLIZ != null) {
            interfaceC918930a1LLIZ.LIZIZ(c918350a0P);
            return;
        }
        AbstractC921450a5P abstractC921450a5P2 = this.LIZ;
        if (abstractC921450a5P2 != null) {
            abstractC921450a5P2.LJJJLIIL(c918350a0P);
        } else {
            C20441214yg.LJIIL("IMultiLiveInviterShareHelper", "dispatchInviteRequest skipped: capability unavailable");
        }
    }
}
