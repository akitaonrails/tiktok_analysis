package X;

import android.app.Activity;
import android.text.Spannable;
import com.bytedance.android.livesdk.model.message.GuideTaskMessage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$handleToastMessage$1", f = "IncentivePreRewardUtils.kt", l = {77}, m = "invokeSuspend")
public final class C437701n5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GuideTaskMessage LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ Spannable LLILZ;
    public final /* synthetic */ C437801n6 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437701n5(GuideTaskMessage guideTaskMessage, Activity activity, Spannable spannable, C437801n6 c437801n6, InterfaceC1364105Vn<? super C437701n5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = guideTaskMessage;
        this.LLILLL = activity;
        this.LLILZ = spannable;
        this.LLILZIL = c437801n6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437701n5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZIZ;
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleToastMessage$1");
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
            long j = this.LLILLJJLI.displaySecond;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleToastMessage$1");
                return objLJFF;
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
        c1389890mGx.LJIIJ(this.LLILZ);
        C437801n6 c437801n6 = this.LLILZIL;
        if (c437801n6 != null) {
            Activity activity = this.LLILLL;
            Integer num = c437801n6.LIZIZ;
            if (num != null) {
                iLIZIZ = num.intValue();
            } else {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9i, activity);
            }
            c1389890mGx.LJFF(c437801n6.LIZ);
            c1389890mGx.LJI(iLIZIZ);
        }
        C100U.LIZ(c1389890mGx);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleToastMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
