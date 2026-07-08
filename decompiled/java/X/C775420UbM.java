package X;

import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;

/* JADX INFO: renamed from: X.0UbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$initLiveParamsListenerTTLH$1", f = "TTLiveBroadcastView.kt", l = {1316}, m = "invokeSuspend")
public final class C775420UbM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ TTLiveBroadcastView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775420UbM(TTLiveBroadcastView tTLiveBroadcastView, InterfaceC1364105Vn<? super C775420UbM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tTLiveBroadcastView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775420UbM(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            C1DFB c1dfb = C0PEM.LIZJ;
            C775430UbN c775430UbN = new C775430UbN(this.LLILLL, null, c259800zU);
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c775430UbN) == objLJFF) {
                C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1");
                return objLJFF;
            }
        }
        TTLiveBroadcastView tTLiveBroadcastView = this.LLILLL;
        T t = c259800zU.element;
        tTLiveBroadcastView.LLJJJJJIL = (C0UJY) t;
        C769960UIg c769960UIg = (C769960UIg) t;
        if (c769960UIg != null) {
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(tTLiveBroadcastView, 511);
            c769960UIg.LLJJIJIIJIL = awS556S0100000_12;
            c769960UIg.LLILLL.LJIILLIIL(new AwS591S0100000_12(awS556S0100000_12, (Function0<Unit>) 630));
        }
        C769960UIg c769960UIg2 = (C769960UIg) c259800zU.element;
        if (c769960UIg2 != null) {
            c769960UIg2.LLILLJJLI.v3(new AwS556S0100000_12(this.LLILLL, 512));
        }
        C769960UIg c769960UIg3 = (C769960UIg) c259800zU.element;
        if (c769960UIg3 != null) {
            c769960UIg3.LLILLJJLI.o3(new AwS591S0100000_12(this.LLILLL, 629));
        }
        TTLiveBroadcastView tTLiveBroadcastView2 = this.LLILLL;
        InterfaceC782930UnT interfaceC782930UnT = tTLiveBroadcastView2.LLJILJIL;
        if (interfaceC782930UnT != null) {
            interfaceC782930UnT.Rs(tTLiveBroadcastView2.LLJJJJJIL);
        }
        InterfaceC782930UnT interfaceC782930UnT2 = this.LLILLL.LLJILJIL;
        if (interfaceC782930UnT2 != null) {
            interfaceC782930UnT2.h8(true);
        }
        this.LLILLL.LLJZ.LJ(EnumC775440UbO.INIT_END.getValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTLiveBroadcastView@6190.initLiveParamsListenerTTLH$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
