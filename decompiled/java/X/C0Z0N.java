package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Z0N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0N extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C882890YkJ LL;
    public final /* synthetic */ C0Z0P LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) throws JSONException {
        C882890YkJ c882890YkJ = this.LL;
        if (!(th instanceof C892820Z0u)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tar flow error : ");
            sbLIZ.append(th.getMessage());
            th = new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ), th);
        }
        c882890YkJ.LJFF(th);
        this.LLILLJJLI.LIZLLL.LJFF.LIZ(this.LL.LIZJ);
        this.LLILLJJLI.LIZLLL(this.LL);
        InterfaceC892690Z0h interfaceC892690Z0h = this.LLILLJJLI.LJI;
        if (interfaceC892690Z0h != null) {
            interfaceC892690Z0h.LIZ(this.LL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0N(C2185208hG c2185208hG, C882890YkJ c882890YkJ, C0Z0P c0z0p) {
        super(c2185208hG);
        this.LL = c882890YkJ;
        this.LLILLJJLI = c0z0p;
    }
}
