package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0496, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0496 extends C09AY implements InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> {
    public final /* synthetic */ SeaPdpViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0496(SeaPdpViewModel seaPdpViewModel, String str, View view, Function2<? super Boolean, ? super String, Unit> function2, View view2) {
        super(4);
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = view;
        this.LLILZ = function2;
        this.LLILZIL = view2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, String str, Object obj, ExceptionUX exceptionUX) {
        bool.booleanValue();
        SeaPdpViewModel seaPdpViewModel = this.LL;
        seaPdpViewModel.LLJJJ = true;
        C948503nH.LJFF(seaPdpViewModel, C23271099x.INSTANCE, new AnonymousClass0493(this.LLILLJJLI, seaPdpViewModel, this.LLILLL, obj, this.LLILZ, this.LLILZIL, null));
        return Unit.LIZ;
    }
}
