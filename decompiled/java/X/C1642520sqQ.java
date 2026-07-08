package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import jgp.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "dmt.av.video.task.MobileEffectPreloaderTask$runTask$1", f = "MobileEffectPreloaderTask.kt", l = {}, m = "invokeSuspend")
public final class C1642520sqQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ g LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642520sqQ(g gVar, InterfaceC1364105Vn<? super C1642520sqQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1642520sqQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1637200shq interfaceC1637200shqPreloadService;
        InterfaceC1637170shn interfaceC1637170shnLIZ;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1656550tD3.LIZ()) {
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (this.LL.LLIZLLLIL.get() != null) {
                if (iEffectCreatorService != null) {
                    InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
                    if (interfaceC1637200shqPreloadService2 != null) {
                        interfaceC1637200shqPreloadService2.LIZJ();
                    }
                    interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
                    if (interfaceC1637200shqPreloadService != null && (interfaceC1637170shnLIZ = interfaceC1637200shqPreloadService.LIZ()) != null) {
                        interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.TT_MAIN_SHOT);
                    }
                }
            } else if (iEffectCreatorService != null) {
                interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
                if (interfaceC1637200shqPreloadService != null) {
                    interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.TT_MAIN_SHOT);
                }
            }
        }
        this.LL.LJIIJ();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
