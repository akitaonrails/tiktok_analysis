package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.fundraiser.FundraiserPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.pages.fundraiser.FundraiserPageFragment$onViewCreated$3", f = "FundraiserPageFragment.kt", l = {123}, m = "invokeSuspend")
public final class C860350Xp3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FundraiserPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860350Xp3(FundraiserPageFragment fundraiserPageFragment, InterfaceC1364105Vn<? super C860350Xp3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fundraiserPageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860350Xp3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FundraiserPageFragment@2c9d.onViewCreated$3");
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
            FundraiserPageFragment fundraiserPageFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C860360Xp4 c860360Xp4 = new C860360Xp4(fundraiserPageFragment, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(fundraiserPageFragment, state, c860360Xp4, this) == objLJFF) {
                C1C7U.LIZIZ("FundraiserPageFragment@2c9d.onViewCreated$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FundraiserPageFragment@2c9d.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
