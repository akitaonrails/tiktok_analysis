package X;

import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarDiggViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0010100_11;
import njp.a;

/* JADX INFO: renamed from: X.0SYK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarDiggViewModel$onItemDiggFailed$1", f = "TitlePanelBottomBarDiggVM.kt", l = {}, m = "invokeSuspend")
public final class C0SYK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TitlePanelBottomBarDiggViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SYK(TitlePanelBottomBarDiggViewModel titlePanelBottomBarDiggViewModel, InterfaceC1364105Vn<? super C0SYK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = titlePanelBottomBarDiggViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SYK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TitlePanelBottomBarDiggViewModel@648d.onItemDiggFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TitlePanelBottomBarDiggViewModel titlePanelBottomBarDiggViewModel = this.LL;
        if (!titlePanelBottomBarDiggViewModel.LLILLJJLI) {
            titlePanelBottomBarDiggViewModel.LLILLL++;
            z = true;
        } else {
            titlePanelBottomBarDiggViewModel.LLILLL--;
            z = false;
        }
        this.LL.setState(new AwS0S0010100_11(titlePanelBottomBarDiggViewModel.xQ2(titlePanelBottomBarDiggViewModel.LL, z), z, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TitlePanelBottomBarDiggViewModel@648d.onItemDiggFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
