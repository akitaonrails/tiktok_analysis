package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$launchRequest$1$2", f = "LandMallProtocol.kt", l = {125}, m = "invokeSuspend")
public final class C1314705Cn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1314705Cn(InterfaceC1364105Vn<? super C1314705Cn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1314705Cn(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMallProtocol@c84d.launchRequest$1$2");
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
            C1314805Co c1314805Co = new C1314805Co(null);
            this.LL = 1;
            obj = C099A.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, c1314805Co, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LandMallProtocol@c84d.launchRequest$1$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LandMallProtocol@c84d.launchRequest$1$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1314705Cn(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
