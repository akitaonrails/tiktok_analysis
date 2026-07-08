package X;

import Y.AgS210S0200000_27;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment$onViewCreated$1$1", f = "CommerceMusicSubstituteMusicVideoFragment.kt", l = {82}, m = "invokeSuspend")
public final class C1784340wXA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceMusicSubstituteMusicVideoFragment LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784340wXA(CommerceMusicSubstituteMusicVideoFragment commerceMusicSubstituteMusicVideoFragment, TextView textView, InterfaceC1364105Vn<? super C1784340wXA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceMusicSubstituteMusicVideoFragment;
        this.LLILLL = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784340wXA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicVideoFragment@d355.onViewCreated$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1864870yd3(C09IC.LIZIZ(((CommerceMusicSubstituteMusicVideoViewModel) this.LLILLJJLI.LLILZ.getValue()).LLILLL), 6));
            AgS210S0200000_27 agS210S0200000_27 = new AgS210S0200000_27(this.LLILLL, this.LLILLJJLI, 3);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS210S0200000_27, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoFragment@d355.onViewCreated$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoFragment@d355.onViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
