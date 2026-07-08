package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329060CvA extends C09AY implements Function1<C329050Cv9, Unit> {
    public final /* synthetic */ TakoNimbleVM LL;
    public final /* synthetic */ EnumC328990Cv3 LLILLJJLI;
    public final /* synthetic */ C329020Cv6 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Integer>> LLILZIL;
    public final /* synthetic */ Function1<LoadMoreResponse, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C329060CvA(TakoNimbleVM takoNimbleVM, EnumC328990Cv3 enumC328990Cv3, C329020Cv6 c329020Cv6, int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn, Function1<? super LoadMoreResponse, Unit> function1) {
        super(1);
        this.LL = takoNimbleVM;
        this.LLILLJJLI = enumC328990Cv3;
        this.LLILLL = c329020Cv6;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1364105Vn;
        this.LLILZLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C329050Cv9 c329050Cv9) {
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LL);
        TakoNimbleVM takoNimbleVM = this.LL;
        C09U0 c09u0 = takoNimbleVM.LLILLJJLI;
        if (c09u0 == null) {
            synchronized (takoNimbleVM) {
                c09u0 = takoNimbleVM.LLILLJJLI;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    takoNimbleVM.LLILLJJLI = c09u0;
                }
            }
        }
        C23250099c.LIZLLL(viewModelScope, c09u0.LIZ, null, new C328970Cv1(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null), 2);
        return Unit.LIZ;
    }
}
