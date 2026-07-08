package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805480Vik {
    public static final Object LIZ = new Object();
    public static InterfaceC1726606pU LIZIZ;

    public static InterfaceC1726606pU LIZ() {
        C0VQO c0vqo = IMContactDatabase.LL;
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        Context contextLIZ = C894660Z7w.LIZ();
        c0vqo.getClass();
        C2201851BFn c2201851BFn = new C2201851BFn(C0VQO.LIZJ(contextLIZ, true).LIZ());
        c0i0b.LIZJ();
        if (C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test")) {
                return c2201851BFn;
            }
        }
        return new C2258031DZp(c2201851BFn, new C0WYD("IM_USER_BASE_INFO", new C805490Vil(), new C805470Vij()));
    }

    public static final InterfaceC1726606pU LIZIZ() {
        InterfaceC1726606pU interfaceC1726606pULIZ = LIZIZ;
        if (interfaceC1726606pULIZ == null) {
            synchronized (LIZ) {
                try {
                    interfaceC1726606pULIZ = LIZIZ;
                    if (interfaceC1726606pULIZ == null) {
                        interfaceC1726606pULIZ = LIZ();
                        LIZIZ = interfaceC1726606pULIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return interfaceC1726606pULIZ;
    }
}
