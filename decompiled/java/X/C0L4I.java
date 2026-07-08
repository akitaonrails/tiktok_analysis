package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$goEditPage$observeJob$1$3", f = "AutoCutAnchorMediaProcessImpl.kt", l = {}, m = "invokeSuspend")
public final class C0L4I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L4P LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ Intent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4I(C0L4P c0l4p, boolean z, Activity activity, Intent intent, InterfaceC1364105Vn<? super C0L4I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l4p;
        this.LLILLJJLI = z;
        this.LLILLL = activity;
        this.LLILZ = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L4I(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ();
        if (!this.LLILLJJLI) {
            this.LL.LIZLLL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$3");
            return unit;
        }
        if (!this.LLILLL.isFinishing() && !this.LLILLL.isDestroyed()) {
            ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
            Activity activity = this.LLILLL;
            Bundle extras2 = null;
            try {
                extras = this.LLILZ.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            iLayoutPreloadServiceForEditPage.preloadLayoutFiles(activity, extras);
            Activity activity2 = this.LLILLL;
            try {
                extras2 = this.LLILZ.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0MWH.LJIILLIIL(activity2, extras2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$3");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$3");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
