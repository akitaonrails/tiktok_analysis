package X;

import Y.AgS289S0100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.eventrack.AlbumEventTrackingComponent$registerObservers$1", f = "AlbumEventTrackingComponent.kt", l = {76, 77}, m = "invokeSuspend")
public final class C526220KkO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526050Kk7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526220KkO(C526050Kk7 c526050Kk7, InterfaceC1364105Vn<? super C526220KkO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526050Kk7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526220KkO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<InterfaceC526090KkB> interfaceC346201WaE72;
        C1C7U.LIZ("AlbumEventTrackingComponent@9c7b.registerObservers$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AlbumEventTrackingComponent@9c7b.registerObservers$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC525910Kjt interfaceC525910KjtZ1 = this.LLILLJJLI.Z1();
            this.LL = 1;
            if (interfaceC525910KjtZ1.g40(this) == objLJFF) {
                C1C7U.LIZIZ("AlbumEventTrackingComponent@9c7b.registerObservers$1");
                return objLJFF;
            }
        }
        InterfaceC525900Kjs interfaceC525900KjsZU0 = this.LLILLJJLI.Z1().ZU0();
        if (interfaceC525900KjsZU0 != null && (interfaceC346201WaE72 = interfaceC525900KjsZU0.E72()) != null) {
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 14);
            this.LL = 2;
            if (interfaceC346201WaE72.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumEventTrackingComponent@9c7b.registerObservers$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AlbumEventTrackingComponent@9c7b.registerObservers$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
