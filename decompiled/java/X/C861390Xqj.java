package X;

import Y.AgS300S0100000_19;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorStatusAssem$setUpLoadingViewCompensation$1", f = "SelectorStatusAssem.kt", l = {49}, m = "invokeSuspend")
public final class C861390Xqj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SelectorStatusAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861390Xqj(SelectorStatusAssem selectorStatusAssem, InterfaceC1364105Vn<? super C861390Xqj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectorStatusAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861390Xqj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectorStatusAssem@53f.setUpLoadingViewCompensation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<Boolean> c05ydLIZJ = this.LLILLJJLI.Go().LIZJ();
            if (c05ydLIZJ != null) {
                AgS300S0100000_19 agS300S0100000_19 = new AgS300S0100000_19(this.LLILLJJLI, 3);
                this.LL = 1;
                if (c05ydLIZJ.collect(agS300S0100000_19, this) == objLJFF) {
                    C1C7U.LIZIZ("SelectorStatusAssem@53f.setUpLoadingViewCompensation$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SelectorStatusAssem@53f.setUpLoadingViewCompensation$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
