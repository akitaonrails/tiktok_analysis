package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ijd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474790Ijd implements InterfaceC474670IjR {
    public static final C474790Ijd LIZ = new C474790Ijd();
    public static final Collection<InterfaceC474800Ije> LIZIZ = Collections.synchronizedCollection(new ArrayList());
    public static boolean LIZJ;

    public final synchronized void LIZIZ() {
        C484100Iye c484100Iye = C484100Iye.LIZ;
        synchronized (this) {
            try {
                Iterator<InterfaceC474800Ije> it2 = LIZIZ.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), c484100Iye)) {
                        it2.remove();
                    }
                }
                if (LIZIZ.isEmpty()) {
                    InterfaceC474510IjB.LIZ.getClass();
                    C474520IjC.LIZIZ.remove(this);
                    LIZJ = false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC474670IjR
    public final void LIZ(String str, Map<String, String> map) {
        try {
            Iterator<T> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC474800Ije) it2.next()).onEvent(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
