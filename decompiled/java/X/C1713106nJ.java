package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.route.EcMallRouteInterceptor$tryToClearAboveActivities$1", f = "EcMallRouteInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1713106nJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713106nJ(Context context, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713106nJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        int length;
        int i;
        C1C7U.LIZ("EcMallRouteInterceptor@558f.tryToClearAboveActivities$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            int length2 = abstractC1387200mCcArrLJII.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (abstractC1387200mCcArrLJII[i2].LIZ instanceof InterfaceC1711206n0) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0 && i2 < abstractC1387200mCcArrLJII.length - 1 && (i = i2 + 1) <= abstractC1387200mCcArrLJII.length - 1) {
                while (true) {
                    if (!this.LL || !Intrinsics.LJFF(this.LLILLJJLI, abstractC1387200mCcArrLJII[length].LIZIZ())) {
                        abstractC1387200mCcArrLJII[length].LIZ();
                    }
                    if (length == i) {
                        break;
                    }
                    length--;
                }
            }
            IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
            if (iEcUgPopupService != null && iEcUgPopupService.I8(this.LLILLL) && (activityLIZ = C2421209eE.LIZ()) != null) {
                C1713206nK.LIZ(activityLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallRouteInterceptor@558f.tryToClearAboveActivities$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
