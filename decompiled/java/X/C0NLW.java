package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.time.TabIconTimeChecker$sendTabIconEndEvent$2", f = "TabIconTimeChecker.kt", l = {}, m = "invokeSuspend")
public final class C0NLW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C592330NLb LL;
    public final /* synthetic */ C0NLU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLW(C592330NLb c592330NLb, C0NLU c0nlu, InterfaceC1364105Vn<? super C0NLW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c592330NLb;
        this.LLILLJJLI = c0nlu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NLW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconTimeChecker@3388.sendTabIconEndEvent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C592320NLa.LIZ[this.LL.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CopyOnWriteArrayList<InterfaceC592390NLh> copyOnWriteArrayList = this.LLILLJJLI.LIZIZ;
                C592330NLb c592330NLb = this.LL;
                Iterator<InterfaceC592390NLh> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().Qm(c592330NLb.LIZIZ);
                }
            }
        } else {
            CopyOnWriteArrayList<InterfaceC592390NLh> copyOnWriteArrayList2 = this.LLILLJJLI.LIZ;
            C592330NLb c592330NLb2 = this.LL;
            Iterator<InterfaceC592390NLh> it3 = copyOnWriteArrayList2.iterator();
            while (it3.hasNext()) {
                it3.next().Qm(c592330NLb2.LIZIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabIconTimeChecker@3388.sendTabIconEndEvent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
