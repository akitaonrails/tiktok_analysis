package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.base.PipelineKt$andAll$1$1", f = "Pipeline.kt", l = {238}, m = "invokeSuspend")
public final class C1140200fmE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object>[] LLILZIL;
    public final /* synthetic */ Object LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140200fmE(InterfaceC1140460fme<Object, Object>[] interfaceC1140460fmeArr, Object obj, InterfaceC1364105Vn<? super C1140200fmE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC1140460fmeArr;
        this.LLILZLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1140200fmE c1140200fmE = new C1140200fmE(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1140200fmE.LLILZ = obj;
        return c1140200fmE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Throwable] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C259800zU c259800zU2;
        C259800zU c259800zU3;
        Throwable th;
        Object c098200Yq;
        AbstractC1140120fm6 abstractC1140120fm6;
        Object c1140300fmO;
        AbstractC1140120fm6 abstractC1140120fm62;
        Object next;
        T t;
        Object obj2 = obj;
        C1C7U.LIZ("PipelineKt@cc3.andAll$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = false;
        Object objLIZJ = null;
        if (i != 0) {
            if (i == 1) {
                c259800zU3 = this.LLILLJJLI;
                c259800zU2 = this.LL;
                c259800zU = (C259800zU) this.LLILZ;
                try {
                    C155000ia.LIZIZ(obj2);
                    t = obj2;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj2);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            c259800zU = new C259800zU();
            c259800zU2 = new C259800zU();
            InterfaceC1140460fme<Object, Object>[] interfaceC1140460fmeArr = this.LLILZIL;
            Object obj3 = this.LLILZLL;
            try {
                ArrayList arrayList = new ArrayList(interfaceC1140460fmeArr.length);
                for (InterfaceC1140460fme<Object, Object> interfaceC1140460fme : interfaceC1140460fmeArr) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1140220fmG(interfaceC1140460fme, obj3, null), 3));
                }
                this.LLILZ = c259800zU;
                this.LL = c259800zU2;
                this.LLILLJJLI = c259800zU;
                this.LLILLL = 1;
                Object objLIZ = C1D9F.LIZ(arrayList, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("PipelineKt@cc3.andAll$1$1");
                    return objLJFF;
                }
                c259800zU3 = c259800zU;
                t = objLIZ;
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c259800zU3.element = t;
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        ?? M5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (M5exceptionOrNullimpl != 0) {
            c259800zU2.element = M5exceptionOrNullimpl;
        }
        Collection collection = (Collection) c259800zU.element;
        if (collection == null || collection.isEmpty()) {
            z = true;
        }
        if (z) {
            Throwable th4 = (Throwable) c259800zU2.element;
            if (th4 == null) {
                th4 = new Throwable("andAll awaitAll all fail");
            }
            C1140190fmD c1140190fmD = new C1140190fmD(th4);
            C1C7U.LIZIZ("PipelineKt@cc3.andAll$1$1");
            return c1140190fmD;
        }
        List list = (List) c259800zU.element;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    next.getClass();
                    if (next instanceof C1140190fmD) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            abstractC1140120fm6 = (AbstractC1140120fm6) next;
        } else {
            abstractC1140120fm6 = null;
        }
        if (abstractC1140120fm6 != null) {
            Throwable thLIZ = abstractC1140120fm6.LIZ();
            if (thLIZ != null) {
                c1140300fmO = new C1140190fmD(thLIZ);
            } else {
                c1140300fmO = new C1140190fmD(abstractC1140120fm6.LIZIZ());
            }
        } else {
            List list2 = (List) c259800zU.element;
            if (list2 != null && (abstractC1140120fm62 = (AbstractC1140120fm6) C13LP.LJJLIIIJJI(list2)) != null) {
                objLIZJ = abstractC1140120fm62.LIZJ();
            }
            c1140300fmO = new C1140300fmO(objLIZJ);
        }
        C1C7U.LIZIZ("PipelineKt@cc3.andAll$1$1");
        return c1140300fmO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
