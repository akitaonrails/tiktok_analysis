package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$clearCacheFiles$1", f = "UploadFrameServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2287208xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2287408xk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2287208xi(C2287408xk c2287408xk, InterfaceC1364105Vn<? super C2287208xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2287408xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2287208xi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadFrameServiceImpl@c926.clearCacheFiles$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2286708xd.LJIJJ((String) this.LL.LIZIZ.getValue(), new InterfaceC2287108xh() { // from class: X.08xj
            @Override // X.InterfaceC2287108xh
            public final Object apply(Object obj2) {
                return Boolean.TRUE;
            }
        });
        C2286708xd.LJIIZILJ((String) this.LL.LIZIZ.getValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadFrameServiceImpl@c926.clearCacheFiles$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
