package X;

import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot$preloadMaterial$1$1", f = "StoryFriendAnniversaryMessageListProtocol.kt", l = {}, m = "invokeSuspend")
public final class C902570Zax extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryFriendAnniversaryCardUISlot LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C902570Zax(StoryFriendAnniversaryCardUISlot storyFriendAnniversaryCardUISlot, InterfaceC1364105Vn<? super C902570Zax> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyFriendAnniversaryCardUISlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C902570Zax(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "StoryFriendAnniversaryCardUISlot@d02a.preloadMaterial$1$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot r0 = r14.LL
            r2 = 1
            r0.LLLFZ = r2
            com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot r0 = r14.LL
            kotlin.jvm.internal.AwS558S0100000_14 r0 = r0.LLLI
            if (r0 == 0) goto L19
            r0.invoke()
        L19:
            com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot r3 = r14.LL
            r13 = 0
            r3.LLLI = r13
            com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget r0 = r3.LLLF
            if (r0 == 0) goto L8d
            java.lang.String r5 = r0.celebratingUserId
            if (r5 == 0) goto L8d
            java.lang.Class<com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService> r8 = com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService.class
            r9 = 0
            r12 = 14
            r10 = r9
            r11 = r9
            java.lang.Object r6 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService r6 = (com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService) r6
            if (r6 == 0) goto L96
            android.view.View r0 = r3.LJJIJL()
            android.content.Context r4 = r0.getContext()
            com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService r1 = r3.op()
            if (r1 == 0) goto L93
            java.lang.String r0 = X.C461720I8s.LIZIZ()
            X.0Zae r0 = r1.LIZ(r0)
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget r0 = r3.LLLF
            long r0 = X.C902380Zae.LIZIZ(r0)
        L53:
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            kotlin.Pair r1 = r6.LIZIZ(r4, r0, r5, r13)
            if (r1 == 0) goto L97
            java.lang.Object r0 = r1.getSecond()
            X.06pj r0 = (X.InterfaceC1728106pj) r0
        L63:
            r3.LLL = r0
            if (r1 == 0) goto L7f
            java.lang.Object r0 = r1.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L7f
            X.06pj r1 = r3.LLL
            if (r1 == 0) goto L7f
            X.0npO r0 = new X.0npO
            r0.<init>(r3)
            r1.LIZJ(r0)
        L7f:
            X.06pj r2 = r3.LLL
            if (r2 == 0) goto L8d
            kotlin.jvm.internal.AwS558S0100000_14 r1 = new kotlin.jvm.internal.AwS558S0100000_14
            r0 = 1122(0x462, float:1.572E-42)
            r1.<init>(r3, r0)
            r2.LIZIZ(r1, r13)
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L93:
            r0 = 0
            goto L53
        L96:
            r1 = r13
        L97:
            r0 = r13
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C902570Zax.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
