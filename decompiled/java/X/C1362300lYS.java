package X;

import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel$onLoadSuccess$2$1", f = "SharePanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1362300lYS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SharePanelViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362300lYS(SharePanelViewModel sharePanelViewModel, InterfaceC1364105Vn<? super C1362300lYS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sharePanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362300lYS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelViewModel@b2e1.onLoadSuccess$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccessWithoutSort before callback: ");
        sbLIZ.append(this.LL.LJIIJJI().size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LL.LLJJIJI);
        C1720006oQ.LJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
        SharePanelViewModel sharePanelViewModel = this.LL;
        InterfaceC1356390lOv interfaceC1356390lOv = sharePanelViewModel.LLILLJJLI;
        if (interfaceC1356390lOv != null) {
            interfaceC1356390lOv.jR(sharePanelViewModel.LJIIJJI());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelViewModel@b2e1.onLoadSuccess$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
