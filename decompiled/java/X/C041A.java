package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.041A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041A extends C09AY implements InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> {
    public final /* synthetic */ PdpViewModel LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C041A(PdpViewModel pdpViewModel, View view, View view2) {
        super(4);
        this.LL = pdpViewModel;
        this.LLILLJJLI = view;
        this.LLILLL = view2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, String str, Object obj, ExceptionUX exceptionUX) {
        bool.booleanValue();
        PdpViewModel pdpViewModel = this.LL;
        pdpViewModel.LLJJJJLIIL = true;
        C948503nH.LJFF(pdpViewModel, C23271099x.INSTANCE, new C454501pn(pdpViewModel, this.LLILLJJLI, obj, this.LLILLL, null));
        return Unit.LIZ;
    }
}
