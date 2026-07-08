package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0afF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943670afF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C944860ahA LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ EnumC943790afR LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ LinkMicAnchorGuideMessage LLILZIL;
    public final /* synthetic */ C955440ayE LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943670afF(C944860ahA c944860ahA, User user, EnumC943790afR enumC943790afR, String str, LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, C955440ayE c955440ayE) {
        super(0);
        this.LL = c944860ahA;
        this.LLILLJJLI = user;
        this.LLILLL = enumC943790afR;
        this.LLILZ = str;
        this.LLILZIL = linkMicAnchorGuideMessage;
        this.LLILZLL = c955440ayE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[PHI: r4
      0x00b0: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:7:0x0031, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r6 = this;
            X.0ahA r3 = r6.LL
            com.bytedance.android.live.base.model.user.User r2 = r6.LLILLJJLI
            X.0afR r1 = r6.LLILLL
            java.lang.String r0 = r6.LLILZ
            r3.LJIIJ(r2, r1, r0)
            X.0ahA r1 = r6.LL
            int r0 = r1.LLLIIL
            r3 = 1
            int r0 = r0 + 1
            r1.LLLIIL = r0
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            java.lang.String r5 = ""
            if (r2 == 0) goto L30
            long r0 = r2.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto Lb0
        L30:
            r4 = r5
            if (r2 != 0) goto Lb0
        L33:
            com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage r0 = r6.LLILZIL
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            r2 = 0
            if (r0 == 0) goto Lae
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L42:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_icon"
            X.C925600aC6.LJJ(r4, r5, r0, r2, r1)
            java.lang.String r0 = "online_friend_icon"
            X.C925600aC6.LJIIIIZZ(r0)
            X.0ayE r2 = r6.LLILZLL
            com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage r0 = r6.LLILZIL
            int r0 = r0.guideType
            r2.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "scene"
            r2.LJIIL(r1, r0, r3)
            java.lang.String r0 = "guide_message_popup"
            r2.LJIJJLI(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r4 = "room_id = "
            r1.append(r4)
            java.lang.Long r0 = X.C930540aK4.LJIIJ()
            r1.append(r0)
            java.lang.String r3 = " friend_show = "
            r1.append(r3)
            X.0ahA r0 = r6.LL
            int r0 = r0.LLLIIL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "OnlineFriendPrompt"
            X.C20441214yg.LJIIIZ(r2, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            java.lang.Long r0 = X.C930540aK4.LJIIJ()
            r1.append(r0)
            r1.append(r3)
            X.0ahA r0 = r6.LL
            int r0 = r0.LLLIIL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            r0 = r2
            goto L42
        Lb0:
            java.lang.String r5 = r2.getIdStr()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943670afF.invoke():java.lang.Object");
    }
}
