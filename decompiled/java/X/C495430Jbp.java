package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Jbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageForSubMethod$onActivityResult$1$1$1$1", f = "ChooseImageForSubMethod.kt", l = {84}, m = "invokeSuspend")
public final class C495430Jbp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ IHostSubscription LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ List<LiveSubMediaModel> LLILZIL;
    public final /* synthetic */ IHostSubscription.Params LLILZLL;
    public final /* synthetic */ C495440Jbq LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495430Jbp(IHostSubscription iHostSubscription, Fragment fragment, List<LiveSubMediaModel> list, IHostSubscription.Params params, C495440Jbq c495440Jbq, InterfaceC1364105Vn<? super C495430Jbp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iHostSubscription;
        this.LLILZ = fragment;
        this.LLILZIL = list;
        this.LLILZLL = params;
        this.LLIZ = c495440Jbq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495430Jbp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ChooseImageForSubMethod@6da.onActivityResult$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            try {
                c098200Yq = this.LLILLL.T62(this.LLILZ, this.LLILZIL, this.LLILZLL, false);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C495440Jbq c495440Jbq = this.LLIZ;
            IHostSubscription.Params params = this.LLILZLL;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C495420Jbo c495420Jbo = new C495420Jbo(c495440Jbq, (IHostSubscription.Result) c098200Yq, params, null);
                this.LL = c098200Yq;
                this.LLILLJJLI = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c495420Jbo) == objLJFF) {
                    C1C7U.LIZIZ("ChooseImageForSubMethod@6da.onActivityResult$1$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseImageForSubMethod@6da.onActivityResult$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
