package X;

import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS236S0300000_27;
import njp.a;

/* JADX INFO: renamed from: X.0x8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel$onReceiveJsEvent$1", f = "PackageListViewModel.kt", l = {243}, m = "invokeSuspend")
public final class C1807650x8l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PackageListViewModel LLILLJJLI;
    public final /* synthetic */ C262100zr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807650x8l(PackageListViewModel packageListViewModel, C262100zr c262100zr, InterfaceC1364105Vn<? super C1807650x8l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = packageListViewModel;
        this.LLILLL = c262100zr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1807650x8l(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> logExtra;
        C1C7U.LIZ("PackageListViewModel@3cda.onReceiveJsEvent$1");
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
            EnumC1803160x1W enumC1803160x1W = EnumC1803160x1W.NON_USE;
            RechargePanelInputParams inputParams = this.LLILLJJLI.LL.getInputParams();
            TouchPointAbility touchPointAbility = this.LLILLJJLI.LLILLJJLI;
            if (touchPointAbility != null) {
                logExtra = touchPointAbility.getLogExtra();
            } else {
                logExtra = null;
            }
            this.LL = 1;
            obj = C1151360g4E.LJI(enumC1803160x1W, inputParams, logExtra, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PackageListViewModel@3cda.onReceiveJsEvent$1");
                return objLJFF;
            }
        }
        PackageListViewModel packageListViewModel = this.LLILLJJLI;
        packageListViewModel.withState(new AwS236S0300000_27(this.LLILLL, packageListViewModel, (C1804840x4E) obj, 11));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PackageListViewModel@3cda.onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
