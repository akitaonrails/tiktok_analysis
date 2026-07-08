package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1647706cl extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        IMRecentActivityService.LIZ.getClass();
        return C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZJ(this.LLILZ.LJI) != C069H.NONE;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZLL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    public C1647706cl(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1068));
        this.LLIZ = C13LQ.LJLIIL(new EnumC1596306Mv[]{EnumC1596306Mv.RECENT_ACTIVITY, EnumC1596306Mv.RECENT_ACTIVITY_FROM_INBOX});
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZIZ().LIZLLL(this.LLILZ.LJI);
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        C327170Cs7 c327170Cs7LIZJ;
        SessionInfo sessionInfo = this.LLILZ.LJI;
        if (!sessionInfo.isSingleChat()) {
            return new C06OH("Not single chat");
        }
        if (sessionInfo.getUnreadCount() > 0) {
            ((C06ME) this.LLILZIL.getValue()).LLZLI();
            return new C06OH("Has unread messages");
        }
        IMRecentActivityService.LIZ.getClass();
        if (!C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZ().canShowBanner()) {
            return new C06OH("Frequency control hit");
        }
        C1722406oo c1722406ooLIZLLL = C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZLLL(sessionInfo.getConversationId());
        if (c1722406ooLIZLLL == null) {
            return new C06OH("No recent activity");
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(c1722406ooLIZLLL.creatorUserId), "");
        if ((iMUserLJ != null || (iMUserLJ = sessionInfo.getSingleChatFromUser()) != null) && iMUserLJ.getFollowStatus() == 2) {
            IAwemeFetchManager iAwemeFetchManager = (IAwemeFetchManager) PluggableExtentionKt.pluggableSpi$default(IAwemeFetchManager.class, false, false, false, 14, null);
            if (iAwemeFetchManager != null && (c327170Cs7LIZJ = iAwemeFetchManager.LIZJ(String.valueOf(c1722406ooLIZLLL.awemeId))) != null && !Intrinsics.LJFF(String.valueOf(c327170Cs7LIZJ.LIZ.getStatus()), CardStruct.IStatusCode.DEFAULT)) {
                C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZIZ(sessionInfo.getConversationId());
                return new C06OH("Aweme not valid");
            }
            return C06OI.LIZ;
        }
        C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZIZ(sessionInfo.getConversationId());
        return new C06OH("Not MUF");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1647806cm
            if (r0 == 0) goto L4a
            r4 = r7
            X.06cm r4 = (X.C1647806cm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L40
            if (r1 != r0) goto L50
            X.C155000ia.LIZIZ(r3)
        L22:
            X.06cy r0 = com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService r0 = X.C1649006cy.LIZ()
            X.06co r3 = r0.LIZIZ()
            X.06On r0 = r5.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r2 = r0.LJI
            kotlin.jvm.internal.AwS546S0100000_2 r1 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1069(0x42d, float:1.498E-42)
            r1.<init>(r5, r0)
            r3.LIZIZ(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L4a:
            X.06cm r4 = new X.06cm
            r4.<init>(r5, r7)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1647706cl.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
