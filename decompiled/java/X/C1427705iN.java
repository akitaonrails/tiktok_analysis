package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.logic.AdjustEffectFetch$fetchWithCheckFile$2", f = "AdjustEffectFetch.kt", l = {35}, m = "invokeSuspend")
public final class C1427705iN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<List<Effect>> LLILLL;
    public final /* synthetic */ C1427905iP LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1427705iN(C259800zU<List<Effect>> c259800zU, C1427905iP c1427905iP, InterfaceC1364105Vn<? super C1427705iN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c1427905iP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1427705iN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<List<Effect>> c259800zU;
        C1C7U.LIZ("AdjustEffectFetch@c70b.fetchWithCheckFile$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<Effect> list = this.LLILLL.element;
            C1427905iP c1427905iP = this.LLILZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!c1427905iP.LIZ.LJIJJLI((Effect) it2.next())) {
                        C201955140j.LJIILJJIL(C563650M8t.LIZIZ, "AdjustEffectFetch: effect has not down load effect");
                        c259800zU = this.LLILLL;
                        C1427905iP c1427905iP2 = this.LLILZ;
                        this.LL = c259800zU;
                        this.LLILLJJLI = 1;
                        c1427905iP2.getClass();
                        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                        c2252611DEt.LJIJJ();
                        InterfaceC1635410sex interfaceC1635410sex = c1427905iP2.LIZ;
                        if (interfaceC1635410sex == null) {
                            C13BV c13bv = C13BV.INSTANCE;
                            C189200o6.m2constructorimpl(c13bv);
                            c2252611DEt.resumeWith(c13bv);
                        } else {
                            interfaceC1635410sex.vg("editorpro_adjust", true, new C1768106wB(c2252611DEt, 3));
                        }
                        obj = c2252611DEt.LJIJ();
                        if (obj == C099R.LJFF()) {
                            C099Q.LIZJ(this);
                        }
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("AdjustEffectFetch@c70b.fetchWithCheckFile$2");
                            return objLJFF;
                        }
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdjustEffectFetch@c70b.fetchWithCheckFile$2");
            return unit;
        }
        c259800zU.element = obj;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdjustEffectFetch@c70b.fetchWithCheckFile$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
