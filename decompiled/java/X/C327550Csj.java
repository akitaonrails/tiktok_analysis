package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitTextManager$insertCaption$4", f = "CaptionSplitTextManager.kt", l = {}, m = "invokeSuspend")
public final class C327550Csj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C327570Csl LL;
    public final /* synthetic */ List<C327610Csp> LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<C327610Csp> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327550Csj(C327570Csl c327570Csl, List<C327610Csp> list, C118300cf c118300cf, int i, List<C327610Csp> list2, InterfaceC1364105Vn<? super C327550Csj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c327570Csl;
        this.LLILLJJLI = list;
        this.LLILLL = c118300cf;
        this.LLILZ = i;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327550Csj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionSplitTextManager@eba9.insertCaption$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC327690Csx abstractC327690Csx = this.LL.LJIIIZ;
        if (abstractC327690Csx != null) {
            List<C327610Csp> list = this.LLILLJJLI;
            this.LLILZIL.size();
            abstractC327690Csx.LIZLLL(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionSplitTextManager@eba9.insertCaption$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
