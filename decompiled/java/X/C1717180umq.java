package X;

import android.app.Activity;
import com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerCommon;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0umq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerCommon$doAfterTTPayActivated$11", f = "TTPayOnBoardingManagerCommon.kt", l = {214}, m = "invokeSuspend")
public final class C1717180umq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTPayOnBoardingManagerCommon LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717180umq(TTPayOnBoardingManagerCommon tTPayOnBoardingManagerCommon, InterfaceC1364105Vn<? super C1717180umq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTPayOnBoardingManagerCommon;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717180umq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("TTPayOnBoardingManagerCommon@2d28.doAfterTTPayActivated$11");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = C1717290un1.LIZ().activatedToastSetting.delayTimeMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TTPayOnBoardingManagerCommon@2d28.doAfterTTPayActivated$11");
                return objLJFF;
            }
        }
        TTPayOnBoardingManagerCommon tTPayOnBoardingManagerCommon = this.LLILLJJLI;
        if (tTPayOnBoardingManagerCommon.LLJI == C0XE4.L1) {
            string = tTPayOnBoardingManagerCommon.LLJJI.getString(2131840372);
        } else {
            string = tTPayOnBoardingManagerCommon.LLJJI.getString(2131840371);
        }
        AbstractC1387200mCc top = C1717770unn.LIZIZ().getTop();
        if (top != null && (activityLIZIZ = top.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LIZ.LIZ.LJI = false;
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTPayOnBoardingManagerCommon@2d28.doAfterTTPayActivated$11");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
