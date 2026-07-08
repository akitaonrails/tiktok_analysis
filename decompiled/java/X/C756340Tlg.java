package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Tlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756340Tlg {
    public static final <T extends AbstractC756290Tlb> AbstractC756290Tlb LIZ(Class<T> cls, Function1<? super Bundle, Unit> function1) {
        try {
            T tNewInstance = cls.newInstance();
            Bundle bundle = new Bundle();
            function1.invoke(bundle);
            tNewInstance.LIZ = bundle;
            return tNewInstance;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }
}
