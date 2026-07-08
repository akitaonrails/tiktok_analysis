package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0pBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501920pBe {
    public final C1501550pB3 LIZ;
    public InterfaceC1496610p35 LIZIZ;
    public C0XLQ LIZJ;
    public final List<AbstractC1501440pAs> LIZLLL;
    public final List<AbstractC1501480pAw> LJ;
    public Executor LJFF;

    public C1501920pBe() {
        C1501550pB3 c1501550pB3 = C1501550pB3.LIZ;
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LIZ = c1501550pB3;
    }

    public final void LIZ(AbstractC1501440pAs abstractC1501440pAs) {
        ((ArrayList) this.LIZLLL).add(abstractC1501440pAs);
    }

    public final void LIZIZ(String str) {
        C1502190pC5.LIZ(str, "baseUrl == null");
        C0XLQ c0xlqLJIIIZ = C0XLQ.LJIIIZ(str);
        if ("".equals(ListProtector.get(c0xlqLJIIIZ.LJFF, r1.size() - 1))) {
            this.LIZJ = c0xlqLJIIIZ;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("baseUrl must end in /: ");
        sbLIZ.append(c0xlqLJIIIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(C1495520p1K c1495520p1K) {
        C1502190pC5.LIZ(c1495520p1K, "client == null");
        this.LIZIZ = c1495520p1K;
    }
}
