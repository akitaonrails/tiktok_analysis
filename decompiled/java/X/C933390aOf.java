package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixCapsuleExposeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMultiStrategyCapsuleDisplayNameSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMultiStrategyCapsuleStyleSetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsMultiGuestApplyGuide;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsMultiGuestInviteGuide;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceApplyGuide;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933390aOf implements InterfaceC1112400f3O {
    public WeakReference<C1112330f3H> LL;
    public WeakReference<C1112330f3H> LLILLJJLI;
    public long LLILLL;

    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return LiveCapsuleStyleConfigSetting.INSTANCE.getValue().multiStrategyCapsuleStyleConfig;
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return LiveMultiStrategyCapsuleDisplayNameSetting.INSTANCE.isUsername() ? 1 : 0;
    }

    public static String LIZLLL(CapsuleMessage capsuleMessage) {
        String str;
        CapsuleBizParams capsuleBizParams;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide;
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide;
        User user;
        LinkUser linkUserLLD;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide2;
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide2;
        LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide3;
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide3;
        CapsuleBizParams capsuleBizParams2 = capsuleMessage.bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsMultiGuestApplyGuide3 = capsuleBizParams2.multiGuestApplyGuide) != null && (linkmicAudienceApplyGuide3 = capsuleBizParamsMultiGuestApplyGuide3.applyNoticeGuide) != null) {
            str = linkmicAudienceApplyGuide3.linkmicId;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && ((capsuleBizParams = capsuleMessage.bizParams) == null || (capsuleBizParamsMultiGuestApplyGuide2 = capsuleBizParams.multiGuestApplyGuide) == null || (linkmicAudienceApplyGuide2 = capsuleBizParamsMultiGuestApplyGuide2.applyNoticeGuide) == null || (linkMicAudienceNoticeText = linkmicAudienceApplyGuide2.content) == null || (str = linkMicAudienceNoticeText.text) == null || str.length() == 0)) {
            CapsuleBizParams capsuleBizParams3 = capsuleMessage.bizParams;
            if (capsuleBizParams3 == null || (capsuleBizParamsMultiGuestApplyGuide = capsuleBizParams3.multiGuestApplyGuide) == null || (linkmicAudienceApplyGuide = capsuleBizParamsMultiGuestApplyGuide.applyNoticeGuide) == null || (user = linkmicAudienceApplyGuide.user) == null) {
                return null;
            }
            long id = user.getId();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(id)) == null) {
                return null;
            }
            return linkUserLLD.linkMicId;
        }
        return str;
    }

    public static int LJ(User user) {
        if (user.getFollowInfo() == null) {
            return 0;
        }
        return (int) user.getFollowInfo().getFollowStatus();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return LiveMultiStrategyCapsuleStyleSetting.INSTANCE.isNewStyleV2();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040e  */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(X.C1112330f3H r19) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C933390aOf.LJIIIZ(X.0f3H):boolean");
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        this.LL = new WeakReference<>(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
        boolean z;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide;
        User user;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide2;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide;
        User user2;
        String str;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide2;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide3;
        C1112330f3H c1112330f3H2;
        boolean z2 = false;
        String str2 = null;
        if (LinkMicFixCapsuleExposeSetting.INSTANCE.enable()) {
            WeakReference<C1112330f3H> weakReference = this.LL;
            if (weakReference != null) {
                c1112330f3H2 = weakReference.get();
            } else {
                c1112330f3H2 = null;
            }
            if (Intrinsics.LJFF(c1112330f3H, c1112330f3H2)) {
                this.LL = null;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsMultiGuestInviteGuide = capsuleBizParams.multiGuestInviteGuide) != null && (user2 = capsuleBizParamsMultiGuestInviteGuide.inviteeUser) != null && z) {
            if (capsuleBizParamsMultiGuestInviteGuide.noticeType == 7) {
                C931740aM0.LJIIIZ(user2, "show");
            } else {
                long id = user2.getId();
                EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
                int iLJ = LJ(user2);
                CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams2 != null && (capsuleBizParamsMultiGuestInviteGuide3 = capsuleBizParams2.multiGuestInviteGuide) != null && capsuleBizParamsMultiGuestInviteGuide3.noticeType == 3) {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                CapsuleBizParams capsuleBizParams3 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams3 != null && (capsuleBizParamsMultiGuestInviteGuide2 = capsuleBizParams3.multiGuestInviteGuide) != null) {
                    str = capsuleBizParamsMultiGuestInviteGuide2.linkmicAudienceInviteNoticeReason;
                } else {
                    str = null;
                }
                C925600aC6.LJJIJ(id, enumC918970a1PLJI, false, iLJ, boolValueOf, str, "anchor_invite_guest", null, null);
            }
        }
        CapsuleBizParams capsuleBizParams4 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams4 != null && (capsuleBizParamsMultiGuestApplyGuide = capsuleBizParams4.multiGuestApplyGuide) != null && (user = capsuleBizParamsMultiGuestApplyGuide.applyUser) != null && z) {
            long id2 = user.getId();
            EnumC918970a1P enumC918970a1PLJI2 = C917140ZyS.LJI();
            int followStatus = (int) user.getFollowInfo().getFollowStatus();
            Boolean bool = Boolean.FALSE;
            CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
            CapsuleBizParams capsuleBizParams5 = capsuleMessage.bizParams;
            if (capsuleBizParams5 != null && (capsuleBizParamsMultiGuestApplyGuide2 = capsuleBizParams5.multiGuestApplyGuide) != null) {
                str2 = capsuleBizParamsMultiGuestApplyGuide2.linkmicAudienceApplyNoticeReason;
            }
            C925600aC6.LJJIJ(id2, enumC918970a1PLJI2, false, followStatus, bool, str2, "guest_apply_anchor", LIZLLL(capsuleMessage), null);
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        if (LiveMultiStrategyCapsuleStyleSetting.INSTANCE.isNewStyle() && ((CapsuleMessage) c1112330f3H.LJIL).style > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1112330f3H r6, java.util.Map r7) {
        /*
            boolean r0 = X.C917810ZzX.LJIILIIL()
            r5 = 0
            if (r0 == 0) goto L42
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L5a
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L5a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r1 = r0.roomId
            java.lang.Long r0 = X.C930540aK4.LJIIJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L20
            r4.add(r2)
            goto L20
        L3d:
            int r1 = r4.size()
            goto L56
        L42:
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L5a
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L5a
            int r1 = r0.size()
        L56:
            r0 = 2
            if (r1 < r0) goto L5a
            r5 = 1
        L5a:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "is_guest_connection"
            r7.put(r0, r1)
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1P r2 = X.C927600aFK.LJII()
            kotlin.Pair r0 = X.C917520Zz4.LJII(r2)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "layout_setting"
            r7.put(r0, r1)
            kotlin.Pair r0 = X.C917520Zz4.LJII(r2)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = "window_setting"
            r7.put(r0, r1)
            MESSAGE extends X.0ffY r0 = r6.LJIL
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
            if (r0 == 0) goto Lb4
            com.bytedance.android.livesdk.model.message.CapsuleBizParamsMultiGuestInviteGuide r0 = r0.multiGuestInviteGuide
            if (r0 == 0) goto Lb4
            com.bytedance.android.live.base.model.user.User r2 = r0.inviteeUser
            if (r2 == 0) goto Lb4
            long r0 = r2.getId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_id"
            r7.put(r0, r1)
            int r0 = LJ(r2)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_relationship"
            r7.put(r0, r1)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C933390aOf.LIZJ(X.0f3H, java.util.Map):void");
    }

    public static boolean LJIIL(User user, Function1 function1) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!C923330a8R.LJFF()) {
            C766270U4b.LIZLLL(2131854635);
            function1.invoke(Boolean.FALSE);
            return true;
        }
        InterfaceC918930a1L interfaceC918930a1LLIZ = C914870Zun.LIZ();
        if (interfaceC918930a1LLIZ == null) {
            C20441214yg.LJ("MultiGuestInviteGuideCapsuleHandler", "handleModeratorGuideInviteWithUnifiedBatch capability is null");
            return false;
        }
        interfaceC918930a1LLIZ.LIZIZ(C918240a0E.LIZ(C918220a0C.LIZ(new C918350a0P(C918390a0T.LIZ(Collections.singletonList(new C916860Zy0(user.getId(), user.getLiveRoomId()))), new C915880ZwQ(null, false, 7), new C918360a0Q(1, null, new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 655), new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 656)), 8), AFwS250S0000000_15.get$arr$(220))));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
        int size;
        List<LinkUser> listLIZLLL;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide;
        User user;
        List<LinkUser> listLIZLLL2;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        map.put("layout_id", C917520Zz4.LIZJ());
        if (C917810ZzX.LJIILIIL()) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL2 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                ArrayList arrayList = new ArrayList();
                for (LinkUser linkUser : listLIZLLL2) {
                    if (Intrinsics.LJFF(linkUser.roomId, C930540aK4.LJIIJ())) {
                        arrayList.add(linkUser);
                    }
                }
                size = arrayList.size();
            } else {
                size = 0;
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null && (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
                size = listLIZLLL.size();
            } else {
                size = 1;
            }
        }
        map.put("guest_cnt", String.valueOf(size - 1));
        CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsMultiGuestInviteGuide = capsuleBizParams.multiGuestInviteGuide) != null && (user = capsuleBizParamsMultiGuestInviteGuide.inviteeUser) != null) {
            map.put("guest_id", String.valueOf(user.getId()));
            map.put("anchor_relationship", String.valueOf(LJ(user)));
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
        LIZJ(c1112330f3H, map);
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
        LIZJ(c1112330f3H, map);
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
        LIZJ(c1112330f3H, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ca  */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIL(X.C1109770ez9 r18, com.bytedance.android.livesdk.model.message.CapsuleMessage r19) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C933390aOf.LJJIJIL(X.0ez9, com.bytedance.android.livesdk.model.message.CapsuleMessage):boolean");
    }

    public static final void LJFF(User user, C933390aOf c933390aOf, C1112330f3H c1112330f3H, boolean z) {
        String str;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide;
        long id = user.getId();
        c933390aOf.getClass();
        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
        int followStatus = (int) user.getFollowInfo().getFollowStatus();
        Boolean bool = Boolean.FALSE;
        CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
        CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsMultiGuestApplyGuide = capsuleBizParams.multiGuestApplyGuide) != null) {
            str = capsuleBizParamsMultiGuestApplyGuide.linkmicAudienceApplyNoticeReason;
        } else {
            str = null;
        }
        C925600aC6.LJJIJ(id, enumC918970a1PLJI, true, followStatus, bool, str, "guest_apply_anchor", LIZLLL(capsuleMessage), Boolean.valueOf(z));
    }

    public static final void LJIIJ(User user, C933390aOf c933390aOf, C1112330f3H c1112330f3H, Boolean bool) {
        boolean z;
        String str;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide2;
        long id = user.getId();
        c933390aOf.getClass();
        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
        int iLJ = LJ(user);
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsMultiGuestInviteGuide2 = capsuleBizParams.multiGuestInviteGuide) != null && capsuleBizParamsMultiGuestInviteGuide2.noticeType == 3) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsMultiGuestInviteGuide = capsuleBizParams2.multiGuestInviteGuide) != null) {
            str = capsuleBizParamsMultiGuestInviteGuide.linkmicAudienceInviteNoticeReason;
        } else {
            str = null;
        }
        C925600aC6.LJJIJ(id, enumC918970a1PLJI, true, iLJ, boolValueOf, str, "anchor_invite_guest", null, bool);
    }
}
