package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$assembleMixStudioEntrance$1", f = "ChatroomInputButton.kt", l = {306, 314}, m = "invokeSuspend")
public final class C441780HUa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioLauncher LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<C434130H0p> LLILZ;
    public final /* synthetic */ IEmojiBtnAbility LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441780HUa(MixStudioLauncher mixStudioLauncher, SessionInfo sessionInfo, InterfaceC332260D0u<C434130H0p> interfaceC332260D0u, IEmojiBtnAbility iEmojiBtnAbility, InterfaceC1364105Vn<? super C441780HUa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioLauncher;
        this.LLILLL = sessionInfo;
        this.LLILZ = interfaceC332260D0u;
        this.LLILZIL = iEmojiBtnAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441780HUa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "ChatroomInputButtonKt@5cca.assembleMixStudioEntrance$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 == r6) goto L37
            if (r0 == r5) goto L6b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher r2 = r8.LLILLJJLI
            r9 = 0
            if (r2 == 0) goto L3c
            X.0HTm r1 = X.EnumC441640HTm.TYPING_BOX
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r8.LLILLL
            java.lang.String r0 = r0.getConversationId()
            r8.LL = r6
            java.lang.Object r9 = r2.LIZJ(r1, r0, r9, r8)
            if (r9 != r4) goto L3a
            X.C1C7U.LIZIZ(r7)
            return r4
        L37:
            X.C155000ia.LIZIZ(r9)
        L3a:
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo r9 = (com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo) r9
        L3c:
            X.0D0u<X.0H0p> r3 = r8.LLILZ
        L3e:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.0H0p r1 = (X.C434130H0p) r1
            r0 = 0
            X.0H0p r0 = X.C434130H0p.LIZ(r1, r0, r9, r6)
            boolean r0 = r3.compareAndSet(r2, r0)
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility r0 = r8.LLILZIL
            X.05YD r3 = r0.W90()
            Y.AgS287S0100000_6 r2 = new Y.AgS287S0100000_6
            X.0D0u<X.0H0p> r1 = r8.LLILZ
            r0 = 140(0x8c, float:1.96E-43)
            r2.<init>(r1, r0)
            r8.LL = r5
            java.lang.Object r0 = r3.collect(r2, r8)
            if (r0 != r4) goto L6e
            X.C1C7U.LIZIZ(r7)
            return r4
        L6b:
            X.C155000ia.LIZIZ(r9)
        L6e:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441780HUa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
