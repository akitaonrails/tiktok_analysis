package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.MultiAnchorPublishExtension$handleLiveEventAddClick$1$1", f = "MultiAnchorPublishExtension.kt", l = {}, m = "invokeSuspend")
public final class C1430590nKb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19510811Va LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430590nKb(C19510811Va c19510811Va, InterfaceC1364105Vn<? super C1430590nKb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19510811Va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430590nKb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiAnchorPublishExtension@182f.handleLiveEventAddClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19510811Va c19510811Va = this.LL;
        int i = C19510811Va.LLL;
        c19510811Va.LJJIJ(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.handleLiveEventAddClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
