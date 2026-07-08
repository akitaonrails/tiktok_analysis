package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$trackLayeredFallbackLegacy$1", f = "SkylightStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C594590NTt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594590NTt(boolean z, InterfaceC1364105Vn<? super C594590NTt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594590NTt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.trackLayeredFallbackLegacy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair[] pairArr = new Pair[2];
        boolean z = false;
        pairArr[0] = new Pair("has_legacy", String.valueOf(this.LL));
        if (C596340NaC.LIZIZ().pagedReadPageCount > 0) {
            z = true;
        }
        pairArr[1] = new Pair("paged_read", String.valueOf(z));
        C20684815ws.LJIILLIIL("inbox_skylight_layered_fallback_legacy", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.trackLayeredFallbackLegacy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
