package X;

import Y.AfS193S0100000_24;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586800rOY implements ISocial2TabRedDotService {
    public static final C1586800rOY LIZ = new C1586800rOY();
    public static IBottomFriendsTabAvatarAbility LIZIZ;

    public static IBottomFriendsTabAvatarAbility LIZ() {
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJJI = LIZIZ;
        if (iBottomFriendsTabAvatarAbilityLJIIJJI == null) {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ == null || (iBottomFriendsTabAvatarAbilityLJIIJJI = C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null))) == null) {
                return null;
            }
            LIZIZ = iBottomFriendsTabAvatarAbilityLJIIJJI;
        }
        return iBottomFriendsTabAvatarAbilityLJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void clearLatestRedDotResponse() {
        C1586680rOM.LIZ.getClass();
        C1586680rOM.LJ = null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final boolean enableTabAvatar() {
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (!c1589640rT8.shouldShowFriendsTab() || c1589640rT8.F2()) {
            return false;
        }
        C0CLE.LIZ.getClass();
        return C0CLE.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final NewContentResponse getLatestResponse() {
        C1586680rOM.LIZ.getClass();
        return C1586680rOM.LJ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final String getRedDotRequestId() {
        C1586680rOM.LIZ.getClass();
        String str = C1586680rOM.LIZIZ;
        C1586680rOM.LIZIZ = null;
        return str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final Set<String> originalNumberDotList() {
        C1586680rOM.LIZ.getClass();
        return C1586680rOM.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void polling() {
        RedDotPolling.LL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void updateDynamicDelegate() {
        C1586750rOT.LIZIZ = new C1586770rOV(C1589640rT8.LIZIZ.F2() ? new C1587030rOv() : C319860CgK.LIZ() ? new C1584820rLM() : new C1587020rOu());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void visitFriendsTab() {
        C1584890rLT.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C319860CgK.LIZ() ? 7 : 1;
            C1584890rLT.LIZIZ.visitSocial2Tab(Integer.valueOf(i), C08JS.LIZLLL(C1697810uHb.LJ(Integer.valueOf(i)))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516901zr(24), new C516901zr(25));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final C1582080rGw getBeforeEnterInfo() {
        return C1586750rOT.LIZ().LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final CopyOnWriteArrayList<SingleTabCounter> getNoticeSnapshotBeforeEnterTab() {
        return C1586750rOT.LIZ().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final C1586930rOl getRedDotMetadataBeforeEnteringTab() {
        return C1586750rOT.LIZ().LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final C1587230rPF getSocialTabNoticeData() {
        return C1586750rOT.LIZ().getSocialTabNoticeData();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final CopyOnWriteArrayList<SingleTabCounter> multiCounterSnapshot() {
        return C1586750rOT.LIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final InterfaceC1584770rLH redDotAsListener() {
        return C1586750rOT.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final InterfaceC1584860rLQ redDotInterface() {
        return C1586750rOT.LIZ().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final InterfaceC1586780rOW redDotLogic() {
        return C1586750rOT.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final <ViewType> ViewType addTabAvatarView(ViewType viewtype) {
        int iLIZIZ;
        if (!(viewtype instanceof View)) {
            return null;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            iLIZIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIIZ();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LIZ.getSocial2TabAvatarSize(false))));
        }
        if (viewtype instanceof AvatarComponentView) {
            iLIZIZ += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        View view = (View) viewtype;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            layoutParams.gravity = 17;
        } else {
            layoutParams.gravity = 49;
        }
        C786410Ut5.W5(view, layoutParams);
        LIZ.getClass();
        LIZIZ(view, false);
        view.setId(R.id.l9h);
        return viewtype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dealWithFriendsAvatar(com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse<? extends com.ss.android.ugc.aweme.friendstab.model.UserNewContent> r17) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1586800rOY.dealWithFriendsAvatar(com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final int getSocial2TabAvatarSize(boolean z) {
        int i;
        if ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) {
            i = 26;
        } else {
            i = 20;
        }
        if (z) {
            boolean z2 = C1586860rOe.LIZ;
            if (C1586860rOe.LIZ) {
                return i - 6;
            }
            return i;
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final int numberCountByTag(String str) {
        return C1586750rOT.LIZ().LJIJI(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void onAwemeReadV2(Aweme aweme) {
        C1586680rOM.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        if (C1586680rOM.LJIIJJI.contains(aweme.getAid())) {
            Set<String> set = C1586680rOM.LJIIJ;
            arrayList.add(new C1587090rP1("FRIENDS_FEED", set.size(), set.remove(aweme.getAid()) ? 1 : 0));
        }
        if (!arrayList.isEmpty()) {
            C2252408s6.LJII(new AwS425S0200000_24((List) arrayList, (List<C1587090rP1>) aweme, (Aweme) 73));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void request(EnumC1586970rOp enumC1586970rOp) {
        C1586680rOM c1586680rOM = C1586680rOM.LIZ;
        boolean zLJI = MethodIDManager.LJI(137209);
        c1586680rOM.getClass();
        C1586680rOM.LIZJ(enumC1586970rOp, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void visitSingleFeed(String str) {
        C1584890rLT.LIZ.getClass();
        C1584890rLT.LIZIZ(str);
    }

    public static void LIZIZ(View view, boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 5;
        }
        C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), 0, 0, false, 16);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void loadAvatarAbility(String str, C19EG c19eg) {
        C2450909j1.LIZJ(new AwS173S1100000_24(c19eg, str, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final <ViewType> ViewType refreshTabAvatarView(ViewType viewtype, boolean z) {
        AvatarComponentView avatarComponentView;
        int i;
        if ((viewtype instanceof AvatarComponentView) && (avatarComponentView = (AvatarComponentView) viewtype) != null) {
            Integer numValueOf = Integer.valueOf(getSocial2TabAvatarSize(z));
            int social2TabAvatarSize = getSocial2TabAvatarSize(z);
            if (z) {
                i = 6;
            } else {
                i = 0;
            }
            avatarComponentView.LJIILJJIL(numValueOf, Integer.valueOf(social2TabAvatarSize + i));
            LIZIZ((View) viewtype, z);
            return viewtype;
        }
        return viewtype;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void removeRedDotByUid(String str, EnumC1392960mLu enumC1392960mLu) {
        C1586750rOT.LIZ().removeRedDotByUid(str, enumC1392960mLu);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void onAwemeRead(int i, Aweme aweme, String str) {
        int awemeType;
        int i2;
        boolean zLJI = MethodIDManager.LJI(71692);
        if (i != 31) {
            if (C729510SjV.LJJIJIL(aweme)) {
                awemeType = 40;
            } else {
                awemeType = aweme.getAwemeType();
            }
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                i2 = 10000;
            } else {
                i2 = i;
            }
            C0VNS c0vns = new C0VNS(aweme.getAid(), System.currentTimeMillis(), i2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), awemeType);
            C1216540hlM.LIZIZ.LIZLLL();
            C1593830rZt.LIZIZ.LJ(c0vns);
            if (!C296600Bju.LIZ()) {
                C1586680rOM.LIZ.getClass();
                C1586680rOM.LIZIZ(i, aweme);
            }
        }
        if (C296600Bju.LIZ()) {
            C1586680rOM.LIZ.getClass();
            C1586680rOM.LIZIZ(i, aweme);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAwemeReadAvoidPerf(int r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 71691(0x1180b, float:1.0046E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            X.0rOa r0 = X.C1586820rOa.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L6d
            r0 = 31
            if (r7 == r0) goto L6d
            boolean r0 = X.C0CN5.LJII()
            if (r0 != 0) goto L73
            X.01GW r4 = X.C1586820rOa.LIZIZ
            java.lang.Object r3 = r4.getValue()
            X.0rOc r3 = (X.C1586840rOc) r3
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LL
            boolean r0 = r0.get()
            r2 = 1
            if (r0 != 0) goto L73
            X.0NmG<java.lang.String, X.0rOb> r0 = r3.LLILLL
            int r1 = r0.LJI()
            int r0 = r3.LLILLJJLI
            if (r1 < r0) goto L45
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LL
            r0.set(r2)
            r3.LIZ()
        L45:
            int r0 = r3.LLILLJJLI
            if (r1 >= r0) goto L73
            java.lang.Object r0 = r4.getValue()
            X.0rOc r0 = (X.C1586840rOc) r0
            r0.getClass()
            java.lang.String r2 = r8.getAid()
            if (r2 == 0) goto L62
            X.0NmG<java.lang.String, X.0rOb> r1 = r0.LLILLL
            X.0rOb r0 = new X.0rOb
            r0.<init>(r7, r8, r9)
            r1.LIZLLL(r2, r0)
        L62:
            X.0CNf r1 = X.EnumC312610CNf.SATRTUP
            java.lang.Object r0 = r4.getValue()
            X.0rOc r0 = (X.C1586840rOc) r0
            X.C1BCA.LJIJJLI(r1, r0)
        L6d:
            if (r5 == 0) goto L72
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L72:
            return
        L73:
            X.0CUr r1 = new X.0CUr     // Catch: java.lang.Exception -> L80
            r1.<init>(r7, r8, r9)     // Catch: java.lang.Exception -> L80
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZLLL()     // Catch: java.lang.Exception -> L80
            r0.execute(r1)     // Catch: java.lang.Exception -> L80
            goto L6d
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1586800rOY.onAwemeReadAvoidPerf(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void onFriendsV3StoryDetailRead(int i, Aweme aweme, String str) {
        String aid;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (aid = aweme.getAid()) == null) {
            return;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1593830rZt.LIZIZ.LJIIIIZZ(new C0VNS(jCurrentTimeMillis, jCurrentTimeMillis, 31, false, 0, aid, aweme.getAwemeType(), curUserId), 31, EnumC1586890rOh.UNKNOWN.getDataLevel());
        if (C296400Bja.LIZ()) {
            C805740VjA.LIZIZ.LIZ(new C0VNP(aweme.getAwemeType(), aid, true, curUserId, jCurrentTimeMillis, jCurrentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final Object requestAnyway(EnumC1586970rOp enumC1586970rOp, EnumC586680Mzi enumC586680Mzi, InterfaceC1364105Vn<? super NewContentResponse> interfaceC1364105Vn) {
        C1586680rOM.LIZ.getClass();
        C1586730rOR.LIZ.getClass();
        return C11UD.LIZLLL(C1586730rOR.LIZ(enumC1586970rOp, enumC586680Mzi).LJL(C11S5.LIZ()).LJJIJIIJIL(new AfS193S0100000_24(enumC1586970rOp, 41)), interfaceC1364105Vn);
    }
}
