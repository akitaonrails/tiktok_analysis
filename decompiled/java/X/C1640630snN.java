package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0snN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.compact.InfoStickerCompactHeaderListView$initObserver$1$3$4$1", f = "InfoStickerCompactHeaderListView.kt", l = {}, m = "invokeSuspend")
public final class C1640630snN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1640440sn4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640630snN(C1640440sn4 c1640440sn4, InterfaceC1364105Vn<? super C1640630snN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1640440sn4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640630snN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerCompactHeaderListView@d611.initObserver$1$3$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ViewOnClickListenerC1641310soT viewOnClickListenerC1641310soT = ((AbstractC1640730snX) this.LL.LJJLI.getValue()).LIZ;
        if (viewOnClickListenerC1641310soT != null) {
            viewOnClickListenerC1641310soT.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerCompactHeaderListView@d611.initObserver$1$3$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
