package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06bK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638806bK extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final C1634706af LLIZ;
    public final C01GW LLIZLLLIL;
    public final C06OC LLJ;
    public final Set<EnumC1596306Mv> LLJI;
    public final Set<C067L> LLJIJIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    public final void LJIILIIL() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZ.LIZJ, "aweme://webview");
        SettingsManager.LIZLLL().getClass();
        smartRouteBuildRoute.withParam(UriProtector.parse(SettingsManager.LJI("community_guidelines_url", "https://www.tiktok.com/community-guidelines")));
        smartRouteBuildRoute.open();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLJI;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLJ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLJIJIL;
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        this.LLILZIL.invoke(Boolean.TRUE);
    }

    public final void LJIIL(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZ.LIZJ, "aweme://webview");
        smartRouteBuildRoute.withParam("hide_nav_bar", "1");
        smartRouteBuildRoute.withParam("enter_from", "2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        SettingsManager.LIZLLL().getClass();
        sbLIZ.append(SettingsManager.LJI("risky_group_chat_ban_appeal_url", "https://www.tiktok.com/falcon/communitysafety/page/violation-appeal/index.html"));
        sbLIZ.append('?');
        C0ZFW.LIZ.getClass();
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:ban_appeal_param")) == null) {
            str = "";
        }
        sbLIZ.append(str);
        smartRouteBuildRoute.withParam(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        smartRouteBuildRoute.open();
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZ.LJI.getConversationId());
        if (c0y8tLIZ == null) {
            return new C06OH("Conversation is null");
        }
        if (C0ZFW.LIZ.LJIIIZ(c0y8tLIZ)) {
            return new C06OH("Group chat is valid");
        }
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1638906bL
            if (r0 == 0) goto L9b
            r4 = r11
            X.06bL r4 = (X.C1638906bL) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L91
            if (r1 != r0) goto La2
            X.C155000ia.LIZIZ(r3)
        L22:
            android.view.View r3 = r9.LLILLL
            boolean r0 = r3 instanceof X.C1DWA
            if (r0 == 0) goto L8e
            X.1DWA r3 = (X.C1DWA) r3
            if (r3 == 0) goto L8e
            X.06On r0 = r9.LLILZ
            X.01GW<X.06aE> r0 = r0.LJIIIZ
            java.lang.Object r1 = r0.getValue()
            X.06aB r0 = r3.LL
            java.util.List<X.06aE> r0 = r0.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r1 = X.C0YSQ.LIZIZ(r0)
            X.06On r0 = r9.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LJI
            java.lang.String r0 = r0.getConversationId()
            X.0Y8T r4 = r1.LIZ(r0)
            if (r4 == 0) goto L8e
            X.06bN r7 = new X.06bN
            r7.<init>(r9)
            X.06bR r5 = new X.06bR
            r5.<init>(r9)
            X.06bP r6 = new X.06bP
            r6.<init>(r9)
            r1 = 0
            r3.i0(r1)
            r8 = 0
            X.1DW9 r2 = new X.1DW9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C1260120ite.LIZIZ(r2)
            int r0 = r3.getVisibility()
            r3.setVisibility(r1)
            X.C1602160rnK.LIZIZ(r0, r1, r3)
            X.0ZFW r0 = X.C0ZFW.LIZ
            X.0ZFY r1 = r0.LJI(r4)
            X.06ao r0 = X.C1635606ao.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r9.LLILZIL
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L91:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L9b:
            X.06bL r4 = new X.06bL
            r4.<init>(r9, r11)
            goto L12
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1638806bK.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }

    public C1638806bK(C1600706On c1600706On, C1632906aN c1632906aN, C1632806aM c1632806aM) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1632906aN;
        this.LLILZLL = c1632806aM;
        this.LLIZ = (C1634706af) c1600706On.LJIIJJI;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1089));
        this.LLJ = new C06OC(R.layout.cil);
        this.LLJI = Collections.singleton(EnumC1596306Mv.GROUP_INVALID);
        this.LLJIJIL = Collections.singleton(C067L.GROUP);
    }
}
