package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.IconPrefetchManager$prefetchUrls$2$feeder$1", f = "IconPrefetchManager.kt", l = {68}, m = "invokeSuspend")
public final class C458001qM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ HashSet<String> LLILZ;
    public final /* synthetic */ C095E<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458001qM(List<String> list, HashSet<String> hashSet, C095E<String> c095e, InterfaceC1364105Vn<? super C458001qM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = hashSet;
        this.LLILZIL = c095e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458001qM(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<String> it2;
        C1C7U.LIZ("IconPrefetchManager@1448.prefetchUrls$2$feeder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    it2 = (Iterator) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                it2 = this.LLILLL.iterator();
            }
            while (it2.hasNext()) {
                String next = it2.next();
                if (this.LLILZ.add(next)) {
                    C095E<String> c095e = this.LLILZIL;
                    this.LL = it2;
                    this.LLILLJJLI = 1;
                    if (c095e.LJIJI(next, this) == objLJFF) {
                        C1C7U.LIZIZ("IconPrefetchManager@1448.prefetchUrls$2$feeder$1");
                        return objLJFF;
                    }
                }
            }
            this.LLILZIL.LJIIJJI(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IconPrefetchManager@1448.prefetchUrls$2$feeder$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL.LJIIJJI(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
