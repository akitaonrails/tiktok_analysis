package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.util.playermanagerstore.MultiPlayerManagerStore$releasePlayer$1", f = "MultiPlayerManagerStore.kt", l = {}, m = "invokeSuspend")
public final class C01YT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0N0Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YT(C0N0Y c0n0y, InterfaceC1364105Vn<? super C01YT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0n0y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiPlayerManagerStore@2a2e.releasePlayer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.release();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiPlayerManagerStore@2a2e.releasePlayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
