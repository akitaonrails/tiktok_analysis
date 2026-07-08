package X;

import com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBystander;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0X4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBystander$handleStreamTrafficChanged$1$1", f = "LocalServiceTraceBystander.kt", l = {}, m = "invokeSuspend")
public final class C842770X4h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C842770X4h(String str, InterfaceC1364105Vn<? super C842770X4h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C842770X4h(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalServiceTraceBystander@eb5b.handleStreamTrafficChanged$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LocalServiceTraceBystander localServiceTraceBystander = LocalServiceTraceBystander.LIZ;
        String strLJIILIIL = localServiceTraceBystander.LJIILIIL(this.LL);
        C842780X4i c842780X4iRemove = LocalServiceTraceBystander.LIZJ.remove(strLJIILIIL);
        if (c842780X4iRemove != null) {
            localServiceTraceBystander.LJIIL(c842780X4iRemove.LIZ, c842780X4iRemove.LIZIZ, null);
        } else {
            LocalServiceTraceBystander.LIZLLL.put(strLJIILIIL, Unit.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalServiceTraceBystander@eb5b.handleStreamTrafficChanged$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
