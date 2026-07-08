package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.linkshare.ImageLinkShareOperator$openIMContactSharePanel$1$1", f = "ImageLinkShareOperator.kt", l = {387}, m = "invokeSuspend")
public final class C1509905vd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1509905vd(String str, InterfaceC1364105Vn<? super C1509905vd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1509905vd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("ImageLinkShareOperator@4b3b.openIMContactSharePanel$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("ImageLinkShareOperator@4b3b.openIMContactSharePanel$1$1");
                return objLJFF;
            }
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, this.LLILLJJLI);
            smartRouteBuildRoute.addFlags(268468224);
            smartRouteBuildRoute.open();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageLinkShareOperator@4b3b.openIMContactSharePanel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
