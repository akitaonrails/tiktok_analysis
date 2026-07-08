package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0W1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816660W1w implements C0W2G {
    public final C0W2Q LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final Object LIZIZ() {
        ?? SingletonList;
        try {
            List<C816630W1t> listLIZJ = this.LIZ.LIZLLL.LIZIZ().LIZJ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            for (C816630W1t c816630W1t : listLIZJ) {
                List<C816680W1y> list = c816630W1t.LIZIZ;
                if (list != null) {
                    SingletonList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C816680W1y c816680W1y : list) {
                        C816640W1u c816640W1u = c816630W1t.LIZ;
                        SingletonList.add(new C816670W1x(c816640W1u.LIZ, c816640W1u, c816680W1y, c816630W1t.LIZJ));
                    }
                } else {
                    C816640W1u c816640W1u2 = c816630W1t.LIZ;
                    SingletonList = Collections.singletonList(new C816670W1x(c816640W1u2.LIZ, c816640W1u2, null, c816630W1t.LIZJ));
                }
                arrayList.add(SingletonList);
            }
            return C15438062q.LJIJJLI(arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    public C816660W1w(C0W2Q c0w2q) {
        this.LIZ = c0w2q;
    }

    @Override // X.InterfaceC816920W2w
    public final /* bridge */ /* synthetic */ Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
        return LIZIZ();
    }
}
