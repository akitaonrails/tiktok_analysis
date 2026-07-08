package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PYU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.mob.SingleSearchLynxLoadInfo$sendLoadFailure$1", f = "SingleSearchLynxLoadInfo.kt", l = {}, m = "invokeSuspend")
public final class C0PYU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DynamicPatch LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PYU(DynamicPatch dynamicPatch, String str, String str2, InterfaceC1364105Vn<? super C0PYU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dynamicPatch;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PYU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SingleSearchLynxLoadInfo@7505.sendLoadFailure$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C647990PbJ c647990PbJ = C647990PbJ.LIZ;
        DynamicPatch dynamicPatch = this.LL;
        c647990PbJ.getClass();
        int iLIZ = C647990PbJ.LIZ(dynamicPatch);
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "load_failed");
        c647890Pb9.LJIIZILJ("schema", this.LLILLJJLI);
        c647890Pb9.LJIIZILJ("error", this.LLILLL);
        if (iLIZ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c647890Pb9.LJIIZILJ("is_built_in", String.valueOf(i));
        c647890Pb9.LJJIFFI(1);
        c647890Pb9.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleSearchLynxLoadInfo@7505.sendLoadFailure$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
