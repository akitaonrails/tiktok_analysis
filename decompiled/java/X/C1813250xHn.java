package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel$initAutoPostList$2", f = "AutoPostLivingViewModel.kt", l = {126}, m = "invokeSuspend")
public final class C1813250xHn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AutoPostLivingViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813250xHn(AutoPostLivingViewModel autoPostLivingViewModel, String str, InterfaceC1364105Vn<? super C1813250xHn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = autoPostLivingViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813250xHn c1813250xHn = new C1813250xHn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1813250xHn.LLILLJJLI = obj;
        return c1813250xHn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AutoPostLivingViewModel@933.initAutoPostList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLL.setState(AFwS269S0000000_27.get$arr$(345));
                AutoPostLivingViewModel autoPostLivingViewModel = this.LLILLL;
                String str = this.LLILZ;
                C20441214yg.LIZIZ("AutoPostLivingViewModel", "InitData");
                C1813610xIN c1813610xIN = autoPostLivingViewModel.LLJ;
                this.LL = 1;
                if (c1813610xIN.LIZIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoPostLivingViewModel@933.initAutoPostList$2");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AutoPostLivingViewModel autoPostLivingViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C20441214yg.LIZIZ("AutoPostLivingViewModel", "InitData success");
            autoPostLivingViewModel2.setState(AFwS269S0000000_27.get$arr$(346));
        }
        AutoPostLivingViewModel autoPostLivingViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("AutoPostLivingViewModel", "InitData failed", thM5exceptionOrNullimpl);
            autoPostLivingViewModel3.setState(AFwS269S0000000_27.get$arr$(347));
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("AutoPostLivingViewModel@933.initAutoPostList$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
