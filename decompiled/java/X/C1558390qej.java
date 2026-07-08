package X;

import androidx.fragment.app.Fragment;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0qej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558390qej extends FutureTask<InterfaceC665370Q7z> {
    public final String LL;

    public C1558390qej(final Object obj, final String str) {
        super(new Callable<InterfaceC665370Q7z>(obj, str) { // from class: X.0qeY
            public final Object LL;
            public final String LLILLJJLI;

            @Override // java.util.concurrent.Callable
            public final InterfaceC665370Q7z call() {
                InterfaceC665370Q7z c1555400qZu;
                C1C7U.LIZ("ActivityPreLoadCallable@30c2.call");
                Object obj2 = this.LL;
                if (obj2 instanceof C19EG) {
                    c1555400qZu = new C1555410qZv((C19EG) this.LL, C1558290qeZ.LIZ(this.LLILLJJLI));
                    c1555400qZu.getTree();
                } else {
                    if (!(obj2 instanceof Fragment)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("do not support ");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(" yet");
                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Fragment fragment = (Fragment) this.LL;
                    String str2 = this.LLILLJJLI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fragment_");
                    sbLIZ2.append(str2);
                    c1555400qZu = new C1555400qZu(fragment, C2188811AlT.LIZIZ(sbLIZ2));
                    c1555400qZu.getTree();
                }
                C1C7U.LIZIZ("ActivityPreLoadCallable@30c2.call");
                return c1555400qZu;
            }

            {
                this.LL = obj;
                this.LLILLJJLI = str;
            }
        });
        this.LL = str;
    }
}
