package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605900rtM extends C09AY implements Function2<Boolean, Boolean, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ FeedAvatarSocialPublishAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC1398730mVD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605900rtM(long j, FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, InterfaceC1398730mVD interfaceC1398730mVD) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = feedAvatarSocialPublishAssem;
        this.LLILLL = interfaceC1398730mVD;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Boolean r11, java.lang.Boolean r12) {
        /*
            r10 = this;
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            X.054G r0 = X.C336601Si.LIZ
            java.lang.String r2 = "preload_loaded"
            long r3 = r10.LL
            com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem r0 = r10.LLILLJJLI
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.getAweme()
            r6 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r9 = 8
            X.C336601Si.LIZ(r2, r3, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem r3 = r10.LLILLJJLI
            r3.getClass()
            X.01GW r0 = X.C263980AWe.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto Lc0
            r0 = 1
        L3a:
            r7 = 0
            if (r0 == 0) goto Lad
            X.0Ooa r0 = r3.LLJJJJLIIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r1 = (com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility) r1
            boolean r0 = r1 instanceof X.InterfaceC581390MrB
            if (r0 == 0) goto L8a
            X.0MrB r1 = (X.InterfaceC581390MrB) r1
            if (r1 == 0) goto L8a
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L63
            boolean r1 = r1.getUserVisibleHint()
            X.0Ooa r0 = r3.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.IRootAbility r0 = (com.ss.android.ugc.feed.platform.panel.IRootAbility) r0
            if (r0 != 0) goto L82
            if (r1 != 0) goto L8a
        L63:
            java.lang.String r6 = "feed_context_inactive"
        L65:
            java.lang.String r2 = "preload_nav_blocked"
            long r3 = r10.LL
            com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem r0 = r10.LLILLJJLI
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.getAweme()
            r9 = 48
            r8 = r7
            X.C336601Si.LIZ(r2, r3, r5, r6, r7, r8, r9)
        L7b:
            com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem r0 = r10.LLILLJJLI
            r0.LLL = r7
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L82:
            boolean r0 = r0.getUserVisibleHint()
            if (r0 != 0) goto L8a
            if (r1 == 0) goto L63
        L8a:
            java.lang.String r1 = r3.LLL
            if (r1 == 0) goto Lad
            X.0Ooa r0 = r3.LLJJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) r0
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto Lab
            java.lang.String r0 = r0.getAid()
        La2:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto Lad
            java.lang.String r6 = "page_changed"
            goto L65
        Lab:
            r0 = r6
            goto La2
        Lad:
            X.0mVD r4 = r10.LLILLL
            com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem r0 = r10.LLILLJJLI
            X.0rzA r3 = r0.LLJLIL
            if (r3 != 0) goto Lb6
            r3 = r6
        Lb6:
            long r0 = r10.LL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.LJIILL(r3, r2, r0)
            goto L7b
        Lc0:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1605900rtM.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
