package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.view.VideoHotSwapOverlayViewHolder$onPaywallFailure$1$1", f = "VideoHotSwapOverlayViewHolder.kt", l = {158}, m = "invokeSuspend")
public final class C0NJT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0S8S LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJT(C0S8S c0s8s, Aweme aweme, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NJT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0s8s;
        this.LLILLL = aweme;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoHotSwapOverlayViewHolder@1964.onPaywallFailure$1$1");
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
            C0S89<Object> c0s89 = this.LLILLJJLI.LIZLLL;
            if (c0s89 != null) {
                List listSingletonList = Collections.singletonList(this.LLILLL);
                this.LL = 1;
                if (c0s89.LJFF(listSingletonList) == objLJFF) {
                    C1C7U.LIZIZ("VideoHotSwapOverlayViewHolder@1964.onPaywallFailure$1$1");
                    return objLJFF;
                }
            }
        }
        this.LLILZ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoHotSwapOverlayViewHolder@1964.onPaywallFailure$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
