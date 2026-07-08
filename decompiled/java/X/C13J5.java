package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13J5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13J5 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ksG] */
    public static final <T> T LIZ(AbstractC19987213Ig abstractC19987213Ig, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, final InputStream inputStream) {
        ?? r1 = new InterfaceC1336170ksJ(inputStream) { // from class: X.0ksG
            public final C1336130ksF LIZ;

            public final void LIZIZ() {
                C1336130ksF c1336130ksF = this.LIZ;
                c1336130ksF.getClass();
                C1336150ksH c1336150ksH = C1336150ksH.LIZJ;
                byte[] bArrArray = c1336130ksF.LIZJ.array();
                synchronized (c1336150ksH) {
                    try {
                        int i = c1336150ksH.LIZIZ;
                        if (bArrArray.length + i < C1225204qo.LIZ) {
                            c1336150ksH.LIZIZ = i + (bArrArray.length / 2);
                            c1336150ksH.LIZ.addLast(bArrArray);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            {
                this.LIZ = new C1336130ksF(inputStream, Charsets.UTF_8);
            }

            @Override // X.InterfaceC1336170ksJ
            public final int LIZ(char[] cArr, int i, int i2) {
                return this.LIZ.LIZ(cArr, i, i2);
            }
        };
        try {
            T t = (T) C19988413Is.LIZ(abstractC19987213Ig, interfaceC19984213Hc, r1);
            r1.LIZIZ();
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            r1.LIZIZ();
            throw th;
        }
    }
}
