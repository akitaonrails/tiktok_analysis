package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchcla.core.assem.CLACheckStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchcla.core.assem.CLACheckStatusAssem$onResume$1$1", f = "CLACheckStatusAssem.kt", l = {28}, m = "invokeSuspend")
public final class C2433709gF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CLACheckStatusAssem LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2433709gF(CLACheckStatusAssem cLACheckStatusAssem, Fragment fragment, C19EG c19eg, int i, InterfaceC1364105Vn<? super C2433709gF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cLACheckStatusAssem;
        this.LLILLL = fragment;
        this.LLILZ = c19eg;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2433709gF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CLACheckStatusAssem@1551.onResume$1$1");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CLACheckStatusAssem.LLILLJJLI;
            SearchEllipsisVM searchEllipsisVM = (SearchEllipsisVM) assemVMLazy.getValue();
            Fragment fragment = this.LLILLL;
            C19EG c19eg = this.LLILZ;
            int i2 = this.LLILZIL;
            this.LL = 1;
            if (searchEllipsisVM.vQ2(fragment, c19eg, i2, this) == objLJFF) {
                C1C7U.LIZIZ("CLACheckStatusAssem@1551.onResume$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CLACheckStatusAssem@1551.onResume$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
