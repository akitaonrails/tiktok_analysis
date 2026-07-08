package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550450qRv extends C09AY implements Function2<Object, C1550500qS0<Object>, C1550500qS0<Object>> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550450qRv(Object obj) {
        super(2);
        this.LL = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [R, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final C1550500qS0<Object> invoke(Object obj, C1550500qS0<Object> c1550500qS0) {
        C1550500qS0<Object> c1550500qS02 = c1550500qS0;
        if (c1550500qS02 != null) {
            ?? r3 = this.LL;
            c1550500qS02.LIZIZ = r3;
            c1550500qS02.LIZ = true;
            Iterator<T> it2 = c1550500qS02.LIZJ.iterator();
            while (it2.hasNext()) {
                try {
                    ((Function1) it2.next()).invoke(r3);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            c1550500qS02.LIZJ.clear();
        }
        return c1550500qS02;
    }
}
