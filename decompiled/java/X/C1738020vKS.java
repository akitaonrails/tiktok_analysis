package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.logic.AmeEffectPrepareLogic$doPrepareTask$2", f = "AmeEffectPrepareLogic.kt", l = {133}, m = "invokeSuspend")
public final class C1738020vKS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1737970vKN LLILLL;
    public final /* synthetic */ C1737870vKD LLILZ;
    public final /* synthetic */ InterfaceC1738210vKl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738020vKS(C1737970vKN c1737970vKN, C1737870vKD c1737870vKD, InterfaceC1738210vKl interfaceC1738210vKl, InterfaceC1364105Vn<? super C1738020vKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1737970vKN;
        this.LLILZ = c1737870vKD;
        this.LLILZIL = interfaceC1738210vKl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1738020vKS c1738020vKS = new C1738020vKS(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1738020vKS.LLILLJJLI = obj;
        return c1738020vKS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C201955140j.LJIILL(C830690WiJ.LIZIZ, "AmeEffectPublisher", "AmeEffectPrepareLogic doPrepareTask");
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1738030vKT(this.LLILLL, this.LLILZ, null), 3);
            c099gLIZIZ.LJII(new AwS392S0200000_26(this.LLILZIL, this.LLILLL, 202));
            ArrayList arrayList = new ArrayList();
            C1737970vKN c1737970vKN = this.LLILLL;
            C1737870vKD c1737870vKD = this.LLILZ;
            arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1738010vKR(c1737970vKN, c1737870vKD, null), 3));
            arrayList.add(c099gLIZIZ);
            arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1738050vKV(c1737970vKN, c1737870vKD, null), 3));
            arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1738060vKW(c1737970vKN, c1737870vKD, null), 3));
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2");
                return objLJFF;
            }
        }
        C201955140j.LJIILL(C830690WiJ.LIZIZ, "AmeEffectPublisher", "AmeEffectPrepareLogic doPrepareTask done: " + this.LLILLL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
