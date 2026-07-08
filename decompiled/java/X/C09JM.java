package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.09JM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JM {
    public static final C11JF LIZ(C11O8 c11o8, final C09JN c09jn) {
        InterfaceC420801kM interfaceC420801kMLJJLJLI;
        if (c09jn instanceof C09JL) {
            interfaceC420801kMLJJLJLI = c11o8.LJJLJLI(c09jn);
        } else {
            interfaceC420801kMLJJLJLI = c11o8.LJJLJLI(new C09JN<T>(c09jn) { // from class: X.09JL
                public final C09JN<T> LL;

                {
                    this.LL = c09jn;
                }

                @Override // X.C09JN
                public final void accept(T t) {
                    C1C7U.LIZ("SafeConsumer@15c8.accept");
                    try {
                        this.LL.accept(t);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        HashMap map = new HashMap();
                        map.put("stack", C13SZ.LIZIZ(th));
                        C1AF0.LJI(new C09JO(), String.valueOf(C13LE.LIZ(this.LL.getClass()).LJI()), map);
                    }
                    C1C7U.LIZIZ("SafeConsumer@15c8.accept");
                }
            });
        }
        return (C11JF) interfaceC420801kMLJJLJLI;
    }
}
