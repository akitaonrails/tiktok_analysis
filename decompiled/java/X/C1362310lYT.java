package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel$onLoadSuccess$2", f = "SharePanelViewModel.kt", l = {236}, m = "invokeSuspend")
public final class C1362310lYT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SharePanelViewModel LLILLJJLI;
    public final /* synthetic */ List<IMContact> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362310lYT(SharePanelViewModel sharePanelViewModel, List<IMContact> list, InterfaceC1364105Vn<? super C1362310lYT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharePanelViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362310lYT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelViewModel@b2e1.onLoadSuccess$2");
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
            this.LLILLJJLI.LJIJJ(this.LLILLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadSuccessWithoutSort before main dispatcher: ");
            sbLIZ.append(this.LLILLJJLI.LJIIJJI().size());
            sbLIZ.append(' ');
            sbLIZ.append(this.LLILLJJLI.LLJJIJI);
            C1720006oQ.LJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
            SharePanelViewModel sharePanelViewModel = this.LLILLJJLI;
            AbstractC2252651DEx abstractC2252651DEx = sharePanelViewModel.LLILZ;
            C1362300lYS c1362300lYS = new C1362300lYS(sharePanelViewModel, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2252651DEx, c1362300lYS) == objLJFF) {
                C1C7U.LIZIZ("SharePanelViewModel@b2e1.onLoadSuccess$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelViewModel@b2e1.onLoadSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
