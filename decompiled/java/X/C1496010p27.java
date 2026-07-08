package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import xlp.c;

/* JADX INFO: renamed from: X.0p27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1496010p27 extends AbstractRunnableC846600XJa implements InterfaceC1496210p2R {
    public final C1495930p1z LLILLJJLI;
    public final /* synthetic */ C1495910p1x LLILLL;

    @Override // X.AbstractRunnableC846600XJa
    public final void LIZ() throws Throwable {
        EnumC1496090p2F enumC1496090p2F = EnumC1496090p2F.INTERNAL_ERROR;
        try {
            try {
                this.LLILLJJLI.LIZLLL(this);
                while (this.LLILLJJLI.LIZIZ(false, this)) {
                }
                try {
                    try {
                        this.LLILLL.LIZ(EnumC1496090p2F.NO_ERROR, EnumC1496090p2F.CANCEL);
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    EnumC1496090p2F enumC1496090p2F2 = EnumC1496090p2F.PROTOCOL_ERROR;
                    try {
                        this.LLILLL.LIZ(enumC1496090p2F2, enumC1496090p2F2);
                    } catch (IOException e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                try {
                    this.LLILLL.LIZ(enumC1496090p2F, enumC1496090p2F);
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                c.LJ(this.LLILLJJLI);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LIZ(enumC1496090p2F, enumC1496090p2F);
            c.LJ(this.LLILLJJLI);
            throw th;
        }
        c.LJ(this.LLILLJJLI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496010p27(C1495910p1x c1495910p1x, C1495930p1z c1495930p1z) {
        super("OkHttp %s", c1495910p1x.LLILZ);
        this.LLILLL = c1495910p1x;
        this.LLILLJJLI = c1495930p1z;
    }
}
