package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksPanelFragment;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel$launchPreviousPanelFragmentAfterClose$1", f = "AsyncTasksPanelViewModel.kt", l = {255}, m = "invokeSuspend")
public final class C362590EJl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AsyncTasksPanelFragment LLILLJJLI;
    public final /* synthetic */ AsyncTasksPanelViewModel LLILLL;
    public final /* synthetic */ C362580EJk LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362590EJl(AsyncTasksPanelFragment asyncTasksPanelFragment, AsyncTasksPanelViewModel asyncTasksPanelViewModel, C362580EJk c362580EJk, InterfaceC1364105Vn<? super C362590EJl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asyncTasksPanelFragment;
        this.LLILLL = asyncTasksPanelViewModel;
        this.LLILZ = c362580EJk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C362590EJl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.launchPreviousPanelFragmentAfterClose$1");
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
            AsyncTasksPanelFragment asyncTasksPanelFragment = this.LLILLJJLI;
            this.LL = 1;
            if (asyncTasksPanelFragment.aS(false, this) == objLJFF) {
                C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.launchPreviousPanelFragmentAfterClose$1");
                return objLJFF;
            }
        }
        DTResourcePanelFragment<? extends ViewModel> dTResourcePanelFragment = this.LLILLL.LLJJI;
        if (dTResourcePanelFragment != null) {
            C362580EJk c362580EJk = this.LLILZ;
            if (!(dTResourcePanelFragment instanceof AsyncTasksPanelFragment)) {
                c362580EJk.LIZJ(dTResourcePanelFragment);
                dTResourcePanelFragment.RS();
            }
        }
        this.LLILLL.LLJJI = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.launchPreviousPanelFragmentAfterClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
