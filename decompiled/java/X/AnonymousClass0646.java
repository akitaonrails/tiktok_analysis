package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0646, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser$parse$3", f = "InstantCloneParser.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0646 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Intent LLILLJJLI;
    public final /* synthetic */ C0MOS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0646(Context context, Intent intent, C0MOS c0mos, InterfaceC1364105Vn<? super AnonymousClass0646> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = intent;
        this.LLILLL = c0mos;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0646(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        C1C7U.LIZ("InstantCloneParser@3cac.parse$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
        Context context = this.LL;
        Bundle extras2 = null;
        try {
            extras = this.LLILLJJLI.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        iLayoutPreloadServiceForEditPage.preloadLayoutFiles(context, extras);
        Context context2 = this.LL;
        Intent intent = this.LLILLJJLI;
        if (intent != null) {
            try {
                extras2 = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C0MWH.LJIILLIIL(context2, extras2);
        C01TT.LIZLLL(new AwS546S0100000_2(this.LLILLL, 1098));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantCloneParser@3cac.parse$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
