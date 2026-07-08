package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GoLiveParamsListener$initFaceDetectListener$1$1$onMessageReceived$2", f = "GoLiveParamsListener.kt", l = {}, m = "invokeSuspend")
public final class C769980UIi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C769960UIg LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C769980UIi(C769960UIg c769960UIg, String str, InterfaceC1364105Vn<? super C769980UIi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c769960UIg;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C769980UIi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1$1$onMessageReceived$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C769960UIg c769960UIg = this.LL;
        C769990UIj c769990UIj = c769960UIg.LLJILJILJ;
        if (c769990UIj != null) {
            c769960UIg.LJIIL(c769990UIj);
        }
        C769960UIg c769960UIg2 = this.LL;
        c769960UIg2.LLJILJILJ = null;
        c769960UIg2.LLILLL.LIZIZ(this.LLILLJJLI);
        C769960UIg c769960UIg3 = this.LL;
        c769960UIg3.LLJJJ = 0;
        c769960UIg3.LLJILLL.set(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1$1$onMessageReceived$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
