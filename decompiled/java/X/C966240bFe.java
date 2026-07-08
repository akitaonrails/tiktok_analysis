package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966240bFe implements InterfaceC968200bIo {
    public final /* synthetic */ C966100bFQ<Object> LL;
    public final /* synthetic */ Function2<Object, Function1<Object, Unit>, Unit> LLILLJJLI;

    @Override // X.InterfaceC968200bIo
    public final void LIZ(C966440bFy c966440bFy) {
        Object objInvoke;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(", onSuccess, value = ");
        sbLIZ.append(c966440bFy);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LL.LL);
        if (this.LL.isDisposed()) {
            return;
        }
        String str = c966440bFy.LIZ;
        Function2<Object, Function1<Object, Unit>, Unit> function2 = this.LLILLJJLI;
        Object objInvoke2 = null;
        if (function2 != null) {
            C966100bFQ<Object> c966100bFQ = this.LL;
            Function2<? super String, ? super C965950bFB, ? extends Object> function22 = c966100bFQ.LLILZLL;
            if (function22 != null && (objInvoke = function22.invoke(str, c966440bFy.LIZIZ)) != null) {
                function2.invoke(objInvoke, new C966260bFg(this, c966100bFQ));
                return;
            } else {
                C500260Jjc.LJJLIIIJILLIZJL(new C966230bFd(null, c966100bFQ.LLILLL, this.LL));
                return;
            }
        }
        Function2<? super String, ? super C965950bFB, ? extends Object> function23 = this.LL.LLILZLL;
        if (function23 != null) {
            objInvoke2 = function23.invoke(str, c966440bFy.LIZIZ);
        }
        C966100bFQ<Object> c966100bFQ2 = this.LL;
        C500260Jjc.LJJLIIIJILLIZJL(new C966230bFd(objInvoke2, c966100bFQ2.LLILLL, c966100bFQ2));
    }

    @Override // X.InterfaceC968200bIo
    public final void LIZJ(C967640bHu c967640bHu) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(", fail, error=");
        sbLIZ.append(c967640bHu.LIZIZ.LIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(c967640bHu.LIZIZ.LIZIZ);
        C1304630k3R.LIZLLL(7, C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LL.isDisposed()) {
            C966980bGq c966980bGq = c967640bHu.LIZIZ;
            if (c966980bGq != null && (str = c966980bGq.LIZJ) != null && str.length() != 0) {
                C500260Jjc.LJJLIIIJILLIZJL(new C967760bI6(c966980bGq));
                return;
            }
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C966090bFP(this.LL, c967640bHu));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C966240bFe(C966100bFQ<Object> c966100bFQ, Function2<Object, ? super Function1<Object, Unit>, Unit> function2) {
        this.LL = c966100bFQ;
        this.LLILLJJLI = function2;
    }
}
