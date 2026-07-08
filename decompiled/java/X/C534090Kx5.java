package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.layout.UploadLayoutChooseResultImpl$goVideoEditPage$2$1", f = "UploadLayoutChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C534090Kx5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L2T LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534090Kx5(C0L2T c0l2t, InterfaceC1364105Vn<? super C534090Kx5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l2t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534090Kx5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadLayoutChooseResultImpl@9bfc.goVideoEditPage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L2U c0l2uLJII = this.LL.LJII();
        c0l2uLJII.getClass();
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(c0l2uLJII, 9));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadLayoutChooseResultImpl@9bfc.goVideoEditPage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
