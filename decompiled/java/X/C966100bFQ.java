package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966100bFQ<T> implements InterfaceC420801kM {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LL;
    public final String LLILLJJLI;
    public InterfaceC966890bGh<T> LLILLL;
    public Function2<? super String, ? super C965950bFB, ? extends T> LLILZLL;
    public Function1<? super C967640bHu, ? extends Throwable> LLILZ = null;
    public Function0<Unit> LLILZIL = null;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (!this.LLIZ.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on [");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("]callback canceled failed because of it already disposed...");
            C1304630k3R.LJII(6, C2188811AlT.LIZIZ(sbLIZ), this.LL);
            return;
        }
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZLL = null;
        this.LLILZIL = null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("on ");
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(" callback disposed...");
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ2), this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZ.get();
    }

    public C966100bFQ(String str, String str2, InterfaceC966890bGh interfaceC966890bGh, Function2 function2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = interfaceC966890bGh;
        this.LLILZLL = function2;
    }
}
