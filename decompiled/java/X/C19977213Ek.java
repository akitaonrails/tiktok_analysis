package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19977213Ek extends C09AY implements Function1<Object, Unit> {
    public C19977213Ek() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        synchronized (C13YE.LIZJ) {
            try {
                List<? extends Function1<Object, Unit>> list = C13YE.LJIIIIZZ;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(obj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
