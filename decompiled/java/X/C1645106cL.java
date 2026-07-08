package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06cL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1645106cL extends AbstractC1643906c9<C06AH, C1678906hn> {
    public final ViewGroup LLILZLL;
    public final SessionInfo LLIZ;
    public final String LLIZLLLIL;
    public final Function1<String, Unit> LLJ;
    public final Function1<String, Unit> LLJI;
    public String LLJIJIL;
    public int LLJILJIL;

    @Override // X.C06OD
    public final void LIZLLL() {
        C1678906hn c1678906hn = (C1678906hn) this.LLILZIL;
        if (c1678906hn != null) {
            c1678906hn.LLZLI();
        }
        this.LLJI.invoke(this.LLJIJIL);
        IIMSuggestedStickersAnalytics.LIZ.getClass();
        IIMSuggestedStickersAnalytics iIMSuggestedStickersAnalyticsLIZ = C1645906cT.LIZ();
        if (iIMSuggestedStickersAnalyticsLIZ != null) {
            iIMSuggestedStickersAnalyticsLIZ.LIZ(C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        EnumC1644606cG enumC1644606cG;
        String str = ((C06AH) c06oo).LIZJ.noticeCode;
        this.LLJIJIL = str;
        this.LLJ.invoke(str);
        IIMSuggestedStickersAnalytics.LIZ.getClass();
        IIMSuggestedStickersAnalytics iIMSuggestedStickersAnalyticsLIZ = C1645906cT.LIZ();
        if (iIMSuggestedStickersAnalyticsLIZ != null) {
            String conversationId = this.LLIZ.getConversationId();
            SessionInfo sessionInfo = this.LLIZ;
            String singleChatFromUserId = null;
            if ((sessionInfo instanceof C909290Zln) && sessionInfo != null) {
                singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
            }
            if (this.LLIZ instanceof C909290Zln) {
                enumC1644606cG = EnumC1644606cG.SINGLE;
            } else {
                enumC1644606cG = EnumC1644606cG.GROUP;
            }
            String str2 = this.LLJIJIL;
            if (str2 == null) {
                str2 = "";
            }
            iIMSuggestedStickersAnalyticsLIZ.LIZLLL(conversationId, singleChatFromUserId, enumC1644606cG, C1644906cJ.LIZ(str2).getValue(), this.LLJILJIL, Collections.singleton(EnumC1653006dc.AIMOJI.getValue()), Intrinsics.LJFF(this.LLJIJIL, "avatar_duo_suggested_stickers"));
        }
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> LJIIIZ(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "avatar_duo_suggested_stickers"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L25
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            X.0Hvw r1 = r0.getImAvatarDuoService()
            java.lang.String r0 = r4.LLIZLLLIL
            X.05YD r0 = r1.LJIJJ(r0)
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L24
        L22:
            X.13BV r0 = X.C13BV.INSTANCE
        L24:
            return r0
        L25:
            X.0HsE r3 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r1 = r0.getImSocialAvatarService()
            java.lang.String r0 = r4.LLIZLLLIL
            r2 = 0
            X.05YD r0 = r1.LJJLI(r0, r2)
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.model.IMSocialAvatarStatus r1 = (com.ss.android.ugc.aweme.model.IMSocialAvatarStatus) r1
            boolean r0 = r1 instanceof X.C0HK0
            if (r0 == 0) goto L63
            X.0HK0 r1 = (X.C0HK0) r1
            com.ss.android.ugc.aweme.model.IMSATaskDetail r0 = r1.getTaskDetails()
            boolean r0 = r0.isAISelfSideTask()
            r1 = 1
            if (r0 != r1) goto L63
        L4d:
            boolean r0 = com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig.LIZ()
            if (r0 == 0) goto L65
            if (r1 == 0) goto L65
            X.0HYP r0 = X.C0HYP.LIZ
            r0.getClass()
            boolean r0 = X.C0HYP.LJFF()
            if (r0 != 0) goto L65
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L63:
            r1 = 0
            goto L4d
        L65:
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r1 = r0.getImSocialAvatarService()
            java.lang.String r0 = r4.LLIZLLLIL
            X.05YD r0 = r1.LJJLI(r0, r2)
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.model.IMSocialAvatarStatus r1 = (com.ss.android.ugc.aweme.model.IMSocialAvatarStatus) r1
            boolean r0 = r1 instanceof X.C0HK0
            if (r0 == 0) goto L87
            X.0HK0 r1 = (X.C0HK0) r1
            if (r1 == 0) goto L87
            java.util.List r2 = r1.getStickers()
            if (r2 != 0) goto L89
        L87:
            X.13BV r2 = X.C13BV.INSTANCE
        L89:
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r1 = r0.getImSocialAvatarService()
            X.0Hro r0 = X.EnumC454380Hro.PRE_SHOWN_BANNER
            java.util.List r0 = r1.LJIIJ(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1645106cL.LJIIIZ(java.lang.String):java.util.List");
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C069K((C06AH) c06oo, this, null));
    }

    public C1645106cL(ViewGroup viewGroup, SessionInfo sessionInfo, String str, AwS368S0200000_2 awS368S0200000_2, AwS368S0200000_2 awS368S0200000_22) {
        super(EnumC1596306Mv.AI_MOJI_SUGGESTED, viewGroup, R.layout.cse);
        this.LLILZLL = viewGroup;
        this.LLIZ = sessionInfo;
        this.LLIZLLLIL = str;
        this.LLJ = awS368S0200000_2;
        this.LLJI = awS368S0200000_22;
    }
}
