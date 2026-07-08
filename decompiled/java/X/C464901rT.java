package X;

import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel$init$1", f = "PostModePageViewModel.kt", l = {173}, m = "invokeSuspend")
public final class C464901rT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PostModePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C464901rT(PostModePageViewModel postModePageViewModel, InterfaceC1364105Vn<? super C464901rT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = postModePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C464901rT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModePageViewModel@b564.init$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(800L, this) == objLJFF) {
                C1C7U.LIZIZ("PostModePageViewModel@b564.init$1");
                return objLJFF;
            }
        }
        if (!Intrinsics.LJFF(this.LLILLJJLI.xQ2().getValue(), true)) {
            this.LLILLJJLI.xQ2().setValue(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModePageViewModel@b564.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
