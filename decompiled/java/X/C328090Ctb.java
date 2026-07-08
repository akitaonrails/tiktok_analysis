package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.incentive.crossplatform.headless.IncentiveHeadlessJSManager$triggerTiming$1$1", f = "IncentiveHeadlessJSManager.kt", l = {224}, m = "invokeSuspend")
public final class C328090Ctb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1893940zNw LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1893940zNw LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328090Ctb(C1893940zNw c1893940zNw, boolean z, String str, InterfaceC1364105Vn<? super C328090Ctb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c1893940zNw;
        this.LLIZLLLIL = z;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328090Ctb c328090Ctb = new C328090Ctb(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c328090Ctb.LLILZLL = obj;
        return c328090Ctb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1893940zNw c1893940zNw;
        C1DEV c1dev;
        boolean z;
        Object obj2;
        C1C7U.LIZ("IncentiveHeadlessJSManager@c20a.triggerTiming$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                z = this.LLILZ;
                obj2 = this.LLILLL;
                c1893940zNw = this.LLILLJJLI;
                c1dev = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            c1893940zNw = this.LLIZ;
            c1dev = c1893940zNw.LIZLLL;
            z = this.LLIZLLLIL;
            obj2 = this.LLJ;
            this.LLILZLL = interfaceC497601wk;
            this.LL = c1dev;
            this.LLILLJJLI = c1893940zNw;
            this.LLILLL = obj2;
            this.LLILZ = z;
            this.LLILZIL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("IncentiveHeadlessJSManager@c20a.triggerTiming$1$1");
                return objLJFF;
            }
        }
        try {
            c1893940zNw.LIZ();
            if (z && !c1893940zNw.LJFF.containsKey(obj2)) {
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("IncentiveHeadlessJSManager@c20a.triggerTiming$1$1");
                return unit;
            }
            ArrayList arrayList = new ArrayList();
            C13E8 c13e8 = (C13E8) ((LinkedHashMap) c1893940zNw.LJ).get(obj2);
            if (c13e8 != null || (c13e8 = (C13E8) ((LinkedHashMap) c1893940zNw.LJFF).get(obj2)) != null) {
                arrayList.addAll(c13e8);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1893980zO0(c1893940zNw, (C1893990zO1) it2.next(), null), 3);
                }
            }
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IncentiveHeadlessJSManager@c20a.triggerTiming$1$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
