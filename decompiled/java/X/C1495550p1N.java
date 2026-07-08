package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0p1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495550p1N extends AbstractRunnableC846600XJa {
    public final InterfaceC1495610p1T LLILLJJLI;
    public final /* synthetic */ C1495500p1I LLILLL;

    @Override // X.AbstractRunnableC846600XJa
    public final void LIZ() {
        boolean z;
        LJIIIIZZ();
        try {
            try {
                z = true;
                try {
                    this.LLILLJJLI.onResponse(this.LLILLL, this.LLILLL.LIZIZ());
                } catch (IOException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    IOException iOExceptionLIZLLL = this.LLILLL.LIZLLL(e);
                    if (z) {
                        C842670X3x c842670X3x = C842670X3x.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Callback failure for ");
                        sbLIZ.append(this.LLILLL.LJ());
                        c842670X3x.LJIIJJI(4, C2188811AlT.LIZIZ(sbLIZ), iOExceptionLIZLLL);
                    } else {
                        C1495500p1I c1495500p1I = this.LLILLL;
                        c1495500p1I.LLILZ.callFailed(c1495500p1I, iOExceptionLIZLLL);
                        this.LLILLJJLI.onFailure(this.LLILLL, iOExceptionLIZLLL);
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILLL.LIZ(-1);
                    if (!z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("canceled due to ");
                        sbLIZ2.append(th);
                        this.LLILLJJLI.onFailure(this.LLILLL, new IOException(C2188811AlT.LIZIZ(sbLIZ2)));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LLILLL.LL.LL.LIZLLL(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        this.LLILLL.LL.LL.LIZLLL(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495550p1N(C1495500p1I c1495500p1I, InterfaceC1495610p1T interfaceC1495610p1T) {
        super("OkHttp %s", c1495500p1I.LLILZIL.url().LJIJJ());
        this.LLILLL = c1495500p1I;
        this.LLILLJJLI = interfaceC1495610p1T;
    }
}
