package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;
import njp.a;

/* JADX INFO: renamed from: X.17r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.popuptask.task.EcMixMallInternalHybridPopupTask$handlePopupTaskExecute$2$popupView$1$onLoadSuccess$2", f = "EcMixMallInternalHybridPopupTask.kt", l = {398}, m = "invokeSuspend")
public final class C21158117r1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC21155717qd LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ FrameLayout LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21158117r1(ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd, Function0<Unit> function0, FrameLayout frameLayout, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1364105Vn<? super C21158117r1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewTreeObserverOnGlobalLayoutListenerC21155717qd;
        this.LLILLL = function0;
        this.LLILZ = frameLayout;
        this.LLILZIL = function02;
        this.LLILZLL = function03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21158117r1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$2$popupView$1$onLoadSuccess$2");
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
            if (this.LLILLJJLI.LLILLL.LIZ()) {
                if (!this.LLILLJJLI.LL.LIZLLL.K4()) {
                    this.LLILLL.invoke();
                    ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = this.LLILLJJLI;
                    this.LL = 1;
                    C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    new AwS576S0100000_32(viewTreeObserverOnGlobalLayoutListenerC21155717qd, 16);
                    viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJILJIL = c2252611DEt;
                    Object objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLJIJ == objLJFF) {
                        C1C7U.LIZIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$2$popupView$1$onLoadSuccess$2");
                        return objLJFF;
                    }
                }
                ((InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class)).LIZJ(this.LLILLJJLI);
            }
            C786410Ut5.LJZ(0, this.LLILZ);
            this.LLILZIL.invoke();
            this.LLILZLL.invoke();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$2$popupView$1$onLoadSuccess$2");
            return unit;
        }
        this.LLILLJJLI.LLJILJIL = null;
        ((InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class)).LIZJ(this.LLILLJJLI);
        C786410Ut5.LJZ(0, this.LLILZ);
        this.LLILZIL.invoke();
        this.LLILZLL.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$2$popupView$1$onLoadSuccess$2");
        return unit2;
    }
}
