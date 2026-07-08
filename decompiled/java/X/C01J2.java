package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01J2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget$playBannerHelper$1$1$getCompensatorParams$1", f = "BaseCountDownForAllV2Widget.kt", l = {88}, m = "invokeSuspend")
public final class C01J2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CountdownForAllContent LLILLL;
    public final /* synthetic */ BaseCountDownForAllV2Widget<VM> LLILZ;
    public final /* synthetic */ User LLILZIL;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01J2(String str, CountdownForAllContent countdownForAllContent, BaseCountDownForAllV2Widget<VM> baseCountDownForAllV2Widget, User user, Function1<? super JSONObject, Unit> function1, InterfaceC1364105Vn<? super C01J2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = countdownForAllContent;
        this.LLILZ = baseCountDownForAllV2Widget;
        this.LLILZIL = user;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01J2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r8 = r12
            java.lang.String r3 = "BaseCountDownForAllV2Widget@92b1.playBannerHelper$1$1$getCompensatorParams$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L4f
            X.C155000ia.LIZIZ(r8)
        L14:
            java.util.List r8 = (java.util.List) r8
        L16:
            webcast.data.multi_guest_play.CountdownForAllContent r4 = r11.LLILLL
            if (r4 == 0) goto L31
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget<VM> r0 = r11.LLILZ
            com.bytedance.android.live.base.model.user.User r7 = r11.LLILZIL
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r1 = r11.LLILZLL
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel r0 = r0.LL
            if (r0 == 0) goto L37
            long r5 = r0.zQ2()
        L28:
            r9 = 0
            org.json.JSONObject r0 = X.C01JX.LJ(r4, r5, r7, r8, r9)
            r1.invoke(r0)
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L37:
            r5 = 0
            goto L28
        L3a:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = r11.LLILLJJLI
            if (r0 == 0) goto L4d
            r11.LL = r1
            java.lang.Object r8 = X.C01JX.LIZLLL(r0, r11)
            if (r8 != r2) goto L14
            X.C1C7U.LIZIZ(r3)
            return r2
        L4d:
            r8 = 0
            goto L16
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01J2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
