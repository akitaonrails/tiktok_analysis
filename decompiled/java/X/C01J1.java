package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01J1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget$onPlayBannerChange$1", f = "BaseCountDownForAllV2Widget.kt", l = {194}, m = "invokeSuspend")
public final class C01J1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CountdownForAllContent LLILLL;
    public final /* synthetic */ BaseCountDownForAllV2Widget<BaseCountDownForAllV2ViewModel> LLILZ;
    public final /* synthetic */ User LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01J1(String str, CountdownForAllContent countdownForAllContent, BaseCountDownForAllV2Widget<BaseCountDownForAllV2ViewModel> baseCountDownForAllV2Widget, User user, Long l, InterfaceC1364105Vn<? super C01J1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = countdownForAllContent;
        this.LLILZ = baseCountDownForAllV2Widget;
        this.LLILZIL = user;
        this.LLILZLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01J1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
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
            java.lang.String r3 = "BaseCountDownForAllV2Widget@92b1.onPlayBannerChange$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 != r1) goto L59
            X.C155000ia.LIZIZ(r8)
        L14:
            java.util.List r8 = (java.util.List) r8
        L16:
            webcast.data.multi_guest_play.CountdownForAllContent r4 = r11.LLILLL
            if (r4 == 0) goto L3b
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget<com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel> r0 = r11.LLILZ
            com.bytedance.android.live.base.model.user.User r7 = r11.LLILZIL
            java.lang.Long r1 = r11.LLILZLL
            X.01Io r2 = r0.LLILZIL
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel r0 = r0.LL
            r9 = 0
            if (r0 == 0) goto L41
            long r5 = r0.zQ2()
        L2c:
            if (r1 == 0) goto L32
            long r9 = r1.longValue()
        L32:
            org.json.JSONObject r1 = X.C01JX.LJ(r4, r5, r7, r8, r9)
            java.lang.String r0 = "PlayBannerInfoChange"
            r2.LIZIZ(r0, r1)
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L41:
            r5 = 0
            goto L2c
        L44:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = r11.LLILLJJLI
            if (r0 == 0) goto L57
            r11.LL = r1
            java.lang.Object r8 = X.C01JX.LIZLLL(r0, r11)
            if (r8 != r2) goto L14
            X.C1C7U.LIZIZ(r3)
            return r2
        L57:
            r8 = 0
            goto L16
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01J1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
