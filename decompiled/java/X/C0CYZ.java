package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel$obtainVideoResource$1$config$1", f = "InteractionCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CYZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<DataSource, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CYZ(Function1<? super DataSource, Unit> function1, InterfaceC1364105Vn<? super C0CYZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CYZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractionCardViewModel@87d.obtainVideoResource$1$config$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1$config$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
