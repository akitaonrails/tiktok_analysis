package X;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS87S1200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05bU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.base.ActionHandler$addAction$1", f = "ActionHandler.kt", l = {123, 43}, m = "invokeSuspend")
public final class C1385005bU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C2254708sT LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1385005bU(Function2<Object, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, C2254708sT c2254708sT, String str, InterfaceC1364105Vn<? super C1385005bU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c2254708sT;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1385005bU(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionHandler@814b.addAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ActionHandler@814b.addAction$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2254708sT c2254708sT = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = str;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c2252611DEt.LJJII(new AwS87S1200000_2(c2252611DEt, c2254708sT, str, 6));
            CopyOnWriteArraySet<InterfaceC20236714Gf<Object>> copyOnWriteArraySet = c2254708sT.LIZIZ().get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            if (c2254708sT.LIZIZ().get(str) == null) {
                c2254708sT.LIZIZ().put(str, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(c2252611DEt);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ActionHandler@814b.addAction$1");
                return objLJFF;
            }
        }
        Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
        this.LL = null;
        this.LLILLJJLI = 2;
        if (function2.invoke(obj, this) == objLJFF) {
            C1C7U.LIZIZ("ActionHandler@814b.addAction$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActionHandler@814b.addAction$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
