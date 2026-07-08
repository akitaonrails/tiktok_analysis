package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06kA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$tryPinBotChatToTop$1", f = "BotDetailViewModel.kt", l = {166}, m = "invokeSuspend")
public final class C1693606kA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BotDetailViewModel LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693606kA(boolean z, BotDetailViewModel botDetailViewModel, Activity activity, InterfaceC1364105Vn<? super C1693606kA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = botDetailViewModel;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1693606kA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "BotDetailViewModel@6175.tryPinBotChatToTop$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L21
            if (r0 != r5) goto La4
            X.C155000ia.LIZIZ(r9)
        L13:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L40
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L21:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILLJJLI
            if (r0 == 0) goto L40
            X.1DFB r4 = X.C0PEM.LIZJ
            X.06kB r3 = new X.06kB
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel r2 = r8.LLILLL
            android.app.Activity r1 = r8.LLILZ
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LL = r5
            java.lang.Object r9 = X.C23250099c.LJI(r8, r4, r3)
            if (r9 != r6) goto L13
            X.C1C7U.LIZIZ(r7)
            return r6
        L40:
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel r5 = r8.LLILLL
            boolean r4 = r8.LLILLJJLI
            r5.getClass()
            kotlin.jvm.internal.AwS17S0010000_2 r1 = new kotlin.jvm.internal.AwS17S0010000_2
            r0 = 12
            r1.<init>(r4, r0)
            r5.setState(r1)
            X.0Zr8 r0 = com.ss.android.ugc.aweme.im.service.analytics.ILogger.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.ILogger r6 = X.C912600Zr8.LIZ()
            if (r6 == 0) goto L73
            X.01GW r0 = r5.LLILLJJLI
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r4 == 0) goto La1
            java.lang.String r2 = "on"
        L68:
            java.lang.String r1 = "chat_top_click"
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r6.LJFF(r3, r2, r1, r0)
        L73:
            X.0616 r2 = r5.wQ2()
            if (r2 == 0) goto L8d
            X.0629 r0 = com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.06k7 r1 = r0.LIZ()
            X.06ig r0 = r2.getEnterFrom()
            r1.LJIILIIL(r0, r4)
        L8d:
            X.01GW r0 = r5.LLILLL
            java.lang.Object r1 = r0.getValue()
            X.0Ye8 r1 = (X.AbstractC879060Ye8) r1
            if (r1 == 0) goto L1b
            X.06ke r0 = new X.06ke
            r0.<init>()
            r1.LJIILJJIL(r4, r0)
            goto L1b
        La1:
            java.lang.String r2 = "off"
            goto L68
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1693606kA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
