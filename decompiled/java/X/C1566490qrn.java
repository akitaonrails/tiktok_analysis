package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.instantfeed.SingleAwemeFrequencyRule$validationRule$1", f = "ValidationChain.kt", l = {}, m = "invokeSuspend")
public final class C1566490qrn extends C09AX implements Function2<AbstractC1566610qrz, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1566500qro LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566490qrn(C1566500qro c1566500qro, InterfaceC1364105Vn<? super C1566490qrn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1566500qro;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1566490qrn c1566490qrn = new C1566490qrn(this.LLILLJJLI, interfaceC1364105Vn);
        c1566490qrn.LL = obj;
        return c1566490qrn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SingleAwemeFrequencyRule@38d6.validationRule$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1566610qrz abstractC1566610qrz = (AbstractC1566610qrz) this.LL;
        C1566500qro c1566500qro = this.LLILLJJLI;
        if (((Number) c1566500qro.LIZ.getValue()).intValue() > 0 && (abstractC1566610qrz instanceof C1566620qs0)) {
            C1566620qs0 c1566620qs0 = (C1566620qs0) abstractC1566610qrz;
            Iterator<String> it2 = c1566620qs0.LJ.iterator();
            while (it2.hasNext()) {
                if (c1566500qro.LIZIZ.contains(it2.next())) {
                    z = false;
                    break;
                }
            }
            c1566500qro.LIZIZ.addAll(c1566620qs0.LJ);
            z = true;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SingleAwemeFrequencyRule@38d6.validationRule$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1566610qrz abstractC1566610qrz, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(abstractC1566610qrz, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
