package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel$sendSeeXXXShowEvent$1", f = "TranslationStatusViewModel.kt", l = {212}, m = "invokeSuspend")
public final class C710230RtV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0S5P LLILLJJLI;
    public final /* synthetic */ TranslationStatusViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710230RtV(C0S5P c0s5p, TranslationStatusViewModel translationStatusViewModel, InterfaceC1364105Vn<? super C710230RtV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0s5p;
        this.LLILLL = translationStatusViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710230RtV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2217421BqW c0s5y;
        C1C7U.LIZ("TranslationStatusViewModel@c9c1.sendSeeXXXShowEvent$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationStatusViewModel@c9c1.sendSeeXXXShowEvent$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI instanceof C0S5L) {
            c0s5y = new C0S5X(this.LLILLL);
        } else {
            c0s5y = new C0S5Y(this.LLILLL);
        }
        this.LLILLL.setState(new C710240RtW(c0s5y));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationStatusViewModel@c9c1.sendSeeXXXShowEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
