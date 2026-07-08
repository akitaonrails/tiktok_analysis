package X;

import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeDetailPopupComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NU5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeDetailPopupComponent$loadMoreUiListener$1$onHide$2", f = "OfflineModePopupComponent.kt", l = {305}, m = "invokeSuspend")
public final class C0NU5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeDetailPopupComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NU5(OfflineModeDetailPopupComponent offlineModeDetailPopupComponent, InterfaceC1364105Vn<? super C0NU5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeDetailPopupComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NU5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C1C7U.LIZ("OfflineModeDetailPopupComponent@4ba8.loadMoreUiListener$1$onHide$2");
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
            OfflineModeListVM offlineModeListVMOo = this.LLILLJJLI.oo();
            if (offlineModeListVMOo != null) {
                this.LL = 1;
                obj = offlineModeListVMOo.BQ2(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeDetailPopupComponent@4ba8.loadMoreUiListener$1$onHide$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OfflineModeDetailPopupComponent@4ba8.loadMoreUiListener$1$onHide$2");
            return unit;
        }
        if (!((Boolean) obj).booleanValue() && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.LLILZ.getValue()) != null) {
            Boolean.valueOf(iViewPagerComponentAbility.CL2(0, false));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeDetailPopupComponent@4ba8.loadMoreUiListener$1$onHide$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
