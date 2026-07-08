package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01J7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget$onCreate$2$1$1$1", f = "CountDownForAllV2GuestWidget.kt", l = {63}, m = "invokeSuspend")
public final class C01J7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CountDownForAllV2GuestWidget LLILLL;
    public final /* synthetic */ CountdownForAllContent LLILZ;
    public final /* synthetic */ User LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01J7(User user, CountDownForAllV2GuestWidget countDownForAllV2GuestWidget, String str, InterfaceC1364105Vn interfaceC1364105Vn, CountdownForAllContent countdownForAllContent) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = countDownForAllV2GuestWidget;
        this.LLILZ = countdownForAllContent;
        this.LLILZIL = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C01J7(this.LLILZIL, this.LLILLL, str, interfaceC1364105Vn, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r13
            java.lang.String r4 = "CountDownForAllV2GuestWidget@fd.onCreate$2$1$1$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LL
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            if (r0 != r1) goto L4e
            X.C155000ia.LIZIZ(r9)
        L15:
            java.util.List r9 = (java.util.List) r9
        L17:
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget r0 = r12.LLILLL
            X.01Io r1 = r0.LLILZIL
            webcast.data.multi_guest_play.CountdownForAllContent r5 = r12.LLILZ
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel r0 = r0.LL
            if (r0 == 0) goto L36
            long r6 = r0.zQ2()
        L25:
            com.bytedance.android.live.base.model.user.User r8 = r12.LLILZIL
            r10 = 0
            org.json.JSONObject r0 = X.C01JX.LJ(r5, r6, r8, r9, r10)
            r1.LIZIZ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L36:
            r6 = 0
            goto L25
        L39:
            X.C155000ia.LIZIZ(r9)
            java.lang.String r0 = r12.LLILLJJLI
            if (r0 == 0) goto L4c
            r12.LL = r1
            java.lang.Object r9 = X.C01JX.LIZLLL(r0, r12)
            if (r9 != r3) goto L15
            X.C1C7U.LIZIZ(r4)
            return r3
        L4c:
            r9 = r2
            goto L17
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01J7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
