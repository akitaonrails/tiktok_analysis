package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxAvatarKt$TuxAvatar$2$1$onCanceled$1", f = "TuxAvatar.kt", l = {}, m = "invokeSuspend")
public final class C05AP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AP(C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05AP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxAvatarKt@75d0.TuxAvatar$2$1$onCanceled$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setValue(Boolean.FALSE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxAvatarKt@75d0.TuxAvatar$2$1$onCanceled$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
