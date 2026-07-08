package X;

import Y.AgS201S0200000_11;
import com.ss.android.ugc.aweme.captionsheet.DMTranslationPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.captionsheet.DMTranslationPanelFragment$initDMTranslationToggle$2$2", f = "DMTranslationPanelFragment.kt", l = {113}, m = "invokeSuspend")
public final class C708220RqG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20693915yL LLILLJJLI;
    public final /* synthetic */ DMTranslationPanelFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708220RqG(C20693915yL c20693915yL, DMTranslationPanelFragment dMTranslationPanelFragment, InterfaceC1364105Vn<? super C708220RqG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20693915yL;
        this.LLILLL = dMTranslationPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708220RqG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMTranslationPanelFragment@7504.initDMTranslationToggle$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1629806Zs c1629806Zs = new C1629806Zs(new C05RH(C746760TRa.LIZ().LJLIIIL()));
            AgS201S0200000_11 agS201S0200000_11 = new AgS201S0200000_11(this.LLILLJJLI, this.LLILLL, 2);
            this.LL = 1;
            if (c1629806Zs.collect(agS201S0200000_11, this) == objLJFF) {
                C1C7U.LIZIZ("DMTranslationPanelFragment@7504.initDMTranslationToggle$2$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMTranslationPanelFragment@7504.initDMTranslationToggle$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
