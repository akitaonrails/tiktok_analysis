package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$fetchMixStudioStatus$1", f = "BaseChatRootFragment.kt", l = {702, 707}, m = "invokeSuspend")
public final class C0HSJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseChatRootFragment LLILLL;
    public final /* synthetic */ C19EG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HSJ(String str, BaseChatRootFragment baseChatRootFragment, C19EG c19eg, InterfaceC1364105Vn<? super C0HSJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = baseChatRootFragment;
        this.LLILZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HSJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "BaseChatRootFragment@beaf.fetchMixStudioStatus$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            if (r0 == r7) goto L4a
            if (r0 != r6) goto L68
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            java.lang.Class<com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher> r0 = com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher.class
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher r3 = (com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher) r3
            if (r3 == 0) goto L48
            X.0HTm r2 = X.EnumC441640HTm.SOCIAL_AVATAR_STICKER_PANEL
            java.lang.String r1 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment r0 = r9.LLILLL
            com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r0 = r0.mS()
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getUserId()
        L3a:
            r9.LL = r7
            java.lang.Object r10 = r3.LIZJ(r2, r1, r0, r9)
            if (r10 != r5) goto L4d
            X.C1C7U.LIZIZ(r8)
            return r5
        L46:
            r0 = r4
            goto L3a
        L48:
            r10 = r4
            goto L4f
        L4a:
            X.C155000ia.LIZIZ(r10)
        L4d:
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo r10 = (com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo) r10
        L4f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0HSI r2 = new X.0HSI
            X.19EG r1 = r9.LLILZ
            java.lang.String r0 = r9.LLILLJJLI
            r2.<init>(r1, r0, r10, r4)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r3, r2)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r8)
            return r5
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HSJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
