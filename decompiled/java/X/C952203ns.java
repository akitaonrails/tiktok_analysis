package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.utils.SeaPdpScrollOptHandler$preload$1", f = "SeaPdpScrollOptHandler.kt", l = {90}, m = "invokeSuspend")
public final class C952203ns extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C04C5 LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ SeaPdpViewModel LLILZ;
    public final /* synthetic */ RecyclerView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C952203ns(C04C5 c04c5, Activity activity, SeaPdpViewModel seaPdpViewModel, RecyclerView recyclerView, InterfaceC1364105Vn<? super C952203ns> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c04c5;
        this.LLILLL = activity;
        this.LLILZ = seaPdpViewModel;
        this.LLILZIL = recyclerView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C952203ns(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpScrollOptHandler@88a9.preload$1");
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
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpScrollOptHandler@88a9.preload$1");
                return objLJFF;
            }
        }
        C04C5 c04c5 = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel = this.LLILZ;
        c04c5.getClass();
        seaPdpViewModel.iR2(new AwS367S0200000_1(c04c5, activity, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        C04C5 c04c52 = this.LLILLJJLI;
        Activity activity2 = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel2 = this.LLILZ;
        c04c52.getClass();
        seaPdpViewModel2.iR2(new AwS367S0200000_1(c04c52, activity2, 298));
        C04C5 c04c53 = this.LLILLJJLI;
        SeaPdpViewModel seaPdpViewModel3 = this.LLILZ;
        RecyclerView recyclerView = this.LLILZIL;
        c04c53.getClass();
        if (recyclerView != null) {
            seaPdpViewModel3.iR2(new AwS367S0200000_1(c04c53, recyclerView.getContext(), 299));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpScrollOptHandler@88a9.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
