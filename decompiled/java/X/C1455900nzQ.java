package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewComponent$runOnDestroy$1$1", f = "EditPreviewComponent.kt", l = {}, m = "invokeSuspend")
public final class C1455900nzQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1455870nzN<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455900nzQ(C1455870nzN<T> c1455870nzN, InterfaceC1364105Vn<? super C1455900nzQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1455870nzN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1455900nzQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPreviewComponent@3d91.runOnDestroy$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1452170ntP interfaceC1452170ntPO4 = this.LL.O4();
        if (interfaceC1452170ntPO4 != null) {
            interfaceC1452170ntPO4.destroy();
        }
        this.LL.o2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPreviewComponent@3d91.runOnDestroy$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
