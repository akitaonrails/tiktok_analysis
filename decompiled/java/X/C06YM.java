package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.service.UpvoteBubbleServiceImpl$subscribeEventV2$1", f = "UpvoteBubbleServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C06YM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C13IQ<? extends ReusedAssem<?>> LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YM(C13IQ<? extends ReusedAssem<?>> c13iq, Object obj, InterfaceC1364105Vn<? super C06YM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c13iq;
        this.LLILLJJLI = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.assem.arch.reused.ReusedUIAssem, java.lang.Object] */
    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.assem.arch.reused.ReusedUIAssem, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AssemViewModel<C1358700lSe> assemViewModelLJJIJ;
        Fragment fragmentLIZLLL;
        C1C7U.LIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
            return unit;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
        if (c19egLIZ == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
            return unit2;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(this.LLILLJJLI))) != null) {
            assemViewModelLJJIJ = C1360460lVU.LIZIZ.LJIJI(fragmentLIZLLL);
            if (assemViewModelLJJIJ == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
                return unit3;
            }
        } else {
            assemViewModelLJJIJ = C1360460lVU.LIZIZ.LJJIJ(c19egLIZ);
            if (assemViewModelLJJIJ == null) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
                return unit4;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1004670cFd(new RepostLazyLoadUtil(this.LLILLJJLI, this.LL, assemViewModelLJJIJ), null), 3);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("UpvoteBubbleServiceImpl@4baf.subscribeEventV2$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
