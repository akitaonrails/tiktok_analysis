package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0658, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.MainPageFragment$onTabSwitched$1", f = "MainPageFragment.kt", l = {837}, m = "invokeSuspend")
public final class AnonymousClass0658 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MainPageFragment LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0658(MainPageFragment mainPageFragment, Fragment fragment, InterfaceC1364105Vn<? super AnonymousClass0658> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mainPageFragment;
        this.LLILLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0658(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainPageFragment@c096.onTabSwitched$1");
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
            if (C1D0F.LIZ.isConnected()) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                AnonymousClass0659 anonymousClass0659 = new AnonymousClass0659(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, anonymousClass0659) == objLJFF) {
                    C1C7U.LIZIZ("MainPageFragment@c096.onTabSwitched$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainPageFragment@c096.onTabSwitched$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
