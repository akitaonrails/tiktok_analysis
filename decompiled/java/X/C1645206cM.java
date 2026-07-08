package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.handlers.AimojiBottomMessageHandlerV2$isValid$2", f = "AimojiBottomMessageHandlerV2.kt", l = {}, m = "invokeSuspend")
public final class C1645206cM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C06OJ>, Object> {
    public final /* synthetic */ C06AH LL;
    public final /* synthetic */ C1644406cE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645206cM(C06AH c06ah, C1644406cE c1644406cE, InterfaceC1364105Vn<? super C1645206cM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06ah;
        this.LLILLJJLI = c1644406cE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1645206cM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "AimojiBottomMessageHandlerV2@e52b.isValid$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.06AH r0 = r5.LL
            com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r0.LIZJ
            java.lang.String r1 = r0.noticeCode
            if (r1 != 0) goto L1e
            X.06OH r1 = new X.06OH
            java.lang.String r0 = "Missing notice code"
            r1.<init>(r0)
            X.C1C7U.LIZIZ(r4)
            return r1
        L1e:
            X.06cE r3 = r5.LLILLJJLI
            X.06On r0 = r3.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LJI
            java.lang.String r2 = r0.getConversationId()
            java.lang.String r0 = "avatar_duo_suggested_stickers"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L63
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            X.0Hvw r0 = r0.getImAvatarDuoService()
            X.05YD r0 = r0.LJIJJ(r2)
            if (r0 == 0) goto L48
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L4a
        L48:
            X.13BV r2 = X.C13BV.INSTANCE
        L4a:
            X.06cE r1 = r5.LLILLJJLI
            int r0 = r2.size()
            r1.LLJI = r0
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lbc
            X.06OH r1 = new X.06OH
            java.lang.String r0 = "Empty stickers"
            r1.<init>(r0)
            X.C1C7U.LIZIZ(r4)
            return r1
        L63:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            boolean r0 = com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig.LIZ()
            if (r0 == 0) goto L9e
            X.01GW r0 = r3.LLIZLLLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService r0 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService) r0
            if (r0 == 0) goto L9e
            X.0951 r0 = r0.LIZ(r1)
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r0.getValue()
            X.0HDu r0 = (X.C437560HDu) r0
            if (r0 == 0) goto L9e
            boolean r1 = r0.LJI
            r0 = 1
            if (r1 != r0) goto L9e
            X.0HYP r0 = X.C0HYP.LIZ
            r0.getClass()
            boolean r0 = X.C0HYP.LJFF()
            if (r0 != 0) goto L9e
            X.13BV r2 = X.C13BV.INSTANCE
            goto L4a
        L9e:
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r1 = r0.getImSocialAvatarService()
            X.0Hro r0 = X.EnumC454380Hro.PRE_SHOWN_BANNER
            X.0HWb r0 = r1.LJIILJJIL(r0, r2)
            X.0HWY r0 = r0.LIZ()
            if (r0 == 0) goto Lb9
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r2 = r0.LIZIZ
            if (r2 == 0) goto Lb9
            goto L4a
        Lb9:
            X.13BV r2 = X.C13BV.INSTANCE
            goto L4a
        Lbc:
            X.06OI r0 = X.C06OI.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1645206cM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
