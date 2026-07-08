package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x4G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$loadItems$1$1$1", f = "RechargePanelBodyViewModel.kt", l = {353}, m = "invokeSuspend")
public final class C1804860x4G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1781150wS1>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;
    public final /* synthetic */ C1804420x3Y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804860x4G(RechargePanelBodyViewModel rechargePanelBodyViewModel, C1804420x3Y c1804420x3Y, InterfaceC1364105Vn<? super C1804860x4G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
        this.LLILLL = c1804420x3Y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1804860x4G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.loadItems$1$1$1");
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
            InterfaceC1804490x3f interfaceC1804490x3f = this.LLILLJJLI.LL;
            C1804420x3Y c1804420x3Y = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1804490x3f.LJ(c1804420x3Y, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.loadItems$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.loadItems$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1781150wS1> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
