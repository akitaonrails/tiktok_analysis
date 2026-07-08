package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Svz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesManager$fetchSecretRepliesViewerListPaginated$2", f = "SecretRepliesManager.kt", l = {79}, m = "invokeSuspend")
public final class C737250Svz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C737240Svy LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C737250Svz(String str, C737240Svy c737240Svy, Aweme aweme, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C737250Svz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c737240Svy;
        this.LLILZ = aweme;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737250Svz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r7 = "SecretRepliesManager@ff73.fetchSecretRepliesViewerListPaginated$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r15.LL
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L9b
            X.C155000ia.LIZIZ(r16)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L19:
            X.C155000ia.LIZIZ(r16)
            java.lang.String r3 = r15.LLILLJJLI
            X.0Svy r0 = r15.LLILLL
            X.0Sw2 r0 = r0.LJFF()
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.LIZ
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L2e
            java.lang.String r0 = ""
        L2e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r6 = 0
            if (r0 == 0) goto L49
            X.0Svy r0 = r15.LLILLL
            X.0Sw2 r0 = r0.LJFF()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L49
            int r6 = r0.intValue()
        L49:
            X.0Svy r0 = r15.LLILLL
            X.0Sw2 r3 = r0.LJFF()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.LLILZ
            r3.getClass()
            if (r0 == 0) goto L74
            java.lang.String r5 = r0.getAid()     // Catch: java.lang.Exception -> L70
            if (r5 == 0) goto L74
            com.ss.android.ugc.aweme.social.sticker.service.secretreplies.SecretRepliesApi r4 = com.ss.android.ugc.aweme.social.sticker.service.secretreplies.SecretRepliesApi.LIZIZ     // Catch: java.lang.Exception -> L70
            r3 = 3
            r0 = 10
            X.0X9S r0 = r4.fetchStickerInteractionDetails(r5, r3, r0, r6)     // Catch: java.lang.Exception -> L70
            X.0X52 r0 = r0.execute()     // Catch: java.lang.Exception -> L70
            T r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L70
            com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResp r0 = (com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResp) r0     // Catch: java.lang.Exception -> L70
            com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResult r9 = r0.secretReplyResult     // Catch: java.lang.Exception -> L70
            goto L75
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L74:
            r9 = 0
        L75:
            if (r9 != 0) goto L7d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L7d:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0Svx r8 = new X.0Svx
            X.0Svy r10 = r15.LLILLL
            java.lang.String r11 = r15.LLILLJJLI
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r12 = r15.LLILZIL
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r15.LLILZ
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r15.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r15, r0, r8)
            if (r0 != r1) goto L13
            X.C1C7U.LIZIZ(r7)
            return r1
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C737250Svz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
